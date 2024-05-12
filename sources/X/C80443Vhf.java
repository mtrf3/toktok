package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Vhf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80443Vhf extends ViewOutlineProvider {
    public final /* synthetic */ C80438Vha LIZ;

    public C80443Vhf(C80438Vha c80438Vha) {
        this.LIZ = c80438Vha;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C80437VhZ c80437VhZ = this.LIZ.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
