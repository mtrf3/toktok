package X;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Objects;

/* renamed from: X.2vb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74152vb {
    public final int LIZ = 5;
    public final List<Bitmap> LIZIZ = null;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LIZ), 1, null, this.LIZIZ, Boolean.FALSE, -1);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectInfo{action=");
        C15890jp.LIZIZ(LIZ, this.LIZ, ", effectType=", 1, ", effectValue=");
        LIZ.append((Object) null);
        LIZ.append(", lutBitmap=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isUseEffect=");
        LIZ.append(false);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C74152vb.class != obj.getClass()) {
            return false;
        }
        C74152vb c74152vb = (C74152vb) obj;
        if (this.LIZ == c74152vb.LIZ && Objects.equals(this.LIZIZ, c74152vb.LIZIZ)) {
            return true;
        }
        return false;
    }
}
