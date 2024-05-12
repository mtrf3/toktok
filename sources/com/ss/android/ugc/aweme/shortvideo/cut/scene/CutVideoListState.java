package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C145425nG;
import X.C150545vW;
import X.C78920UyC;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CutVideoListState implements InterfaceC61312at {
    public final Boolean cancelEnable;
    public final C145425nG deleteSegEvent;
    public final Boolean saveEnable;
    public final C150545vW updateSpeedCheckEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public CutVideoListState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CutVideoListState copy$default(CutVideoListState cutVideoListState, C145425nG c145425nG, C150545vW c150545vW, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            c145425nG = cutVideoListState.deleteSegEvent;
        }
        if ((i & 2) != 0) {
            c150545vW = cutVideoListState.updateSpeedCheckEvent;
        }
        if ((i & 4) != 0) {
            bool = cutVideoListState.saveEnable;
        }
        if ((i & 8) != 0) {
            bool2 = cutVideoListState.cancelEnable;
        }
        return cutVideoListState.copy(c145425nG, c150545vW, bool, bool2);
    }

    public final CutVideoListState copy(C145425nG c145425nG, C150545vW c150545vW, Boolean bool, Boolean bool2) {
        return new CutVideoListState(c145425nG, c150545vW, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoListState)) {
            return false;
        }
        CutVideoListState cutVideoListState = (CutVideoListState) obj;
        return o.LJ(this.deleteSegEvent, cutVideoListState.deleteSegEvent) && o.LJ(this.updateSpeedCheckEvent, cutVideoListState.updateSpeedCheckEvent) && o.LJ(this.saveEnable, cutVideoListState.saveEnable) && o.LJ(this.cancelEnable, cutVideoListState.cancelEnable);
    }

    public int hashCode() {
        C145425nG c145425nG = this.deleteSegEvent;
        int hashCode = (c145425nG == null ? 0 : c145425nG.hashCode()) * 31;
        C150545vW c150545vW = this.updateSpeedCheckEvent;
        int hashCode2 = (hashCode + (c150545vW == null ? 0 : c150545vW.hashCode())) * 31;
        Boolean bool = this.saveEnable;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.cancelEnable;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutVideoListState(deleteSegEvent=");
        LIZ.append(this.deleteSegEvent);
        LIZ.append(", updateSpeedCheckEvent=");
        LIZ.append(this.updateSpeedCheckEvent);
        LIZ.append(", saveEnable=");
        LIZ.append(this.saveEnable);
        LIZ.append(", cancelEnable=");
        return C78920UyC.LIZIZ(LIZ, this.cancelEnable, ')', LIZ);
    }

    public final Boolean getCancelEnable() {
        return this.cancelEnable;
    }

    public final C145425nG getDeleteSegEvent() {
        return this.deleteSegEvent;
    }

    public final Boolean getSaveEnable() {
        return this.saveEnable;
    }

    public final C150545vW getUpdateSpeedCheckEvent() {
        return this.updateSpeedCheckEvent;
    }

    public CutVideoListState(C145425nG c145425nG, C150545vW c150545vW, Boolean bool, Boolean bool2) {
        this.deleteSegEvent = c145425nG;
        this.updateSpeedCheckEvent = c150545vW;
        this.saveEnable = bool;
        this.cancelEnable = bool2;
    }

    public /* synthetic */ CutVideoListState(C145425nG c145425nG, C150545vW c150545vW, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c145425nG, (i & 2) != 0 ? null : c150545vW, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2);
    }
}
