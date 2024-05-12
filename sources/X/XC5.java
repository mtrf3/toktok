package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XC5 implements InterfaceC10860bi {
    public static final byte LJFF = (byte) 13;
    public static final byte LJI = (byte) 10;
    public byte[] LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final C32611Pt LIZLLL;
    public final EnumC10800bc LJ;

    public final boolean LIZ() {
        byte[] bArr = this.LIZ;
        if (bArr != null) {
            int LIZ = this.LIZLLL.LIZ(bArr, bArr.length);
            if (LIZ <= 0) {
                return false;
            }
            this.LIZIZ = 0;
            this.LIZJ = LIZ;
            return true;
        }
        throw new Exception("buf is null!");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        if (r4[r3] == X.XC5.LJFF) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ() {
        /*
            r8 = this;
            byte[] r4 = r8.LIZ
            r7 = 0
            if (r4 != 0) goto L6
            return r7
        L6:
            int r1 = r8.LIZIZ
            int r0 = r8.LIZJ
            if (r1 < r0) goto L13
            boolean r0 = r8.LIZ()
            if (r0 != 0) goto L13
            return r7
        L13:
            int r6 = r8.LIZIZ
            int r1 = r8.LIZJ
        L17:
            byte r5 = X.XC5.LJI
            if (r6 >= r1) goto L4f
            r0 = r4[r6]
            if (r0 != r5) goto L4c
            int r5 = r8.LIZIZ
            if (r6 == r5) goto L4a
            int r3 = r6 + (-1)
            r1 = r4[r3]
            byte r0 = X.XC5.LJFF
            if (r1 != r0) goto L4a
        L2b:
            int r3 = r3 - r5
            X.0bc r2 = r8.LJ
            java.lang.String r0 = "contentEncoding"
            kotlin.jvm.internal.o.LJIIJ(r2, r0)
            kotlin.jvm.internal.AqS165S0100000_15 r1 = new kotlin.jvm.internal.AqS165S0100000_15
            r0 = 910(0x38e, float:1.275E-42)
            r1.<init>(r2, r0)
            java.lang.Object r0 = r1.invoke()
            java.nio.charset.Charset r0 = (java.nio.charset.Charset) r0
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4, r5, r3, r0)
            int r0 = r6 + 1
            r8.LIZIZ = r0
            return r1
        L4a:
            r3 = r6
            goto L2b
        L4c:
            int r6 = r6 + 1
            goto L17
        L4f:
            X.XC6 r3 = new X.XC6
            int r1 = r8.LIZJ
            int r0 = r8.LIZIZ
            int r1 = r1 - r0
            int r0 = r1 + 80
            r3.<init>(r0, r8)
        L5b:
            int r1 = r8.LIZIZ
            int r0 = r8.LIZJ
            int r0 = r0 - r1
            r3.LIZ(r4, r1, r0)
            r0 = -1
            r8.LIZJ = r0
            boolean r0 = r8.LIZ()
            if (r0 != 0) goto L6d
            return r7
        L6d:
            int r2 = r8.LIZIZ
            int r1 = r8.LIZJ
        L71:
            if (r2 >= r1) goto L5b
            r0 = r4[r2]
            if (r0 != r5) goto L89
            int r1 = r8.LIZIZ
            if (r2 == r1) goto L80
            int r0 = r2 - r1
            r3.LIZ(r4, r1, r0)
        L80:
            int r0 = r2 + 1
            r8.LIZIZ = r0
            java.lang.String r0 = r3.toString()
            return r0
        L89:
            int r2 = r2 + 1
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XC5.LIZIZ():java.lang.String");
    }

    @Override // X.InterfaceC10860bi
    public final void close() {
        this.LIZLLL.close();
        this.LIZ = null;
    }

    public XC5(C32611Pt c32611Pt, EnumC10800bc contentEncoding) {
        o.LJIIJ(contentEncoding, "contentEncoding");
        this.LIZLLL = c32611Pt;
        this.LJ = contentEncoding;
        if (contentEncoding == EnumC10800bc.Ascii) {
            this.LIZ = new byte[FileUtils.BUFFER_SIZE];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding!");
    }
}
