package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.6cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164456cr {
    public Drawable LIZ;
    public CharSequence LIZIZ;
    public View LIZLLL;
    public C80695Vlj LJFF;
    public C80686Vla LJI;
    public int LIZJ = -1;
    public boolean LJ = true;

    public final void LIZ() {
        C80695Vlj c80695Vlj = this.LJFF;
        if (c80695Vlj != null) {
            c80695Vlj.LJIILLIIL(this);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void LIZIZ() {
        C80686Vla c80686Vla = this.LJI;
        if (c80686Vla != null) {
            c80686Vla.LIZ();
        }
    }
}
