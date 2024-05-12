package X;

import java.util.HashMap;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS196S0100000_14;

/* renamed from: X.VzA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81528VzA implements InterfaceC81526Vz8 {
    public Long LIZJ;
    public C81529VzB LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public long LIZ = -1;
    public long LIZIZ = -1;
    public final AqS196S0100000_14 LJI = new AqS196S0100000_14(this, 36);
    public final AqS172S0100000_6 LJII = new AqS172S0100000_6(this, 77);

    public abstract void LIZ(C188727au c188727au);

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0012, code lost:
    
        if (r4 == null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZIZ() {
        /*
            r5 = this;
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "network_monitor_config"
            java.lang.Class<com.ss.android.ugc.network.observer.bean.DetectorParam> r0 = com.ss.android.ugc.network.observer.bean.DetectorParam.class
            r2.getClass()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r4 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L14
            com.ss.android.ugc.network.observer.bean.DetectorParam r4 = (com.ss.android.ugc.network.observer.bean.DetectorParam) r4     // Catch: java.lang.Throwable -> L14
            if (r4 != 0) goto L23
        L14:
            com.ss.android.ugc.network.observer.bean.DetectorParam r4 = new com.ss.android.ugc.network.observer.bean.DetectorParam
            java.lang.String r2 = "8.8.8.8:443"
            java.lang.String r1 = "35.244.141.111:443"
            java.lang.String r0 = "graph.facebook.com:443"
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}
            r4.<init>(r0)
        L23:
            X.HHM r3 = new X.HHM
            java.lang.String r2 = X.C38987FRv.LIZIZ()
            java.lang.String r1 = X.C38987FRv.LIZJ()
            r0 = 0
            r3.<init>(r2, r1, r0)
            kotlin.jvm.internal.AqS196S0100000_14 r1 = r5.LJI
            kotlin.jvm.internal.AqS172S0100000_6 r0 = r5.LJII
            long r0 = X.VSS.LIZ(r4, r3, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC81528VzA.LIZIZ():long");
    }

    public abstract void LIZJ(EnumC79770VSk enumC79770VSk, HashMap<String, HashMap<String, Object>> hashMap);

    @Override // X.InterfaceC81526Vz8
    public final void destroy() {
        try {
            this.LJ = true;
            this.LJFF = true;
            VSS.LIZIZ(this.LIZ);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public void LIZLLL() {
        C76800UCe c76800UCe;
        try {
            C81529VzB c81529VzB = this.LIZLLL;
            if (c81529VzB != null) {
                if (c81529VzB.LIZ == EnumC79770VSk.NO_NETWORK) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJFF(c81529VzB.LIZIZ, "network_status_detail");
                    LIZ(c188727au);
                    FMX.LJIIL("network_observe_false_alert", c188727au.LIZ);
                }
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        destroy();
    }

    public void LJ() {
        try {
            this.LIZIZ = System.currentTimeMillis();
            this.LIZ = LIZIZ();
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
