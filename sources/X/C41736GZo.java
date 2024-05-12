package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GZo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41736GZo extends AbstractC41873Gc1 {
    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
    }

    @Override // X.AbstractC41873Gc1
    public final void LJ(Object sourceTag, ERR args) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(args, "args");
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
    }

    public C41736GZo() {
        super(H1U.COMPILE, 2);
    }

    @Override // X.AbstractC41873Gc1, X.InterfaceC36938Eec
    public void onEvent(AbstractC41872Gc0 event) {
        o.LJIIIZ(event, "event");
        super.onEvent(event);
        if (event.LIZ == H1U.COMPILE) {
            if ((event instanceof C41852Gbg) || (event instanceof C41851Gbf)) {
                C43045Guv.LIZLLL(C41332GKa.LJLIL, 0L);
            }
        }
    }
}
