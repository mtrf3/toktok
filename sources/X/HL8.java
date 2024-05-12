package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;

/* loaded from: classes8.dex */
public final class HL8 implements InterfaceC43905HKz {
    public final /* synthetic */ InterfaceC73573Su9<YXT> LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ C87677Yb3 LIZJ;
    public final /* synthetic */ UploadAuthKeyConfig LIZLLL;

    @Override // X.InterfaceC43905HKz
    public final int LIZ() {
        UploadVideoConfig uploadVideoConfig = this.LIZLLL.videoConfig;
        if (uploadVideoConfig != null) {
            return b.LIZIZ(uploadVideoConfig, "BDUploadSpeedProbe");
        }
        throw new IllegalArgumentException("upload video config is null");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // X.InterfaceC43905HKz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRouteContext(int r11, int r12, java.lang.String r13) {
        /*
            r10 = this;
            r4 = 0
            r0 = 1
            r6 = r13
            if (r11 == 0) goto L7
            if (r11 != r0) goto L1f
        L7:
            X.Su9<X.YXT> r0 = r10.LIZ
            X.YXT r1 = new X.YXT
            long r2 = (long) r12
            r7 = 1
            long r4 = r10.LIZIZ
            long r8 = java.lang.System.currentTimeMillis()
            r1.<init>(r2, r4, r6, r7, r8)
            r0.onNext(r1)
            X.Su9<X.YXT> r0 = r10.LIZ
            r0.onComplete()
        L1e:
            return
        L1f:
            r3 = 0
            r0 = 2
            if (r11 == r0) goto L26
            r0 = 3
            if (r11 != r0) goto L2f
        L26:
            r2 = 1
        L27:
            r1 = 0
            r0 = 5
            if (r11 != r0) goto L2c
            r4 = 1
        L2c:
            if (r3 == 0) goto L35
            goto L7
        L2f:
            r2 = 0
            r0 = 4
            if (r11 != r0) goto L27
            r1 = 1
            goto L2c
        L35:
            if (r1 != 0) goto L39
            if (r4 == 0) goto L4c
        L39:
            X.Su9<X.YXT> r0 = r10.LIZ
            X.YXT r1 = new X.YXT
            long r2 = (long) r12
            r7 = 0
            long r4 = r10.LIZIZ
            long r8 = java.lang.System.currentTimeMillis()
            r1.<init>(r2, r4, r6, r7, r8)
            r0.onNext(r1)
            goto L1e
        L4c:
            if (r2 == 0) goto L59
            X.Su9<X.YXT> r1 = r10.LIZ
            X.HLA r0 = new X.HLA
            r0.<init>()
            r1.tryOnError(r0)
            goto L1e
        L59:
            X.Yb3 r0 = r10.LIZJ
            r0.getClass()
            java.lang.String r0 = "error vidContextType onSpeedVidContext"
            X.C87677Yb3.LIZJ(r0)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HL8.onRouteContext(int, int, java.lang.String):void");
    }

    public HL8(C73433Srt c73433Srt, long j, C87677Yb3 c87677Yb3, UploadAuthKeyConfig uploadAuthKeyConfig) {
        this.LIZ = c73433Srt;
        this.LIZIZ = j;
        this.LIZJ = c87677Yb3;
        this.LIZLLL = uploadAuthKeyConfig;
    }
}
