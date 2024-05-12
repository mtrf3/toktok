package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.1L0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1L0 extends AbstractC07660Ru {
    public final View LIZ;
    public final C279917z LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1L0)) {
            return false;
        }
        C1L0 c1l0 = (C1L0) obj;
        return o.LJ(this.LIZ, c1l0.LIZ) && o.LJ(this.LIZIZ, c1l0.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DoAddAnimation(iconView=");
        LIZ.append(this.LIZ);
        LIZ.append(", songInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C1L0(View iconView, C279917z songInfo) {
        o.LJIIIZ(iconView, "iconView");
        o.LJIIIZ(songInfo, "songInfo");
        this.LIZ = iconView;
        this.LIZIZ = songInfo;
    }
}
