package com.ss.android.ugc.profile.platform.business.tabs.container;

import X.AFB;
import X.AV1;
import X.ActivityC45651qj;
import X.C10120aW;
import X.C10K;
import X.C17J;
import X.C188727au;
import X.C19N;
import X.C1JI;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C235779Nd;
import X.C255199zv;
import X.C255209zw;
import X.C26175APb;
import X.C26335AVf;
import X.C26360AWe;
import X.C2RZ;
import X.C35789E2v;
import X.C47704Ins;
import X.C52216KeS;
import X.C53056Ks0;
import X.C55749LuL;
import X.C57092Lx;
import X.C5H3;
import X.C60996Nwm;
import X.C61447O9r;
import X.C65352Pkq;
import X.C65776Prg;
import X.C66415Q4t;
import X.C73222SoU;
import X.C76732zl;
import X.C78856UxA;
import X.C78926UyI;
import X.C79234V7u;
import X.C79235V7v;
import X.C79237V7x;
import X.C7HP;
import X.C80648Vky;
import X.C86034Xpe;
import X.C86894Y8k;
import X.C86901Y8r;
import X.C86904Y8u;
import X.C86907Y8x;
import X.C86988YCa;
import X.C86989YCb;
import X.C86990YCc;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.C9IB;
import X.C9IL;
import X.EnumC56485MEv;
import X.EnumC62322cW;
import X.FMX;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC238569Xw;
import X.InterfaceC36571c5;
import X.InterfaceC86908Y8y;
import X.InterfaceC87073YFh;
import X.KL2;
import X.LBE;
import X.LFH;
import X.MF5;
import X.MF7;
import X.MFC;
import X.MGO;
import X.ORY;
import X.ORZ;
import X.QD3;
import X.RBX;
import X.T6H;
import X.TBT;
import X.VW9;
import X.X1D;
import X.Y4F;
import X.YF6;
import X.YF8;
import X.YF9;
import X.YFB;
import X.YFF;
import X.YFG;
import Y.ACallableS2S0101100_9;
import Y.ALAdapterS12S0100000_15;
import Y.ARunnableS34S0200000_15;
import Y.ARunnableS51S0100000_15;
import Y.IDiS276S0100000_15;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileListFragment;
import com.ss.android.ugc.aweme.profile.model.BATab;
import com.ss.android.ugc.aweme.profile.model.RepostTab;
import com.ss.android.ugc.aweme.profile.model.ShopTab;
import com.ss.android.ugc.aweme.profile.model.StickerTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import yq4.a;

/* loaded from: classes16.dex */
public abstract class AwemePagerAssemV2 extends UIContentAssem implements InterfaceC238569Xw, InterfaceC86908Y8y {
    public static final YFF LLIIJI = new YFF();
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final String LJLJI;
    public final C55749LuL LJLJJI;
    public List<ProfileListFragment> LJLJJL;
    public List<Integer> LJLJJLL;
    public C80648Vky LJLJL;
    public T6H<ProfileListFragment> LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public final User LJLLJ;
    public final String LJLLL;
    public final String LJLLLL;
    public View LJLLLLLL;
    public C86904Y8u LJLZ;
    public C86894Y8k LJZ;
    public VW9 LJZI;
    public C2RZ LJZL;
    public ProfileViewModel LL;
    public final C55749LuL LLD;
    public float LLF;
    public int LLFF;
    public float LLFFF;
    public boolean LLFII;
    public final C5H3 LLFZ;
    public ProfileListFragment LLI;
    public ProfileListFragment LLIFFJFJJ;
    public ProfileListFragment LLII;
    public ProfileListFragment LLIIII;
    public final C5H3 LLIIIILZ;
    public MFC LLIIIJ;
    public long LLIIIL;
    public Map<Integer, View> LLIIIZ = new LinkedHashMap();

    private final void G4() {
        int LJ;
        Integer valueOf;
        Rect rect = C57092Lx.LIZ.LJ.LIZJ;
        if (rect != null && (valueOf = Integer.valueOf(rect.top)) != null) {
            LJ = valueOf.intValue();
        } else {
            LJ = C60996Nwm.LJ(C212428Vi.LIZ(this)) - C61447O9r.LIZ();
        }
        this.LLFF = LJ;
    }

    private final String m4(int i) {
        if (i == 0) {
            return "output_tab";
        }
        if (i == 1) {
            return "likes_tab";
        }
        if (i == 3) {
            return "music_tab";
        }
        if (i == 6) {
            return "effect_tab";
        }
        if (i == 8) {
            return "collection_tab";
        }
        if (i == 14) {
            return "private_tab";
        }
        switch (i) {
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 20:
                return "shop_tab";
            case 17:
                return "ghost_music_tab";
            case 18:
                return "reposted_tab";
            case 19:
                return "stickers_tab";
            case 21:
                return "business_tab";
            default:
                return "";
        }
    }

    public void D4() {
    }

    public abstract void E3(int i);

    public abstract boolean E4(int i);

    public boolean P4() {
        return false;
    }

    public boolean R4() {
        return true;
    }

    public abstract void T4();

    public void X4() {
    }

    public void _$_clearFindViewByIdCache() {
        this.LLIIIZ.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLIIIZ;
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

    public abstract String e4();

    @Override // X.InterfaceC238569Xw, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public void y5() {
        if (this.LLIIIL > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.LLIIIL;
            if (currentTimeMillis > 0) {
                C10K.LIZIZ(new ACallableS2S0101100_9(currentTimeMillis, this, this.LJLJLLL, 1), FMX.LIZIZ(), null);
            }
            this.LLIIIL = -1L;
        }
    }

