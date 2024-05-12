package X;

import android.app.Activity;
import com.ss.android.ugc.network.observer.bean.DetectorParam;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS196S0100000_14;

/* renamed from: X.VzH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81535VzH implements InterfaceC84872XSq {
    public final K1N LIZ;
    public boolean LJ;
    public boolean LJFF;
    public boolean LIZIZ = true;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public final AqS196S0100000_14 LJI = new AqS196S0100000_14(this, 61);
    public final AqS180S0100000_14 LJII = new AqS180S0100000_14(this, 375);

    @Override // X.InterfaceC84872XSq
    public final void LIZIZ() {
        this.LIZIZ = false;
    }

    public final long LIZLLL() {
        String str;
        DetectorParam detectorParam = new DetectorParam(new String[]{"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"});
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            str = C16880lQ.LJLLJ(LJIIIIZZ.getClass());
        } else {
            str = null;
        }
        return VSS.LIZ(detectorParam, new HHM(str, "", 0), this.LJI, this.LJII);
    }

    @Override // X.InterfaceC84872XSq
    public final void destroy() {
        try {
            this.LJ = true;
            this.LJFF = true;
            VSS.LIZIZ(this.LIZJ);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // X.InterfaceC84878XSw
    public final void LIZJ() {
        try {
            this.LIZJ = LIZLLL();
            this.LIZLLL = System.currentTimeMillis();
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // X.InterfaceC84872XSq
    public final void LIZ() {
        destroy();
    }

    public C81535VzH(C51029K0z c51029K0z) {
        this.LIZ = c51029K0z;
    }
}
