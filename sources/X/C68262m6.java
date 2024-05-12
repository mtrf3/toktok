package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.o;

/* renamed from: X.2m6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68262m6 {
    public final String LIZ;
    public Lifecycle.Event LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append('/');
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C68262m6)) {
            return false;
        }
        C68262m6 c68262m6 = (C68262m6) obj;
        if (!TextUtils.equals(this.LIZ, c68262m6.LIZ) || this.LIZIZ != c68262m6.LIZIZ) {
            return false;
        }
        return true;
    }

    public C68262m6(Activity activity, Lifecycle.Event event) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(event, "event");
        this.LIZ = activity.toString();
        this.LIZIZ = event;
        this.LIZJ = activity.getClass().getName();
        activity.hashCode();
    }
}
