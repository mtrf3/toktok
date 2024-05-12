package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5nm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145745nm extends F9E {
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C145745nm() {
        /*
            r10 = this;
            r8 = 0
            r1 = 0
            r7 = 1023(0x3ff, float:1.434E-42)
            r0 = r10
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145745nm.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), Integer.valueOf(this.LJLJLLL), this.LJLL};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C145745nm(int r13, int r14, int r15, int r16, int r17, int r18, int r19, java.lang.String r20, java.lang.String r21) {
        /*
            r12 = this;
            r1 = r19
            r11 = r21
            r7 = r18
            r2 = r13
            r10 = r20
            r5 = r16
            r3 = r14
            r4 = r15
            r6 = r17
            r0 = r1 & 1
            if (r0 == 0) goto L15
            java.lang.String r10 = ""
        L15:
            r0 = r1 & 2
            if (r0 == 0) goto L1a
            r2 = 0
        L1a:
            r0 = r1 & 4
            if (r0 == 0) goto L1f
            r3 = 0
        L1f:
            r0 = r1 & 8
            if (r0 == 0) goto L24
            r4 = 0
        L24:
            r0 = r1 & 16
            if (r0 == 0) goto L2a
            r5 = 4000(0xfa0, float:5.605E-42)
        L2a:
            r0 = r1 & 32
            if (r0 == 0) goto L2f
            r6 = 0
        L2f:
            r0 = r1 & 64
            if (r0 == 0) goto L34
            r7 = 0
        L34:
            r8 = 0
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L3b
            java.lang.String r11 = "unknown"
        L3b:
            r1 = r12
            r9 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145745nm.<init>(int, int, int, int, int, int, int, java.lang.String, java.lang.String):void");
    }

    public C145745nm(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String path, String codecInfo) {
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
    }
}
