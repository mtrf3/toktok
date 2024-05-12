package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.07S, reason: invalid class name */
/* loaded from: classes.dex */
public final class C07S {
    public static void LIZ(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        C07R.LIZJ(imageView, colorStateList);
        if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && C07R.LIZ(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }
}
