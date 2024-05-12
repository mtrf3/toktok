package X;

import android.app.Notification;

/* renamed from: X.0VT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VT {
    public final int LIZ;
    public final int LIZIZ;
    public final Notification LIZJ;

    public final int hashCode() {
        return this.LIZJ.hashCode() + (((this.LIZ * 31) + this.LIZIZ) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.LIZ + ", mForegroundServiceType=" + this.LIZIZ + ", mNotification=" + this.LIZJ + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0VT.class != obj.getClass()) {
            return false;
        }
        C0VT c0vt = (C0VT) obj;
        if (this.LIZ != c0vt.LIZ || this.LIZIZ != c0vt.LIZIZ) {
            return false;
        }
        return this.LIZJ.equals(c0vt.LIZJ);
    }

    public C0VT(int i, int i2, Notification notification) {
        this.LIZ = i;
        this.LIZJ = notification;
        this.LIZIZ = i2;
    }
}
