package com.ss.android.ugc.aweme.profile.editprofile.pronouns.ui;

import X.AbstractC234519Ih;
import X.C188727au;
import X.C214298b3;
import X.C221108m2;
import X.C233989Gg;
import X.C234509Ig;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73969T1h;
import X.C78926UyI;
import X.C78999UzT;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.C9BN;
import X.C9BP;
import X.C9BR;
import X.C9C1;
import X.C9GP;
import X.C9GS;
import X.C9GT;
import X.C9GV;
import X.C9GX;
import X.C9KF;
import X.C9QO;
import X.EnumC252729vw;
import X.FMX;
import X.InterfaceC198557ql;
import X.InterfaceC252739vx;
import X.KNV;
import X.T16;
import X.TBT;
import Y.AfS56S0100000_4;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.ui.ProfileEditPronounsNavBarAssem;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsNavBarViewModel;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.IDqS429S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileEditPronounsNavBarAssem extends UIContentAssem implements C9QO {
    public final C214298b3 LJLJI;
    public Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 678));
    public final C55749LuL LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C9GP.class, null), checkSupervisorPrepared());

    private final void F3() {
        C8YN.LJIIJ(this, C3(), new TBT() { // from class: X.9Bv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C232829Bu) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.9Bw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C232829Bu) obj).LJLIL);
            }
        }, null, new IDqS429S0100000_4(this, 9), 12);
        C8YN.LJII(this, C3(), new TBT() { // from class: X.9Bx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C232829Bu) obj).LJLJI;
            }
        }, null, C9BN.LJLIL, 6);
    }

    public void _$_clearFindViewByIdCache() {
        this.LJLJJI.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C9QO, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public ProfileEditPronounsNavBarAssem() {
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 680);
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileEditPronounsNavBarViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 679), C9C1.INSTANCE, aqS154S0100000_4);
    }

    private final C252709vu A3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-navBar>(...)");
        return (C252709vu) value;
    }

    private final ProfileEditPronounsNavBarViewModel C3() {
        return (ProfileEditPronounsNavBarViewModel) this.LJLJI.getValue();
    }

    private final C9KF H3() {
        String str;
        C9KF c9kf = new C9KF();
        C9GP x3 = x3();
        if (x3 == null || (str = x3.LJLIL) == null) {
            str = "";
        }
        c9kf.LIZJ = str;
        c9kf.LIZIZ = "title";
        return c9kf;
    }

    private final AbstractC234519Ih I3() {
        String str;
        Resources resources;
        C234509Ig c234509Ig = new C234509Ig();
        c234509Ig.LIZIZ = "save";
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null || (str = resources.getString(R.string.fkl)) == null) {
            str = "";
        }
        c234509Ig.LIZJ = str;
        c234509Ig.LIZ = new InterfaceC252739vx() { // from class: X.9GU
            @Override // X.InterfaceC252739vx
            public final void LIZ() {
                ProfileEditPronounsNavBarAssem.this.M3();
            }
        };
        return c234509Ig;
    }

    private final AbstractC234519Ih K3() {
        String str;
        Resources resources;
        C234509Ig c234509Ig = new C234509Ig();
        c234509Ig.LIZIZ = "cancel";
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null || (str = resources.getString(R.string.cel)) == null) {
            str = "";
        }
        c234509Ig.LIZJ = str;
        c234509Ig.LIZ(EnumC252729vw.SECONDARY);
        c234509Ig.LIZ = new InterfaceC252739vx() { // from class: X.9BS
            @Override // X.InterfaceC252739vx
            public final void LIZ() {
                ((C9BP) C8VC.LIZ(ProfileEditPronounsNavBarAssem.this, C65352Pkq.LIZ(C9BP.class), null)).D(((C9BR) C8VC.LIZ(ProfileEditPronounsNavBarAssem.this, C65352Pkq.LIZ(C9BR.class), null)).fh());
            }
        };
        return c234509Ig;
    }

    private final C9GP x3() {
        return (C9GP) this.LJLILLLLZI.getValue();
    }

    public final void M3() {
        ((C9BP) C8VC.LIZ(this, C65352Pkq.LIZ(C9BP.class), null)).kc();
        ProfileEditPronounsNavBarViewModel C3 = C3();
        String pronouns = ((C9BR) C8VC.LIZ(this, C65352Pkq.LIZ(C9BR.class), null)).G3();
        C3.getClass();
        o.LJIIIZ(pronouns, "pronouns");
        C78999UzT.LJFF(((C9GV) C3.LJLILLLLZI.getValue().getOperator()).updatePronouns(pronouns).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(C3, 98), new AfS56S0100000_4(C3, 99)), C3.LJLIL);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9GX] */
    @Override // X.C8VB
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public C9GX defaultObservableData() {
        return new InterfaceC198557ql() { // from class: X.9GX
        };
    }

    private final void E3() {
        C9GP x3 = x3();
        if (x3 != null && x3.LJLJI) {
            C233989Gg c233989Gg = ProfileEditInputFragment.LJLJLLL;
            AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 677);
            c233989Gg.getClass();
            C234529Ii LIZ = C233989Gg.LIZ(aqS154S0100000_4);
            AbstractC234519Ih I3 = I3();
            C252709vu A3 = A3();
            C235119Kp c235119Kp = new C235119Kp();
            c235119Kp.LIZLLL(LIZ);
            c235119Kp.LIZIZ(I3);
            c235119Kp.LIZLLL = false;
            A3.setNavActions(c235119Kp);
            LJJJI();
            return;
        }
        AbstractC234519Ih K3 = K3();
        C9KF H3 = H3();
        AbstractC234519Ih I32 = I3();
        C252709vu A32 = A3();
        C235119Kp c235119Kp2 = new C235119Kp();
        c235119Kp2.LIZLLL(K3);
        c235119Kp2.LIZ(H3);
        c235119Kp2.LIZIZ(I32);
        c235119Kp2.LIZLLL = true;
        A32.setNavActions(c235119Kp2);
        LJJJI();
    }

    @Override // X.C9QO
    public void LJJIIJZLJL() {
        A3().LJIJ("save", C9GT.LJLIL);
    }

    @Override // X.C9QO
    public void LJJJI() {
        A3().LJIJ("save", C9GS.LJLIL);
    }

    public final void L3(String str) {
        ((C9BP) C8VC.LIZ(this, C65352Pkq.LIZ(C9BP.class), null)).K4(str);
        C188727au LIZLLL = KNV.LIZLLL(str, "value");
        LIZLLL.LJIIIZ("type", "pronoun");
        LIZLLL.LJIIIZ("enter_method", "click_save");
        LIZLLL.LJIIIZ("pronoun", str);
        FMX.LJIIL("save_profile", LIZLLL.LIZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        E3();
        F3();
    }
}
