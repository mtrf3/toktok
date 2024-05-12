package com.ss.android.ugc.aweme.ftc.components.corner;

import X.AbstractC81666W3i;
import X.C81667W3j;
import X.X1D;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditCornerState extends UiState {
    public final Integer bottomMargin;
    public final Boolean cornerVisible;
    public final Integer topMargin;
    public final AbstractC81666W3i ui;

    public FTCEditCornerState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ FTCEditCornerState copy$default(FTCEditCornerState fTCEditCornerState, Boolean bool, Integer num, Integer num2, AbstractC81666W3i abstractC81666W3i, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = fTCEditCornerState.cornerVisible;
        }
        if ((i & 2) != 0) {
            num = fTCEditCornerState.topMargin;
        }
        if ((i & 4) != 0) {
            num2 = fTCEditCornerState.bottomMargin;
        }
        if ((i & 8) != 0) {
            abstractC81666W3i = fTCEditCornerState.getUi();
        }
        return fTCEditCornerState.copy(bool, num, num2, abstractC81666W3i);
    }

    public final AbstractC81666W3i component4() {
        return getUi();
    }

    public final FTCEditCornerState copy(Boolean bool, Integer num, Integer num2, AbstractC81666W3i ui) {
        o.LJIIIZ(ui, "ui");
        return new FTCEditCornerState(bool, num, num2, ui);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditCornerState)) {
            return false;
        }
        FTCEditCornerState fTCEditCornerState = (FTCEditCornerState) obj;
        return o.LJ(this.cornerVisible, fTCEditCornerState.cornerVisible) && o.LJ(this.topMargin, fTCEditCornerState.topMargin) && o.LJ(this.bottomMargin, fTCEditCornerState.bottomMargin) && o.LJ(getUi(), fTCEditCornerState.getUi());
    }

    public int hashCode() {
        Boolean bool = this.cornerVisible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.topMargin;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bottomMargin;
        return getUi().hashCode() + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FTCEditCornerState(cornerVisible=");
        LIZ.append(this.cornerVisible);
        LIZ.append(", topMargin=");
        LIZ.append(this.topMargin);
        LIZ.append(", bottomMargin=");
        LIZ.append(this.bottomMargin);
        LIZ.append(", ui=");
        LIZ.append(getUi());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Integer getBottomMargin() {
        return this.bottomMargin;
    }

    public final Boolean getCornerVisible() {
        return this.cornerVisible;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTCEditCornerState(Boolean bool, Integer num, Integer num2, AbstractC81666W3i ui) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.cornerVisible = bool;
        this.topMargin = num;
        this.bottomMargin = num2;
        this.ui = ui;
    }

    public /* synthetic */ FTCEditCornerState(Boolean bool, Integer num, Integer num2, AbstractC81666W3i abstractC81666W3i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? new C81667W3j() : abstractC81666W3i);
    }
}
