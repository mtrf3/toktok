package X;

import android.graphics.Rect;
import android.util.SizeF;
import android.view.View;
import com.ss.ugc.android.editor.components.base.transition.DavinciViewPositionRect;

/* renamed from: X.5R0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5R0 {
    public static final /* synthetic */ int LIZ = 0;

    public static DavinciViewPositionRect LIZ(View view, float f) {
        SizeF sizeF;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Rect LIZJ = C73098SmU.LIZJ(view);
                DavinciViewPositionRect davinciViewPositionRect = new DavinciViewPositionRect(LIZJ.left, LIZJ.right, LIZJ.top, LIZJ.bottom, f);
                if (f == -1.0f) {
                    return davinciViewPositionRect;
                }
                SizeF sizeF2 = new SizeF(f, 1.0f);
                float width = sizeF2.getWidth();
                float height = sizeF2.getHeight();
                float f2 = davinciViewPositionRect.right - davinciViewPositionRect.left;
                float f3 = davinciViewPositionRect.bottom - davinciViewPositionRect.top;
                float f4 = width / height;
                if (f2 / f3 > f4) {
                    sizeF = new SizeF(f4 * f3, f3);
                } else {
                    sizeF = new SizeF(f2, f2 / f4);
                }
                float width2 = (((davinciViewPositionRect.right - r3) - sizeF.getWidth()) / 2.0f) + davinciViewPositionRect.left;
                float height2 = (((davinciViewPositionRect.bottom - r2) - sizeF.getHeight()) / 2.0f) + davinciViewPositionRect.top;
                int i = (int) width2;
                return new DavinciViewPositionRect(i, i + ((int) sizeF.getWidth()), (int) height2, (int) (sizeF.getHeight() + height2), f);
            }
            return null;
        }
        throw new NullPointerException("source view is null");
    }
}
