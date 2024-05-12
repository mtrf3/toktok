package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Cpm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32534Cpm extends ViewOutlineProvider {
    public final /* synthetic */ C32531Cpj LIZ;

    public C32534Cpm(C32531Cpj c32531Cpj) {
        this.LIZ = c32531Cpj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i;
        int i2;
        if (outline != null) {
            View view2 = this.LIZ.LJLILLLLZI;
            if (view2 != null) {
                i = view2.getWidth();
            } else {
                i = 0;
            }
            View view3 = this.LIZ.LJLILLLLZI;
            if (view3 != null) {
                i2 = view3.getHeight();
            } else {
                i2 = 0;
            }
            outline.setRoundRect(0, 0, i, i2, 12.0f);
        }
    }
}
