package com.ss.android.ugc.aweme.ecommerce.base.sku.strategy;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C00F;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1A8;
import X.C221108m2;
import X.C27334Ao6;
import X.C27739Aud;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C3H3;
import X.C45804HyK;
import X.C62822Ol8;
import X.C69984RdM;
import X.C70284RiC;
import X.C70307RiZ;
import X.C70333Riz;
import X.C70347RjD;
import X.C72713SgH;
import X.C72714SgI;
import X.C73156SnQ;
import X.C76542zS;
import X.C76800UCe;
import X.C78565UsT;
import X.C78609UtB;
import X.C78948Uye;
import X.C90903hW;
import X.DialogInterfaceOnShowListenerC70506Rlm;
import X.InterfaceC71003Rtn;
import X.ORZ;
import X.TBT;
import X.TBV;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.widget.Widget;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
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
import defpackage.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuPanelFragment extends BaseSkuFragment {
    public BottomSheetBehavior<FrameLayout> LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final SkuPanelFragment LJLJJLL = this;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C70333Riz.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 501));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 499));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 502));

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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

    public final void wl() {
        View findViewById;
        C72714SgI c72714SgI = C72713SgH.LJIIIIZZ;
        SkuPanelFragment skuPanelFragment = this.LJLJJLL;
        View view = skuPanelFragment.getView();
        c72714SgI.getClass();
        C72713SgH LIZ = C72714SgI.LIZ(view, skuPanelFragment);
        LIZ.LIZJ(R.id.e3y, (Widget) this.LJLJL.getValue(), false);
        SkuPanelStarter.SkuEnterParams skuEnterParams = vl().LJLLJ;
        if (skuEnterParams == null || !o.LJ(skuEnterParams.isFromBundleDeal(), Boolean.TRUE)) {
            View view2 = this.LJLJJLL.getView();
            if (view2 != null && (findViewById = view2.findViewById(R.id.bwh)) != null) {
                C45804HyK.LJJLIIIJ(vl().Tv0().LIZ(), findViewById);
            }
            LIZ.LIZJ(R.id.bwh, (Widget) this.LJLJLJ.getValue(), false);
        }
        LIZ.LIZJ(R.id.k2r, (Widget) this.LJLLI.getValue(), false);
        LIZ.LIZJ(R.id.hjh, (Widget) this.LJLJLLL.getValue(), false);
        LIZ.LIZJ(R.id.ap_, (Widget) this.LJLL.getValue(), false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SkuPanelState skuPanelState;
        String str;
        Integer productQuantity;
        super.onDestroyView();
        SkuPanelState skuPanelState2 = vl().LJLLI;
        if ((skuPanelState2 == null || (productQuantity = skuPanelState2.getProductQuantity()) == null || productQuantity.intValue() == 0) && (skuPanelState = vl().LJLLI) != null) {
            skuPanelState.setProductQuantity(1);
        }
        SkuPanelStarter.LIZ(vl().LJLLI);
        IEventCenter LJ = EventCenter.LJ();
        SkuPanelState skuPanelState3 = vl().LJLLI;
        if (skuPanelState3 != null) {
            str = C27739Aud.LJI(skuPanelState3);
        } else {
            str = "{}";
        }
        LJ.LIZ("ec_sku_panel_close", str);
        C70307RiZ.LIZ.clear();
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
        HashMap<String, Object> hashMap;
        boolean z;
        Object obj2;
        Object obj3;
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
        SkuPanelStarter.SkuEnterParams skuEnterParams3 = vl().LJLLJ;
        if (skuEnterParams3 != null) {
            hashMap = skuEnterParams3.getTrackParams();
        } else {
            hashMap = null;
        }
        String LIZ = C69984RdM.LIZ(num, hashMap);
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
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (e1.LIZ(31744, "ecom_sku_initview_optimize", true, false)) {
            wl();
        }
        Dialog dialog = this.LJLJJLL.getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterfaceOnShowListenerC70506Rlm(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        HashMap<String, Object> trackParams;
        String str;
        Map<String, String> map;
        Map<String, String> map2;
        String oldPrice;
        super.onCreate(bundle);
        vl().LJLLJ = (SkuPanelStarter.SkuEnterParams) C1A8.LJIIZILJ(this.LJLJJLL, "enter_params");
        SkuPanelStarter.SkuEnterParams skuEnterParams = vl().LJLLJ;
        String str2 = null;
        if (skuEnterParams == null || skuEnterParams.getProductId() == null) {
            return;
        }
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Rir
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((SkuState) obj).getSkuFragmentClosed());
            }
        }, new AqS194S0100000_12(this, 190));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Riu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getShowToast();
            }
        }, new AqS194S0100000_12(this, 191));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Rgc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getKeyBoardVisibility();
            }
        }, new AqS186S0100000_4(this, 261));
        LifecycleOwnerKt.getLifecycleScope(this.LJLJJLL).launchWhenResumed(new C70284RiC(this, null));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.RgG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuDataState();
            }
        }, new AqS194S0100000_12(this, 188));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBV() { // from class: X.Rio
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((SkuState) obj).getShowLoadingView());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((SkuState) obj).setShowLoadingView(((Boolean) obj2).booleanValue());
            }
        }, new AqS186S0100000_4(this, 259));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Rgr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuStockInfo();
            }
        }, new AqS194S0100000_12(this, 189));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.ReR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getPreOrderInfo();
            }
        }, new AqS186S0100000_4(this, 260));
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = vl().LJLLJ;
        boolean z = false;
        if (skuEnterParams2 != null && skuEnterParams2.getNeedRequest()) {
            vl().Ov0();
        } else {
            SkuPanelViewModel vl = vl();
            SkuPanelFragment node = this.LJLJJLL;
            vl.getClass();
            o.LJIIIZ(node, "node");
            if (C00F.LIZ(31744, 0, "pdp_sku_data_pass_opt", true) == 1) {
                z = true;
            }
            String str3 = "{}";
            if (z) {
                SkuPanelStarter.SkuRenderParams skuRenderParams = (SkuPanelStarter.SkuRenderParams) C1A8.LJIIZILJ(node, "sku_render_params");
                if (skuRenderParams == null) {
                    IEventCenter LJ = EventCenter.LJ();
                    SkuPanelStarter.SkuEnterParams skuEnterParams3 = vl.LJLLJ;
                    if (skuEnterParams3 != null) {
                        str3 = C27739Aud.LJI(skuEnterParams3);
                    }
                    LJ.LIZ("ec_sku_panel_open", str3);
                } else {
                    vl.dw0(skuRenderParams);
                }
            } else {
                IEventCenter LJ2 = EventCenter.LJ();
                SkuPanelStarter.SkuEnterParams skuEnterParams4 = vl.LJLLJ;
                if (skuEnterParams4 != null) {
                    str3 = C27739Aud.LJI(skuEnterParams4);
                }
                LJ2.LIZ("ec_sku_panel_open", str3);
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams5 = vl().LJLLJ;
            if (skuEnterParams5 != null && (trackParams = skuEnterParams5.getTrackParams()) != null) {
                ProductPackStruct productPackStruct = vl().LJLLL;
                if (productPackStruct == null || (map = productPackStruct.extra) == null || map.get("mix_product_type") == null) {
                    str = "";
                } else {
                    ProductPackStruct productPackStruct2 = vl().LJLLL;
                    if (productPackStruct2 != null && (map2 = productPackStruct2.extra) != null) {
                        str2 = map2.get("mix_product_type");
                    }
                    str = String.valueOf(str2);
                }
                trackParams.put("is_mix_product", str);
            }
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams6 = vl().LJLLJ;
        if (skuEnterParams6 != null && (oldPrice = skuEnterParams6.getOldPrice()) != null) {
            vl().LLI = oldPrice;
        }
        C70307RiZ.LIZ(vl().LJLLJ);
    }

    public final void xl(boolean z) {
        Long l;
        boolean z2;
        boolean z3;
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
            int i = 0;
            if (vl().LJLLLL.getValue() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!skuEnterParams.getNeedRequest()) {
                hashMap.put("hit_cache", 2);
            } else if (z2) {
                hashMap.put("hit_cache", 1);
            } else {
                hashMap.put("hit_cache", 0);
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
                z3 = pdpFullScreen.booleanValue();
            } else {
                z3 = false;
            }
            long j = currentTimeMillis - longValue;
            Integer productQuantity = skuEnterParams.getProductQuantity();
            if (productQuantity != null) {
                i = productQuantity.intValue();
            }
            new C3H3(z3, j, i).LIZJ(hashMap);
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
        HashMap<String, Object> hashMap;
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
            C78565UsT.LJJIJIIJIL(this.LJLJJLL, new C27334Ao6(this, list2, null));
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
        SkuPanelStarter.SkuEnterParams skuEnterParams3 = vl().LJLLJ;
        if (skuEnterParams3 != null) {
            hashMap = skuEnterParams3.getTrackParams();
        } else {
            hashMap = null;
        }
        String LIZ = C69984RdM.LIZ(num, hashMap);
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
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a7l, viewGroup, false);
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
