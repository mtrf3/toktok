package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.VkF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80603VkF {
    public static int LIZIZ(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    public static void LIZ(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(Drawable drawable, Drawable.Callback callback, InterfaceC80626Vkc interfaceC80626Vkc) {
        if (drawable != 0) {
            drawable.setCallback(callback);
            if (drawable instanceof InterfaceC80604VkG) {
                ((InterfaceC80604VkG) drawable).LJIIJ(interfaceC80626Vkc);
            }
        }
    }
}
