package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C78920UyC;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CutVideoBottomBarState implements InterfaceC61312at {
    public final Boolean deleteEnable;
    public final Boolean deleteVisible;
    public final Boolean rotateEnable;
    public final Boolean rotateVisible;
    public final Float selectTime;
    public final Boolean speedChecked;
    public final Boolean speedEnable;
    public final Boolean speedVisible;

    /* JADX WARN: Multi-variable type inference failed */
    public CutVideoBottomBarState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CutVideoBottomBarState copy$default(CutVideoBottomBarState cutVideoBottomBarState, Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = cutVideoBottomBarState.selectTime;
        }
        if ((i & 2) != 0) {
            bool = cutVideoBottomBarState.speedVisible;
        }
        if ((i & 4) != 0) {
            bool2 = cutVideoBottomBarState.speedChecked;
        }
        if ((i & 8) != 0) {
            bool3 = cutVideoBottomBarState.rotateVisible;
        }
        if ((i & 16) != 0) {
            bool4 = cutVideoBottomBarState.deleteVisible;
        }
        if ((i & 32) != 0) {
            bool5 = cutVideoBottomBarState.rotateEnable;
        }
        if ((i & 64) != 0) {
            bool6 = cutVideoBottomBarState.speedEnable;
        }
        if ((i & 128) != 0) {
            bool7 = cutVideoBottomBarState.deleteEnable;
        }
        return cutVideoBottomBarState.copy(f, bool, bool2, bool3, bool4, bool5, bool6, bool7);
    }

    public final CutVideoBottomBarState copy(Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        return new CutVideoBottomBarState(f, bool, bool2, bool3, bool4, bool5, bool6, bool7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoBottomBarState)) {
            return false;
        }
        CutVideoBottomBarState cutVideoBottomBarState = (CutVideoBottomBarState) obj;
        return o.LJ(this.selectTime, cutVideoBottomBarState.selectTime) && o.LJ(this.speedVisible, cutVideoBottomBarState.speedVisible) && o.LJ(this.speedChecked, cutVideoBottomBarState.speedChecked) && o.LJ(this.rotateVisible, cutVideoBottomBarState.rotateVisible) && o.LJ(this.deleteVisible, cutVideoBottomBarState.deleteVisible) && o.LJ(this.rotateEnable, cutVideoBottomBarState.rotateEnable) && o.LJ(this.speedEnable, cutVideoBottomBarState.speedEnable) && o.LJ(this.deleteEnable, cutVideoBottomBarState.deleteEnable);
    }

    public int hashCode() {
        Float f = this.selectTime;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Boolean bool = this.speedVisible;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.speedChecked;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.rotateVisible;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.deleteVisible;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.rotateEnable;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.speedEnable;
        int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.deleteEnable;
        return hashCode7 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutVideoBottomBarState(selectTime=");
        LIZ.append(this.selectTime);
        LIZ.append(", speedVisible=");
        LIZ.append(this.speedVisible);
        LIZ.append(", speedChecked=");
        LIZ.append(this.speedChecked);
        LIZ.append(", rotateVisible=");
        LIZ.append(this.rotateVisible);
        LIZ.append(", deleteVisible=");
        LIZ.append(this.deleteVisible);
        LIZ.append(", rotateEnable=");
        LIZ.append(this.rotateEnable);
        LIZ.append(", speedEnable=");
        LIZ.append(this.speedEnable);
        LIZ.append(", deleteEnable=");
        return C78920UyC.LIZIZ(LIZ, this.deleteEnable, ')', LIZ);
    }

    public final Boolean getDeleteEnable() {
        return this.deleteEnable;
    }

    public final Boolean getDeleteVisible() {
        return this.deleteVisible;
    }

    public final Boolean getRotateEnable() {
        return this.rotateEnable;
    }

    public final Boolean getRotateVisible() {
        return this.rotateVisible;
    }

    public final Float getSelectTime() {
        return this.selectTime;
    }

    public final Boolean getSpeedChecked() {
        return this.speedChecked;
    }

    public final Boolean getSpeedEnable() {
        return this.speedEnable;
    }

    public final Boolean getSpeedVisible() {
        return this.speedVisible;
    }

    public CutVideoBottomBarState(Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.selectTime = f;
        this.speedVisible = bool;
        this.speedChecked = bool2;
        this.rotateVisible = bool3;
        this.deleteVisible = bool4;
        this.rotateEnable = bool5;
        this.speedEnable = bool6;
        this.deleteEnable = bool7;
    }

    public /* synthetic */ CutVideoBottomBarState(Float f, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : bool6, (i & 128) == 0 ? bool7 : null);
    }
}
