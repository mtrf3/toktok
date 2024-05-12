package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5nj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145715nj extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final long LJLJJL;
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
    public C145715nj() {
        /*
            r11 = this;
            r1 = 0
            r2 = 0
            r5 = 0
            r10 = 1023(0x3ff, float:1.434E-42)
            r0 = r11
            r3 = r2
            r4 = r2
            r7 = r2
            r8 = r2
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145715nj.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Long.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), Integer.valueOf(this.LJLJLLL), this.LJLL};
    }

    public /* synthetic */ C145715nj(String str, int i, int i2, int i3, long j, int i4, int i5, String str2, int i6) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 4000L : j, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) != 0 ? 0 : i5, 0, 0, (i6 & 512) != 0 ? "unknown" : str2);
    }

    public C145715nj(String path, int i, int i2, int i3, long j, int i4, int i5, int i6, int i7, String codecInfo) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(codecInfo, "codecInfo");
        this.LJLIL = path;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = j;
        this.LJLJJLL = i4;
        this.LJLJL = i5;
        this.LJLJLJ = i6;
        this.LJLJLLL = i7;
        this.LJLL = codecInfo;
        HashMap LIZJ = C03660Ck.LIZJ("path", path);
        LIZJ.put("width", Integer.valueOf(i));
        LIZJ.put("height", Integer.valueOf(i2));
        LIZJ.put("rotation", Integer.valueOf(i3));
        LIZJ.put("duration", Long.valueOf(j));
        LIZJ.put("bitrate", Integer.valueOf(i4 * 1000));
        LIZJ.put("fps", Integer.valueOf(i5));
        LIZJ.put("codec", Integer.valueOf(i6));
        LIZJ.put("video_duration", Integer.valueOf(i7));
        LIZJ.put("codec_info", codecInfo);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('x');
        LIZ.append(i2);
        LIZJ.put("video_size", X1D.LIZIZ(LIZ));
    }
}
