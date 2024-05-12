package X;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.C8o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30842C8o implements InterfaceC30839C8l {
    public final /* synthetic */ InterfaceC30844C8q LIZ;
    public final /* synthetic */ C30841C8n LIZIZ;

    @Override // X.InterfaceC30839C8l
    public final void LIZ() {
        this.LIZ.LIZIZ(this.LIZIZ.LJLJJI);
        C30841C8n c30841C8n = this.LIZIZ;
        c30841C8n.getClass();
        ((CopyOnWriteArrayList) c30841C8n.LJLJI).remove(this);
    }

    @Override // X.InterfaceC30839C8l
    public final void LIZIZ(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LIZ.LIZ(e);
        C30841C8n c30841C8n = this.LIZIZ;
        c30841C8n.getClass();
        ((CopyOnWriteArrayList) c30841C8n.LJLJI).remove(this);
    }

    public C30842C8o(InterfaceC30844C8q interfaceC30844C8q, C30841C8n c30841C8n) {
        this.LIZ = interfaceC30844C8q;
        this.LIZIZ = c30841C8n;
    }
}
