package X;

import java.nio.ByteBuffer;

/* renamed from: X.Fnn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40055Fnn {
    /* JADX WARN: Removed duplicated region for block: B:125:0x0224 A[EDGE_INSN: B:125:0x0224->B:121:0x0224 BREAK  A[LOOP:0: B:20:0x006f->B:26:0x01cc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] LIZ(X.InterfaceC40057Fnp r32) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40055Fnn.LIZ(X.Fnp):java.lang.String[]");
    }

    public static int LIZIZ(InterfaceC40057Fnp interfaceC40057Fnp, ByteBuffer byteBuffer, long j) {
        LIZLLL(interfaceC40057Fnp, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    public static long LIZJ(InterfaceC40057Fnp interfaceC40057Fnp, ByteBuffer byteBuffer, long j) {
        LIZLLL(interfaceC40057Fnp, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    public static void LIZLLL(InterfaceC40057Fnp interfaceC40057Fnp, ByteBuffer byteBuffer, int i, long j) {
        int LJJJJLL;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (LJJJJLL = interfaceC40057Fnp.LJJJJLL(byteBuffer, j)) != -1) {
            j += LJJJJLL;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C40056Fno("ELF file truncated");
    }
}
