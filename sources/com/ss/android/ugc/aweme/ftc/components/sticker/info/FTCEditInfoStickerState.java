package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import X.AbstractC81666W3i;
import X.C145425nG;
import X.C150565vY;
import X.C150575vZ;
import X.C45927I0t;
import X.C81667W3j;
import X.X1D;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditInfoStickerState extends UiState {
    public final C45927I0t<StickerItemModel> clickStickerItemEvent;
    public final C150575vZ<Float, Long> editViewAnimEvent;
    public final C150565vY<Float, Float, Float> editViewLayoutEvent;
    public final C145425nG hideHelpBoxEvent;
    public final C145425nG refreshVideoSource;
    public final C150575vZ<Integer, Integer> resetVideoLengthEvent;
    public final AbstractC81666W3i ui;

    public FTCEditInfoStickerState() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FTCEditInfoStickerState copy$default(FTCEditInfoStickerState fTCEditInfoStickerState, AbstractC81666W3i abstractC81666W3i, C145425nG c145425nG, C150575vZ c150575vZ, C45927I0t c45927I0t, C150575vZ c150575vZ2, C150565vY c150565vY, C145425nG c145425nG2, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC81666W3i = fTCEditInfoStickerState.getUi();
        }
        if ((i & 2) != 0) {
            c145425nG = fTCEditInfoStickerState.hideHelpBoxEvent;
        }
        if ((i & 4) != 0) {
            c150575vZ = fTCEditInfoStickerState.resetVideoLengthEvent;
        }
        if ((i & 8) != 0) {
            c45927I0t = fTCEditInfoStickerState.clickStickerItemEvent;
        }
        if ((i & 16) != 0) {
            c150575vZ2 = fTCEditInfoStickerState.editViewAnimEvent;
        }
        if ((i & 32) != 0) {
            c150565vY = fTCEditInfoStickerState.editViewLayoutEvent;
        }
        if ((i & 64) != 0) {
            c145425nG2 = fTCEditInfoStickerState.refreshVideoSource;
        }
        return fTCEditInfoStickerState.copy(abstractC81666W3i, c145425nG, c150575vZ, c45927I0t, c150575vZ2, c150565vY, c145425nG2);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final FTCEditInfoStickerState copy(AbstractC81666W3i ui, C145425nG c145425nG, C150575vZ<Integer, Integer> c150575vZ, C45927I0t<? extends StickerItemModel> c45927I0t, C150575vZ<Float, Long> c150575vZ2, C150565vY<Float, Float, Float> c150565vY, C145425nG c145425nG2) {
        o.LJIIIZ(ui, "ui");
        return new FTCEditInfoStickerState(ui, c145425nG, c150575vZ, c45927I0t, c150575vZ2, c150565vY, c145425nG2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditInfoStickerState)) {
            return false;
        }
        FTCEditInfoStickerState fTCEditInfoStickerState = (FTCEditInfoStickerState) obj;
        return o.LJ(getUi(), fTCEditInfoStickerState.getUi()) && o.LJ(this.hideHelpBoxEvent, fTCEditInfoStickerState.hideHelpBoxEvent) && o.LJ(this.resetVideoLengthEvent, fTCEditInfoStickerState.resetVideoLengthEvent) && o.LJ(this.clickStickerItemEvent, fTCEditInfoStickerState.clickStickerItemEvent) && o.LJ(this.editViewAnimEvent, fTCEditInfoStickerState.editViewAnimEvent) && o.LJ(this.editViewLayoutEvent, fTCEditInfoStickerState.editViewLayoutEvent) && o.LJ(this.refreshVideoSource, fTCEditInfoStickerState.refreshVideoSource);
    }

    public int hashCode() {
        int hashCode = getUi().hashCode() * 31;
        C145425nG c145425nG = this.hideHelpBoxEvent;
        int hashCode2 = (hashCode + (c145425nG == null ? 0 : c145425nG.hashCode())) * 31;
        C150575vZ<Integer, Integer> c150575vZ = this.resetVideoLengthEvent;
        int hashCode3 = (hashCode2 + (c150575vZ == null ? 0 : c150575vZ.hashCode())) * 31;
        C45927I0t<StickerItemModel> c45927I0t = this.clickStickerItemEvent;
        int hashCode4 = (hashCode3 + (c45927I0t == null ? 0 : c45927I0t.hashCode())) * 31;
        C150575vZ<Float, Long> c150575vZ2 = this.editViewAnimEvent;
        int hashCode5 = (hashCode4 + (c150575vZ2 == null ? 0 : c150575vZ2.hashCode())) * 31;
        C150565vY<Float, Float, Float> c150565vY = this.editViewLayoutEvent;
        int hashCode6 = (hashCode5 + (c150565vY == null ? 0 : c150565vY.hashCode())) * 31;
        C145425nG c145425nG2 = this.refreshVideoSource;
        return hashCode6 + (c145425nG2 != null ? c145425nG2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FTCEditInfoStickerState(ui=");
        LIZ.append(getUi());
        LIZ.append(", hideHelpBoxEvent=");
        LIZ.append(this.hideHelpBoxEvent);
        LIZ.append(", resetVideoLengthEvent=");
        LIZ.append(this.resetVideoLengthEvent);
        LIZ.append(", clickStickerItemEvent=");
        LIZ.append(this.clickStickerItemEvent);
        LIZ.append(", editViewAnimEvent=");
        LIZ.append(this.editViewAnimEvent);
        LIZ.append(", editViewLayoutEvent=");
        LIZ.append(this.editViewLayoutEvent);
        LIZ.append(", refreshVideoSource=");
        LIZ.append(this.refreshVideoSource);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C45927I0t<StickerItemModel> getClickStickerItemEvent() {
        return this.clickStickerItemEvent;
    }

    public final C150575vZ<Float, Long> getEditViewAnimEvent() {
        return this.editViewAnimEvent;
    }

    public final C150565vY<Float, Float, Float> getEditViewLayoutEvent() {
        return this.editViewLayoutEvent;
    }

    public final C145425nG getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final C145425nG getRefreshVideoSource() {
        return this.refreshVideoSource;
    }

    public final C150575vZ<Integer, Integer> getResetVideoLengthEvent() {
        return this.resetVideoLengthEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FTCEditInfoStickerState(AbstractC81666W3i ui, C145425nG c145425nG, C150575vZ<Integer, Integer> c150575vZ, C45927I0t<? extends StickerItemModel> c45927I0t, C150575vZ<Float, Long> c150575vZ2, C150565vY<Float, Float, Float> c150565vY, C145425nG c145425nG2) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.ui = ui;
        this.hideHelpBoxEvent = c145425nG;
        this.resetVideoLengthEvent = c150575vZ;
        this.clickStickerItemEvent = c45927I0t;
        this.editViewAnimEvent = c150575vZ2;
        this.editViewLayoutEvent = c150565vY;
        this.refreshVideoSource = c145425nG2;
    }

    public /* synthetic */ FTCEditInfoStickerState(AbstractC81666W3i abstractC81666W3i, C145425nG c145425nG, C150575vZ c150575vZ, C45927I0t c45927I0t, C150575vZ c150575vZ2, C150565vY c150565vY, C145425nG c145425nG2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C81667W3j() : abstractC81666W3i, (i & 2) != 0 ? null : c145425nG, (i & 4) != 0 ? null : c150575vZ, (i & 8) != 0 ? null : c45927I0t, (i & 16) != 0 ? null : c150575vZ2, (i & 32) != 0 ? null : c150565vY, (i & 64) == 0 ? c145425nG2 : null);
    }
}
