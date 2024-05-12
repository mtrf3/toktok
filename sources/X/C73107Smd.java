package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Smd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73107Smd extends ViewOutlineProvider {
    public float LIZ;
    public final C73108Sme LIZIZ = new C73108Sme();

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, C25870zv.LIZ(view, "view", outline, "outline"), view.getHeight(), this.LIZIZ.getInterpolation(this.LIZ));
    }
}
