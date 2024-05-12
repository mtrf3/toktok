package X;

import android.os.Bundle;

/* renamed from: X.Zfs, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90524Zfs {
    public final Bundle LIZ;
    public C90101ZXt LIZIZ;

    public final void LIZ() {
        if (this.LIZIZ == null) {
            C90101ZXt LIZIZ = C90101ZXt.LIZIZ(this.LIZ.getBundle("selector"));
            this.LIZIZ = LIZIZ;
            if (LIZIZ == null) {
                this.LIZIZ = C90101ZXt.LIZJ;
            }
        }
    }

    public final boolean LIZIZ() {
        return this.LIZ.getBoolean("activeScan");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        LIZ();
        sb.append(this.LIZIZ);
        sb.append(", activeScan=");
        sb.append(LIZIZ());
        sb.append(", isValid=");
        sb.append(LIZJ());
        sb.append(" }");
        return sb.toString();
    }

    public final boolean LIZJ() {
        LIZ();
        this.LIZIZ.LIZ();
        return !r0.LIZIZ.contains(null);
    }

    public final int hashCode() {
        LIZ();
        return this.LIZIZ.hashCode() ^ (LIZIZ() ? 1 : 0);
    }

    public C90524Zfs(Bundle bundle) {
        this.LIZ = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C90524Zfs)) {
            return false;
        }
        C90524Zfs c90524Zfs = (C90524Zfs) obj;
        LIZ();
        C90101ZXt c90101ZXt = this.LIZIZ;
        c90524Zfs.LIZ();
        if (!c90101ZXt.equals(c90524Zfs.LIZIZ) || LIZIZ() != c90524Zfs.LIZIZ()) {
            return false;
        }
        return true;
    }

    public C90524Zfs(C90101ZXt c90101ZXt, boolean z) {
        if (c90101ZXt != null) {
            Bundle bundle = new Bundle();
            this.LIZ = bundle;
            this.LIZIZ = c90101ZXt;
            bundle.putBundle("selector", c90101ZXt.LIZ);
            bundle.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
}
