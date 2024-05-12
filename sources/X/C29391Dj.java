package X;

import android.view.View;
import android.view.WindowId;

/* renamed from: X.1Dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29391Dj implements InterfaceC03940Dm {
    public final WindowId LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C29391Dj(View view) {
        this.LIZ = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C29391Dj) && ((C29391Dj) obj).LIZ.equals(this.LIZ)) {
            return true;
        }
        return false;
    }
}
