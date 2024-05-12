package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C78920UyC;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CutVideoTitleBarState implements InterfaceC61312at {
    public final Boolean backEnable;
    public final Boolean backVisible;
    public final Boolean nextEnable;
    public final Boolean nextVisible;

    /* JADX WARN: Multi-variable type inference failed */
    public CutVideoTitleBarState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CutVideoTitleBarState copy$default(CutVideoTitleBarState cutVideoTitleBarState, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = cutVideoTitleBarState.backVisible;
        }
        if ((i & 2) != 0) {
            bool2 = cutVideoTitleBarState.nextVisible;
        }
        if ((i & 4) != 0) {
            bool3 = cutVideoTitleBarState.backEnable;
        }
        if ((i & 8) != 0) {
            bool4 = cutVideoTitleBarState.nextEnable;
        }
        return cutVideoTitleBarState.copy(bool, bool2, bool3, bool4);
    }

    public final CutVideoTitleBarState copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        return new CutVideoTitleBarState(bool, bool2, bool3, bool4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoTitleBarState)) {
            return false;
        }
        CutVideoTitleBarState cutVideoTitleBarState = (CutVideoTitleBarState) obj;
        return o.LJ(this.backVisible, cutVideoTitleBarState.backVisible) && o.LJ(this.nextVisible, cutVideoTitleBarState.nextVisible) && o.LJ(this.backEnable, cutVideoTitleBarState.backEnable) && o.LJ(this.nextEnable, cutVideoTitleBarState.nextEnable);
    }

    public int hashCode() {
        Boolean bool = this.backVisible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.nextVisible;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.backEnable;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.nextEnable;
        return hashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutVideoTitleBarState(backVisible=");
        LIZ.append(this.backVisible);
        LIZ.append(", nextVisible=");
        LIZ.append(this.nextVisible);
        LIZ.append(", backEnable=");
        LIZ.append(this.backEnable);
        LIZ.append(", nextEnable=");
        return C78920UyC.LIZIZ(LIZ, this.nextEnable, ')', LIZ);
    }

    public final Boolean getBackEnable() {
        return this.backEnable;
    }

    public final Boolean getBackVisible() {
        return this.backVisible;
    }

    public final Boolean getNextEnable() {
        return this.nextEnable;
    }

    public final Boolean getNextVisible() {
        return this.nextVisible;
    }

    public CutVideoTitleBarState(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.backVisible = bool;
        this.nextVisible = bool2;
        this.backEnable = bool3;
        this.nextEnable = bool4;
    }

    public /* synthetic */ CutVideoTitleBarState(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4);
    }
}
