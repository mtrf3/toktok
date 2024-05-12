package com.byted.cast.sdk.gl.drawer;

import android.opengl.GLES20;
import com.byted.cast.sdk.gl.utils.GLUtils;
import com.byted.cast.sdk.log.Logger;
import com.byted.cast.sdk.log.LoggerManager;

/* loaded from: classes29.dex */
public class TextureProcessor extends TextureDrawer {
    public int mFbo;
    public Logger mLogger;
    public String mMirrorId;
    public int mOutTex;

    private void releaseOutTex() {
        int i = this.mOutTex;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.mOutTex = 0;
        }
    }

    private void setupFBO() {
        this.mFbo = GLUtils.createFBO();
    }

    @Override // com.byted.cast.sdk.gl.drawer.TextureDrawer
    public void release() {
        super.release();
        int i = this.mFbo;
        if (i != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.mFbo = 0;
        }
        releaseOutTex();
    }

    @Override // com.byted.cast.sdk.gl.drawer.TextureDrawer
    public boolean setup() {
        setupFBO();
        return super.setup();
    }

    public TextureProcessor(String str) {
        super(str);
        this.mMirrorId = str;
        this.mLogger = LoggerManager.getLogger(str);
    }

    public int process(int i) {
        return process(i, null);
    }

    private boolean setupTexture(int i, int i2) {
        this.mOutTex = GLUtils.createImageTexture(null, i, i2, 6408, this.mMirrorId);
        return true;
    }

    public int process(int i, float[] fArr) {
        int i2 = this.mOutTex;
        process(i, fArr, i2);
        return i2;
    }

    @Override // com.byted.cast.sdk.gl.drawer.TextureDrawer
    public boolean setViewportSize(int i, int i2) {
        super.setViewportSize(i, i2);
        releaseOutTex();
        return setupTexture(i, i2);
    }

    public int process(int i, float[] fArr, int i2) {
        GLES20.glBindFramebuffer(36160, this.mFbo);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        GLES20.glClear(16384);
        draw(i, fArr);
        GLES20.glBindFramebuffer(36160, 0);
        return i2;
    }
}
