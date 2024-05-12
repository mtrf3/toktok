package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C78920UyC;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CutVideoSpeedState implements InterfaceC61312at {
    public final Boolean enable;
    public final Boolean visible;

    /* JADX WARN: Multi-variable type inference failed */
    public CutVideoSpeedState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CutVideoSpeedState copy$default(CutVideoSpeedState cutVideoSpeedState, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = cutVideoSpeedState.enable;
        }
        if ((i & 2) != 0) {
            bool2 = cutVideoSpeedState.visible;
        }
        return cutVideoSpeedState.copy(bool, bool2);
    }

    public final CutVideoSpeedState copy(Boolean bool, Boolean bool2) {
        return new CutVideoSpeedState(bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoSpeedState)) {
            return false;
        }
        CutVideoSpeedState cutVideoSpeedState = (CutVideoSpeedState) obj;
        return o.LJ(this.enable, cutVideoSpeedState.enable) && o.LJ(this.visible, cutVideoSpeedState.visible);
    }

    public int hashCode() {
        Boolean bool = this.enable;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.visible;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutVideoSpeedState(enable=");
        LIZ.append(this.enable);
        LIZ.append(", visible=");
        return C78920UyC.LIZIZ(LIZ, this.visible, ')', LIZ);
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public CutVideoSpeedState(Boolean bool, Boolean bool2) {
        this.enable = bool;
        this.visible = bool2;
    }

    public /* synthetic */ CutVideoSpeedState(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
