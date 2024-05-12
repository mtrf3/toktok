package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import defpackage.u1;
import defpackage.w1;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K4Y {
    public static SearchSugResponse LIZ;
    public static boolean LIZJ;
    public static u1 LIZIZ = new u1();
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(DJ7.LJLIL);

    public static boolean LIZIZ() {
        long j = ((Keva) LIZLLL.getValue()).getLong("cache_time", -1L);
        if (j == -1) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        FFL.LJIIIZ().getClass();
        if (currentTimeMillis > FFL.LJIIJ(31744, 0, "search_sug_server_cache_expired_time", true) * 60 * 1000) {
            return true;
        }
        return false;
    }

    public static void LIZ(SearchSugResponse searchSugResponse) {
        Integer num;
        w1 putIfAbsent;
        if (searchSugResponse == null) {
            return;
        }
        LIZ = searchSugResponse;
        System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("insertTire count:");
        List<SearchSugEntity> list = searchSugResponse.sugList;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ2.append(num);
        X1D.LIZIZ(LIZ2);
        LIZIZ = new u1();
        int i = 0;
        for (SearchSugEntity sug : searchSugResponse.sugList) {
            u1 u1Var = LIZIZ;
            o.LJIIIIZZ(sug, "sug");
            int i2 = i + 1;
            u1Var.getClass();
            String str = sug.content;
            o.LJIIIIZZ(str, "entity.content");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            w1 w1Var = u1Var.LIZ;
            int length = lowerCase.length();
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = lowerCase.charAt(i3);
                ConcurrentSkipListMap<Character, w1> concurrentSkipListMap = w1Var.LIZ;
                Character valueOf = Character.valueOf(charAt);
                w1 w1Var2 = concurrentSkipListMap.get(valueOf);
                if (w1Var2 == null && (putIfAbsent = concurrentSkipListMap.putIfAbsent(valueOf, (w1Var2 = new w1()))) != null) {
                    w1Var2 = putIfAbsent;
                }
                w1Var = w1Var2;
            }
            w1Var.LIZIZ = true;
            w1Var.LIZJ = i;
            w1Var.LIZLLL = sug;
            i = i2;
        }
        LIZJ = true;
    }
}
