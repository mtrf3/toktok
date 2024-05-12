package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine;

import X.AV1;
import X.AV3;
import X.AV6;
import X.AV9;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.AnonymousClass899;
import X.C17J;
import X.C2068389v;
import X.C212428Vi;
import X.C221108m2;
import X.C235599Ml;
import X.C235639Mp;
import X.C237869Ve;
import X.C237879Vf;
import X.C255199zv;
import X.C255209zw;
import X.C26197APx;
import X.C32151Nz;
import X.C32I;
import X.C54305LSz;
import X.C54362LVe;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C78975Uz5;
import X.C7MY;
import X.C8FR;
import X.C8VC;
import X.C90193gN;
import X.C9AC;
import X.C9AE;
import X.C9IL;
import X.C9KF;
import X.C9KV;
import X.C9VG;
import X.C9VL;
import X.EnumC235859Nl;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC88472Yns;
import X.O6R;
import X.ORZ;
import X.RBX;
import X.TBT;
import X.X1D;
import Y.ARunnableS8S0101000_4;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditNicknameFragment;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavTitleAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarNicknameAssem;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class MineNavBarNicknameAssem extends ProfileNavTitleAssem implements INavbarCenterAbility {
    public SpannableStringBuilder LJLJJI;
    public AV3 LJLJJL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C237879Vf.LJLIL);
    public final C78975Uz5 LJLJI = new C78975Uz5();
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 741));

    @Override // X.C8W0
    public final void onDestroy() {
        ActivityC45651qj LIZ;
        AV3 av3 = this.LJLJJL;
        if (av3 != null) {
            EventBus.LIZJ().LJIJ(av3);
            av3.LIZLLL = 0;
            AV3.LJ = false;
        }
        this.LJLJJL = null;
        if (C26197APx.LIZJ() && (LIZ = C212428Vi.LIZ(this)) != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZLLL(LIZ, null), INavbarCenterAbility.class, null);
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavTitleAssem, com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem, X.C8W0
    public final void onCreate() {
        ActivityC45651qj LIZ;
        super.onCreate();
        if (C26197APx.LIZJ() && (LIZ = C212428Vi.LIZ(this)) != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), this, INavbarCenterAbility.class, null);
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9VX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 724));
        User LIZIZ = AV1.LIZIZ();
        if (LIZIZ != null) {
            C3(LIZIZ);
        }
        C9AE.LIZ(getActionView(), C9AC.ALPHA, 0.0f);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9VZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PL) obj).LIZ;
            }
        }, new AqS170S0100000_4(this, 725));
    }

    public final void x3() {
        if (!HG3.LJIIIIZZ().isEnableMultiAccountLogin()) {
            return;
        }
        synchronized (this) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("profile_choose_account_dialog ");
            LIZ.append(((AV9) this.LJLILLLLZI.getValue()).LIZ);
            String LIZIZ = X1D.LIZIZ(LIZ);
            FragmentManager fragmentManager = (FragmentManager) this.LJLJJLL.getValue();
            if (fragmentManager != null) {
                Fragment LJJJIL = fragmentManager.LJJJIL(LIZIZ);
                if (LJJJIL != null && LJJJIL.isAdded()) {
                } else {
                    AV6.LIZ(fragmentManager, (AV9) this.LJLILLLLZI.getValue(), LIZIZ, null, null, null);
                }
            }
        }
    }

    public final void A3(final User user) {
        C255209zw.LIZLLL("name", !C255199zv.LJIIJ(user, "nickname"));
        ProfileEditNicknameFragment LIZ = C9VG.LIZ(C255199zv.LJI(user, "click_card", "nickname"), "");
        LIZ.setUserVisibleHint(true);
        LIZ.LJLZ = new C9VL() { // from class: X.9VT
            @Override // X.C9VL
            public final void LIZ(String str, C237939Vl c237939Vl) {
                User.this.setNickname(str);
                C235079Kl.LIZ((InterfaceC235069Kk) C8VC.LIZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null), null, 3);
                MineNavBarNicknameAssem mineNavBarNicknameAssem = this;
                mineNavBarNicknameAssem.updateAction(new AqS135S0200000_4(User.this, mineNavBarNicknameAssem, 98));
            }
        };
        FragmentManager fragmentManager = (FragmentManager) this.LJLJJLL.getValue();
        if (fragmentManager != null) {
            LIZ.show(fragmentManager, "EditWebsiteDialog");
        }
    }

    public final void C3(User user) {
        int LJFF;
        int LJIILLIIL;
        if (HG3.LJIIIIZZ().isEnableMultiAccountLogin()) {
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            if (C54305LSz.LIZJ()) {
                List<String> allUidList = ((RBX) HG3.LJIILL()).allUidList();
                o.LJIIIIZZ(allUidList, "userService().allUidList()");
                ArrayList arrayList = new ArrayList(C32I.LJJL(allUidList, 10));
                for (String it : allUidList) {
                    if (o.LJ(curUserId, it)) {
                        LJIILLIIL = 0;
                    } else {
                        o.LJIIIIZZ(it, "it");
                        LJIILLIIL = C54362LVe.LJIILLIIL(it);
                    }
                    arrayList.add(Integer.valueOf(LJIILLIIL));
                }
                LJFF = ORZ.LLILLIZIL(arrayList);
            } else {
                LJFF = C54362LVe.LJFF();
            }
            updateAction(new AqS135S0200000_4(user, this, 99));
            View actionView = getActionView();
            if (actionView != null) {
                actionView.post(new ARunnableS8S0101000_4(LJFF, this, 4));
                return;
            }
            return;
        }
        updateAction(new AqS135S0200000_4(user, this, 100));
        ProfileNavActionAssem.showAlertBadge$default(this, false, 0, 2, null);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility
    public final AnimatorSet Ul(InterfaceC88472Yns<? super View, AnimatorSet> wrapMethod) {
        o.LJIIIZ(wrapMethod, "wrapMethod");
        View findViewById = getService().z5().findViewById(R.id.gwm);
        if (findViewById == null) {
            return null;
        }
        return wrapMethod.invoke(findViewById);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem
    public final void initNavAction(C9KF c9kf) {
        C9KF navAction = c9kf;
        o.LJIIIZ(navAction, "navAction");
        navAction.LIZJ = "";
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavTitleAssem
    public final void updateAction(InterfaceC88472Yns<? super C9KF, C76800UCe> interfaceC88472Yns) {
        super.updateAction(interfaceC88472Yns);
        if (!C54305LSz.LIZJ()) {
            AV3 av3 = this.LJLJJL;
            if (av3 == null) {
                View z6 = getService().z6(EnumC235859Nl.Nickname);
                if (z6 instanceof TuxTextView) {
                    this.LJLJJL = new AV3(getContext(), (TuxTextView) z6, this.LJLJJI);
                    return;
                }
                return;
            }
            if (!AV3.LJ) {
                return;
            }
            av3.LIZLLL();
        }
    }

    public final void E3(boolean z, C9KF c9kf, final User user) {
        List<String> list;
        C235639Mp c235639Mp;
        String str;
        String LIZIZ;
        Resources resources;
        boolean LIZ = C235599Ml.LIZ();
        int i = R.raw.icon_chevron_down_fill;
        C8FR c8fr = null;
        if (!LIZ || ((list = user.boldFields) != null && list.contains("nickname"))) {
            if (!z) {
                i = 0;
            }
            CharSequence v3 = ProfileNavTitleAssem.v3(user);
            C9IL c9il = C9IL.NAV;
            String lowerCase = "HAS_PRONOUNS".toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            C17J.LJIILLIIL(this, true, c9il, lowerCase, !TextUtils.isEmpty(v3));
            c9kf.LJ = i;
            String nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            c9kf.LIZJ = nickname;
            c9kf.LIZLLL = v3;
            c9kf.LIZ = new C237869Ve(new AqS154S0100000_4(this, 742));
            AV3 av3 = this.LJLJJL;
            if (av3 == null) {
                return;
            }
            av3.LIZJ = null;
            return;
        }
        Context context = getContext();
        if (context != null) {
            c235639Mp = new C235639Mp(context);
            ((TuxTag) c235639Mp.LJLIL).setTagSize(3);
            List<String> list2 = user.boldFields;
            if (list2 != null && list2.contains("nickname")) {
                LIZIZ = user.getNickname();
            } else {
                Context context2 = getContext();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("+ ");
                if (context2 != null && (resources = context2.getResources()) != null) {
                    str = resources.getString(R.string.bfu);
                } else {
                    str = null;
                }
                LIZ2.append(str);
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
            if (LIZIZ != null) {
                c235639Mp.LIZ(LIZIZ);
            }
            ((TuxTag) c235639Mp.LJLIL).setTagTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gu, context));
            ((TuxTag) c235639Mp.LJLIL).setTagBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cg, context));
        } else {
            c235639Mp = null;
        }
        AnonymousClass899 anonymousClass899 = new AnonymousClass899() { // from class: X.9VU
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                o.LJIIIZ(widget, "widget");
                MineNavBarNicknameAssem mineNavBarNicknameAssem = this;
                User user2 = user;
                mineNavBarNicknameAssem.LJLJI.LIZIZ(user2, new C86203XsN(user2, mineNavBarNicknameAssem));
            }
        };
        Context context3 = getContext();
        if (context3 != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_chevron_down_fill;
            c2068389v.LIZIZ = C7MY.LIZIZ(14);
            c2068389v.LIZJ = C7MY.LIZIZ(14);
            c8fr = c2068389v.LIZIZ(2, context3);
            if (c8fr != null) {
                C8FR.LIZJ(c8fr, C90193gN.LIZ(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), 0, 4);
            }
        }
        AnonymousClass899 anonymousClass8992 = new AnonymousClass899() { // from class: X.9VY
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                o.LJIIIZ(widget, "widget");
                MineNavBarNicknameAssem.this.x3();
            }
        };
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "12");
        spannableStringBuilder.setSpan(c235639Mp, 0, 1, 17);
        spannableStringBuilder.setSpan(anonymousClass899, 0, 1, 17);
        spannableStringBuilder.setSpan(c8fr, 1, 2, 17);
        spannableStringBuilder.setSpan(anonymousClass8992, 1, 2, 17);
        c9kf.getClass();
        c9kf.LIZJ = spannableStringBuilder;
        c9kf.LIZLLL = ProfileNavTitleAssem.v3(user);
        c9kf.LJ = 0;
        AV3 av32 = this.LJLJJL;
        if (av32 != null) {
            av32.LIZJ = spannableStringBuilder;
        }
        this.LJLJJI = spannableStringBuilder;
    }
}
