package X;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: X.223, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass223 extends C43271mt {
    @Override // X.C16770lF
    public C16800lI LIZ() {
        return C16800lI.LJIIJ(null, this.LIZJ.consumeDisplayCutout());
    }

    @Override // X.C16770lF
    public C16210kL LJFF() {
        DisplayCutout displayCutout = this.LIZJ.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C16210kL(displayCutout);
    }

    @Override // X.C16770lF
    public int hashCode() {
        return this.LIZJ.hashCode();
    }

    @Override // X.C1V3, X.C16770lF
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass223)) {
            return false;
        }
        C1V3 c1v3 = (C1V3) obj;
        if (Objects.equals(this.LIZJ, c1v3.LIZJ) && Objects.equals(this.LJI, c1v3.LJI)) {
            return true;
        }
        return false;
    }

    public AnonymousClass223(C16800lI c16800lI, AnonymousClass223 anonymousClass223) {
        super(c16800lI, anonymousClass223);
    }

    public AnonymousClass223(C16800lI c16800lI, WindowInsets windowInsets) {
        super(c16800lI, windowInsets);
    }
}
