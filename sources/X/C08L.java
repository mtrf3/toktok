package X;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.08L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C08L {
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0DY, X.1Dg] */
    public static C29361Dg LIZ(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        C08J c08j = new C08J(duplicate);
        c08j.LIZIZ(4);
        int i = duplicate.getShort() & 65535;
        if (i <= 100) {
            c08j.LIZIZ(6);
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                int i3 = c08j.LIZ.getInt();
                c08j.LIZIZ(4);
                long LIZ = c08j.LIZ();
                c08j.LIZIZ(4);
                if (1835365473 == i3) {
                    if (LIZ != -1) {
                        c08j.LIZIZ((int) (LIZ - c08j.LIZ.position()));
                        c08j.LIZIZ(12);
                        long LIZ2 = c08j.LIZ();
                        for (int i4 = 0; i4 < LIZ2; i4++) {
                            int i5 = c08j.LIZ.getInt();
                            long LIZ3 = c08j.LIZ();
                            c08j.LIZ();
                            if (1164798569 == i5 || 1701669481 == i5) {
                                duplicate.position((int) (LIZ3 + LIZ));
                                ?? r2 = new C0DY() { // from class: X.1Dg
                                };
                                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                                r2.LIZIZ(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                                return r2;
                            }
                        }
                    }
                } else {
                    i2++;
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
