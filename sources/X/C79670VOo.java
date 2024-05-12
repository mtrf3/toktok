package X;

import android.graphics.Rect;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.lynx.tasm.behavior.ui.LynxUI;

/* renamed from: X.VOo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79670VOo extends VR2 {
    @Override // X.VR2
    public final Animation LIZIZ(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f) {
        boolean z;
        boolean z2 = true;
        if (lynxUI.getOriginLeft() != i || lynxUI.getOriginTop() != i2) {
            z = true;
        } else {
            z = false;
        }
        if (lynxUI.getWidth() == i3 && lynxUI.getHeight() == i4) {
            z2 = false;
        }
        if (!z) {
            if (!z2) {
                return null;
            }
        } else if (!z2) {
            return new TranslateAnimation(lynxUI.getOriginLeft() - i, 0.0f, lynxUI.getOriginTop() - i2, 0.0f);
        }
        return new C79675VOt(lynxUI, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
