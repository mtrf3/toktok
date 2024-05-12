package X;

import X.InterfaceC191727fk;
import android.content.Context;
import com.google.android.gms.maps.model.MarkerOptions;
import kotlin.jvm.internal.o;

/* renamed from: X.aQF, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93399aQF<T extends InterfaceC191727fk> extends C93378aPu<T> {
    public final InterfaceC199677sZ<T> LJIJI;

    @Override // X.C93378aPu
    public final boolean LJIIZILJ(InterfaceC199697sb<T> cluster) {
        o.LJIIIZ(cluster, "cluster");
        return this.LJIJI.LJFF(cluster);
    }

    @Override // X.C93378aPu
    public final void LJIIJJI(T item, MarkerOptions markerOptions) {
        o.LJIIIZ(item, "item");
        C199627sU c199627sU = new C199627sU();
        this.LJIJI.LIZJ(item, c199627sU);
        C93350aPS.LIZ(c199627sU, markerOptions);
    }

    @Override // X.C93378aPu
    public final void LJIIL(InterfaceC199697sb<T> cluster, MarkerOptions markerOptions) {
        o.LJIIIZ(cluster, "cluster");
        C199627sU c199627sU = new C199627sU();
        this.LJIJI.LIZ(cluster, c199627sU);
        C93350aPS.LIZ(c199627sU, markerOptions);
    }

    @Override // X.C93378aPu
    public final void LJIILIIL(T ClusterIndividualItem, R0A r0a) {
        o.LJIIIZ(ClusterIndividualItem, "ClusterIndividualItem");
        this.LJIJI.LIZIZ(ClusterIndividualItem, new C93392aQ8(r0a));
    }

    @Override // X.C93378aPu
    public final void LJIILJJIL(T item, R0A r0a) {
        o.LJIIIZ(item, "item");
        this.LJIJI.LJI(item, new C93392aQ8(r0a));
    }

    @Override // X.C93378aPu
    public final void LJIILL(InterfaceC199697sb<T> cluster, R0A r0a) {
        o.LJIIIZ(cluster, "cluster");
        this.LJIJI.LJ(cluster, new C93392aQ8(r0a));
    }

    @Override // X.C93378aPu
    public final void LJIILLIIL(InterfaceC199697sb<T> cluster, R0A r0a) {
        o.LJIIIZ(cluster, "cluster");
        this.LJIJI.LIZLLL(cluster, new C93392aQ8(r0a));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93399aQF(Context context, C68824Qzk map, C93364aPg clusterManager, C199647sW c199647sW) {
        super(context, map, clusterManager);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(map, "map");
        o.LJIIIZ(clusterManager, "clusterManager");
        this.LJIJI = c199647sW;
    }
}
