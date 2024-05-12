package X;

import android.view.KeyEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.0yJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24870yJ {
    public final KeyEvent LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        KeyEvent keyEvent = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KeyEvent(nativeKeyEvent=");
        LIZ.append(keyEvent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        KeyEvent keyEvent = this.LIZ;
        if (!(obj instanceof C24870yJ) || !o.LJ(keyEvent, ((C24870yJ) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
