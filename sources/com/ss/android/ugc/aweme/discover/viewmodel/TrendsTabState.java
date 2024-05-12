package com.ss.android.ugc.aweme.discover.viewmodel;

import X.C48339Iy7;
import X.C70839Rr9;
import X.C79062V1e;
import X.X1D;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TrendsTabState implements ICommonListState<DiscoverSectionItem> {
    public final boolean cacheThenFetch;
    public final boolean canScrollVertically;
    public final String categoryIdBeingViewed;
    public final boolean isTabHidden;
    public final ListState substate;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TrendsTabState() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r1
            r4 = r2
            r5 = r1
            r7 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabState.<init>():void");
    }

    public static /* synthetic */ TrendsTabState copy$default(TrendsTabState trendsTabState, boolean z, ListState listState, boolean z2, String str, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = trendsTabState.cacheThenFetch;
        }
        if ((i & 2) != 0) {
            listState = trendsTabState.getSubstate();
        }
        if ((i & 4) != 0) {
            z2 = trendsTabState.isTabHidden;
        }
        if ((i & 8) != 0) {
            str = trendsTabState.categoryIdBeingViewed;
        }
        if ((i & 16) != 0) {
            z3 = trendsTabState.canScrollVertically;
        }
        return trendsTabState.copy(z, listState, z2, str, z3);
    }

    public final ListState component2() {
        return getSubstate();
    }

    public final TrendsTabState copy(boolean z, ListState substate, boolean z2, String categoryIdBeingViewed, boolean z3) {
        o.LJIIIZ(substate, "substate");
        o.LJIIIZ(categoryIdBeingViewed, "categoryIdBeingViewed");
        return new TrendsTabState(z, substate, z2, categoryIdBeingViewed, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendsTabState)) {
            return false;
        }
        TrendsTabState trendsTabState = (TrendsTabState) obj;
        return this.cacheThenFetch == trendsTabState.cacheThenFetch && o.LJ(getSubstate(), trendsTabState.getSubstate()) && this.isTabHidden == trendsTabState.isTabHidden && o.LJ(this.categoryIdBeingViewed, trendsTabState.categoryIdBeingViewed) && this.canScrollVertically == trendsTabState.canScrollVertically;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean z = this.cacheThenFetch;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int hashCode = (getSubstate().hashCode() + (i2 * 31)) * 31;
        boolean z2 = this.isTabHidden;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int LJ = C79062V1e.LJ(this.categoryIdBeingViewed, (hashCode + i3) * 31, 31);
        if (!this.canScrollVertically) {
            i = 0;
        }
        return LJ + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrendsTabState(cacheThenFetch=");
        LIZ.append(this.cacheThenFetch);
        LIZ.append(", substate=");
        LIZ.append(getSubstate());
        LIZ.append(", isTabHidden=");
        LIZ.append(this.isTabHidden);
        LIZ.append(", categoryIdBeingViewed=");
        LIZ.append(this.categoryIdBeingViewed);
        LIZ.append(", canScrollVertically=");
        return C48339Iy7.LIZJ(LIZ, this.canScrollVertically, ')', LIZ);
    }

    public final boolean getCacheThenFetch() {
        return this.cacheThenFetch;
    }

    public final boolean getCanScrollVertically() {
        return this.canScrollVertically;
    }

    public final String getCategoryIdBeingViewed() {
        return this.categoryIdBeingViewed;
    }

    public final boolean isTabHidden() {
        return this.isTabHidden;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public ListState getSubstate() {
        return this.substate;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public NestedState<ListState> newSubstate(ListState sub) {
        o.LJIIIZ(sub, "sub");
        return copy$default(this, false, sub, false, null, false, 29, null);
    }

    public TrendsTabState(boolean z, ListState substate, boolean z2, String categoryIdBeingViewed, boolean z3) {
        o.LJIIIZ(substate, "substate");
        o.LJIIIZ(categoryIdBeingViewed, "categoryIdBeingViewed");
        this.cacheThenFetch = z;
        this.substate = substate;
        this.isTabHidden = z2;
        this.categoryIdBeingViewed = categoryIdBeingViewed;
        this.canScrollVertically = z3;
    }

    public /* synthetic */ TrendsTabState(boolean z, ListState listState, boolean z2, String str, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ListState(new C70839Rr9(2), null, null, null, null, 30, null) : listState, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? "" : str, (i & 16) == 0 ? z3 : false);
    }
}
