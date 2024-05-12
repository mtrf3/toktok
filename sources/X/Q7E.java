package X;

import com.bytedance.ies.safemode.SmartProtected.state.BaseState;
import com.bytedance.ies.safemode.SmartProtected.state.StateParam;

/* loaded from: classes12.dex */
public final class Q7E extends BaseState {
    @Override // X.Q7F
    public final String getName() {
        return "StopState";
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJII(Q7F q7f) {
        PSY.LJFF("StopState", "onExitState: ");
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJI(Q7F q7f, StateParam stateParam) {
        if (stateParam instanceof StateParam) {
            this.stateParam = stateParam;
        }
        PSY.LJFF("StopState", "onEnterState: ");
    }
}
