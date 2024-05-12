package com.ss.android.ugc.aweme.profile.widgets.awemepager;

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
import X.C55749LuL;
import X.C5H3;
import X.C62646OiI;
import X.C65352Pkq;
import X.C72027SOp;
import X.C78966Uyw;
import X.C78983UzD;
import X.C87080YFo;
import X.C8VC;
import X.C8YN;
import X.C9ID;
import X.C9KV;
import X.C9PL;
import X.C9PN;
import X.CallableC43259GyN;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC244909jK;
import X.InterfaceC36571c5;
import X.InterfaceC87073YFh;
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
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.stickerstore.fragment.StickerStoreProfileListFragment;
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
public final class MineAwemePagerAssem extends AwemePagerAssem implements InterfaceC244909jK {
    public static final C87080YFo LLJ = new C87080YFo();
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public Integer LLIL;
    public boolean LLILII;
    public YFI LLILL;
    public ProfileListFragment LLILLIZIL;
    public YFI LLILLJJLI;
    public YFI LLILLL;
    public CollectProfileListFragment LLILZ;
    public StickerStoreProfileListFragment LLILZIL;
    public boolean LLIZ;
    public Map<Integer, View> LLIZLLLIL = new LinkedHashMap();
    public boolean LLIIJLIL = true;
    public final C55749LuL LLILIL = new C55749LuL(C47704Ins.LJ(this, C9ID.class, null), checkSupervisorPrepared());
    public final C5H3 LLILZLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 603));

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public boolean I4() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public void _$_clearFindViewByIdCache() {
        this.LLIZLLLIL.clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLIZLLLIL;
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

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem, X.InterfaceC238569Xw, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    private final Bundle c6() {
        Bundle bundle = new Bundle();
        String eventType = getEventType();
        if (eventType == null) {
            eventType = "personal_homepage";
        }
        bundle.putString("enter_from", eventType);
        bundle.putString("page_name", "personal_homepage");
        bundle.putString("entrance_type", "showcase_list");
        bundle.putString("previous_page", e4());
        User mUser = getMUser();
        if (mUser != null) {
            bundle.putString("sec_user_id", mUser.getSecUid());
            bundle.putString("author_id", mUser.getUid());
            bundle.putBoolean("is_my_profile", true);
            bundle.putInt("follow_status", mUser.getFollowStatus());
        }
        return bundle;
    }

    private final C9ID e6() {
        return (C9ID) this.LLILIL.getValue();
    }

    private final AssemViewModel<C181627Aw> g6() {
        return (AssemViewModel) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC244909jK
    public void LLLIILIL() {
        Fragment fragment;
        List<ProfileListFragment> list = this.LJLJI;
        if (list != null && list.size() > 0) {
            T6H<ProfileListFragment> t6h = this.LJLJJLL;
            ArrayList<Aweme> arrayList = null;
            Object obj = null;
            if (t6h != null) {
                fragment = t6h.LJJIIJZLJL();
            } else {
                fragment = null;
            }
            if (fragment instanceof YFI) {
                T6H<ProfileListFragment> t6h2 = this.LJLJJLL;
                if (t6h2 != null) {
                    obj = t6h2.LJJIIJZLJL();
                }
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.IAwemeListFragment");
                arrayList = ((YFI) obj).LLLIIIL();
            }
            C78966Uyw.LJLJJL = arrayList;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public void R4() {
        YFI yfi = this.LLILLJJLI;
        if (yfi != null) {
            yfi.af();
        }
    }

    public final String getEventType() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LIZLLL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public User getMUser() {
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
        User mUser;
        TabSetting tabSetting;
        BATab bATab;
        User mUser2;
        TabSetting tabSetting2;
        BATab bATab2;
        User mUser3;
        TabSetting tabSetting3;
        ShopTab shopTab;
        User mUser4;
        TabSetting tabSetting4;
        StickerTab stickerTab;
        User mUser5;
        TabSetting tabSetting5;
        User mUser6;
        TabSetting tabSetting6;
        StickerTab stickerTab2;
        Integer num2 = null;
        if (this.LLIIZ && ((mUser5 = getMUser()) == null || (tabSetting5 = mUser5.getTabSetting()) == null || tabSetting5.stickerTab == null || ((mUser6 = getMUser()) != null && (tabSetting6 = mUser6.getTabSetting()) != null && (stickerTab2 = tabSetting6.stickerTab) != null && o.LJ(stickerTab2.getShowStickerTab(), Boolean.FALSE)))) {
            this.LLIIZ = false;
            return true;
        }
        if (!this.LLIIZ && (mUser4 = getMUser()) != null && (tabSetting4 = mUser4.getTabSetting()) != null && (stickerTab = tabSetting4.stickerTab) != null && o.LJ(stickerTab.getShowStickerTab(), Boolean.TRUE)) {
            this.LLIIZ = true;
            return true;
        }
        if (!this.LLIILII && (mUser3 = getMUser()) != null && (tabSetting3 = mUser3.getTabSetting()) != null && (shopTab = tabSetting3.shopTab) != null && shopTab.showShopTab) {
            return true;
        }
        if (!this.LLIILZL && (mUser2 = getMUser()) != null && (tabSetting2 = mUser2.getTabSetting()) != null && (bATab2 = tabSetting2.baTab) != null && o.LJ(bATab2.getShowBATab(), Boolean.TRUE)) {
            return true;
        }
        if (this.LLIILZL && ((mUser = getMUser()) == null || (tabSetting = mUser.getTabSetting()) == null || (bATab = tabSetting.baTab) == null || !o.LJ(bATab.getShowBATab(), Boolean.TRUE))) {
            this.LLIILZL = false;
            return true;
        }
        User mUser7 = getMUser();
        if (mUser7 != null && (musicTabInfo2 = mUser7.getMusicTabInfo()) != null && (musicTabClaimInfo2 = musicTabInfo2.getMusicTabClaimInfo()) != null) {
            num = Integer.valueOf(musicTabClaimInfo2.getStatus());
        } else {
            num = null;
        }
        if (o.LJ(num, this.LLIL)) {
            return false;
        }
        User mUser8 = getMUser();
        if (mUser8 != null && (musicTabInfo = mUser8.getMusicTabInfo()) != null && (musicTabClaimInfo = musicTabInfo.getMusicTabClaimInfo()) != null) {
            num2 = Integer.valueOf(musicTabClaimInfo.getStatus());
        }
        this.LLIL = num2;
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public String e4() {
        C9ID e6 = e6();
        if (e6 != null) {
            return e6.LJLILLLLZI;
        }
        return null;
    }

    public final void i6() {
        IAVDraftService draftService = AVExternalServiceImpl.LIZ().draftService();
        if (this.LLIZ || !draftService.enableAddDraftLossMonitor()) {
            return;
        }
        this.LLIZ = true;
        C10K.LIZIZ(new CallableC43259GyN(draftService, this), draftService.executor(), null);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public String l4() {
        C9ID e6 = e6();
        if (e6 != null) {
            return e6.LJLJJL;
        }
        return null;
    }

    @Override // X.C8W0
    public void onResume() {
        boolean z;
        super.onResume();
        YFI yfi = this.LLILL;
        if (yfi != null && !this.LLIIJLIL) {
            yfi.I3();
        }
        C9PL c9pl = (C9PL) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(C9KV.class));
        if (c9pl != null) {
            z = c9pl.LJ;
        } else {
            z = false;
        }
        String p4 = p4(this.LJLJL);
        if (z && C78983UzD.LJJJJ(p4) && !o.LJ(e4(), "qa_detail") && !((Boolean) C53012KrI.LIZ.getValue()).booleanValue()) {
            C26335AVf.LIZJ(p4);
        }
        this.LLIIJLIL = false;
        if (this.LLIIL) {
            this.LLIIL = false;
            List<ProfileListFragment> list = this.LJLJI;
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
        if (getMUser() != null) {
            A3(getMUser());
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9MQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS181S0100000_15(this, 128));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9ML
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PL) obj).LIZJ;
            }
        }, new AqS181S0100000_15(this, 129));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9MM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PL) obj).LJ);
            }
        }, new AqS170S0100000_4(this, 672));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.YFW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LJI;
            }
        }, new AqS170S0100000_4(this, 673));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public String q4() {
        C9ID e6 = e6();
        if (e6 != null) {
            return e6.LJLJJI;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public void A4(int i) {
        super.A4(i);
        YFI yfi = this.LLILL;
        if (yfi != null) {
            List<ProfileListFragment> list = this.LJLJI;
            o.LJI(list);
            if (o.LJ(yfi, ListProtector.get(list, this.LJLJL)) && !this.LLIIJLIL) {
                YFI yfi2 = this.LLILL;
                o.LJI(yfi2);
                yfi2.I3();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    public boolean C4(int i) {
        List<Integer> list;
        Integer num;
        InterfaceC87073YFh interfaceC87073YFh;
        if (Math.abs(i) > 0 && (list = this.LJLJJI) != null && (num = (Integer) ORZ.LJLLLLLL(this.LJLJL, list)) != null && num.intValue() == 16) {
            InterfaceC36571c5 interfaceC36571c5 = this.LLILLIZIL;
            if ((interfaceC36571c5 instanceof InterfaceC87073YFh) && (interfaceC87073YFh = (InterfaceC87073YFh) interfaceC36571c5) != null) {
                interfaceC87073YFh.onScrollEnd();
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0365  */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.YFI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.YFI, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E3(int r21) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.awemepager.MineAwemePagerAssem.E3(int):void");
    }

    @Override // X.InterfaceC244909jK
    public void LJJIJ(String str) {
        YFI yfi = this.LLILLJJLI;
        if (yfi != null) {
            yfi.Y0(str, true);
        }
        YFI yfi2 = this.LLILL;
        if (yfi2 != null) {
            yfi2.Y0(str, true);
        }
        YFI yfi3 = this.LLILLL;
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
        if (!o.LJ("USER", str)) {
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

    @Override // com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        long currentTimeMillis = System.currentTimeMillis();
        super.onViewCreated(view);
        VW9 vw9 = this.LJZ;
        if (vw9 != null) {
            vw9.setOffscreenPageLimit(3);
        }
        C9ID e6 = e6();
        if (e6 != null && o.LJ(e6.LJLJJLL, Boolean.TRUE)) {
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.YFY
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PL) obj).LJI;
                }
            }, new AqS181S0100000_15(this, 130));
        } else {
            p6();
        }
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9Pk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PL) obj).LJ);
            }
        }, new AqS181S0100000_15(this, 131));
        C8YN.LJII(this, c4(), new TBT() { // from class: X.YFO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((Y4J) obj).LJLILLLLZI);
            }
        }, null, new AqS197S0100000_15(this, 28), 6);
        AssemViewModel<C181627Aw> g6 = g6();
        if (g6 != null) {
            C8YN.LJII(this, g6, new TBT() { // from class: X.YFf
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C181627Aw) obj).LJLJI;
                }
            }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 176), 4);
        }
        ProfileViewModel X3 = X3();
        AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(this, 132);
        X3.getClass();
        JediViewModel.wv0(X3, C26154AOg.LJLIL, null, new AqS174S0100000_8(aqS181S0100000_15, (InterfaceC88472Yns<? super C50652JuK, C50652JuK>) 178), 2, null);
        C237259Sv.LIZLLL(System.currentTimeMillis() - currentTimeMillis, "old_profile_tab");
    }

    @Override // X.InterfaceC244909jK
    public void LLJILJILJ(String aid, Aweme aweme) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(aweme, "aweme");
        YFI yfi = this.LLILLJJLI;
        if (yfi != null) {
            yfi.lc(aweme, aid);
        }
        YFI yfi2 = this.LLILLL;
        if (yfi2 != null) {
            yfi2.lc(aweme, aid);
        }
        YFI yfi3 = this.LLILL;
        if (yfi3 != null) {
            yfi3.lc(aweme, aid);
        }
    }

    public final void q6(InterfaceC87073YFh interfaceC87073YFh, User user, int i) {
        if (y5(user, i)) {
            interfaceC87073YFh.m4(new MiniUser(user));
        }
    }
}
