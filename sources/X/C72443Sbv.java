package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Sbv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72443Sbv extends ViewOutlineProvider {
    public final float LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(new Rect(0, 0, this.LIZIZ, this.LIZJ), this.LIZ);
    }

    public C72443Sbv(float f, int i, int i2) {
        this.LIZ = f;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
