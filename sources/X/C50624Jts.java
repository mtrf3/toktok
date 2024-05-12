package X;

import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchBehaviorSignalState;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchSceneInfo;
import defpackage.s;
import kotlin.jvm.internal.o;

/* renamed from: X.Jts, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50624Jts extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchBehaviorSignalState, C50623Jtr, SearchBehaviorSignalState> {
    public static final C50624Jts LJLIL = new C50624Jts();

    public C50624Jts() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final SearchBehaviorSignalState invoke(SearchBehaviorSignalState searchBehaviorSignalState, C50623Jtr c50623Jtr) {
        SearchBehaviorSignalState lastState = searchBehaviorSignalState;
        C50623Jtr action = c50623Jtr;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        LastSearch lastSearch = action.LJLIL;
        String str = lastSearch.search_id;
        if (str != null) {
            s<SearchSceneInfo> sVar = lastState.searchSceneInfo;
            String str2 = lastSearch.query;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = lastSearch.channel;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = lastSearch.source;
            if (str5 != null) {
                str3 = str5;
            }
            sVar.add(new SearchSceneInfo(str, str2, str4, str3, lastSearch.time, null, 32, null));
        }
        return lastState;
    }
}
