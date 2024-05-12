package com.byted.cast.common.network;

import android.content.Context;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.api.IBindSdkListener;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.IInitListener;

/* loaded from: classes29.dex */
public class NetworkBehaviorData {
    public String appId;
    public String appSecret;
    public IBindSdkListener bindListener;
    public Config config;
    public Context context;
    public String deviceId;
    public String lelinkAppId;
    public String lelinkAppSecret;
    public IInitListener listener;
    public ContextManager.CastContext mCastContext;

    public NetworkBehaviorData() {
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppSecret() {
        return this.appSecret;
    }

    public IBindSdkListener getBindListener() {
        return this.bindListener;
    }

    public ContextManager.CastContext getCastContext() {
        return this.mCastContext;
    }

    public Config getConfig() {
        return this.config;
    }

    public Context getContext() {
        return this.context;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getLelinkAppId() {
        return this.lelinkAppId;
    }

    public String getLelinkAppSecret() {
        return this.lelinkAppSecret;
    }

    public IInitListener getListener() {
        return this.listener;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppSecret(String str) {
        this.appSecret = str;
    }

    public void setCastContext(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setLelinkAppId(String str) {
        this.lelinkAppId = str;
    }

    public void setLelinkAppSecret(String str) {
        this.lelinkAppSecret = str;
    }

    public void setListener(IBindSdkListener iBindSdkListener) {
        this.bindListener = iBindSdkListener;
    }

    public void setListener(IInitListener iInitListener) {
        this.listener = iInitListener;
    }

    public NetworkBehaviorData(Context context, Config config, IInitListener iInitListener) {
        this.context = context;
        this.config = config;
        this.listener = iInitListener;
    }

    public NetworkBehaviorData(Context context, ContextManager.CastContext castContext, Config config, IInitListener iInitListener) {
        this.mCastContext = castContext;
        this.context = context;
        this.config = config;
        this.listener = iInitListener;
    }

    public NetworkBehaviorData(Context context, String str, String str2, String str3, String str4, String str5, IBindSdkListener iBindSdkListener) {
        this.context = context;
        this.deviceId = str;
        this.appId = str2;
        this.appSecret = str3;
        this.lelinkAppId = str4;
        this.lelinkAppSecret = str5;
        this.bindListener = iBindSdkListener;
    }
}
