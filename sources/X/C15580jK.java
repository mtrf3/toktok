package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.0jK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15580jK {
    public static void LIZIZ(int i, View view) {
        final float f = i;
        view.setOutlineProvider(new ViewOutlineProvider(f) { // from class: X.0jI
            public final float LIZ;

            {
                this.LIZ = f;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                outline.setRoundRect(new Rect(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getWidth() - view2.getPaddingRight(), view2.getHeight() - view2.getPaddingBottom()), this.LIZ);
            }
        });
        view.setClipToOutline(true);
    }

    public static void LIZ(int i, final int i2, View view) {
        final float f = i;
        view.setOutlineProvider(new ViewOutlineProvider(f, i2) { // from class: X.0jJ
            public final float LIZ;
            public final int LIZIZ;

            {
                this.LIZIZ = i2;
                this.LIZ = f;
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                int paddingLeft = view2.getPaddingLeft();
                int paddingTop = view2.getPaddingTop();
                int width = view2.getWidth() - view2.getPaddingRight();
                int height = view2.getHeight() - view2.getPaddingBottom();
                int i3 = this.LIZIZ;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                width = (int) (width + this.LIZ);
                            }
                        } else {
                            paddingLeft = (int) (paddingLeft - this.LIZ);
                        }
                    } else {
                        paddingTop = (int) (paddingTop - this.LIZ);
                    }
                } else {
                    height = (int) (height + this.LIZ);
                }
                outline.setRoundRect(new Rect(paddingLeft, paddingTop, width, height), this.LIZ);
            }
        });
        view.setClipToOutline(true);
    }
}
