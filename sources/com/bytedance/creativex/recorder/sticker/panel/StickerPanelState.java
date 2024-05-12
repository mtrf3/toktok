package com.bytedance.creativex.recorder.sticker.panel;

import X.AbstractC81666W3i;
import X.C81667W3j;
import X.X1D;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class StickerPanelState extends UiState {
    public final AbstractC81666W3i ui;

    /* JADX WARN: Multi-variable type inference failed */
    public StickerPanelState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StickerPanelState copy$default(StickerPanelState stickerPanelState, AbstractC81666W3i abstractC81666W3i, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC81666W3i = stickerPanelState.getUi();
        }
        return stickerPanelState.copy(abstractC81666W3i);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final StickerPanelState copy(AbstractC81666W3i ui) {
        o.LJIIIZ(ui, "ui");
        return new StickerPanelState(ui);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StickerPanelState) && o.LJ(getUi(), ((UiState) obj).getUi());
        }
        return true;
    }

    public int hashCode() {
        AbstractC81666W3i ui = getUi();
        if (ui != null) {
            return ui.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerPanelState(ui=");
        LIZ.append(getUi());
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPanelState(AbstractC81666W3i ui) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.ui = ui;
    }

    public /* synthetic */ StickerPanelState(AbstractC81666W3i abstractC81666W3i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C81667W3j() : abstractC81666W3i);
    }
}
