package X;

import Y.AfS57S0100000_5;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.ClQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32264ClQ extends AbstractC78171Um7 {
    public final C78160Ulw LIZ;
    public final C32449CoP LIZIZ;
    public final C73318Sq2 LIZJ;

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("#onLoaded ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
        this.LIZJ.LIZ(AbstractC73672Svk.LJJIJIIJI(1L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJJZI(new AfS57S0100000_5(this, 25)));
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZIZ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("#onPrepared ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZJ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("#onStop ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
        this.LIZJ.LIZLLL();
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZLLL(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("#onLoad ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LJ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("#onPrepare ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LJIIIIZZ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("#onFirstFrame ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
    }

    public C32264ClQ(C78160Ulw c78160Ulw, C32449CoP request) {
        o.LJIIIZ(request, "request");
        this.LIZ = c78160Ulw;
        this.LIZIZ = request;
        this.LIZJ = new C73318Sq2();
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LJFF(EnumC78220Umu engine, C78163Ulz error) {
        o.LJIIIZ(engine, "engine");
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("#onError ");
        LIZ.append(error);
        LIZ.append(' ');
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
        this.LIZJ.LIZLLL();
    }

    @Override // X.InterfaceC78206Umg
    public final void LJII(EnumC78220Umu engine, C78165Um1 c78165Um1) {
        o.LJIIIZ(engine, "engine");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("#onComplete ");
        LIZ.append(engine);
        C32444CoK.LIZLLL(null, X1D.LIZIZ(LIZ));
        this.LIZJ.LIZLLL();
    }
}
