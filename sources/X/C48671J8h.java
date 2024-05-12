package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.bytedance.common.utility.Logger;

/* renamed from: X.J8h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48671J8h {
    public static int LIZ;
    public static int LIZIZ;

    public static boolean LJ(int i) {
        return i == 0 || i == 6 || i == 8 || i == 11;
    }

    public static boolean LJFF(int i) {
        return i == 1 || i == 7 || i == 9 || i == 12;
    }

    public static void LIZ(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("parent isnot ViewGroup. view.context: ");
            LIZ2.append(view.getContext());
            LIZ2.append(", parent: ");
            LIZ2.append(parent);
            X1D.LIZIZ(LIZ2);
            return;
        }
        try {
            C16880lQ.LJLLL(view, (ViewGroup) parent);
        } catch (Exception e) {
            Logger.throwException(e);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("first remove crash. view.context: ");
            LIZ3.append(view.getContext());
            LIZ3.append(", parent: ");
            LIZ3.append(parent);
            X1D.LIZIZ(LIZ3);
        }
        ViewParent parent2 = view.getParent();
        if (!(parent2 instanceof ViewGroup)) {
            return;
        }
        try {
            ((ViewGroup) parent2).endViewTransition(view);
            C16880lQ.LJLLL(view, (ViewGroup) parent2);
        } catch (Exception e2) {
            Logger.throwException(e2);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("second remove crash. view.context: ");
            LIZ4.append(view.getContext());
            LIZ4.append(", parent: ");
            LIZ4.append(parent2);
            X1D.LIZIZ(LIZ4);
        }
    }

    public static int LIZIZ(Context context) {
        WindowManager windowManager;
        try {
            Activity LIZ2 = C48672J8i.LIZ(context);
            if (LIZ2 != null && (windowManager = LIZ2.getWindowManager()) != null) {
                int rotation = windowManager.getDefaultDisplay().getRotation();
                if (rotation == 0) {
                    return 1;
                }
                if (rotation != 1) {
                    if (rotation != 2) {
                        if (rotation != 3) {
                            return -1;
                        }
                        return 8;
                    }
                    return 9;
                }
                return 0;
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        r3 = java.lang.Math.max(r2.heightPixels, r2.widthPixels);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        X.C48671J8h.LIZ = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002b, code lost:
    
        if (r2 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(android.content.Context r4) {
        /*
            r3 = 0
            if (r4 != 0) goto L4
            return r3
        L4:
            int r0 = X.C48671J8h.LIZ
            if (r0 > 0) goto L44
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics     // Catch: java.lang.Exception -> L44
            r2.<init>()     // Catch: java.lang.Exception -> L44
            r1 = r4
        Le:
            boolean r0 = r1 instanceof android.content.ContextWrapper     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L23
            boolean r0 = r1 instanceof android.app.Activity     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L19
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Exception -> L44
            goto L20
        L19:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1     // Catch: java.lang.Exception -> L44
            android.content.Context r1 = r1.getBaseContext()     // Catch: java.lang.Exception -> L44
            goto Le
        L20:
            if (r1 == 0) goto L23
            goto L30
        L23:
            android.content.res.Resources r0 = r4.getResources()     // Catch: java.lang.Exception -> L44
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()     // Catch: java.lang.Exception -> L44
            if (r2 != 0) goto L3b
        L2d:
            X.C48671J8h.LIZ = r3     // Catch: java.lang.Exception -> L44
            goto L44
        L30:
            android.view.WindowManager r0 = r1.getWindowManager()     // Catch: java.lang.Exception -> L44
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch: java.lang.Exception -> L44
            r0.getRealMetrics(r2)     // Catch: java.lang.Exception -> L44
        L3b:
            int r1 = r2.heightPixels     // Catch: java.lang.Exception -> L44
            int r0 = r2.widthPixels     // Catch: java.lang.Exception -> L44
            int r3 = java.lang.Math.max(r1, r0)     // Catch: java.lang.Exception -> L44
            goto L2d
        L44:
            int r0 = X.C48671J8h.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48671J8h.LIZJ(android.content.Context):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        r3 = java.lang.Math.min(r2.widthPixels, r2.heightPixels);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        X.C48671J8h.LIZIZ = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002b, code lost:
    
        if (r2 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZLLL(android.content.Context r4) {
        /*
            r3 = 0
            if (r4 != 0) goto L4
            return r3
        L4:
            int r0 = X.C48671J8h.LIZIZ
            if (r0 > 0) goto L44
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics     // Catch: java.lang.Exception -> L44
            r2.<init>()     // Catch: java.lang.Exception -> L44
            r1 = r4
        Le:
            boolean r0 = r1 instanceof android.content.ContextWrapper     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L23
            boolean r0 = r1 instanceof android.app.Activity     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L19
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Exception -> L44
            goto L20
        L19:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1     // Catch: java.lang.Exception -> L44
            android.content.Context r1 = r1.getBaseContext()     // Catch: java.lang.Exception -> L44
            goto Le
        L20:
            if (r1 == 0) goto L23
            goto L30
        L23:
            android.content.res.Resources r0 = r4.getResources()     // Catch: java.lang.Exception -> L44
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()     // Catch: java.lang.Exception -> L44
            if (r2 != 0) goto L3b
        L2d:
            X.C48671J8h.LIZIZ = r3     // Catch: java.lang.Exception -> L44
            goto L44
        L30:
            android.view.WindowManager r0 = r1.getWindowManager()     // Catch: java.lang.Exception -> L44
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch: java.lang.Exception -> L44
            r0.getRealMetrics(r2)     // Catch: java.lang.Exception -> L44
        L3b:
            int r1 = r2.widthPixels     // Catch: java.lang.Exception -> L44
            int r0 = r2.heightPixels     // Catch: java.lang.Exception -> L44
            int r3 = java.lang.Math.min(r1, r0)     // Catch: java.lang.Exception -> L44
            goto L2d
        L44:
            int r0 = X.C48671J8h.LIZIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48671J8h.LIZLLL(android.content.Context):int");
    }
}
