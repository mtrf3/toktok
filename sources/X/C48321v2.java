package X;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: X.1v2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C48321v2 extends C41371jp {
    @Override // X.C0PE
    public final C0PI LIZ() {
        return C0PI.LIZJ(null, this.LIZLLL.consumeDisplayCutout());
    }

    @Override // X.C0PE
    public final C06910Ox LJ() {
        DisplayCutout displayCutout = this.LIZLLL.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C06910Ox(displayCutout);
    }

    @Override // X.C0PE
    public final int hashCode() {
        return this.LIZLLL.hashCode();
    }

    @Override // X.C30651If, X.C0PE
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48321v2)) {
            return false;
        }
        C30651If c30651If = (C30651If) obj;
        if (Objects.equals(this.LIZLLL, c30651If.LIZLLL) && Objects.equals(this.LJII, c30651If.LJII)) {
            return true;
        }
        return false;
    }

    public C48321v2(C0PI c0pi, WindowInsets windowInsets) {
        super(c0pi, windowInsets);
    }
}
