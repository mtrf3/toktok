package com.byted.cast.render.datasource;

/* loaded from: classes29.dex */
public class UrlDataSource {
    public static String TAG = "UrlDataSource";
    public long dataSourceId;
    public IDataSourceListener listener;

    private native long native_setUrl(String str);

    private native boolean native_start(long j);

    private native void native_stop(long j);

    public boolean start() {
        return native_start(this.dataSourceId);
    }

    public void stop() {
        native_stop(this.dataSourceId);
    }

    public void setDataListener(IDataSourceListener iDataSourceListener) {
        this.listener = iDataSourceListener;
    }

    public void setUrl(String str) {
        this.dataSourceId = native_setUrl(str);
    }

    private void onAudioDataCallback(byte[] bArr, long j) {
        if (bArr.length > 0) {
            this.listener.onAudioPacketAvailable(bArr, j);
        }
    }

    private void onVideoDataCallback(byte[] bArr, long j) {
        if (bArr.length > 0) {
            this.listener.onVideoPacketAvailable(bArr, j);
        }
    }
}
