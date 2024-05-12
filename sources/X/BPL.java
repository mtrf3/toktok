package X;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BPL {
    public final Activity LIZ;
    public final Bundle LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BPL)) {
            return false;
        }
        BPL bpl = (BPL) obj;
        return o.LJ(this.LIZ, bpl.LIZ) && o.LJ(this.LIZIZ, bpl.LIZIZ);
    }

    public final int hashCode() {
        Activity activity = this.LIZ;
        int hashCode = (activity == null ? 0 : activity.hashCode()) * 31;
        Bundle bundle = this.LIZIZ;
        return hashCode + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActivityEvent(activity=");
        LIZ.append(this.LIZ);
        LIZ.append(", bundle=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public BPL(Activity activity, Bundle bundle) {
        this.LIZ = activity;
        this.LIZIZ = bundle;
    }
}
