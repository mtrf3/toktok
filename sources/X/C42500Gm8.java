package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Gm8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42500Gm8 extends ViewOutlineProvider {
    public float LIZ;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, C25870zv.LIZ(view, "view", outline, "outline"), view.getHeight(), this.LIZ);
    }
}
