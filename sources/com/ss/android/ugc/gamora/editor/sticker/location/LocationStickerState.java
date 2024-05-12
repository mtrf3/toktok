package com.ss.android.ugc.gamora.editor.sticker.location;

import X.C145425nG;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class LocationStickerState implements InterfaceC61312at {
    public final Boolean enableEdit;
    public final C145425nG hideHelpBoxEvent;
    public final boolean inTimeEditView;
    public final C145425nG registerTimeEditRefreshListener;
    public final C145425nG unRegisterTimeEditRefreshListener;

    /* JADX WARN: Multi-variable type inference failed */
    public LocationStickerState() {
        this(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LocationStickerState copy$default(LocationStickerState locationStickerState, C145425nG c145425nG, boolean z, Boolean bool, C145425nG c145425nG2, C145425nG c145425nG3, int i, Object obj) {
        if ((i & 1) != 0) {
            c145425nG = locationStickerState.hideHelpBoxEvent;
        }
        if ((i & 2) != 0) {
            z = locationStickerState.inTimeEditView;
        }
        if ((i & 4) != 0) {
            bool = locationStickerState.enableEdit;
        }
        if ((i & 8) != 0) {
            c145425nG2 = locationStickerState.registerTimeEditRefreshListener;
        }
        if ((i & 16) != 0) {
            c145425nG3 = locationStickerState.unRegisterTimeEditRefreshListener;
        }
        return locationStickerState.copy(c145425nG, z, bool, c145425nG2, c145425nG3);
    }

    public final LocationStickerState copy(C145425nG c145425nG, boolean z, Boolean bool, C145425nG c145425nG2, C145425nG c145425nG3) {
        return new LocationStickerState(c145425nG, z, bool, c145425nG2, c145425nG3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationStickerState)) {
            return false;
        }
        LocationStickerState locationStickerState = (LocationStickerState) obj;
        return o.LJ(this.hideHelpBoxEvent, locationStickerState.hideHelpBoxEvent) && this.inTimeEditView == locationStickerState.inTimeEditView && o.LJ(this.enableEdit, locationStickerState.enableEdit) && o.LJ(this.registerTimeEditRefreshListener, locationStickerState.registerTimeEditRefreshListener) && o.LJ(this.unRegisterTimeEditRefreshListener, locationStickerState.unRegisterTimeEditRefreshListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        C145425nG c145425nG = this.hideHelpBoxEvent;
        int hashCode = (c145425nG == null ? 0 : c145425nG.hashCode()) * 31;
        boolean z = this.inTimeEditView;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Boolean bool = this.enableEdit;
        int hashCode2 = (i2 + (bool == null ? 0 : bool.hashCode())) * 31;
        C145425nG c145425nG2 = this.registerTimeEditRefreshListener;
        int hashCode3 = (hashCode2 + (c145425nG2 == null ? 0 : c145425nG2.hashCode())) * 31;
        C145425nG c145425nG3 = this.unRegisterTimeEditRefreshListener;
        return hashCode3 + (c145425nG3 != null ? c145425nG3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationStickerState(hideHelpBoxEvent=");
        LIZ.append(this.hideHelpBoxEvent);
        LIZ.append(", inTimeEditView=");
        LIZ.append(this.inTimeEditView);
        LIZ.append(", enableEdit=");
        LIZ.append(this.enableEdit);
        LIZ.append(", registerTimeEditRefreshListener=");
        LIZ.append(this.registerTimeEditRefreshListener);
        LIZ.append(", unRegisterTimeEditRefreshListener=");
        LIZ.append(this.unRegisterTimeEditRefreshListener);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Boolean getEnableEdit() {
        return this.enableEdit;
    }

    public final C145425nG getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public final C145425nG getRegisterTimeEditRefreshListener() {
        return this.registerTimeEditRefreshListener;
    }

    public final C145425nG getUnRegisterTimeEditRefreshListener() {
        return this.unRegisterTimeEditRefreshListener;
    }

    public LocationStickerState(C145425nG c145425nG, boolean z, Boolean bool, C145425nG c145425nG2, C145425nG c145425nG3) {
        this.hideHelpBoxEvent = c145425nG;
        this.inTimeEditView = z;
        this.enableEdit = bool;
        this.registerTimeEditRefreshListener = c145425nG2;
        this.unRegisterTimeEditRefreshListener = c145425nG3;
    }

    public /* synthetic */ LocationStickerState(C145425nG c145425nG, boolean z, Boolean bool, C145425nG c145425nG2, C145425nG c145425nG3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c145425nG, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : c145425nG2, (i & 16) == 0 ? c145425nG3 : null);
    }
}
