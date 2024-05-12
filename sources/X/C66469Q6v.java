package X;

import com.bytedance.ies.safemode.SmartProtected.state.BaseState;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.ies.safemode.SmartProtected.state.SmartProtectedStateMachine;
import com.bytedance.ies.safemode.SmartProtected.state.StateParam;

/* renamed from: X.Q6v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66469Q6v extends BaseState {
    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJII(Q7F q7f) {
    }

    @Override // X.Q7F
    public final String getName() {
        return "InitState";
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJI(Q7F q7f, StateParam stateParam) {
        C66460Q6m.LIZIZ().getClass();
        ExceptionManager.LIZJ(this.LIZ.LJ).LJFF();
        if (q7f == null || q7f.getClass() == C66469Q6v.class) {
            SmartProtectedStateMachine smartProtectedStateMachine = this.LIZ;
            smartProtectedStateMachine.LJIIIZ(smartProtectedStateMachine.mCheckingState, new StateParam());
        } else {
            this.LIZ.LJIIIZ(q7f, q7f.getParam());
        }
    }
}
