package X;

import android.widget.TextView;

/* renamed from: X.07c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C022807c {
    public static int LIZ(TextView textView) {
        return textView.getAutoSizeMaxTextSize();
    }

    public static int LIZIZ(TextView textView) {
        return textView.getAutoSizeMinTextSize();
    }

    public static int LIZJ(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static int[] LIZLLL(TextView textView) {
        return textView.getAutoSizeTextAvailableSizes();
    }

    public static int LJ(TextView textView) {
        return textView.getAutoSizeTextType();
    }

    public static void LJII(TextView textView, int i) {
        textView.setAutoSizeTextTypeWithDefaults(i);
    }

    public static void LJI(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static void LJFF(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }
}