    public AwemePagerAssemV2() {
        C65776Prg LIZ = C65352Pkq.LIZ(AwemePagerVM.class);
        this.LJLIL = new C214298b3(new AqS165S0100000_15(LIZ, 684), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C86989YCb.INSTANCE, LIZ);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(ProfilePlatformViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ2, c9be, new AqS165S0100000_15(LIZ2, 685), C86990YCc.INSTANCE, null);
        this.LJLJI = C10120aW.LIZ("android:switcher:", R.id.jd2, ':');
        this.LJLJJI = new C55749LuL(C47704Ins.LJ(this, C9IB.class, "profile_tab"), checkSupervisorPrepared());
        this.LJLLILLLL = true;
        this.LLD = new C55749LuL(C47704Ins.LJ(this, C26175APb.class, null), checkSupervisorPrepared());
        this.LLFF = EnumC56485MEv.UNINITIALIZED.getValue();
        this.LLFZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 686));
        this.LLIIIILZ = C221108m2.LIZIZ(C86988YCa.LJLIL);
        this.LLIIIJ = new YFB(this);
        this.LLIIIL = -1L;
    }

    private final C9IB<ProfileComponents> g4() {
        return (C9IB) this.LJLJJI.getValue();
    }

    private final C26175APb z4() {
        return (C26175APb) this.LLD.getValue();
    }

    public final void A4() {
        VW9 vw9;
        VW9 vw92 = this.LJZI;
        if ((vw92 != null && vw92.getCurrentItem() == l4()) || l4() == -1 || (vw9 = this.LJZI) == null) {
            return;
        }
        vw9.setCurrentItem(l4(), false);
    }

    public final void L3() {
        C80648Vky c80648Vky = this.LJLJL;
        if (c80648Vky == null) {
            return;
        }
        c80648Vky.setMinY(0);
    }

    @Override // X.InterfaceC238569Xw
    public void Qb() {
        InterfaceC36571c5 interfaceC36571c5;
        List<ProfileListFragment> list = this.LJLJJL;
        if (list == null || (interfaceC36571c5 = (ProfileListFragment) ORZ.LJLLLLLL(this.LJLJLLL, list)) == null) {
            return;
        }
        if (interfaceC36571c5 instanceof InterfaceC87073YFh) {
            ((InterfaceC87073YFh) interfaceC36571c5).LJ();
        } else {
            if (!(interfaceC36571c5 instanceof YFG)) {
                return;
            }
            ((YFG) interfaceC36571c5).LLLZI();
        }
    }

    public int X3() {
        ProfileListFragment profileListFragment;
        List<ProfileListFragment> list = this.LJLJJL;
        if (list == null || ListProtector.get(list, this.LJLJLLL) == null) {
            return EnumC56485MEv.UNINITIALIZED.getValue();
        }
        List<ProfileListFragment> list2 = this.LJLJJL;
        if (list2 != null && (profileListFragment = (ProfileListFragment) ListProtector.get(list2, this.LJLJLLL)) != null) {
            return profileListFragment.wl();
        }
        return EnumC56485MEv.UNINITIALIZED.getValue();
    }

    public final IProfileMusicTabService Y3() {
        return (IProfileMusicTabService) this.LLIIIILZ.getValue();
    }

    public final C86904Y8u Z3() {
        C86904Y8u c86904Y8u = this.LJLZ;
        if (c86904Y8u != null) {
            return c86904Y8u;
        }
        o.LJIJI("navigator");
        throw null;
    }

    public final void Z5() {
        boolean z;
        Integer LIZ = C235779Nd.LIZ.LJIIJJI().LIZ();
        if ((LIZ != null && LIZ.intValue() == 0) || !AV1.LJIJ(getUser())) {
            z = true;
        } else {
            z = false;
        }
        yc(z);
    }

    public final AwemePagerVM c4() {
        return (AwemePagerVM) this.LJLIL.getValue();
    }

    public final ProfilePlatformViewModel getProfilePlatformVM() {
        return (ProfilePlatformViewModel) this.LJLILLLLZI.getValue();
    }

    public final ProfileViewModel k4() {
        ProfileViewModel profileViewModel = this.LL;
        if (profileViewModel != null) {
            return profileViewModel;
        }
        o.LJIJI("profileViewModel");
        throw null;
    }

    public int l4() {
        List<Integer> list = this.LJLJJLL;
        if (list == null) {
            return -1;
        }
        return list.indexOf(0);
    }

    public final ALAdapterS12S0100000_15 p4() {
        return (ALAdapterS12S0100000_15) this.LLFZ.getValue();
    }

    public final void xg() {
        List<Integer> list = this.LJLJJLL;
        if (list == null || list.isEmpty()) {
            return;
        }
        F3(getUser());
        I4(C212428Vi.LIZ(this));
        Z5();
        T6H<ProfileListFragment> t6h = this.LJLJLJ;
        if (t6h != null) {
            t6h.notifyDataSetChanged();
        }
    }

    private final void J4() {
        if (C86907Y8x.LIZJ() && C19N.LJ("switch_sort_video_by_vv", false)) {
            Z3().setVisibility(8);
            C86894Y8k c86894Y8k = this.LJZ;
            if (c86894Y8k != null) {
                c86894Y8k.setVisibility(0);
            }
            C86894Y8k c86894Y8k2 = this.LJZ;
            if (c86894Y8k2 != null) {
                c86894Y8k2.setMode(1);
                return;
            }
            return;
        }
        if (C52216KeS.LIZ()) {
            C86894Y8k c86894Y8k3 = this.LJZ;
            if (c86894Y8k3 != null) {
                c86894Y8k3.setMode(0);
            }
            Z3().setVisibility(8);
            C86894Y8k c86894Y8k4 = this.LJZ;
            if (c86894Y8k4 == null) {
                return;
            }
            c86894Y8k4.setVisibility(0);
            return;
        }
        Z3().setVisibility(0);
        C86894Y8k c86894Y8k5 = this.LJZ;
        if (c86894Y8k5 == null) {
            return;
        }
        c86894Y8k5.setVisibility(8);
    }

    private final void O4() {
        View view;
        if (AV1.LJIIJJI() && (view = this.LJLLLLLL) != null) {
            view.setPadding(0, 0, 0, 0);
        }
    }

    private final int R3() {
        ProfileComponents profileComponents;
        m mVar;
        j LJJIJ;
        C9IB<ProfileComponents> g4 = g4();
        if (g4 != null && (profileComponents = g4.LJLIL) != null && (mVar = profileComponents.bizData) != null && (LJJIJ = mVar.LJJIJ("default_landing_tab_id")) != null) {
            return LJJIJ.LJIILJJIL();
        }
        return 0;
    }

    private final List<Integer> W5() {
        return C35789E2v.LIZ();
    }

    private final Aweme getAweme() {
        return getProfilePlatformVM().getState().LJLJLLL;
    }

    @Override // X.InterfaceC238569Xw
    public AwemePagerVM H8() {
        return c4();
    }

    @Override // X.InterfaceC238569Xw
    public void M5() {
        if (Z3().getTabCount() <= 1) {
            b5(false);
        } else {
            b5(true);
        }
    }

    public final boolean f5() {
        IProfileMusicTabService Y3;
        User user = getUser();
        if (user == null || (Y3 = Y3()) == null) {
            return false;
        }
        return Y3.LJIJI(user);
    }

    public final boolean g5() {
        IProfileMusicTabService Y3;
        User user = getUser();
        if (user == null || (Y3 = Y3()) == null) {
            return false;
        }
        return Y3.LJIJJ(user);
    }

    public void initData() {
        FragmentManager fragmentManager;
        if (getUser() == null) {
            H3(u4());
        } else {
            F3(getUser());
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            fragmentManager = LIZLLL.getChildFragmentManager();
        } else {
            fragmentManager = null;
        }
        T6H<ProfileListFragment> t6h = new T6H<>(fragmentManager, this.LJLJJL, this.LJLJJLL);
        this.LJLJLJ = t6h;
        VW9 vw9 = this.LJZI;
        if (vw9 != null) {
            vw9.setAdapter(t6h);
        }
        I4(LIZ);
        C4(this.LJLJLLL);
        VW9 vw92 = this.LJZI;
        if (vw92 != null) {
            vw92.setCurrentItem(this.LJLJLLL);
        }
        VW9 vw93 = this.LJZI;
        if (vw93 != null) {
            vw93.addOnPageChangeListener(new IDiS276S0100000_15(this, 5));
        }
        Z5();
        G4();
    }

    public void n5() {
        this.LLIIIL = System.currentTimeMillis();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            c5(AFB.LIZ(LIZLLL));
        }
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    public final float x3() {
        int X3 = X3();
        if (C1JI.LJJ(X3) || X3 > this.LLFF) {
            return 0.0f;
        }
        C80648Vky c80648Vky = this.LJLJL;
        if (c80648Vky != null && c80648Vky.getCurScrollY() == 0) {
            return 0.0f;
        }
        return this.LLFF - X3;
    }

    public MFC Q3() {
        return this.LLIIIJ;
    }

    public User getUser() {
        return this.LJLLJ;
    }

    public String n4() {
        return this.LJLLLL;
    }

    public String u4() {
        return this.LJLLL;
    }

    private final void H3(String str) {
        List<Integer> G5 = G5(str);
        if (G5 != null) {
            this.LJLJJL = new ArrayList(G5.size());
            this.LJLJJLL = new ArrayList(G5.size());
            Iterator<Integer> it = G5.iterator();
            while (it.hasNext()) {
                E3(it.next().intValue());
            }
        }
    }

    private final void I3(int i) {
        int i2;
        C86904Y8u Z3 = Z3();
        List<Integer> list = this.LJLJJLL;
        if (list != null) {
            i2 = list.indexOf(Integer.valueOf(i));
        } else {
            i2 = 0;
        }
        View LIZIZ = Z3.LIZIZ(i2);
        if (LIZIZ == null) {
            return;
        }
        LIZIZ.setClickable(false);
    }

    private final void I4(ActivityC45651qj activityC45651qj) {
        boolean z;
        View view;
        if (((RBX) HG3.LJIILL()).isLogin() && AV1.LJIJ(getUser())) {
            z = true;
        } else {
            z = false;
        }
        if ((C86907Y8x.LIZJ() || C52216KeS.LIZ()) && C19N.LJ("switch_sort_video_by_vv", false)) {
            C86894Y8k c86894Y8k = this.LJZ;
            if (c86894Y8k != null) {
                AwemePagerVM c4 = c4();
                int tabViewMode = c86894Y8k.getTabViewMode();
                Aweme aweme = getAweme();
                c4.LJLJI = z;
                c4.LJLJJI = Integer.valueOf(tabViewMode);
                c4.LJLJJL = aweme;
                C86901Y8r c86901Y8r = new C86901Y8r(c4(), c86894Y8k, _$_findCachedViewById(R.id.ncx));
                c86901Y8r.LIZ();
                List<C79235V7v> list = c86901Y8r.LIZ;
                List<C79237V7x> list2 = c86901Y8r.LIZIZ;
                C86894Y8k c86894Y8k2 = this.LJZ;
                if (c86894Y8k2 != null) {
                    c86894Y8k2.LIZJ(this.LJZI, z, list, list2, this.LJLJLLL, this);
                }
            }
        } else {
            C86904Y8u Z3 = Z3();
            AwemePagerVM c42 = c4();
            User user = getUser();
            Aweme aweme2 = getAweme();
            boolean LJ = C19N.LJ("switch_sort_video_by_vv", false);
            Z3.LJLJLLL = c42;
            Z3.LJLL = user;
            Z3.LJLLI = aweme2;
            Z3.LJLLLLLL = LJ;
            C86904Y8u Z32 = Z3();
            VW9 vw9 = this.LJZI;
            int i = this.LJLJLLL;
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                view = LIZLLL.getView();
            } else {
                view = null;
            }
            Z32.LIZLLL(activityC45651qj, vw9, z, this, i, view);
        }
        getProfilePlatformVM().pv0(new AqS181S0100000_15(this, 203));
        getProfilePlatformVM().sv0(new AqS181S0100000_15(this, 204));
    }

    private final void K3(int i) {
        if (this._isViewValid && AV1.LJIIZILJ(getUser(), AV1.LJIJ(getUser()))) {
            I3(i);
        }
    }

    private final void S4(int i) {
        C17J.LJJJ(this, true, m4(i));
    }

    private final void b5(boolean z) {
        int i;
        C86904Y8u Z3 = Z3();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        Z3.setVisibility(i);
    }

    private final YF9 q4(int i) {
        if (i != 0) {
            if (i != 6) {
                if (i != 10) {
                    if (i != 12 && i != 14) {
                        if (i != 17) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        return YF9.NULL;
                                    }
                                    return YF9.HAS_EFFECT_TAB;
                                }
                                return YF9.HAS_MUSIC_TAB;
                            }
                            return YF9.HAS_LIKES_TAB;
                        }
                        return YF9.HAS_BUSINESS_TAB;
                    }
                    return YF9.HAS_SHOP_TAB;
                }
                return YF9.HAS_PRIVATE_TAB;
            }
            return YF9.HAS_COLLECTION_TAB;
        }
        return YF9.HAS_OUTPUT_TAB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "285") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2, "prop_detail_panel") != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A3(com.ss.android.ugc.aweme.profile.model.User r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            X.9IB r0 = r3.g4()
            r2 = 0
            if (r0 == 0) goto L7e
            java.lang.String r1 = r0.LJLJI
        Lc:
            java.lang.String r0 = "sticker_set_details_page"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L5a
            X.9IB r0 = r3.g4()
            if (r0 == 0) goto L7c
            java.lang.String r1 = r0.LJLJI
        L1c:
            java.lang.String r0 = "video_sticker_rank_list"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L5a
            X.9IB r0 = r3.g4()
            if (r0 == 0) goto L7a
            java.lang.String r1 = r0.LJLJI
        L2c:
            java.lang.String r0 = "video_sticker_notice"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L5a
            X.9IB r0 = r3.g4()
            if (r0 == 0) goto L78
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.LJLJL
            if (r1 == 0) goto L78
            java.lang.String r0 = "notice_message_type"
            java.lang.Object r0 = r1.get(r0)
        L44:
            java.lang.String r1 = "285"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 != 0) goto L5a
            X.9IB r0 = r3.g4()
            if (r0 == 0) goto L76
            java.lang.String r0 = r0.LJLJJLL
        L54:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L80
        L5a:
            com.ss.android.ugc.aweme.profile.model.TabSetting r0 = r4.getTabSetting()
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.profile.model.StickerTab r0 = r0.stickerTab
            if (r0 == 0) goto L80
            java.lang.Boolean r1 = r0.getShowStickerTab()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L80
            r0 = 19
            r3.C3(r0)
            return
        L76:
            r0 = r2
            goto L54
        L78:
            r0 = r2
            goto L44
        L7a:
            r1 = r2
            goto L2c
        L7c:
            r1 = r2
            goto L1c
        L7e:
            r1 = r2
            goto Lc
        L80:
            X.APb r0 = r3.z4()
            if (r0 == 0) goto La9
            java.lang.String r0 = r0.LJLJI
        L88:
            java.lang.String r1 = "prop_detail_panel"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 != 0) goto L9e
            X.9IB r0 = r3.g4()
            if (r0 == 0) goto L98
            java.lang.String r2 = r0.LJLJI
        L98:
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r1)
            if (r0 == 0) goto Lab
        L9e:
            boolean r0 = r4.isShowEffectList()
            if (r0 == 0) goto Lab
            r0 = 6
            r3.C3(r0)
            return
        La9:
            r0 = r2
            goto L88
        Lab:
            int r0 = X.AV1.LJII(r4)
            int r1 = r3.c6(r0)
            r3.C3(r1)
            X.Y8u r0 = r3.Z3()
            r0.setIsLandingTabPublish(r1)
            X.Y8k r0 = r3.LJZ
            if (r0 != 0) goto Lc2
        Lc1:
            return
        Lc2:
            r0.setLandingTabType(r1)
            goto Lc1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2.A3(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public void B4(int i) {
        List<ProfileListFragment> list;
        T6H<ProfileListFragment> t6h = this.LJLJLJ;
        if (t6h != null && (list = t6h.LJLJJLL) != null) {
            for (ProfileListFragment profileListFragment : list) {
                if (profileListFragment != null) {
                    profileListFragment.vl(i);
                }
            }
        }
    }

    public final void C3(int i) {
        int i2;
        VW9 vw9;
        List<Integer> list = this.LJLJJLL;
        if (list == null) {
            return;
        }
        C76732zl c76732zl = new C76732zl();
        int indexOf = list.indexOf(Integer.valueOf(i));
        c76732zl.element = indexOf;
        if (indexOf < 0) {
            c76732zl.element = 0;
        }
        T6H<ProfileListFragment> t6h = this.LJLJLJ;
        if (t6h != null) {
            i2 = t6h.getCount() - 1;
        } else {
            i2 = 0;
        }
        c76732zl.element = Math.min(i2, c76732zl.element);
        VW9 vw92 = this.LJZI;
        if ((vw92 == null || vw92.getCurrentItem() != c76732zl.element) && (vw9 = this.LJZI) != null) {
            vw9.setCurrentItem(c76732zl.element, false);
        }
        C4(c76732zl.element);
        Z3().post(new ARunnableS34S0200000_15(this, c76732zl, 28));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C4(int r7) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2.C4(int):void");
    }

    public List<Integer> E5(User user) {
        List LIZ = C35789E2v.LIZ();
        if (LIZ != null) {
            List<Integer> LLJILJILJ = ORZ.LLJILJILJ(LIZ);
            P3(LLJILJILJ);
            O3(LLJILJILJ);
            Iterator it = ((ArrayList) LLJILJILJ).iterator();
            while (it.hasNext()) {
                if (!B5(user, ((Number) it.next()).intValue())) {
                    it.remove();
                }
            }
            return LLJILJILJ;
        }
        return null;
    }

    public void F3(User user) {
        C80648Vky c80648Vky;
        List<Integer> E5 = E5(user);
        if (E5 == null) {
            return;
        }
        C66415Q4t.LIZJ(user, E5);
        ArrayList arrayList = new ArrayList();
        List<ProfileListFragment> list = this.LJLJJL;
        if (list == null) {
            this.LJLJJL = new ArrayList(E5.size());
        } else {
            arrayList.addAll(list);
            List<ProfileListFragment> list2 = this.LJLJJL;
            if (list2 != null) {
                list2.clear();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        List<Integer> list3 = this.LJLJJLL;
        if (list3 == null) {
            this.LJLJJLL = new ArrayList(E5.size());
        } else {
            arrayList2.addAll(list3);
            List<Integer> list4 = this.LJLJJLL;
            if (list4 != null) {
                list4.clear();
            }
        }
        Iterator<Integer> it = E5.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (arrayList2.contains(Integer.valueOf(c6(intValue)))) {
                int indexOf = arrayList2.indexOf(Integer.valueOf(c6(intValue)));
                v3((ProfileListFragment) ListProtector.get(arrayList, indexOf), (Integer) ListProtector.get(arrayList2, indexOf));
                U5(intValue);
            } else {
                E3(intValue);
            }
        }
        C26175APb z4 = z4();
        if (z4 != null && z4.LJLLI && (c80648Vky = this.LJLJL) != null) {
            c80648Vky.post(new ARunnableS51S0100000_15(c80648Vky, 54));
        }
    }

    public final void F4(boolean z) {
        Integer valueOf;
        Fragment fragment;
        List<ProfileListFragment> list = this.LJLJJL;
        if (list != null) {
            int i = this.LJLJLLL;
            if (i < 0 || i >= list.size()) {
                return;
            }
            List<ProfileListFragment> list2 = this.LJLJJL;
            if (list2 != null && (fragment = (Fragment) ListProtector.get(list2, this.LJLJLLL)) != null) {
                fragment.setUserVisibleHint(z);
            }
        }
        if (z && !this.LJLLILLLL) {
            C255209zw.LJ();
        }
        this.LJLLILLLL = false;
        List<Integer> list3 = this.LJLJJLL;
        if (list3 != null && (valueOf = Integer.valueOf(list3.indexOf(18))) != null && valueOf.intValue() != -1 && z) {
            getContext();
            C26335AVf.LJJ("repost_history_show", "personal_homepage", u4(), "");
        }
    }

    public List<Integer> G5(String str) {
        List<Integer> LLJILJILJ;
        List LIZ = C35789E2v.LIZ();
        if (LIZ == null || (LLJILJILJ = ORZ.LLJILJILJ(LIZ)) == null) {
            return null;
        }
        Iterator<Integer> it = LLJILJILJ.iterator();
        while (it.hasNext()) {
            if (!C5(str, it.next().intValue())) {
                it.remove();
            }
        }
        return LLJILJILJ;
    }

    @Override // X.InterfaceC86908Y8y
    public void LIZJ(int i) {
        String str;
        Integer num;
        int i2;
        ProfileListFragment profileListFragment;
        IProfileMusicTabService Y3;
        String str2 = C255199zv.LIZIZ;
        String LJIJI = C79234V7u.LJIJI(i);
        C9IB<ProfileComponents> g4 = g4();
        Integer num2 = null;
        if (g4 != null) {
            str = g4.LJLJI;
        } else {
            str = null;
        }
        String str3 = "sticker_set_details_page";
        if (!o.LJ(str, "sticker_set_details_page")) {
            str3 = "personal_homepage";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJIIIZ("enter_method", "click");
        c188727au.LJIIIZ("tab_name", LJIJI);
        c188727au.LJIIIZ("to_user_id", u4());
        FMX.LJIIL("change_profile_tab", c188727au.LIZ);
        List<Integer> list = this.LJLJJLL;
        if (list != null) {
            num = Integer.valueOf(list.indexOf(8));
        } else {
            num = null;
        }
        if (num != null && num.intValue() != -1 && i == 8) {
            C26335AVf.LJJI(getContext(), str2, num.intValue(), "click");
        } else if (i == 17) {
            List<Integer> list2 = this.LJLJJLL;
            if (list2 != null) {
                i2 = list2.indexOf(Integer.valueOf(i));
            } else {
                i2 = 0;
            }
            List<ProfileListFragment> list3 = this.LJLJJL;
            if (list3 != null && (profileListFragment = (ProfileListFragment) ORZ.LJLLLLLL(i2, list3)) != null && (Y3 = Y3()) != null) {
                Y3.LJI(profileListFragment);
            }
        }
        List<Integer> list4 = this.LJLJJLL;
        if (list4 != null) {
            num2 = Integer.valueOf(list4.indexOf(Integer.valueOf(i)));
        }
        if (i == 18 && num2 != null && num2.intValue() != -1) {
            getContext();
            C26335AVf.LJJ("repost_history_click", str3, u4(), "click");
        }
        this.LJLLI = true;
    }

    public void M3(int i) {
        K3(0);
    }

    public void N3(int i) {
        K3(1);
    }

    public final void O3(List<Integer> list) {
        int indexOf;
        int indexOf2;
        o.LJIIIZ(list, "list");
        if (((Number) C53056Ks0.LIZ.getValue()).intValue() != 1 || (indexOf = list.indexOf(15)) < 0 || (indexOf2 = list.indexOf(6)) < 0) {
            return;
        }
        ListProtector.remove(list, indexOf);
        ListProtector.add(list, indexOf2, 15);
    }

    public final void P3(List<Integer> list) {
        o.LJIIIZ(list, "list");
        int indexOf = list.indexOf(15);
        if (indexOf < 0) {
            return;
        }
        ListProtector.remove(list, indexOf);
        int indexOf2 = list.indexOf(2);
        if (indexOf2 < 0) {
            return;
        }
        ListProtector.add(list, indexOf2, 15);
    }

    public EffectProfileListFragment U3(int i) {
        Fragment fragment;
        FragmentManager childFragmentManager;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (childFragmentManager = LIZLLL.getChildFragmentManager()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI);
            LIZ.append('4');
            fragment = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ));
        } else {
            fragment = null;
        }
        if (fragment instanceof EffectProfileListFragment) {
            return (EffectProfileListFragment) fragment;
        }
        return C73222SoU.LIZ(i, u4(), n4(), P4());
    }

    public final void U5(int i) {
        C9IL c9il = C9IL.TAB;
        String lowerCase = q4(i).name().toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, true, c9il, lowerCase, true);
    }

    public void Y4(MFC mfc) {
        o.LJIIIZ(mfc, "<set-?>");
        this.LLIIIJ = mfc;
    }

    public ProfileListFragment a4(int i) {
        Fragment fragment;
        FragmentManager childFragmentManager;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (childFragmentManager = LIZLLL.getChildFragmentManager()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI);
            LIZ.append('0');
            fragment = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ));
        } else {
            fragment = null;
        }
        IProfileMusicTabService Y3 = Y3();
        if (Y3 == null) {
            return null;
        }
        return Y3.LJII(fragment, new OriginMusicArg(getUser(), P4(), u4(), n4(), i, e4()));
    }

    public final void a5(C86904Y8u c86904Y8u) {
        o.LJIIIZ(c86904Y8u, "<set-?>");
        this.LJLZ = c86904Y8u;
    }

    public final void c5(ProfileViewModel profileViewModel) {
        o.LJIIIZ(profileViewModel, "<set-?>");
        this.LL = profileViewModel;
    }

    public int c6(int i) {
        if (i != 0) {
            if (i == 6) {
                return 8;
            }
            if (i != 8) {
                if (i != 10) {
                    if (i != 12) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    switch (i) {
                                        case 14:
                                            return 20;
                                        case 15:
                                            return 18;
                                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                            return 19;
                                        case 17:
                                            return 21;
                                        default:
                                            return -1;
                                    }
                                }
                                return 6;
                            }
                            if (!f5()) {
                                return 3;
                            }
                            return 17;
                        }
                        return 1;
                    }
                    return 16;
                }
                return 14;
            }
            return 13;
        }
        return 0;
    }

    public boolean e5(User user) {
        if (!AV1.LJIJ(user)) {
            if (!C86034Xpe.LIZIZ.forcedPrivateSettingForLikedVideo()) {
                return true;
            }
        } else if (user == null || user.getTabSetting() == null || !user.getTabSetting().isHideLikeTab()) {
            return true;
        }
        return false;
    }

    public int i5(User user) {
        int i;
        if (user != null && user.getTabSetting() != null && user.getTabSetting().getPrivateTab() != null) {
            i = user.getTabSetting().getPrivateTab().getPrivateTabStyle();
            if (i < 1 || i > 3) {
                return 1;
            }
        } else {
            i = 1;
        }
        return i;
    }

    @QD3
    public void onNeedScrollToTop(MF7 event) {
        boolean z;
        o.LJIIIZ(event, "event");
        if (HG3.LJIILL().isLogin() && AV1.LJIJ(getUser())) {
            z = true;
        } else {
            z = false;
        }
        C80648Vky c80648Vky = this.LJLJL;
        if (c80648Vky != null && z == event.LJLIL) {
            c80648Vky.LIZLLL(0L);
        }
    }

    @QD3
    public void onProfilePageScrollToPosition(MF5 event) {
        boolean z;
        o.LJIIIZ(event, "event");
        if (HG3.LJIILL().isLogin() && AV1.LJIJ(getUser())) {
            z = true;
        } else {
            z = false;
        }
        C80648Vky c80648Vky = this.LJLJL;
        if (c80648Vky != null && z == event.LJLIL) {
            c80648Vky.LIZJ(event.LJLILLLLZI);
        }
    }

    @Override // X.InterfaceC86908Y8y
    public void onSelect(int i) {
        String str;
        Integer num;
        S4(i);
        String LJIJI = C79234V7u.LJIJI(i);
        String str2 = C255199zv.LIZIZ;
        C255199zv.LIZIZ = LJIJI;
        if (this.LJLLI) {
            this.LJLLI = false;
            return;
        }
        C9IB<ProfileComponents> g4 = g4();
        Integer num2 = null;
        if (g4 != null) {
            str = g4.LJLJI;
        } else {
            str = null;
        }
        String str3 = "sticker_set_details_page";
        if (!o.LJ(str, "sticker_set_details_page")) {
            str3 = "personal_homepage";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJIIIZ("enter_method", c4().LJLIL);
        c188727au.LJIIIZ("tab_name", LJIJI);
        c188727au.LJIIIZ("to_user_id", u4());
        FMX.LJIIL("change_profile_tab", c188727au.LIZ);
        List<Integer> list = this.LJLJJLL;
        if (list != null) {
            num = Integer.valueOf(list.indexOf(8));
        } else {
            num = null;
        }
        if (num != null && num.intValue() != -1 && i == 8) {
            C26335AVf.LJJI(getContext(), str2, num.intValue(), c4().LJLIL);
        }
        List<Integer> list2 = this.LJLJJLL;
        if (list2 != null) {
            num2 = Integer.valueOf(list2.indexOf(Integer.valueOf(i)));
        }
        if (i == 18 && num2 != null && num2.intValue() != -1) {
            getContext();
            C26335AVf.LJJ("repost_history_click", str3, u4(), "");
        }
        AwemePagerVM c4 = c4();
        c4.getClass();
        c4.LJLIL = "slide";
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUpdateWhoCanSeeMyLikeListModeEvent(MGO mgo) {
        String str;
        User user = getUser();
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        if (TextUtils.equals(str, HG3.LJIILL().getCurUserId())) {
            Z5();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TabSetting tabSetting;
        BATab bATab;
        C80648Vky c80648Vky;
        o.LJIIIZ(view, "view");
        this.LJLJL = (C80648Vky) view.findViewById(R.id.jcm);
        this.LJLLLLLL = view.findViewById(R.id.i9l);
        O4();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        C80648Vky c80648Vky2 = this.LJLJL;
        if (c80648Vky2 != null) {
            c80648Vky2.setLayoutParams(layoutParams);
        }
        C80648Vky c80648Vky3 = this.LJLJL;
        if (c80648Vky3 != null) {
            c80648Vky3.setOnScrollListener(new YF8(this));
        }
        if (C26360AWe.LIZ() && (c80648Vky = this.LJLJL) != null) {
            c80648Vky.LLIIIL = new YF6(this);
        }
        View findViewById = view.findViewById(R.id.i9e);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.profile_navigator)");
        a5((C86904Y8u) findViewById);
        this.LJZ = (C86894Y8k) view.findViewById(R.id.l4v);
        J4();
        VW9 vw9 = (VW9) view.findViewById(R.id.jd2);
        this.LJZI = vw9;
        if (vw9 != null) {
            vw9.setOffscreenPageLimit(2);
        }
        initData();
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.AUK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS181S0100000_15(this, 205));
        C8YN.LJII(this, c4(), new TBT() { // from class: X.YFD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((Y4J) obj).LJLIL);
            }
        }, C213688a4.LIZLLL(), new AqS197S0100000_15(this, 32), 4);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.AUJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LJII;
            }
        }, new AqS181S0100000_15(this, 206));
        User user = getUser();
        if (user != null && (tabSetting = user.getTabSetting()) != null && (bATab = tabSetting.baTab) != null && o.LJ(bATab.getShowBATab(), Boolean.TRUE)) {
            BAProfilePageServiceImpl.LJIIJJI().LJII();
        }
    }

    public String r4(int i) {
        int i2;
        List<Integer> list = this.LJLJJLL;
        if (list != null) {
            int i3 = 0;
            if (list.isEmpty()) {
                return "";
            }
            List<Integer> list2 = this.LJLJJLL;
            if (list2 != null) {
                i3 = list2.size();
            }
            if (i >= i3) {
                return "";
            }
            List<Integer> list3 = this.LJLJJLL;
            if (list3 != null) {
                i2 = ((Number) ListProtector.get(list3, i)).intValue();
            } else {
                i2 = -1;
            }
            return C79234V7u.LJIJI(i2);
        }
        return "";
    }

    @Override // X.InterfaceC238569Xw
    public void yc(boolean z) {
        int i;
        int i2;
        Y4F y4f;
        Y4F y4f2;
        int i3;
        View view = null;
        if (C52216KeS.LIZ() || C86907Y8x.LIZJ()) {
            C86894Y8k c86894Y8k = this.LJZ;
            if (c86894Y8k != null) {
                List<Integer> list = this.LJLJJLL;
                if (list != null) {
                    i = list.indexOf(1);
                } else {
                    i = 0;
                }
                C78856UxA tabAt = c86894Y8k.getTabAt(i);
                if (tabAt != null) {
                    view = tabAt.LJFF;
                }
            }
        } else {
            C86904Y8u Z3 = Z3();
            List<Integer> list2 = this.LJLJJLL;
            if (list2 != null) {
                i3 = list2.indexOf(1);
            } else {
                i3 = 0;
            }
            view = Z3.LIZIZ(i3);
        }
        C86894Y8k c86894Y8k2 = this.LJZ;
        if (c86894Y8k2 != null && c86894Y8k2.getTabViewMode() == 1) {
            if (!z) {
                if ((view instanceof Y4F) && (y4f2 = (Y4F) view) != null) {
                    y4f2.setAdditionalSupportImageResource(R.raw.icon_lock_large_fill);
                    return;
                }
                return;
            }
            if (!(view instanceof Y4F) || (y4f = (Y4F) view) == null) {
                return;
            }
            y4f.setAdditionViewVisibility(8);
            return;
        }
        if (!(view instanceof LBE)) {
            return;
        }
        LBE lbe = (LBE) view;
        if (z) {
            i2 = R.raw.icon_3pt_heart;
        } else {
            i2 = R.raw.icon_3pt_heart_eye_slash;
        }
        lbe.setImageResource(i2);
    }

    public boolean B5(User user, int i) {
        TabSetting tabSetting;
        ShopTab shopTab;
        TabSetting tabSetting2;
        RepostTab repostTab;
        TabSetting tabSetting3;
        RepostTab repostTab2;
        TabSetting tabSetting4;
        TabSetting tabSetting5;
        BATab bATab;
        ShopTab shopTab2;
        TabSetting tabSetting6;
        ShopTab shopTab3;
        TabSetting tabSetting7;
        StickerTab stickerTab;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    String str = null;
                    if (i != 6) {
                        if (i != 10) {
                            if (i != 12) {
                                switch (i) {
                                    case 14:
                                        if (user != null && (tabSetting6 = user.getTabSetting()) != null && (shopTab3 = tabSetting6.shopTab) != null && shopTab3.showShopTab) {
                                            String shopSchemaV2 = shopTab3.shopSchemaV2;
                                            o.LJIIIIZZ(shopSchemaV2, "shopSchemaV2");
                                            if (!ujb.o.LJJJJJL(shopSchemaV2)) {
                                                return true;
                                            }
                                        }
                                        break;
                                    case 15:
                                        if (C7HP.LIZIZ()) {
                                            return false;
                                        }
                                        if (P4()) {
                                            if (user != null && (tabSetting3 = user.getTabSetting()) != null && (repostTab2 = tabSetting3.repostTab) != null && repostTab2.getShowRepostSelf() == EnumC62322cW.SHOW_TAB.ordinal()) {
                                                return true;
                                            }
                                            return false;
                                        }
                                        if (o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE) || user == null || (tabSetting2 = user.getTabSetting()) == null || (repostTab = tabSetting2.repostTab) == null || repostTab.getShowRepostOther() != EnumC62322cW.SHOW_TAB.ordinal()) {
                                            return false;
                                        }
                                        if (user.getTabSetting().repostTab.getRepostShowForPublic() || user.isAcquaintance || user.getFollowStatus() == 2) {
                                            return true;
                                        }
                                        return false;
                                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                        if (user != null && (tabSetting7 = user.getTabSetting()) != null && (stickerTab = tabSetting7.stickerTab) != null && o.LJ(stickerTab.getShowStickerTab(), Boolean.TRUE) && !IMService.createIIMServicebyMonsterPlugin(false).getImStickerStoreService().LJIIJ() && !LFH.LIZIZ.LIZLLL().block().LJ()) {
                                            return true;
                                        }
                                        break;
                                    case 17:
                                        if (user != null && (((tabSetting4 = user.getTabSetting()) == null || (shopTab2 = tabSetting4.shopTab) == null || !shopTab2.showShopTab) && (tabSetting5 = user.getTabSetting()) != null && (bATab = tabSetting5.baTab) != null && o.LJ(bATab.getShowBATab(), Boolean.TRUE))) {
                                            return true;
                                        }
                                        break;
                                    default:
                                        if (user != null) {
                                            str = user.getUid();
                                        }
                                        return C5(str, i);
                                }
                            } else if (user != null && (tabSetting = user.getTabSetting()) != null && (shopTab = tabSetting.shopTab) != null && shopTab.showShopTab) {
                                String shopSchemaV22 = shopTab.shopSchemaV2;
                                o.LJIIIIZZ(shopSchemaV22, "shopSchemaV2");
                                if (ujb.o.LJJJJJL(shopSchemaV22)) {
                                    return true;
                                }
                            }
                        } else if (i5(user) == 2 || i5(user) == 3) {
                            return true;
                        }
                    } else {
                        if (TextUtils.equals(u4(), ((RBX) HG3.LJIILL()).getCurUserId())) {
                            if (user != null) {
                                str = user.getUid();
                            }
                            return C5(str, i);
                        }
                        if (user != null && user.hasOpenFavorite && !user.isBlock) {
                            return true;
                        }
                    }
                } else if (user != null) {
                    return user.isShowEffectList();
                }
            } else if ((user != null && user.getShowArtistPlaylist() == 1) || f5()) {
                return true;
            }
            return false;
        }
        return e5(user);
    }

    public boolean C5(String str, int i) {
        return ORY.LJJIJIIJIL(Integer.valueOf(i), new Integer[]{0, 2, 6});
    }

    public void v3(ProfileListFragment profileListFragment, Integer num) {
        List<Integer> list;
        List<ProfileListFragment> list2;
        int i;
        if (profileListFragment instanceof AwemeListFragmentImpl) {
            ((AwemeListFragmentImpl) profileListFragment).LLJLILLLLZIIL = C212428Vi.LIZLLL(this);
        }
        List<Integer> list3 = this.LJLJJLL;
        if (list3 == null) {
            return;
        }
        if (ORZ.LJLJJI(num, list3)) {
            List<Integer> list4 = this.LJLJJLL;
            if (list4 != null) {
                i = list4.indexOf(num);
            } else {
                i = -1;
            }
            List<ProfileListFragment> list5 = this.LJLJJL;
            if (list5 != null) {
                ListProtector.remove(list5, i);
            }
            List<Integer> list6 = this.LJLJJLL;
            if (list6 != null) {
                ListProtector.remove(list6, i);
            }
        }
        if (profileListFragment != null && (list2 = this.LJLJJL) != null) {
            list2.add(profileListFragment);
        }
        if (num != null && (list = this.LJLJJLL) != null) {
            list.add(num);
        }
    }

    public void N0(int i, float f, int i2) {
        if (f != 0.0f) {
            this.LJLL = KL2.LJIIJJI(getContext()) / 3;
        }
        ProfileListFragment profileListFragment = this.LLIIII;
        if (profileListFragment != null) {
            profileListFragment.N0(i, f, i2);
        }
    }

    public static /* synthetic */ EffectProfileListFragment W3(AwemePagerAssemV2 awemePagerAssemV2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = -1;
            }
            return awemePagerAssemV2.U3(i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEffectFragment");
    }

    public static /* synthetic */ ProfileListFragment b4(AwemePagerAssemV2 awemePagerAssemV2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return awemePagerAssemV2.a4(i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOriginalMusicListFragment");
    }
}
