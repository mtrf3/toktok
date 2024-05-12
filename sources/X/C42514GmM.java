package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.GmM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42514GmM extends ViewOutlineProvider {
    public final /* synthetic */ KHK LIZ;

    public C42514GmM(KHK khk) {
        this.LIZ = khk;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, C25870zv.LIZ(view, "view", outline, "outline"), view.getHeight(), KL2.LIZJ(this.LIZ.getContext(), 8.0f));
    }
}
