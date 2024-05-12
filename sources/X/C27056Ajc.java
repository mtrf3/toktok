package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Ajc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27056Ajc extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view != null && outline != null) {
            int width = view.getWidth();
            float height = view.getHeight();
            float f = C27162AlK.LJI;
            outline.setRoundRect(0, 0, width, (int) (height + f), f);
        }
    }
}
