package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.10h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C259910h {
    public static final ThreadLocal<TypedValue> LIZ = new ThreadLocal<>();
    public static final SparseArray<SparseIntArray> LIZIZ = new SparseArray<>();

    public static TypedValue LIZ() {
        ThreadLocal<TypedValue> threadLocal = LIZ;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        typedValue.type = 0;
        typedValue.string = null;
        typedValue.data = 0;
        typedValue.assetCookie = 0;
        typedValue.resourceId = 0;
        typedValue.changingConfigurations = -1;
        typedValue.density = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            typedValue.sourceResourceId = 0;
        }
        return typedValue;
    }

    public static int LIZIZ(int i, Context context) {
        TypedValue LIZ2 = LIZ();
        context.getTheme().resolveAttribute(i, LIZ2, true);
        return LIZ2.data;
    }

    public static int LIZJ(int i, View view) {
        return LIZIZ(i, view.getContext());
    }

    public static C1Q4 LIZLLL(int i, Context context) {
        C0TU c0tu = C0TT.LIZ;
        int LJ = LJ(i, context);
        c0tu.getClass();
        Drawable LIZ2 = C0TU.LIZ(LJ, context);
        if (LIZ2 == null) {
            return null;
        }
        return new C1Q4(LIZ2);
    }

    public static int LJ(int i, Context context) {
        if (C259710f.LIZ.LIZLLL != null) {
            return LJI(R.style.il, i, context);
        }
        return -1;
    }

    public static int LJFF(Context context, TypedArray typedArray, int i) {
        if (!typedArray.hasValue(i)) {
            return -1;
        }
        TypedValue LIZ2 = LIZ();
        typedArray.getValue(i, LIZ2);
        if (LIZ2.type == 2) {
            if (C259710f.LIZ.LIZLLL == null) {
                return -1;
            }
            return LJI(R.style.il, LIZ2.data, context);
        }
        return LIZ2.resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r1 == (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJI(int r4, int r5, android.content.Context r6) {
        /*
            r3 = -1
            if (r4 != 0) goto L4
            return r3
        L4:
            android.util.SparseArray<android.util.SparseIntArray> r0 = X.C259910h.LIZIZ
            java.lang.Object r2 = r0.get(r4)
            android.util.SparseIntArray r2 = (android.util.SparseIntArray) r2
            if (r2 == 0) goto L2b
            int r1 = r2.get(r5, r3)
            if (r1 != r3) goto L2a
        L14:
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r0[r1] = r5
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r4, r0)
            int r1 = r0.getResourceId(r1, r3)
            if (r1 == r3) goto L27
            r2.put(r5, r1)
        L27:
            r0.recycle()
        L2a:
            return r1
        L2b:
            android.util.SparseIntArray r2 = new android.util.SparseIntArray
            r2.<init>()
            r0.put(r4, r2)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C259910h.LJI(int, int, android.content.Context):int");
    }
}
