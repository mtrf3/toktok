package com.ss.android.ugc.aweme.shortvideo.duet;

import X.AbstractC81666W3i;
import X.C79062V1e;
import X.C81667W3j;
import X.X1D;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class DuetLayoutModeState extends UiState {
    public final int changeDirectionMode;
    public final int chosenPosition;
    public final Effect duetLayout;
    public final int guideMode;
    public final String toast;
    public final int touchGesture;
    public final AbstractC81666W3i ui;

    public DuetLayoutModeState() {
        this(0, 0, 0, 0, null, null, null, 127, null);
    }

    public static /* synthetic */ DuetLayoutModeState copy$default(DuetLayoutModeState duetLayoutModeState, int i, int i2, int i3, int i4, String str, Effect effect, AbstractC81666W3i abstractC81666W3i, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = duetLayoutModeState.changeDirectionMode;
        }
        if ((i5 & 2) != 0) {
            i2 = duetLayoutModeState.guideMode;
        }
        if ((i5 & 4) != 0) {
            i3 = duetLayoutModeState.touchGesture;
        }
        if ((i5 & 8) != 0) {
            i4 = duetLayoutModeState.chosenPosition;
        }
        if ((i5 & 16) != 0) {
            str = duetLayoutModeState.toast;
        }
        if ((i5 & 32) != 0) {
            effect = duetLayoutModeState.duetLayout;
        }
        if ((i5 & 64) != 0) {
            abstractC81666W3i = duetLayoutModeState.getUi();
        }
        return duetLayoutModeState.copy(i, i2, i3, i4, str, effect, abstractC81666W3i);
    }

    public final AbstractC81666W3i component7() {
        return getUi();
    }

    public final DuetLayoutModeState copy(int i, int i2, int i3, int i4, String toast, Effect effect, AbstractC81666W3i ui) {
        o.LJIIIZ(toast, "toast");
        o.LJIIIZ(ui, "ui");
        return new DuetLayoutModeState(i, i2, i3, i4, toast, effect, ui);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetLayoutModeState)) {
            return false;
        }
        DuetLayoutModeState duetLayoutModeState = (DuetLayoutModeState) obj;
        return this.changeDirectionMode == duetLayoutModeState.changeDirectionMode && this.guideMode == duetLayoutModeState.guideMode && this.touchGesture == duetLayoutModeState.touchGesture && this.chosenPosition == duetLayoutModeState.chosenPosition && o.LJ(this.toast, duetLayoutModeState.toast) && o.LJ(this.duetLayout, duetLayoutModeState.duetLayout) && o.LJ(getUi(), duetLayoutModeState.getUi());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DuetLayoutModeState(changeDirectionMode=");
        LIZ.append(this.changeDirectionMode);
        LIZ.append(", guideMode=");
        LIZ.append(this.guideMode);
        LIZ.append(", touchGesture=");
        LIZ.append(this.touchGesture);
        LIZ.append(", chosenPosition=");
        LIZ.append(this.chosenPosition);
        LIZ.append(", toast=");
        LIZ.append(this.toast);
        LIZ.append(", duetLayout=");
        LIZ.append(this.duetLayout);
        LIZ.append(", ui=");
        LIZ.append(getUi());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.toast, ((((((this.changeDirectionMode * 31) + this.guideMode) * 31) + this.touchGesture) * 31) + this.chosenPosition) * 31, 31);
        Effect effect = this.duetLayout;
        if (effect == null) {
            hashCode = 0;
        } else {
            hashCode = effect.hashCode();
        }
        return getUi().hashCode() + ((LJ + hashCode) * 31);
    }

    public final int getChangeDirectionMode() {
        return this.changeDirectionMode;
    }

    public final int getChosenPosition() {
        return this.chosenPosition;
    }

    public final Effect getDuetLayout() {
        return this.duetLayout;
    }

    public final int getGuideMode() {
        return this.guideMode;
    }

    public final String getToast() {
        return this.toast;
    }

    public final int getTouchGesture() {
        return this.touchGesture;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuetLayoutModeState(int i, int i2, int i3, int i4, String toast, Effect effect, AbstractC81666W3i ui) {
        super(ui);
        o.LJIIIZ(toast, "toast");
        o.LJIIIZ(ui, "ui");
        this.changeDirectionMode = i;
        this.guideMode = i2;
        this.touchGesture = i3;
        this.chosenPosition = i4;
        this.toast = toast;
        this.duetLayout = effect;
        this.ui = ui;
    }

    public /* synthetic */ DuetLayoutModeState(int i, int i2, int i3, int i4, String str, Effect effect, AbstractC81666W3i abstractC81666W3i, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) == 0 ? i4 : 0, (i5 & 16) != 0 ? "" : str, (i5 & 32) != 0 ? null : effect, (i5 & 64) != 0 ? new C81667W3j() : abstractC81666W3i);
    }
}
