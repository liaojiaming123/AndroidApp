package com.weiyu.common.manager;

import android.app.Notification;
import android.content.Context;

import androidx.core.app.NotificationCompat;

import com.blankj.utilcode.util.NotificationUtils;
import com.blankj.utilcode.util.Utils;
import com.weiyu.common.R;

public class NotificationManager {
    private static NotificationManager instance;
    private final boolean isNotificationAccess = NotificationUtils.areNotificationsEnabled();

    private NotificationManager(){

    }
    /**
     * 单例模式
     * */
    public static NotificationManager getInstance(){
        if (instance == null) {
            synchronized (NotificationManager.class) {
                if (instance == null) {
                    instance = new NotificationManager();
                }
            }
        }
        return instance;
    }

    NotificationUtils.ChannelConfig channelConfig = new NotificationUtils.ChannelConfig("1","消息推送",NotificationUtils.IMPORTANCE_HIGH);

    Utils.Consumer<NotificationCompat.Builder> consumer = new Utils.Consumer<NotificationCompat.Builder>() {
        @Override
        public void accept(NotificationCompat.Builder builder) {
            builder.setSmallIcon(R.mipmap.ic_launcher_round);
            builder.setContentText("通知内容");
            builder.setContentTitle("标题");
            builder.setShowWhen(true);
        }
    };

    public void createNotificationSimple(){
        if (isNotificationAccess){
            NotificationUtils.notify(1,channelConfig,consumer);
        }

    }
}
