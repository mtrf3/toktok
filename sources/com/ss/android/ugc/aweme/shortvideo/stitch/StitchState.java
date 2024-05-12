package com.ss.android.ugc.aweme.shortvideo.stitch;

import X.C145425nG;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StitchState implements InterfaceC61312at {
    public final C145425nG hideIntroduceEvent;
    public final C145425nG quitEvent;
    public final C145425nG showIntroduceEvent;
    public final C145425nG showTrimmingNextGuideEvent;
    public final C145425nG showTrimmingViewGuideEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public StitchState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StitchState copy$default(StitchState stitchState, C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, C145425nG c145425nG4, C145425nG c145425nG5, int i, Object obj) {
        if ((i & 1) != 0) {
            c145425nG = stitchState.showIntroduceEvent;
        }
        if ((i & 2) != 0) {
            c145425nG2 = stitchState.hideIntroduceEvent;
        }
        if ((i & 4) != 0) {
            c145425nG3 = stitchState.showTrimmingViewGuideEvent;
        }
        if ((i & 8) != 0) {
            c145425nG4 = stitchState.showTrimmingNextGuideEvent;
        }
        if ((i & 16) != 0) {
            c145425nG5 = stitchState.quitEvent;
        }
        return stitchState.copy(c145425nG, c145425nG2, c145425nG3, c145425nG4, c145425nG5);
    }

    public final StitchState copy(C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, C145425nG c145425nG4, C145425nG c145425nG5) {
        return new StitchState(c145425nG, c145425nG2, c145425nG3, c145425nG4, c145425nG5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchState)) {
            return false;
        }
        StitchState stitchState = (StitchState) obj;
        return o.LJ(this.showIntroduceEvent, stitchState.showIntroduceEvent) && o.LJ(this.hideIntroduceEvent, stitchState.hideIntroduceEvent) && o.LJ(this.showTrimmingViewGuideEvent, stitchState.showTrimmingViewGuideEvent) && o.LJ(this.showTrimmingNextGuideEvent, stitchState.showTrimmingNextGuideEvent) && o.LJ(this.quitEvent, stitchState.quitEvent);
    }

    public int hashCode() {
        C145425nG c145425nG = this.showIntroduceEvent;
        int hashCode = (c145425nG == null ? 0 : c145425nG.hashCode()) * 31;
        C145425nG c145425nG2 = this.hideIntroduceEvent;
        int hashCode2 = (hashCode + (c145425nG2 == null ? 0 : c145425nG2.hashCode())) * 31;
        C145425nG c145425nG3 = this.showTrimmingViewGuideEvent;
        int hashCode3 = (hashCode2 + (c145425nG3 == null ? 0 : c145425nG3.hashCode())) * 31;
        C145425nG c145425nG4 = this.showTrimmingNextGuideEvent;
        int hashCode4 = (hashCode3 + (c145425nG4 == null ? 0 : c145425nG4.hashCode())) * 31;
        C145425nG c145425nG5 = this.quitEvent;
        return hashCode4 + (c145425nG5 != null ? c145425nG5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StitchState(showIntroduceEvent=");
        LIZ.append(this.showIntroduceEvent);
        LIZ.append(", hideIntroduceEvent=");
        LIZ.append(this.hideIntroduceEvent);
        LIZ.append(", showTrimmingViewGuideEvent=");
        LIZ.append(this.showTrimmingViewGuideEvent);
        LIZ.append(", showTrimmingNextGuideEvent=");
        LIZ.append(this.showTrimmingNextGuideEvent);
        LIZ.append(", quitEvent=");
        LIZ.append(this.quitEvent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C145425nG getHideIntroduceEvent() {
        return this.hideIntroduceEvent;
    }

    public final C145425nG getQuitEvent() {
        return this.quitEvent;
    }

    public final C145425nG getShowIntroduceEvent() {
        return this.showIntroduceEvent;
    }

    public final C145425nG getShowTrimmingNextGuideEvent() {
        return this.showTrimmingNextGuideEvent;
    }

    public final C145425nG getShowTrimmingViewGuideEvent() {
        return this.showTrimmingViewGuideEvent;
    }

    public StitchState(C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, C145425nG c145425nG4, C145425nG c145425nG5) {
        this.showIntroduceEvent = c145425nG;
        this.hideIntroduceEvent = c145425nG2;
        this.showTrimmingViewGuideEvent = c145425nG3;
        this.showTrimmingNextGuideEvent = c145425nG4;
        this.quitEvent = c145425nG5;
    }

    public /* synthetic */ StitchState(C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, C145425nG c145425nG4, C145425nG c145425nG5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c145425nG, (i & 2) != 0 ? null : c145425nG2, (i & 4) != 0 ? null : c145425nG3, (i & 8) != 0 ? null : c145425nG4, (i & 16) == 0 ? c145425nG5 : null);
    }
}
