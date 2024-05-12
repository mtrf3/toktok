package X;

import X.InterfaceC191727fk;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.aPn, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93371aPn<T extends InterfaceC191727fk> implements M36<T> {
    public final Context LIZ;
    public final C68824Qzk LIZIZ;
    public final C93364aPg<T> LIZJ;

    @Override // X.M36
    public final void LIZ() {
        this.LIZJ.LIZJ();
    }

    @Override // X.M36
    public final java.util.Set<InterfaceC199697sb<T>> LJFF() {
        C93364aPg<T> c93364aPg = this.LIZJ;
        ((HashSet) c93364aPg.LJIIIZ).clear();
        InterfaceC93367aPj<T> interfaceC93367aPj = c93364aPg.LJ;
        interfaceC93367aPj.lock();
        try {
            for (InterfaceC199697sb<T> interfaceC199697sb : interfaceC93367aPj.LJFF(c93364aPg.LJI.LIZJ().zoom)) {
                ((HashSet) c93364aPg.LJIIIZ).add(new C93368aPk(interfaceC199697sb.getPosition(), interfaceC199697sb.getItems()));
            }
            interfaceC93367aPj.unlock();
            java.util.Set<InterfaceC199697sb<T>> set = c93364aPg.LJIIIZ;
            o.LJIIIIZZ(set, "clusterManager.currentMapClusters");
            return set;
        } catch (Throwable th) {
            interfaceC93367aPj.unlock();
            throw th;
        }
    }

    @Override // X.M36
    public final void LJIIIIZZ() {
        this.LIZJ.LJ();
    }

    @Override // X.M36
    public final void clearData() {
        InterfaceC93367aPj<T> interfaceC93367aPj = this.LIZJ.LJ;
        interfaceC93367aPj.lock();
        try {
            interfaceC93367aPj.LIZLLL();
        } finally {
            interfaceC93367aPj.unlock();
        }
    }

    @Override // X.M36
    public final Collection<T> getData() {
        InterfaceC93367aPj<T> interfaceC93367aPj = this.LIZJ.LJ;
        interfaceC93367aPj.lock();
        try {
            return interfaceC93367aPj.getItems();
        } finally {
            interfaceC93367aPj.unlock();
        }
    }

    @Override // X.M36
    public final void LIZIZ(M3M listener) {
        o.LJIIIZ(listener, "listener");
        C93364aPg<T> c93364aPg = this.LIZJ;
        C93370aPm c93370aPm = new C93370aPm(listener);
        c93364aPg.LJIIJJI = c93370aPm;
        c93364aPg.LJFF.LJII(c93370aPm);
    }

    @Override // X.M36
    public final void LIZLLL(C199647sW c199647sW) {
        C93399aQF c93399aQF = new C93399aQF(this.LIZ, this.LIZIZ, this.LIZJ, c199647sW);
        C93364aPg<T> c93364aPg = this.LIZJ;
        c93364aPg.LJFF.LJ(null);
        c93364aPg.LJFF.LJII(null);
        c93364aPg.LIZJ.LIZ();
        c93364aPg.LIZIZ.LIZ();
        ((ArrayList) c93364aPg.LIZLLL).clear();
        c93364aPg.LJFF.LIZIZ();
        c93364aPg.LJFF = c93399aQF;
        c93399aQF.LIZ();
        c93364aPg.LJFF.LJ(c93364aPg.LJIIL);
        c93364aPg.LJFF.LIZLLL();
        c93364aPg.LJFF.LJFF();
        c93364aPg.LJFF.LJII(c93364aPg.LJIIJJI);
        c93364aPg.LJFF.LJIIIIZZ();
        c93364aPg.LJFF.LJI();
        c93364aPg.LJ();
    }

    @Override // X.M36
    public final void LJ(C73312Spw listener) {
        o.LJIIIZ(listener, "listener");
        C93364aPg<T> c93364aPg = this.LIZJ;
        InterfaceC93367aPj<T> interfaceC93367aPj = c93364aPg.LJ;
        o.LJIIIIZZ(interfaceC93367aPj, "clusterManager.algorithm");
        C93398aQE c93398aQE = new C93398aQE(interfaceC93367aPj, listener);
        c93398aQE.lock();
        try {
            InterfaceC93367aPj<T> interfaceC93367aPj2 = c93364aPg.LJ;
            c93364aPg.LJ = c93398aQE;
            if (interfaceC93367aPj2 != null) {
                interfaceC93367aPj2.lock();
                try {
                    c93398aQE.LIZIZ(interfaceC93367aPj2.getItems());
                    interfaceC93367aPj2.unlock();
                } catch (Throwable th) {
                    interfaceC93367aPj2.unlock();
                    throw th;
                }
            }
            c93398aQE.unlock();
            c93364aPg.LJ.LJ();
            c93364aPg.LJ();
        } catch (Throwable th2) {
            c93398aQE.unlock();
            throw th2;
        }
    }

    @Override // X.M36
    public final void LJI(C199827so listener) {
        o.LJIIIZ(listener, "listener");
        C93364aPg<T> c93364aPg = this.LIZJ;
        C93369aPl c93369aPl = new C93369aPl(listener);
        c93364aPg.LJIIL = c93369aPl;
        c93364aPg.LJFF.LJ(c93369aPl);
    }

    @Override // X.M36
    public final boolean LJII(Collection<? extends T> list) {
        o.LJIIIZ(list, "list");
        InterfaceC93367aPj<T> interfaceC93367aPj = this.LIZJ.LJ;
        interfaceC93367aPj.lock();
        try {
            return interfaceC93367aPj.LIZIZ(list);
        } finally {
            interfaceC93367aPj.unlock();
        }
    }

    public C93371aPn(Context context, C68824Qzk map) {
        o.LJIIIZ(map, "map");
        this.LIZ = context;
        this.LIZIZ = map;
        this.LIZJ = new C93364aPg<>(context, map);
    }

    @Override // X.M36
    public final boolean LIZJ(C191707fi c191707fi, C191707fi c191707fi2) {
        InterfaceC93367aPj<T> interfaceC93367aPj = this.LIZJ.LJ;
        interfaceC93367aPj.lock();
        try {
            return interfaceC93367aPj.LJI(c191707fi, c191707fi2);
        } finally {
            interfaceC93367aPj.unlock();
        }
    }
}
