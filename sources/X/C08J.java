package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.08J, reason: invalid class name */
/* loaded from: classes.dex */
public class C08J {
    public final ByteBuffer LIZ;

    public final long LIZ() {
        return this.LIZ.getInt() & 4294967295L;
    }

    public C08J(ByteBuffer byteBuffer) {
        this.LIZ = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public final void LIZIZ(int i) {
        ByteBuffer byteBuffer = this.LIZ;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
