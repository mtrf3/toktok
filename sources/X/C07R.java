package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: X.07R, reason: invalid class name */
/* loaded from: classes.dex */
public class C07R {
    public static ColorStateList LIZ(ImageView imageView) {
        return imageView.getImageTintList();
    }

    public static PorterDuff.Mode LIZIZ(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void LIZJ(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void LIZLLL(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
