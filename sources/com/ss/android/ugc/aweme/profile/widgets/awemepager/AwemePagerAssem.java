package com.ss.android.ugc.aweme.profile.widgets.awemepager;

import X.AFB;
import X.AV1;
import X.ActivityC45651qj;
import X.C10120aW;
import X.C10K;
import X.C17J;
import X.C1JI;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C235779Nd;
import X.C255209zw;
import X.C26175APb;
import X.C26335AVf;
import X.C26360AWe;
import X.C2RZ;
import X.C35789E2v;
import X.C47704Ins;
import X.C52216KeS;
import X.C52460KiO;
import X.C53056Ks0;
import X.C55096Ljo;
import X.C55230Lly;
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
import X.C8VC;
import X.C8YN;
import X.C9ID;
import X.C9IL;
import X.C9KV;
import X.C9PN;
import X.EnumC56485MEv;
import X.EnumC62322cW;
import X.FMX;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
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
import X.YCY;
import X.YCZ;
import X.YF5;
import X.YF7;
import X.YF9;
import X.YFA;
import X.YFE;
import X.YFG;
import Y.ACallableS0S1101100_9;
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
import com.ss.android.ugc.aweme.profile.tab.profiletab.mob.IProfileTabEventAbility;
import com.ss.android.ugc.aweme.profile.tab.profiletab.mob.ProfileTabEvent;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
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
public abstract class AwemePagerAssem extends UIContentAssem implements InterfaceC238569Xw, InterfaceC86908Y8y {
    public static final YFE LLIIJI = new YFE();
    public final C214298b3 LJLIL;
    public final String LJLILLLLZI;
    public List<ProfileListFragment> LJLJI;
    public List<Integer> LJLJJI;
    public C80648Vky LJLJJL;
    public T6H<ProfileListFragment> LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final User LJLLILLLL;
    public final String LJLLJ;
    public final String LJLLL;
    public View LJLLLL;
    public C86904Y8u LJLLLLLL;
    public C86894Y8k LJLZ;
    public VW9 LJZ;
    public C2RZ LJZI;
    public ProfileViewModel LJZL;
    public final C55749LuL LL;
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

    private final void E4() {
        Integer num;
        int i;
        int LJ;
        int i2;
        Rect rect = C57092Lx.LIZ.LJ.LIZJ;
        if (rect != null) {
            num = Integer.valueOf(rect.top);
        } else {
            num = null;
        }
        if (I4()) {
            if (num != null) {
                i2 = num.intValue();
                this.LLFF = i2;
            } else {
                LJ = C60996Nwm.LJ(C212428Vi.LIZ(this));
                i = C61447O9r.LIZ();
            }
        } else {
            if (num != null) {
                i = (C60996Nwm.LJ(C212428Vi.LIZ(this)) - num.intValue()) - C61447O9r.LIZ();
            } else {
                i = 0;
            }
            LJ = C60996Nwm.LJ(C212428Vi.LIZ(this));
        }
        i2 = LJ - i;
        this.LLFF = i2;
    }

