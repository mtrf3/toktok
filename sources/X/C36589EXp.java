package X;

import android.os.Build;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: X.EXp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36589EXp {
    public static Class LIZ;
    public static Object LIZIZ;
    public static Field LIZJ;
    public static Class LIZLLL;
    public static boolean LJ;

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006c -> B:16:0x006c). Please report as a decompilation issue!!! */
    public static void LIZ() {
        if (!LJ) {
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                LIZJ = cls.getDeclaredField("mViews");
                Field declaredField = cls.getDeclaredField("sDefaultWindowManager");
                LIZJ.setAccessible(true);
                if (LIZJ.getType() != ArrayList.class) {
                    LIZJ.getType();
                }
                declaredField.setAccessible(true);
                LIZIZ = declaredField.get(null);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            }
            try {
                Class.forName("com.android.internal.view.menu.ListMenuItemView");
                Class.forName("com.android.internal.view.menu.MenuView$ItemView").getDeclaredMethod("getItemData", new Class[0]);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            }
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        LIZLLL = Class.forName("com.android.internal.policy.PhoneWindow$DecorView");
                    } catch (ClassNotFoundException unused3) {
                        LIZLLL = Class.forName("com.android.internal.policy.DecorView");
                    }
                } else {
                    LIZLLL = Class.forName("com.android.internal.policy.impl.PhoneWindow$DecorView");
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    LIZ = Class.forName("android.widget.PopupWindow$PopupDecorView");
                } else {
                    LIZ = Class.forName("android.widget.PopupWindow$PopupViewContainer");
                }
            } catch (ClassNotFoundException unused5) {
            }
            LJ = true;
        }
    }
}
