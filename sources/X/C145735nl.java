package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5nl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145735nl extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final String LJLL;
    public final int LJLLI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C145735nl() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r9 = 2047(0x7ff, float:2.868E-42)
            r0 = r10
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145735nl.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), Integer.valueOf(this.LJLJLLL), this.LJLL, Integer.valueOf(this.LJLLI)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C145735nl(java.lang.String r14, int r15, int r16, int r17, int r18, int r19, int r20, java.lang.String r21, int r22) {
        /*
            r13 = this;
            r1 = r22
            r12 = r21
            r7 = r20
            r2 = r15
            r11 = r14
            r4 = r17
            r3 = r16
            r5 = r18
            r6 = r19
            r0 = r1 & 1
            if (r0 == 0) goto L16
            java.lang.String r11 = ""
        L16:
            r0 = r1 & 2
            if (r0 == 0) goto L1b
            r2 = 0
        L1b:
            r0 = r1 & 4
            if (r0 == 0) goto L20
            r3 = 0
        L20:
            r0 = r1 & 8
            if (r0 == 0) goto L25
            r4 = 0
        L25:
            r0 = r1 & 16
            if (r0 == 0) goto L2b
            r5 = 4000(0xfa0, float:5.605E-42)
        L2b:
            r0 = r1 & 32
            if (r0 == 0) goto L30
            r6 = 0
        L30:
            r0 = r1 & 64
            if (r0 == 0) goto L35
            r7 = 0
        L35:
            r8 = 0
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L3c
            java.lang.String r12 = "unknown"
        L3c:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L49
            r10 = 2147483647(0x7fffffff, float:NaN)
        L43:
            r1 = r13
            r9 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L49:
            r10 = 0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145735nl.<init>(java.lang.String, int, int, int, int, int, int, java.lang.String, int):void");
    }

    public C145735nl(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String path, String codecInfo) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(codecInfo, "codecInfo");
        this.LJLIL = path;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = i4;
        this.LJLJJLL = i5;
        this.LJLJL = i6;
        this.LJLJLJ = i7;
        this.LJLJLLL = i8;
        this.LJLL = codecInfo;
        this.LJLLI = i9;
        HashMap LIZJ = C03660Ck.LIZJ("path", path);
        LIZJ.put("width", Integer.valueOf(i));
        LIZJ.put("height", Integer.valueOf(i2));
        LIZJ.put("rotation", Integer.valueOf(i3));
        LIZJ.put("duration", Integer.valueOf(i4));
        LIZJ.put("bitrate", Integer.valueOf(i5 * 1000));
        LIZJ.put("fps", Integer.valueOf(i6));
        LIZJ.put("codec", Integer.valueOf(i7));
        LIZJ.put("video_duration", Integer.valueOf(i8));
        LIZJ.put("codec_info", codecInfo);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('x');
        LIZ.append(i2);
        LIZJ.put("video_size", X1D.LIZIZ(LIZ));
        LIZJ.put("key_frame_count", Integer.valueOf(i9));
    }
}
