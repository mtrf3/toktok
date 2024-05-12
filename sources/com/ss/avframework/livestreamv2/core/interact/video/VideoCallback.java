package com.ss.avframework.livestreamv2.core.interact.video;

import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes12.dex */
public interface VideoCallback {
    void onVideoWarning(String str);

    boolean updateVideoFrame(ByteBuffer byteBuffer, int i, int i2, long j, Object... objArr);

    boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, boolean z, float[] fArr, int i2, int i3, long j, Object... objArr);
}
