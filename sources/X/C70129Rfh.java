package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.Rfh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70129Rfh extends AbstractC70571Rmp {
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

    @Override // X.AbstractC70571Rmp
    public final java.util.Map<String, Object> LIZIZ() {
        HashMap<String, Object> hashMap;
        LaneParams laneParams;
        HashMap<String, Object> hashMap2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        HashMap<String, Object> trackParams;
        InterfaceC71003Rtn LJIILIIL;
        C70101RfF c70101RfF = IPdpStarter.LIZ;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZJ;
        c70101RfF.getClass();
        int LIZIZ = C70101RfF.LIZIZ(pdpEnterParam);
        IPdpStarter.PdpEnterParam pdpEnterParam2 = this.LIZJ;
        Object obj8 = null;
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
            hashMap2 = pdpEnterParam3.getTrackParams();
        } else {
            hashMap2 = null;
        }
        linkedHashMap.put("entrance_form", "horizontal_goods_card");
        linkedHashMap.put("source_page_type", "bundle_deal");
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
        Object obj9 = "";
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
        if (map3 == null || (obj4 = map3.get("track_id")) == null) {
            obj4 = "";
        }
        linkedHashMap.put("track_id", obj4);
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
            obj8 = laneParams.get((Object) "request_id");
        }
        linkedHashMap.put("parent_request_id", obj8);
        if (hashMap2 != null && ((obj7 = hashMap2.get("first_source_page")) != null || (obj7 = hashMap2.get("source_page_type")) != null)) {
            obj9 = obj7;
        }
        linkedHashMap.put("first_source_page", obj9);
        return C27722AuM.LIZ(hashMap, valueOf, linkedHashMap);
    }

    public C70129Rfh(IPdpStarter.PdpEnterParam pdpEnterParam, View view, String str, java.util.Map<String, ? extends Object> map) {
        super(str, null);
        this.LIZJ = pdpEnterParam;
        this.LIZLLL = view;
        this.LJ = map;
    }
}
