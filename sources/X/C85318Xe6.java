package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.experiment.PoiSearchConfig;
import com.ss.android.ugc.aweme.poi.search.PoiSearchCellV2;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xe6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85318Xe6 implements InterfaceC19530ph {
    public final /* synthetic */ PoiSearchCellV2 LIZ;

    public C85318Xe6(PoiSearchCellV2 poiSearchCellV2) {
        this.LIZ = poiSearchCellV2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19530ph
    public final void LIZ(View view, String itemID) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Object obj;
        String str6;
        Integer num;
        String str7;
        PoiData poiData;
        Object obj2;
        String creationId;
        Integer awemeType;
        C85317Xe5 c85317Xe5;
        C85317Xe5 c85317Xe52;
        String str8;
        PoiData poiData2;
        C85317Xe5 c85317Xe53;
        C85317Xe5 c85317Xe54;
        C85317Xe5 c85317Xe55;
        o.LJIIIZ(itemID, "itemID");
        C85316Xe4 item = this.LIZ.getItem();
        Long l = null;
        if (item != null && (c85317Xe55 = item.LJLJJI) != null) {
            str = c85317Xe55.LIZJ;
        } else {
            str = null;
        }
        if (o.LJ(str, ((C85192Xc4) this.LIZ.M().getState()).LJLIL)) {
            PoiSearchCellV2 poiSearchCellV2 = this.LIZ;
            poiSearchCellV2.getClass();
            HashMap hashMap = new HashMap();
            C85316Xe4 item2 = poiSearchCellV2.getItem();
            if (item2 != null && (c85317Xe54 = item2.LJLJJI) != null) {
                str2 = c85317Xe54.LIZJ;
            } else {
                str2 = null;
            }
            PoiMobParam poiMobParam = poiSearchCellV2.M().LJLLILLLL;
            if (poiMobParam != null) {
                str3 = poiMobParam.getEnterFrom();
            } else {
                str3 = null;
            }
            String str9 = "";
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("enter_from", str3);
            if (str2 == null || str2.length() == 0) {
                str4 = "default_search_poi";
            } else {
                str4 = "search_poi";
            }
            hashMap.put("enter_method", str4);
            if (str2 == null) {
                str5 = "";
            } else {
                str5 = str2;
            }
            hashMap.put("key_word", str5);
            String str10 = "1";
            hashMap.put("is_success", "1");
            C85316Xe4 item3 = poiSearchCellV2.getItem();
            if (item3 != null && (c85317Xe53 = item3.LJLJJI) != null) {
                i = c85317Xe53.LIZ;
            } else {
                i = 0;
            }
            hashMap.put("page_order", String.valueOf(i));
            if (LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION")) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("enable_location", obj);
            C85316Xe4 item4 = poiSearchCellV2.getItem();
            if (item4 == null || (poiData2 = item4.LJLIL) == null || (str6 = poiData2.getPoiId()) == null) {
                str6 = "";
            }
            hashMap.put("poi_id", str6);
            if (poiSearchCellV2.getItem() != null) {
                num = Integer.valueOf(poiSearchCellV2.L());
            } else {
                num = null;
            }
            hashMap.put("index", String.valueOf(num));
            C85316Xe4 item5 = poiSearchCellV2.getItem();
            if (item5 == null || (str7 = item5.LJLJI) == null) {
                str7 = "";
            }
            hashMap.put("log_id", str7);
            C85316Xe4 item6 = poiSearchCellV2.getItem();
            if (item6 != null) {
                poiData = item6.LJLIL;
            } else {
                poiData = null;
            }
            C225248si.LIZIZ(poiData, hashMap);
            C85316Xe4 item7 = poiSearchCellV2.getItem();
            if (item7 != null && (c85317Xe52 = item7.LJLJJI) != null && (str8 = c85317Xe52.LIZIZ) != null) {
                str9 = str8;
            }
            hashMap.put("search_id", str9);
            if (str2 != null && str2.length() != 0) {
                C85316Xe4 item8 = poiSearchCellV2.getItem();
                if (item8 != null && (c85317Xe5 = item8.LJLJJI) != null) {
                    l = Long.valueOf(c85317Xe5.LIZLLL);
                }
                hashMap.put("search_session_id", String.valueOf(l));
            }
            PoiMobParam poiMobParam2 = poiSearchCellV2.M().LJLLILLLL;
            if (poiMobParam2 != null && (awemeType = poiMobParam2.getAwemeType()) != null) {
                C0EM.LIZJ(awemeType, hashMap, "aweme_type");
            }
            PoiMobParam poiMobParam3 = poiSearchCellV2.M().LJLLILLLL;
            if (poiMobParam3 != null && (creationId = poiMobParam3.getCreationId()) != null) {
                hashMap.put("creation_id", creationId);
            }
            Integer num2 = PoiSearchConfig.LIZ().showCategoryStyle;
            if (num2 != null && num2.intValue() != 0 && poiSearchCellV2.LJLJLLL) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("poi_category_has_show", obj2);
            C85316Xe4 item9 = poiSearchCellV2.getItem();
            if (item9 == null || !o.LJ(item9.LJLJJL, Boolean.TRUE)) {
                str10 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_cache_search", str10);
            hashMap.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
            FMX.LJIIL("search_poi_show_al", hashMap);
        }
    }
}
