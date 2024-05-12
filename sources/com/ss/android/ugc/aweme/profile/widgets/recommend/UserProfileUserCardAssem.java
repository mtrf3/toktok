package com.ss.android.ugc.aweme.profile.widgets.recommend;

import X.AnonymousClass391;
import X.AnonymousClass985;
import X.AnonymousClass988;
import X.C110614Vt;
import X.C119324mG;
import X.C16880lQ;
import X.C17J;
import X.C198487qe;
import X.C198497qf;
import X.C1E4;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221018lt;
import X.C2317297o;
import X.C2318698c;
import X.C25770A9m;
import X.C32151Nz;
import X.C33X;
import X.C55953Lxd;
import X.C56412MCa;
import X.C61328O5c;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C98F;
import X.C98J;
import X.C98M;
import X.C98R;
import X.C99W;
import X.C9AC;
import X.C9AE;
import X.C9IF;
import X.C9PN;
import X.EnumC234329Ho;
import X.HG3;
import X.InterfaceC235089Km;
import X.InterfaceC57512Mhg;
import X.InterfaceC57760Mlg;
import X.InterfaceC65784Pro;
import X.RBX;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS40S0100000_4;
import Y.AUListenerS93S0100000_4;
import Y.IDAListenerS73S0100000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS36S0210000_4;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import q03.IDaS484S0100000_4;

