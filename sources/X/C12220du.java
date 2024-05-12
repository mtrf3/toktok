package X;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: X.0du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12220du {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final int hashCode() {
        return Objects.hash(this.LIZ, Integer.valueOf(this.LIZJ));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12220du)) {
            return false;
        }
        C12220du c12220du = (C12220du) obj;
        if (this.LIZIZ < 0 || c12220du.LIZIZ < 0) {
            if (TextUtils.equals(this.LIZ, c12220du.LIZ) && this.LIZJ == c12220du.LIZJ) {
                return true;
            }
            return false;
        }
        if (TextUtils.equals(this.LIZ, c12220du.LIZ) && this.LIZIZ == c12220du.LIZIZ && this.LIZJ == c12220du.LIZJ) {
            return true;
        }
        return false;
    }

    public C12220du(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
