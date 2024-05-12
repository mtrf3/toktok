package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.TCl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74259TCl extends ViewOutlineProvider {
    public final /* synthetic */ TDC LIZ;

    public C74259TCl(TDC tdc) {
        this.LIZ = tdc;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, C25870zv.LIZ(view, "view", outline, "outline"), view.getHeight(), this.LIZ.getRoundRadiusForIcon());
    }
}
