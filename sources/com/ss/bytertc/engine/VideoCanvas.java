package com.ss.bytertc.engine;

import X.X1D;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;

/* loaded from: classes33.dex */
public class VideoCanvas {
    public int backgroundColor;
    public int renderMode;
    public View renderView;

    public VideoCanvas() {
        this.renderMode = 1;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoCanvas{, textureView=");
        LIZ.append(this.renderView);
        LIZ.append(", renderMode=");
        LIZ.append(this.renderMode);
        LIZ.append(", background_color=");
        LIZ.append(this.backgroundColor);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public VideoCanvas(SurfaceView surfaceView, int i) {
        this.renderView = surfaceView;
        this.renderMode = i;
    }

    public VideoCanvas(TextureView textureView, int i) {
        this.renderView = textureView;
        this.renderMode = i;
    }

    public VideoCanvas(SurfaceView surfaceView, int i, int i2) {
        this.renderView = surfaceView;
        this.renderMode = i;
        this.backgroundColor = i2;
    }

    public VideoCanvas(TextureView textureView, int i, int i2) {
        this.renderView = textureView;
        this.renderMode = i;
        this.backgroundColor = i2;
    }
}
