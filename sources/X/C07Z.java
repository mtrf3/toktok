package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: X.07Z, reason: invalid class name */
/* loaded from: classes.dex */
public class C07Z {
    public static Drawable[] LIZ(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int LIZIZ(View view) {
        return view.getLayoutDirection();
    }

    public static int LIZJ(View view) {
        return view.getTextDirection();
    }

    public static Locale LIZLLL(TextView textView) {
        return textView.getTextLocale();
    }

    public static void LJII(View view, int i) {
        view.setTextDirection(i);
    }

    public static void LJ(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void LJFF(TextView textView, int i, int i2, int i3, int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    public static void LJI(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }
}
