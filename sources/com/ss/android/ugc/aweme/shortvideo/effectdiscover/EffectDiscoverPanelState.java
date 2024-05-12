package com.ss.android.ugc.aweme.shortvideo.effectdiscover;

import X.AbstractC81666W3i;
import X.C79062V1e;
import X.C81667W3j;
import X.TFX;
import X.TFZ;
import X.X1D;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EffectDiscoverPanelState extends UiState {
    public final boolean emptySearchString;
    public final String searchKeyWord;
    public final TFX searchState;
    public final AbstractC81666W3i ui;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectDiscoverPanelState() {
        this(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EffectDiscoverPanelState copy$default(EffectDiscoverPanelState effectDiscoverPanelState, TFX tfx, boolean z, String str, AbstractC81666W3i abstractC81666W3i, int i, Object obj) {
        if ((i & 1) != 0) {
            tfx = effectDiscoverPanelState.searchState;
        }
        if ((i & 2) != 0) {
            z = effectDiscoverPanelState.emptySearchString;
        }
        if ((i & 4) != 0) {
            str = effectDiscoverPanelState.searchKeyWord;
        }
        if ((i & 8) != 0) {
            abstractC81666W3i = effectDiscoverPanelState.getUi();
        }
        return effectDiscoverPanelState.copy(tfx, z, str, abstractC81666W3i);
    }

    public final AbstractC81666W3i component4() {
        return getUi();
    }

    public final EffectDiscoverPanelState copy(TFX searchState, boolean z, String searchKeyWord, AbstractC81666W3i ui) {
        o.LJIIIZ(searchState, "searchState");
        o.LJIIIZ(searchKeyWord, "searchKeyWord");
        o.LJIIIZ(ui, "ui");
        return new EffectDiscoverPanelState(searchState, z, searchKeyWord, ui);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectDiscoverPanelState)) {
            return false;
        }
        EffectDiscoverPanelState effectDiscoverPanelState = (EffectDiscoverPanelState) obj;
        return o.LJ(this.searchState, effectDiscoverPanelState.searchState) && this.emptySearchString == effectDiscoverPanelState.emptySearchString && o.LJ(this.searchKeyWord, effectDiscoverPanelState.searchKeyWord) && o.LJ(getUi(), effectDiscoverPanelState.getUi());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectDiscoverPanelState(searchState=");
        LIZ.append(this.searchState);
        LIZ.append(", emptySearchString=");
        LIZ.append(this.emptySearchString);
        LIZ.append(", searchKeyWord=");
        LIZ.append(this.searchKeyWord);
        LIZ.append(", ui=");
        LIZ.append(getUi());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.searchState.hashCode() * 31;
        boolean z = this.emptySearchString;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return getUi().hashCode() + C79062V1e.LJ(this.searchKeyWord, (hashCode + i) * 31, 31);
    }

    public final boolean getEmptySearchString() {
        return this.emptySearchString;
    }

    public final String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public final TFX getSearchState() {
        return this.searchState;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectDiscoverPanelState(TFX searchState, boolean z, String searchKeyWord, AbstractC81666W3i ui) {
        super(ui);
        o.LJIIIZ(searchState, "searchState");
        o.LJIIIZ(searchKeyWord, "searchKeyWord");
        o.LJIIIZ(ui, "ui");
        this.searchState = searchState;
        this.emptySearchString = z;
        this.searchKeyWord = searchKeyWord;
        this.ui = ui;
    }

    public /* synthetic */ EffectDiscoverPanelState(TFX tfx, boolean z, String str, AbstractC81666W3i abstractC81666W3i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TFZ.LIZ : tfx, (i & 2) != 0 ? true : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? new C81667W3j() : abstractC81666W3i);
    }
}
