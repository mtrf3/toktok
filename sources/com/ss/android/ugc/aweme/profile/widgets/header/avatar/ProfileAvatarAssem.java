package com.ss.android.ugc.aweme.profile.widgets.header.avatar;

import X.APQ;
import X.APV;
import X.APX;
import X.AU9;
import X.AUA;
import X.AUN;
import X.AUO;
import X.AUP;
import X.AUQ;
import X.AUR;
import X.AUS;
import X.AUU;
import X.AXO;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C107724Kq;
import X.C188727au;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C234999Kd;
import X.C235099Kn;
import X.C26308AUe;
import X.C32151Nz;
import X.C44384HbQ;
import X.C53464Kya;
import X.C53526Kza;
import X.C53582L1e;
import X.C53592L1o;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C86184Xs4;
import X.C8VC;
import X.C9BE;
import X.C9KV;
import X.EnumC112364b2;
import X.EnumC53663L4h;
import X.EnumC53719L6l;
import X.FMX;
import X.InterfaceC100173wT;
import X.InterfaceC235069Kk;
import X.InterfaceC53590L1m;
import X.JBV;
import X.KNV;
import X.L4O;
import X.L69;
import X.L6F;
import X.LNH;
import X.M9F;
import X.O6R;
import X.TBT;
import X.X1D;
import Y.IDAListenerS73S0000000_4;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ProfileAvatarAssem extends UIContentAssem {
    public L69 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public AvatarPresenter LJLJI;
    public AUA LJLJJI;
    public final C214298b3 LJLJJL;
    public InterfaceC100173wT LJLJJLL;
    public final C62822Ol8 LJLJL;
    public boolean LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    public abstract APV C3();

    public abstract AvatarPresenter E3();

    public abstract boolean L7();

    public abstract boolean isVisible();

    public abstract void v3();

    public abstract void x3();

    public ProfileAvatarAssem() {
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 738));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfilePlatformViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 739), APX.INSTANCE, null);
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 736));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 737));
    }

    public final String F3() {
        return (String) this.LJLILLLLZI.getValue();
    }

    public final ProfilePlatformViewModel H3() {
        return (ProfilePlatformViewModel) this.LJLJJL.getValue();
    }

    public final boolean SC() {
        return ((Boolean) this.LJLJLLL.getValue()).booleanValue();
    }

    public final AUA A3() {
        String str;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        C86184Xs4 c86184Xs4 = null;
        if (LIZ == null) {
            return null;
        }
        Aweme LIZIZ = LNH.LIZIZ(LIZ);
        if (LIZIZ == null || (str = LIZIZ.getGroupId()) == null) {
            str = "";
        }
        L69 l69 = this.LJLIL;
        if (l69 == null) {
            return null;
        }
        AvatarPresenter E3 = E3();
        if (E3 != null) {
            c86184Xs4 = E3.getHeadUploadHelper();
        }
        return new AUA(LIZ, l69, c86184Xs4, I3(), str);
    }

    public final User I3() {
        if (AXO.LIZ() && L7()) {
            return AccountService.LJIJ().LJFF().getCurUser();
        }
        if (C235099Kn.LIZ() && !L7()) {
            UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
            if (userProfileAbility == null) {
                return null;
            }
            return userProfileAbility.getUser();
        }
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd == null) {
            return null;
        }
        return c234999Kd.LIZ;
    }

    public final C26308AUe K3() {
        C26308AUe LIZ;
        if ((!L7() && (((Boolean) JBV.LIZIZ.getValue()).booleanValue() || ((Boolean) JBV.LIZJ.getValue()).booleanValue() || JBV.LIZJ())) || (LIZ = L6F.LIZIZ.LIZ()) == null) {
            return null;
        }
        LIZ.LIZLLL = new IDAListenerS73S0000000_4(0);
        return LIZ;
    }

    public final void N3() {
        AU9 au9;
        Object obj;
        Aweme LIZIZ;
        String groupId;
        ProfileBadgeStruct profileBadge;
        Map<EnumC53663L4h, L4O> currentActiveBusiness;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        L69 l69 = this.LJLIL;
        L4O l4o = null;
        if (l69 != null && (currentActiveBusiness = l69.getCurrentActiveBusiness()) != null) {
            l4o = currentActiveBusiness.get(EnumC53663L4h.PROFILE);
        }
        if ((l4o instanceof AU9) && (au9 = (AU9) l4o) != null && au9.LJLIL) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", F3());
            User I3 = I3();
            String str = "";
            if (I3 == null || (profileBadge = I3.getProfileBadge()) == null || (obj = profileBadge.getId()) == null) {
                obj = "";
            }
            c188727au.LJFF(obj, "badge_id");
            if (LIZ != null && (LIZIZ = LNH.LIZIZ(LIZ)) != null && (groupId = LIZIZ.getGroupId()) != null) {
                str = groupId;
            }
            c188727au.LJIIIZ("group_id", str);
            FMX.LJIIL("profile_badge_click", c188727au.LIZ);
        }
    }

    public static /* synthetic */ void M3(ProfileAvatarAssem profileAvatarAssem) {
        profileAvatarAssem.L3("click_head");
    }

    public final void L3(String str) {
        String str2;
        C188727au LIZLLL = KNV.LIZLLL(str, "enterMethod");
        User I3 = I3();
        if (I3 != null) {
            str2 = I3.getUid();
        } else {
            str2 = null;
        }
        LIZLLL.LJIIIZ("author_id", str2);
        LIZLLL.LJIIIZ("enter_from", F3());
        LIZLLL.LJIIIZ("enter_method", str);
        FMX.LJIIL("click_profile_icon", LIZLLL.LIZ);
    }

    public final void O3(User user) {
        L69 l69;
        if (user == null) {
            return;
        }
        AUA aua = this.LJLJJI;
        if (aua != null) {
            aua.LIZJ = user;
        }
        String uid = user.getUid();
        if (uid != null && (l69 = this.LJLIL) != null) {
            l69.LJ(uid, user, this);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        boolean z;
        L69 l69;
        boolean z2;
        String str;
        int i;
        int i2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLIL = (L69) view.findViewById(R.id.ach);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(' ');
        LIZ.append(hashCode());
        LIZ.append(" get lottie, ");
        if (K3() == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        L69 l692 = this.LJLIL;
        if (l692 != null) {
            AUU auu = new AUU();
            new AqS170S0100000_4(this, 1709).invoke(auu.LIZ);
            InterfaceC53590L1m<? extends AUS>[] interfaceC53590L1mArr = new InterfaceC53590L1m[2];
            if (L7() && C53582L1e.LIZIZ.LIZJ().LJIIJJI(EnumC53719L6l.PROFILE)) {
                z2 = true;
            } else {
                z2 = false;
            }
            APQ apq = new APQ(C44384HbQ.LJJZ(R.string.amv), null);
            APQ apq2 = null;
            EnterStoryParam enterStoryParam = new EnterStoryParam(null, "click_head_plus", F3(), false, false, false, false, F3(), null, null, false, new ShootExtraData(F3(), null, null, null, "click_head_plus", null, null, null, null, null, null, null, 4078, null), 1841, null);
            if (L7()) {
                str = "STORY_ENTRANCE_MINE";
            } else {
                str = "STORY_ENTRANCE_OTHER";
            }
            interfaceC53590L1mArr[0] = new AUP(new C53592L1o(null, new AqS170S0100000_4(this, 1710), null, str, new AqS154S0100000_4(this, 1276), null, Float.valueOf(0.036458332f), K3(), apq, z2, enterStoryParam, new WeakReference(C212428Vi.LIZ(this)), 101));
            boolean L7 = L7();
            if (L7()) {
                apq2 = new APQ(C44384HbQ.LJJZ(R.string.aoj), C44384HbQ.LJJZ(R.string.an4));
            }
            if (SC()) {
                i = 116;
            } else {
                i = 128;
            }
            Integer LIZJ = AnonymousClass391.LIZJ(i);
            if (SC()) {
                i2 = 56;
            } else {
                i2 = 64;
            }
            O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i2)));
            interfaceC53590L1mArr[1] = new AUO(new AUR(L7, apq2, LIZJ));
            auu.LIZ(interfaceC53590L1mArr);
            if (!L7()) {
                AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 1277);
                M9F m9f = (M9F) this.LJLJL.getValue();
                C107724Kq c107724Kq = new C107724Kq(this);
                c107724Kq.LIZIZ = EnumC112364b2.PROFILE_PAGE;
                c107724Kq.LIZLLL = F3();
                c107724Kq.LJ = "profile";
                SC();
                auu.LIZ(new AUQ(new C53526Kza(aqS154S0100000_4, m9f, c107724Kq, 7)), new AUN(new C53464Kya(), 2));
            }
            new AqS170S0100000_4(this, 1711).invoke(auu.LIZJ);
            l692.LIZJ(auu);
        }
        if (SC() && (l69 = this.LJLIL) != null) {
            ViewGroup.LayoutParams layoutParams = l69.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C7MY.LIZIZ(100);
                layoutParams.width = C7MY.LIZIZ(100);
                l69.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        v3();
        if ((AXO.LIZ() && L7()) || (C235099Kn.LIZ() && !L7())) {
            H3().sv0(new AqS170S0100000_4(this, 1712));
            ProfilePlatformViewModel H3 = H3();
            AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 1713);
            H3.getClass();
            AssemViewModel.selectSubscribe$default(H3, new TBT() { // from class: X.ATy
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PM) obj).LJLLLL;
                }
            }, null, null, null, new AqS170S0100000_4(aqS170S0100000_4, 1633), 14, null);
            return;
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9IV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZ;
            }
        }, new AqS170S0100000_4(this, 1714));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9K7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PL) obj).LJ);
            }
        }, new AqS170S0100000_4(this, 1715));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.ATx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LJII;
            }
        }, new AqS170S0100000_4(this, 1716));
    }
}
