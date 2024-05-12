package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.PdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rm1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70521Rm1 implements InterfaceC70599RnH {
    public final /* synthetic */ PdpInfoViewHolder LIZ;
    public final /* synthetic */ ViewGroup LIZIZ;

    @Override // X.InterfaceC70599RnH
    public final void LIZ() {
        String str;
        C70414RkI c70414RkI;
        ProductPackStruct productPackStruct;
        ProductBase productBase;
        CombinedSalesVolume combinedSalesVolume;
        String str2;
        Object obj;
        ProductPackStruct productPackStruct2;
        Object obj2;
        ProductPackStruct productPackStruct3;
        ProductPackStruct productPackStruct4;
        String str3;
        HashMap<String, Object> LJII;
        Object obj3;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        HashMap<String, Object> trackParams;
        IPdpStarter.PdpEnterParam pdpEnterParam2;
        HashMap<String, Object> trackParams2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PdpInfoViewHolder pdpInfoViewHolder = this.LIZ;
        PdpViewModel viewModel = pdpInfoViewHolder.getViewModel();
        if (viewModel != null && (pdpEnterParam2 = viewModel.LJLJJLL) != null && (trackParams2 = pdpEnterParam2.getTrackParams()) != null) {
            Object obj4 = trackParams2.get("EVENT_ORIGIN_FEATURE");
            if (obj4 == null) {
                obj4 = "TEMAI";
            }
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", obj4);
        }
        PdpViewModel viewModel2 = pdpInfoViewHolder.getViewModel();
        if (viewModel2 != null && (pdpEnterParam = viewModel2.LJLJJLL) != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
            Object obj5 = trackParams.get("entrance_info");
            if (obj5 == null) {
                obj5 = "";
            }
            linkedHashMap.put("entrance_info", obj5);
        }
        linkedHashMap.put("page_name", "sold_info");
        linkedHashMap.put("previous_page", "product_detail");
        PdpViewModel viewModel3 = pdpInfoViewHolder.getViewModel();
        if (viewModel3 != null && (productPackStruct4 = viewModel3.LJLJLLL) != null && (str3 = productPackStruct4.daInfo) != null && (LJII = C27739Aud.LJII(str3)) != null && (obj3 = LJII.get("volume")) != null) {
            linkedHashMap.put("volume", obj3);
        }
        PdpViewModel viewModel4 = pdpInfoViewHolder.getViewModel();
        String str4 = null;
        if (viewModel4 != null && (productPackStruct3 = viewModel4.LJLJLLL) != null) {
            str = productPackStruct3.daInfo;
        } else {
            str = null;
        }
        HashMap<String, Object> LJII2 = C27739Aud.LJII(str);
        if (LJII2 != null && (obj2 = LJII2.get("inherited_volume")) != null) {
            linkedHashMap.put("inherited_volume", obj2);
        }
        PdpViewModel viewModel5 = pdpInfoViewHolder.getViewModel();
        if (viewModel5 != null && (productPackStruct2 = viewModel5.LJLJLLL) != null) {
            str4 = productPackStruct2.daInfo;
        }
        HashMap<String, Object> LJII3 = C27739Aud.LJII(str4);
        if (LJII3 != null && (obj = LJII3.get("volume_type")) != null) {
            linkedHashMap.put("volume_type", obj);
        }
        PdpViewModel viewModel6 = this.LIZ.getViewModel();
        if (viewModel6 != null && (productPackStruct = viewModel6.LJLJLLL) != null && (productBase = productPackStruct.baseInfo) != null && (combinedSalesVolume = productBase.combinedSalesVolume) != null && (str2 = combinedSalesVolume.sales_specification_schema) != null) {
            Context context = this.LIZIZ.getContext();
            o.LJIIIIZZ(context, "parent.context");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("trackParams", C27739Aud.LJI(linkedHashMap));
            C26867AgZ.LIZIZ(context, str2, linkedHashMap2, false).open();
        }
        PdpViewModel viewModel7 = this.LIZ.getViewModel();
        if (viewModel7 != null && (c70414RkI = viewModel7.LLFII) != null) {
            if (C26847AgF.LIZ()) {
                C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70917RsP(), new AqS178S0100000_12(c70414RkI, 702));
            } else {
                C76542zS.LJ("tiktokec_button_click", new AqS178S0100000_12(c70414RkI, 703));
            }
        }
    }

    @Override // X.InterfaceC70599RnH
    public final void LIZIZ() {
        C70414RkI c70414RkI;
        PdpViewModel viewModel = this.LIZ.getViewModel();
        if (viewModel != null && (c70414RkI = viewModel.LLFII) != null && !c70414RkI.LJJIJ) {
            c70414RkI.LJJIJ = true;
            if (C26847AgF.LIZ()) {
                C76542zS.LJ("tiktokec_button_show", new AqS178S0100000_12(c70414RkI, 704));
            } else {
                C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70918RsQ(0), new AqS178S0100000_12(c70414RkI, 705));
            }
        }
    }

    public C70521Rm1(PdpInfoViewHolder pdpInfoViewHolder, ViewGroup viewGroup) {
        this.LIZ = pdpInfoViewHolder;
        this.LIZIZ = viewGroup;
    }
}
