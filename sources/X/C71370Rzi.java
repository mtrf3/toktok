package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Rzi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71370Rzi {
    public static boolean LIZ;
    public static int LJIIIZ;
    public static final java.util.Map<String, String> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<String, Integer> LIZJ = new LinkedHashMap();
    public static final java.util.Map<String, GetItemProductInfoResponseData> LIZLLL = new LinkedHashMap();
    public static final java.util.Map<String, C71379Rzr> LJ = new LinkedHashMap();
    public static final S0X LJFF = new S0X();
    public static final java.util.Map<String, Boolean> LJI = new LinkedHashMap();
    public static final java.util.Map<String, ProductListModel> LJII = new LinkedHashMap();
    public static final LruCache<String, Aweme> LJIIIIZZ = new LruCache<>(5);
    public static final java.util.Map<String, Object> LJIIJ = new LinkedHashMap();
    public static final java.util.Map<String, java.util.Map<String, Object>> LJIIJJI = new LinkedHashMap();

    public static void LIZ(Integer num) {
        if (num != null) {
            num.intValue();
            LJIIIZ = num.intValue();
        }
    }

    public static void LIZIZ(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Map<String, Boolean> map = LJI;
        if (map.size() > 2) {
            ((LinkedHashMap) map).clear();
        }
        map.put(str, Boolean.TRUE);
    }

    public static void LIZJ(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        LIZIZ.remove(str);
        LJIIJJI.remove(str);
    }

    public static int LJFF(String str) {
        Integer num;
        if (str == null || str.length() == 0 || (num = (Integer) ((LinkedHashMap) LIZJ).get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static java.util.Map LJI(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (java.util.Map) ((LinkedHashMap) LJIIJJI).get(str);
    }

    public static String LIZLLL(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return C00F.LIZIZ(str, '_', str2);
    }

    public static GetItemProductInfoResponseData LJ(String str, String str2) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (GetItemProductInfoResponseData) ((LinkedHashMap) LIZLLL).get(LIZLLL(str, str2));
    }

    public static RelatedProductInfo LJII(String str, String str2) {
        S0X s0x = LJFF;
        s0x.getClass();
        if (str == null) {
            return null;
        }
        return s0x.get(S0X.LIZ(str, str2));
    }

    public static void LJIIJJI(String str, java.util.Map map) {
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Map<String, java.util.Map<String, Object>> map2 = LJIIJJI;
        if (map2.size() > 30) {
            ((LinkedHashMap) map2).clear();
        }
        if (map != null) {
            java.util.Map map3 = (java.util.Map) ((LinkedHashMap) map2).get(str);
            if (map3 != null) {
                map3.putAll(map);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            map2.put(str, map);
        }
    }

    public static void LJIIIIZZ(Long l, String str, String str2) {
        if (str == null) {
            return;
        }
        S0X s0x = LJFF;
        s0x.getClass();
        if (l != null) {
            l.longValue();
            RelatedProductInfo relatedProductInfo = s0x.get(S0X.LIZ(str, str2));
            if (relatedProductInfo != null) {
                relatedProductInfo.clickProductIdList.add(l);
                return;
            }
            RelatedProductInfo relatedProductInfo2 = new RelatedProductInfo(str, str2, null, null, null, null, 60, null);
            relatedProductInfo2.clickProductIdList.add(l);
            s0x.put(S0X.LIZ(str, str2), relatedProductInfo2);
        }
    }

    public static void LJIIIZ(String str, String str2, List list) {
        if (((ArrayList) list).isEmpty()) {
            return;
        }
        S0X s0x = LJFF;
        s0x.getClass();
        RelatedProductInfo relatedProductInfo = s0x.get(S0X.LIZ(str, str2));
        if (relatedProductInfo != null) {
            relatedProductInfo.productIdList.clear();
            relatedProductInfo.productIdList.addAll(list);
        } else {
            RelatedProductInfo relatedProductInfo2 = new RelatedProductInfo(str, str2, null, null, null, null, 60, null);
            relatedProductInfo2.productIdList.addAll(list);
            s0x.put(S0X.LIZ(str, str2), relatedProductInfo2);
        }
    }

    public static void LJIIJ(String str, String str2, GetItemProductInfoResponseData getItemProductInfoResponseData) {
        List<ShopWindowExtraModel> list;
        if (str == null || getItemProductInfoResponseData == null || (list = getItemProductInfoResponseData.products) == null || list.isEmpty()) {
            return;
        }
        java.util.Map<String, GetItemProductInfoResponseData> map = LIZLLL;
        if (map.size() > 3) {
            ((LinkedHashMap) map).clear();
        }
        map.put(LIZLLL(str, str2), getItemProductInfoResponseData);
    }

    public static void LJIIL(Integer num, String str, String str2, java.util.Map map) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            java.util.Map<String, String> map2 = LIZIZ;
            if (map2.size() > 3) {
                ((LinkedHashMap) map2).clear();
            }
            if (str2 != null) {
                map2.put(str, str2);
            }
        }
        LJIIJJI(str, map);
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Map<String, Integer> map3 = LIZJ;
        if (map3.size() > 3) {
            ((LinkedHashMap) map3).clear();
        }
        if (num == null) {
            return;
        }
        map3.put(str, Integer.valueOf(num.intValue()));
    }
}
