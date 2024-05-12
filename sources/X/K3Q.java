package X;

import com.ss.android.ugc.aweme.search.source.neo.model.CreationSearchSignalState;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchSessionData;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K3Q extends AbstractC65781Prl implements InterfaceC88471Ynr<CreationSearchSignalState, K3P, CreationSearchSignalState> {
    public static final K3Q LJLIL = new K3Q();

    public K3Q() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final CreationSearchSignalState invoke(CreationSearchSignalState creationSearchSignalState, K3P k3p) {
        CreationSearchSignalState lastState = creationSearchSignalState;
        K3P action = k3p;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        if (action.LJLIL.length() > 0 && 1 != 0) {
            lastState.searchEffectSceneInfo.add(new SearchSessionData(action.LJLIL, null, 2, null));
        }
        return lastState;
    }
}
