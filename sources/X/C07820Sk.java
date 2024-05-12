package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0Sk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07820Sk {
    public static boolean LIZIZ(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static ColorFilter LIZJ(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void LIZ(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static void LJI(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void LJII(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void LJIIIIZZ(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static void LJ(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void LIZLLL(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void LJFF(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }
}
