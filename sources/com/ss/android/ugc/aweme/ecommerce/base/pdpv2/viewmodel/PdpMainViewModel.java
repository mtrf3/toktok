package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel;

import X.ASL;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C249109q6;
import X.C26045AKb;
import X.C26059AKp;
import X.C26867AgZ;
import X.C27162AlK;
import X.C33Q;
import X.C37942Euo;
import X.C3C8;
import X.C45804HyK;
import X.C56412MCa;
import X.C65352Pkq;
import X.C69947Rcl;
import X.C69953Rcr;
import X.C70005Rdh;
import X.C70300RiS;
import X.C70917RsP;
import X.C70953Rsz;
import X.C76800UCe;
import X.C78404Ups;
import X.C78946Uyc;
import X.C78948Uye;
import X.C79234V7u;
import X.C8YZ;
import X.EV6;
import X.EnumC70033Re9;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC60061Nhh;
import X.InterfaceC71003Rtn;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.M2D;
import X.O9C;
import X.OGE;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.TBW;
import X.XKX;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicPage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NavButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.CheckoutFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.model.PdpV2EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.util.ButtonActionHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.CheckoutLink;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductInfoBizExtra;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpMainViewModel extends AssemViewModel<C69947Rcl> implements OGE, KPL, InterfaceC60061Nhh {
    public PdpBodyViewModel LJLIL;
    public PdpHeadViewModel LJLILLLLZI;
    public PdpBottomViewModel LJLJI;
    public C70300RiS LJLJJI;
    public boolean LJLJJL;
    public ButtonActionHelper LJLJJLL;
    public final EV6 LJLJL = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C70005Rdh.class));

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

    @Override // X.OGE
    public final void jf() {
        jv0(false, false);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C69947Rcl defaultState() {
        return new C69947Rcl(0);
    }

    public final PdpBodyViewModel hv0() {
        PdpBodyViewModel pdpBodyViewModel = this.LJLIL;
        if (pdpBodyViewModel != null) {
            return pdpBodyViewModel;
        }
        o.LJIJI("bodyViewModel");
        throw null;
    }

    public final C70300RiS iv0() {
        C70300RiS c70300RiS = this.LJLJJI;
        if (c70300RiS != null) {
            return c70300RiS;
        }
        o.LJIJI("pdpPageData");
        throw null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C26059AKp.LIZ().LIZIZ("ec_sku_panel_open", this);
        C26059AKp.LIZ().LIZIZ("ec_sku_panel_state_change", this);
        C26059AKp.LIZ().LIZIZ("ec_sku_panel_operated", this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
    }

    @Override // X.OGE
    public final String Nx(Integer num) {
        List<BrickInfo> list;
        BrickInfo brickInfo;
        DynamicPage dynamicPage = iv0().LJLILLLLZI;
        if (dynamicPage == null || (list = dynamicPage.bricks) == null) {
            return null;
        }
        Iterator<BrickInfo> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                brickInfo = it.next();
                int i = brickInfo.brickName;
                if (num != null && i == num.intValue()) {
                    break;
                }
            } else {
                brickInfo = null;
                break;
            }
        }
        BrickInfo brickInfo2 = brickInfo;
        if (brickInfo2 == null) {
            return null;
        }
        return brickInfo2.brickBizData;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gv0(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicPage r16) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel.gv0(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicPage):void");
    }

    public final void mv0(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJL = z;
        setState(new AqS36S0001000_12(i, 4));
    }

    public final void jv0(boolean z, boolean z2) {
        XKX.LIZLLL(getAssemVMScope(), null, null, new C69953Rcr(z, this, z2, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x019f, code lost:
    
        if (r5 != null) goto L64;
     */
    @Override // X.InterfaceC60061Nhh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel.onEvent(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void kv0(PdpMainViewModel pdpMainViewModel, Fragment fragment, NavButton navButton) {
        Context context;
        InterfaceC71003Rtn interfaceC71003Rtn;
        String str;
        String str2;
        String str3;
        FragmentManager supportFragmentManager;
        SparkContext sparkContext;
        C37942Euo c37942Euo;
        ProductInfoBizExtra LIZJ;
        PdpV2EnterParams pdpV2EnterParams;
        SkuPanelState skuPanelState;
        pdpMainViewModel.getClass();
        o.LJIIIZ(navButton, "navButton");
        ButtonActionHelper buttonActionHelper = pdpMainViewModel.LJLJJLL;
        String str4 = null;
        if (buttonActionHelper != null) {
            if (fragment == 0 || (context = fragment.getContext()) == null) {
                return;
            }
            if (fragment instanceof InterfaceC71003Rtn) {
                interfaceC71003Rtn = (InterfaceC71003Rtn) fragment;
            } else {
                interfaceC71003Rtn = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Integer num = navButton.action;
            int value = EnumC70033Re9.SHARE.getValue();
            if (num == null || num.intValue() != value) {
                int value2 = EnumC70033Re9.BUY.getValue();
                if (num == null || num.intValue() != value2) {
                    int value3 = EnumC70033Re9.ADD_TO_CART.getValue();
                    if (num == null || num.intValue() != value3) {
                        int value4 = EnumC70033Re9.CART.getValue();
                        if (num == null || num.intValue() != value4) {
                            int value5 = EnumC70033Re9.REPORT.getValue();
                            if (num == null || num.intValue() != value5) {
                                int value6 = EnumC70033Re9.SCHEMA.getValue();
                                if (num == null || num.intValue() != value6) {
                                    int value7 = EnumC70033Re9.CHECKOUT.getValue();
                                    if (num != null && num.intValue() == value7) {
                                        String LIZ = buttonActionHelper.LIZ(navButton.schema);
                                        C70300RiS c70300RiS = buttonActionHelper.LJLILLLLZI;
                                        if (c70300RiS != null && (skuPanelState = c70300RiS.LJLLL) != null) {
                                            str4 = skuPanelState.getLink();
                                        }
                                        String LIZ2 = buttonActionHelper.LIZ(str4);
                                        if (LIZ != null || LIZ2 != null) {
                                            C70300RiS c70300RiS2 = buttonActionHelper.LJLILLLLZI;
                                            if (c70300RiS2 != null) {
                                                c70300RiS2.LJLLLL = true;
                                            }
                                            if (LIZ2 == null) {
                                                if (LIZ == null) {
                                                    LIZ = "";
                                                }
                                            } else {
                                                LIZ = LIZ2;
                                            }
                                            C26867AgZ.LIZIZ(context, LIZ, C113554cx.LJJJLIIL(), false).open();
                                            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                                            if (LJJIFFI != null) {
                                                C26045AKb c26045AKb = new C26045AKb(LJJIFFI);
                                                c26045AKb.LJIIIZ(navButton.clickToast);
                                                c26045AKb.LIZ(true);
                                                c26045AKb.LIZLLL(2000L);
                                                c26045AKb.LJIIJ();
                                            }
                                        }
                                    }
                                } else {
                                    String LIZ3 = buttonActionHelper.LIZ(navButton.schema);
                                    if (LIZ3 != null) {
                                        C26867AgZ.LIZIZ(context, LIZ3, C113554cx.LJJJLIIL(), false).open();
                                    }
                                }
                            } else {
                                String str5 = navButton.schema;
                                if (str5 != null) {
                                    M2D m2d = new M2D();
                                    Uri.Builder buildUpon = UriProtector.parse(str5).buildUpon();
                                    C70300RiS c70300RiS3 = buttonActionHelper.LJLILLLLZI;
                                    if (c70300RiS3 != null) {
                                        str = c70300RiS3.LIZIZ();
                                    } else {
                                        str = null;
                                    }
                                    Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("product_id", str);
                                    C70300RiS c70300RiS4 = buttonActionHelper.LJLILLLLZI;
                                    if (c70300RiS4 != null && (pdpV2EnterParams = c70300RiS4.LJLIL) != null) {
                                        str2 = pdpV2EnterParams.getSellerSecUid();
                                    } else {
                                        str2 = null;
                                    }
                                    Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("seller_sec_uid", str2);
                                    C70300RiS c70300RiS5 = buttonActionHelper.LJLILLLLZI;
                                    if (c70300RiS5 != null && (LIZJ = c70300RiS5.LIZJ()) != null) {
                                        str3 = LIZJ.productName;
                                    } else {
                                        str3 = null;
                                    }
                                    Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("product_title", str3);
                                    C70300RiS c70300RiS6 = buttonActionHelper.LJLILLLLZI;
                                    if (c70300RiS6 != null) {
                                        str4 = (String) c70300RiS6.LJLLJ.getValue();
                                    }
                                    String uri = appendQueryParameter3.appendQueryParameter("product_image", str4).build().toString();
                                    o.LJIIIIZZ(uri, "parse(schema)\n          …              .toString()");
                                    m2d.LJIILLIIL = uri;
                                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ4 = O9C.LIZ(context, m2d);
                                    if (interfaceC71003Rtn != null && (sparkContext = LIZ4.getSparkContext()) != null && (c37942Euo = (C37942Euo) sparkContext.LIZIZ(C37942Euo.class)) != null) {
                                        c37942Euo.LJIILLIIL(InterfaceC71003Rtn.class, interfaceC71003Rtn);
                                    }
                                    LIZ4.LIZIZ();
                                    ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(context);
                                    if (LJJIFFI2 != null && (supportFragmentManager = LJJIFFI2.getSupportFragmentManager()) != null) {
                                        ASL asl = new ASL();
                                        int i = (int) C27162AlK.LJ;
                                        LIZ4.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
                                        asl.LIZ.LJLLI = LIZ4;
                                        asl.LJI(1);
                                        TuxSheet tuxSheet = asl.LIZ;
                                        tuxSheet.LJLLLLLL = i;
                                        tuxSheet.LJZI = false;
                                        tuxSheet.show(supportFragmentManager, "report_page");
                                        buttonActionHelper.LJLJI = tuxSheet;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Integer num2 = navButton.action;
            int value8 = EnumC70033Re9.REPORT.getValue();
            if (num2 == null || num2.intValue() != value8) {
                if (interfaceC71003Rtn == null) {
                    return;
                }
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70917RsP(), new AqS116S0300000_12(navButton, (NavButton) buttonActionHelper, (ButtonActionHelper) linkedHashMap, (Map<String, Object>) 34));
                return;
            } else {
                if (interfaceC71003Rtn == null) {
                    return;
                }
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70953Rsz(), new AqS176S0100000_10(linkedHashMap, (Map<String, ? extends Object>) 135));
                return;
            }
        }
        o.LJIJI("buttonActionHelper");
        throw null;
    }

    public static void lv0(View view, CheckoutLink checkoutLink, String str) {
        Context context;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        if (view != null && (context = view.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(view);
            CheckoutFragment checkoutFragment = new CheckoutFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("checkoutLink", checkoutLink);
            if (LJIILIIL != null) {
                C79234V7u.LJJIJIIJI(bundle, LJIILIIL, null);
            }
            checkoutFragment.setArguments(bundle);
            checkoutFragment.LJLILLLLZI = str;
            TuxSheet tuxSheet = C249109q6.LIZ(1).LIZ;
            tuxSheet.LJLLJ = true;
            tuxSheet.LJLLILLLL = checkoutFragment;
            tuxSheet.show(supportFragmentManager, "CheckoutFragment");
        }
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
