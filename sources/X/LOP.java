package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LOP {
    public int LIZ = -1;
    public View LIZIZ;
    public LOS LIZJ;
    public LOX LIZLLL;
    public Object LJ;

    public final void LIZ() {
        LOS los = this.LIZJ;
        if (los != null) {
            o.LJI(los);
            los.LJIILLIIL(this, true);
        } else {
            "Tab not attached to a TabLayout".toString();
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }
}
