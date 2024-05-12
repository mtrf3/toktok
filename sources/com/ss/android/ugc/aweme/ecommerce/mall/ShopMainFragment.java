package com.ss.android.ugc.aweme.ecommerce.mall;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C116694i1;
import X.C12460eI;
import X.C141335gf;
import X.C16970lZ;
import X.C17N;
import X.C18000nE;
import X.C18080nM;
import X.C18090nN;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C29S;
import X.C33Q;
import X.C36746EbW;
import X.C39468FeK;
import X.C3C5;
import X.C3C8;
import X.C45804HyK;
import X.C47261Igj;
import X.C51576KMa;
import X.C51577KMb;
import X.C53286Kvi;
import X.C54741Le5;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56092Lzs;
import X.C56412MCa;
import X.C61447O9r;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78866UxK;
import X.C78926UyI;
import X.C78983UzD;
import X.C87277YNd;
import X.C8VV;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.CK3;
import X.EnumC46468ILo;
import X.EnumC56032Lyu;
import X.EnumC56082Lzi;
import X.EnumC56110M0k;
import X.EnumC63755P0l;
import X.FCG;
import X.FCH;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC34461Ww;
import X.InterfaceC34471Wx;
import X.InterfaceC40408FtU;
import X.InterfaceC53896LDg;
import X.InterfaceC54080LKi;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.LSO;
import X.M01;
import X.M02;
import X.M03;
import X.M04;
import X.M07;
import X.M0F;
import X.M0H;
import X.M1S;
import X.O5Y;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import X.X1D;
import Y.AObserverS71S0100000_3;
import Y.IDiS271S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.Notice;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.DiversionTargetData;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.router.ECMallRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMallConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgPopupService;
import com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ECommerceLiveServiceImpl;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class ShopMainFragment extends FeedFragment implements InterfaceC53896LDg, KPL, InterfaceC40408FtU, InterfaceC34471Wx, InterfaceC34461Ww {
    public static final C54741Le5 LJZ = new C54741Le5();
    public static String LJZI;
    public static int LJZL;
    public static String LL;
    public static String LLD;
    public static String LLF;
    public static String LLFF;
    public static String LLFFF;
    public static String LLFII;
    public static boolean LLFZ;
    public static DiversionTargetData LLI;
    public static JSONObject LLIFFJFJJ;
    public static String LLII;
    public static ImageUrlModel LLIIII;
    public static String LLIIIILZ;
    public static String LLIIIJ;
    public static Notice LLIIIL;
    public static boolean LLIIIZ;
    public static String LLIIJI;
    public static boolean LLIIJLIL;
    public final C214298b3 LJLJL;
    public boolean LJLJLJ;
    public Boolean LJLJLLL;
    public boolean LJLL;
    public long LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final Map<String, String> LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Gz() {
    }

    @Override // X.InterfaceC34461Ww
    public final String K3() {
        return "b2001";
    }

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // X.InterfaceC34461Ww
    public final Object LJJIII() {
        return this;
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
        return "MallMainFragment";
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

    public ShopMainFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ShopMainLynxViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 113);
        M1S m1s = M1S.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), m1s, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), m1s, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJL = c214298b3;
        this.LJLJLJ = true;
        this.LJLL = true;
        this.LJLLI = -1L;
        this.LJLLLL = true;
        this.LJLLLLLL = new LinkedHashMap();
    }

    public final ShopMainLynxViewModel Hl() {
        return (ShopMainLynxViewModel) this.LJLJL.getValue();
    }

    @Override // X.InterfaceC34471Wx, X.InterfaceC18010nF
    public String getBtmPageCode() {
        LJZ.getClass();
        if (C54741Le5.LIZIZ()) {
            return EnumC63755P0l.TOP_MALL.getPageCode();
        }
        return EnumC63755P0l.MALL.getPageCode();
    }

    public final void Jl() {
        Intent intent;
        Intent intent2;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (intent2 = mo49getActivity.getIntent()) != null) {
            intent2.removeExtra("extra_non_click_open_from");
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (intent = mo49getActivity2.getIntent()) != null) {
            intent.removeExtra("diversion_params");
        }
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return C18000nE.LIZ(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ECommerceLiveServiceImpl.LJFF().LIZ().LIZIZ = null;
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C54741Le5 c54741Le5 = LJZ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c54741Le5.getClass();
        if (C54741Le5.LIZ(mo49getActivity)) {
            LLIIIZ = false;
            LLIIJI = "under_sparkview";
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        EnumC56032Lyu enumC56032Lyu;
        super.onResume();
        C36746EbW.LIZ(3, "ShopMainLifeCycle onResume");
        C51576KMa.LLIILZL = false;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && o.LJ(C116694i1.LIZ(mo49getActivity).mv0(), this)) {
            LJZ.getClass();
            if (C54741Le5.LIZIZ()) {
                C12460eI.LJIIL(this, false);
            } else {
                C12460eI.LJIIIIZZ(this, null);
            }
        }
        C54741Le5 c54741Le5 = LJZ;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        c54741Le5.getClass();
        if (C54741Le5.LIZ(mo49getActivity2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShopMainLifeCycle onResume enterFrom = ");
            LIZ.append(LJZI);
            LIZ.append(" enterMethod = ");
            LIZ.append(LL);
            LIZ.append(" openFrom = ");
            CK3.LIZIZ(LIZ, LLF, LIZ, 3);
            if (o.LJ(this.LJLJLLL, Boolean.FALSE)) {
                if (this.LJLL) {
                    enumC56032Lyu = EnumC56032Lyu.FROM_BACKGROUND;
                } else if (EcUgPopupService.LJIILJJIL().LIZJ(ActivityStack.getTopActivity())) {
                    enumC56032Lyu = EnumC56032Lyu.FROM_SPLIT_SCREEN;
                } else {
                    enumC56032Lyu = EnumC56032Lyu.FROM_SUBPAGE;
                }
                Il(enumC56032Lyu);
                this.LJLL = false;
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C36746EbW.LIZ(3, "ShopMainLifeCycle onStart");
        C54741Le5 c54741Le5 = LJZ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c54741Le5.getClass();
        if (C54741Le5.LIZ(mo49getActivity)) {
            LLIIJI = "under_sparkview";
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShopMainLifeCycle onStart enterFrom = ");
            LIZ.append(LJZI);
            LIZ.append(" enterMethod = ");
            LIZ.append(LL);
            LIZ.append(" openFrom = ");
            CK3.LIZIZ(LIZ, LLF, LIZ, 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        EnumC56032Lyu enumC56032Lyu;
        String value;
        super.onStop();
        C36746EbW.LIZ(3, "ShopMainLifeCycle onStop");
        C54741Le5 c54741Le5 = LJZ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c54741Le5.getClass();
        if (C54741Le5.LIZ(mo49getActivity)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShopMainLifeCycle onStop enterFrom = ");
            LIZ.append(LJZI);
            LIZ.append(" enterMethod = ");
            LIZ.append(LL);
            LIZ.append(" openFrom = ");
            LIZ.append(LLF);
            C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
            if (ActivityStack.isAppBackGround()) {
                LLIIJI = "background";
                enumC56032Lyu = EnumC56032Lyu.TO_BACKGROUND;
            } else {
                LLIIJI = "under_subpage";
                enumC56032Lyu = EnumC56032Lyu.TO_SUBPAGE;
            }
            if (this.LJLLI > 0) {
                FCG fcg = FCH.LIZIZ;
                JSONObject LIZIZ = M07.LIZIZ(enumC56032Lyu, null, 14);
                fcg.getClass();
                FCG.LIZ("ec_mall_hide", LIZIZ);
                long currentTimeMillis = System.currentTimeMillis() - this.LJLLI;
                this.LJLLI = -1L;
                if (this.LJLJLJ) {
                    value = EnumC56032Lyu.FIRST_SCREEN.getValue();
                } else {
                    value = enumC56032Lyu.getValue();
                }
                C56092Lzs c56092Lzs = C56092Lzs.LIZ;
                String str = LJZI;
                if (str == null) {
                    str = "unknown";
                }
                boolean z = Hl().LJLILLLLZI.LJLJI;
                int i = Hl().LJLILLLLZI.LJLJL;
                boolean z2 = Hl().LJLILLLLZI.LJLJJI;
                boolean z3 = Hl().LJLILLLLZI.LJLJJLL;
                boolean z4 = ECMallRouterInterceptor.LJLIL;
                c56092Lzs.getClass();
                C56092Lzs.LJIL(str, currentTimeMillis, z, "not_in_front", i, z2, z3, value, z4);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ShopMainLifeCycle type onStop ec_mall_hide type: ");
            LIZ2.append(enumC56032Lyu);
            C36746EbW.LIZ(3, X1D.LIZIZ(LIZ2));
            Jl();
            boolean z5 = false;
            this.LJLJLJ = false;
            if (enumC56032Lyu == EnumC56032Lyu.TO_BACKGROUND) {
                z5 = true;
            }
            this.LJLL = z5;
        }
    }

    public static Integer Gl(String str) {
        Object LIZ;
        if (str.length() == 9 && str.charAt(0) == '#') {
            StringBuilder sb = new StringBuilder("#");
            String substring = str.substring(7);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            String substring2 = str.substring(1, 7);
            o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring2);
            str = sb.toString();
        }
        try {
            LIZ = Integer.valueOf(Color.parseColor(str));
            C3C5.m7constructorimpl(LIZ);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        return (Integer) LIZ;
    }

    public static void Kl(M03 m03) {
        if (m03 != null) {
            String str = m03.LIZ;
            if (str != null) {
                LJZI = str;
            }
            JSONObject jSONObject = m03.LIZIZ;
            if (jSONObject != null) {
                C54741Le5 c54741Le5 = LJZ;
                EnumC46468ILo enumC46468ILo = EnumC46468ILo.ROUTE_TO_SHOP;
                c54741Le5.getClass();
                C54741Le5.LIZJ(jSONObject, enumC46468ILo);
            }
            String str2 = m03.LIZJ;
            if (str2 != null) {
                LLFFF = str2;
            }
            String str3 = m03.LIZLLL;
            if (str3 != null) {
                LLFII = str3;
            }
            String str4 = m03.LJ;
            if (str4 != null) {
                LLF = str4;
            }
            if (!m03.LJII) {
                String LJJIFFI = C17N.LJJIFFI(m03.LJI);
                if (LJJIFFI == null) {
                    LJJIFFI = LSO.OTHER.getValue();
                }
                LL = LJJIFFI;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0234, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x027b, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03c6  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.base.ImageUrlModel, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Il(X.EnumC56032Lyu r15) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment.Il(X.Lyu):void");
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        String value;
        C18090nN c18090nN;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopMainLifeCycle onNodeHide enterFrom = ");
        LIZ.append(LJZI);
        LIZ.append(" enterMethod = ");
        LIZ.append(LL);
        LIZ.append(" openFrom = ");
        LIZ.append(LLF);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        View back_btn = _$_findCachedViewById(R.id.aej);
        o.LJIIIIZZ(back_btn, "back_btn");
        back_btn.setVisibility(8);
        LLIIIZ = false;
        LLIIJI = "other_tab";
        LLIIJLIL = false;
        this.LJLLILLLL = false;
        FCG fcg = FCH.LIZIZ;
        EnumC56032Lyu enumC56032Lyu = EnumC56032Lyu.TAB_SWITCH;
        JSONObject LIZIZ = M07.LIZIZ(enumC56032Lyu, null, 14);
        fcg.getClass();
        FCG.LIZ("ec_mall_hide", LIZIZ);
        LJZ.getClass();
        if (C54741Le5.LIZIZ()) {
            Hl().lv0(null);
            C18080nM.LIZ.getClass();
            String LJI = C18080nM.LJI("b2001");
            ConcurrentHashMap<String, C18090nN> concurrentHashMap = C18080nM.LJFF;
            C18090nN c18090nN2 = concurrentHashMap.get(LJI);
            if (c18090nN2 != null) {
                c18090nN2.LJIJJ = null;
            }
            String LIZ2 = C18000nE.LIZ(this);
            if (LIZ2 != null && (c18090nN = concurrentHashMap.get(LIZ2)) != null) {
                C18080nM.LJIIJ(c18090nN);
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("ShopMainLifeCycle type onNodeHide ec_mall_hide type: ");
        LIZ3.append(enumC56032Lyu);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ3));
        if (this.LJLLI > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLLI;
            this.LJLLI = -1L;
            if (this.LJLJLJ) {
                value = EnumC56032Lyu.FIRST_SCREEN.getValue();
            } else {
                value = enumC56032Lyu.getValue();
            }
            C56092Lzs c56092Lzs = C56092Lzs.LIZ;
            String str = LJZI;
            if (str == null) {
                str = "unknown";
            }
            boolean z = Hl().LJLILLLLZI.LJLJI;
            int i = Hl().LJLILLLLZI.LJLJL;
            boolean z2 = Hl().LJLILLLLZI.LJLJJI;
            boolean z3 = Hl().LJLILLLLZI.LJLJJLL;
            boolean z4 = ECMallRouterInterceptor.LJLIL;
            c56092Lzs.getClass();
            C56092Lzs.LJIL(str, currentTimeMillis, z, "switch_tab", i, z2, z3, value, z4);
        }
        String str2 = EcMallConfigSettings.getValue().videoScene;
        if (str2 == null) {
            str2 = "";
        }
        C51577KMb.LIZJ(str2);
        Jl();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("ShopTabV3 onNodeHide type: ");
        LIZ4.append(enumC56032Lyu);
        LIZ4.append(" open_from: ");
        CK3.LIZIZ(LIZ4, LLF, LIZ4, 3);
        ECMallRouterInterceptor.LJLIL = false;
        ECMallRouterInterceptor.LJLILLLLZI = false;
        this.LJLJLJ = false;
        this.LJLJLLL = Boolean.TRUE;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        DialogFragment dialogFragment;
        o.LJIIIZ(args, "args");
        C36746EbW.LIZ(3, "ShopMainLifeCycle onNodeShow");
        List<Fragment> LJJJJLI = requireActivity().getSupportFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "requireActivity().supportFragmentManager.fragments");
        for (int LJJI = C47261Igj.LJJI(LJJJJLI); LJJI > 0; LJJI--) {
            Object obj = ListProtector.get(LJJJJLI, LJJI);
            if ((obj instanceof DialogFragment) && (dialogFragment = (DialogFragment) obj) != null) {
                dialogFragment.dismissAllowingStateLoss();
            }
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new M01(this, args, null));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        Intent intent;
        HomeViewPagerAbility homeViewPagerAbility;
        super.onCreate(bundle);
        this.LJLJLJ = true;
        C36746EbW.LIZ(3, "ShopMainLifeCycle onCreate");
        ShopMainLynxViewModel Hl = Hl();
        Context context = getContext();
        if (context != null) {
            z = AnonymousClass636.LJIILJJIL(context);
        } else {
            z = false;
        }
        Hl.LJLJJLL = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopTab Tooltip isDarkMode ");
        LIZ.append(Hl().LJLJJLL);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        Object value = Hl().LJLJJL.getValue();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            intent = mo49getActivity.getIntent();
        } else {
            intent = null;
        }
        getContext();
        AqS175S0100000_9 aqS175S0100000_9 = new AqS175S0100000_9(this, 41);
        value.getClass();
        M02.LIZ(intent, aqS175S0100000_9);
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        String value2 = EnumC56032Lyu.FIRST_SCREEN.getValue();
        c56092Lzs.getClass();
        C56092Lzs.LJIJI("onCreate", value2);
        LJZ.getClass();
        if (C54741Le5.LIZIZ() && (homeViewPagerAbility = (HomeViewPagerAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), HomeViewPagerAbility.class, null)) != null) {
            homeViewPagerAbility.addOnPageChangeListener(new IDiS271S0100000_9(this, 10));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        LJZ.getClass();
        Intent intent = null;
        if (C54741Le5.LIZIZ()) {
            C12460eI.LJIIL(this, true);
        } else {
            C12460eI.LJIIIIZZ(this, null);
        }
        C36746EbW.LIZ(3, "ShopMainLifeCycle onViewCreated");
        if (C54741Le5.LIZIZ()) {
            str = "homepage_mall";
        } else {
            str = "mall";
        }
        C39468FeK.LJIIJ("origin_is_mall_tab", str, String.valueOf(hashCode()));
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        String value = EnumC56032Lyu.FIRST_SCREEN.getValue();
        c56092Lzs.getClass();
        C56092Lzs.LJIJI("onViewCreated", value);
        M04 m04 = (M04) Hl().LJLJJI.getValue();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            intent = mo49getActivity.getIntent();
        }
        this.LJLLL = !m04.LIZ(intent, this, "onViewCreated", String.valueOf(hashCode()));
        M0F.LIZIZ = System.currentTimeMillis();
        M0F.LIZJ = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("native_appear_directly viewCreatedTime curr=");
        LIZ.append(M0F.LIZIZ);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        C61447O9r.LJIILLIIL.observe(this, new AObserverS71S0100000_3(this, 49));
        C8VV.LIZ(this, false, new AqS175S0100000_9(this, 42));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.LJLLL) {
            this.LJLLL = false;
            View back_btn = _$_findCachedViewById(R.id.aej);
            o.LJIIIIZZ(back_btn, "back_btn");
            if (back_btn.getVisibility() == 0) {
                b.LJJIJIIJI("tiktokec_button_show", this.LJLLLLLL);
            }
        }
        JSONObject jSONObject = LLIFFJFJJ;
        if (jSONObject != null) {
            LLIFFJFJJ = null;
            try {
                M0H hv0 = Hl().hv0();
                JSONObject put = new JSONObject().put("diversion_finish", String.valueOf(jSONObject));
                o.LJIIIIZZ(put, "JSONObject().put(\"diversion_finish\", \"$it\")");
                hv0.LIZ(put, EnumC56110M0k.LYNX_ON_FIRST_SCREEN);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
        }
        if (this.LJLJLJ) {
            JSONObject LIZ = M07.LIZ(EnumC56032Lyu.FROM_SPLIT_SCREEN, LJZI, LLFII, LL);
            FCH.LIZIZ.getClass();
            FCG.LIZ("ec_mall_show", LIZ);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        Activity activity;
        MainActivityScope LJJLIIIJILLIZJL;
        HomeTabAbility LJIL;
        InterfaceC54080LKi Y20;
        o.LJIIIZ(inflater, "inflater");
        C36746EbW.LIZ(3, "ShopMainLifeCycle onCreateView");
        Hl().LJLILLLLZI.LJLJJL = System.currentTimeMillis();
        String str = LLF;
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z && C53286Kvi.LIZ() && (LJJLIIIJILLIZJL = C78866UxK.LJJLIIIJILLIZJL(this)) != null && (LJIL = C87277YNd.LJIL(LJJLIIIJILLIZJL)) != null && (Y20 = LJIL.Y20("SHOP_MALL")) != null) {
            Y20.LIZIZ();
        }
        C29S c29s = null;
        O5Y.LJJJJLL(EnumC56082Lzi.STAGE_CREATE_VIEW_START.getStage(), Hl().LJLILLLLZI, null);
        Context context = getContext();
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        View LIZLLL = C16970lZ.LIZLLL(activity, R.layout.a73);
        if (!(LIZLLL instanceof View)) {
            LIZLLL = null;
        }
        if (LIZLLL != null) {
            try {
                ViewTreeLifecycleOwner.set(LIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LIZLLL, this);
                C10A.LIZIZ(LIZLLL, this);
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
