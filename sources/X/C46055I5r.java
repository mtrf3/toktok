package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.I5r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46055I5r extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (int) KL2.LIZJ(C82891Wg3.LIZ(), 2.0f));
    }
}
