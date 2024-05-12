package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.TCm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74260TCm extends ViewOutlineProvider {
    public final /* synthetic */ TDF LIZ;

    public C74260TCm(TDF tdf) {
        this.LIZ = tdf;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, C25870zv.LIZ(view, "view", outline, "outline"), view.getHeight(), this.LIZ.getRoundRadiusForIcon());
    }
}
