package com.ss.android.ugc.gamora.recorder.sticker.optionlist;

import X.AbstractC81666W3i;
import X.C48339Iy7;
import X.C81667W3j;
import X.X1D;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class OptionPanelState extends UiState {
    public final Effect effect;
    public final boolean isBottomSheetVisible;
    public final AbstractC81666W3i ui;

    /* JADX WARN: Multi-variable type inference failed */
    public OptionPanelState() {
        this(null, 0 == true ? 1 : 0, false, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OptionPanelState copy$default(OptionPanelState optionPanelState, AbstractC81666W3i abstractC81666W3i, Effect effect, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC81666W3i = optionPanelState.getUi();
        }
        if ((i & 2) != 0) {
            effect = optionPanelState.effect;
        }
        if ((i & 4) != 0) {
            z = optionPanelState.isBottomSheetVisible;
        }
        return optionPanelState.copy(abstractC81666W3i, effect, z);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final OptionPanelState copy(AbstractC81666W3i ui, Effect effect, boolean z) {
        o.LJIIIZ(ui, "ui");
        return new OptionPanelState(ui, effect, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionPanelState)) {
            return false;
        }
        OptionPanelState optionPanelState = (OptionPanelState) obj;
        return o.LJ(getUi(), optionPanelState.getUi()) && o.LJ(this.effect, optionPanelState.effect) && this.isBottomSheetVisible == optionPanelState.isBottomSheetVisible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = getUi().hashCode() * 31;
        Effect effect = this.effect;
        int hashCode2 = (hashCode + (effect == null ? 0 : effect.hashCode())) * 31;
        boolean z = this.isBottomSheetVisible;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OptionPanelState(ui=");
        LIZ.append(getUi());
        LIZ.append(", effect=");
        LIZ.append(this.effect);
        LIZ.append(", isBottomSheetVisible=");
        return C48339Iy7.LIZJ(LIZ, this.isBottomSheetVisible, ')', LIZ);
    }

    public final Effect getEffect() {
        return this.effect;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    public final boolean isBottomSheetVisible() {
        return this.isBottomSheetVisible;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionPanelState(AbstractC81666W3i ui, Effect effect, boolean z) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.ui = ui;
        this.effect = effect;
        this.isBottomSheetVisible = z;
    }

    public /* synthetic */ OptionPanelState(AbstractC81666W3i abstractC81666W3i, Effect effect, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C81667W3j() : abstractC81666W3i, (i & 2) != 0 ? null : effect, (i & 4) != 0 ? false : z);
    }
}
