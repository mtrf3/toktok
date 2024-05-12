package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.TDo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74288TDo extends ViewOutlineProvider {
    public final /* synthetic */ float[] LIZ;

    public C74288TDo(float[] fArr) {
        this.LIZ = fArr;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.LIZ[0]);
        }
    }
}
