package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Hvf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45639Hvf extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRect(0, 0, C25870zv.LIZ(view, "view", outline, "outline"), view.getHeight());
    }
}
