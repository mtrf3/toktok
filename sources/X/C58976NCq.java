package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.NCq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58976NCq extends ViewOutlineProvider {
    public final /* synthetic */ C58975NCp LIZ;

    public C58976NCq(C58975NCp c58975NCp) {
        this.LIZ = c58975NCp;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i;
        int i2;
        if (outline != null) {
            if (view != null) {
                i = view.getWidth();
                i2 = view.getHeight();
            } else {
                i = 0;
                i2 = 0;
            }
            outline.setRoundRect(0, 0, i, i2, C32151Nz.LJIIZILJ(Integer.valueOf(this.LIZ.LJLZ.getCornerRadius())));
        }
    }
}
