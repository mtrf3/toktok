package com.ss.android.ugc.aweme.profile.widgets.bind.account;

import X.C17J;
import X.C2318698c;
import X.C234629Is;
import X.C243839hb;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C8VC;
import X.C99W;
import X.C9ID;
import X.C9IF;
import X.C9PN;
import X.EnumC234329Ho;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.RBX;
import X.SY4;
import X.TBT;
import android.view.View;
import com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileBindAccountAssem extends ProfileCTASingleComponent {
    public SY4 LJLJJL;
    public C243839hb LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C55749LuL LJLJJI = new C55749LuL(C47704Ins.LJ(this, C9ID.class, null), checkSupervisorPrepared());

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    public final boolean L7() {
        C9ID c9id = (C9ID) this.LJLJJI.getValue();
        if (c9id != null) {
            return c9id.LJLJI;
        }
        return false;
    }

    public final void M3() {
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Ip
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new C234629Is(this));
        if (!L7()) {
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Iq
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PN) obj).LJIIJJI;
                }
            }, new AqS170S0100000_4(this, 674));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        String str;
        C9PN c9pn;
        String str2;
        String str3;
        super.onCreate();
        if (L7() || C2318698c.LIZIZ()) {
            M3();
        }
        String LJJ = C17J.LJJ(this, L7());
        if (L7()) {
            str = ((RBX) HG3.LJIILL()).getCurUserId();
        } else {
            C9PN c9pn2 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
            if (c9pn2 != null) {
                str = c9pn2.LIZ;
            } else {
                str = null;
            }
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        if (L7() || (c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class))) == null || (str2 = c9pn.LJII) == null) {
            str2 = "";
        }
        C9PN c9pn3 = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn3 != null && (str3 = c9pn3.LIZLLL) != null) {
            str4 = str3;
        }
        this.LJLJJLL = new C243839hb(LJJ, str, str2, str4);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final EnumC234329Ho v3() {
        return EnumC234329Ho.ICON;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final C9IF x3() {
        return C9IF.SOCIAL_BUTTON;
    }

    public final void L3(boolean z) {
        int i;
        if (!L7() && !C2318698c.LIZIZ()) {
            SY4 sy4 = this.LJLJJL;
            if (sy4 == null) {
                return;
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            sy4.setVisibility(i);
            return;
        }
        if (z) {
            ProfileCTASingleComponent.H3(this, null, 1, null);
        } else {
            requestHide();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (!L7() && !C2318698c.LIZIZ()) {
            SY4 sy4 = (SY4) view.findViewById(R.id.alg);
            this.LJLJJL = sy4;
            if (C99W.LIZ && sy4 != null) {
                sy4.setButtonVariant(5);
            }
            M3();
        }
    }
}
