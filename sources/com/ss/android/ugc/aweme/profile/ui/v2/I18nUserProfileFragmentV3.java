package com.ss.android.ugc.aweme.profile.ui.v2;

import X.AFB;
import X.AV1;
import X.AW2;
import X.AWU;
import X.AWX;
import X.AWY;
import X.AX6;
import X.ActivityC45651qj;
import X.C0M6;
import X.C107794Kx;
import X.C119324mG;
import X.C173376rF;
import X.C175046tw;
import X.C176956x1;
import X.C184077Kh;
import X.C188587ag;
import X.C1E4;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C221008ls;
import X.C235079Kl;
import X.C237259Sv;
import X.C237369Tg;
import X.C237409Tk;
import X.C244699iz;
import X.C25620zW;
import X.C26045AKb;
import X.C26175APb;
import X.C26335AVf;
import X.C26338AVi;
import X.C26374AWs;
import X.C28155B3f;
import X.C2U8;
import X.C30746C4w;
import X.C32151Nz;
import X.C35810E3q;
import X.C36531EVj;
import X.C36922EeM;
import X.C37179EiV;
import X.C38354F3m;
import X.C38995FSd;
import X.C3GF;
import X.C3SZ;
import X.C43I;
import X.C4LD;
import X.C53299Kvv;
import X.C53487Kyx;
import X.C54081LKj;
import X.C54082LKk;
import X.C54502LaE;
import X.C54960Lhc;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55695LtT;
import X.C56483MEt;
import X.C56484MEu;
import X.C56508MFs;
import X.C57364MfI;
import X.C57368MfM;
import X.C58397Mvx;
import X.C61102aY;
import X.C62825OlB;
import X.C62827OlD;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C77357UXp;
import X.C78685UuP;
import X.C78926UyI;
import X.C7MY;
import X.C7YQ;
import X.C81244Vua;
import X.C87058YEs;
import X.C87059YEt;
import X.C8VC;
import X.C8VV;
import X.C8W0;
import X.C9BD;
import X.C9BE;
import X.C9IH;
import X.C9IJ;
import X.C9QC;
import X.C9T4;
import X.EnumC235129Kq;
import X.EnumC87061YEv;
import X.FOH;
import X.InterfaceC235069Kk;
import X.InterfaceC55235Lm3;
import X.InterfaceC56322M8o;
import X.InterfaceC57508Mhc;
import X.InterfaceC65784Pro;
import X.MF2;
import X.MFE;
import X.O6R;
import X.QD3;
import X.QX2;
import X.U26;
import X.X1D;
import Y.ARunnableS51S0100000_15;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM;
import com.ss.android.ugc.aweme.relation.experiment.Config;
import com.ss.android.ugc.profile.platform.base.assemble.ProfileRootBaseComponent;
import com.ss.android.ugc.profile.platform.base.assemble.ProfileRootComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.avatar.business.base.IAvatarMainAbility;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAbility;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS13S0102000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.AqS44S0110000_1;
import kotlin.jvm.internal.AqS82S1100000_15;
import kotlin.jvm.internal.AqS9S2000000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes16.dex */
public final class I18nUserProfileFragmentV3 extends Hilt_I18nUserProfileFragmentV3 implements UserProfileAbility, AW2, InterfaceC56322M8o {
    public boolean LLFFF;
    public String LLFII;
    public String LLIFFJFJJ;
    public MutualStruct LLIIII;
    public String LLIIIILZ;
    public String LLIIIJ;
    public boolean LLIIIL;
    public Aweme LLIIIZ;
    public int[] LLIL;
    public boolean LLILIL;
    public boolean LLILL;
    public String LLILLIZIL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public Integer LLILZLL;
    public ProfileUser LLIZLLLIL;
    public ProfilePlatformViewModel LLJI;
    public int LLJILLL;
    public C62825OlB LLJJI;
    public final C214298b3 LLJJIII;
    public AWU LLJJIJI;
    public final Map<Integer, View> LLJJIJIIJIL = new LinkedHashMap();
    public String LLFZ = "";
    public final String LLI = "";
    public String LLII = "";
    public String LLIIJI = "";
    public String LLIIJLIL = "";
    public String LLIIL = "";
    public String LLIILII = "";
    public String LLIILZL = "";
    public String LLIIZ = "";
    public String LLILII = "";
    public boolean LLIZ = true;
    public final C87059YEt LLJ = new C87059YEt();
    public EnumC87061YEv LLJIJIL = EnumC87061YEv.LOAD_IDLE;
    public String LLJILJIL = "";
    public String LLJILJILJ = "";
    public String LLJJ = "";

