package com.weiyu.common.manager;

import com.blankj.utilcode.util.PathUtils;

public class PathManager {
    private static PathManager instance;
    private PathManager(){

    }
    /**
     * 单例模式
     * */
    public static PathManager getInstance(){
        if (instance == null) {
            synchronized (PathManager.class) {
                if (instance == null) {
                    instance = new PathManager();
                }
            }
        }
        return instance;
    }

    //获取外部下载路径
    public static String getExternalDownloadPath(){
        return PathUtils.getExternalAppDownloadPath();
    }
}
