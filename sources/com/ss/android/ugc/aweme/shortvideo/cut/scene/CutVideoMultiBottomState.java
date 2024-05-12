package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C78920UyC;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CutVideoMultiBottomState implements InterfaceC61312at {
    public final Boolean visible;

    /* JADX WARN: Multi-variable type inference failed */
    public CutVideoMultiBottomState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CutVideoMultiBottomState copy$default(CutVideoMultiBottomState cutVideoMultiBottomState, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = cutVideoMultiBottomState.visible;
        }
        return cutVideoMultiBottomState.copy(bool);
    }

    public final CutVideoMultiBottomState copy(Boolean bool) {
        return new CutVideoMultiBottomState(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CutVideoMultiBottomState) && o.LJ(this.visible, ((CutVideoMultiBottomState) obj).visible);
    }

    public int hashCode() {
        Boolean bool = this.visible;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutVideoMultiBottomState(visible=");
        return C78920UyC.LIZIZ(LIZ, this.visible, ')', LIZ);
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public CutVideoMultiBottomState(Boolean bool) {
        this.visible = bool;
    }

    public /* synthetic */ CutVideoMultiBottomState(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