    @Override // X.AW2
    public final void Hi(AWU awu) {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final int Jl() {
        return R.layout.c81;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility
    public final boolean L7() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility
    public final void LJI() {
        UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), UserAwemePagerAbility.class, null);
        if (userAwemePagerAbility != null) {
            userAwemePagerAbility.LJIIJ();
        }
        if (TextUtils.equals(this.LLIIIJ, "feed_detail") || TextUtils.equals(this.LLIIIJ, "post_mode")) {
            AWU awu = this.LLJJIJI;
            if (awu != null) {
                awu.LJI();
                return;
            }
            return;
        }
        AX6.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final boolean Nl() {
        return false;
    }

    @Override // X.AW2
    public final void Z5(String str) {
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLJJIJIIJIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return "user_profile";
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    public I18nUserProfileFragmentV3() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(UserProfileInfoVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 599);
        C87058YEs c87058YEs = C87058YEs.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS165S0100000_15, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c87058YEs, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS165S0100000_15, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c87058YEs, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJJIII = c214298b3;
    }

    @Override // X.AW2
    public final void D4() {
        mm(new User(), false, "resetUserWhenMissing");
    }

    @Override // X.AW2
    public final void LJJJJ() {
        if (!MFE.LIZIZ) {
            MFE.LIZ = "user_profile";
            C54502LaE.LIZ("user_profile");
        }
        MFE.LIZIZ = false;
        ProfilePlatformViewModel em = em();
        if (em != null) {
            em.setState(new AqS167S0100000_1(new C43I(C76800UCe.LIZ), (C43I<Boolean>) 489));
        }
    }

    public final void LLJLLIL() {
        C235079Kl.LIZ((InterfaceC235069Kk) C8VC.LIZJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class)), null, 3);
        UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), UserAwemePagerAbility.class, null);
        if (userAwemePagerAbility != null) {
            userAwemePagerAbility.LLJLLIL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[Catch: Exception -> 0x0088, TRY_LEAVE, TryCatch #0 {Exception -> 0x0088, blocks: (B:112:0x003c, B:114:0x0040, B:117:0x0048, B:119:0x004c, B:121:0x0050, B:123:0x0058, B:124:0x0060, B:22:0x006d, B:24:0x0072), top: B:111:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dm() {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV3.dm():void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("others_homepage");
        o.LJIIIIZZ(analysis, "Analysis().setLabelName(Mob.Label.OTHER_HOMEPAGE)");
        return analysis;
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        C81244Vua c81244Vua = this.LLD;
        if (c81244Vua != null) {
            return C54081LKj.LIZ(c81244Vua, this);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility
    public final void l5() {
        this.LLJIJIL = EnumC87061YEv.LOAD_IDLE;
        hm(this.LJLL);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, X.AW2
    public final void clearData() {
        super.clearData();
        ProfilePlatformViewModel em = em();
        if (em != null) {
            em.setState(new AqS167S0100000_1(new C43I(C76800UCe.LIZ), (C43I<Boolean>) 482));
        }
        this.LLJIJIL = EnumC87061YEv.LOAD_IDLE;
    }

    public final ProfilePlatformViewModel em() {
        if (!isAdded() || isDetached()) {
            return null;
        }
        return this.LLJI;
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        String str = this.LJLIL;
        if (C53299Kvv.LIZIZ() && str != null) {
            ((C0M6) C58397Mvx.LIZIZ.getValue()).LIZLLL(str);
        }
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), UserProfileAbility.class, null);
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), ProfileBaseAbility.class, null);
        String str2 = this.LJLIL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = this.LLIIJI;
        if (str4 != null) {
            str3 = str4;
        }
        C9IJ.LIZ(str2, str3, false);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C62825OlB c62825OlB;
        super.onDestroyView();
        UserProfilePreloadHelper.LJIIIIZZ().LJI();
        if (C4LD.LIZIZ.LJIILIIL() && (c62825OlB = this.LLJJI) != null) {
            c62825OlB.LIZJ();
        }
        this.LLFFF = false;
        ((LinkedHashMap) this.LLJJIJIIJIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLILIL = false;
        if (this.LLIIIL) {
            Xl();
        }
        C62825OlB.LJLLILLLL = false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        User user = this.LJLL;
        if (user != null && user.isLive()) {
            km(false);
        }
        C62825OlB.LJLLILLLL = true;
        C237259Sv.LIZIZ(System.currentTimeMillis(), "page_on_resume_complete_time");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C54960Lhc.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility
    public final C87059YEt Qd() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility
    public final User getUser() {
        return this.LJLL;
    }

    @Override // X.AW2
    public final void LJJIJ(String str) {
        UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), UserAwemePagerAbility.class, null);
        if (userAwemePagerAbility != null) {
            userAwemePagerAbility.LJJIJ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility
    public final void LJJLJLI(User user) {
        String str = this.LLFII;
        if (str != null && user != null) {
            user.setRequestId(str);
        }
        this.LJLL = user;
        ProfilePlatformViewModel em = em();
        if (em != null) {
            em.LJLJJI = this.LJLL;
        }
    }

    @Override // X.AW2
    public final void LJJLL(String str) {
        this.LLJILJILJ = this.LLJILJIL;
    }

    @Override // X.AW2
    public final void LLII(String str) {
        this.LLIIJLIL = str;
        this.LLJ.LJIIJ = str;
    }

    @Override // X.AW2
    public final void LLJI(String str) {
        this.LLIIJI = str;
        this.LLJ.LJIILJJIL = str;
        UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), UserAwemePagerAbility.class, null);
        if (userAwemePagerAbility != null) {
            userAwemePagerAbility.LLJI(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility
    public final void M4(int i) {
        boolean z;
        int i2;
        IMUser fromUser;
        User user = this.LJLL;
        if (user == null) {
            return;
        }
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        user.setBlock(z);
        C26045AKb c26045AKb = new C26045AKb(this);
        Resources resources = getResources();
        if (i == 1) {
            i2 = R.string.bnl;
        } else {
            i2 = R.string.tci;
        }
        c26045AKb.LJIIIZ(resources.getString(i2));
        c26045AKb.LJIIJ();
        if (i == 1) {
            this.LJLL.setFollowStatus(0);
            if (isViewValid()) {
                ProfilePlatformViewModel em = em();
                if (em != null) {
                    em.setState(new AqS167S0100000_1(new C43I(C76800UCe.LIZ), (C43I<Boolean>) 483));
                }
                this.LLJIJIL = EnumC87061YEv.LOAD_IDLE;
            }
            C175046tw c175046tw = new C175046tw();
            c175046tw.LJLIL = this.LJLL;
            C2U8.LIZ(c175046tw);
            User user2 = this.LJLL;
            if (user2 != null) {
                String uid = user2.getUid();
                o.LJIIIIZZ(uid, "it.uid");
                C2U8.LIZ(new C28155B3f(uid));
            }
        } else {
            C7YQ c7yq = new C7YQ();
            c7yq.LJLIL = this.LJLL;
            C2U8.LIZ(c7yq);
            LLJLLIL();
        }
        C3GF imUserService = IMService.createIIMServicebyMonsterPlugin(false).getImUserService();
        User user3 = this.LJLL;
        if (user3 == null) {
            fromUser = null;
        } else {
            fromUser = IMUser.fromUser(user3);
        }
        imUserService.LJIIZILJ(fromUser);
        User mUser = this.LJLL;
        o.LJIIIIZZ(mUser, "mUser");
        mm(mUser, false, "");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final void Ml(View view) {
        o.LJIIIZ(view, "view");
        super.Ml(view);
        ProfileUser profileUser = C237409Tk.LIZIZ;
        int i = 0;
        if (profileUser == null) {
            C237409Tk.LIZ("load_page_model_init_view", false);
            profileUser = C237409Tk.LIZIZ;
        }
        lm("init_update_component_tree", profileUser, view);
        fm(view);
        if (C26374AWs.LIZ() != null) {
            Config LIZ = C26374AWs.LIZ();
            if (LIZ != null && LIZ.recommendFriendsInOthersProfilePage == 1) {
                i = 1;
            }
            C26335AVf.LJIJI(i);
        }
        view.post(new Runnable() { // from class: X.9T7
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                C176946x0 c176946x0;
                try {
                    C176956x1 c176956x1 = MF2.LIZ;
                    if (c176956x1 != null && (c176946x0 = c176956x1.LIZ) != null) {
                        c176946x0.LJIIIIZZ = System.currentTimeMillis();
                    }
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }

    @Override // X.AW2
    public final void W0(String str) {
        this.LLIFFJFJJ = str;
        this.LLJ.LJ = str;
    }

    public final void cm(String str) {
        ActivityC45651qj mo49getActivity;
        Aweme aweme;
        String str2;
        String str3;
        String str4;
        if (!C61102aY.LIZ || !this.LLIZ || (mo49getActivity = mo49getActivity()) == null || (aweme = C3SZ.LIZ(mo49getActivity).LJLJLLL) == null) {
            return;
        }
        String aid = aweme.getAid();
        Aweme aweme2 = this.LLIIIZ;
        String str5 = null;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        if (o.LJ(aid, str2)) {
            String secAuthorUid = aweme.getSecAuthorUid();
            Aweme aweme3 = this.LLIIIZ;
            if (aweme3 != null) {
                str4 = aweme3.getSecAuthorUid();
            } else {
                str4 = null;
            }
            if (o.LJ(secAuthorUid, str4)) {
                return;
            }
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("I18nUserProfileFragmentV2: ", str, " invalid aweme, aid: ");
        Aweme aweme4 = this.LLIIIZ;
        if (aweme4 != null) {
            str3 = aweme4.getAid();
        } else {
            str3 = null;
        }
        LIZIZ.append(str3);
        LIZIZ.append(", aweme_secUid: ");
        Aweme aweme5 = this.LLIIIZ;
        if (aweme5 != null) {
            str5 = aweme5.getSecAuthorUid();
        }
        LIZIZ.append(str5);
        LIZIZ.append(", secUid: ");
        LIZIZ.append(this.LJLILLLLZI);
        LIZIZ.append("; homepage_aid: ");
        LIZIZ.append(aweme.getAid());
        LIZIZ.append(", homepage_secUid: ");
        LIZIZ.append(aweme.getSecAuthorUid());
        C36922EeM.LIZLLL(4, "feed2profile", X1D.LIZIZ(LIZIZ));
    }

    public final void fm(View view) {
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        int LIZIZ = C7MY.LIZIZ(4);
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        View findViewById = view.findViewById(R.id.g5l);
        View findViewById2 = view.findViewById(R.id.d2i);
        C119324mG c119324mG = (C119324mG) view.findViewById(R.id.mz2);
        View findViewById3 = view.findViewById(R.id.y1);
        if (findViewById != null) {
            C26338AVi.LJI(findViewById, null, Integer.valueOf(LJJIIZ), null, null, false, 29);
        }
        if (findViewById2 != null) {
            C26338AVi.LJI(findViewById2, null, Integer.valueOf(LJJIIZ), null, null, false, 29);
        }
        if (c119324mG != null) {
            C26338AVi.LJIIIZ(c119324mG, null, Integer.valueOf(LIZIZ), null, null, 29);
            c119324mG.setExpectedEmptyHeightPx(LJJIIZ);
        }
        if (findViewById3 != null) {
            C26338AVi.LJIIIZ(findViewById3, Integer.valueOf(LJJIIZ2), null, Integer.valueOf(LJJIIZ2), null, 26);
        }
    }

    public final void hm(User user) {
        if (this.LLILIL) {
            if (this.LLILL) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("hasReportedAfterResume: ");
                LIZ.append(this.LLILIL);
                LIZ.append(", hasReportedAfterVisible: ");
                U26.LIZLLL(LIZ, this.LLILL, LIZ, "I18nUserProfileFragmentV2");
                return;
            }
            if (!this.LLILL) {
                this.LLILL = true;
            }
        } else {
            this.LLILIL = true;
        }
        C26335AVf.LJJIIJ(user, this.LLJILJIL, this.LLJILJILJ);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility
    public final void iM(String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        ProfileUser profileUser = this.LLIZLLLIL;
        View pageView = this.LJLJI;
        o.LJIIIIZZ(pageView, "pageView");
        lm(enterMethod, profileUser, pageView);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2
    public final void initView(View view) {
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(view, "view");
        super.initView(view);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLIIIILZ = arguments.getString("unique_id", "");
            this.LLIIIJ = arguments.getString("profile_from", "");
            this.LLJILJIL = arguments.getString("enter_from", "");
            this.LLJILJILJ = arguments.getString("enter_method", "");
            this.LLFZ = arguments.getString("from_discover", "");
            String string = arguments.getString("show_window_source");
            if (string == null) {
                string = "";
            }
            this.LLJJ = string;
            String string2 = arguments.getString("search_request_id");
            if (string2 == null) {
                string2 = "";
            }
            this.LLFII = string2;
            String string3 = arguments.getString("room_id", "");
            this.LLIIL = string3;
            this.LLJ.LJIIJJI = string3;
            this.LLIILZL = arguments.getString("return_live", "");
            String string4 = arguments.getString("source_content_id", "");
            this.LLIIZ = string4;
            this.LLJ.LJIIL = string4;
            this.LLIL = arguments.getIntArray("traffic_source_list");
            String string5 = arguments.getString("trackParams");
            if (string5 == null) {
                string5 = "";
            }
            this.LLILII = string5;
            int[] iArr = this.LLIL;
            if (iArr != null && iArr.length != 0) {
                this.LLIL = iArr;
                this.LLJ.LJIILL = iArr;
                ProfilePlatformViewModel em = em();
                if (em != null) {
                    em.setState(new AqS170S0100000_4(iArr, 1637));
                }
            }
            if (!TextUtils.isEmpty(this.LLIIZ)) {
                String str = this.LLIIZ;
                this.LLIIZ = str;
                this.LLJ.LJIIL = str;
            }
            if (!TextUtils.isEmpty(this.LLIIL)) {
                String str2 = this.LLIIL;
                this.LLIIL = str2;
                this.LLJ.LJIIJJI = str2;
            }
            if (!C38354F3m.LJ(this.LLFZ)) {
                setPreviousPage(this.LLFZ);
            }
            if (!TextUtils.isEmpty(this.LLJILJIL)) {
                LLII(this.LLJILJIL);
            }
            if (!TextUtils.isEmpty(this.LLI)) {
                setPreviousPage(this.LLI);
            }
            if (TextUtils.equals(this.LLJILJIL, "discovery_tab")) {
                setPreviousPage("discovery_tab");
            }
            if (TextUtils.equals(this.LLJILJIL, "scan")) {
                setPreviousPage(this.LLJILJIL);
            }
            if (TextUtils.equals(this.LLJILJIL, "prop_page")) {
                setPreviousPage(this.LLJILJIL);
            }
            if (!TextUtils.isEmpty(this.LLJJ)) {
                this.LLJ.LJIILIIL = this.LLJJ;
            }
            if (!TextUtils.isEmpty(this.LLILII)) {
                String str3 = this.LLILII;
                this.LLILII = str3;
                this.LLJ.LJIILLIIL = str3;
                String optString = new JSONObject(this.LLILII).optString("rfevent_previous_page");
                if (optString == null) {
                    optString = "";
                }
                this.LLII = optString;
            }
            Serializable serializable = arguments.getSerializable("extra_mutual_relation");
            if (serializable instanceof MutualStruct) {
                this.LLIIII = (MutualStruct) serializable;
            }
            W0(arguments.getString("extra_previous_page_position", "other_places"));
            if (C78685UuP.LJJJZ(this.LLIFFJFJJ)) {
                W0(this.LLIFFJFJJ);
            }
            String string6 = arguments.getString("source_page");
            this.LLILLJJLI = string6;
            if (C78685UuP.LJJJZ(string6)) {
                String str4 = this.LLILLJJLI;
                this.LLILLJJLI = str4;
                this.LLJ.LJFF = str4;
            }
            String string7 = arguments.getString("now_card_type");
            this.LLILLL = string7;
            if (C78685UuP.LJJJZ(string7)) {
                String str5 = this.LLILLL;
                this.LLILLL = str5;
                this.LLJ.LJI = str5;
            }
            String string8 = arguments.getString("is_now_clear");
            this.LLILZ = string8;
            if (C78685UuP.LJJJZ(string8)) {
                String str6 = this.LLILZ;
                this.LLILZ = str6;
                this.LLJ.LJII = str6;
            }
            String string9 = arguments.getString("now_type");
            this.LLILZIL = string9;
            if (C78685UuP.LJJJZ(string9)) {
                String str7 = this.LLILZIL;
                this.LLILZIL = str7;
                this.LLJ.LJIIIIZZ = str7;
            }
            Integer valueOf = Integer.valueOf(arguments.getInt("has_small_window"));
            this.LLILZLL = valueOf;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                this.LLILZLL = Integer.valueOf(intValue);
                this.LLJ.LJIIIZ = Integer.valueOf(intValue);
            }
            if (TextUtils.isEmpty(this.LJLIL)) {
                this.LJLIL = arguments.getString("uid", "");
            }
            if (TextUtils.isEmpty(this.LJLILLLLZI)) {
                this.LJLILLLLZI = arguments.getString("sec_user_id", "");
            }
            if (C78685UuP.LJJJZ(this.LLIIJI)) {
                LLJI(this.LLIIJI);
            }
            if (C78685UuP.LJJJZ(this.LLJILJILJ)) {
                String str8 = this.LLJILJILJ;
                this.LLJ.LJIIZILJ = str8;
                ProfilePlatformViewModel em2 = em();
                if (em2 != null) {
                    em2.setState(new AqS29S1000000_4(str8, 44));
                }
            }
            ProfilePlatformViewModel em3 = em();
            if (em3 != null) {
                em3.setState(new AqS9S2000000_4(this.LJLIL, this.LJLILLLLZI, 4));
            }
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.LJLLL;
            if (analysisStayTimeFragmentComponent != null) {
                analysisStayTimeFragmentComponent.LJLJJI = new C56508MFs(this);
            }
            if (C4LD.LIZIZ.LJIILIIL() && (mo49getActivity = mo49getActivity()) != null) {
                this.LLJJI = C62827OlD.LIZ("others_homepage", mo49getActivity, this);
            }
        }
        AFB.LIZ(this);
        ProfileViewModel profileViewModel = this.LJLLLL;
        String str9 = this.LLJILJIL;
        profileViewModel.getClass();
        profileViewModel.setState(new AqS29S1000000_4(str9, 25));
    }

    public final void km(boolean z) {
        if (C55695LtT.LIZ) {
            if (C36531EVj.LJI) {
                C35810E3q.LJ(5000L);
            }
            C35810E3q.LJFF(5000L);
        }
        EnumC87061YEv enumC87061YEv = this.LLJIJIL;
        if (enumC87061YEv == EnumC87061YEv.LOAD_DONE) {
            IAvatarMainAbility iAvatarMainAbility = (IAvatarMainAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), IAvatarMainAbility.class, null);
            if (iAvatarMainAbility != null) {
                iAvatarMainAbility.ec0(this.LJLIL);
            }
            if (!z) {
                C54502LaE.LIZLLL(MFE.LIZ, null, 6);
                return;
            }
            return;
        }
        EnumC87061YEv enumC87061YEv2 = EnumC87061YEv.LOAD_ING;
        if (enumC87061YEv == enumC87061YEv2) {
            return;
        }
        if (C55695LtT.LIZLLL) {
            LJJJJ();
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("is_first_time")) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.remove("is_first_time");
            }
        } else {
            MF2.LIZ(new C1E4(), this.LLI);
            C173376rF c173376rF = new C173376rF();
            String str = this.LLI;
            if (str == null) {
                str = this.LLJILJIL;
            }
            C56483MEt.LIZ(c173376rF, str, false, "homepage_other_profile");
        }
        ProfilePlatformViewModel em = em();
        if (em != null) {
            em.setState(new AqS167S0100000_1(new C43I(C76800UCe.LIZ), (C43I<Boolean>) 490));
        }
        if (!TextUtils.isEmpty(this.LJLIL) || !TextUtils.isEmpty(this.LLIIIILZ)) {
            cm("setUserData");
            InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
            if (interfaceC235069Kk != null) {
                interfaceC235069Kk.hh(this.LLJILLL, EnumC235129Kq.CHANGE_TAB);
            }
            this.LJLLJ = -1;
            this.LLJIJIL = enumC87061YEv2;
        } else if (C9T4.LIZIZ(this.LLIIIZ)) {
            C221008ls.LIZJ(null);
        }
        if (C55695LtT.LIZIZ) {
            C37179EiV.LJFF.postDelayed(new ARunnableS51S0100000_15(this, 41), 2000L);
        } else {
            String str2 = this.LJLIL;
            if (str2 == null) {
                str2 = "";
            }
            C26335AVf.LJIJ(str2, "request");
        }
    }

    @Override // X.AW2
    public final void ok(int i) {
        this.LLJILLL = 10;
    }

    @Override // X.AW2
    public final void ol(Aweme aweme) {
        User user;
        if (!isViewValid()) {
            return;
        }
        this.LLIIIZ = aweme;
        this.LLJ.LIZJ = aweme;
        ProfilePlatformViewModel em = em();
        if (em != null) {
            em.setState(new AqS170S0100000_4(aweme, 1635));
        }
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        this.LJLLI = AV1.LJIIZILJ(user, false);
        this.LLIIII = C188587ag.LIZIZ(aweme);
        setPreviousPage(this.LLI);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        ProfilePlatformViewModel em = em();
        if (em != null) {
            em.LJLJI = LIZJ;
        }
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 qx2) {
        String str;
        if (qx2 != null && (str = qx2.LJLIL) != null) {
            if (s.LJJJLZIJ(str, "/aweme/v1/user/profile/other/?", false) || s.LJJJLZIJ(str, "/aweme/v1/aweme/post/?", false) || s.LJJJLZIJ(str, "/aweme/v1/aweme/favorite/?", false)) {
                EventBus.LIZJ().LIZIZ(qx2);
                LLJLLIL();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.Hilt_I18nUserProfileFragmentV3, com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        if (C78685UuP.LJJJZ(this.LLI)) {
            setPreviousPage(this.LLI);
        }
        if (C78685UuP.LJJJZ(this.LLIFFJFJJ)) {
            W0(this.LLIFFJFJJ);
        }
        if (C78685UuP.LJJJZ(this.LLILLJJLI)) {
            String str = this.LLILLJJLI;
            this.LLILLJJLI = str;
            this.LLJ.LJFF = str;
        }
        if (C78685UuP.LJJJZ(this.LLILLL)) {
            String str2 = this.LLILLL;
            this.LLILLL = str2;
            this.LLJ.LJI = str2;
        }
        if (C78685UuP.LJJJZ(this.LLILZ)) {
            String str3 = this.LLILZ;
            this.LLILZ = str3;
            this.LLJ.LJII = str3;
        }
        if (C78685UuP.LJJJZ(this.LLILZIL)) {
            String str4 = this.LLILZIL;
            this.LLILZIL = str4;
            this.LLJ.LJIIIIZZ = str4;
        }
        Integer num = this.LLILZLL;
        if (num != null) {
            int intValue = num.intValue();
            this.LLILZLL = Integer.valueOf(intValue);
            this.LLJ.LJIIIZ = Integer.valueOf(intValue);
        }
        if (C78685UuP.LJJJZ(this.LLIIJLIL)) {
            LLII(this.LLIIJLIL);
        }
        if (C78685UuP.LJJJZ(this.LLIIJI)) {
            LLJI(this.LLIIJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String str;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfilePlatformViewModel.class);
        this.LLJI = (ProfilePlatformViewModel) new C214298b3(LIZ, new AqS154S0100000_4(LIZ, 708), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C9QC.INSTANCE, (InterfaceC65784Pro) null, 384).getValue();
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, UserProfileAbility.class, null);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, ProfileBaseAbility.class, null);
        MFE.LIZ = "new_user_profile";
        MFE.LIZIZ = true;
        C237259Sv.LJIIIIZZ = "other";
        C54502LaE.LIZ(MFE.LIZ);
        String str2 = "";
        if (TextUtils.isEmpty(this.LJLIL)) {
            if (bundle == null || (str = bundle.getString("uid")) == null) {
                str = "";
            }
            this.LJLIL = str;
        }
        if (TextUtils.isEmpty(this.LJLILLLLZI)) {
            if (bundle != null && (string = bundle.getString("sec_user_id")) != null) {
                str2 = string;
            }
            this.LJLILLLLZI = str2;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLIZ = arguments.getBoolean("is_response_home_feed_scroll");
        }
        C53487Kyx.LIZIZ(AWY.PERSONAL_DETAIL);
        ((Number) FOH.LIZ.getValue()).intValue();
        C237259Sv.LIZIZ(System.currentTimeMillis(), "page_on_create_complete_time");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        outState.putString("uid", this.LJLIL);
        outState.putString("sec_user_id", this.LJLILLLLZI);
        super.onSaveInstanceState(outState);
    }

    @QD3
    public final void onShareCompleteEvent(C107794Kx event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLJJL, "others_homepage") && !C62825OlB.LJLLJ && !o.LJ(event.LJLJJI, "video_sticker")) {
            if (mo49getActivity() != null && this.LJLLILLLL != null) {
                C62825OlB.LJLLJ = true;
                IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(mo49getActivity(), this.LJLLILLLL, event);
                return;
            }
            return;
        }
        if (!o.LJ(event.LJLJJL, "others_homepage") || !o.LJ(event.LJLJJI, "video_sticker") || mo49getActivity() == null || this.LJLLILLLL == null) {
            return;
        }
        IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(mo49getActivity(), this.LJLLILLLL, event);
    }

    @QD3
    public final void onUpdateUserEvent(AWX awx) {
        if (awx != null && awx.LJLIL != null && TextUtils.equals(awx.LJLIL.getUid(), this.LJLIL)) {
            User user = awx.LJLIL;
            o.LJIIIIZZ(user, "event.user");
            mm(user, false, "");
        }
    }

    @Override // X.AW2
    public final void q5(Aweme aweme) {
        if (aweme != null && !TextUtils.equals(this.LJLIL, aweme.getAuthorUid())) {
            clearData();
            ye(aweme.getAuthorUid(), aweme.getAuthor().getSecUid());
            ol(aweme);
            bg(aweme.getAuthor(), 2);
            km(false);
        }
    }

    @Override // X.AW2
    public final void setPreviousPage(String str) {
        HashMap<String, String> mobParams;
        String str2;
        Aweme aweme = this.LLIIIZ;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null && (str2 = mobParams.get("previous_page")) != null) {
            str = str2;
        }
        this.LLJ.LIZLLL = str;
    }

    @Override // X.AW2
    public final void setVisible(boolean z) {
        this.LLIIIL = z;
        setUserVisibleHint(z);
        if (!z) {
            String str = this.LJLIL;
            this.LLILLIZIL = str;
            this.LLILL = false;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = this.LLIIJI;
            if (str3 != null) {
                str2 = str3;
            }
            C9IJ.LIZ(str, str2, false);
            C62825OlB.LJLLILLLL = false;
            this.LLFFF = false;
        }
        ProfilePlatformViewModel em = em();
        if (em != null) {
            em.setState(new AqS44S0110000_1(z, (boolean) new C43I(Boolean.valueOf(z)), (C43I<Boolean>) 9));
        }
        if (z) {
            String str4 = this.LLILLIZIL;
            if (str4 != null && str4.equals(this.LJLIL)) {
                hm(this.LJLL);
            }
            String mUserId = this.LJLIL;
            o.LJIIIIZZ(mUserId, "mUserId");
            C62827OlD.LIZIZ(mUserId, "others_homepage");
            Wl();
            if (C30746C4w.LIZ()) {
                C38995FSd.LIZLLL().execute(new ARunnableS51S0100000_15(this, 122));
            } else {
                dm();
            }
        } else {
            Xl();
            C176956x1 c176956x1 = MF2.LIZ;
            if (c176956x1 != null) {
                c176956x1.LIZJ(2, "homepage_other_profile_info", true);
            }
            C176956x1 c176956x12 = C56484MEu.LIZ;
            if (c176956x12 != null) {
                c176956x12.LIZJ(2, "homepage_other_aweme_post", true);
            }
        }
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.LJLLL;
        if (analysisStayTimeFragmentComponent != null) {
            analysisStayTimeFragmentComponent.LJLJI = z;
            if (z) {
                analysisStayTimeFragmentComponent.LJLIL = System.currentTimeMillis();
            } else {
                analysisStayTimeFragmentComponent.LIZIZ();
            }
        }
    }

    @Override // X.AW2
    public final /* bridge */ /* synthetic */ void sf(Boolean bool) {
        km(bool.booleanValue());
    }

    @Override // X.AW2
    public final void x6(boolean z) {
        UserAwemePagerAbility userAwemePagerAbility = (UserAwemePagerAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), UserAwemePagerAbility.class, null);
        if (userAwemePagerAbility != null) {
            userAwemePagerAbility.Z(z, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility
    public final void Pe0(User user, EnumC235129Kq action) {
        o.LJIIIZ(action, "action");
        if (user == null) {
            return;
        }
        mm(user, false, action.name());
    }

    @Override // X.AW2
    public final void bg(User user, int i) {
        String uid;
        if (user != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putString("uid", user.getUid());
            }
            UserProfilePreloadHelper.LJIIIIZZ().LIZJ(user);
        }
        if (!isViewValid()) {
            return;
        }
        String str = "";
        if (user != null && this.LJLLLL != null) {
            this.LLIZLLLIL = C237369Tg.LIZ(user.getUid());
            LJJLJLI(user);
            InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
            if (interfaceC235069Kk != null) {
                C235079Kl.LIZIZ(interfaceC235069Kk, user, null, true, 2);
            }
            iM("");
        }
        if (C77357UXp.LJJIIJZLJL()) {
            InterfaceC57508Mhc interfaceC57508Mhc = (InterfaceC57508Mhc) C8VC.LJI(this, C65352Pkq.LIZ(InterfaceC57508Mhc.class));
            if (interfaceC57508Mhc != null) {
                interfaceC57508Mhc.Se();
            }
        } else {
            C37179EiV.LIZ().post(new ARunnableS51S0100000_15(this, 40));
        }
        if (user != null && (uid = user.getUid()) != null) {
            str = uid;
        }
        C26335AVf.LJIJ(str, "simple");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r6 != null) goto L22;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oc0(com.ss.android.ugc.aweme.profile.model.User r5, com.ss.android.ugc.profile.platform.base.data.ProfileUser r6) {
        /*
            r4 = this;
            boolean r0 = r4.isViewValid()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = X.C9NI.LIZ()
            if (r0 == 0) goto L24
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r3 = r4.em()
            if (r3 == 0) goto L24
            X.43I r2 = new X.43I
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.<init>(r0)
            kotlin.jvm.internal.AqS167S0100000_1 r1 = new kotlin.jvm.internal.AqS167S0100000_1
            r0 = 481(0x1e1, float:6.74E-43)
            r1.<init>(r2, r0)
            r3.setState(r1)
        L24:
            X.YEv r0 = X.EnumC87061YEv.LOAD_DONE
            r4.LLJIJIL = r0
            r4.LJLL = r5
            r4.LLIZLLLIL = r6
            if (r5 == 0) goto L35
            com.ss.android.ugc.aweme.friends.model.MutualStruct r0 = r4.LLIIII
            if (r0 == 0) goto L35
            r5.setMutualStruct(r0)
        L35:
            r2 = 0
            if (r6 == 0) goto L80
            com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo r0 = r6.common
            if (r0 == 0) goto L80
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r0.getUserProfileInfo()
            if (r0 == 0) goto L80
            java.lang.String r1 = r0.getUid()
        L46:
            com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo r0 = r6.common
            if (r0 == 0) goto L54
            com.ss.android.ugc.profile.platform.base.data.UserProfileInfo r0 = r0.getUserProfileInfo()
            if (r0 == 0) goto L54
            java.lang.String r2 = r0.getSecUid()
        L54:
            r4.ye(r1, r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = r4.LJLL
            r4.hm(r0)
            java.lang.String r1 = r4.LJLIL
            if (r1 != 0) goto L62
            java.lang.String r1 = ""
        L62:
            java.lang.String r0 = "others_homepage"
            X.C62827OlD.LIZIZ(r1, r0)
            boolean r0 = X.C30746C4w.LIZ()
            if (r0 == 0) goto L7c
            java.util.concurrent.ExecutorService r2 = X.C38995FSd.LIZLLL()
            Y.ARunnableS51S0100000_15 r1 = new Y.ARunnableS51S0100000_15
            r0 = 122(0x7a, float:1.71E-43)
            r1.<init>(r4, r0)
            r2.execute(r1)
        L7b:
            return
        L7c:
            r4.dm()
            goto L7b
        L80:
            r1 = r2
            if (r6 == 0) goto L54
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV3.oc0(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.profile.platform.base.data.ProfileUser):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x013c, code lost:
    
        if (r3 != null) goto L64;
     */
    @Override // com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV3.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AW2
    public final void ye(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        C87059YEt c87059YEt = this.LLJ;
        c87059YEt.LIZ = str;
        c87059YEt.LIZIZ = str2;
        ProfilePlatformViewModel em = em();
        if (em != null) {
            em.setState(new AqS9S2000000_4(str, str2, 4));
        }
    }

    public final void lm(String str, ProfileUser profileUser, View view) {
        C26175APb c26175APb;
        C57364MfI c57364MfI;
        HashMap hashMap;
        String str2;
        String string;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        C237259Sv.LIZ(str, profileUser);
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(this);
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof ProfileRootComponent) {
                    ((ProfileRootBaseComponent) next).K3(profileUser);
                    return;
                }
            }
        }
        ProfilePlatformViewModel em = em();
        if (em != null) {
            em.LJLJJL = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle arguments = getArguments();
        if (arguments != null) {
            String str3 = null;
            if (arguments.getSerializable("recommend_enter_profile_params") instanceof C57364MfI) {
                Serializable serializable = arguments.getSerializable("recommend_enter_profile_params");
                o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.recommend.RecommendEnterProfileParams");
                c57364MfI = (C57364MfI) serializable;
            } else {
                c57364MfI = null;
            }
            String str4 = "";
            C57368MfM c57368MfM = new C57368MfM(arguments.getString("request_id", ""), arguments.getString("room_id", ""), arguments.getString("room_owner_id", ""), arguments.getString("user_type", ""), arguments.getString("enter_from", ""), c57364MfI, arguments.getString("position", ""));
            Bundle bundle = arguments.getBundle("bundle");
            int i = arguments.getInt("general_search_card_type", 0);
            boolean z = arguments.getBoolean("extra_from_mutual", false);
            boolean z2 = arguments.getBoolean("isFromFeed", true);
            String string2 = arguments.getString("event_keys");
            if (string2 == null) {
                string2 = "";
            }
            boolean z3 = arguments.getBoolean("sticky_content", false);
            String string3 = arguments.getString("notice_type");
            Serializable serializable2 = arguments.getSerializable("inbox_log_extra");
            if (serializable2 instanceof HashMap) {
                hashMap = (HashMap) serializable2;
            } else {
                hashMap = null;
            }
            String string4 = arguments.getString("extra_previous_page");
            if (string4 == null) {
                string4 = "";
            }
            if (bundle != null && (string = bundle.getString("conversation_id")) != null) {
                str4 = string;
            }
            if (!C38354F3m.LJ(this.LLIIL) && C38354F3m.LIZJ("live", this.LLJILJIL) && C38354F3m.LIZJ(this.LLIILZL, "1")) {
                str2 = this.LLIIL;
            } else {
                str2 = null;
            }
            if (!C38354F3m.LJ(this.LLIILII) && C38354F3m.LIZJ("live", this.LLJILJIL) && C38354F3m.LIZJ(this.LLIILZL, "1")) {
                str3 = this.LLIILII;
            }
            c26175APb = new C26175APb(this.LJLJJLL, z2, this.LLJILJIL, this.LLJILJILJ, this.LLII, this.LLIIIJ, z, c57368MfM, i, string2, z3, string3, hashMap, str2, str3, str4, string4);
        } else {
            c26175APb = new C26175APb(this.LJLJJLL, this.LLJILJIL, this.LLII, this.LLIIIJ, 131018);
        }
        C8VV.LIZ(this, false, new C9IH(this, view, currentTimeMillis, profileUser, c26175APb));
    }

    public final void mm(User user, boolean z, String str) {
        ProfileUser profileUser;
        LJJLJLI(user);
        InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
        if (interfaceC235069Kk != null) {
            C235079Kl.LIZIZ(interfaceC235069Kk, user, null, z, 2);
        }
        try {
            profileUser = C244699iz.LJIIIZ(user, this.LLIZLLLIL, false, new AqS82S1100000_15(this, str, 2));
        } catch (Exception e) {
            C237259Sv.LJ(e, C244699iz.LIZIZ);
            profileUser = C237409Tk.LIZ;
        }
        this.LLIZLLLIL = profileUser;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ProfilePlatformViewModel em = em();
        if (em != null) {
            em.setState(new AqS13S0102000_4(i, i2, intent, 4));
        }
    }
}
