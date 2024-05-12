package com.ss.ttlivestreamer.core.buffer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class SurfaceWithExtData extends Surface {
    public ByteBuffer[] extData;
    public int height;
    public int width;

    public ByteBuffer[] getExtData() {
        return this.extData;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public SurfaceWithExtData(SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
    }

    public void setExtData(ByteBuffer[] byteBufferArr) {
        this.extData = byteBufferArr;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
