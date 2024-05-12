package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.MapLocateData;
import java.util.HashMap;

/* renamed from: X.Alq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27194Alq {
    public static HashMap LIZ(MapLocateData mapLocateData) {
        HashMap hashMap = new HashMap();
        String str = mapLocateData.longitude;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        hashMap.put("longitude", str);
        String str3 = mapLocateData.latitude;
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("latitude", str3);
        Object obj = mapLocateData.shippingAddress;
        if (obj == null) {
            obj = "";
        }
        hashMap.put("shipping_address", obj);
        String str4 = mapLocateData.autoCompleteAddressId;
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("autocomplete_address_id", str4);
        String str5 = mapLocateData.sessionKey;
        if (str5 == null) {
            str5 = "";
        }
        hashMap.put("sessionKey", str5);
        Object obj2 = mapLocateData.trackParams;
        if (obj2 == null) {
            obj2 = "";
        }
        hashMap.put("trackParams", obj2);
        String str6 = mapLocateData.isRecommendDetailAddress;
        if (str6 == null) {
            str6 = "";
        }
        hashMap.put("is_recommend_detail_address", str6);
        String str7 = mapLocateData.pinMovable;
        if (str7 != null) {
            str2 = str7;
        }
        hashMap.put("pin_movable", str2);
        return hashMap;
    }
}
