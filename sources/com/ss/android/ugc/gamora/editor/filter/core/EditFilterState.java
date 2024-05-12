package com.ss.android.ugc.gamora.editor.filter.core;

import X.AbstractC81666W3i;
import X.C113554cx;
import X.C145425nG;
import X.C150545vW;
import X.C45927I0t;
import X.C81667W3j;
import X.X1D;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class EditFilterState extends UiState {
    public final C145425nG cancelStatus;
    public final C45927I0t<FilterBean> curFilter;
    public final Map<EffectCategoryResponse, List<FilterBean>> data;
    public final C150545vW panelShow;
    public final AbstractC81666W3i ui;

    /* JADX WARN: Multi-variable type inference failed */
    public EditFilterState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditFilterState copy$default(EditFilterState editFilterState, C150545vW c150545vW, C45927I0t c45927I0t, C145425nG c145425nG, Map map, AbstractC81666W3i abstractC81666W3i, int i, Object obj) {
        if ((i & 1) != 0) {
            c150545vW = editFilterState.panelShow;
        }
        if ((i & 2) != 0) {
            c45927I0t = editFilterState.curFilter;
        }
        if ((i & 4) != 0) {
            c145425nG = editFilterState.cancelStatus;
        }
        if ((i & 8) != 0) {
            map = editFilterState.data;
        }
        if ((i & 16) != 0) {
            abstractC81666W3i = editFilterState.getUi();
        }
        return editFilterState.copy(c150545vW, c45927I0t, c145425nG, map, abstractC81666W3i);
    }

    public final AbstractC81666W3i component5() {
        return getUi();
    }

    public final EditFilterState copy(C150545vW c150545vW, C45927I0t<? extends FilterBean> curFilter, C145425nG c145425nG, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> data, AbstractC81666W3i ui) {
        o.LJIIIZ(curFilter, "curFilter");
        o.LJIIIZ(data, "data");
        o.LJIIIZ(ui, "ui");
        return new EditFilterState(c150545vW, curFilter, c145425nG, data, ui);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditFilterState)) {
            return false;
        }
        EditFilterState editFilterState = (EditFilterState) obj;
        return o.LJ(this.panelShow, editFilterState.panelShow) && o.LJ(this.curFilter, editFilterState.curFilter) && o.LJ(this.cancelStatus, editFilterState.cancelStatus) && o.LJ(this.data, editFilterState.data) && o.LJ(getUi(), editFilterState.getUi());
    }

    public int hashCode() {
        C150545vW c150545vW = this.panelShow;
        int hashCode = (c150545vW != null ? c150545vW.hashCode() : 0) * 31;
        C45927I0t<FilterBean> c45927I0t = this.curFilter;
        int hashCode2 = (hashCode + (c45927I0t != null ? c45927I0t.hashCode() : 0)) * 31;
        C145425nG c145425nG = this.cancelStatus;
        int hashCode3 = (hashCode2 + (c145425nG != null ? c145425nG.hashCode() : 0)) * 31;
        Map<EffectCategoryResponse, List<FilterBean>> map = this.data;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        AbstractC81666W3i ui = getUi();
        return hashCode4 + (ui != null ? ui.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditFilterState(panelShow=");
        LIZ.append(this.panelShow);
        LIZ.append(", curFilter=");
        LIZ.append(this.curFilter);
        LIZ.append(", cancelStatus=");
        LIZ.append(this.cancelStatus);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(", ui=");
        LIZ.append(getUi());
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public final C145425nG getCancelStatus() {
        return this.cancelStatus;
    }

    public final C45927I0t<FilterBean> getCurFilter() {
        return this.curFilter;
    }

    public final Map<EffectCategoryResponse, List<FilterBean>> getData() {
        return this.data;
    }

    public final C150545vW getPanelShow() {
        return this.panelShow;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EditFilterState(C150545vW c150545vW, C45927I0t<? extends FilterBean> curFilter, C145425nG c145425nG, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> data, AbstractC81666W3i ui) {
        super(ui);
        o.LJIIIZ(curFilter, "curFilter");
        o.LJIIIZ(data, "data");
        o.LJIIIZ(ui, "ui");
        this.panelShow = c150545vW;
        this.curFilter = curFilter;
        this.cancelStatus = c145425nG;
        this.data = data;
        this.ui = ui;
    }

    public /* synthetic */ EditFilterState(C150545vW c150545vW, C45927I0t c45927I0t, C145425nG c145425nG, Map map, AbstractC81666W3i abstractC81666W3i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c150545vW, (i & 2) != 0 ? new C45927I0t(null) : c45927I0t, (i & 4) == 0 ? c145425nG : null, (i & 8) != 0 ? C113554cx.LJJJLIIL() : map, (i & 16) != 0 ? new C81667W3j() : abstractC81666W3i);
    }
}