/* loaded from: classes5.dex */
public final class UserProfileUserCardAssem extends ProfileCTASingleComponent implements InterfaceC57512Mhg {
    public static final C98F LJLLJ = new Object() { // from class: X.98F
    };
    public final C214298b3 LJLJJI;
    public C25770A9m LJLJJL;
    public C119324mG LJLJJLL;
    public TuxIconView LJLJL;
    public LinearLayout LJLJLJ;
    public int LJLJLLL;
    public volatile boolean LJLL;
    public User LJLLI;
    public Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    private final void c4() {
        C8YN.LJII(this, O3(), new TBT() { // from class: X.987
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C98Q) obj).LJLJL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 183), 4);
        UserProfileUserCardVM O3 = O3();
        AnonymousClass988 anonymousClass988 = new TBT() { // from class: X.988
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C98Q) obj).LJLJJL;
            }
        };
        C56412MCa c56412MCa = new C56412MCa();
        c56412MCa.LIZIZ(false);
        C8YN.LJII(this, O3, anonymousClass988, c56412MCa, C198487qe.INSTANCE, 4);
        UserProfileUserCardVM O32 = O3();
        AnonymousClass985 anonymousClass985 = new TBT() { // from class: X.985
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C98Q) obj).LJLJLJ;
            }
        };
        C56412MCa c56412MCa2 = new C56412MCa();
        c56412MCa2.LIZ = true;
        c56412MCa2.LIZ(C98R.LJLIL);
        C8YN.LJII(this, O32, anonymousClass985, c56412MCa2, new AqS186S0100000_4(this, 179), 4);
        C8YN.LJII(this, O3(), new TBT() { // from class: X.983
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C98Q) obj).LJLJJI);
            }
        }, C213688a4.LJ(), new AqS186S0100000_4(this, 180), 4);
        C8YN.LJII(this, O3(), new TBT() { // from class: X.97b
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C98Q) obj).LJLJI);
            }
        }, C213688a4.LJ(), new AqS186S0100000_4(this, 181), 4);
        C8YN.LJII(this, O3(), new TBT() { // from class: X.984
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C98Q) obj).LJLIL);
            }
        }, C213688a4.LJ(), new AqS186S0100000_4(this, 182), 4);
        C8YN.LJII(this, O3(), new TBT() { // from class: X.986
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C98Q) obj).LJLJJLL;
            }
        }, C213688a4.LIZLLL(), C198497qf.LJLIL, 4);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public void _$_clearFindViewByIdCache() {
        this.LJLLILLLL.clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLILLLL;
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

    @Override // X.InterfaceC57512Mhg, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public UserProfileUserCardAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(UserProfileUserCardVM.class);
        this.LJLJJI = new C214298b3(new AqS154S0100000_4(LIZ, 747), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C2317297o.INSTANCE, LIZ);
    }

    private final void X3() {
        LinearLayout linearLayout;
        Drawable drawable;
        if (!C99W.LIZ || (linearLayout = this.LJLJLJ) == null) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
            drawable = c110614Vt.LIZ(context);
        } else {
            drawable = null;
        }
        linearLayout.setBackground(drawable);
    }

    public final C9PN N3() {
        return (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
    }

    public final UserProfileUserCardVM O3() {
        return (UserProfileUserCardVM) this.LJLJJI.getValue();
    }

    public final void R3() {
        C25770A9m c25770A9m = this.LJLJJL;
        if (c25770A9m != null) {
            if (c25770A9m.getVisibility() == 0) {
                return;
            }
            C119324mG c119324mG = this.LJLJJLL;
            if (c119324mG != null) {
                c119324mG.post(new ARunnableS40S0100000_4(this, 74));
                C119324mG c119324mG2 = this.LJLJJLL;
                if (c119324mG2 != null) {
                    ViewGroup.LayoutParams layoutParams = c119324mG2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = -2;
                        c119324mG2.setLayoutParams(layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                o.LJIJI("userInfoLayout");
                throw null;
            }
            o.LJIJI("userInfoLayout");
            throw null;
        }
        o.LJIJI("horizontalUserCardLayout");
        throw null;
    }

    public final void Z3() {
        C221018lt.LJFF("UserCard_Assem", "reset assem!");
        C25770A9m c25770A9m = this.LJLJJL;
        if (c25770A9m != null) {
            c25770A9m.setVisibility(8);
            if (this.LJLL) {
                C25770A9m c25770A9m2 = this.LJLJJL;
                if (c25770A9m2 != null) {
                    if (!(c25770A9m2.getCurrentState().LIZ instanceof C33X)) {
                        C25770A9m c25770A9m3 = this.LJLJJL;
                        if (c25770A9m3 != null) {
                            c25770A9m3.reset();
                        } else {
                            o.LJIJI("horizontalUserCardLayout");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("horizontalUserCardLayout");
                    throw null;
                }
            }
            C119324mG c119324mG = this.LJLJJLL;
            if (c119324mG != null) {
                if (c119324mG.getAlpha() != 1.0f) {
                    C119324mG c119324mG2 = this.LJLJJLL;
                    if (c119324mG2 != null) {
                        c119324mG2.setAlpha(1.0f);
                    } else {
                        o.LJIJI("userInfoLayout");
                        throw null;
                    }
                }
                C119324mG c119324mG3 = this.LJLJJLL;
                if (c119324mG3 != null) {
                    c119324mG3.clearAnimation();
                    R3();
                    return;
                } else {
                    o.LJIJI("userInfoLayout");
                    throw null;
                }
            }
            o.LJIJI("userInfoLayout");
            throw null;
        }
        o.LJIJI("horizontalUserCardLayout");
        throw null;
    }

    @Override // X.InterfaceC57512Mhg
    public void H7() {
        O3().hv0();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public void componentClick() {
        UserProfileUserCardVM O3 = O3();
        O3.getClass();
        O3.withState(new AqS170S0100000_4(O3, 989));
        C17J.LJJJ(this, false, "spread_follow");
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public Integer componentIcon() {
        return Integer.valueOf(R.raw.icon_arrow_triangle_down_fill);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public EnumC234329Ho v3() {
        return EnumC234329Ho.ICON;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public C9IF x3() {
        return C9IF.RECOMMEND;
    }

    private final void Q3(View view) {
        TuxIconView tuxIconView;
        C25770A9m c25770A9m;
        float f;
        View findViewById = view.findViewById(R.id.mz2);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.user_info_layout)");
        this.LJLJJLL = (C119324mG) findViewById;
        this.LJLJLJ = (LinearLayout) view.findViewById(R.id.g5j);
        if (C2318698c.LIZ() >= 1) {
            tuxIconView = C3();
        } else {
            tuxIconView = (TuxIconView) view.findViewById(R.id.iqr);
        }
        int i = 8;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
            ProfileCTASingleComponent.H3(this, null, 1, null);
            C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 12), tuxIconView);
            if (C99W.LIZ) {
                f = C32151Nz.LJIIZILJ(8);
            } else {
                f = 0.0f;
            }
            C9AE.LIZ(tuxIconView, C9AC.LIGHT_MASK, f);
        } else {
            tuxIconView = null;
        }
        this.LJLJL = tuxIconView;
        X3();
        ImageView initView$lambda$3$lambda$2 = (ImageView) view.findViewById(R.id.ely);
        o.LJIIIIZZ(initView$lambda$3$lambda$2, "initView$lambda$3$lambda$2");
        if (((RBX) HG3.LJIILL()).isLogin() && !C1E4.LJIJJLI()) {
            i = 0;
        }
        initView$lambda$3$lambda$2.setVisibility(i);
        initView$lambda$3$lambda$2.setEnabled(!C1E4.LJIJJLI());
        if (C2318698c.LIZ() >= 1) {
            View findViewById2 = view.findViewById(R.id.myn);
            o.LJIIIIZZ(findViewById2, "{\n            findViewBy…d_layout_below)\n        }");
            c25770A9m = (C25770A9m) findViewById2;
        } else {
            View findViewById3 = view.findViewById(R.id.mym);
            o.LJIIIIZZ(findViewById3, "{\n            findViewBy…er_card_layout)\n        }");
            c25770A9m = (C25770A9m) findViewById3;
        }
        this.LJLJJL = c25770A9m;
        R3();
    }

    private final void a4(TuxIconView tuxIconView) {
        tuxIconView.setIconRes(R.raw.icon_spinner_normal);
        tuxIconView.clearAnimation();
        tuxIconView.setRotation(180.0f);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setDuration(600L);
        tuxIconView.startAnimation(rotateAnimation);
    }

    public final void P3(User user) {
        C25770A9m c25770A9m = this.LJLJJL;
        if (c25770A9m != null) {
            C98J.LIZ(c25770A9m, null, C212428Vi.LIZLLL(this), new AqS135S0200000_4(user, this, 104), 1);
            C25770A9m c25770A9m2 = this.LJLJJL;
            if (c25770A9m2 != null) {
                c25770A9m2.setSeeAllStyle(new ACListenerS24S0100000_4(this, 151));
                C25770A9m c25770A9m3 = this.LJLJJL;
                if (c25770A9m3 != null) {
                    c25770A9m3.W7(O3());
                    C25770A9m c25770A9m4 = this.LJLJJL;
                    if (c25770A9m4 != null) {
                        c25770A9m4.post(new ARunnableS40S0100000_4(this, 73));
                        return;
                    } else {
                        o.LJIJI("horizontalUserCardLayout");
                        throw null;
                    }
                }
                o.LJIJI("horizontalUserCardLayout");
                throw null;
            }
            o.LJIJI("horizontalUserCardLayout");
            throw null;
        }
        o.LJIJI("horizontalUserCardLayout");
        throw null;
    }

    public final void Y3(User user) {
        L3(user, false);
        InterfaceC57760Mlg interfaceC57760Mlg = O3().LJLIL;
        if (interfaceC57760Mlg != null) {
            C25770A9m c25770A9m = this.LJLJJL;
            if (c25770A9m != null) {
                c25770A9m.W7(interfaceC57760Mlg);
            } else {
                o.LJIJI("horizontalUserCardLayout");
                throw null;
            }
        }
        C25770A9m c25770A9m2 = this.LJLJJL;
        if (c25770A9m2 != null) {
            c25770A9m2.LJLJLJ(false);
        } else {
            o.LJIJI("horizontalUserCardLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC57512Mhg
    public void c3(int i) {
        O3().c3(i);
    }

    public final C76800UCe e4(int i) {
        TuxIconView tuxIconView = this.LJLJL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (tuxIconView == null) {
                        return null;
                    }
                    a4(tuxIconView);
                }
                return C76800UCe.LIZ;
            }
            if (tuxIconView == null) {
                return null;
            }
            b4(tuxIconView, false);
            return C76800UCe.LIZ;
        }
        if (tuxIconView == null) {
            return null;
        }
        b4(tuxIconView, true);
        return C76800UCe.LIZ;
    }

    public final void g4(User user) {
        if (this.LJLL) {
            C25770A9m c25770A9m = this.LJLJJL;
            if (c25770A9m != null) {
                if (!(c25770A9m.getCurrentState().LIZ instanceof C33X)) {
                    C25770A9m c25770A9m2 = this.LJLJJL;
                    if (c25770A9m2 != null) {
                        c25770A9m2.reset();
                    } else {
                        o.LJIJI("horizontalUserCardLayout");
                        throw null;
                    }
                }
                C25770A9m c25770A9m3 = this.LJLJJL;
                if (c25770A9m3 != null) {
                    C98M.LIZ(c25770A9m3, null, user.getSecUid(), user.getUid(), 1);
                    C25770A9m c25770A9m4 = this.LJLJJL;
                    if (c25770A9m4 != null) {
                        c25770A9m4.LJLIL.LJJLIIIJJIZ(new AqS170S0100000_4(user, 738));
                        this.LJLLI = user;
                        return;
                    }
                    o.LJIJI("horizontalUserCardLayout");
                    throw null;
                }
                o.LJIJI("horizontalUserCardLayout");
                throw null;
            }
            o.LJIJI("horizontalUserCardLayout");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        Q3(view);
        c4();
    }

    private final void b4(TuxIconView tuxIconView, boolean z) {
        float f;
        tuxIconView.clearAnimation();
        tuxIconView.setIconRes(R.raw.icon_arrow_triangle_down_fill);
        if (!z) {
            f = 180.0f;
        } else {
            f = 360.0f;
        }
        tuxIconView.animate().rotation(f).start();
        LinearLayout linearLayout = this.LJLJLJ;
        if (linearLayout == null) {
            return;
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LJFF = Integer.valueOf(R.attr.dz);
        if (C99W.LIZ) {
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            c110614Vt.LIZLLL = AnonymousClass391.LIZJ(0);
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
        } else {
            c110614Vt.LIZJ = C61328O5c.LIZJ(2);
            c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
        }
        Context context = tuxIconView.getContext();
        o.LJIIIIZZ(context, "context");
        linearLayout.setBackground(c110614Vt.LIZ(context));
    }

    public final void L3(User user, boolean z) {
        String str;
        if (!this.LJLL) {
            User user2 = this.LJLLI;
            if (user2 != null) {
                str = user2.getUid();
            } else {
                str = null;
            }
            if (o.LJ(str, user.getUid())) {
                return;
            }
            if (z) {
                O3().runOnWorkThread(new AqS135S0200000_4(user, this, 103));
            } else {
                P3(user);
                this.LJLL = true;
            }
            this.LJLLI = user;
        }
    }

    private final ValueAnimator M3(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(C55953Lxd.LJ());
        C25770A9m c25770A9m = this.LJLJJL;
        if (c25770A9m != null) {
            c25770A9m.clearAnimation();
            C119324mG c119324mG = this.LJLJJLL;
            if (c119324mG != null) {
                c119324mG.clearAnimation();
                ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 15));
                ofFloat.addListener(new IDAListenerS73S0100000_4(interfaceC65784Pro, 5));
                ofFloat.addListener(new IDAListenerS73S0100000_4(interfaceC65784Pro2, 4));
                if (z) {
                    ofFloat.start();
                } else {
                    ofFloat.reverse();
                }
                return ofFloat;
            }
            o.LJIJI("userInfoLayout");
            throw null;
        }
        o.LJIJI("horizontalUserCardLayout");
        throw null;
    }

    private final void U3(boolean z, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        AqS61S0110000_4 aqS61S0110000_4 = new AqS61S0110000_4(z, this, 3);
        AqS36S0210000_4 aqS36S0210000_4 = new AqS36S0210000_4(z, (boolean) this, (UserProfileUserCardAssem) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 0);
        if (!z2) {
            aqS61S0110000_4.invoke();
            aqS36S0210000_4.invoke();
        } else {
            M3(aqS61S0110000_4, aqS36S0210000_4, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void W3(UserProfileUserCardAssem userProfileUserCardAssem, boolean z, boolean z2, InterfaceC65784Pro interfaceC65784Pro, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(userProfileUserCardAssem, C65352Pkq.LIZ(InterfaceC235089Km.class));
            if (c9pn != null && c9pn.LJIIIZ) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if ((i & 4) != 0) {
            interfaceC65784Pro = null;
        }
        userProfileUserCardAssem.U3(z, z2, interfaceC65784Pro);
    }
}
