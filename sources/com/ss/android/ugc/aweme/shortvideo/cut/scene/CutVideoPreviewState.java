package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C145425nG;
import X.C150575vZ;
import X.C1539362j;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CutVideoPreviewState implements InterfaceC61312at {
    public final C150575vZ<Integer, Integer> resetSurfaceSizeEvent;
    public final C145425nG restartProgress;
    public final Boolean surfaceEnable;
    public final C1539362j updateBottomMarginEvent;
    public final C145425nG updateVEDisplayEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public CutVideoPreviewState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CutVideoPreviewState copy$default(CutVideoPreviewState cutVideoPreviewState, C145425nG c145425nG, Boolean bool, C150575vZ c150575vZ, C1539362j c1539362j, C145425nG c145425nG2, int i, Object obj) {
        if ((i & 1) != 0) {
            c145425nG = cutVideoPreviewState.restartProgress;
        }
        if ((i & 2) != 0) {
            bool = cutVideoPreviewState.surfaceEnable;
        }
        if ((i & 4) != 0) {
            c150575vZ = cutVideoPreviewState.resetSurfaceSizeEvent;
        }
        if ((i & 8) != 0) {
            c1539362j = cutVideoPreviewState.updateBottomMarginEvent;
        }
        if ((i & 16) != 0) {
            c145425nG2 = cutVideoPreviewState.updateVEDisplayEvent;
        }
        return cutVideoPreviewState.copy(c145425nG, bool, c150575vZ, c1539362j, c145425nG2);
    }

    public final CutVideoPreviewState copy(C145425nG c145425nG, Boolean bool, C150575vZ<Integer, Integer> c150575vZ, C1539362j c1539362j, C145425nG c145425nG2) {
        return new CutVideoPreviewState(c145425nG, bool, c150575vZ, c1539362j, c145425nG2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoPreviewState)) {
            return false;
        }
        CutVideoPreviewState cutVideoPreviewState = (CutVideoPreviewState) obj;
        return o.LJ(this.restartProgress, cutVideoPreviewState.restartProgress) && o.LJ(this.surfaceEnable, cutVideoPreviewState.surfaceEnable) && o.LJ(this.resetSurfaceSizeEvent, cutVideoPreviewState.resetSurfaceSizeEvent) && o.LJ(this.updateBottomMarginEvent, cutVideoPreviewState.updateBottomMarginEvent) && o.LJ(this.updateVEDisplayEvent, cutVideoPreviewState.updateVEDisplayEvent);
    }

    public int hashCode() {
        C145425nG c145425nG = this.restartProgress;
        int hashCode = (c145425nG == null ? 0 : c145425nG.hashCode()) * 31;
        Boolean bool = this.surfaceEnable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        C150575vZ<Integer, Integer> c150575vZ = this.resetSurfaceSizeEvent;
        int hashCode3 = (hashCode2 + (c150575vZ == null ? 0 : c150575vZ.hashCode())) * 31;
        C1539362j c1539362j = this.updateBottomMarginEvent;
        int hashCode4 = (hashCode3 + (c1539362j == null ? 0 : c1539362j.hashCode())) * 31;
        C145425nG c145425nG2 = this.updateVEDisplayEvent;
        return hashCode4 + (c145425nG2 != null ? c145425nG2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutVideoPreviewState(restartProgress=");
        LIZ.append(this.restartProgress);
        LIZ.append(", surfaceEnable=");
        LIZ.append(this.surfaceEnable);
        LIZ.append(", resetSurfaceSizeEvent=");
        LIZ.append(this.resetSurfaceSizeEvent);
        LIZ.append(", updateBottomMarginEvent=");
        LIZ.append(this.updateBottomMarginEvent);
        LIZ.append(", updateVEDisplayEvent=");
        LIZ.append(this.updateVEDisplayEvent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C150575vZ<Integer, Integer> getResetSurfaceSizeEvent() {
        return this.resetSurfaceSizeEvent;
    }

    public final C145425nG getRestartProgress() {
        return this.restartProgress;
    }

    public final Boolean getSurfaceEnable() {
        return this.surfaceEnable;
    }

    public final C1539362j getUpdateBottomMarginEvent() {
        return this.updateBottomMarginEvent;
    }

    public final C145425nG getUpdateVEDisplayEvent() {
        return this.updateVEDisplayEvent;
    }

    public CutVideoPreviewState(C145425nG c145425nG, Boolean bool, C150575vZ<Integer, Integer> c150575vZ, C1539362j c1539362j, C145425nG c145425nG2) {
        this.restartProgress = c145425nG;
        this.surfaceEnable = bool;
        this.resetSurfaceSizeEvent = c150575vZ;
        this.updateBottomMarginEvent = c1539362j;
        this.updateVEDisplayEvent = c145425nG2;
    }

    public /* synthetic */ CutVideoPreviewState(C145425nG c145425nG, Boolean bool, C150575vZ c150575vZ, C1539362j c1539362j, C145425nG c145425nG2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c145425nG, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : c150575vZ, (i & 8) != 0 ? null : c1539362j, (i & 16) == 0 ? c145425nG2 : null);
    }
}
