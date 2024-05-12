package X;

import X.InterfaceC191727fk;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.aQE, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93398aQE<T extends InterfaceC191727fk> extends AbstractC93365aPh<T> implements InterfaceC93367aPj<T> {
    public final InterfaceC93348aPQ<T> LIZIZ;
    public final InterfaceC199817sn<T> LIZJ;

    @Override // X.InterfaceC93367aPj
    public final void LIZ() {
    }

    @Override // X.InterfaceC93367aPj
    public final void LJ() {
    }

    @Override // X.InterfaceC93348aPQ
    public final int LIZJ() {
        return this.LIZIZ.LIZJ();
    }

    @Override // X.InterfaceC93348aPQ
    public final void LIZLLL() {
        this.LIZIZ.LIZLLL();
    }

    @Override // X.InterfaceC93348aPQ
    public final Collection<T> getItems() {
        Collection<T> items = this.LIZIZ.getItems();
        o.LJIIIIZZ(items, "algorithm.items");
        return items;
    }

    @Override // X.InterfaceC93348aPQ
    public final boolean LIZIZ(Collection<? extends T> collection) {
        return this.LIZIZ.LIZIZ(collection);
    }

    @Override // X.InterfaceC93348aPQ
    public final java.util.Set<InterfaceC199697sb<T>> LJFF(float f) {
        java.util.Set<? extends InterfaceC199697sb<T>> LJFF = this.LIZIZ.LJFF(f);
        if (LJFF != null) {
            return this.LIZJ.LIZ(LJFF);
        }
        return null;
    }

    public C93398aQE(InterfaceC93367aPj interfaceC93367aPj, C73312Spw listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZIZ = interfaceC93367aPj;
        this.LIZJ = listener;
    }

    @Override // X.InterfaceC93348aPQ
    public final boolean LJI(C191707fi c191707fi, C191707fi c191707fi2) {
        return this.LIZIZ.LJI(c191707fi, c191707fi2);
    }
}
