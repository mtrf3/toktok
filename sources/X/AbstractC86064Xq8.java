package X;

import X.AbstractC86064Xq8;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xq8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86064Xq8<EVENT extends AbstractC86064Xq8<EVENT>> {
    public final String LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(X1U.LJLIL);
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    public void LIZIZ() {
        String str = this.LIZJ;
        if (str != null) {
            LIZ("enter_from", str);
        }
        String str2 = this.LJ;
        if (str2 != null) {
            LIZ("enter_method", str2);
        }
        String str3 = this.LIZLLL;
        if (str3 != null) {
            LIZ("tab_name", str3);
        }
    }

    public final void LIZJ() {
        LIZIZ();
        FMX.LJIIL(this.LIZ, (HashMap) this.LIZIZ.getValue());
    }

    public AbstractC86064Xq8(String str) {
        this.LIZ = str;
    }

    public final void LIZ(String str, String str2) {
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        HashMap hashMap = (HashMap) this.LIZIZ.getValue();
        String LIZ = c1799074g.LIZ(str2);
        o.LJIIIIZZ(LIZ, "rule.normalize(value)");
        hashMap.put(str, LIZ);
    }
}
