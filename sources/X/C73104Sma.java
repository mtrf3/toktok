package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Sma, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73104Sma extends ViewOutlineProvider {
    public final /* synthetic */ float LIZ;

    public C73104Sma(float f) {
        this.LIZ = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, C25870zv.LIZ(view, "view", outline, "outline"), view.getHeight(), KL2.LIZJ(view.getContext(), this.LIZ));
    }
}
