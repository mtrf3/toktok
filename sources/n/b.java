package n;

import X.C018905p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.i0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b extends View {
    public static final /* synthetic */ int LJLIL = 0;

    public static void LIZ(View view) {
        view.onFinishInflate();
    }

    public static int LIZIZ(int i, Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static ColorStateList LIZJ(int i, Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        return colorStateList;
    }

    public static int LIZLLL(int i, Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Method LJFF(Class cls, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("setTextCursorDrawable", cls2);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new IllegalStateException(i0.LJFF("getMethod failed ", "setTextCursorDrawable"));
        }
    }

    public static void LJII(int i, View view) {
        ((TextView) view).setMinHeight(i);
    }

    public static void LJIIIIZZ(int i, View view) {
        ((TextView) view).setMinWidth(i);
    }

    public static ViewGroup.MarginLayoutParams LJ(int i, int i2, ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof ConstraintLayout) {
            return new C018905p(i, i2);
        }
        return new ViewGroup.MarginLayoutParams(i, i2);
    }

    public static void LJI(Class cls, Object obj, Object obj2) {
        Field declaredField = cls.getDeclaredField("mCursorDrawableRes");
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
