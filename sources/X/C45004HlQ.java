package X;

import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV1;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HlQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45004HlQ extends AbstractC45018Hle {
    public final InterfaceC88472Yns<VideoPublishEditModel, InterfaceC147355qN> LIZIZ;
    public CompileProbeConfigV1 LIZJ;

    public C45004HlQ(C45009HlV getVideoSizeProvider) {
        o.LJIIIZ(getVideoSizeProvider, "getVideoSizeProvider");
        this.LIZIZ = getVideoSizeProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[ORIG_RETURN, RETURN] */
    @Override // X.AbstractC45018Hle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6) {
        /*
            r5 = this;
            java.lang.String r0 = "model"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r2 = "compile_probe_config"
            java.lang.String r1 = ""
            r0 = 31744(0x7c00, float:4.4483E-41)
            r4 = 1
            java.lang.String r3 = X.C47959Irz.LIZLLL(r0, r2, r1, r4)
            r2 = 0
            if (r3 == 0) goto L19
            int r0 = r3.length()
            if (r0 != 0) goto L1f
        L19:
            r0 = 0
        L1a:
            r5.LIZJ = r0
            if (r0 != 0) goto L44
            return r2
        L1f:
            X.HEe r0 = X.C60903NvH.LJIIJJI()     // Catch: java.lang.Exception -> L30
            com.google.gson.Gson r1 = r0.LIZ()     // Catch: java.lang.Exception -> L30
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV1> r0 = com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV1.class
            java.lang.Object r0 = r1.LJI(r3, r0)     // Catch: java.lang.Exception -> L30
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV1 r0 = (com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV1) r0     // Catch: java.lang.Exception -> L30
            goto L1a
        L30:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "SWCompileProbe ; solveCompileProbeConfig failed: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C5Z5.LIZJ(r0)
            goto L19
        L44:
            boolean r0 = X.H7R.LJJLIIIJ(r6)
            if (r0 == 0) goto L67
            X.Yns<com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.5qN> r0 = r5.LIZIZ
            java.lang.Object r3 = r0.invoke(r6)
            X.5qN r3 = (X.InterfaceC147355qN) r3
            int r0 = r6.videoWidth()
            int r2 = r6.videoHeight()
            int r2 = r2 + r0
            int r1 = r3.LIZIZ()
            int r0 = r3.LJ()
            int r0 = r0 + r1
            if (r2 != r0) goto L67
        L66:
            return r4
        L67:
            r4 = 0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45004HlQ.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    @Override // X.AbstractC45018Hle
    public final void LIZJ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        C68322mC c68322mC = new C68322mC();
        if (this.LIZ == null) {
            this.LIZ = new C45017Hld(new C45010HlW(model, this, c68322mC), new C45007HlT(c68322mC), new C45003HlP(model));
        }
    }
}
