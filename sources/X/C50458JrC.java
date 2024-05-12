package X;

import com.ss.android.ugc.aweme.search.source.neo.model.SearchResult;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JrC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50458JrC extends AbstractC65781Prl implements InterfaceC88472Yns<SearchResult, Boolean> {
    public static final C50458JrC LJLIL = new C50458JrC();

    public C50458JrC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(SearchResult searchResult) {
        boolean z;
        SearchResult it = searchResult;
        o.LJIIIZ(it, "it");
        List<String> list = it.gidList;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
