package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Jcp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49567Jcp {
    public static final C49920JiW LIZ = new C49920JiW(new SearchResultParam());

    public static final String LIZ(SearchResultParam searchResultParam) {
        o.LJIIIZ(searchResultParam, "<this>");
        String keyword = searchResultParam.getKeyword();
        if (keyword == null) {
            return "";
        }
        return keyword;
    }
}
