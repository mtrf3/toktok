package com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1A8;
import X.C221108m2;
import X.C27335Ao7;
import X.C27739Aud;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C3H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69984RdM;
import X.C70031Re7;
import X.C70211Rh1;
import X.C70307RiZ;
import X.C70320Rim;
import X.C70329Riv;
import X.C70331Rix;
import X.C70347RjD;
import X.C73156SnQ;
import X.C76542zS;
import X.C76800UCe;
import X.C78565UsT;
import X.C78609UtB;
import X.C78948Uye;
import X.C90903hW;
import X.DialogInterfaceOnShowListenerC70507Rln;
import X.InterfaceC71003Rtn;
import X.ORZ;
import X.TBT;
import X.TBV;
import Y.IDCListenerS258S0100000_12;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.SkuCommonState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MiniPdpPanelFragment extends BaseSkuFragment {
    public final lifecycleAwareLazy LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public BottomSheetBehavior<FrameLayout> LJLLILLLL;
    public final IDCListenerS258S0100000_12 LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public final MiniPdpPanelFragment LJLJJLL = this;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
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

    public MiniPdpPanelFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(MiniPdpPanelViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 480);
        this.LJLJL = new lifecycleAwareLazy(this, aqS162S0100000_12, new AqS72S0400000_12(this, aqS162S0100000_12, LIZ, C70320Rim.INSTANCE, 12));
        this.LJLJLJ = C221108m2.LIZIZ(C70331Rix.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(C70211Rh1.LJLIL);
        this.LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 479));
        this.LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 478));
        this.LJLLJ = new IDCListenerS258S0100000_12(this, 2);
    }

    public final MiniPdpPanelViewModel wl() {
        return (MiniPdpPanelViewModel) this.LJLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i;
        String str;
        SkuPanelState skuPanelState;
        Integer productQuantity;
        SkuPanelState skuPanelState2;
        Integer productQuantity2;
        super.onDestroyView();
        SkuPanelState skuPanelState3 = vl().LJLLI;
        if (skuPanelState3 != null && (productQuantity2 = skuPanelState3.getProductQuantity()) != null) {
            i = productQuantity2.intValue();
        } else {
            i = 0;
        }
        if (i == 0 && (skuPanelState2 = vl().LJLLI) != null) {
            skuPanelState2.setProductQuantity(1);
        }
        SkuPanelStarter.LIZ(vl().LJLLI);
        IEventCenter LJ = EventCenter.LJ();
        SkuPanelState skuPanelState4 = vl().LJLLI;
        String str2 = "{}";
        if (skuPanelState4 == null) {
            str = "{}";
        } else {
            str = C27739Aud.LJI(skuPanelState4);
        }
        LJ.LIZ("ec_sku_panel_close", str);
        LinkedHashMap<String, Object> linkedHashMap = C70307RiZ.LIZ;
        linkedHashMap.clear();
        SkuPanelViewModel skuPanelViewModel = wl().LJLJL;
        if (skuPanelViewModel != null) {
            skuPanelState = skuPanelViewModel.Ih0();
            if (skuPanelState != null && ((productQuantity = skuPanelState.getProductQuantity()) == null || (productQuantity.intValue() == 0 && skuPanelState != null))) {
                skuPanelState.setProductQuantity(1);
            }
        } else {
            skuPanelState = null;
        }
        SkuPanelStarter.LIZ(skuPanelState);
        IEventCenter LJ2 = EventCenter.LJ();
        if (skuPanelState != null) {
            str2 = C27739Aud.LJI(skuPanelState);
        }
        LJ2.LIZ("ec_sku_panel_close", str2);
        linkedHashMap.clear();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        int i;
        Object obj;
        String str;
        String str2;
        String str3;
        Integer num;
        boolean z;
        Object obj2;
        Object obj3;
        View findViewById;
        LaneParams LJIILJJIL;
        List<SaleProp> list;
        super.onStop();
        SkuInfo skuInfo = vl().LJLLILLLL;
        if (skuInfo != null && (list = skuInfo.salePropList) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        InterfaceC71003Rtn preTrackNode = this.LJLJJLL.preTrackNode();
        Object obj4 = null;
        if (preTrackNode != null && (LJIILJJIL = C78948Uye.LJIILJJIL(preTrackNode, "lib_track_builtin_lane_business")) != null) {
            obj = LJIILJJIL.get((Object) "voucher_da_info");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str);
        SkuPanelStarter.SkuEnterParams skuEnterParams = vl().LJLLJ;
        if (skuEnterParams != null) {
            str2 = skuEnterParams.getEnterFrom();
        } else {
            str2 = null;
        }
        long stayDuration = this.LJLJJLL.getStayDuration();
        if (ActivityStack.isAppBackGround()) {
            str3 = "close";
        } else {
            SkuPanelState skuPanelState = vl().LJLLI;
            if (skuPanelState != null && skuPanelState.getBackToPdp()) {
                str3 = "next";
            } else {
                str3 = "return";
            }
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = vl().LJLLJ;
        if (skuEnterParams2 != null) {
            num = Integer.valueOf(skuEnterParams2.getClickFrom());
        } else {
            num = null;
        }
        String LIZ = C69984RdM.LIZ(num, null);
        if (vl().LJLLILLLL != null) {
            z = true;
        } else {
            z = false;
        }
        if (LJII != null) {
            obj2 = LJII.get("coupon_id");
        } else {
            obj2 = null;
        }
        String str4 = (String) obj2;
        if (LJII != null) {
            obj3 = LJII.get("coupon_type_id");
        } else {
            obj3 = null;
        }
        String str5 = (String) obj3;
        if (LJII != null) {
            obj4 = LJII.get("coupon_type_info");
        }
        C70307RiZ.LIZLLL(i, stayDuration, vl().LLFF, str2, str3, LIZ, str4, str5, (String) obj4, z);
        Dialog dialog = getDialog();
        if (dialog != null && (findViewById = dialog.findViewById(R.id.c_5)) != null) {
            findViewById.removeOnLayoutChangeListener(this.LJLLJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        setupBottomSheetHeight(-1);
        setBottomSheetHideable(false);
        Dialog dialog = this.LJLJJLL.getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterfaceOnShowListenerC70507Rln(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String oldPrice;
        String str;
        HashMap<String, Object> trackParams;
        String str2;
        Map<String, String> map;
        Map<String, String> map2;
        super.onCreate(bundle);
        vl().LJLLJ = (SkuPanelStarter.SkuEnterParams) C1A8.LJIIZILJ(this.LJLJJLL, "enter_params");
        SkuPanelStarter.SkuEnterParams skuEnterParams = vl().LJLLJ;
        String str3 = null;
        if (skuEnterParams == null || skuEnterParams.getProductId() == null) {
            return;
        }
        MiniPdpPanelViewModel wl = wl();
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = (SkuPanelStarter.SkuEnterParams) C1A8.LJIIZILJ(this, "enter_params");
        SkuPanelViewModel contentViewModel = vl();
        wl.getClass();
        o.LJIIIZ(contentViewModel, "contentViewModel");
        wl.LJLJL = contentViewModel;
        wl.LJLJJLL = skuEnterParams2;
        MiniPdpPanelViewModel wl2 = wl();
        SkuPanelStarter.SkuEnterParams skuEnterParams3 = wl2.LJLJJLL;
        if (skuEnterParams3 == null || skuEnterParams3.getProductId() == null) {
            wl2.setState(C70329Riv.LJLIL);
        } else {
            SkuPanelStarter.SkuEnterParams skuEnterParams4 = wl2.LJLJJLL;
            if (skuEnterParams4 != null && skuEnterParams4.getNeedRequest()) {
                SkuPanelViewModel skuPanelViewModel = wl2.LJLJL;
                if (skuPanelViewModel != null) {
                    skuPanelViewModel.Ov0();
                }
            } else {
                IEventCenter LJ = EventCenter.LJ();
                SkuPanelStarter.SkuEnterParams skuEnterParams5 = wl2.LJLJJLL;
                if (skuEnterParams5 != null) {
                    str = C27739Aud.LJI(skuEnterParams5);
                } else {
                    str = "{}";
                }
                LJ.LIZ("ec_sku_panel_open", str);
                SkuPanelStarter.SkuEnterParams skuEnterParams6 = wl2.LJLJJLL;
                if (skuEnterParams6 != null && (trackParams = skuEnterParams6.getTrackParams()) != null) {
                    ProductPackStruct productPackStruct = wl2.LJLJLJ;
                    if (productPackStruct == null || (map = productPackStruct.extra) == null || map.get("mix_product_type") == null) {
                        str2 = "";
                    } else {
                        ProductPackStruct productPackStruct2 = wl2.LJLJLJ;
                        if (productPackStruct2 != null && (map2 = productPackStruct2.extra) != null) {
                            str3 = map2.get("mix_product_type");
                        }
                        str2 = String.valueOf(str3);
                    }
                    trackParams.put("is_mix_product", str2);
                }
            }
            C70307RiZ.LIZ(wl2.LJLJJLL);
        }
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Riq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((SkuState) obj).getSkuFragmentClosed());
            }
        }, new AqS194S0100000_12(this, 169));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.ReF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getOriginalProductPackStruct();
            }
        }, new AqS194S0100000_12(this, 170));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Rit
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getShowToast();
            }
        }, new AqS194S0100000_12(this, 171));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.RgF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuDataState();
            }
        }, new AqS194S0100000_12(this, 172));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBV() { // from class: X.Rin
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((SkuState) obj).getShowLoadingView());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((SkuState) obj).setShowLoadingView(((Boolean) obj2).booleanValue());
            }
        }, new AqS186S0100000_4(this, 243));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Rgq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuStockInfo();
            }
        }, new AqS194S0100000_12(this, 167));
        C73156SnQ.LJIIIIZZ(this, wl(), new TBT() { // from class: X.Riw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuCommonState) obj).getCloseFragment();
            }
        }, new AqS194S0100000_12(this, 168));
        SkuPanelStarter.SkuEnterParams skuEnterParams7 = vl().LJLLJ;
        if (skuEnterParams7 != null && (oldPrice = skuEnterParams7.getOldPrice()) != null) {
            vl().LLI = oldPrice;
        }
        C70307RiZ.LIZ(vl().LJLLJ);
    }

    public final void xl(boolean z) {
        Long l;
        boolean z2;
        Object obj;
        SkuPanelStarter.SkuEnterParams skuEnterParams = vl().LJLLJ;
        if (skuEnterParams != null && (l = SkuPanelStarter.LIZIZ) != null) {
            long longValue = l.longValue();
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            HashMap<String, Object> orderRequestParams = skuEnterParams.getOrderRequestParams();
            if (orderRequestParams != null) {
                hashMap.putAll(orderRequestParams);
            }
            HashMap<String, Object> visitReportParams = skuEnterParams.getVisitReportParams();
            if (visitReportParams != null) {
                hashMap.putAll(visitReportParams);
            }
            HashMap<String, Object> trackParams = skuEnterParams.getTrackParams();
            if (trackParams != null) {
                hashMap.putAll(trackParams);
            }
            ProductPackStruct LIZ = C70031Re7.LIZ(skuEnterParams.getProductId());
            int i = 0;
            if (!skuEnterParams.getNeedRequest()) {
                hashMap.put("hit_cache", 2);
            } else if (LIZ == null) {
                hashMap.put("hit_cache", 0);
            } else {
                hashMap.put("hit_cache", 1);
            }
            hashMap.put("image_count", Integer.valueOf(((ArrayList) vl().LJLJJLL).size()));
            hashMap.put("is_success", Integer.valueOf(z ? 1 : 0));
            List<Image> list = vl().LJLJJLL;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                List<String> thumbUrls = ((Image) it.next()).getThumbUrls();
                if (thumbUrls != null) {
                    obj = ORZ.LJLLLL(thumbUrls);
                } else {
                    obj = null;
                }
                arrayList.add(obj);
            }
            hashMap.put("image_urls", arrayList);
            Boolean pdpFullScreen = skuEnterParams.getPdpFullScreen();
            if (pdpFullScreen != null) {
                z2 = pdpFullScreen.booleanValue();
            } else {
                z2 = false;
            }
            long j = currentTimeMillis - longValue;
            Integer productQuantity = skuEnterParams.getProductQuantity();
            if (productQuantity != null) {
                i = productQuantity.intValue();
            }
            new C3H3(z2, j, i).LIZJ(hashMap);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        Object obj;
        String str;
        String str2;
        Integer num;
        Object obj2;
        Object obj3;
        LaneParams LJIILJJIL;
        List<SaleProp> list;
        ProductPackStruct productPackStruct;
        List<ShopPolicy> list2;
        o.LJIIIZ(view, "view");
        ProductPackStruct productPackStruct2 = vl().LJLLL;
        if (productPackStruct2 != null && C78609UtB.LJJJJJL(productPackStruct2)) {
            z = true;
        } else {
            z = false;
        }
        Object obj4 = null;
        if (!z && (productPackStruct = vl().LJLLL) != null && (list2 = productPackStruct.shopPolicies) != null && !list2.isEmpty()) {
            C78565UsT.LJJIJIIJIL(this.LJLJJLL, new C27335Ao7(this, list2, null));
        }
        SkuInfo skuInfo = vl().LJLLILLLL;
        if (skuInfo != null && (list = skuInfo.salePropList) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        InterfaceC71003Rtn preTrackNode = this.LJLJJLL.preTrackNode();
        if (preTrackNode != null && (LJIILJJIL = C78948Uye.LJIILJJIL(preTrackNode, "lib_track_builtin_lane_business")) != null) {
            obj = LJIILJJIL.get((Object) "voucher_da_info");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str);
        SkuPanelStarter.SkuEnterParams skuEnterParams = vl().LJLLJ;
        if (skuEnterParams != null) {
            str2 = skuEnterParams.getEnterFrom();
        } else {
            str2 = null;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = vl().LJLLJ;
        if (skuEnterParams2 != null) {
            num = Integer.valueOf(skuEnterParams2.getClickFrom());
        } else {
            num = null;
        }
        String LIZ = C69984RdM.LIZ(num, null);
        if (LJII != null) {
            obj2 = LJII.get("coupon_id");
        } else {
            obj2 = null;
        }
        String str3 = (String) obj2;
        if (LJII != null) {
            obj3 = LJII.get("coupon_type_id");
        } else {
            obj3 = null;
        }
        String str4 = (String) obj3;
        if (LJII != null) {
            obj4 = LJII.get("coupon_type_info");
        }
        C76542zS.LIZJ("tiktokec_enter_page", new C70347RjD(i, str2, LIZ, str3, str4, (String) obj4));
        Context requireContext = this.LJLJJLL.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        Spannable Mv0 = vl().Mv0(AnonymousClass636.LJIIIIZZ(R.attr.eb, requireContext));
        if (Mv0 != null) {
            ((TextView) this.LJLJJLL._$_findCachedViewById(R.id.k39)).setText(Mv0);
            this.LJLJJLL._$_findCachedViewById(R.id.aqw).setVisibility(0);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LJLJJLL._$_findCachedViewById(R.id.aqw).setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a7m, viewGroup, false);
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
}
