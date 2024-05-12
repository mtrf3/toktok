package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C145425nG;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CutVideoState implements InterfaceC61312at {
    public final C145425nG nextEvent;
    public final C145425nG quitEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public CutVideoState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CutVideoState copy$default(CutVideoState cutVideoState, C145425nG c145425nG, C145425nG c145425nG2, int i, Object obj) {
        if ((i & 1) != 0) {
            c145425nG = cutVideoState.quitEvent;
        }
        if ((i & 2) != 0) {
            c145425nG2 = cutVideoState.nextEvent;
        }
        return cutVideoState.copy(c145425nG, c145425nG2);
    }

    public final CutVideoState copy(C145425nG c145425nG, C145425nG c145425nG2) {
        return new CutVideoState(c145425nG, c145425nG2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoState)) {
            return false;
        }
        CutVideoState cutVideoState = (CutVideoState) obj;
        return o.LJ(this.quitEvent, cutVideoState.quitEvent) && o.LJ(this.nextEvent, cutVideoState.nextEvent);
    }

    public int hashCode() {
        C145425nG c145425nG = this.quitEvent;
        int hashCode = (c145425nG == null ? 0 : c145425nG.hashCode()) * 31;
        C145425nG c145425nG2 = this.nextEvent;
        return hashCode + (c145425nG2 != null ? c145425nG2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutVideoState(quitEvent=");
        LIZ.append(this.quitEvent);
        LIZ.append(", nextEvent=");
        LIZ.append(this.nextEvent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C145425nG getNextEvent() {
        return this.nextEvent;
    }

    public final C145425nG getQuitEvent() {
        return this.quitEvent;
    }

    public CutVideoState(C145425nG c145425nG, C145425nG c145425nG2) {
        this.quitEvent = c145425nG;
        this.nextEvent = c145425nG2;
    }

    public /* synthetic */ CutVideoState(C145425nG c145425nG, C145425nG c145425nG2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c145425nG, (i & 2) != 0 ? null : c145425nG2);
    }
}
