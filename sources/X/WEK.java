package X;

import java.io.File;

/* loaded from: classes15.dex */
public final class WEK {
    public final File LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public WEK(File file) {
        this.LIZ = file;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof WEK)) {
            return false;
        }
        return this.LIZ.equals(((WEK) obj).LIZ);
    }
}
