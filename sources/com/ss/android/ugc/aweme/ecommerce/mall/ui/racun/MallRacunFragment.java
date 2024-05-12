package com.ss.android.ugc.aweme.ecommerce.mall.ui.racun;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C224498rV;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C27739Aud;
import X.C29S;
import X.C2U8;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C3SZ;
import X.C45804HyK;
import X.C49671JeV;
import X.C55297Ln3;
import X.C55301Ln7;
import X.C55354Lny;
import X.C55355Lnz;
import X.C55358Lo2;
import X.C55793Lv3;
import X.C56412MCa;
import X.C63081OpJ;
import X.C65330PkU;
import X.C65340Pke;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C74053T4n;
import X.C76542zS;
import X.C76800UCe;
import X.C786536v;
import X.C78685UuP;
import X.C78926UyI;
import X.C84193Sd;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.IWF;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.LCU;
import X.M89;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QD3;
import X.TBT;
import X.TBW;
import X.VWB;
import Y.AObserverS76S0100000_8;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.ForceFeed;
import com.ss.android.ugc.aweme.ecommerce.mall.vm.MallRacunViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.AqS2S1000100_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallRacunFragment extends AmeBaseFragment implements KPL {
    public static final /* synthetic */ int LLD = 0;
    public View LJLIL;
    public View LJLILLLLZI;
    public VWB LJLJI;
    public C74053T4n LJLJJI;
    public C786536v LJLJJL;
    public View LJLJJLL;
    public C252709vu LJLJL;
    public C73305Spp LJLJLJ;
    public ScrollSwitchStateManager LJLJLLL;
    public HomePageDataViewModel LJLL;
    public C55297Ln3 LJLLI;
    public List<ForceFeed> LJLLLL;
    public boolean LJLLLLLL;
    public final C214298b3 LJZ;
    public LCU LJZI;
    public int LJZL;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public M89 LJLLILLLL = new M89();
    public int LJLLJ = 2;
    public final int LJLLL = 2;
    public String LJLZ = "";

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public MallRacunFragment() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MallRacunViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 137);
        C55358Lo2 c55358Lo2 = C55358Lo2.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c55358Lo2, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c55358Lo2, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJZ = c214298b3;
    }

    public final MallRacunViewModel Al() {
        return (MallRacunViewModel) this.LJZ.getValue();
    }

    public final void LJI() {
        MallRacunPageFragment LJJIIZI;
        C55297Ln3 c55297Ln3 = this.LJLLI;
        if (c55297Ln3 != null && (LJJIIZI = c55297Ln3.LJJIIZI(this.LJLLL)) != null) {
            LJJIIZI.LJI();
        } else {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
            }
        }
        C55793Lv3.LIZJ("return");
        Dl("return");
    }

    public final MallRacunPageFragment xl() {
        VWB vwb = this.LJLJI;
        if (vwb == null) {
            return null;
        }
        int currentItem = vwb.getCurrentItem();
        C55297Ln3 c55297Ln3 = this.LJLLI;
        if (c55297Ln3 == null) {
            return null;
        }
        return c55297Ln3.LJJIIZI(currentItem);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String aid;
        String reactSessionId;
        super.onDestroy();
        Aweme wl = wl();
        if (wl != null && (aid = wl.getAid()) != null && (reactSessionId = this.LJLLILLLL.getReactSessionId()) != null && C78685UuP.LJJJZ(reactSessionId) && aid != null) {
            String reactSessionId2 = this.LJLLILLLL.getReactSessionId();
            o.LJI(reactSessionId2);
            C2U8.LIZ(new C49671JeV(2, reactSessionId2, aid, IWF.LJJLIIIIJ().getCurrentPosition()));
        }
        LCU lcu = this.LJZI;
        if (lcu != null) {
            lcu.LIZIZ.removeCallbacks(lcu.LJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LL).clear();
    }

    public final Aweme wl() {
        MallRacunPageFragment xl = xl();
        if (xl != null) {
            return xl.LLI;
        }
        return null;
    }

    public static void Dl(String str) {
        if (C55793Lv3.LIZJ == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - C55793Lv3.LIZJ;
        C55793Lv3.LIZJ = 0L;
        C76542zS.LIZJ("tiktokec_stay_list", new AqS2S1000100_9(currentTimeMillis, str, 1));
    }

    @QD3
    public final void onScrollToProfileEvent(C224498rV c224498rV) {
        int i;
        Aweme wl;
        String authorUid;
        String str;
        if (c224498rV != null && mo49getActivity() != null) {
            int i2 = c224498rV.LJLIL;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                i = mo49getActivity.hashCode();
            } else {
                i = 0;
            }
            if (i2 != i || (wl = wl()) == null || (authorUid = wl.getAuthorUid()) == null) {
                return;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "aweme://user/profile/");
            buildRoute.withParam("uid", authorUid);
            Aweme wl2 = wl();
            if (wl2 != null) {
                str = wl2.getSecAuthorUid();
            } else {
                str = null;
            }
            buildRoute.withParam("sec_userid", str);
            buildRoute.withParam("enter_from", this.LJLLILLLL.getFrom());
            buildRoute.open();
        }
    }

    public final void vl(Integer num) {
        MallRacunViewModel.gv0(Al(), num, this.LJLLLL, 22);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        HomePageDataViewModel homePageDataViewModel;
        MutableLiveData<String> mutableLiveData;
        ViewGroup.LayoutParams layoutParams;
        int i;
        M89 m89;
        int i2;
        List<ForceFeed> list;
        Object LLJJIII;
        long j;
        Object LLJJIII2;
        String str;
        String str2;
        Object obj;
        String str3;
        Integer num;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = view.findViewById(R.id.le0);
        this.LJLILLLLZI = view.findViewById(R.id.ldv);
        this.LJLJI = (VWB) view.findViewById(R.id.ill);
        this.LJLJL = (C252709vu) view.findViewById(R.id.ilk);
        this.LJLJJI = (C74053T4n) view.findViewById(R.id.ilh);
        this.LJLJJL = (C786536v) view.findViewById(R.id.ili);
        this.LJLJJLL = view.findViewById(R.id.ilj);
        this.LJLJLJ = (C73305Spp) view.findViewById(R.id.keh);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("feed_param");
            if (!(serializable instanceof M89) || (m89 = (M89) serializable) == null) {
                m89 = new M89();
            }
            this.LJLLILLLL = m89;
            m89.setPageType(21000);
            arguments.getBoolean("extra_challenge_is_hashtag", false);
            arguments.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", -1);
            String str4 = "";
            if (TextUtils.equals("", this.LJLZ) && this.LJLLILLLL.getAid() != null) {
                String aid = this.LJLLILLLL.getAid();
                o.LJI(aid);
                this.LJLZ = aid;
            }
            String string = arguments.getString("auto_route_schema", "");
            if (!TextUtils.isEmpty(string)) {
                SmartRouter.buildRoute(this, string).open();
            }
            Al().getClass();
            Object LLJJIII3 = C16880lQ.LLJJIII(arguments, "tab_type");
            if ((LLJJIII3 instanceof Integer) && (num = (Integer) LLJJIII3) != null) {
                i2 = num.intValue();
            } else {
                i2 = 2;
            }
            this.LJLLJ = i2;
            Object LLJJIII4 = C16880lQ.LLJJIII(arguments, "force_feeds");
            if (LLJJIII4 != null) {
                if (!(LLJJIII4 instanceof List)) {
                    obj = null;
                } else {
                    obj = LLJJIII4;
                }
                list = (List) obj;
                if (list == null) {
                    if (LLJJIII4 instanceof String) {
                        str3 = (String) LLJJIII4;
                    } else {
                        str3 = null;
                    }
                    try {
                        Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str3, C65330PkU.LIZJ(C65352Pkq.LJ(List.class, C65340Pke.LIZ(C65352Pkq.LJI(ForceFeed.class)))));
                        if (!(fromJson instanceof List)) {
                            fromJson = null;
                        }
                        list = (List) fromJson;
                    } catch (s unused) {
                    }
                }
                this.LJLLLL = list;
                LLJJIII = C16880lQ.LLJJIII(arguments, "enter_time");
                if (!(LLJJIII instanceof String) && (str2 = (String) LLJJIII) != null) {
                    j = CastLongProtector.parseLong(str2);
                } else {
                    j = 0;
                }
                C55793Lv3.LJIIIIZZ = j;
                LLJJIII2 = C16880lQ.LLJJIII(arguments, "recommend_info");
                if ((LLJJIII2 instanceof String) && (str = (String) LLJJIII2) != null) {
                    str4 = str;
                }
                C55793Lv3.LJII = str4;
            }
            list = null;
            this.LJLLLL = list;
            LLJJIII = C16880lQ.LLJJIII(arguments, "enter_time");
            if (!(LLJJIII instanceof String)) {
            }
            j = 0;
            C55793Lv3.LJIIIIZZ = j;
            LLJJIII2 = C16880lQ.LLJJIII(arguments, "recommend_info");
            if (LLJJIII2 instanceof String) {
                str4 = str;
            }
            C55793Lv3.LJII = str4;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLJLLL = C84193Sd.LIZ(mo49getActivity);
            this.LJLL = C3SZ.LIZ(mo49getActivity);
        }
        View view2 = this.LJLIL;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null) {
                i = C63081OpJ.LJJJJLI(mo49getActivity2);
            } else {
                i = 0;
            }
            layoutParams.height = i;
        }
        C252709vu c252709vu = this.LJLJL;
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS159S0100000_9(this, 1059));
            C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
            String string2 = getResources().getString(R.string.fff);
            o.LJIIIIZZ(string2, "resources.getString(R.st…racun_home_channel_title)");
            LIZLLL.LIZJ = string2;
            c235119Kp.LIZJ = LIZLLL;
            c252709vu.setNavActions(c235119Kp);
        }
        C252709vu c252709vu2 = this.LJLJL;
        if (c252709vu2 != null) {
            c252709vu2.LJIILJJIL(false);
        }
        C74053T4n c74053T4n = this.LJLJJI;
        if (c74053T4n != null) {
            c74053T4n.setHorizontalFadingEdgeEnabled(false);
            c74053T4n.LIZ(new C55354Lny(this));
            C45804HyK.LJJIJIIJIL(c74053T4n);
            View view3 = this.LJLJJLL;
            if (view3 != null) {
                C45804HyK.LJJIJIIJIL(view3);
            }
            C74053T4n.LJIILJJIL(c74053T4n, this.LJLJI);
        }
        VWB vwb = this.LJLJI;
        if (vwb != null) {
            vwb.addOnPageChangeListener(new C55301Ln7(this));
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LJLJLLL;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.LJLIL.setBridge(new C55355Lnz(this));
        }
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        if (mo49getActivity3 != null && (homePageDataViewModel = this.LJLL) != null && (mutableLiveData = homePageDataViewModel.LJLJL) != null) {
            mutableLiveData.observe(mo49getActivity3, new AObserverS76S0100000_8(this, 155));
        }
        vl(Integer.valueOf(this.LJLLJ));
        C8YN.LJII(this, Al(), new TBT() { // from class: X.Ln6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((C35638Dyk) obj2).LJLILLLLZI;
            }
        }, null, new AqS191S0100000_9(this, 9), 6);
        C8YN.LJII(this, Al(), new TBT() { // from class: X.Lo0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C35638Dyk) obj2).LJLJJI);
            }
        }, null, new AqS191S0100000_9(this, 10), 6);
        this.LJZI = new LCU((ViewGroup) view);
        C8YN.LJII(this, Al(), new TBT() { // from class: X.Lo1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C35638Dyk) obj2).LJLJJL);
            }
        }, null, new AqS191S0100000_9(this, 11), 6);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a02, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
