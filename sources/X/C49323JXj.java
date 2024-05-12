package X;

import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData;
import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.JXj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49323JXj implements IEvent {
    public final SearchHorizontalData LJLIL;
    public final C50062Jko LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49323JXj)) {
            return false;
        }
        C49323JXj c49323JXj = (C49323JXj) obj;
        return o.LJ(this.LJLIL, c49323JXj.LJLIL) && o.LJ(this.LJLILLLLZI, c49323JXj.LJLILLLLZI) && this.LJLJI == c49323JXj.LJLJI && o.LJ(this.LJLJJI, c49323JXj.LJLJJI);
    }

    public final int hashCode() {
        SearchHorizontalData searchHorizontalData = this.LJLIL;
        int hashCode = (searchHorizontalData == null ? 0 : searchHorizontalData.hashCode()) * 31;
        C50062Jko c50062Jko = this.LJLILLLLZI;
        return this.LJLJJI.hashCode() + ((((hashCode + (c50062Jko != null ? c50062Jko.hashCode() : 0)) * 31) + this.LJLJI) * 31);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TransferSearchHorizontalEvent(searchHorizontalData=");
        LIZ.append(this.LJLIL);
        LIZ.append(", param=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", currentSize=");
        LIZ.append(this.LJLJI);
        LIZ.append(", containerId=");
        return q.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public C49323JXj(SearchHorizontalData searchHorizontalData, C50062Jko c50062Jko, int i, String containerId) {
        o.LJIIIZ(containerId, "containerId");
        this.LJLIL = searchHorizontalData;
        this.LJLILLLLZI = c50062Jko;
        this.LJLJI = i;
        this.LJLJJI = containerId;
    }
}
