package com.ss.android.ugc.aweme.friendstab.ability;

import X.C188727au;
import X.C53976LGi;
import X.FMX;
import X.K0R;
import X.LIF;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabRouterAbility;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsTabRouterAbility implements IFriendsTabRouterAbility {
    public final Context LJLIL;

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabRouterAbility
    public final void O30() {
        IBottomTabLayoutAbility LJI;
        LIF tk;
        Context context = this.LJLIL;
        if (context != null && (LJI = C53976LGi.LJI(context)) != null && (tk = LJI.tk()) != null) {
            tk.fc();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabRouterAbility
    public final void Vn0() {
        FindFriendsPageArg findFriendsPageArg = new FindFriendsPageArg(false, 0, "homepage_friends", null, null, 0, false, 123, null);
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "//friends/ffp");
        buildRoute.withNavArg(findFriendsPageArg);
        buildRoute.open();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_friends");
        FMX.LJIIL("click_add_friends", c188727au.LIZ);
    }

    public FriendsTabRouterAbility(Context context) {
        this.LJLIL = context;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabRouterAbility
    public final void U4(String sourcePage, String enterFrom) {
        o.LJIIIZ(sourcePage, "sourcePage");
        o.LJIIIZ(enterFrom, "enterFrom");
        K0R.LIZIZ.LIZ(this.LJLIL, sourcePage, enterFrom);
    }
}
