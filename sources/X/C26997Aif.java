package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import java.util.List;

/* renamed from: X.Aif, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26997Aif {
    public static DeliveryPanelStarter.EnterParam LIZ(Intent intent) {
        int i;
        List list;
        List list2;
        Object LLJJIII;
        Object obj;
        String str;
        Object LLJJIII2;
        Object obj2;
        String str2;
        Integer num = null;
        if (intent == null) {
            return null;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "delivery_type");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "address_id");
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "product_id");
        String str3 = "";
        if (LLJJIJIIJIL3 == null) {
            LLJJIJIIJIL3 = "";
        }
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(intent, "sku_id");
        if (LLJJIJIIJIL4 != null) {
            str3 = LLJJIJIIJIL4;
        }
        String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(intent, "quantity");
        if (LLJJIJIIJIL5 != null) {
            i = CastIntegerProtector.parseInt(LLJJIJIIJIL5);
        } else {
            i = 1;
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null && (LLJJIII2 = C16880lQ.LLJJIII(LLJJIJI, "logistic_list")) != null) {
            if (!(LLJJIII2 instanceof List)) {
                obj2 = null;
            } else {
                obj2 = LLJJIII2;
            }
            list = (List) obj2;
            if (list == null) {
                if (LLJJIII2 instanceof String) {
                    str2 = (String) LLJJIII2;
                } else {
                    str2 = null;
                }
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str2, C65330PkU.LIZJ(C65352Pkq.LJ(List.class, C65340Pke.LIZ(C65352Pkq.LJI(LogisticDTO.class)))));
                    if (!(fromJson instanceof List)) {
                        fromJson = null;
                    }
                    list = (List) fromJson;
                } catch (s unused) {
                    list = null;
                }
            }
        } else {
            list = null;
        }
        Bundle LLJJIJI2 = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI2 != null && (LLJJIII = C16880lQ.LLJJIII(LLJJIJI2, "area")) != null) {
            if (!(LLJJIII instanceof List)) {
                obj = null;
            } else {
                obj = LLJJIII;
            }
            list2 = (List) obj;
            if (list2 == null) {
                if (LLJJIII instanceof String) {
                    str = (String) LLJJIII;
                } else {
                    str = null;
                }
                try {
                    Object fromJson2 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJ(List.class, C65340Pke.LIZ(C65352Pkq.LJI(Region.class)))));
                    if (!(fromJson2 instanceof List)) {
                        fromJson2 = null;
                    }
                    list2 = (List) fromJson2;
                } catch (s unused2) {
                    list2 = null;
                }
            }
        } else {
            list2 = null;
        }
        String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(intent, "track_params");
        String LLJJIJIIJIL7 = C16880lQ.LLJJIJIIJIL(intent, "price_val");
        String LLJJIJIIJIL8 = C16880lQ.LLJJIJIIJIL(intent, "currency");
        String LLJJIJIIJIL9 = C16880lQ.LLJJIJIIJIL(intent, "biz_type");
        if (LLJJIJIIJIL9 != null) {
            num = Integer.valueOf(CastIntegerProtector.parseInt(LLJJIJIIJIL9));
        }
        return new DeliveryPanelStarter.EnterParam(LLJJIJIIJIL, LLJJIJIIJIL2, list2, LLJJIJIIJIL3, str3, i, list, LLJJIJIIJIL6, LLJJIJIIJIL7, LLJJIJIIJIL8, num, C16880lQ.LLJJIJIIJIL(intent, "panel_title"));
    }
}
