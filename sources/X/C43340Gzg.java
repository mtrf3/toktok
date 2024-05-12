package X;

import defpackage.q;
import org.json.JSONObject;

/* renamed from: X.Gzg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43340Gzg {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final JSONObject LIZLLL;
    public final long LJ;
    public long LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploaderVideoInfo(videoId=");
        LIZ.append(this.LIZ);
        LIZ.append(", coverUri=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", tosKey=");
        LIZ.append(this.LIZJ);
        LIZ.append(", log=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", progress=");
        LIZ.append(this.LJ);
        LIZ.append(", errorCode=");
        LIZ.append(this.LJFF);
        LIZ.append(", errorMsg=");
        LIZ.append(this.LJI);
        LIZ.append(", videoMediaInfo=");
        LIZ.append(this.LJII);
        LIZ.append(", encryptionMeta=");
        return q.LIZIZ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C43340Gzg(long r14, java.lang.String r16, int r17) {
        /*
            r13 = this;
            r1 = r17
            r8 = r14
            r10 = r16
            r0 = r1 & 1
            r5 = 0
            java.lang.String r12 = ""
            if (r0 == 0) goto L3a
            r2 = r12
        Ld:
            r0 = r1 & 2
            if (r0 == 0) goto L38
            r3 = r12
        L12:
            r0 = r1 & 4
            if (r0 == 0) goto L36
            r4 = r12
        L17:
            r6 = 0
            r0 = r1 & 32
            if (r0 == 0) goto L1f
            r8 = 0
        L1f:
            r0 = r1 & 64
            if (r0 == 0) goto L24
            r10 = r12
        L24:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L34
            r11 = r12
        L29:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L32
        L2d:
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r8, r10, r11, r12)
            return
        L32:
            r12 = r5
            goto L2d
        L34:
            r11 = r5
            goto L29
        L36:
            r4 = r5
            goto L17
        L38:
            r3 = r5
            goto L12
        L3a:
            r2 = r5
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43340Gzg.<init>(long, java.lang.String, int):void");
    }

    public C43340Gzg(String str, String str2, String str3, JSONObject jSONObject, long j, long j2, String str4, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = jSONObject;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
    }
}
