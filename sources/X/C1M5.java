package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: X.1M5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1M5 extends AbstractC07850Sn {
    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        LIZLLL();
        outline.setRoundRect(this.LJII, this.LJI);
    }

    public C1M5(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // X.AbstractC07850Sn
    public final void LIZ(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }
}
