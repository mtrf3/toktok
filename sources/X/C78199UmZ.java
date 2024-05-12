package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UmZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78199UmZ implements InterfaceC78206Umg, InterfaceC78188UmO {
    public final InterfaceC78206Umg LIZ;
    public final InterfaceC78188UmO LIZIZ;

    @Override // X.InterfaceC78206Umg
    public final void LIZ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LifeCycle#onLoaded ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
        InterfaceC78206Umg interfaceC78206Umg = this.LIZ;
        if (interfaceC78206Umg != null) {
            interfaceC78206Umg.LIZ(engine);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LIZIZ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LifeCycle#onPrepared ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
        InterfaceC78206Umg interfaceC78206Umg = this.LIZ;
        if (interfaceC78206Umg != null) {
            interfaceC78206Umg.LIZIZ(engine);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LIZJ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LifeCycle#onStop ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
        InterfaceC78206Umg interfaceC78206Umg = this.LIZ;
        if (interfaceC78206Umg != null) {
            interfaceC78206Umg.LIZJ(engine);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LIZLLL(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LifeCycle#onLoad ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
        InterfaceC78206Umg interfaceC78206Umg = this.LIZ;
        if (interfaceC78206Umg != null) {
            interfaceC78206Umg.LIZLLL(engine);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LJ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LifeCycle#onPrepare ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
        InterfaceC78206Umg interfaceC78206Umg = this.LIZ;
        if (interfaceC78206Umg != null) {
            interfaceC78206Umg.LJ(engine);
        }
    }

    @Override // X.InterfaceC78188UmO
    public final void LJI(C78166Um2 c78166Um2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LifeCycle#onDowngrade ");
        LIZ.append(c78166Um2);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
        InterfaceC78188UmO interfaceC78188UmO = this.LIZIZ;
        if (interfaceC78188UmO != null) {
            interfaceC78188UmO.LJI(c78166Um2);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LJIIIIZZ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LifeCycle#onFirstFrame ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
        InterfaceC78206Umg interfaceC78206Umg = this.LIZ;
        if (interfaceC78206Umg != null) {
            interfaceC78206Umg.LJIIIIZZ(engine);
        }
    }

    public C78199UmZ(C32263ClP c32263ClP, C32263ClP c32263ClP2) {
        this.LIZ = c32263ClP;
        this.LIZIZ = c32263ClP2;
    }

    @Override // X.InterfaceC78206Umg
    public final void LJFF(EnumC78220Umu engine, C78163Ulz error) {
        o.LJIIIZ(engine, "engine");
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LifeCycle#onError ");
        LIZ.append(engine);
        LIZ.append(", ");
        LIZ.append(error);
        C32444CoK.LIZIZ(null, X1D.LIZIZ(LIZ));
        InterfaceC78206Umg interfaceC78206Umg = this.LIZ;
        if (interfaceC78206Umg != null) {
            interfaceC78206Umg.LJFF(engine, error);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LJII(EnumC78220Umu engine, C78165Um1 c78165Um1) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LifeCycle#onComplete ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
        InterfaceC78206Umg interfaceC78206Umg = this.LIZ;
        if (interfaceC78206Umg != null) {
            interfaceC78206Umg.LJII(engine, c78165Um1);
        }
    }
}
