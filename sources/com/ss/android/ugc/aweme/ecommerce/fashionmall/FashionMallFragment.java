package com.ss.android.ugc.aweme.ecommerce.fashionmall;

import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C116694i1;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C18000nE;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C2317497q;
import X.C2318197x;
import X.C29S;
import X.C2U8;
import X.C33Q;
import X.C36746EbW;
import X.C39468FeK;
import X.C3C5;
import X.C3C8;
import X.C45804HyK;
import X.C51576KMa;
import X.C51762KTe;
import X.C54251LQx;
import X.C54262LRi;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55909Lwv;
import X.C55977Ly1;
import X.C56012Lya;
import X.C56013Lyb;
import X.C56020Lyi;
import X.C56030Lys;
import X.C56034Lyw;
import X.C56045Lz7;
import X.C56048LzA;
import X.C56090Lzq;
import X.C56412MCa;
import X.C61447O9r;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76542zS;
import X.C76800UCe;
import X.C78565UsT;
import X.C78613UtF;
import X.C78685UuP;
import X.C78866UxK;
import X.C78926UyI;
import X.C87277YNd;
import X.C8VV;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.EnumC55971Lxv;
import X.EnumC56031Lyt;
import X.EnumC56081Lzh;
import X.FCG;
import X.FCH;
import X.HG3;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC34471Wx;
import X.InterfaceC40408FtU;
import X.InterfaceC53896LDg;
import X.InterfaceC54080LKi;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.LQS;
import X.MKM;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QD3;
import X.RBX;
import X.TBT;
import X.TBW;
import Y.ALAdapterS3S0100000_4;
import Y.AObserverS72S0100000_4;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.settings.ECFashionMallConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.MallCommonViewModel;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotAbilityCommon;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.Notice;
import com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ECommerceLiveServiceImpl;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.Au2S18S0100000_9;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS15S2100000_6;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS188S0100000_6;
import kotlin.jvm.internal.AqS1S2001000_9;
import kotlin.jvm.internal.AqS30S0210000_9;
import kotlin.jvm.internal.AqS32S1000000_9;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class FashionMallFragment extends FeedFragment implements InterfaceC53896LDg, KPL, InterfaceC40408FtU, InterfaceC34471Wx {
    public static String LJZI;
    public static int LJZL;
    public static boolean LLD;
    public final C214298b3 LJLJL;
    public final C214298b3 LJLJLJ;
    public final C56020Lyi LJLJLLL;
    public long LJLL;
    public long LJLLI;
    public volatile boolean LJLLILLLL;
    public boolean LJLLJ;
    public Map<String, String> LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public static final C51762KTe LJZ = new C51762KTe();
    public static String LL = "top_fashion_mall";

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Gz() {
    }

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
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

    @Override // X.InterfaceC34471Wx, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b0482";
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

    @Override // X.InterfaceC40408FtU
    public final String og() {
        return "FashionMallMainFragment";
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean ub(boolean z) {
        return false;
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "MainTabPage";
    }

    public FashionMallFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(ShopMainViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 315);
        C2318197x c2318197x = C2318197x.INSTANCE;
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(this, false);
        AqS60S0110000_3 LJJIIJZLJL = C78926UyI.LJJIIJZLJL(this, false);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        this.LJLJL = new C214298b3(LIZ, aqS154S0100000_4, c214528bQ, LJJII, LJJIIJZLJL, c184077Kh, c2318197x, (InterfaceC65784Pro) null, 384);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MallCommonViewModel.class);
        this.LJLJLJ = new C214298b3(LIZ2, new AqS154S0100000_4(LIZ2, 316), c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), c184077Kh, C2317497q.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLJLLL = new C56020Lyi(0);
        this.LJLL = -1L;
        this.LJLLI = -1L;
        this.LJLLL = C113554cx.LJJJLIIL();
    }

    public final void Il() {
        CustomDotAbilityCommon customDotAbilityCommon;
        ShopMainViewModel shopMainViewModel = (ShopMainViewModel) this.LJLJL.getValue();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Notice notice = null;
        if (mo49getActivity != null && (customDotAbilityCommon = (CustomDotAbilityCommon) C55096Ljo.LIZ(C55230Lly.LIZLLL(mo49getActivity, null), CustomDotAbilityCommon.class, null)) != null) {
            notice = customDotAbilityCommon.C6();
        }
        shopMainViewModel.withState(new AqS30S0210000_9(shopMainViewModel, notice, ((ShopMainViewModel) this.LJLJL.getValue()).LJLLI, 3));
    }

    public final void Jl() {
        Intent intent;
        Intent intent2;
        C56020Lyi c56020Lyi = this.LJLJLLL;
        String str = c56020Lyi.LJLJJLL;
        if (str == null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && (intent2 = mo49getActivity.getIntent()) != null) {
                str = C16880lQ.LLJJIJIIJIL(intent2, "extra_product_id");
            } else {
                str = null;
            }
        }
        c56020Lyi.LJLJJLL = str;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (intent = mo49getActivity2.getIntent()) != null) {
            intent.removeExtra("extra_product_id");
        }
        ShopMainViewModel shopMainViewModel = (ShopMainViewModel) this.LJLJL.getValue();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (!o.LJ(curUserId, shopMainViewModel.LJLILLLLZI)) {
            shopMainViewModel.LJLILLLLZI = curUserId;
            C2U8.LIZ(new C55977Ly1());
            shopMainViewModel.mv0(false, true);
        } else {
            if (shopMainViewModel.lv0().LJLLI == null && !C78685UuP.LJJJZ(shopMainViewModel.lv0().LJLJJLL)) {
                return;
            }
            C78565UsT.LJJIJIIJI(shopMainViewModel, C78613UtF.LIZJ, new C56012Lya(shopMainViewModel, null));
        }
    }

    public final void Kl() {
        Intent intent;
        C56020Lyi c56020Lyi = this.LJLJLLL;
        String str = c56020Lyi.LJZ;
        if (str == null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null) {
                str = C16880lQ.LLJJIJIIJIL(intent, "extra_non_click_open_from");
            } else {
                str = null;
            }
        }
        c56020Lyi.LJZ = str;
    }

    public final void Gl() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(_$_findCachedViewById(R.id.d2t), "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.addListener(new ALAdapterS3S0100000_4(this, 3));
        new AccelerateDecelerateInterpolator();
        ofFloat.start();
    }

    public final void Hl() {
        System.currentTimeMillis();
        ShopMainViewModel shopMainViewModel = (ShopMainViewModel) this.LJLJL.getValue();
        if (shopMainViewModel.lv0().LJLJJL == EnumC55971Lxv.OLD) {
            C78565UsT.LJJIJIIJI(shopMainViewModel, C78613UtF.LIZJ, new C56013Lyb(shopMainViewModel, null));
        } else {
            if (shopMainViewModel.lv0().LJLJJL != EnumC55971Lxv.NEW) {
                return;
            }
            shopMainViewModel.nv0(false, true);
        }
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return C18000nE.LIZ(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        ECommerceLiveServiceImpl.LJFF().LIZ().LIZIZ = null;
        EventBus.LIZJ().LJIJ(this);
        if (this.LJLLI > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLLI;
            this.LJLLI = -1L;
            boolean z = this.LJLJLLL.LJLJLLL;
            String str2 = this.LJLJLLL.LJLL;
            if (this.LJLJLLL.LJLJJL == EnumC55971Lxv.NEW) {
                str = "tools_in";
            } else {
                str = "tools_out";
            }
            C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
            String str3 = LJZI;
            if (str3 == null) {
                str3 = "unknown";
            }
            c56045Lz7.getClass();
            C56045Lz7.LJIILJJIL(elapsedRealtime, str3, str2, "close", str, z);
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        EnumC56031Lyt enumC56031Lyt;
        Intent intent;
        Intent intent2;
        super.onResume();
        C51576KMa.LLIILZL = false;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && o.LJ(C116694i1.LIZ(mo49getActivity).mv0(), this)) {
            C12460eI.LJIIIIZZ(this, null);
        }
        C51762KTe c51762KTe = LJZ;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        c51762KTe.getClass();
        if (C51762KTe.LIZ(mo49getActivity2)) {
            Kl();
            C56020Lyi c56020Lyi = this.LJLJLLL;
            String str2 = c56020Lyi.LJLJL;
            if (str2 == null) {
                ActivityC45651qj mo49getActivity3 = mo49getActivity();
                if (mo49getActivity3 != null && (intent2 = mo49getActivity3.getIntent()) != null) {
                    str2 = C16880lQ.LLJJIJIIJIL(intent2, "extra_deeplink_schema");
                } else {
                    str2 = null;
                }
            }
            c56020Lyi.LJLJL = str2;
            ActivityC45651qj mo49getActivity4 = mo49getActivity();
            if (mo49getActivity4 != null && (intent = mo49getActivity4.getIntent()) != null) {
                intent.removeExtra("extra_deeplink_schema");
            }
            C56020Lyi c56020Lyi2 = this.LJLJLLL;
            if (c56020Lyi2.LJLILLLLZI && (str = c56020Lyi2.LJLJL) != null) {
                if (this.LJLLLLLL) {
                    enumC56031Lyt = EnumC56031Lyt.FROM_SUBPAGE;
                } else {
                    enumC56031Lyt = EnumC56031Lyt.FROM_BACKGROUND;
                }
                FCG fcg = FCH.LIZIZ;
                JSONObject LIZ = C56048LzA.LIZ(enumC56031Lyt, str);
                fcg.getClass();
                FCG.LIZ("ec_mall_deeplink", LIZ);
                C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
                String value = enumC56031Lyt.getValue();
                Map LIZJ = C55909Lwv.LIZJ(str);
                c56045Lz7.getClass();
                C76542zS.LIZJ("rd_tiktokec_deeplink_event_send", new AqS15S2100000_6(str, value, (String) LIZJ, (Map<String, String>) 0));
                this.LJLLLLLL = false;
                this.LJLJLLL.LJLJL = null;
            }
            if (ECFashionMallConfigSettings.LIZ().enableEcMallShopMessageRefresh) {
                LQS.LIZ(9, false);
                if (this.LJLJLLL.LJLJJI) {
                    Hl();
                }
            }
            Jl();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        EnumC56031Lyt enumC56031Lyt;
        String str;
        Intent intent;
        Intent intent2;
        super.onStart();
        C51762KTe c51762KTe = LJZ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c51762KTe.getClass();
        if (C51762KTe.LIZ(mo49getActivity)) {
            C56020Lyi c56020Lyi = this.LJLJLLL;
            String str2 = c56020Lyi.LJLJJLL;
            if (str2 == null) {
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 != null && (intent2 = mo49getActivity2.getIntent()) != null) {
                    str2 = C16880lQ.LLJJIJIIJIL(intent2, "extra_product_id");
                } else {
                    str2 = null;
                }
            }
            c56020Lyi.LJLJJLL = str2;
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            if (mo49getActivity3 != null && (intent = mo49getActivity3.getIntent()) != null) {
                intent.removeExtra("extra_product_id");
            }
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null && topActivity != mo49getActivity()) {
                String name = topActivity.getClass().getName();
                IDeepLinkService LIZ = DeepLinkServiceImpl.LIZ();
                if (LIZ != null) {
                    str = LIZ.LJIILL();
                } else {
                    str = null;
                }
                if (!o.LJ(name, str)) {
                    this.LJLLLLLL = false;
                }
            }
            this.LJLL = SystemClock.elapsedRealtime();
            if (!this.LJLLLL) {
                this.LJLLLL = true;
                return;
            }
            if (ActivityStack.isAppBackGround()) {
                enumC56031Lyt = EnumC56031Lyt.FROM_BACKGROUND;
            } else {
                enumC56031Lyt = EnumC56031Lyt.FROM_SUBPAGE;
            }
            FCG fcg = FCH.LIZIZ;
            JSONObject LIZ2 = C56030Lys.LIZ(enumC56031Lyt, null);
            fcg.getClass();
            FCG.LIZ("ec_mall_show", LIZ2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        boolean z;
        EnumC56031Lyt enumC56031Lyt;
        String str;
        Intent intent;
        super.onStop();
        C51762KTe c51762KTe = LJZ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c51762KTe.getClass();
        if (C51762KTe.LIZ(mo49getActivity)) {
            if (ActivityStack.getTopActivity() != mo49getActivity()) {
                z = true;
            } else {
                z = false;
            }
            this.LJLLLLLL = z;
            if (ActivityStack.isAppBackGround()) {
                enumC56031Lyt = EnumC56031Lyt.TO_BACKGROUND;
            } else {
                enumC56031Lyt = EnumC56031Lyt.TO_SUBPAGE;
            }
            if (this.LJLJLLL.LJLJJL == EnumC55971Lxv.NEW) {
                str = "tools_in";
            } else {
                str = "tools_out";
            }
            if (this.LJLL > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLL;
                this.LJLL = -1L;
                boolean z2 = this.LJLJLLL.LJLJLLL;
                String str2 = this.LJLJLLL.LJLL;
                C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
                String str3 = LJZI;
                if (str3 == null) {
                    str3 = "unknown";
                }
                c56045Lz7.getClass();
                C56045Lz7.LJIIIIZZ(elapsedRealtime, str3, str2, "not_in_front", str, z2);
            }
            FCG fcg = FCH.LIZIZ;
            JSONObject LIZ = C56030Lys.LIZ(enumC56031Lyt, null);
            fcg.getClass();
            FCG.LIZ("ec_mall_hide", LIZ);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null && (intent = mo49getActivity2.getIntent()) != null) {
                intent.removeExtra("extra_non_click_open_from");
            }
            this.LJLJLLL.LJLJL = null;
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        Intent intent;
        String str;
        LLD = false;
        String str2 = "unknown";
        String str3 = "tools_in";
        if (this.LJLL > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLL;
            this.LJLL = -1L;
            boolean z = this.LJLJLLL.LJLJLLL;
            String str4 = this.LJLJLLL.LJLL;
            if (this.LJLJLLL.LJLJJL == EnumC55971Lxv.NEW) {
                str = "tools_in";
            } else {
                str = "tools_out";
            }
            C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
            String str5 = LJZI;
            if (str5 == null) {
                str5 = "unknown";
            }
            c56045Lz7.getClass();
            C56045Lz7.LJIIIIZZ(elapsedRealtime, str5, str4, "switch_tab", str, z);
        }
        if (this.LJLLI > 0) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.LJLLI;
            this.LJLLI = -1L;
            boolean z2 = this.LJLJLLL.LJLJLLL;
            String str6 = this.LJLJLLL.LJLL;
            if (this.LJLJLLL.LJLJJL != EnumC55971Lxv.NEW) {
                str3 = "tools_out";
            }
            C56045Lz7 c56045Lz72 = C56045Lz7.LIZ;
            String str7 = LJZI;
            if (str7 != null) {
                str2 = str7;
            }
            c56045Lz72.getClass();
            C56045Lz7.LJIILJJIL(elapsedRealtime2, str2, str6, "switch", str3, z2);
        }
        FCG fcg = FCH.LIZIZ;
        JSONObject LIZ = C56030Lys.LIZ(EnumC56031Lyt.TAB_SWITCH, null);
        fcg.getClass();
        FCG.LIZ("ec_mall_hide", LIZ);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null) {
            intent.removeExtra("extra_non_click_open_from");
        }
        this.LJLJLLL.LJLJL = null;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        String str;
        String str2;
        Intent intent;
        Intent intent2;
        o.LJIIIZ(args, "args");
        C12460eI.LJIIIIZZ(this, null);
        LJZ.getClass();
        if (C51762KTe.LIZIZ()) {
            str = "homepage_mall";
        } else {
            str = "mall";
        }
        C39468FeK.LJIIJ("origin_is_mall_tab", str, String.valueOf(hashCode()));
        String str3 = this.LJLJLLL.LJZ;
        if (str3 == null || ujb.o.LJJJJJL(str3)) {
            Jl();
        }
        this.LJLL = SystemClock.elapsedRealtime();
        this.LJLLI = SystemClock.elapsedRealtime();
        FCG fcg = FCH.LIZIZ;
        EnumC56031Lyt enumC56031Lyt = EnumC56031Lyt.TAB_SWITCH;
        JSONObject LIZ = C56030Lys.LIZ(enumC56031Lyt, LJZI);
        fcg.getClass();
        FCG.LIZ("ec_mall_show", LIZ);
        if (this.LJLJLLL.LJLILLLLZI) {
            Kl();
            String str4 = this.LJLJLLL.LJLL;
            C56020Lyi c56020Lyi = this.LJLJLLL;
            c56020Lyi.LJLJI = LJZL;
            if (c56020Lyi.LJLJJL == EnumC55971Lxv.NEW) {
                str2 = "tools_in";
            } else {
                str2 = "tools_out";
            }
            C56020Lyi c56020Lyi2 = this.LJLJLLL;
            String str5 = c56020Lyi2.LJLJL;
            if (str5 == null) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null && (intent2 = mo49getActivity.getIntent()) != null) {
                    str5 = C16880lQ.LLJJIJIIJIL(intent2, "extra_deeplink_schema");
                } else {
                    str5 = null;
                }
            }
            c56020Lyi2.LJLJL = str5;
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null && (intent = mo49getActivity2.getIntent()) != null) {
                intent.removeExtra("extra_deeplink_schema");
            }
            String str6 = this.LJLJLLL.LJLJL;
            if (str6 != null) {
                FCG.LIZ("ec_mall_deeplink", C56048LzA.LIZ(enumC56031Lyt, str6));
                C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
                String value = enumC56031Lyt.getValue();
                Map LIZJ = C55909Lwv.LIZJ(str6);
                c56045Lz7.getClass();
                C76542zS.LIZJ("rd_tiktokec_deeplink_event_send", new AqS15S2100000_6(str6, value, (String) LIZJ, (Map<String, String>) 0));
                this.LJLJLLL.LJLJL = null;
            }
            C56045Lz7 c56045Lz72 = C56045Lz7.LIZ;
            C56020Lyi c56020Lyi3 = this.LJLJLLL;
            int i = c56020Lyi3.LJLJI;
            String str7 = c56020Lyi3.LJZ;
            c56045Lz72.getClass();
            C76542zS.LIZJ("tiktokec_enter_page", new AqS1S2001000_9(str4, str2, i, 1));
            C76542zS.LIZJ("rd_tiktokec_enter_mall", new AqS32S1000000_9(str7, 7));
            if (ECFashionMallConfigSettings.LIZ().enableEcMallShopMessageRefresh) {
                LQS.LIZ(9, false);
                Hl();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Kl();
        C8VV.LIZ(this, false, new AqS175S0100000_9(this, 33));
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRedPointUpdate(C54251LQx event) {
        o.LJIIIZ(event, "event");
        Il();
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRedPointUpdateRefactor(C54262LRi event) {
        o.LJIIIZ(event, "event");
        Il();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void reloadWholePageData(C55977Ly1 event) {
        o.LJIIIZ(event, "event");
        MKM mkm = (MKM) _$_findCachedViewById(R.id.isn);
        C56034Lyw c56034Lyw = C56034Lyw.LJLIL;
        RecyclerView recyclerView = mkm.LLLIIII;
        if (recyclerView != null) {
            recyclerView.LJLI(0);
        }
        mkm.LJLI(0);
        if (c56034Lyw != null) {
            c56034Lyw.invoke();
        }
        Gl();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS175S0100000_9(this, 34));
        C36746EbW.LIZ(3, "ShopTab HierarchyData eventBus onViewCreated");
        EventBus.LIZJ().LJIILJJIL(this);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.d2t);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(4);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.d2s);
        if (_$_findCachedViewById2 != null) {
            C16880lQ.LJIIJ(new Au2S18S0100000_9(this, 0), _$_findCachedViewById2);
        }
        C61447O9r.LJIILLIIL.observe(this, new AObserverS72S0100000_4(this, 0));
        C8YN.LJII(this, (AssemViewModel) this.LJLJL.getValue(), new TBT() { // from class: X.Ly6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55978Ly2) obj).LJLJL;
            }
        }, null, new AqS186S0100000_4(this, 2), 6);
        C8YN.LJII(this, this.LJLJLJ.getValue(), new TBT() { // from class: X.E2m
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35779E2l) obj).LJLIL;
            }
        }, null, new AqS188S0100000_6(this, 1), 6);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        boolean z;
        Activity activity;
        MainActivityScope LJJLIIIJILLIZJL;
        HomeTabAbility LJIL;
        InterfaceC54080LKi Y20;
        Intent intent;
        o.LJIIIZ(inflater, "inflater");
        this.LJLJLLL.LJLIL = System.currentTimeMillis();
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        String stage = EnumC56081Lzh.STAGE_CREATE_VIEW_START.getStage();
        String str2 = this.LJLJLLL.LJZ;
        long j = 0;
        if (C56090Lzq.LIZ != 0) {
            j = System.currentTimeMillis() - C56090Lzq.LIZ;
        }
        C56045Lz7.LJIILIIL(c56045Lz7, stage, str2, j, false, null, 56);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        C29S c29s = null;
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "extra_non_click_open_from");
        } else {
            str = null;
        }
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if ((!z) && ECommerceMallService.x3().LLLIIL() && (LJJLIIIJILLIZJL = C78866UxK.LJJLIIIJILLIZJL(this)) != null && (LJIL = C87277YNd.LJIL(LJJLIIIJILLIZJL)) != null && (Y20 = LJIL.Y20("FASHION_MALL")) != null) {
            Y20.LIZIZ();
        }
        Context context = getContext();
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        View LIZLLL = C16970lZ.LIZLLL(activity, R.layout.ao7);
        if (!(LIZLLL instanceof View)) {
            LIZLLL = null;
        }
        if (LIZLLL != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZLLL, this);
                C10A.LIZIZ(LIZLLL, this);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 instanceof C29S) {
                    c29s = (C29S) mo49getActivity2;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LIZLLL;
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
