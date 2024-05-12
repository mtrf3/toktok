package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: X.0Ob, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06690Ob {
    public static final ThreadLocal<TypedValue> LIZ = new ThreadLocal<>();
    public static final WeakHashMap<C0OZ, SparseArray<C0OY>> LIZIZ = new WeakHashMap<>(0);
    public static final Object LIZJ = new Object();

    public static int LIZIZ(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0OX.LIZ(resources, i, theme);
        }
        return resources.getColor(i);
    }

    public static void LIZ(C0OZ c0oz, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (LIZJ) {
            WeakHashMap<C0OZ, SparseArray<C0OY>> weakHashMap = LIZIZ;
            SparseArray<C0OY> sparseArray = weakHashMap.get(c0oz);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(c0oz, sparseArray);
            }
            sparseArray.append(i, new C0OY(colorStateList, c0oz.LIZ.getConfiguration(), theme));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r0.toString().startsWith("res/") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface LIZJ(android.content.Context r15, int r16, android.util.TypedValue r17, int r18, X.AbstractC06680Oa r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06690Ob.LIZJ(android.content.Context, int, android.util.TypedValue, int, X.0Oa, boolean):android.graphics.Typeface");
    }
}
