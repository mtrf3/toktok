package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DebugToolState implements Serializable {

    @InterfaceC65349Pkn("can_debug_tool")
    public Boolean canDebugTool;

    /* JADX WARN: Multi-variable type inference failed */
    public DebugToolState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DebugToolState copy$default(DebugToolState debugToolState, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = debugToolState.canDebugTool;
        }
        return debugToolState.copy(bool);
    }

    public final DebugToolState copy(Boolean bool) {
        return new DebugToolState(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DebugToolState) && o.LJ(this.canDebugTool, ((DebugToolState) obj).canDebugTool);
    }

    public int hashCode() {
        Boolean bool = this.canDebugTool;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DebugToolState(canDebugTool=");
        return C78920UyC.LIZIZ(LIZ, this.canDebugTool, ')', LIZ);
    }

    public final Boolean getCanDebugTool() {
        return this.canDebugTool;
    }

    public DebugToolState(Boolean bool) {
        this.canDebugTool = bool;
    }

    public final void setCanDebugTool(Boolean bool) {
        this.canDebugTool = bool;
    }

    public /* synthetic */ DebugToolState(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
