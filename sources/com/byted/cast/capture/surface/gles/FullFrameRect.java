package com.byted.cast.capture.surface.gles;

import com.byted.cast.capture.surface.gles.Drawable2d;

/* loaded from: classes29.dex */
public class FullFrameRect {
    public Texture2dProgram mProgram;
    public final Drawable2d mRectDrawable = new Drawable2d(Drawable2d.Prefab.FULL_RECTANGLE);

    public int createTextureObject() {
        return this.mProgram.createTextureObject();
    }

    public Texture2dProgram getProgram() {
        return this.mProgram;
    }

    public FullFrameRect(Texture2dProgram texture2dProgram) {
        this.mProgram = texture2dProgram;
    }

    public void changeProgram(Texture2dProgram texture2dProgram) {
        this.mProgram.release();
        this.mProgram = texture2dProgram;
    }

    public void deleteTextures(int i) {
        this.mProgram.deleteTextures(i);
    }

    public void release(boolean z) {
        Texture2dProgram texture2dProgram = this.mProgram;
        if (texture2dProgram != null) {
            if (z) {
                texture2dProgram.release();
            }
            this.mProgram = null;
        }
    }

    public void drawFrame(int i, float[] fArr) {
        this.mProgram.draw(GlUtil.IDENTITY_MATRIX, this.mRectDrawable.getVertexArray(), 0, this.mRectDrawable.getVertexCount(), this.mRectDrawable.getCoordsPerVertex(), this.mRectDrawable.getVertexStride(), fArr, this.mRectDrawable.getTexCoordArray(), i, this.mRectDrawable.getTexCoordStride());
    }
}
