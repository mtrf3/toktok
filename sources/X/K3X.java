package X;

import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.search.source.neo.model.CreationSearchSignalState;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K3X extends AbstractC65781Prl implements InterfaceC88471Ynr<CreationSearchSignalState, K3W, CreationSearchSignalState> {
    public static final K3X LJLIL = new K3X();

    public K3X() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final CreationSearchSignalState invoke(CreationSearchSignalState creationSearchSignalState, K3W k3w) {
        CreationSearchSignalState lastState = creationSearchSignalState;
        K3W action = k3w;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        LinkedList<LastSearch> linkedList = action.LJLIL;
        o.LJIIIZ(linkedList, "<set-?>");
        lastState.queryList = linkedList;
        return lastState;
    }
}
