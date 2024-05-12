package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import X.C145425nG;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditDonationStickerState implements InterfaceC61312at {
    public final C145425nG hideHelpBoxEvent;
    public final boolean inTimeEditView;
    public final C145425nG registerTimeEditRefreshListener;
    public final C145425nG unRegisterTimeEditRefreshListener;

    /* JADX WARN: Multi-variable type inference failed */
    public EditDonationStickerState() {
        this(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EditDonationStickerState copy$default(EditDonationStickerState editDonationStickerState, C145425nG c145425nG, boolean z, C145425nG c145425nG2, C145425nG c145425nG3, int i, Object obj) {
        if ((i & 1) != 0) {
            c145425nG = editDonationStickerState.hideHelpBoxEvent;
        }
        if ((i & 2) != 0) {
            z = editDonationStickerState.inTimeEditView;
        }
        if ((i & 4) != 0) {
            c145425nG2 = editDonationStickerState.registerTimeEditRefreshListener;
        }
        if ((i & 8) != 0) {
            c145425nG3 = editDonationStickerState.unRegisterTimeEditRefreshListener;
        }
        return editDonationStickerState.copy(c145425nG, z, c145425nG2, c145425nG3);
    }

    public final EditDonationStickerState copy(C145425nG c145425nG, boolean z, C145425nG c145425nG2, C145425nG c145425nG3) {
        return new EditDonationStickerState(c145425nG, z, c145425nG2, c145425nG3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditDonationStickerState)) {
            return false;
        }
        EditDonationStickerState editDonationStickerState = (EditDonationStickerState) obj;
        return o.LJ(this.hideHelpBoxEvent, editDonationStickerState.hideHelpBoxEvent) && this.inTimeEditView == editDonationStickerState.inTimeEditView && o.LJ(this.registerTimeEditRefreshListener, editDonationStickerState.registerTimeEditRefreshListener) && o.LJ(this.unRegisterTimeEditRefreshListener, editDonationStickerState.unRegisterTimeEditRefreshListener);
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
        C145425nG c145425nG2 = this.registerTimeEditRefreshListener;
        int hashCode2 = (i2 + (c145425nG2 == null ? 0 : c145425nG2.hashCode())) * 31;
        C145425nG c145425nG3 = this.unRegisterTimeEditRefreshListener;
        return hashCode2 + (c145425nG3 != null ? c145425nG3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditDonationStickerState(hideHelpBoxEvent=");
        LIZ.append(this.hideHelpBoxEvent);
        LIZ.append(", inTimeEditView=");
        LIZ.append(this.inTimeEditView);
        LIZ.append(", registerTimeEditRefreshListener=");
        LIZ.append(this.registerTimeEditRefreshListener);
        LIZ.append(", unRegisterTimeEditRefreshListener=");
        LIZ.append(this.unRegisterTimeEditRefreshListener);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
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

    public EditDonationStickerState(C145425nG c145425nG, boolean z, C145425nG c145425nG2, C145425nG c145425nG3) {
        this.hideHelpBoxEvent = c145425nG;
        this.inTimeEditView = z;
        this.registerTimeEditRefreshListener = c145425nG2;
        this.unRegisterTimeEditRefreshListener = c145425nG3;
    }

    public /* synthetic */ EditDonationStickerState(C145425nG c145425nG, boolean z, C145425nG c145425nG2, C145425nG c145425nG3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c145425nG, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : c145425nG2, (i & 8) != 0 ? null : c145425nG3);
    }
}
