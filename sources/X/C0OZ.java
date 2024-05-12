package X;

import android.content.res.Resources;
import java.util.Objects;

/* renamed from: X.0OZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OZ {
    public final Resources LIZ;
    public final Resources.Theme LIZIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ, this.LIZIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0OZ.class != obj.getClass()) {
            return false;
        }
        C0OZ c0oz = (C0OZ) obj;
        if (this.LIZ.equals(c0oz.LIZ) && Objects.equals(this.LIZIZ, c0oz.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C0OZ(Resources resources, Resources.Theme theme) {
        this.LIZ = resources;
        this.LIZIZ = theme;
    }
}
