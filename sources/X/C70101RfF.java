package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RfF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70101RfF {
    public static final /* synthetic */ C70101RfF LIZ = new C70101RfF();
    public static final C70500Rlg LIZIZ = new C70500Rlg();

    public static int LIZ(HashMap hashMap) {
        Object obj = null;
        if (hashMap != null) {
            Object obj2 = hashMap.get("traffic_source");
            if (obj2 != null) {
                if (obj2 instanceof Integer) {
                    return ((Number) obj2).intValue();
                }
                if (obj2 instanceof Long) {
                    return (int) ((Number) obj2).longValue();
                }
                if (obj2 instanceof Short) {
                    return ((Number) obj2).shortValue();
                }
                if (obj2 instanceof String) {
                    try {
                        return CastIntegerProtector.parseInt((String) obj2);
                    } catch (Exception unused) {
                    }
                }
            }
            if (hashMap != null) {
                obj = hashMap.get("source_page_type");
            }
        }
        if (o.LJ(obj, "live")) {
            return 1;
        }
        if (o.LJ(obj, "video")) {
            return 2;
        }
        if (o.LJ(obj, "show_window")) {
            return 3;
        }
        if (o.LJ(obj, "order_detail")) {
            return 4;
        }
        if (o.LJ(obj, "mall") || o.LJ(obj, "flash_sale") || o.LJ(obj, "new_user_deal")) {
            return 6;
        }
        if (o.LJ(obj, "shop")) {
            return 7;
        }
        if (o.LJ(obj, "personal_favorite")) {
            return 5;
        }
        if (o.LJ(obj, "maybe_you_like")) {
            return 8;
        }
        return 0;
    }

    public static int LIZIZ(IPdpStarter.PdpEnterParam pdpEnterParam) {
        List list;
        Object LJLLLL;
        java.util.Map map;
        Object obj;
        long longValue;
        int shortValue;
        if (pdpEnterParam == null) {
            return 0;
        }
        if (pdpEnterParam.getProductEnterContext() != null) {
            Object obj2 = pdpEnterParam.getRequestParams().get("product_id");
            if ((obj2 instanceof List) && (list = (List) obj2) != null && (LJLLLL = ORZ.LJLLLL(list)) != null) {
                Object obj3 = pdpEnterParam.getProductEnterContext().get(LJLLLL);
                if (obj3 instanceof java.util.Map) {
                    map = (java.util.Map) obj3;
                } else {
                    map = null;
                }
                HashMap LJ = C27739Aud.LJ("source_info", map);
                if (LJ != null && (obj = LJ.get("source_channel")) != null) {
                    Class<?> cls = obj.getClass();
                    if (o.LJ(cls, Integer.class)) {
                        shortValue = ((Integer) obj).intValue();
                    } else if (o.LJ(cls, Short.class)) {
                        shortValue = ((Short) obj).shortValue();
                    } else {
                        if (o.LJ(cls, Long.class)) {
                            longValue = ((Long) obj).longValue();
                        } else if (o.LJ(cls, Integer.TYPE)) {
                            shortValue = ((Integer) obj).intValue();
                        } else if (o.LJ(cls, Short.TYPE)) {
                            shortValue = ((Short) obj).shortValue();
                        } else if (o.LJ(cls, Long.TYPE)) {
                            longValue = ((Long) obj).longValue();
                        }
                        shortValue = (int) longValue;
                    }
                    if (shortValue != 1) {
                        if (shortValue != 2) {
                            if (shortValue != 3) {
                                if (shortValue == 4) {
                                    return 6;
                                }
                            } else {
                                return 3;
                            }
                        } else {
                            return 2;
                        }
                    } else {
                        return 1;
                    }
                }
            }
        }
        return LIZ(pdpEnterParam.getTrackParams());
    }
}
