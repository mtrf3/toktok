package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CpS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32514CpS implements InterfaceC32521CpZ<AbstractC32523Cpb> {
    public final /* synthetic */ C32500CpE LIZ;

    public C32514CpS(C32500CpE c32500CpE) {
        this.LIZ = c32500CpE;
    }

    @Override // X.InterfaceC32521CpZ
    public final void LIZ(AbstractC32523Cpb abstractC32523Cpb) {
        AbstractC32523Cpb data = abstractC32523Cpb;
        o.LJIIIZ(data, "data");
        if (data instanceof C32516CpU) {
            this.LIZ.LJJIIZI(((C32516CpU) data).LIZ);
        }
    }
}
