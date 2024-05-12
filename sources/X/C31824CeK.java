package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CeK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31824CeK extends AbstractC31822CeI {
    public final String LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final int LJIILIIL;
    public final boolean LJIILJJIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UrlFileConfig: fileName=");
        LIZ.append(this.LIZ);
        LIZ.append(" fileDir=");
        LIZ.append(C78983UzD.LJJIIJ(this));
        LIZ.append(" url=");
        LIZ.append(this.LJIIIZ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC31822CeI
    public void LIZ(String ioType, JSONObject category, JSONObject metric, JSONObject extra) {
        o.LJIIIZ(ioType, "ioType");
        o.LJIIIZ(category, "category");
        o.LJIIIZ(metric, "metric");
        o.LJIIIZ(extra, "extra");
        super.LIZ(ioType, category, metric, extra);
        extra.putOpt("url", this.LJIIIZ);
        if (this.LJIIJ.length() > 0) {
            extra.putOpt("extra", this.LJIIJ);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C31824CeK(java.lang.String r3, X.EnumC31874Cf8 r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, int r10, boolean r11, int r12) {
        /*
            r2 = this;
            r0 = r12 & 4
            java.lang.String r1 = ""
            if (r0 == 0) goto L7
            r5 = r1
        L7:
            r0 = r12 & 8
            if (r0 == 0) goto Lc
            r6 = r1
        Lc:
            r0 = r12 & 32
            if (r0 == 0) goto L11
            r8 = r1
        L11:
            r0 = r12 & 64
            if (r0 == 0) goto L53
            r1 = 1
        L16:
            r0 = r12 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L1b
            r9 = 1
        L1b:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L20
            r10 = 1
        L20:
            r0 = r12 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L25
            r11 = 0
        L25:
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "fileDirectory"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "subFileDirectory"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "mimeType"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "extra"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            r2.<init>(r3, r4, r5, r6)
            r2.LJIIIZ = r7
            r2.LJIIJ = r8
            r2.LJIIJJI = r1
            r2.LJIIL = r9
            r2.LJIILIIL = r10
            r2.LJIILJJIL = r11
            return
        L53:
            r1 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31824CeK.<init>(java.lang.String, X.Cf8, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, boolean, int):void");
    }
}
