package ms.bd.o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public abstract class o extends b.a {
    public static void LIZJ(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                k.a(16777217, 0, 0L, "a34bb6", new byte[]{125, 50, 120, 21, 84});
            }
        }
    }

    public static void LIZLLL(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                k.a(16777217, 0, 0L, "5030a2", new byte[]{41, 49, Byte.MAX_VALUE, 71, 81});
            }
        }
    }

    public abstract Object[] LJ(String str, String str2, String str3);

    public abstract Object[] LJFF(String str, String str2, String str3, byte[] bArr);

    public abstract Object[] LJI(String str, String str2, String str3);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032 A[RETURN] */
    @Override // ms.bd.o.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r18, int r19, long r20, java.lang.String r22, java.lang.Object r23) {
        /*
            r17 = this;
            r10 = r23
            r0 = 27
            byte[] r0 = new byte[r0]
            r0 = {x0078: FILL_ARRAY_DATA , data: [114, 105, 70, 81, 1, 41, 101, 10, 112, 98, 97, 106, 75, 80, 29, 41, 110, 74, 46, 78, 93, 83, 103, 113, 32, 5, 85} // fill-array
            r11 = 16777217(0x1000001, float:2.350989E-38)
            r12 = 0
            r13 = 0
            java.lang.String r15 = "be1717"
            r16 = r0
            java.lang.Object r4 = ms.bd.o.k.a(r11, r12, r13, r15, r16)
            java.lang.String r4 = (java.lang.String) r4
            r3 = 1
            ms.bd.o.a r0 = ms.bd.o.a.LIZIZ     // Catch: java.lang.Throwable -> L2f
            android.content.Context r2 = r0.LIZ     // Catch: java.lang.Throwable -> L2f
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L2f
            int r0 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L2f
            int r0 = r2.checkPermission(r4, r1, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2d
            goto L2f
        L2d:
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 != 0) goto L34
            r0 = 0
            return r0
        L34:
            r5 = r18
            r4 = r17
            r9 = r22
            switch(r5) {
                case 196609: goto L64;
                case 196610: goto L55;
                case 196611: goto L46;
                default: goto L3d;
            }
        L3d:
            r6 = r19
            r7 = r20
            java.lang.Object r0 = super.LIZ(r5, r6, r7, r9, r10)
            return r0
        L46:
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            r1 = r10[r12]
            java.lang.String r1 = (java.lang.String) r1
            r0 = r10[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r0 = r4.LJ(r9, r1, r0)
            return r0
        L55:
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            r1 = r10[r12]
            java.lang.String r1 = (java.lang.String) r1
            r0 = r10[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r0 = r4.LJI(r9, r1, r0)
            return r0
        L64:
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            r2 = r10[r12]
            byte[] r2 = (byte[]) r2
            r1 = r10[r3]
            java.lang.String r1 = (java.lang.String) r1
            r0 = 2
            r0 = r10[r0]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r0 = r4.LJFF(r9, r1, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.o.LIZ(int, int, long, java.lang.String, java.lang.Object):java.lang.Object");
    }
}
