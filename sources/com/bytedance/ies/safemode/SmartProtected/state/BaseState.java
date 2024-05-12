package com.bytedance.ies.safemode.SmartProtected.state;

import X.InterfaceC65349Pkn;
import X.O1A;
import X.Q7F;

/* loaded from: classes12.dex */
public abstract class BaseState implements Q7F {
    public SmartProtectedStateMachine LIZ;

    @O1A
    @InterfaceC65349Pkn("stateParam")
    public StateParam stateParam;

    @Override // X.Q7F
    public void LIZ(long j, String str, String str2) {
    }

    public void LJFF() {
    }

    public void LJI(Q7F q7f, StateParam stateParam) {
    }

    public void LJII(Q7F q7f) {
    }

    public final ExceptionManager LJ() {
        return ExceptionManager.LIZJ(this.LIZ.LJ);
    }

    @Override // X.Q7F
    public final StateParam getParam() {
        return this.stateParam;
    }

    @Override // X.Q7F
    public final void LIZIZ(SmartProtectedStateMachine smartProtectedStateMachine) {
        this.LIZ = smartProtectedStateMachine;
        LJFF();
    }

    @Override // X.Q7F
    public void LIZJ(Q7F q7f) {
        LJII(q7f);
    }

    @Override // X.Q7F
    public final void LIZLLL(Q7F q7f, StateParam stateParam) {
        this.stateParam = stateParam;
        LJI(q7f, stateParam);
    }

    public final synchronized void LJIIIIZZ(Q7F q7f, StateParam stateParam) {
        if (q7f == null) {
            return;
        }
        if (this.LIZ.LIZ() == this) {
            this.LIZ.LJIIIZ(q7f, stateParam);
        }
    }
}
