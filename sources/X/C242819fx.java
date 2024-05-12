package X;

import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242819fx implements InterfaceC208718Hb<C242819fx, PoiDiscoveryApi.PoiDiscoveryCard> {
    public final C8HZ<PoiDiscoveryApi.PoiDiscoveryCard> LJLIL;

    public C242819fx() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<PoiDiscoveryApi.PoiDiscoveryCard> getListItemState() {
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
        LIZ.append("PoiDetailDiscoveryCategoryVMState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<PoiDiscoveryApi.PoiDiscoveryCard> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C242819fx(int i) {
        this((C8HZ<PoiDiscoveryApi.PoiDiscoveryCard>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C242819fx) && o.LJ(this.LJLIL, ((C242819fx) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C242819fx(C8HZ<PoiDiscoveryApi.PoiDiscoveryCard> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}
