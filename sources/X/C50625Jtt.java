package X;

import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.search.source.neo.model.CreationSearchSignalState;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchSceneInfo;
import defpackage.s;
import kotlin.jvm.internal.o;

/* renamed from: X.Jtt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50625Jtt extends AbstractC65781Prl implements InterfaceC88471Ynr<CreationSearchSignalState, C50628Jtw, CreationSearchSignalState> {
    public static final C50625Jtt LJLIL = new C50625Jtt();

    public C50625Jtt() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final CreationSearchSignalState invoke(CreationSearchSignalState creationSearchSignalState, C50628Jtw c50628Jtw) {
        CreationSearchSignalState lastState = creationSearchSignalState;
        C50628Jtw action = c50628Jtw;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        LastSearch lastSearch = action.LJLIL;
        String str = lastSearch.search_id;
        if (str != null) {
            s<SearchSceneInfo> sVar = lastState.searchMusicSceneInfo;
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
