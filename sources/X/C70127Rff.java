package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.Rff, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70127Rff extends AbstractC70571Rmp {
    public final IPdpStarter.PdpEnterParam LIZJ;
    public final View LIZLLL;
    public final java.util.Map<String, Object> LJ;

    @Override // X.AbstractC70571Rmp
    public final java.util.Map<String, Object> LIZ() {
        Integer bizType;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZJ;
        if (pdpEnterParam != null && (bizType = pdpEnterParam.getBizType()) != null) {
            C61845OOz.LIZLLL(bizType, linkedHashMap, "biz_type");
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC70571Rmp
    public final java.util.Map<String, Object> LIZIZ() {
        HashMap<String, Object> hashMap;
        LaneParams laneParams;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        HashMap<String, Object> trackParams;
        InterfaceC71003Rtn LJIILIIL;
        C70101RfF c70101RfF = IPdpStarter.LIZ;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZJ;
        c70101RfF.getClass();
        int LIZIZ = C70101RfF.LIZIZ(pdpEnterParam);
        IPdpStarter.PdpEnterParam pdpEnterParam2 = this.LIZJ;
        Object obj10 = null;
        if (pdpEnterParam2 != null) {
            hashMap = pdpEnterParam2.getTrackParams();
        } else {
            hashMap = null;
        }
        Integer valueOf = Integer.valueOf(LIZIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        View view = this.LIZLLL;
        if (view != null && (LJIILIIL = C78948Uye.LJIILIIL(view)) != null) {
            laneParams = C78948Uye.LJIILJJIL(LJIILIIL, "lib_track_builtin_lane_business");
        } else {
            laneParams = null;
        }
        IPdpStarter.PdpEnterParam pdpEnterParam3 = this.LIZJ;
        if (pdpEnterParam3 != null) {
            pdpEnterParam3.getTrackParams();
        }
        linkedHashMap.put("entrance_form", "horizontal_goods_card");
        linkedHashMap.put("source_page_type", "buy_together");
        linkedHashMap.put("source_module", "rec_pdp_outer_buy_together_module");
        linkedHashMap.put("previous_page", "product_detail");
        IPdpStarter.PdpEnterParam pdpEnterParam4 = this.LIZJ;
        if (pdpEnterParam4 != null && (trackParams = pdpEnterParam4.getTrackParams()) != null) {
            obj = trackParams.get("follow_status");
        } else {
            obj = null;
        }
        linkedHashMap.put("follow_status", obj);
        linkedHashMap.put("source_previous_page", "product_detail");
        java.util.Map<String, Object> map = this.LJ;
        String str = "";
        if (map == null || (obj2 = map.get("product_id")) == null) {
            obj2 = "";
        }
        linkedHashMap.put("product_id", obj2);
        java.util.Map<String, Object> map2 = this.LJ;
        if (map2 == null || (obj3 = map2.get("product_source")) == null) {
            obj3 = "";
        }
        linkedHashMap.put("product_source", obj3);
        java.util.Map<String, Object> map3 = this.LJ;
        if (map3 != null && (obj9 = map3.get("track_id")) != 0) {
            str = obj9;
        }
        linkedHashMap.put("track_id", str);
        java.util.Map<String, Object> map4 = this.LJ;
        if (map4 != null) {
            obj4 = map4.get("rec_params");
        } else {
            obj4 = null;
        }
        linkedHashMap.put("rec_params", obj4);
        if (laneParams != null) {
            obj5 = laneParams.get((Object) "track_id");
        } else {
            obj5 = null;
        }
        linkedHashMap.put("parent_track_id", obj5);
        if (laneParams != null) {
            obj6 = laneParams.get((Object) "product_id");
        } else {
            obj6 = null;
        }
        linkedHashMap.put("parent_product_id", obj6);
        if (laneParams != null) {
            obj7 = laneParams.get((Object) "request_id");
        } else {
            obj7 = null;
        }
        linkedHashMap.put("parent_request_id", obj7);
        if (laneParams != null) {
            obj8 = laneParams.get((Object) "first_source_page");
        } else {
            obj8 = null;
        }
        linkedHashMap.put("first_source_page", obj8);
        if (laneParams != null) {
            obj10 = laneParams.get((Object) "first_track_id");
        }
        linkedHashMap.put("first_track_id", obj10);
        return C27722AuM.LIZ(hashMap, valueOf, linkedHashMap);
    }

    public C70127Rff(IPdpStarter.PdpEnterParam pdpEnterParam, View view, String str, java.util.Map<String, ? extends Object> map, PdpPreviewInfo pdpPreviewInfo) {
        super(str, pdpPreviewInfo);
        this.LIZJ = pdpEnterParam;
        this.LIZLLL = view;
        this.LJ = map;
    }
}
