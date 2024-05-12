package X;

import android.app.Activity;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M30 implements InterfaceC56171M2t {
    @Override // X.InterfaceC56171M2t
    public final void LIZ(C56175M2x context) {
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC56171M2t
    public final void LIZIZ(C56175M2x context) {
        o.LJIIIZ(context, "context");
        InterfaceC56168M2q interfaceC56168M2q = context.LIZ;
        if (interfaceC56168M2q != null) {
            interfaceC56168M2q.LJI(EnumC56169M2r.ARROW_EMPTY);
        }
    }

    @Override // X.InterfaceC56171M2t
    public final void LIZJ(C56175M2x context) {
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC56171M2t
    public final void LIZLLL(C56175M2x context) {
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC56171M2t
    public final void LJI(C56175M2x c56175M2x, ActivityC45651qj activityC45651qj) {
        String str;
        M26 m26;
        C56179M3b c56179M3b = C56179M3b.LIZ;
        TokenCert tokenCert = M3D.LJII;
        Activity topActivity = ActivityStack.getTopActivity();
        o.LJII(topActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC45651qj activityC45651qj2 = (ActivityC45651qj) topActivity;
        DiscoveryLandingMapVM discoveryLandingMapVM = c56175M2x.LIZJ;
        if (discoveryLandingMapVM != null && (m26 = discoveryLandingMapVM.LJLIL) != null) {
            str = m26.getPreviousPage();
        } else {
            str = null;
        }
        c56179M3b.LJIJI("poi", "places_discovery", tokenCert, activityC45651qj2, new C85258Xd8("places_discover", "find_places_nearby", str, false, 248), new M3F(c56175M2x), null);
    }
}
