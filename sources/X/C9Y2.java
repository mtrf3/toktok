package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9Y2, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Y2 {
    public static final Keva LIZ;

    static {
        Keva repo = Keva.getRepo("qna_suggestion_searches_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
    }

    public static List LIZ() {
        String retrievedSearches = LIZ.getString("qna_suggestion_search_historical_searches", "");
        o.LJIIIIZZ(retrievedSearches, "retrievedSearches");
        if (retrievedSearches.length() == 0) {
            return null;
        }
        Object fromJson = GsonProtectorUtils.fromJson(new Gson(), retrievedSearches, (Class<Object>) String[].class);
        o.LJIIIIZZ(fromJson, "Gson().fromJson(retrieve…rray<String>::class.java)");
        return ORY.LJJZZIII((Object[]) fromJson);
    }
}
