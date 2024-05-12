package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JpA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50332JpA implements KK7 {
    public final C50351JpT LJLIL;

    public C50332JpA() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50332JpA) && o.LJ(this.LJLIL, ((C50332JpA) obj).LJLIL);
    }

    public final int hashCode() {
        C50351JpT c50351JpT = this.LJLIL;
        if (c50351JpT == null) {
            return 0;
        }
        return c50351JpT.hashCode();
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateFeelgoodSurveyDataAction(data=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    static {
        C17N.LJJJJLI().If().LIZIZ(C65352Pkq.LIZ(C50332JpA.class), C50333JpB.LJLIL);
    }

    public C50332JpA(C50351JpT c50351JpT) {
        this.LJLIL = c50351JpT;
    }
}
