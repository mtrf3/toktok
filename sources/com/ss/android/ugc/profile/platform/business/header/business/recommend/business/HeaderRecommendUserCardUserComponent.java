package com.ss.android.ugc.profile.platform.business.header.business.recommend.business;

import X.AnonymousClass391;
import X.C107734Kr;
import X.C198477qd;
import X.C1E4;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C221018lt;
import X.C2316497g;
import X.C25770A9m;
import X.C26338AVi;
import X.C32151Nz;
import X.C33X;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C8YN;
import X.C94Q;
import X.C98C;
import X.C98E;
import X.C98J;
import X.C98S;
import X.C9BE;
import X.HG3;
import X.O6R;
import X.RBX;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.recommend.UserProfileUserCardVM;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.business.base.HeaderRecommendUserCardBaseComponent;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.business.base.IHeaderRecommendUserCardAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HeaderRecommendUserCardUserComponent extends HeaderRecommendUserCardBaseComponent implements IHeaderRecommendUserCardAbility {
    public static final /* synthetic */ int LJLL = 0;
    public final C214298b3 LJLJJI;
    public volatile boolean LJLJJL;
    public User LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.recommend.business.base.HeaderRecommendUserCardBaseComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.recommend.business.base.HeaderRecommendUserCardBaseComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IHeaderRecommendUserCardAbility.class, null);
        }
        Context context = getContext();
        if (context != null) {
            C25770A9m c25770A9m = new C25770A9m(context, null, null, 14);
            int i = 8;
            c25770A9m.setVisibility(8);
            c25770A9m.setLayoutParams(new FrameLayout.LayoutParams(-1, C7MY.LIZIZ(0)));
            C26338AVi.LJIIIZ(c25770A9m, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), AnonymousClass391.LIZJ(16), AnonymousClass391.LIZJ(0), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), 16);
            ImageView initView$lambda$2 = (ImageView) c25770A9m.findViewById(R.id.ely);
            o.LJIIIIZZ(initView$lambda$2, "initView$lambda$2");
            if (((RBX) HG3.LJIILL()).isLogin() && !C1E4.LJIJJLI()) {
                i = 0;
            }
            initView$lambda$2.setVisibility(i);
            initView$lambda$2.setEnabled(!C1E4.LJIJJLI());
            this.LJLILLLLZI = c25770A9m;
            v3();
        }
        C8YN.LJII(this, I3(), new TBT() { // from class: X.98D
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C98Q) obj).LJLJL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 312), 4);
        UserProfileUserCardVM I3 = I3();
        C98C c98c = new TBT() { // from class: X.98C
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C98Q) obj).LJLJJL;
            }
        };
        C56412MCa c56412MCa = new C56412MCa();
        c56412MCa.LIZIZ(false);
        C8YN.LJII(this, I3, c98c, c56412MCa, C198477qd.INSTANCE, 4);
        UserProfileUserCardVM I32 = I3();
        C98E c98e = new TBT() { // from class: X.98E
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C98Q) obj).LJLJLJ;
            }
        };
        C56412MCa c56412MCa2 = new C56412MCa();
        c56412MCa2.LIZ = true;
        c56412MCa2.LIZ(C98S.LJLIL);
        C8YN.LJII(this, I32, c98e, c56412MCa2, new AqS186S0100000_4(this, 313), 4);
        C8YN.LJII(this, I3(), new TBT() { // from class: X.989
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C98Q) obj).LJLJJI);
            }
        }, C213688a4.LJ(), new AqS186S0100000_4(this, 315), 4);
        C8YN.LJII(this, I3(), new TBT() { // from class: X.97a
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C98Q) obj).LJLJI);
            }
        }, C213688a4.LJ(), C94Q.LJLIL, 4);
        C8YN.LJII(this, I3(), new TBT() { // from class: X.98A
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C98Q) obj).LJLIL);
            }
        }, C213688a4.LJ(), new AqS186S0100000_4(this, 318), 4);
        C8YN.LJII(this, I3(), new TBT() { // from class: X.98B
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C98Q) obj).LJLJJLL;
            }
        }, C213688a4.LIZLLL(), C107734Kr.LJLIL, 4);
    }

    public HeaderRecommendUserCardUserComponent() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(UserProfileUserCardVM.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 956), C2316497g.INSTANCE, null);
    }

    public final UserProfileUserCardVM I3() {
        return (UserProfileUserCardVM) this.LJLJJI.getValue();
    }

    public final void L3() {
        C221018lt.LJFF("UserCard_Assem", "reset assem!");
        A3().setVisibility(8);
        if (this.LJLJJL && !(A3().getCurrentState().LIZ instanceof C33X)) {
            A3().reset();
        }
        E3(1.0f);
        x3();
        F3(-2);
        C3(-2);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.recommend.business.base.IHeaderRecommendUserCardAbility
    public final void H7() {
        I3().hv0();
    }

    public final void K3(User user) {
        C98J.LIZ(A3(), null, C212428Vi.LIZLLL(this), new AqS135S0200000_4(user, this, 115), 1);
        A3().setSeeAllStyle(new ACListenerS24S0100000_4(this, 201));
        A3().W7(I3());
        A3().post(new ARunnableS40S0100000_4(this, 85));
    }

    public final void H3(User user, boolean z) {
        String str;
        if (!this.LJLJJL) {
            User user2 = this.LJLJJLL;
            if (user2 != null) {
                str = user2.getUid();
            } else {
                str = null;
            }
            if (o.LJ(str, user.getUid())) {
                return;
            }
            K3(user);
            this.LJLJJL = true;
            this.LJLJJLL = user;
        }
    }
}
