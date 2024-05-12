package com.ss.android.ugc.aweme.shortvideo.duet;

import X.C145425nG;
import X.C45927I0t;
import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ChangeDuetLayoutState implements InterfaceC61312at {
    public final C45927I0t<Effect> effect;
    public final C145425nG exitDuetMode;
    public final C45927I0t<Integer> layoutDirection;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeDuetLayoutState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeDuetLayoutState copy$default(ChangeDuetLayoutState changeDuetLayoutState, C45927I0t c45927I0t, C45927I0t c45927I0t2, C145425nG c145425nG, int i, Object obj) {
        if ((i & 1) != 0) {
            c45927I0t = changeDuetLayoutState.effect;
        }
        if ((i & 2) != 0) {
            c45927I0t2 = changeDuetLayoutState.layoutDirection;
        }
        if ((i & 4) != 0) {
            c145425nG = changeDuetLayoutState.exitDuetMode;
        }
        return changeDuetLayoutState.copy(c45927I0t, c45927I0t2, c145425nG);
    }

    public final ChangeDuetLayoutState copy(C45927I0t<? extends Effect> c45927I0t, C45927I0t<Integer> c45927I0t2, C145425nG c145425nG) {
        return new ChangeDuetLayoutState(c45927I0t, c45927I0t2, c145425nG);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeDuetLayoutState)) {
            return false;
        }
        ChangeDuetLayoutState changeDuetLayoutState = (ChangeDuetLayoutState) obj;
        return o.LJ(this.effect, changeDuetLayoutState.effect) && o.LJ(this.layoutDirection, changeDuetLayoutState.layoutDirection) && o.LJ(this.exitDuetMode, changeDuetLayoutState.exitDuetMode);
    }

    public int hashCode() {
        C45927I0t<Effect> c45927I0t = this.effect;
        int hashCode = (c45927I0t == null ? 0 : c45927I0t.hashCode()) * 31;
        C45927I0t<Integer> c45927I0t2 = this.layoutDirection;
        int hashCode2 = (hashCode + (c45927I0t2 == null ? 0 : c45927I0t2.hashCode())) * 31;
        C145425nG c145425nG = this.exitDuetMode;
        return hashCode2 + (c145425nG != null ? c145425nG.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangeDuetLayoutState(effect=");
        LIZ.append(this.effect);
        LIZ.append(", layoutDirection=");
        LIZ.append(this.layoutDirection);
        LIZ.append(", exitDuetMode=");
        LIZ.append(this.exitDuetMode);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C45927I0t<Effect> getEffect() {
        return this.effect;
    }

    public final C145425nG getExitDuetMode() {
        return this.exitDuetMode;
    }

    public final C45927I0t<Integer> getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeDuetLayoutState(C45927I0t<? extends Effect> c45927I0t, C45927I0t<Integer> c45927I0t2, C145425nG c145425nG) {
        this.effect = c45927I0t;
        this.layoutDirection = c45927I0t2;
        this.exitDuetMode = c145425nG;
    }

    public /* synthetic */ ChangeDuetLayoutState(C45927I0t c45927I0t, C45927I0t c45927I0t2, C145425nG c145425nG, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c45927I0t, (i & 2) != 0 ? null : c45927I0t2, (i & 4) != 0 ? null : c145425nG);
    }
}
