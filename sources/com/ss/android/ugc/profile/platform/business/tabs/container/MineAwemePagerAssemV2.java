package com.ss.android.ugc.profile.platform.business.tabs.container;

import X.C0F0;
import X.C10K;
import X.C181627Aw;
import X.C212428Vi;
import X.C213688a4;
import X.C221108m2;
import X.C234999Kd;
import X.C237259Sv;
import X.C26154AOg;
import X.C26335AVf;
import X.C47704Ins;
import X.C50420Jqa;
import X.C50652JuK;
import X.C53012KrI;
import X.C55096Ljo;
import X.C55749LuL;
import X.C5H3;
import X.C62646OiI;
import X.C65352Pkq;
import X.C72027SOp;
import X.C78966Uyw;
import X.C78983UzD;
import X.C87083YFr;
import X.C8VC;
import X.C8YN;
import X.C9IB;
import X.C9KV;
import X.C9PB;
import X.C9PL;
import X.C9PM;
import X.CallableC43260GyO;
import X.HG3;
import X.InterfaceC234089Gq;
import X.InterfaceC235069Kk;
import X.InterfaceC36571c5;
import X.InterfaceC87073YFh;
import X.InterfaceC87086YFu;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.QD3;
import X.RBX;
import X.T6H;
import X.TBT;
import X.VW9;
import X.YFG;
import X.YFI;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.CollectProfileListFragment;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.model.BATab;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.ShopTab;
import com.ss.android.ugc.aweme.profile.model.StickerTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.stickerstore.fragment.StickerStoreProfileListFragment;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class MineAwemePagerAssemV2 extends AwemePagerAssemV2 implements InterfaceC87086YFu, InterfaceC234089Gq {
    public static final C87083YFr LLIZLLLIL = new C87083YFr();
    public boolean LLIIL;
    public YFI LLIILZL;
    public ProfileListFragment LLIIZ;
    public YFI LLIL;
    public YFI LLILII;
    public CollectProfileListFragment LLILIL;
    public StickerStoreProfileListFragment LLILL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public Integer LLILZIL;
    public boolean LLILZLL;
    public Map<Integer, View> LLIZ = new LinkedHashMap();
    public boolean LLIIJLIL = true;
    public final C55749LuL LLIILII = new C55749LuL(C47704Ins.LJ(this, C9IB.class, "profile_tab"), checkSupervisorPrepared());
    public final C5H3 LLILLIZIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 687));

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public boolean P4() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public void _$_clearFindViewByIdCache() {
        this.LLIZ.clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLIZ;
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

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2, X.InterfaceC238569Xw, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // X.InterfaceC234089Gq
    public void updateIndexAtContainer(int i) {
    }

    private final Bundle e6() {
        Bundle bundle = new Bundle();
        String eventType = getEventType();
        if (eventType == null) {
            eventType = "personal_homepage";
        }
        bundle.putString("enter_from", eventType);
        bundle.putString("page_name", "personal_homepage");
        bundle.putString("entrance_type", "showcase_list");
        bundle.putString("previous_page", e4());
        User user = getUser();
        if (user != null) {
            bundle.putString("sec_user_id", user.getSecUid());
            bundle.putString("author_id", user.getUid());
            bundle.putBoolean("is_my_profile", true);
            bundle.putInt("follow_status", user.getFollowStatus());
        }
        return bundle;
    }

    private final C9IB<ProfileComponents> g4() {
        return (C9IB) this.LLIILII.getValue();
    }

    private final AssemViewModel<C181627Aw> g6() {
        return (AssemViewModel) this.LLILLIZIL.getValue();
    }

    @Override // X.InterfaceC87086YFu
    public void LLLIILIL() {
        Fragment fragment;
        List<ProfileListFragment> list = this.LJLJJL;
        if (list != null && list.size() > 0) {
            T6H<ProfileListFragment> t6h = this.LJLJLJ;
            ArrayList<Aweme> arrayList = null;
            Object obj = null;
            if (t6h != null) {
                fragment = t6h.LJJIIJZLJL();
            } else {
                fragment = null;
            }
            if (fragment instanceof YFI) {
                T6H<ProfileListFragment> t6h2 = this.LJLJLJ;
                if (t6h2 != null) {
                    obj = t6h2.LJJIIJZLJL();
                }
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.IAwemeListFragment");
                arrayList = ((YFI) obj).LLLIIIL();
            }
            C78966Uyw.LJLJJL = arrayList;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public void T4() {
        YFI yfi = this.LLIL;
        if (yfi != null) {
            yfi.af();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public User getUser() {
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            return c234999Kd.LIZ;
        }
        return null;
    }

    public final boolean k6() {
        Integer num;
        MusicTabInfo musicTabInfo;
        MusicTabClaimInfo musicTabClaimInfo;
        MusicTabInfo musicTabInfo2;
        MusicTabClaimInfo musicTabClaimInfo2;
        User user;
        TabSetting tabSetting;
        BATab bATab;
        User user2;
        TabSetting tabSetting2;
        BATab bATab2;
        User user3;
        TabSetting tabSetting3;
        ShopTab shopTab;
        User user4;
        TabSetting tabSetting4;
        StickerTab stickerTab;
        User user5;
        TabSetting tabSetting5;
        User user6;
        TabSetting tabSetting6;
        StickerTab stickerTab2;
        Integer num2 = null;
        if (this.LLILZ && ((user5 = getUser()) == null || (tabSetting5 = user5.getTabSetting()) == null || tabSetting5.stickerTab == null || ((user6 = getUser()) != null && (tabSetting6 = user6.getTabSetting()) != null && (stickerTab2 = tabSetting6.stickerTab) != null && o.LJ(stickerTab2.getShowStickerTab(), Boolean.FALSE)))) {
            this.LLILZ = false;
            return true;
        }
        if (!this.LLILZ && (user4 = getUser()) != null && (tabSetting4 = user4.getTabSetting()) != null && (stickerTab = tabSetting4.stickerTab) != null && o.LJ(stickerTab.getShowStickerTab(), Boolean.TRUE)) {
            this.LLILZ = true;
            return true;
        }
        if (!this.LLILLJJLI && (user3 = getUser()) != null && (tabSetting3 = user3.getTabSetting()) != null && (shopTab = tabSetting3.shopTab) != null && shopTab.showShopTab) {
            return true;
        }
        if (!this.LLILLL && (user2 = getUser()) != null && (tabSetting2 = user2.getTabSetting()) != null && (bATab2 = tabSetting2.baTab) != null && o.LJ(bATab2.getShowBATab(), Boolean.TRUE)) {
            return true;
        }
        if (this.LLILLL && ((user = getUser()) == null || (tabSetting = user.getTabSetting()) == null || (bATab = tabSetting.baTab) == null || !o.LJ(bATab.getShowBATab(), Boolean.TRUE))) {
            this.LLILLL = false;
            return true;
        }
        User user7 = getUser();
        if (user7 != null && (musicTabInfo2 = user7.getMusicTabInfo()) != null && (musicTabClaimInfo2 = musicTabInfo2.getMusicTabClaimInfo()) != null) {
            num = Integer.valueOf(musicTabClaimInfo2.getStatus());
        } else {
            num = null;
        }
        if (o.LJ(num, this.LLILZIL)) {
            return false;
        }
        User user8 = getUser();
        if (user8 != null && (musicTabInfo = user8.getMusicTabInfo()) != null && (musicTabClaimInfo = musicTabInfo.getMusicTabClaimInfo()) != null) {
            num2 = Integer.valueOf(musicTabClaimInfo.getStatus());
        }
        this.LLILZIL = num2;
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public String e4() {
        C9IB<ProfileComponents> g4 = g4();
        if (g4 != null) {
            return g4.LJLJI;
        }
        return null;
    }

    public final String getEventType() {
        C9PM state;
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null && (state = profilePlatformVM.getState()) != null) {
            return state.LJZL;
        }
        return null;
    }

    public final void i6() {
        IAVDraftService draftService = AVExternalServiceImpl.LIZ().draftService();
        if (this.LLILZLL || !draftService.enableAddDraftLossMonitor()) {
            return;
        }
        this.LLILZLL = true;
        C10K.LIZIZ(new CallableC43260GyO(draftService, this), draftService.executor(), null);
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public String n4() {
        ProfileCommonInfo on0;
        UserProfileInfo userProfileInfo;
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility == null || (on0 = iProfileBaseAbility.on0()) == null || (userProfileInfo = on0.getUserProfileInfo()) == null) {
            return null;
        }
        return userProfileInfo.getSecUid();
    }

    @Override // X.C8W0
    public void onResume() {
        boolean z;
        super.onResume();
        YFI yfi = this.LLIILZL;
        if (yfi != null && !this.LLIIJLIL) {
            yfi.I3();
        }
        C9PL c9pl = (C9PL) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(C9KV.class));
        if (c9pl != null) {
            z = c9pl.LJ;
        } else {
            z = false;
        }
        String r4 = r4(this.LJLJLLL);
        if (z && C78983UzD.LJJJJ(r4) && !o.LJ(e4(), "qa_detail") && !((Boolean) C53012KrI.LIZ.getValue()).booleanValue()) {
            C26335AVf.LIZJ(r4);
        }
        this.LLIIJLIL = false;
        if (this.LLIIL) {
            this.LLIIL = false;
            List<ProfileListFragment> list = this.LJLJJL;
            if (list != null) {
                for (InterfaceC36571c5 interfaceC36571c5 : list) {
                    if (interfaceC36571c5 instanceof YFG) {
                        ((YFG) interfaceC36571c5).LLLZI();
                    }
                }
            }
        }
    }

    public final void p6() {
        if (getUser() != null) {
            A3(getUser());
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.AUL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS181S0100000_15(this, 207));
        getProfilePlatformVM().rv0(new AqS181S0100000_15(this, 208));
        getProfilePlatformVM().sv0(new AqS170S0100000_4(this, 853));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.YFX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LJI;
            }
        }, new AqS170S0100000_4(this, 854));
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public String u4() {
        ProfileCommonInfo on0;
        UserProfileInfo userProfileInfo;
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility == null || (on0 = iProfileBaseAbility.on0()) == null || (userProfileInfo = on0.getUserProfileInfo()) == null) {
            return null;
        }
        return userProfileInfo.getUid();
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public void C4(int i) {
        Object obj;
        YFI yfi;
        super.C4(i);
        YFI yfi2 = this.LLIILZL;
        if (yfi2 != null) {
            List<ProfileListFragment> list = this.LJLJJL;
            if (list != null) {
                obj = ListProtector.get(list, this.LJLJLLL);
            } else {
                obj = null;
            }
            if (o.LJ(yfi2, obj) && !this.LLIIJLIL && (yfi = this.LLIILZL) != null) {
                yfi.I3();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0353  */
    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E3(int r27) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssemV2.E3(int):void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public boolean E4(int i) {
        List<Integer> list;
        Integer num;
        InterfaceC87073YFh interfaceC87073YFh;
        if (Math.abs(i) > 0 && (list = this.LJLJJLL) != null && (num = (Integer) ORZ.LJLLLLLL(this.LJLJLLL, list)) != null && num.intValue() == 16) {
            InterfaceC36571c5 interfaceC36571c5 = this.LLIIZ;
            if ((interfaceC36571c5 instanceof InterfaceC87073YFh) && (interfaceC87073YFh = (InterfaceC87073YFh) interfaceC36571c5) != null) {
                interfaceC87073YFh.onScrollEnd();
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public List<Integer> E5(User user) {
        C9IB<ProfileComponents> g4;
        ProfileComponents profileComponents;
        ProfileComponents profileComponents2;
        if (g4() != null) {
            C9IB<ProfileComponents> g42 = g4();
            List<? extends ProfileComponents> list = null;
            if (g42 != null && g42.LJLIL != null && (g4 = g4()) != null && (profileComponents = g4.LJLIL) != null && profileComponents.components != null) {
                C9IB<ProfileComponents> g43 = g4();
                if (g43 != null && (profileComponents2 = g43.LJLIL) != null) {
                    list = profileComponents2.components;
                }
                List<Integer> LIZ = C9PB.LIZ(getUser(), list);
                P3(LIZ);
                O3(LIZ);
                return LIZ;
            }
        }
        return super.E5(user);
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2
    public List<Integer> G5(String str) {
        C9IB<ProfileComponents> g4;
        ProfileComponents profileComponents;
        ProfileComponents profileComponents2;
        if (g4() != null) {
            C9IB<ProfileComponents> g42 = g4();
            List<? extends ProfileComponents> list = null;
            if (g42 != null && g42.LJLIL != null && (g4 = g4()) != null && (profileComponents = g4.LJLIL) != null && profileComponents.components != null) {
                C9IB<ProfileComponents> g43 = g4();
                if (g43 != null && (profileComponents2 = g43.LJLIL) != null) {
                    list = profileComponents2.components;
                }
                List<Integer> LIZ = C9PB.LIZ(getUser(), list);
                P3(LIZ);
                O3(LIZ);
                return LIZ;
            }
        }
        return super.G5(str);
    }

    @Override // X.InterfaceC87086YFu
    public void LJJIJ(String str) {
        YFI yfi = this.LLIL;
        if (yfi != null) {
            yfi.Y0(str, true);
        }
        YFI yfi2 = this.LLIILZL;
        if (yfi2 != null) {
            yfi2.Y0(str, true);
        }
        YFI yfi3 = this.LLILII;
        if (yfi3 != null) {
            yfi3.Y0(str, true);
        }
    }

    public final String h6(List<String> list) {
        Iterator<String> it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            str = C0F0.LIZLLL(str, it.next(), ';');
        }
        return str;
    }

    @QD3
    public final void onMyEnterpriseProfileEvent(C62646OiI event) {
        o.LJIIIZ(event, "event");
        this.LLIIL = true;
    }

    @QD3
    public final void onRefreshProfileViewPagerDataEvent(C72027SOp c72027SOp) {
        this.LLIIL = true;
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        String str;
        o.LJIIIZ(event, "event");
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            str = LIZLLL.getTag();
        } else {
            str = null;
        }
        if (!o.LJ("platform_fragment", str)) {
            return;
        }
        int i = event.LJLIL;
        if (i != 2) {
            if (i != 13) {
                if (i != 15) {
                    return;
                } else {
                    ((RBX) HG3.LJIILL()).updateCurAwemeCount(1);
                }
            } else {
                IAwemeService LIZ = AwemeService.LIZ();
                Object obj = event.LJLILLLLZI;
                o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
                Aweme i6 = LIZ.i6((String) obj);
                if (i6 != null && i6.getUserDigg() == 1) {
                    ((RBX) HG3.LJIILL()).updateCurFavoritingCount(1);
                } else {
                    ((RBX) HG3.LJIILL()).updateCurFavoritingCount(-1);
                }
            }
        } else {
            ((RBX) HG3.LJIILL()).updateCurAwemeCount(-1);
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        M3(curUser.getAwemeCount());
        N3(curUser.getFavoritingCount());
    }

    @Override // com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        long currentTimeMillis = System.currentTimeMillis();
        super.onViewCreated(view);
        VW9 vw9 = this.LJZI;
        if (vw9 != null) {
            vw9.setOffscreenPageLimit(3);
        }
        C9IB<ProfileComponents> g4 = g4();
        if (g4 != null && o.LJ(g4.LJLJJL, Boolean.TRUE)) {
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.YFZ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PL) obj).LJI;
                }
            }, new AqS181S0100000_15(this, 210));
        } else {
            p6();
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9Pl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PL) obj).LJ);
            }
        }, new AqS181S0100000_15(this, 211));
        C8YN.LJII(this, c4(), new TBT() { // from class: X.YFQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((Y4J) obj).LJLILLLLZI);
            }
        }, null, new AqS197S0100000_15(this, 33), 6);
        AssemViewModel<C181627Aw> g6 = g6();
        if (g6 != null) {
            C8YN.LJII(this, g6, new TBT() { // from class: X.YFg
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C181627Aw) obj).LJLJI;
                }
            }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 234), 4);
        }
        ProfileViewModel k4 = k4();
        AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(this, 212);
        k4.getClass();
        JediViewModel.wv0(k4, C26154AOg.LJLIL, null, new AqS174S0100000_8(aqS181S0100000_15, (InterfaceC88472Yns<? super C50652JuK, C50652JuK>) 178), 2, null);
        ProfileViewModel k42 = k4();
        AqS181S0100000_15 aqS181S0100000_152 = new AqS181S0100000_15(this, 209);
        k42.getClass();
        JediViewModel.wv0(k42, new TBT() { // from class: X.AO9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileState) obj).getOnHiddenChanged());
            }
        }, null, new AqS174S0100000_8(aqS181S0100000_152, 179), 2, null);
        String str = this.assemTagInternal;
        if (str == null) {
            str = "profile_tab";
        }
        C237259Sv.LIZLLL(System.currentTimeMillis() - currentTimeMillis, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC234089Gq
    public void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        C9IB<ProfileComponents> g4 = g4();
        if (g4 == null) {
            return;
        }
        g4.LJLIL = profileComponents;
    }

    @Override // X.InterfaceC87086YFu
    public void LLJILJILJ(String aid, Aweme aweme) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(aweme, "aweme");
        YFI yfi = this.LLIL;
        if (yfi != null) {
            yfi.lc(aweme, aid);
        }
        YFI yfi2 = this.LLILII;
        if (yfi2 != null) {
            yfi2.lc(aweme, aid);
        }
        YFI yfi3 = this.LLIILZL;
        if (yfi3 != null) {
            yfi3.lc(aweme, aid);
        }
    }

    public final void q6(InterfaceC87073YFh interfaceC87073YFh, User user, int i) {
        if (B5(user, i)) {
            interfaceC87073YFh.m4(new MiniUser(user));
        }
    }
}
