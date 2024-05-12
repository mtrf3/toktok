package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.K9u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51258K9u {
    public static String LIZIZ;
    public static boolean LIZ = true;
    public static boolean LIZJ = true;
    public static final HashMap<String, String> LIZLLL = new HashMap<>();

    public static String LIZ(ECSearchEntranceData eCSearchEntranceData) {
        String str = LIZIZ;
        if (C78685UuP.LJJJZ(str) && str != null) {
            return str;
        }
        if (!EcomSearchServiceImpl.LJJJJZI().LJJJJJL(eCSearchEntranceData)) {
            return "";
        }
        String string = Keva.getRepo("ecommerce_search_repo").getString("ecommerce_suggest_words", "");
        o.LJIIIIZZ(string, "getRepo(ECommerceSearchC…_REPO).getString(key, \"\")");
        return string;
    }

    public static String LIZIZ(ECSearchEntranceData eCSearchEntranceData) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("before_search_cache_");
        LIZ2.append(eCSearchEntranceData.getRootEnterFromType());
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZJ(ECSearchEntranceData eCSearchEntranceData, boolean z) {
        String str = "";
        if (eCSearchEntranceData == null) {
            return "";
        }
        int i = C61852bl.LIZ[EcomSearchServiceImpl.LJJJJZI().LJJJJLL(eCSearchEntranceData).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                if (!z) {
                    String str2 = LIZLLL.get(LIZIZ(eCSearchEntranceData));
                    if (!C78685UuP.LJJJZ(str2)) {
                        str2 = null;
                    }
                    String str3 = str2;
                    if (str3 != null) {
                        return str3;
                    }
                    if (EcomSearchServiceImpl.LJJJJZI().LJJJJJL(eCSearchEntranceData)) {
                        str = Keva.getRepo("ecommerce_search_repo").getString(LIZIZ(eCSearchEntranceData), "");
                        o.LJIIIIZZ(str, "getRepo(ECommerceSearchC…_REPO).getString(key, \"\")");
                    }
                    return str;
                }
                return LIZ(eCSearchEntranceData);
            }
            if (!z) {
                return "";
            }
            return LIZ(eCSearchEntranceData);
        }
        return LIZ(eCSearchEntranceData);
    }

    public static void LIZLLL(String str, ECSearchEntranceData eCSearchEntranceData, boolean z) {
        if (eCSearchEntranceData == null) {
            return;
        }
        int i = C61852bl.LIZ[EcomSearchServiceImpl.LJJJJZI().LJJJJLL(eCSearchEntranceData).ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            if (!z) {
                LIZIZ = str;
                LIZLLL.put(LIZIZ(eCSearchEntranceData), str);
                if (!EcomSearchServiceImpl.LJJJJZI().LJJJJJL(eCSearchEntranceData)) {
                    return;
                }
                Keva.getRepo("ecommerce_search_repo").storeString(LIZIZ(eCSearchEntranceData), str);
                Keva.getRepo("ecommerce_search_repo").storeString("ecommerce_suggest_words", str);
                return;
            }
            LIZIZ = str;
            if (!EcomSearchServiceImpl.LJJJJZI().LJJJJJL(eCSearchEntranceData)) {
                return;
            }
            Keva.getRepo("ecommerce_search_repo").storeString("ecommerce_suggest_words", str);
            return;
        }
        LIZIZ = str;
        if (!EcomSearchServiceImpl.LJJJJZI().LJJJJJL(eCSearchEntranceData)) {
            return;
        }
        Keva.getRepo("ecommerce_search_repo").storeString("ecommerce_suggest_words", str);
    }
}
