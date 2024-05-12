package X;

import Y.ACallableS32S1200000_1;
import Y.ACallableS7S2100000_1;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JdP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49603JdP implements InterfaceC178386zK {
    public static final C49603JdP LIZ = new C49603JdP();
    public static final java.util.Map<Integer, Integer> LIZIZ = new LinkedHashMap();

    public static String LJFF(Fragment fragment) {
        Integer valueOf;
        if (!(fragment instanceof SearchJediMixFeedFragment) || (valueOf = Integer.valueOf(fragment.hashCode())) == null) {
            return null;
        }
        valueOf.intValue();
        Integer num = (Integer) ((LinkedHashMap) LIZIZ).get(valueOf);
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static void LJI(Fragment fragment) {
        if (!(fragment instanceof SearchJediMixFeedFragment)) {
            return;
        }
        int hashCode = fragment.hashCode();
        java.util.Map<Integer, Integer> map = LIZIZ;
        Integer valueOf = Integer.valueOf(hashCode);
        Integer num = (Integer) ((LinkedHashMap) map).get(Integer.valueOf(hashCode));
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(valueOf, Integer.valueOf(i));
    }

    @Override // X.InterfaceC178386zK
    public final java.util.Map<String, String> LIZIZ(Aweme aweme) {
        HashMap<String, String> mobParams;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
            HashMap hashMap = new HashMap();
            String str = mobParams.get("inner_search_id");
            if (str != null) {
                hashMap.put("inner_search_id", str);
            }
            String str2 = mobParams.get("is_inner");
            if (str2 != null) {
                hashMap.put("is_inner", str2);
            }
            String str3 = mobParams.get("rank_inner");
            if (str3 != null) {
                hashMap.put("rank_inner", str3);
            }
            String str4 = mobParams.get("rank");
            if (str4 != null) {
                hashMap.put("rank", str4);
            }
            String str5 = mobParams.get("click_times");
            if (str5 != null) {
                hashMap.put("click_times", str5);
            }
            String str6 = mobParams.get("is_slide");
            if (str6 != null) {
                hashMap.put("is_slide", str6);
            }
            String str7 = mobParams.get("slide_rank");
            if (str7 != null) {
                hashMap.put("slide_rank", str7);
                return hashMap;
            }
            return hashMap;
        }
        return C113554cx.LJJJLIIL();
    }

    @Override // X.InterfaceC178386zK
    public final void LIZ(C188727au c188727au, Aweme aweme) {
        if (aweme != null) {
            AqS190S0100000_8 aqS190S0100000_8 = new AqS190S0100000_8(c188727au, 61);
            HashMap<String, String> mobParams = aweme.getMobParams();
            if (mobParams != null) {
                String str = mobParams.get("inner_search_id");
                if (str != null) {
                    aqS190S0100000_8.invoke("inner_search_id", str);
                }
                String str2 = mobParams.get("is_inner");
                if (str2 != null) {
                    aqS190S0100000_8.invoke("is_inner", str2);
                }
                String str3 = mobParams.get("rank_inner");
                if (str3 != null) {
                    aqS190S0100000_8.invoke("rank_inner", str3);
                }
                String str4 = mobParams.get("rank");
                if (str4 != null) {
                    aqS190S0100000_8.invoke("rank", str4);
                }
            }
        }
    }

    public static void LIZJ(Integer num, String str, List list) {
        if (list == null || str == null || str.length() == 0) {
            return;
        }
        C10K.LIZIZ(new ACallableS32S1200000_1(list, num, str, 1), C38995FSd.LIZIZ(), null);
    }

    public static void LIZLLL(String str, String str2, List list) {
        if (list == null || str == null || str.length() == 0) {
            return;
        }
        C10K.LIZIZ(new ACallableS7S2100000_1(list, str, str2, 3), C38995FSd.LIZIZ(), null);
    }

    public static void LJ(int i, int i2, Aweme aweme, String str) {
        if (aweme != null) {
            aweme.appendMobParam("click_times", str);
            aweme.appendMobParam("is_slide", String.valueOf(i));
            aweme.appendMobParam("slide_rank", String.valueOf(i2));
        }
    }

    public static void LJII(Aweme aweme, String innerSearchId, int i, int i2) {
        o.LJIIIZ(innerSearchId, "innerSearchId");
        if (aweme != null) {
            aweme.appendMobParam("inner_search_id", innerSearchId);
            aweme.appendMobParam("is_inner", "1");
            aweme.appendMobParam("rank_inner", String.valueOf(i));
            aweme.appendMobParam("rank", String.valueOf(i2));
        }
    }
}