    private final String k4(int i) {
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

    public void B4() {
    }

    public abstract boolean C4(int i);

    public abstract void E3(int i);

    public boolean I4() {
        return false;
    }

    public boolean J4() {
        return true;
    }

    public abstract void R4();

    public void S4() {
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

    public void n5() {
        String str;
        if (this.LLIIIL > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.LLIIIL;
            if (currentTimeMillis > 0) {
                if (I4()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C10K.LIZIZ(new ACallableS0S1101100_9(this, str, currentTimeMillis, this.LJLJL, 1), FMX.LIZIZ(), null);
            }
            this.LLIIIL = -1L;
        }
    }

    @Override // X.InterfaceC238569Xw, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public AwemePagerAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(AwemePagerVM.class);
        this.LJLIL = new C214298b3(new AqS165S0100000_15(LIZ, 601), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), YCY.INSTANCE, LIZ);
        this.LJLILLLLZI = C10120aW.LIZ("android:switcher:", R.id.jd2, ':');
        this.LJLLI = true;
        this.LL = new C55749LuL(C47704Ins.LJ(this, C26175APb.class, null), checkSupervisorPrepared());
        this.LLD = new C55749LuL(C47704Ins.LJ(this, C9ID.class, null), checkSupervisorPrepared());
        this.LLFF = EnumC56485MEv.UNINITIALIZED.getValue();
        this.LLFZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 602));
        this.LLIIIILZ = C221108m2.LIZIZ(YCZ.LJLIL);
        this.LLIIIJ = new YFA(this);
        this.LLIIIL = -1L;
    }

    private final Aweme getAweme() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJI;
        }
        return null;
    }

    private final C9ID getMineProfileInitData() {
        return (C9ID) this.LLD.getValue();
    }

    private final C26175APb r4() {
        return (C26175APb) this.LL.getValue();
    }

    public final void L3() {
        C80648Vky c80648Vky = this.LJLJJL;
        if (c80648Vky == null) {
            return;
        }
        c80648Vky.setMinY(0);
    }

    @Override // X.InterfaceC238569Xw
    public void Qb() {
        InterfaceC36571c5 interfaceC36571c5;
        List<ProfileListFragment> list = this.LJLJI;
        if (list == null || (interfaceC36571c5 = (ProfileListFragment) ORZ.LJLLLLLL(this.LJLJL, list)) == null) {
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

    public int U3() {
        List<ProfileListFragment> list = this.LJLJI;
        if (list == null || ListProtector.get(list, this.LJLJL) == null) {
            return EnumC56485MEv.UNINITIALIZED.getValue();
        }
        List<ProfileListFragment> list2 = this.LJLJI;
        o.LJI(list2);
        return ((ProfileListFragment) ListProtector.get(list2, this.LJLJL)).wl();
    }

    public final void W5() {
        boolean z;
        Integer LIZ = C235779Nd.LIZ.LJIIJJI().LIZ();
        if ((LIZ != null && LIZ.intValue() == 0) || !AV1.LJIJ(getMUser())) {
            z = true;
        } else {
            z = false;
        }
        yc(z);
    }

    public final ProfileViewModel X3() {
        ProfileViewModel profileViewModel = this.LJZL;
        if (profileViewModel != null) {
            return profileViewModel;
        }
        o.LJIJI("mProfileViewModel");
        throw null;
    }

    public final IProfileMusicTabService Y3() {
        return (IProfileMusicTabService) this.LLIIIILZ.getValue();
    }

    public final C86904Y8u Z3() {
        C86904Y8u c86904Y8u = this.LJLLLLLL;
        if (c86904Y8u != null) {
            return c86904Y8u;
        }
        o.LJIJI("navigator");
        throw null;
    }

    public final AwemePagerVM c4() {
        return (AwemePagerVM) this.LJLIL.getValue();
    }

    public int g4() {
        List<Integer> list = this.LJLJJI;
        if (list == null) {
            return -1;
        }
        o.LJI(list);
        return list.indexOf(0);
    }

    public final ALAdapterS12S0100000_15 m4() {
        return (ALAdapterS12S0100000_15) this.LLFZ.getValue();
    }

    public final void u4() {
        VW9 vw9;
        VW9 vw92 = this.LJZ;
        if ((vw92 != null && vw92.getCurrentItem() == g4()) || g4() == -1 || (vw9 = this.LJZ) == null) {
            return;
        }
        vw9.setCurrentItem(g4(), false);
    }

    public final void xg() {
        List<Integer> list = this.LJLJJI;
        if (list == null || list.isEmpty()) {
            return;
        }
        F3(getMUser());
        F4(C212428Vi.LIZ(this));
        W5();
        T6H<ProfileListFragment> t6h = this.LJLJJLL;
        if (t6h != null) {
            t6h.notifyDataSetChanged();
        }
    }

    private final void G4() {
        View view;
        if (AV1.LJIIJJI() && (view = this.LJLLLL) != null) {
            view.setPadding(0, 0, 0, 0);
        }
    }

    private final List<Integer> U5() {
        return C35789E2v.LIZ();
    }

    private final void a5() {
        if (C86907Y8x.LIZJ()) {
            Z3().setVisibility(8);
            C86894Y8k c86894Y8k = this.LJLZ;
            if (c86894Y8k != null) {
                c86894Y8k.setVisibility(0);
            }
            C86894Y8k c86894Y8k2 = this.LJLZ;
            if (c86894Y8k2 != null) {
                c86894Y8k2.setMode(1);
                return;
            }
            return;
        }
        if (C52216KeS.LIZ()) {
            C86894Y8k c86894Y8k3 = this.LJLZ;
            if (c86894Y8k3 != null) {
                c86894Y8k3.setMode(0);
            }
            Z3().setVisibility(8);
            C86894Y8k c86894Y8k4 = this.LJLZ;
            if (c86894Y8k4 == null) {
                return;
            }
            c86894Y8k4.setVisibility(0);
            return;
        }
        Z3().setVisibility(0);
        C86894Y8k c86894Y8k5 = this.LJLZ;
        if (c86894Y8k5 == null) {
            return;
        }
        c86894Y8k5.setVisibility(8);
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

    public final boolean e5() {
        IProfileMusicTabService Y3;
        User mUser = getMUser();
        if (mUser == null || (Y3 = Y3()) == null) {
            return false;
        }
        return Y3.LJIJI(mUser);
    }

    public final boolean f5() {
        IProfileMusicTabService Y3;
        User mUser = getMUser();
        if (mUser == null || (Y3 = Y3()) == null) {
            return false;
        }
        return Y3.LJIJJ(mUser);
    }

    public void i5() {
        this.LLIIIL = System.currentTimeMillis();
    }

    public void initData() {
        FragmentManager fragmentManager;
        if (getMUser() == null) {
            H3(q4());
        } else {
            F3(getMUser());
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            fragmentManager = LIZLLL.getChildFragmentManager();
        } else {
            fragmentManager = null;
        }
        T6H<ProfileListFragment> t6h = new T6H<>(fragmentManager, this.LJLJI, this.LJLJJI);
        this.LJLJJLL = t6h;
        VW9 vw9 = this.LJZ;
        if (vw9 != null) {
            vw9.setAdapter(t6h);
        }
        F4(LIZ);
        A4(this.LJLJL);
        VW9 vw92 = this.LJZ;
        if (vw92 != null) {
            vw92.setCurrentItem(this.LJLJL);
        }
        VW9 vw93 = this.LJZ;
        if (vw93 != null) {
            vw93.addOnPageChangeListener(new IDiS276S0100000_15(this, 4));
        }
        W5();
        E4();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            X4(AFB.LIZ(LIZLLL));
        }
        super.onCreate();
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL2, null), new ProfileTabEvent(), IProfileTabEventAbility.class, null);
        }
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IProfileTabEventAbility.class, null);
        }
        EventBus.LIZJ().LJIJ(this);
    }

    public final float x3() {
        int U3 = U3();
        if (C1JI.LJJ(U3) || U3 > this.LLFF) {
            return 0.0f;
        }
        C80648Vky c80648Vky = this.LJLJJL;
        if (c80648Vky != null && c80648Vky.getCurScrollY() == 0) {
            return 0.0f;
        }
        return this.LLFF - U3;
    }

    public MFC W3() {
        return this.LLIIIJ;
    }

    public User getMUser() {
        return this.LJLLILLLL;
    }

    public String l4() {
        return this.LJLLL;
    }

    public String q4() {
        return this.LJLLJ;
    }

    private final void F4(ActivityC45651qj activityC45651qj) {
        View view;
        AwemePagerAssem awemePagerAssem = this;
        View view2 = null;
        IProfileTabEventAbility iProfileTabEventAbility = (IProfileTabEventAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(awemePagerAssem), IProfileTabEventAbility.class, null);
        if (iProfileTabEventAbility != null) {
            iProfileTabEventAbility.B6();
        }
        if (C86907Y8x.LIZJ() || C52216KeS.LIZ()) {
            C86894Y8k c86894Y8k = awemePagerAssem.LJLZ;
            if (c86894Y8k != null) {
                AwemePagerVM c4 = awemePagerAssem.c4();
                boolean I4 = awemePagerAssem.I4();
                int tabViewMode = c86894Y8k.getTabViewMode();
                Aweme aweme = awemePagerAssem.getAweme();
                c4.LJLJI = I4;
                c4.LJLJJI = Integer.valueOf(tabViewMode);
                c4.LJLJJL = aweme;
                AwemePagerVM c42 = awemePagerAssem.c4();
                Fragment LIZLLL = C212428Vi.LIZLLL(awemePagerAssem);
                if (LIZLLL != null) {
                    view2 = LIZLLL.getView();
                }
                C86901Y8r c86901Y8r = new C86901Y8r(c42, c86894Y8k, view2);
                c86901Y8r.LIZ();
                List<C79235V7v> list = c86901Y8r.LIZ;
                List<C79237V7x> list2 = c86901Y8r.LIZIZ;
                C86894Y8k c86894Y8k2 = awemePagerAssem.LJLZ;
                if (c86894Y8k2 != null) {
                    c86894Y8k2.LIZJ(awemePagerAssem.LJZ, awemePagerAssem.I4(), list, list2, awemePagerAssem.LJLJL, awemePagerAssem);
                }
            }
        } else {
            C86904Y8u Z3 = awemePagerAssem.Z3();
            AwemePagerVM c43 = awemePagerAssem.c4();
            User mUser = awemePagerAssem.getMUser();
            Aweme aweme2 = awemePagerAssem.getAweme();
            Z3.LJLJLLL = c43;
            Z3.LJLL = mUser;
            Z3.LJLLI = aweme2;
            Z3.LJLLLLLL = true;
            C86904Y8u Z32 = awemePagerAssem.Z3();
            VW9 vw9 = awemePagerAssem.LJZ;
            boolean I42 = awemePagerAssem.I4();
            int i = awemePagerAssem.LJLJL;
            Fragment LIZLLL2 = C212428Vi.LIZLLL(awemePagerAssem);
            if (LIZLLL2 != null) {
                view = LIZLLL2.getView();
            } else {
                view = null;
            }
            awemePagerAssem = awemePagerAssem;
            Z32.LIZLLL(activityC45651qj, vw9, I42, awemePagerAssem, i, view);
            IProfileTabEventAbility iProfileTabEventAbility2 = (IProfileTabEventAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(awemePagerAssem), IProfileTabEventAbility.class, null);
            if (iProfileTabEventAbility2 != null) {
                iProfileTabEventAbility2.x60();
            }
            IProfileTabEventAbility iProfileTabEventAbility3 = (IProfileTabEventAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(awemePagerAssem), IProfileTabEventAbility.class, null);
            if (iProfileTabEventAbility3 != null) {
                iProfileTabEventAbility3.sh0();
            }
        }
        C8VC.LJIIJJI(awemePagerAssem, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Pn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PN) obj).LJIIIZ);
            }
        }, new AqS181S0100000_15(awemePagerAssem, 124));
        C8VC.LJIIJJI(awemePagerAssem, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9Pm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PL) obj).LJ);
            }
        }, new AqS181S0100000_15(awemePagerAssem, 125));
    }

    private final void H3(String str) {
        List<Integer> E5 = E5(str);
        if (E5 != null) {
            this.LJLJI = new ArrayList(E5.size());
            this.LJLJJI = new ArrayList(E5.size());
            Iterator<Integer> it = E5.iterator();
            while (it.hasNext()) {
                E3(it.next().intValue());
            }
        }
    }

    private final void I3(int i) {
        int i2;
        C86904Y8u Z3 = Z3();
        List<Integer> list = this.LJLJJI;
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

    private final void K3(int i) {
        if (this._isViewValid && AV1.LJIIZILJ(getMUser(), AV1.LJIJ(getMUser()))) {
            I3(i);
        }
    }

    private final void O4(int i) {
        C17J.LJJJ(this, I4(), k4(i));
    }

    private final void P3(List<Integer> list) {
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

    private final boolean P4(User user) {
        if (!((Boolean) C52460KiO.LIZ.getValue()).booleanValue()) {
            return true;
        }
        if (user != null) {
            if (user.isAccuratePrivateAccount()) {
                if ((user.getFollowStatus() == 1 || user.getFollowStatus() == 2) && user.isShowFavoriteList()) {
                    return true;
                }
            } else if (user.isShowFavoriteList()) {
                return true;
            }
        }
        return false;
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

    private final YF9 n4(int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "285") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d6, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "285") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0118, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2, "prop_detail_panel") != false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A3(com.ss.android.ugc.aweme.profile.model.User r10) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem.A3(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A4(int r6) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem.A4(int):void");
    }

    public final void C3(int i) {
        List<Integer> list = this.LJLJJI;
        if (list == null) {
            return;
        }
        C76732zl c76732zl = new C76732zl();
        int indexOf = list.indexOf(Integer.valueOf(i));
        c76732zl.element = indexOf;
        if (indexOf < 0) {
            c76732zl.element = 0;
        }
        T6H<ProfileListFragment> t6h = this.LJLJJLL;
        o.LJI(t6h);
        c76732zl.element = Math.min(t6h.getCount() - 1, c76732zl.element);
        VW9 vw9 = this.LJZ;
        if (vw9 == null || vw9.getCurrentItem() != c76732zl.element) {
            this.LJLL = true;
            VW9 vw92 = this.LJZ;
            if (vw92 != null) {
                vw92.setCurrentItem(c76732zl.element, false);
            }
        }
        A4(c76732zl.element);
        Z3().post(new ARunnableS34S0200000_15(this, c76732zl, 22));
    }

    public List<Integer> C5(User user) {
        List LIZ = C35789E2v.LIZ();
        if (LIZ != null) {
            List<Integer> LLJILJILJ = ORZ.LLJILJILJ(LIZ);
            P3(LLJILJILJ);
            O3(LLJILJILJ);
            Iterator it = ((ArrayList) LLJILJILJ).iterator();
            while (it.hasNext()) {
                if (!y5(user, ((Number) it.next()).intValue())) {
                    it.remove();
                }
            }
            return LLJILJILJ;
        }
        return null;
    }

    public final void D4(boolean z) {
        Integer valueOf;
        String str;
        Fragment fragment;
        List<ProfileListFragment> list = this.LJLJI;
        if (list != null) {
            int i = this.LJLJL;
            if (i < 0 || i >= list.size()) {
                return;
            }
            List<ProfileListFragment> list2 = this.LJLJI;
            if (list2 != null && (fragment = (Fragment) ListProtector.get(list2, this.LJLJL)) != null) {
                fragment.setUserVisibleHint(z);
            }
        }
        if (z && !this.LJLLI) {
            C255209zw.LJ();
        }
        this.LJLLI = false;
        List<Integer> list3 = this.LJLJJI;
        if (list3 != null && (valueOf = Integer.valueOf(list3.indexOf(18))) != null && valueOf.intValue() != -1 && z) {
            if (I4()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            getContext();
            C26335AVf.LJJ("repost_history_show", str, q4(), "");
        }
    }

    public List<Integer> E5(String str) {
        List<Integer> LLJILJILJ;
        List LIZ = C35789E2v.LIZ();
        if (LIZ == null || (LLJILJILJ = ORZ.LLJILJILJ(LIZ)) == null) {
            return null;
        }
        Iterator<Integer> it = LLJILJILJ.iterator();
        while (it.hasNext()) {
            if (!B5(str, it.next().intValue())) {
                it.remove();
            }
        }
        return LLJILJILJ;
    }

    public void F3(User user) {
        C80648Vky c80648Vky;
        List<Integer> C5 = C5(user);
        if (C5 == null) {
            return;
        }
        C66415Q4t.LIZJ(user, C5);
        ArrayList arrayList = new ArrayList();
        List<ProfileListFragment> list = this.LJLJI;
        if (list == null) {
            this.LJLJI = new ArrayList(C5.size());
        } else {
            o.LJI(list);
            arrayList.addAll(list);
            List<ProfileListFragment> list2 = this.LJLJI;
            if (list2 != null) {
                list2.clear();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        List<Integer> list3 = this.LJLJJI;
        if (list3 == null) {
            this.LJLJJI = new ArrayList(C5.size());
        } else {
            o.LJI(list3);
            arrayList2.addAll(list3);
            List<Integer> list4 = this.LJLJJI;
            if (list4 != null) {
                list4.clear();
            }
        }
        Iterator<Integer> it = C5.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (arrayList2.contains(Integer.valueOf(Z5(intValue)))) {
                int indexOf = arrayList2.indexOf(Integer.valueOf(Z5(intValue)));
                v3((ProfileListFragment) ListProtector.get(arrayList, indexOf), (Integer) ListProtector.get(arrayList2, indexOf));
                G5(intValue);
            } else {
                E3(intValue);
            }
        }
        C26175APb r4 = r4();
        if (r4 != null && r4.LJLLI && (c80648Vky = this.LJLJJL) != null) {
            c80648Vky.post(new ARunnableS51S0100000_15(c80648Vky, 42));
        }
    }

    public final void G5(int i) {
        boolean I4 = I4();
        C9IL c9il = C9IL.TAB;
        String lowerCase = n4(i).name().toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, I4, c9il, lowerCase, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "sticker_set_details_page") != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r2 = "sticker_set_details_page";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d9, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "sticker_set_details_page") != false) goto L12;
     */
    @Override // X.InterfaceC86908Y8y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZJ(int r9) {
        /*
            r8 = this;
            java.lang.String r6 = X.C255199zv.LIZIZ
            java.lang.String r1 = X.C79234V7u.LJIJI(r9)
            boolean r0 = r8.I4()
            if (r0 == 0) goto Ldf
            java.lang.String r2 = "personal_homepage"
        Le:
            boolean r0 = r8.I4()
            java.lang.String r3 = "sticker_set_details_page"
            r7 = 0
            if (r0 == 0) goto Lcd
            X.9ID r0 = r8.getMineProfileInitData()
            if (r0 == 0) goto Lca
            java.lang.String r0 = r0.LJLILLLLZI
        L1f:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 == 0) goto L26
        L25:
            r2 = r3
        L26:
            X.7au r4 = new X.7au
            r4.<init>()
            java.lang.String r0 = "enter_from"
            r4.LJIIIZ(r0, r2)
            java.lang.String r0 = "enter_method"
            java.lang.String r3 = "click"
            r4.LJIIIZ(r0, r3)
            java.lang.String r0 = "tab_name"
            r4.LJIIIZ(r0, r1)
            java.lang.String r1 = r8.q4()
            java.lang.String r0 = "to_user_id"
            r4.LJIIIZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "change_profile_tab"
            X.FMX.LJIIL(r0, r1)
            java.util.List<java.lang.Integer> r4 = r8.LJLJJI
            r1 = 8
            if (r4 == 0) goto Lc8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r0 = r4.indexOf(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L5e:
            r4 = -1
            if (r5 == 0) goto La0
            int r0 = r5.intValue()
            if (r0 == r4) goto La0
            if (r9 != r1) goto La0
            android.content.Context r1 = r8.getContext()
            int r0 = r5.intValue()
            X.C26335AVf.LJJI(r1, r6, r0, r3)
        L74:
            java.util.List<java.lang.Integer> r1 = r8.LJLJJI
            if (r1 == 0) goto L84
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            int r0 = r1.indexOf(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L84:
            r0 = 18
            if (r9 != r0) goto L9c
            if (r7 == 0) goto L9c
            int r0 = r7.intValue()
            if (r0 == r4) goto L9c
            r8.getContext()
            java.lang.String r1 = "repost_history_click"
            java.lang.String r0 = r8.q4()
            X.C26335AVf.LJJ(r1, r2, r0, r3)
        L9c:
            r0 = 1
            r8.LJLJLLL = r0
            return
        La0:
            r0 = 17
            if (r9 != r0) goto L74
            java.util.List<java.lang.Integer> r1 = r8.LJLJJI
            if (r1 == 0) goto Lc6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            int r1 = r1.indexOf(r0)
        Lb0:
            java.util.List<com.ss.android.ugc.aweme.profile.ui.ProfileListFragment> r0 = r8.LJLJI
            if (r0 == 0) goto L74
            java.lang.Object r1 = X.ORZ.LJLLLLLL(r1, r0)
            com.ss.android.ugc.aweme.profile.ui.ProfileListFragment r1 = (com.ss.android.ugc.aweme.profile.ui.ProfileListFragment) r1
            if (r1 == 0) goto L74
            com.ss.android.ugc.aweme.music.service.IProfileMusicTabService r0 = r8.Y3()
            if (r0 == 0) goto L74
            r0.LJI(r1)
            goto L74
        Lc6:
            r1 = 0
            goto Lb0
        Lc8:
            r5 = r7
            goto L5e
        Lca:
            r0 = r7
            goto L1f
        Lcd:
            X.APb r0 = r8.r4()
            if (r0 == 0) goto Ldd
            java.lang.String r0 = r0.LJLJI
        Ld5:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 == 0) goto L26
            goto L25
        Ldd:
            r0 = r7
            goto Ld5
        Ldf:
            java.lang.String r2 = "others_homepage"
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem.LIZJ(int):void");
    }

    public void M3(int i) {
        K3(0);
    }

    public void N3(int i) {
        K3(1);
    }

    public final void O3(List<Integer> list) {
        int indexOf;
        o.LJIIIZ(list, "list");
        if (((Number) C53056Ks0.LIZ.getValue()).intValue() != 1 || (indexOf = list.indexOf(15)) < 0) {
            return;
        }
        ListProtector.remove(list, indexOf);
        int indexOf2 = list.indexOf(6);
        if (indexOf2 < 0) {
            return;
        }
        ListProtector.add(list, indexOf2, 15);
    }

    public EffectProfileListFragment Q3(int i) {
        Fragment fragment;
        FragmentManager childFragmentManager;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (childFragmentManager = LIZLLL.getChildFragmentManager()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLILLLLZI);
            LIZ.append('4');
            fragment = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ));
        } else {
            fragment = null;
        }
        if (fragment instanceof EffectProfileListFragment) {
            return (EffectProfileListFragment) fragment;
        }
        return C73222SoU.LIZ(i, q4(), l4(), I4());
    }

    public void T4(MFC mfc) {
        o.LJIIIZ(mfc, "<set-?>");
        this.LLIIIJ = mfc;
    }

    public final void X4(ProfileViewModel profileViewModel) {
        o.LJIIIZ(profileViewModel, "<set-?>");
        this.LJZL = profileViewModel;
    }

    public final void Y4(C86904Y8u c86904Y8u) {
        o.LJIIIZ(c86904Y8u, "<set-?>");
        this.LJLLLLLL = c86904Y8u;
    }

    public int Z5(int i) {
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
                            if (!e5()) {
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

    public ProfileListFragment a4(int i) {
        Fragment fragment;
        FragmentManager childFragmentManager;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (childFragmentManager = LIZLLL.getChildFragmentManager()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLILLLLZI);
            LIZ.append('0');
            fragment = childFragmentManager.LJJJIL(X1D.LIZIZ(LIZ));
        } else {
            fragment = null;
        }
        IProfileMusicTabService Y3 = Y3();
        if (Y3 == null) {
            return null;
        }
        return Y3.LJII(fragment, new OriginMusicArg(getMUser(), I4(), q4(), l4(), i, e4()));
    }

    public boolean c5(User user) {
        if (!AV1.LJIJ(user)) {
            if (!C86034Xpe.LIZIZ.forcedPrivateSettingForLikedVideo() && P4(user)) {
                return true;
            }
        } else if (user == null || user.getTabSetting() == null || !user.getTabSetting().isHideLikeTab()) {
            return true;
        }
        return false;
    }

    public int g5(User user) {
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
        if (HG3.LJIILL().isLogin() && AV1.LJIJ(getMUser())) {
            z = true;
        } else {
            z = false;
        }
        C80648Vky c80648Vky = this.LJLJJL;
        if (c80648Vky != null && z == event.LJLIL) {
            o.LJI(c80648Vky);
            c80648Vky.LIZLLL(0L);
        }
    }

    @QD3
    public void onProfilePageScrollToPosition(MF5 event) {
        boolean z;
        o.LJIIIZ(event, "event");
        if (HG3.LJIILL().isLogin() && AV1.LJIJ(getMUser())) {
            z = true;
        } else {
            z = false;
        }
        C80648Vky c80648Vky = this.LJLJJL;
        if (c80648Vky != null && z == event.LJLIL) {
            c80648Vky.LIZJ(event.LJLILLLLZI);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "sticker_set_details_page") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r5 = "sticker_set_details_page";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r2 = new X.C188727au();
        r2.LJIIIZ("enter_from", r5);
        r2.LJIIIZ("enter_method", c4().LJLIL);
        r2.LJIIIZ("tab_name", r6);
        r2.LJIIIZ("to_user_id", q4());
        X.FMX.LJIIL("change_profile_tab", r2.LIZ);
        r1 = r8.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r1 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        r1 = java.lang.Integer.valueOf(r1.indexOf(8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (r1.intValue() == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (r9 != 8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        X.C26335AVf.LJJI(getContext(), r3, r1.intValue(), c4().LJLIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        r1 = r8.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        r7 = java.lang.Integer.valueOf(r1.indexOf(java.lang.Integer.valueOf(r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        if (r9 != 18) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        if (r7 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if (r7.intValue() == (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        getContext();
        r2 = q4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        if (r8.LJLL == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d5, code lost:
    
        r1 = "auto_switch";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        X.C26335AVf.LJJ("repost_history_click", r5, r2, r1);
        r8.LJLL = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        r1 = "slide";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00de, code lost:
    
        r0 = c4();
        r0.getClass();
        r0.LJLIL = "slide";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fc, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0, "sticker_set_details_page") != false) goto L19;
     */
    @Override // X.InterfaceC86908Y8y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSelect(int r9) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem.onSelect(int):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUpdateWhoCanSeeMyLikeListModeEvent(MGO mgo) {
        String str;
        User mUser = getMUser();
        if (mUser != null) {
            str = mUser.getUid();
        } else {
            str = null;
        }
        if (TextUtils.equals(str, HG3.LJIILL().getCurUserId())) {
            W5();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TabSetting tabSetting;
        BATab bATab;
        C80648Vky c80648Vky;
        o.LJIIIZ(view, "view");
        this.LJLJJL = (C80648Vky) view.findViewById(R.id.jcm);
        this.LJLLLL = view.findViewById(R.id.i79);
        G4();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        C80648Vky c80648Vky2 = this.LJLJJL;
        if (c80648Vky2 != null) {
            c80648Vky2.setLayoutParams(layoutParams);
        }
        C80648Vky c80648Vky3 = this.LJLJJL;
        if (c80648Vky3 != null) {
            c80648Vky3.setOnScrollListener(new YF7(this));
        }
        if (C26360AWe.LIZ() && (c80648Vky = this.LJLJJL) != null) {
            c80648Vky.LLIIIL = new YF5(this);
        }
        View findViewById = view.findViewById(R.id.i9e);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.profile_navigator)");
        Y4((C86904Y8u) findViewById);
        this.LJLZ = (C86894Y8k) view.findViewById(R.id.l4v);
        a5();
        VW9 vw9 = (VW9) view.findViewById(R.id.jd2);
        this.LJZ = vw9;
        if (vw9 != null) {
            vw9.setOffscreenPageLimit(2);
        }
        initData();
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.AUI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS181S0100000_15(this, 126));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.AUH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LJII;
            }
        }, new AqS181S0100000_15(this, 127));
        C8YN.LJII(this, c4(), new TBT() { // from class: X.YFC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((Y4J) obj).LJLIL);
            }
        }, C213688a4.LIZLLL(), new AqS197S0100000_15(this, 27), 4);
        User mUser = getMUser();
        if (mUser != null && (tabSetting = mUser.getTabSetting()) != null && (bATab = tabSetting.baTab) != null && o.LJ(bATab.getShowBATab(), Boolean.TRUE)) {
            BAProfilePageServiceImpl.LJIIJJI().LJII();
        }
    }

    public String p4(int i) {
        List<Integer> list = this.LJLJJI;
        if (list != null) {
            o.LJI(list);
            if (!list.isEmpty()) {
                List<Integer> list2 = this.LJLJJI;
                o.LJI(list2);
                if (i >= list2.size()) {
                    return "";
                }
                List<Integer> list3 = this.LJLJJI;
                o.LJI(list3);
                return C79234V7u.LJIJI(((Number) ListProtector.get(list3, i)).intValue());
            }
            return "";
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
            C86894Y8k c86894Y8k = this.LJLZ;
            if (c86894Y8k != null) {
                List<Integer> list = this.LJLJJI;
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
            List<Integer> list2 = this.LJLJJI;
            if (list2 != null) {
                i3 = list2.indexOf(1);
            } else {
                i3 = 0;
            }
            view = Z3.LIZIZ(i3);
        }
        C86894Y8k c86894Y8k2 = this.LJLZ;
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

    public void z4(int i) {
        List<ProfileListFragment> list;
        T6H<ProfileListFragment> t6h = this.LJLJJLL;
        if (t6h != null && (list = t6h.LJLJJLL) != null) {
            for (ProfileListFragment profileListFragment : list) {
                if (profileListFragment != null) {
                    profileListFragment.vl(i);
                }
            }
        }
    }

    public boolean B5(String str, int i) {
        return ORY.LJJIJIIJIL(Integer.valueOf(i), new Integer[]{0, 2, 6});
    }

    public void v3(ProfileListFragment profileListFragment, Integer num) {
        if (profileListFragment instanceof AwemeListFragmentImpl) {
            ((AwemeListFragmentImpl) profileListFragment).LLJLILLLLZIIL = C212428Vi.LIZLLL(this);
        }
        List<Integer> list = this.LJLJJI;
        if (list == null) {
            return;
        }
        o.LJI(list);
        if (ORZ.LJLJJI(num, list)) {
            List<Integer> list2 = this.LJLJJI;
            o.LJI(list2);
            int indexOf = list2.indexOf(num);
            List<ProfileListFragment> list3 = this.LJLJI;
            o.LJI(list3);
            ListProtector.remove(list3, indexOf);
            List<Integer> list4 = this.LJLJJI;
            o.LJI(list4);
            ListProtector.remove(list4, indexOf);
        }
        List<ProfileListFragment> list5 = this.LJLJI;
        o.LJI(list5);
        o.LJI(profileListFragment);
        list5.add(profileListFragment);
        List<Integer> list6 = this.LJLJJI;
        o.LJI(list6);
        o.LJI(num);
        list6.add(num);
    }

    public boolean y5(User user, int i) {
        TabSetting tabSetting;
        ShopTab shopTab;
        TabSetting tabSetting2;
        RepostTab repostTab;
        TabSetting tabSetting3;
        RepostTab repostTab2;
        TabSetting tabSetting4;
        ShopTab shopTab2;
        TabSetting tabSetting5;
        StickerTab stickerTab;
        TabSetting tabSetting6;
        BATab bATab;
        ShopTab shopTab3;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    String str = null;
                    if (i != 6) {
                        if (i != 10) {
                            if (i == 12) {
                                if (user == null || (tabSetting = user.getTabSetting()) == null || (shopTab = tabSetting.shopTab) == null || !shopTab.showShopTab) {
                                    return false;
                                }
                                String shopSchemaV2 = shopTab.shopSchemaV2;
                                o.LJIIIIZZ(shopSchemaV2, "shopSchemaV2");
                                if (!ujb.o.LJJJJJL(shopSchemaV2)) {
                                    return false;
                                }
                            } else {
                                switch (i) {
                                    case 14:
                                        if (user == null || (tabSetting4 = user.getTabSetting()) == null || (shopTab2 = tabSetting4.shopTab) == null || !shopTab2.showShopTab) {
                                            return false;
                                        }
                                        String shopSchemaV22 = shopTab2.shopSchemaV2;
                                        o.LJIIIIZZ(shopSchemaV22, "shopSchemaV2");
                                        if (!(!ujb.o.LJJJJJL(shopSchemaV22))) {
                                            return false;
                                        }
                                        break;
                                    case 15:
                                        if (C7HP.LIZIZ()) {
                                            return false;
                                        }
                                        if (I4()) {
                                            if (user == null || (tabSetting3 = user.getTabSetting()) == null || (repostTab2 = tabSetting3.repostTab) == null || repostTab2.getShowRepostSelf() != EnumC62322cW.SHOW_TAB.ordinal()) {
                                                return false;
                                            }
                                            return true;
                                        }
                                        if (o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE) || user == null || (tabSetting2 = user.getTabSetting()) == null || (repostTab = tabSetting2.repostTab) == null || repostTab.getShowRepostOther() != EnumC62322cW.SHOW_TAB.ordinal()) {
                                            return false;
                                        }
                                        if (!user.getTabSetting().repostTab.getRepostShowForPublic() && !user.isAcquaintance && user.getFollowStatus() != 2) {
                                            return false;
                                        }
                                        return true;
                                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                        if (user == null || (tabSetting5 = user.getTabSetting()) == null || (stickerTab = tabSetting5.stickerTab) == null || !o.LJ(stickerTab.getShowStickerTab(), Boolean.TRUE) || IMService.createIIMServicebyMonsterPlugin(false).getImStickerStoreService().LJIIJ() || LFH.LIZIZ.LIZLLL().block().LJ()) {
                                            return false;
                                        }
                                        break;
                                    case 17:
                                        if (user == null) {
                                            return false;
                                        }
                                        TabSetting tabSetting7 = user.getTabSetting();
                                        if ((tabSetting7 != null && (shopTab3 = tabSetting7.shopTab) != null && shopTab3.showShopTab) || (tabSetting6 = user.getTabSetting()) == null || (bATab = tabSetting6.baTab) == null || !o.LJ(bATab.getShowBATab(), Boolean.TRUE)) {
                                            return false;
                                        }
                                        break;
                                    default:
                                        if (user != null) {
                                            str = user.getUid();
                                        }
                                        return B5(str, i);
                                }
                            }
                        } else if (g5(user) != 2 && g5(user) != 3) {
                            return false;
                        }
                    } else {
                        if (TextUtils.equals(q4(), ((RBX) HG3.LJIILL()).getCurUserId())) {
                            if (user != null) {
                                str = user.getUid();
                            }
                            return B5(str, i);
                        }
                        if (user == null || !user.hasOpenFavorite || user.isBlock) {
                            return false;
                        }
                    }
                    return true;
                }
                if (user == null) {
                    return false;
                }
                return user.isShowEffectList();
            }
            return f5();
        }
        return c5(user);
    }

    public void N0(int i, float f, int i2) {
        if (f != 0.0f) {
            this.LJLJLJ = KL2.LJIIJJI(getContext()) / 3;
        }
        ProfileListFragment profileListFragment = this.LLIIII;
        if (profileListFragment != null) {
            profileListFragment.N0(i, f, i2);
        }
    }

    public static /* synthetic */ EffectProfileListFragment R3(AwemePagerAssem awemePagerAssem, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = -1;
            }
            return awemePagerAssem.Q3(i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEffectFragment");
    }

    public static /* synthetic */ ProfileListFragment b4(AwemePagerAssem awemePagerAssem, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return awemePagerAssem.a4(i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOriginalMusicListFragment");
    }
}
