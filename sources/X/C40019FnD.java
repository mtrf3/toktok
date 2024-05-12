package X;

import com.lynx.tasm.LynxEnv;
import kotlin.jvm.internal.o;

/* renamed from: X.FnD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40019FnD extends C60379Nmp implements InterfaceC60316Nlo {
    public final InterfaceC39972FmS LJLJI;

    @Override // X.InterfaceC60316Nlo
    public final boolean LJIIZILJ() {
        return C40020FnE.LIZIZ;
    }

    public C40019FnD(InterfaceC39972FmS lynxConfig) {
        o.LJIIJ(lynxConfig, "lynxConfig");
        this.LJLJI = lynxConfig;
    }

    @Override // X.InterfaceC60316Nlo
    public final C60537NpN LJIJI(InterfaceC60323Nlv context) {
        o.LJIIJ(context, "context");
        return new C60537NpN(context, this);
    }

    @Override // X.InterfaceC60316Nlo
    public final void LJJIJIIJI(InterfaceC60323Nlv context) {
        o.LJIIJ(context, "context");
        InterfaceC39972FmS interfaceC39972FmS = this.LJLJI;
        if ((interfaceC39972FmS instanceof C39966FmM) && interfaceC39972FmS != null) {
            C39966FmM c39966FmM = (C39966FmM) interfaceC39972FmS;
            if (!C40020FnE.LIZIZ && !C40020FnE.LIZ.compareAndSet(false, true)) {
                return;
            }
            C40020FnE.LIZLLL = context;
            try {
                C40017FnB.LIZ = new C40023FnH();
                C61590OFe.LIZ(C40018FnC.LIZ);
                C40053Fnl.LIZ.getClass();
                C39957FmD.LIZ(c39966FmM, context);
                LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
                o.LJFF(LJIIIZ, "LynxEnv.inst()");
                LJIIIZ.LJIIL();
                if (LJIIIZ.LJIILIIL) {
                    C40020FnE.LIZIZ = true;
                    return;
                } else {
                    C40020FnE.LIZ.set(false);
                    throw new RuntimeException("Lynx so Init Failed");
                }
            } catch (Throwable th) {
                C40020FnE.LIZ.set(false);
                context.printReject(th, "LynxKit Init Failed");
                return;
            }
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.kit.nglynx.init.LynxConfig");
    }
}
