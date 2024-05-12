package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJK implements InterfaceC61107NyZ {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ WJI LIZIZ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        C164906da c164906da = results[0];
        int i = 2;
        if (c164906da.LIZIZ == EnumC61598OFm.DENIED_PERMANENT && this.LIZ) {
            WJI wji = this.LIZIZ;
            Activity activity = (Activity) wji.LJLJLLL.LIZ(wji, WJI.LJLLI[2]);
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            HVR.LJIIJJI((ActivityC45651qj) activity);
            return;
        }
        if (c164906da.LIZ()) {
            if (V16.LJJLIIIJILLIZJL(this.LIZIZ.LJIIIZ())) {
                if (!this.LIZIZ.LJIIIZ().cameraComponentModel.isMuted) {
                    i = 1;
                }
                WJI wji2 = this.LIZIZ;
                C05L.LIZJ(i, (InterfaceC82086WJm) wji2.LJLJLJ.LIZ(wji2, WJI.LJLLI[1]));
            } else {
                WJM wjm = this.LIZIZ.LJLL;
                wjm.LJIILIIL = new WI0(wjm.LJIILIIL.LJLIL, WJV.LIZ().LJIIJJI(), true);
                this.LIZIZ.LJ();
            }
            if (V16.LJJLIIIJJI(this.LIZIZ.LJIIIZ())) {
                this.LIZIZ.LJLJJL.invoke();
            }
        }
    }

    public WJK(boolean z, WJI wji) {
        this.LIZ = z;
        this.LIZIZ = wji;
    }
}
