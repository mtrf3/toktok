package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.PictureDrawable;

/* loaded from: classes15.dex */
public final class VU1 extends PictureDrawable {
    @Override // android.graphics.drawable.PictureDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        if (getPicture() != null) {
            canvas.translate(bounds.left, bounds.top);
            canvas.drawPicture(getPicture());
        }
        canvas.restore();
    }

    public VU1(C87698YbO c87698YbO, VU5 vu5, C79483VHj c79483VHj) {
        super(null);
        setPicture(c87698YbO.LJ(vu5, c79483VHj));
    }
}
