package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.PUf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64529PUf {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final C64537PUn LIZIZ;

    static {
        C64537PUn.Companion.getClass();
        LIZIZ = C64528PUe.LIZIZ(new byte[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        if ('F' >= r2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return (r2 - r1) + 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        if ('f' >= r2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LIZIZ(char r2) {
        /*
            r1 = 48
            if (r1 <= r2) goto L10
        L4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unexpected hex digit: "
            java.lang.String r0 = X.C42398GkU.LIZIZ(r0, r2)
            r1.<init>(r0)
            throw r1
        L10:
            r0 = 57
            if (r0 < r2) goto L16
            int r2 = r2 - r1
        L15:
            return r2
        L16:
            r1 = 97
            if (r1 <= r2) goto L26
            r1 = 65
            if (r1 > r2) goto L4
            r0 = 70
            if (r0 < r2) goto L4
        L22:
            int r2 = r2 - r1
            int r2 = r2 + 10
            goto L15
        L26:
            r0 = 102(0x66, float:1.43E-43)
            if (r0 < r2) goto L4
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64529PUf.LIZIZ(char):int");
    }

    public static final C64537PUn LIZ(C64537PUn receiver, int i, int i2) {
        o.LJIIJ(receiver, "$receiver");
        if (i >= 0) {
            if (i2 <= receiver.getData$jvm().length) {
                int i3 = i2 - i;
                if (i3 >= 0) {
                    if (i == 0 && i2 == receiver.getData$jvm().length) {
                        return receiver;
                    }
                    byte[] bArr = new byte[i3];
                    V1M.LIZJ(receiver.getData$jvm(), i, 0, bArr, i3);
                    return new C64537PUn(bArr);
                }
                "endIndex < beginIndex".toString();
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("endIndex > length(");
            String LIZJ = b0.LIZJ(LIZ2, receiver.getData$jvm().length, ')', LIZ2);
            LIZJ.toString();
            throw new IllegalArgumentException(LIZJ);
        }
        "beginIndex < 0".toString();
        throw new IllegalArgumentException("beginIndex < 0");
    }
}
