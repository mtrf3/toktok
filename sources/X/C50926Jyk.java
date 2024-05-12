package X;

import com.ss.android.ugc.aweme.search.cointask.core.config.SearchCoinTaskConfigData;
import java.util.List;

@FI7("search_coin_task_config")
/* renamed from: X.Jyk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50926Jyk {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("b2878", "b4180", "b3136");

    public static SearchCoinTaskConfigData LIZIZ() {
        try {
            FHD.LIZLLL().getClass();
            return (SearchCoinTaskConfigData) FHD.LJIIJJI(SearchCoinTaskConfigData.class, null, "search_coin_task_config", true);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int LIZ() {
        Integer num;
        SearchCoinTaskConfigData LIZIZ = LIZIZ();
        if (LIZIZ != null && (num = LIZIZ.taskCountdownTime) != null) {
            return num.intValue();
        }
        return 15;
    }
}
