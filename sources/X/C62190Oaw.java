package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.Oaw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62190Oaw extends ViewOutlineProvider {
    public final /* synthetic */ C62189Oav LIZ;

    public C62190Oaw(C62189Oav c62189Oav) {
        this.LIZ = c62189Oav;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(outline, "outline");
        float aspectRatio = this.LIZ.getAspectRatio();
        float height = this.LIZ.getHeight();
        float width = this.LIZ.getWidth();
        if (height == 0.0f) {
            return;
        }
        float f = height * aspectRatio;
        float f2 = (width - f) / 2;
        outline.setRoundRect((int) f2, 0, (int) (f2 + f), this.LIZ.getBottom(), KL2.LIZJ(this.LIZ.getContext(), 4.3f));
    }
}
