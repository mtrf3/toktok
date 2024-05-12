package X;

import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchResult;
import defpackage.s;
import kotlin.jvm.internal.o;

/* renamed from: X.JrF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50461JrF extends AbstractC65781Prl implements InterfaceC88471Ynr<C50449Jr3, C50462JrG, C50449Jr3> {
    public static final C50461JrF LJLIL = new C50461JrF();

    public C50461JrF() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50449Jr3 invoke(C50449Jr3 c50449Jr3, C50462JrG c50462JrG) {
        C50449Jr3 lastState = c50449Jr3;
        C50462JrG action = c50462JrG;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        s<SearchResult> sVar = lastState.LJLIL;
        sVar.removeIfCompat(C50460JrE.LJLIL);
        LastSearch lastSearch = action.LJLIL;
        String str = lastSearch.query;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = lastSearch.source;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = lastSearch.search_id;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = lastSearch.channel;
        if (str5 != null) {
            str2 = str5;
        }
        sVar.add(new SearchResult(str, str3, str2, str4, null, 16, null));
        return lastState;
    }
}
