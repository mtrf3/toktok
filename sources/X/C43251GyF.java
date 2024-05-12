package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.GyF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43251GyF extends ViewOutlineProvider {
    public final int LIZ;

    public C43251GyF(int i) {
        this.LIZ = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.LIZ);
    }
}
