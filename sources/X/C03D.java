package X;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.03D, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03D {
    public static final int[] LIZ = {R.attr.state_checked};
    public static final int[] LIZIZ = new int[0];
    public static final Rect LIZJ = new Rect();

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                Drawable[] children = ((DrawableContainer.DrawableContainerState) constantState).getChildren();
                for (Drawable drawable2 : children) {
                    if (!LIZ(drawable2)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        if (drawable instanceof InterfaceC07870Sp) {
            return LIZ(((InterfaceC07870Sp) drawable).LIZIZ());
        }
        if (drawable instanceof C21330sb) {
            return LIZ(((C21330sb) drawable).LJLIL);
        }
        if (drawable instanceof ScaleDrawable) {
            return LIZ(((ScaleDrawable) drawable).getDrawable());
        }
        return true;
    }

    public static void LIZIZ(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        int[] iArr = LIZIZ;
        int[] iArr2 = LIZ;
        if (i == 21) {
            if ("android.graphics.drawable.VectorDrawable".equals(name)) {
                int[] state = drawable.getState();
                if (state == null || state.length == 0) {
                    drawable.setState(iArr2);
                } else {
                    drawable.setState(iArr);
                }
                drawable.setState(state);
                return;
            }
            return;
        }
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state2 = drawable.getState();
        if (state2 == null || state2.length == 0) {
            drawable.setState(iArr2);
        } else {
            drawable.setState(iArr);
        }
        drawable.setState(state2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect LIZJ(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets LIZ2 = C03C.LIZ(drawable);
            return new Rect(LIZ2.left, LIZ2.top, LIZ2.right, LIZ2.bottom);
        }
        boolean z = drawable instanceof InterfaceC07870Sp;
        Drawable drawable2 = drawable;
        if (z) {
            drawable2 = ((InterfaceC07870Sp) drawable).LIZIZ();
        }
        if (C03B.LIZ) {
            try {
                Object invoke = C03B.LIZIZ.invoke(drawable2, new Object[0]);
                if (invoke != null) {
                    return new Rect(C03B.LIZJ.getInt(invoke), C03B.LIZLLL.getInt(invoke), C03B.LJ.getInt(invoke), C03B.LJFF.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return LIZJ;
    }

    public static PorterDuff.Mode LIZLLL(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
