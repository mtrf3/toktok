package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.APd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26177APd extends ViewOutlineProvider {
    public final /* synthetic */ int LIZ = 88;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), C32151Nz.LJIIZILJ(Integer.valueOf(this.LIZ / 2)));
        }
    }
}
