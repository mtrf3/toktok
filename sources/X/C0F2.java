package X;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.0F2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0F2 {
    public final String LIZ;
    public final LocusId LIZIZ;

    public final int hashCode() {
        int hashCode;
        String str = this.LIZ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocusIdCompat[");
        int length = this.LIZ.length();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(length);
        LIZ2.append("_chars");
        LIZ.append(X1D.LIZIZ(LIZ2));
        LIZ.append("]");
        return X1D.LIZIZ(LIZ);
    }

    public C0F2(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LIZ = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.LIZIZ = new LocusId(str);
                return;
            } else {
                this.LIZIZ = null;
                return;
            }
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0F2.class != obj.getClass()) {
            return false;
        }
        C0F2 c0f2 = (C0F2) obj;
        String str = this.LIZ;
        if (str == null) {
            if (c0f2.LIZ == null) {
                return true;
            }
            return false;
        }
        return str.equals(c0f2.LIZ);
    }
}
