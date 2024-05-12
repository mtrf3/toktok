package com.ss.android.ugc.aweme.ftc.components.sticker.core;

import X.AbstractC81666W3i;
import X.C145425nG;
import X.C150545vW;
import X.C150565vY;
import X.C150575vZ;
import X.C81667W3j;
import X.X1D;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditStickerState extends UiState {
    public final C150575vZ<Float, Long> pollTextAnimEvent;
    public final C150565vY<Float, Float, Float> pollTextLayoutEvent;
    public final Integer pollingTopMargin;
    public final C145425nG refreshVideoSource;
    public final AbstractC81666W3i ui;
    public final C150575vZ<Integer, Boolean> updateStickerTime;
    public final C150575vZ<Integer, Integer> videoLengthUpdateEvent;
    public final C150545vW viewRenderStickerVisibleEvent;

    public FTCEditStickerState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FTCEditStickerState copy$default(FTCEditStickerState fTCEditStickerState, AbstractC81666W3i abstractC81666W3i, Integer num, C150575vZ c150575vZ, C150565vY c150565vY, C150545vW c150545vW, C150575vZ c150575vZ2, C145425nG c145425nG, C150575vZ c150575vZ3, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC81666W3i = fTCEditStickerState.getUi();
        }
        if ((i & 2) != 0) {
            num = fTCEditStickerState.pollingTopMargin;
        }
        if ((i & 4) != 0) {
            c150575vZ = fTCEditStickerState.pollTextAnimEvent;
        }
        if ((i & 8) != 0) {
            c150565vY = fTCEditStickerState.pollTextLayoutEvent;
        }
        if ((i & 16) != 0) {
            c150545vW = fTCEditStickerState.viewRenderStickerVisibleEvent;
        }
        if ((i & 32) != 0) {
            c150575vZ2 = fTCEditStickerState.videoLengthUpdateEvent;
        }
        if ((i & 64) != 0) {
            c145425nG = fTCEditStickerState.refreshVideoSource;
        }
        if ((i & 128) != 0) {
            c150575vZ3 = fTCEditStickerState.updateStickerTime;
        }
        return fTCEditStickerState.copy(abstractC81666W3i, num, c150575vZ, c150565vY, c150545vW, c150575vZ2, c145425nG, c150575vZ3);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final FTCEditStickerState copy(AbstractC81666W3i ui, Integer num, C150575vZ<Float, Long> c150575vZ, C150565vY<Float, Float, Float> c150565vY, C150545vW c150545vW, C150575vZ<Integer, Integer> c150575vZ2, C145425nG c145425nG, C150575vZ<Integer, Boolean> c150575vZ3) {
        o.LJIIIZ(ui, "ui");
        return new FTCEditStickerState(ui, num, c150575vZ, c150565vY, c150545vW, c150575vZ2, c145425nG, c150575vZ3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditStickerState)) {
            return false;
        }
        FTCEditStickerState fTCEditStickerState = (FTCEditStickerState) obj;
        return o.LJ(getUi(), fTCEditStickerState.getUi()) && o.LJ(this.pollingTopMargin, fTCEditStickerState.pollingTopMargin) && o.LJ(this.pollTextAnimEvent, fTCEditStickerState.pollTextAnimEvent) && o.LJ(this.pollTextLayoutEvent, fTCEditStickerState.pollTextLayoutEvent) && o.LJ(this.viewRenderStickerVisibleEvent, fTCEditStickerState.viewRenderStickerVisibleEvent) && o.LJ(this.videoLengthUpdateEvent, fTCEditStickerState.videoLengthUpdateEvent) && o.LJ(this.refreshVideoSource, fTCEditStickerState.refreshVideoSource) && o.LJ(this.updateStickerTime, fTCEditStickerState.updateStickerTime);
    }

    public int hashCode() {
        int hashCode = getUi().hashCode() * 31;
        Integer num = this.pollingTopMargin;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        C150575vZ<Float, Long> c150575vZ = this.pollTextAnimEvent;
        int hashCode3 = (hashCode2 + (c150575vZ == null ? 0 : c150575vZ.hashCode())) * 31;
        C150565vY<Float, Float, Float> c150565vY = this.pollTextLayoutEvent;
        int hashCode4 = (hashCode3 + (c150565vY == null ? 0 : c150565vY.hashCode())) * 31;
        C150545vW c150545vW = this.viewRenderStickerVisibleEvent;
        int hashCode5 = (hashCode4 + (c150545vW == null ? 0 : c150545vW.hashCode())) * 31;
        C150575vZ<Integer, Integer> c150575vZ2 = this.videoLengthUpdateEvent;
        int hashCode6 = (hashCode5 + (c150575vZ2 == null ? 0 : c150575vZ2.hashCode())) * 31;
        C145425nG c145425nG = this.refreshVideoSource;
        int hashCode7 = (hashCode6 + (c145425nG == null ? 0 : c145425nG.hashCode())) * 31;
        C150575vZ<Integer, Boolean> c150575vZ3 = this.updateStickerTime;
        return hashCode7 + (c150575vZ3 != null ? c150575vZ3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FTCEditStickerState(ui=");
        LIZ.append(getUi());
        LIZ.append(", pollingTopMargin=");
        LIZ.append(this.pollingTopMargin);
        LIZ.append(", pollTextAnimEvent=");
        LIZ.append(this.pollTextAnimEvent);
        LIZ.append(", pollTextLayoutEvent=");
        LIZ.append(this.pollTextLayoutEvent);
        LIZ.append(", viewRenderStickerVisibleEvent=");
        LIZ.append(this.viewRenderStickerVisibleEvent);
        LIZ.append(", videoLengthUpdateEvent=");
        LIZ.append(this.videoLengthUpdateEvent);
        LIZ.append(", refreshVideoSource=");
        LIZ.append(this.refreshVideoSource);
        LIZ.append(", updateStickerTime=");
        LIZ.append(this.updateStickerTime);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C150575vZ<Float, Long> getPollTextAnimEvent() {
        return this.pollTextAnimEvent;
    }

    public final C150565vY<Float, Float, Float> getPollTextLayoutEvent() {
        return this.pollTextLayoutEvent;
    }

    public final Integer getPollingTopMargin() {
        return this.pollingTopMargin;
    }

    public final C145425nG getRefreshVideoSource() {
        return this.refreshVideoSource;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    public final C150575vZ<Integer, Boolean> getUpdateStickerTime() {
        return this.updateStickerTime;
    }

    public final C150575vZ<Integer, Integer> getVideoLengthUpdateEvent() {
        return this.videoLengthUpdateEvent;
    }

    public final C150545vW getViewRenderStickerVisibleEvent() {
        return this.viewRenderStickerVisibleEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTCEditStickerState(AbstractC81666W3i ui, Integer num, C150575vZ<Float, Long> c150575vZ, C150565vY<Float, Float, Float> c150565vY, C150545vW c150545vW, C150575vZ<Integer, Integer> c150575vZ2, C145425nG c145425nG, C150575vZ<Integer, Boolean> c150575vZ3) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.ui = ui;
        this.pollingTopMargin = num;
        this.pollTextAnimEvent = c150575vZ;
        this.pollTextLayoutEvent = c150565vY;
        this.viewRenderStickerVisibleEvent = c150545vW;
        this.videoLengthUpdateEvent = c150575vZ2;
        this.refreshVideoSource = c145425nG;
        this.updateStickerTime = c150575vZ3;
    }

    public /* synthetic */ FTCEditStickerState(AbstractC81666W3i abstractC81666W3i, Integer num, C150575vZ c150575vZ, C150565vY c150565vY, C150545vW c150545vW, C150575vZ c150575vZ2, C145425nG c145425nG, C150575vZ c150575vZ3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C81667W3j() : abstractC81666W3i, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : c150575vZ, (i & 8) != 0 ? null : c150565vY, (i & 16) != 0 ? null : c150545vW, (i & 32) != 0 ? null : c150575vZ2, (i & 64) != 0 ? null : c145425nG, (i & 128) == 0 ? c150575vZ3 : null);
    }
}
