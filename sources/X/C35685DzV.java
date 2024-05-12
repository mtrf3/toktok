package X;

import java.util.List;

/* renamed from: X.DzV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35685DzV {
    public static Boolean LIZ(java.util.Map map) {
        boolean z;
        Object obj = map.get("customer_type");
        if (obj != null) {
            if (obj == EnumC62072c7.CUSTOMER_TYPE_NEW_CUSTOMER) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    public static List LIZIZ(java.util.Map map) {
        try {
            Object obj = map.get("promotion_url_list");
            if (obj instanceof List) {
                return (List) obj;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static List LIZJ(java.util.Map map) {
        try {
            Object obj = map.get("recommend_url_list");
            if (obj instanceof List) {
                return (List) obj;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
