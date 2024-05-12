package X;

import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS170S0100000_4;

/* renamed from: X.Kz6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53496Kz6 extends AbstractC53588L1k<C26309AUf, C53500KzA> {
    public final C53500KzA LIZJ;

    @Override // X.AbstractC53588L1k
    public final /* bridge */ /* synthetic */ C53500KzA LJFF() {
        return this.LIZJ;
    }

    public C53496Kz6(C53500KzA c53500KzA) {
        this.LIZJ = c53500KzA;
    }

    @Override // X.AbstractC53588L1k
    public final C53469Kyf LIZ(C26309AUf c26309AUf) {
        C26309AUf c26309AUf2 = c26309AUf;
        EnumC53521KzV enumC53521KzV = c26309AUf2.LJLIL;
        if (enumC53521KzV != null) {
            int i = C53499Kz9.LIZ[enumC53521KzV.ordinal()];
            int i2 = 0;
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return new C53469Kyf(new C53461KyX(new C53513KzN(C53479Kyp.LIZ, new C53455KyR(i2), null, false, C57572Nt.LJLIL, C53497Kz7.LJLIL, new AqS170S0100000_4(c26309AUf2, 1428), true, true, C57992Pj.LJLIL, "text", 1036)));
                }
            } else {
                return new C53469Kyf(new C53461KyX(new C53513KzN(C53479Kyp.LIZ, new C53455KyR(i2), null, false, C142475iV.LJLIL, C53498Kz8.LJLIL, new AqS140S0200000_9(this, c26309AUf2.LJLIL, 92), true, true, C58002Pk.LJLIL, "icon", 1036)));
            }
        }
        return null;
    }
}
