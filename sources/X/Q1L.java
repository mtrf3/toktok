package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1L implements InterfaceC66326Q1i<String, List<? extends String>> {
    public final /* synthetic */ Q1Y LIZ;

    public Q1L(Q1Y q1y) {
        this.LIZ = q1y;
    }

    @Override // X.InterfaceC66326Q1i
    public final void LIZ(String str, List<? extends String> value) {
        String key = str;
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        C66225Pyv c66225Pyv = Q1A.LJII;
        if (c66225Pyv != null) {
            c66225Pyv.LIZ(this.LIZ.LIZIZ).LIZIZ(key);
        }
        C66225Pyv c66225Pyv2 = Q1A.LJII;
        if (c66225Pyv2 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ.LIZIZ);
            LIZ.append("_data");
            c66225Pyv2.LIZ(X1D.LIZIZ(LIZ)).LIZIZ(key);
        }
    }
}
