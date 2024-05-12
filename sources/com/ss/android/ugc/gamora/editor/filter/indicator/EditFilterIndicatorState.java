package com.ss.android.ugc.gamora.editor.filter.indicator;

import X.AbstractC81666W3i;
import X.C81667W3j;
import X.X1D;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EditFilterIndicatorState extends UiState {
    public final FilterBean currentFilter;
    public final boolean isAutoUse;
    public final boolean isShowPrompt;
    public final AbstractC81666W3i ui;

    public static /* synthetic */ EditFilterIndicatorState copy$default(EditFilterIndicatorState editFilterIndicatorState, boolean z, boolean z2, FilterBean filterBean, AbstractC81666W3i abstractC81666W3i, int i, Object obj) {
        if ((i & 1) != 0) {
            z = editFilterIndicatorState.isAutoUse;
        }
        if ((i & 2) != 0) {
            z2 = editFilterIndicatorState.isShowPrompt;
        }
        if ((i & 4) != 0) {
            filterBean = editFilterIndicatorState.currentFilter;
        }
        if ((i & 8) != 0) {
            abstractC81666W3i = editFilterIndicatorState.getUi();
        }
        return editFilterIndicatorState.copy(z, z2, filterBean, abstractC81666W3i);
    }

    public final AbstractC81666W3i component4() {
        return getUi();
    }

    public final EditFilterIndicatorState copy(boolean z, boolean z2, FilterBean filterBean, AbstractC81666W3i ui) {
        o.LJIIIZ(ui, "ui");
        return new EditFilterIndicatorState(z, z2, filterBean, ui);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditFilterIndicatorState)) {
            return false;
        }
        EditFilterIndicatorState editFilterIndicatorState = (EditFilterIndicatorState) obj;
        return this.isAutoUse == editFilterIndicatorState.isAutoUse && this.isShowPrompt == editFilterIndicatorState.isShowPrompt && o.LJ(this.currentFilter, editFilterIndicatorState.currentFilter) && o.LJ(getUi(), editFilterIndicatorState.getUi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean z = this.isAutoUse;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = ((i * 31) + (this.isShowPrompt ? 1 : 0)) * 31;
        FilterBean filterBean = this.currentFilter;
        int hashCode = (i2 + (filterBean != null ? filterBean.hashCode() : 0)) * 31;
        AbstractC81666W3i ui = getUi();
        return hashCode + (ui != null ? ui.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditFilterIndicatorState(isAutoUse=");
        LIZ.append(this.isAutoUse);
        LIZ.append(", isShowPrompt=");
        LIZ.append(this.isShowPrompt);
        LIZ.append(", currentFilter=");
        LIZ.append(this.currentFilter);
        LIZ.append(", ui=");
        LIZ.append(getUi());
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public final FilterBean getCurrentFilter() {
        return this.currentFilter;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    public final boolean isAutoUse() {
        return this.isAutoUse;
    }

    public final boolean isShowPrompt() {
        return this.isShowPrompt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditFilterIndicatorState(boolean z, boolean z2, FilterBean filterBean, AbstractC81666W3i ui) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.isAutoUse = z;
        this.isShowPrompt = z2;
        this.currentFilter = filterBean;
        this.ui = ui;
    }

    public /* synthetic */ EditFilterIndicatorState(boolean z, boolean z2, FilterBean filterBean, AbstractC81666W3i abstractC81666W3i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? null : filterBean, (i & 8) != 0 ? new C81667W3j() : abstractC81666W3i);
    }
}
