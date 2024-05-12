package com.byted.cast.render.render.video;

import android.view.Surface;
import com.byted.cast.mediacommon.render.parameters.MediaParameter;
import com.byted.cast.render.utils.Logger;

/* loaded from: classes29.dex */
public class NativeRender implements IVideoRender {
    public final String TAG = "NativeRender";
    public int colorFormat = 19;
    public String deviceName;
    public int height;
    public int sliceHeight;
    public int stride;
    public Surface surface;
    public final String userId;
    public int width;

    private native void native_config_video_parameters(String str, int i, int i2, int i3, int i4, int i5, Surface surface);

    private native void native_init(String str, String str2, int i);

    private native void native_isOpenDump(String str, boolean z);

    private native void native_render(String str, byte[] bArr, int i);

    private native void native_setDumpPath(String str, String str2);

    private native void native_start(String str);

    private native void native_stop(String str);

    @Override // com.byted.cast.render.render.IRender
    public Object getParameter(MediaParameter mediaParameter) {
        return null;
    }

    @Override // com.byted.cast.render.render.IRender
    public void setParameter(MediaParameter mediaParameter, Object obj) {
    }

    @Override // com.byted.cast.render.render.IRender
    public boolean start() {
        native_config_video_parameters(this.userId, this.width, this.height, this.stride, this.sliceHeight, this.colorFormat, this.surface);
        native_start(this.userId);
        Logger.i("NativeRender", "nativeRender start success");
        return true;
    }

    @Override // com.byted.cast.render.render.IRender
    public boolean stop() {
        native_stop(this.userId);
        Logger.i("NativeRender", "nativeRender stop success");
        return true;
    }

    @Override // com.byted.cast.render.render.video.IVideoRender
    public void isOpenDump(boolean z) {
        native_isOpenDump(this.userId, z);
    }

    @Override // com.byted.cast.render.render.video.IVideoRender
    public void setDumpPath(String str) {
        native_setDumpPath(this.userId, str);
    }

    @Override // com.byted.cast.render.render.video.IVideoRender
    public void setSurface(Surface surface) {
        this.surface = surface;
    }

    @Override // com.byted.cast.render.render.IRender
    public void render(byte[] bArr, int i) {
        native_render(this.userId, bArr, i);
    }

    public NativeRender(String str, String str2, int i) {
        this.userId = str;
        this.deviceName = str2;
        native_init(str, str2, i);
    }

    @Override // com.byted.cast.render.render.video.IVideoRender
    public void config_video_parameters(int i, int i2, int i3, int i4, int i5) {
        this.width = i;
        this.height = i2;
        this.stride = i3;
        this.sliceHeight = i4;
        this.colorFormat = i5;
    }
}
