package com.weiyu.common.manager;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.PermissionUtils;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PermissionManager {
    private Context context;
    private static PermissionManager instance;
    private PermissionManager(Context context){
        this.context = context;
    }

    /**
     * 单例模式
     * */
    public static PermissionManager getInstance(Context context){
        if (instance == null) {
            synchronized (PermissionManager.class) {
                if (instance == null) {
                    instance = new PermissionManager(context);
                }
            }
        }
        return instance;
    }

    //请求存储权限
    public void requestStorage(Activity activity){
        if (!PermissionUtils.isGranted(PermissionConstants.STORAGE)){
            PermissionUtils.permissionGroup(PermissionConstants.STORAGE).callback(new PermissionUtils.FullCallback() {
                @Override
                public void onGranted(@NonNull @NotNull List<String> granted) {
                    Toast.makeText(context,"已获得权限",Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onDenied(@NonNull @NotNull List<String> deniedForever, @NonNull @NotNull List<String> denied) {
                    if (!deniedForever.isEmpty()){
                        new AlertDialog.Builder(context)
                            .setCancelable(false)
                            .setTitle("提示")
                            .setMessage("您已禁止弹出权限申请框，请在设置页同意")
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    activity.startActivity(new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                                            .setData(Uri.fromParts("package", context.getPackageName(), null)));
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(context, "已取消", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                    }
                }
            }).request();
        }
    }

    //相机权限
    public void requestCamera(Activity activity){
        if (!PermissionUtils.isGranted(PermissionConstants.CAMERA)){
            PermissionUtils.permissionGroup(PermissionConstants.CAMERA).callback(new PermissionUtils.FullCallback() {
                @Override
                public void onGranted(@NonNull @NotNull List<String> granted) {
                    Toast.makeText(context,"已获得权限",Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onDenied(@NonNull @NotNull List<String> deniedForever, @NonNull @NotNull List<String> denied) {
                    if (!deniedForever.isEmpty()){
                        new AlertDialog.Builder(context)
                            .setCancelable(false)
                            .setTitle("提示")
                            .setMessage("您已禁止弹出权限申请框，请在设置页同意")
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    activity.startActivity(new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                                            .setData(Uri.fromParts("package", context.getPackageName(), null)));
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(context, "已取消", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                    }
                }
            }).request();
        }
    }

    //位置权限
    public void requestLocation(Activity activity){
        if (!PermissionUtils.isGranted(PermissionConstants.LOCATION)){
            PermissionUtils.permissionGroup(PermissionConstants.LOCATION).callback(new PermissionUtils.FullCallback() {
                @Override
                public void onGranted(@NonNull @NotNull List<String> granted) {
                    Toast.makeText(context,"已获得权限",Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onDenied(@NonNull @NotNull List<String> deniedForever, @NonNull @NotNull List<String> denied) {
                    if (!deniedForever.isEmpty()){
                        new AlertDialog.Builder(context)
                            .setCancelable(false)
                            .setTitle("提示")
                            .setMessage("您已禁止弹出权限申请框，请在设置页同意")
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    activity.startActivity(new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                                            .setData(Uri.fromParts("package", context.getPackageName(), null)));
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(context, "已取消", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                    }
                }
            }).request();
        }
    }

    //手机权限
    public void requestPhone(Activity activity){
        if (!PermissionUtils.isGranted(PermissionConstants.PHONE)){
            PermissionUtils.permissionGroup(PermissionConstants.PHONE).callback(new PermissionUtils.FullCallback() {
                @Override
                public void onGranted(@NonNull @NotNull List<String> granted) {
                    Toast.makeText(context,"已获得权限",Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onDenied(@NonNull @NotNull List<String> deniedForever, @NonNull @NotNull List<String> denied) {
                    if (!deniedForever.isEmpty()){
                        new AlertDialog.Builder(context)
                            .setCancelable(false)
                            .setTitle("提示")
                            .setMessage("您已禁止弹出权限申请框，请在设置页同意")
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    activity.startActivity(new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                                            .setData(Uri.fromParts("package", context.getPackageName(), null)));
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(context, "已取消", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                    }
                }
            }).request();
        }
    }
}
