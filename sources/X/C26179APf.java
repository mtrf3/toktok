package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* renamed from: X.APf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26179APf extends ViewOutlineProvider {
    public final /* synthetic */ FrameLayout LIZ;

    public C26179APf(FrameLayout frameLayout) {
        this.LIZ = frameLayout;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (outline != null) {
            outline.setRoundRect(0, 0, this.LIZ.getWidth(), this.LIZ.getHeight(), this.LIZ.getHeight());
        }
    }
}
