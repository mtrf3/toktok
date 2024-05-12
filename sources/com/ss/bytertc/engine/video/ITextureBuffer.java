package com.ss.bytertc.engine.video;

/* loaded from: classes33.dex */
public interface ITextureBuffer {
    int getTextureId();

    int getTypeGlTarget();

    float[] nativeGetTransFormMatrix();

    void release();

    void retain();
}
