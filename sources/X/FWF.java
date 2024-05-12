package X;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public final class FWF {
    public final String LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FWF) {
            return TextUtils.equals(((FWF) obj).LIZ, this.LIZ);
        }
        return false;
    }

    public FWF(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
