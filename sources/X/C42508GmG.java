package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.GmG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42508GmG extends ViewOutlineProvider {
    public Float LIZ;

    public C42508GmG(Float f) {
        this.LIZ = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int LIZ = C25870zv.LIZ(view, "view", outline, "outline");
        int height = view.getHeight();
        Float f = this.LIZ;
        if (f != null) {
            outline.setRoundRect(0, 0, LIZ, height, f.floatValue());
        }
    }
}
