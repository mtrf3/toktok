package X;

import android.opengl.EGLContext;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public interface VG9 extends Serializable {
    int onBytebufferCallbck(int i, ByteBuffer byteBuffer, int i2, int i3, long j);

    int onTextureCallback(int i, int i2, int i3, EGLContext eGLContext, int i4, int i5, long j);
}
