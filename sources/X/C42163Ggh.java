package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Ggh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42163Ggh extends ViewOutlineProvider {
    public final /* synthetic */ float LIZ;

    public C42163Ggh(float f) {
        this.LIZ = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view == null || outline == null) {
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.LIZ);
    }
}
