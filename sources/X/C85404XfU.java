package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.XfU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85404XfU extends AbstractC85408XfY {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        Activity LIZLLL;
        long j;
        List<Aweme> list;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Context context;
        InterfaceC85407XfX interfaceC85407XfX = (InterfaceC85407XfX) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String poi = interfaceC85407XfX.getPoi();
        String poiName = interfaceC85407XfX.getPoiName();
        String enterFrom = interfaceC85407XfX.getEnterFrom();
        boolean showClaimStore = interfaceC85407XfX.getShowClaimStore();
        boolean isBaAccount = interfaceC85407XfX.isBaAccount();
        boolean showSuggestAnEdit = interfaceC85407XfX.getShowSuggestAnEdit();
        java.util.Map<String, Object> trackerParams = interfaceC85407XfX.getTrackerParams();
        java.util.Map<String, Object> shareInfo = interfaceC85407XfX.getShareInfo();
        Object obj10 = null;
        XBaseResultModel xBaseResultModel = (XBaseResultModel) ED5.LIZJ(InterfaceC85417Xfh.class, null);
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null && LocationServiceImpl.LJIJJ().LJIILLIIL(0, context)) {
            i = 1;
        } else {
            i = 0;
        }
        IPoiService LIZIZ = PoiServiceImpl.LIZIZ();
        InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
        if (interfaceC38263Ezz2 != null) {
            interfaceC38263Ezz2.getContext();
        }
        if (trackerParams == null || (obj = trackerParams.get("type_level")) == null) {
            obj = "";
        }
        java.util.Map LJIJI = LIZIZ.LJIJI(poi, (String) obj);
        if (LJIJI != null) {
            obj10 = LJIJI.get("poi_share_params_cache");
        }
        InterfaceC85416Xfg interfaceC85416Xfg = (InterfaceC85416Xfg) obj10;
        Bundle bundle = new Bundle();
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        ShareInfo shareInfo2 = (ShareInfo) GsonProtectorUtils.fromJson(LIZ, GsonProtectorUtils.toJson(LIZ, shareInfo), ShareInfo.class);
        if (trackerParams != null && trackerParams.get("poi_source") != null) {
            bundle.putString("poi_source", String.valueOf(trackerParams.get("poi_source")));
        }
        if (trackerParams == null || (obj2 = trackerParams.get("from_group_id")) == null) {
            obj2 = "";
        }
        bundle.putString("from_group_id", obj2.toString());
        if (LJIJI == null || (obj3 = LJIJI.get("poi_detail_type")) == null) {
            obj3 = "";
        }
        bundle.putString("poi_detail_type", obj3.toString());
        if (interfaceC85416Xfg == null || (str = interfaceC85416Xfg.LIZIZ()) == null) {
            str = "";
        }
        bundle.putString("is_claimed", str);
        InterfaceC38263Ezz interfaceC38263Ezz3 = this.LJLIL;
        if (interfaceC38263Ezz3 != null && (LIZLLL = interfaceC38263Ezz3.LIZLLL()) != null) {
            ShareService shareService = C4LD.LIZ;
            if (interfaceC85416Xfg != null) {
                j = interfaceC85416Xfg.LIZ();
            } else {
                j = 0;
            }
            if (interfaceC85416Xfg == null || (list = interfaceC85416Xfg.getAwemeList()) == null) {
                list = C61878OQg.INSTANCE;
            }
            if (trackerParams == null || (obj4 = trackerParams.get("city_code")) == null) {
                obj4 = "";
            }
            String obj11 = obj4.toString();
            if (trackerParams == null || (obj5 = trackerParams.get("region_code")) == null) {
                obj5 = "";
            }
            String obj12 = obj5.toString();
            if (trackerParams == null || (obj6 = trackerParams.get("poi_info_source")) == null) {
                obj6 = "";
            }
            String obj13 = obj6.toString();
            if (trackerParams == null || (obj7 = trackerParams.get("previous_page")) == null) {
                obj7 = "";
            }
            String obj14 = obj7.toString();
            JSONObject jSONObject = new JSONObject();
            if (trackerParams == null || (obj8 = trackerParams.get("city_code")) == null) {
                obj8 = "";
            }
            jSONObject.put("poi_city", obj8.toString());
            if (trackerParams == null || (obj9 = trackerParams.get("region_code")) == null) {
                obj9 = "";
            }
            jSONObject.put("poi_region_code", obj9.toString());
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
            shareService.LJJJIL(LIZLLL, new C193597il(enterFrom, poi, poiName, j, list, obj11, obj12, obj13, i, obj14, jSONObject2, bundle, Boolean.valueOf(showSuggestAnEdit), Boolean.valueOf(isBaAccount), Boolean.valueOf(showClaimStore), shareInfo2));
            c37356ElM.onSuccess(xBaseResultModel, "");
        }
    }
}
