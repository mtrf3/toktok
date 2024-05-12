package X;

import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.search.source.neo.model.CreationSearchSignalState;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchSceneInfo;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchSessionData;
import defpackage.s;
import kotlin.jvm.internal.o;

/* renamed from: X.Jtu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50626Jtu extends AbstractC65781Prl implements InterfaceC88471Ynr<CreationSearchSignalState, C50627Jtv, CreationSearchSignalState> {
    public static final C50626Jtu LJLIL = new C50626Jtu();

    public C50626Jtu() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final CreationSearchSignalState invoke(CreationSearchSignalState creationSearchSignalState, C50627Jtv c50627Jtv) {
        SearchSessionData searchSessionData;
        s<SearchSceneInfo> sVar;
        CreationSearchSignalState lastState = creationSearchSignalState;
        C50627Jtv action = c50627Jtv;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        if (action.LJLIL.search_id != null && (searchSessionData = (SearchSessionData) ORZ.LLFII(lastState.searchEffectSceneInfo)) != null && (sVar = searchSessionData.searchIdInfo) != null) {
            LastSearch lastSearch = action.LJLIL;
            String str = lastSearch.search_id;
            String str2 = lastSearch.query;
            if (str2 == null) {
                str2 = "";
            }
            sVar.add(new SearchSceneInfo(str, str2, lastSearch.channel, lastSearch.source, lastSearch.time, null, 32, null));
        }
        return lastState;
    }
}
