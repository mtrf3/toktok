package X;

import android.os.Build;

/* renamed from: X.07K, reason: invalid class name */
/* loaded from: classes.dex */
public interface C07K {
    public static final boolean LIZLLL;

    int getAutoSizeMaxTextSize();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4);

    void setAutoSizeTextTypeWithDefaults(int i);

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        LIZLLL = z;
    }
}
