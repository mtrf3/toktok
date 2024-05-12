package X;

import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchBehaviorSignalState;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K3V extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchBehaviorSignalState, K3W, SearchBehaviorSignalState> {
    public static final K3V LJLIL = new K3V();

    public K3V() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final SearchBehaviorSignalState invoke(SearchBehaviorSignalState searchBehaviorSignalState, K3W k3w) {
        SearchBehaviorSignalState lastState = searchBehaviorSignalState;
        K3W action = k3w;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        LinkedList<LastSearch> linkedList = action.LJLIL;
        o.LJIIIZ(linkedList, "<set-?>");
        lastState.queryList = linkedList;
        return lastState;
    }
}
