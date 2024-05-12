package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1bD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36031bD implements InterfaceC24390xX {
    public final InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> LJLIL;
    public final C64962gm LJLILLLLZI;
    public XKQ LJLJI;

    @Override // X.InterfaceC24390xX
    public final void LIZIZ() {
        XKQ xkq = this.LJLJI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLJI = null;
    }

    @Override // X.InterfaceC24390xX
    public final void LIZJ() {
        XKQ xkq = this.LJLJI;
        if (xkq != null) {
            xkq.LIZIZ(C62848OlY.LIZ("Old job was still running!", null));
        }
        this.LJLJI = XKX.LIZLLL(this.LJLILLLLZI, null, null, this.LJLIL, 3);
    }

    @Override // X.InterfaceC24390xX
    public final void LIZLLL() {
        XKQ xkq = this.LJLJI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLJI = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36031bD(MBA parentCoroutineContext, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> task) {
        o.LJIIIZ(parentCoroutineContext, "parentCoroutineContext");
        o.LJIIIZ(task, "task");
        this.LJLIL = task;
        this.LJLILLLLZI = C48841JEv.LIZ(parentCoroutineContext);
    }
}
