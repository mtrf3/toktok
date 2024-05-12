package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Bw0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30372Bw0 implements InterfaceC61107NyZ {
    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
        C0NB.LIZ("notification permissions apply onCanceled on preview page");
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        if (results.length == 0) {
            C0NB.LIZ("notification permissions apply results isEmpty on preview page");
            return;
        }
        EnumC61598OFm enumC61598OFm = ((C164906da) ORY.LJJIL(results)).LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notification permissions apply resultType(");
        LIZ.append(enumC61598OFm);
        LIZ.append(") on preview page");
        C0NB.LIZ(X1D.LIZIZ(LIZ));
    }
}
