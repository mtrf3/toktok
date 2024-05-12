package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.TCp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74263TCp extends ViewOutlineProvider {
    public final int LIZ;

    public C74263TCp(int i) {
        this.LIZ = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.LIZ);
    }
}
