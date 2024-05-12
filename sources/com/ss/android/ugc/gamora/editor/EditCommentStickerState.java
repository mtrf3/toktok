package com.ss.android.ugc.gamora.editor;

import X.C145425nG;
import X.C150545vW;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditCommentStickerState implements InterfaceC61312at {
    public final C150545vW hasCommentSticker;
    public final C145425nG hideHelpBoxEvent;
    public final boolean inTimeEditView;
    public final C145425nG registerTimeEditRefreshListener;
    public final C145425nG removeCommentStickerEvent;
    public final C145425nG unRegisterTimeEditRefreshListener;

    /* JADX WARN: Multi-variable type inference failed */
    public EditCommentStickerState() {
        this(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EditCommentStickerState copy$default(EditCommentStickerState editCommentStickerState, C145425nG c145425nG, boolean z, C150545vW c150545vW, C145425nG c145425nG2, C145425nG c145425nG3, C145425nG c145425nG4, int i, Object obj) {
        if ((i & 1) != 0) {
            c145425nG = editCommentStickerState.hideHelpBoxEvent;
        }
        if ((i & 2) != 0) {
            z = editCommentStickerState.inTimeEditView;
        }
        if ((i & 4) != 0) {
            c150545vW = editCommentStickerState.hasCommentSticker;
        }
        if ((i & 8) != 0) {
            c145425nG2 = editCommentStickerState.removeCommentStickerEvent;
        }
        if ((i & 16) != 0) {
            c145425nG3 = editCommentStickerState.registerTimeEditRefreshListener;
        }
        if ((i & 32) != 0) {
            c145425nG4 = editCommentStickerState.unRegisterTimeEditRefreshListener;
        }
        return editCommentStickerState.copy(c145425nG, z, c150545vW, c145425nG2, c145425nG3, c145425nG4);
    }

    public final EditCommentStickerState copy(C145425nG c145425nG, boolean z, C150545vW c150545vW, C145425nG c145425nG2, C145425nG c145425nG3, C145425nG c145425nG4) {
        return new EditCommentStickerState(c145425nG, z, c150545vW, c145425nG2, c145425nG3, c145425nG4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditCommentStickerState)) {
            return false;
        }
        EditCommentStickerState editCommentStickerState = (EditCommentStickerState) obj;
        return o.LJ(this.hideHelpBoxEvent, editCommentStickerState.hideHelpBoxEvent) && this.inTimeEditView == editCommentStickerState.inTimeEditView && o.LJ(this.hasCommentSticker, editCommentStickerState.hasCommentSticker) && o.LJ(this.removeCommentStickerEvent, editCommentStickerState.removeCommentStickerEvent) && o.LJ(this.registerTimeEditRefreshListener, editCommentStickerState.registerTimeEditRefreshListener) && o.LJ(this.unRegisterTimeEditRefreshListener, editCommentStickerState.unRegisterTimeEditRefreshListener);
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
        C150545vW c150545vW = this.hasCommentSticker;
        int hashCode2 = (i2 + (c150545vW == null ? 0 : c150545vW.hashCode())) * 31;
        C145425nG c145425nG2 = this.removeCommentStickerEvent;
        int hashCode3 = (hashCode2 + (c145425nG2 == null ? 0 : c145425nG2.hashCode())) * 31;
        C145425nG c145425nG3 = this.registerTimeEditRefreshListener;
        int hashCode4 = (hashCode3 + (c145425nG3 == null ? 0 : c145425nG3.hashCode())) * 31;
        C145425nG c145425nG4 = this.unRegisterTimeEditRefreshListener;
        return hashCode4 + (c145425nG4 != null ? c145425nG4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditCommentStickerState(hideHelpBoxEvent=");
        LIZ.append(this.hideHelpBoxEvent);
        LIZ.append(", inTimeEditView=");
        LIZ.append(this.inTimeEditView);
        LIZ.append(", hasCommentSticker=");
        LIZ.append(this.hasCommentSticker);
        LIZ.append(", removeCommentStickerEvent=");
        LIZ.append(this.removeCommentStickerEvent);
        LIZ.append(", registerTimeEditRefreshListener=");
        LIZ.append(this.registerTimeEditRefreshListener);
        LIZ.append(", unRegisterTimeEditRefreshListener=");
        LIZ.append(this.unRegisterTimeEditRefreshListener);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C150545vW getHasCommentSticker() {
        return this.hasCommentSticker;
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

    public final C145425nG getRemoveCommentStickerEvent() {
        return this.removeCommentStickerEvent;
    }

    public final C145425nG getUnRegisterTimeEditRefreshListener() {
        return this.unRegisterTimeEditRefreshListener;
    }

    public EditCommentStickerState(C145425nG c145425nG, boolean z, C150545vW c150545vW, C145425nG c145425nG2, C145425nG c145425nG3, C145425nG c145425nG4) {
        this.hideHelpBoxEvent = c145425nG;
        this.inTimeEditView = z;
        this.hasCommentSticker = c150545vW;
        this.removeCommentStickerEvent = c145425nG2;
        this.registerTimeEditRefreshListener = c145425nG3;
        this.unRegisterTimeEditRefreshListener = c145425nG4;
    }

    public /* synthetic */ EditCommentStickerState(C145425nG c145425nG, boolean z, C150545vW c150545vW, C145425nG c145425nG2, C145425nG c145425nG3, C145425nG c145425nG4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c145425nG, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : c150545vW, (i & 8) != 0 ? null : c145425nG2, (i & 16) != 0 ? null : c145425nG3, (i & 32) == 0 ? c145425nG4 : null);
    }
}
