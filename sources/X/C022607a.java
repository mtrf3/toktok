package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* renamed from: X.07a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C022607a {
    public static int LIZ(TextView textView) {
        return textView.getBreakStrategy();
    }

    public static ColorStateList LIZIZ(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    public static PorterDuff.Mode LIZJ(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    public static int LIZLLL(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    public static void LJ(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    public static void LJFF(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void LJI(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void LJII(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }
}
