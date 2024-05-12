package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.TCk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74258TCk extends ViewOutlineProvider {
    public final /* synthetic */ TDG LIZ;

    public C74258TCk(TDG tdg) {
        this.LIZ = tdg;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, C25870zv.LIZ(view, "view", outline, "outline"), view.getHeight(), this.LIZ.getRoundRadiusForIcon());
    }
}
