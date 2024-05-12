package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.GmL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42513GmL extends ViewOutlineProvider {
    public final /* synthetic */ C48936JIm LIZ;

    public C42513GmL(C48936JIm c48936JIm) {
        this.LIZ = c48936JIm;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, C25870zv.LIZ(view, "view", outline, "outline"), view.getHeight(), KL2.LIZJ(this.LIZ.getContext(), 2.0f));
    }
}
