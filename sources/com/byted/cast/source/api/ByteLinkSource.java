package com.byted.cast.source.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.api.ILibraryLoader;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.sdk.RTCStatistics;
import com.byted.cast.source.browser.api.ByteLinkServiceInfo;
import com.byted.cast.source.browser.api.IBrowseListener;

/* loaded from: classes29.dex */
public class ByteLinkSource {
    public com.byted.cast.source.a.a a;
    public ContextManager.CastContext b;

    public ByteLinkSource(ContextManager.CastContext castContext) {
        this.b = castContext;
        this.a = new com.byted.cast.source.a.a(castContext, "ByteLinkSource");
    }

    public void connect(ByteLinkServiceInfo byteLinkServiceInfo) {
        this.a.a(byteLinkServiceInfo);
    }

    public void destroy() {
        this.a.a();
    }

    public boolean disConnect(ByteLinkServiceInfo byteLinkServiceInfo) {
        return this.a.b(byteLinkServiceInfo);
    }

    public void dumpMediaData(int i, int i2) {
        this.a.a(i, i2);
    }

    public Object getOption(int i, Object... objArr) {
        return this.a.a(i, objArr);
    }

    public RTCStatistics getStatistics() {
        return this.a.b();
    }

    public void init(Context context, String str, ByteLinkPlayerInfo byteLinkPlayerInfo) {
        this.a.a(context, str, byteLinkPlayerInfo);
    }

    public void onScreenRecordRequestResult(int i, int i2, Intent intent) {
        this.a.a(i, i2, intent);
    }

    public void requestScreenRecord(Activity activity) {
        this.a.a(activity);
    }

    public void sendMetaData(String str) {
        this.a.a(str);
    }

    public void sendMetaData(String str, String str2) {
        this.a.a(str, str2);
    }

    public void setAudioMix(boolean z) {
        this.a.a(z);
    }

    public void setAudioMixScale(int i) {
        this.a.c(i);
    }

    public boolean setAudioSource(int i) {
        return this.a.d(i);
    }

    public void setBitRate(int i) {
        this.a.f(i);
    }

    public void setBrowseResultListener(IBrowseListener iBrowseListener) {
        this.a.a(iBrowseListener);
    }

    public void setCastToken(String str) {
        this.a.b(str);
    }

    public void setCodecId(int i) {
        this.a.h(i);
    }

    public void setConnectListener(IConnectListener iConnectListener) {
        this.a.a(iConnectListener);
    }

    public void setDispalyListener(IByteLinkDisplayListener iByteLinkDisplayListener) {
        this.a.a(iByteLinkDisplayListener);
    }

    public boolean setFPS(int i) {
        return this.a.i(i);
    }

    public void setLibraryLoader(ILibraryLoader iLibraryLoader) {
        com.byted.cast.source.a.a.a(this.b, iLibraryLoader);
    }

    public boolean setLogLevel(int i) {
        return com.byted.cast.source.a.a.a(this.b, i);
    }

    public void setLogger(ILogger iLogger) {
        com.byted.cast.source.a.a.a(this.b, iLogger);
    }

    public void setOption(int i, Object... objArr) {
        this.a.b(i, objArr);
    }

    public void setPlayerListener(IByteLinkPlayerListener iByteLinkPlayerListener) {
        this.a.a(iByteLinkPlayerListener);
    }

    public boolean setResolution(int i, int i2) {
        return this.a.b(i, i2);
    }

    public void startBrowse(String str) {
        this.a.c(str);
    }

    public void startMirror(ByteLinkServiceInfo byteLinkServiceInfo) {
        this.a.f(byteLinkServiceInfo);
    }

    public void startRecorder() {
        this.a.d();
    }

    public void stopBrowse() {
        this.a.e();
    }

    public void stopCast() {
        this.a.f();
    }

    public void stopRecorder() {
        this.a.g();
    }
}
