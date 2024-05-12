package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.o;

/* renamed from: X.2m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68222m2 {
    public final String LIZ;
    public final Lifecycle.Event LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

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
        if (obj == null || !(obj instanceof C68222m2)) {
            return false;
        }
        C68222m2 c68222m2 = (C68222m2) obj;
        if (!TextUtils.equals(this.LIZ, c68222m2.LIZ) || this.LIZIZ != c68222m2.LIZIZ) {
            return false;
        }
        return true;
    }

    public C68222m2(Activity activity, Lifecycle.Event event) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(event, "event");
        this.LIZ = activity.toString();
        this.LIZIZ = event;
        this.LIZJ = activity.getClass().getName();
        this.LIZLLL = activity.hashCode();
    }
}
