package X;

import java.util.Arrays;

/* renamed from: X.QjX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C67819QjX implements InterfaceC67808QjM {
    public static final C67819QjX LJLJI = new C67819QjX(new C67860QkC());
    public final boolean LJLIL;
    public final String LJLILLLLZI;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.LJLIL), this.LJLILLLLZI});
    }

    public C67819QjX(C67860QkC c67860QkC) {
        this.LJLIL = c67860QkC.LIZ.booleanValue();
        this.LJLILLLLZI = c67860QkC.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C67819QjX)) {
            return false;
        }
        C67819QjX c67819QjX = (C67819QjX) obj;
        c67819QjX.getClass();
        if (C64363PNv.LIZ(null, null) && this.LJLIL == c67819QjX.LJLIL && C64363PNv.LIZ(this.LJLILLLLZI, c67819QjX.LJLILLLLZI)) {
            return true;
        }
        return false;
    }
}
