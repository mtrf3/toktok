package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Vlc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80688Vlc {
    public Drawable LIZ;
    public CharSequence LIZIZ;
    public CharSequence LIZJ;
    public View LJ;
    public C80684VlY LJI;
    public C80683VlX LJII;
    public int LIZLLL = -1;
    public int LJFF = -1;

    public final void LIZ() {
        C80684VlY c80684VlY = this.LJI;
        if (c80684VlY != null) {
            c80684VlY.LJIILIIL(this, true);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void LIZIZ() {
        C80683VlX c80683VlX = this.LJII;
        if (c80683VlX != null) {
            c80683VlX.LIZ();
        }
    }
}
