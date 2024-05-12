package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uma, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78200Uma implements InterfaceC78206Umg {
    public final List<InterfaceC78206Umg> LIZ;

    public C78200Uma(List<InterfaceC78206Umg> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC78206Umg
    public final void LIZ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        Iterator<InterfaceC78206Umg> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(engine);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LIZIZ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        Iterator<InterfaceC78206Umg> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(engine);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LIZJ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        Iterator<InterfaceC78206Umg> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(engine);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LIZLLL(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        Iterator<InterfaceC78206Umg> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(engine);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LJ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        Iterator<InterfaceC78206Umg> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJ(engine);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LJIIIIZZ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        Iterator<InterfaceC78206Umg> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIIIZZ(engine);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LJFF(EnumC78220Umu engine, C78163Ulz error) {
        o.LJIIIZ(engine, "engine");
        o.LJIIIZ(error, "error");
        Iterator<InterfaceC78206Umg> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJFF(engine, error);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LJII(EnumC78220Umu engine, C78165Um1 c78165Um1) {
        o.LJIIIZ(engine, "engine");
        Iterator<InterfaceC78206Umg> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJII(engine, c78165Um1);
        }
    }
}
