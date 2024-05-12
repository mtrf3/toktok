package Y;

import X.ActivityC45651qj;
import X.C17J;
import X.C212428Vi;
import X.C234999Kd;
import X.C243039gJ;
import X.C252129uy;
import X.C26335AVf;
import X.C65352Pkq;
import X.C8VC;
import X.C9R8;
import X.InterfaceC235069Kk;
import X.InterfaceC65784Pro;
import X.ViewOnClickListenerC252769w0;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commerce.BaGrowthMessageInfo;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureLiveEventAssem;
import java.util.List;

/* loaded from: classes5.dex */
public class ACListenerS28S0400000_4 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS28S0400000_4 aCListenerS28S0400000_4, View view) {
        ((ViewOnClickListenerC252769w0) aCListenerS28S0400000_4.l0).setVisibility(8);
        ((InterfaceC65784Pro) aCListenerS28S0400000_4.l1).invoke();
        SmartRoute buildRoute = SmartRouter.buildRoute(((C252129uy) aCListenerS28S0400000_4.l2).LJLILLLLZI, ((BaGrowthMessageInfo) aCListenerS28S0400000_4.l3).getLandingPageSchema());
        buildRoute.addFlags(268435456);
        buildRoute.open();
    }

    public static final void onClick$1(ACListenerS28S0400000_4 aCListenerS28S0400000_4, View view) {
        ActivityC45651qj LIZ;
        FragmentManager supportFragmentManager;
        User user;
        LiveEventStruct liveEventStruct;
        ProfileAdvancedFeatureLiveEventAssem profileAdvancedFeatureLiveEventAssem = (ProfileAdvancedFeatureLiveEventAssem) aCListenerS28S0400000_4.l0;
        C17J.LJJJ(profileAdvancedFeatureLiveEventAssem, profileAdvancedFeatureLiveEventAssem.K3(), "live");
        boolean z = true;
        if (((List) aCListenerS28S0400000_4.l1).size() == 1) {
            C243039gJ.LIZ(((ProfileAdvancedFeatureLiveEventAssem) aCListenerS28S0400000_4.l0).getContext(), (LiveEventStruct) aCListenerS28S0400000_4.l2);
        } else if ((!((List) aCListenerS28S0400000_4.l1).isEmpty()) && (LIZ = C212428Vi.LIZ((ProfileAdvancedFeatureLiveEventAssem) aCListenerS28S0400000_4.l0)) != null && (supportFragmentManager = LIZ.getSupportFragmentManager()) != null) {
            C9R8.LIZ(supportFragmentManager, (User) aCListenerS28S0400000_4.l3, (List) aCListenerS28S0400000_4.l1);
        }
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ((ProfileAdvancedFeatureLiveEventAssem) aCListenerS28S0400000_4.l0, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null && (user = c234999Kd.LIZ) != null) {
            ProfileAdvancedFeatureLiveEventAssem profileAdvancedFeatureLiveEventAssem2 = (ProfileAdvancedFeatureLiveEventAssem) aCListenerS28S0400000_4.l0;
            List list = (List) aCListenerS28S0400000_4.l1;
            List<LiveEventStruct> liveEventStructList = user.getLiveEventStructList();
            if (liveEventStructList == null || (liveEventStruct = (LiveEventStruct) ListProtector.get(liveEventStructList, 0)) == null || !liveEventStruct.isPaidEvent()) {
                z = false;
            }
            C26335AVf.LJ(list.size(), profileAdvancedFeatureLiveEventAssem2.LJLJJLL, z, "click", C26335AVf.LIZIZ(user));
        }
    }

    public ACListenerS28S0400000_4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
