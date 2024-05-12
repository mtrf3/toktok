package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C145425nG;
import X.C78920UyC;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CutVideoEditState implements InterfaceC61312at {
    public final Boolean editEnable;
    public final Boolean isEditVideoLength;
    public final C145425nG updatePlayBoundaryEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public CutVideoEditState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CutVideoEditState copy$default(CutVideoEditState cutVideoEditState, C145425nG c145425nG, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            c145425nG = cutVideoEditState.updatePlayBoundaryEvent;
        }
        if ((i & 2) != 0) {
            bool = cutVideoEditState.editEnable;
        }
        if ((i & 4) != 0) {
            bool2 = cutVideoEditState.isEditVideoLength;
        }
        return cutVideoEditState.copy(c145425nG, bool, bool2);
    }

    public final CutVideoEditState copy(C145425nG c145425nG, Boolean bool, Boolean bool2) {
        return new CutVideoEditState(c145425nG, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoEditState)) {
            return false;
        }
        CutVideoEditState cutVideoEditState = (CutVideoEditState) obj;
        return o.LJ(this.updatePlayBoundaryEvent, cutVideoEditState.updatePlayBoundaryEvent) && o.LJ(this.editEnable, cutVideoEditState.editEnable) && o.LJ(this.isEditVideoLength, cutVideoEditState.isEditVideoLength);
    }

    public int hashCode() {
        C145425nG c145425nG = this.updatePlayBoundaryEvent;
        int hashCode = (c145425nG == null ? 0 : c145425nG.hashCode()) * 31;
        Boolean bool = this.editEnable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isEditVideoLength;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutVideoEditState(updatePlayBoundaryEvent=");
        LIZ.append(this.updatePlayBoundaryEvent);
        LIZ.append(", editEnable=");
        LIZ.append(this.editEnable);
        LIZ.append(", isEditVideoLength=");
        return C78920UyC.LIZIZ(LIZ, this.isEditVideoLength, ')', LIZ);
    }

    public final Boolean getEditEnable() {
        return this.editEnable;
    }

    public final C145425nG getUpdatePlayBoundaryEvent() {
        return this.updatePlayBoundaryEvent;
    }

    public final Boolean isEditVideoLength() {
        return this.isEditVideoLength;
    }

    public CutVideoEditState(C145425nG c145425nG, Boolean bool, Boolean bool2) {
        this.updatePlayBoundaryEvent = c145425nG;
        this.editEnable = bool;
        this.isEditVideoLength = bool2;
    }

    public /* synthetic */ CutVideoEditState(C145425nG c145425nG, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c145425nG, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
    }
}
