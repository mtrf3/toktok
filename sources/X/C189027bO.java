package X;

import com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7bO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189027bO implements InterfaceC208718Hb<C189027bO, C188457aT> {
    public final PoiDetailVideoListModel LJLIL;
    public final C8HZ<C188457aT> LJLILLLLZI;

    public C189027bO() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        PoiDetailVideoListModel poiDetailVideoListModel = this.LJLIL;
        if (poiDetailVideoListModel == null) {
            hashCode = 0;
        } else {
            hashCode = poiDetailVideoListModel.hashCode();
        }
        return this.LJLILLLLZI.hashCode() + (hashCode * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C188457aT> getListItemState() {
        return C208708Ha.LIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadLatestState() {
        return C208708Ha.LIZIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadMoreState() {
        return C208708Ha.LIZJ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getRefreshState() {
        return C208708Ha.LIZLLL(this);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiVideoListItemState(videoList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C188457aT> getListState() {
        return this.LJLILLLLZI;
    }

    public /* synthetic */ C189027bO(int i) {
        this(null, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C189027bO)) {
            return false;
        }
        C189027bO c189027bO = (C189027bO) obj;
        if (o.LJ(this.LJLIL, c189027bO.LJLIL) && o.LJ(this.LJLILLLLZI, c189027bO.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C189027bO(PoiDetailVideoListModel poiDetailVideoListModel, C8HZ<C188457aT> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = poiDetailVideoListModel;
        this.LJLILLLLZI = listState;
    }
}
