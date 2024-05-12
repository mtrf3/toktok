package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.I4q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46028I4q extends ViewOutlineProvider {
    public final Float LIZ;
    public final float LIZIZ;

    public C46028I4q(float f, Float f2) {
        this.LIZ = f2;
        this.LIZIZ = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view == null) {
            return;
        }
        if (this.LIZ != null) {
            if (outline != null) {
                outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.LIZ.floatValue());
            }
        } else {
            if (outline == null) {
                return;
            }
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), view.getWidth() * this.LIZIZ);
        }
    }

    public /* synthetic */ C46028I4q(Float f, float f2, int i) {
        this((i & 2) != 0 ? 0.0f : f2, (i & 1) != 0 ? null : f);
    }
}
