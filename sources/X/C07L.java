package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* renamed from: X.07L, reason: invalid class name */
/* loaded from: classes.dex */
public class C07L {
    public static ColorStateList LIZ(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    public static PorterDuff.Mode LIZIZ(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public static void LIZJ(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void LIZLLL(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
