package X;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: X.0kL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16210kL {
    public final DisplayCutout LIZ;

    public final int hashCode() {
        DisplayCutout displayCutout = this.LIZ;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisplayCutoutCompat{");
        LIZ.append(this.LIZ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public C16210kL(DisplayCutout displayCutout) {
        this.LIZ = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16210kL.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.LIZ, ((C16210kL) obj).LIZ);
    }
}
