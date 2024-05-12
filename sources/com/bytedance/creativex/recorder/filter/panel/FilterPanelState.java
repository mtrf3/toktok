package com.bytedance.creativex.recorder.filter.panel;

import X.AbstractC81666W3i;
import X.C122924s4;
import X.C145425nG;
import X.OSZ;
import X.X1D;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class FilterPanelState extends UiState {
    public final Map<EffectCategoryResponse, List<FilterBean>> data;
    public final boolean disableFilter;
    public final C145425nG enterFilterBoxEvent;
    public final OSZ<Integer, String> pendingSelected;
    public final FilterBean selectedFilter;
    public final AbstractC81666W3i ui;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterPanelState copy$default(FilterPanelState filterPanelState, AbstractC81666W3i abstractC81666W3i, FilterBean filterBean, boolean z, Map map, C145425nG c145425nG, OSZ osz, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC81666W3i = filterPanelState.getUi();
        }
        if ((i & 2) != 0) {
            filterBean = filterPanelState.selectedFilter;
        }
        if ((i & 4) != 0) {
            z = filterPanelState.disableFilter;
        }
        if ((i & 8) != 0) {
            map = filterPanelState.data;
        }
        if ((i & 16) != 0) {
            c145425nG = filterPanelState.enterFilterBoxEvent;
        }
        if ((i & 32) != 0) {
            osz = filterPanelState.pendingSelected;
        }
        return filterPanelState.copy(abstractC81666W3i, filterBean, z, map, c145425nG, osz);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final FilterPanelState copy(AbstractC81666W3i ui, FilterBean filterBean, boolean z, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> data, C145425nG c145425nG, OSZ<Integer, String> pendingSelected) {
        o.LJIIIZ(ui, "ui");
        o.LJIIIZ(data, "data");
        o.LJIIIZ(pendingSelected, "pendingSelected");
        return new FilterPanelState(ui, filterBean, z, data, c145425nG, pendingSelected);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterPanelState)) {
            return false;
        }
        FilterPanelState filterPanelState = (FilterPanelState) obj;
        return o.LJ(getUi(), filterPanelState.getUi()) && o.LJ(this.selectedFilter, filterPanelState.selectedFilter) && this.disableFilter == filterPanelState.disableFilter && o.LJ(this.data, filterPanelState.data) && o.LJ(this.enterFilterBoxEvent, filterPanelState.enterFilterBoxEvent) && o.LJ(this.pendingSelected, filterPanelState.pendingSelected);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        AbstractC81666W3i ui = getUi();
        int hashCode = (ui != null ? ui.hashCode() : 0) * 31;
        FilterBean filterBean = this.selectedFilter;
        int hashCode2 = (hashCode + (filterBean != null ? filterBean.hashCode() : 0)) * 31;
        boolean z = this.disableFilter;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        Map<EffectCategoryResponse, List<FilterBean>> map = this.data;
        int hashCode3 = (i2 + (map != null ? map.hashCode() : 0)) * 31;
        C145425nG c145425nG = this.enterFilterBoxEvent;
        int hashCode4 = (hashCode3 + (c145425nG != null ? c145425nG.hashCode() : 0)) * 31;
        OSZ<Integer, String> osz = this.pendingSelected;
        return hashCode4 + (osz != null ? osz.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FilterPanelState(ui=");
        LIZ.append(getUi());
        LIZ.append(", selectedFilter=");
        LIZ.append(this.selectedFilter);
        LIZ.append(", disableFilter=");
        LIZ.append(this.disableFilter);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(", enterFilterBoxEvent=");
        LIZ.append(this.enterFilterBoxEvent);
        LIZ.append(", pendingSelected=");
        LIZ.append(this.pendingSelected);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public final Map<EffectCategoryResponse, List<FilterBean>> getData() {
        return this.data;
    }

    public final boolean getDisableFilter() {
        return this.disableFilter;
    }

    public final C145425nG getEnterFilterBoxEvent() {
        return this.enterFilterBoxEvent;
    }

    public final OSZ<Integer, String> getPendingSelected() {
        return this.pendingSelected;
    }

    public final FilterBean getSelectedFilter() {
        return this.selectedFilter;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FilterPanelState(AbstractC81666W3i ui, FilterBean filterBean, boolean z, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> data, C145425nG c145425nG, OSZ<Integer, String> pendingSelected) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        o.LJIIIZ(data, "data");
        o.LJIIIZ(pendingSelected, "pendingSelected");
        this.ui = ui;
        this.selectedFilter = filterBean;
        this.disableFilter = z;
        this.data = data;
        this.enterFilterBoxEvent = c145425nG;
        this.pendingSelected = pendingSelected;
    }

    public /* synthetic */ FilterPanelState(AbstractC81666W3i abstractC81666W3i, FilterBean filterBean, boolean z, Map map, C145425nG c145425nG, OSZ osz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC81666W3i, filterBean, z, map, (i & 16) != 0 ? null : c145425nG, (i & 32) != 0 ? C122924s4.LIZ : osz);
    }
}
