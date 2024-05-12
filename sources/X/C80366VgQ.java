package X;

import android.widget.ImageButton;

/* renamed from: X.VgQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80366VgQ extends ImageButton {
    public int LJLIL;

    public final int getUserSetVisibility() {
        return this.LJLIL;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        LIZ(i, true);
    }

    public final void LIZ(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.LJLIL = i;
        }
    }
}
