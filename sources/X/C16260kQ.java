package X;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o3.h0;

/* renamed from: X.0kQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16260kQ {
    public static boolean LIZ;
    public static Method LIZIZ;
    public static boolean LIZJ;
    public static Field LIZLLL;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r1 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (X.C16330kX.LIZIZ(r1) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        X.C16460kk.LIZIZ(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r0 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.view.View r3, android.view.KeyEvent r4) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L8
        L6:
            r3 = 0
        L7:
            return r3
        L8:
            r0 = 2131377497(0x7f0a3d59, float:1.83752E38)
            java.lang.Object r1 = r3.getTag(r0)
            X.0kk r1 = (X.C16460kk) r1
            if (r1 != 0) goto L1b
            X.0kk r1 = new X.0kk
            r1.<init>()
            r3.setTag(r0, r1)
        L1b:
            java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r1.LIZJ
            if (r0 == 0) goto L26
            java.lang.Object r0 = r0.get()
            if (r0 != r4) goto L26
            goto L6
        L26:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r1.LIZJ = r0
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.LIZIZ
            if (r0 != 0) goto L38
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.LIZIZ = r0
        L38:
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r2 = r1.LIZIZ
            int r0 = r4.getAction()
            r3 = 1
            if (r0 != r3) goto L56
            int r0 = r4.getKeyCode()
            int r1 = r2.indexOfKey(r0)
            if (r1 < 0) goto L56
            java.lang.Object r0 = r2.valueAt(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            r2.removeAt(r1)
            if (r0 != 0) goto L62
        L56:
            int r0 = r4.getKeyCode()
            java.lang.Object r0 = r2.get(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L6
        L62:
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L7
            boolean r0 = X.C16330kX.LIZIZ(r1)
            if (r0 == 0) goto L7
            X.C16460kk.LIZIZ(r1, r4)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16260kQ.LIZ(android.view.View, android.view.KeyEvent):boolean");
    }

    public static boolean LIZIZ(InterfaceC16250kP interfaceC16250kP, View view, Window.Callback callback, KeyEvent keyEvent) {
        Object invoke;
        boolean z = false;
        if (interfaceC16250kP == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC16250kP.superDispatchKeyEvent(keyEvent);
        }
        KeyEvent.DispatcherState dispatcherState = null;
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!LIZ) {
                        try {
                            LIZIZ = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        LIZ = true;
                    }
                    Method method = LIZIZ;
                    if (method != null) {
                        try {
                            invoke = method.invoke(actionBar, keyEvent);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                        if (invoke != null) {
                            z = ((Boolean) invoke).booleanValue();
                            if (z) {
                                return true;
                            }
                        }
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (h0.LIZJ(decorView, keyEvent)) {
                return true;
            }
            if (decorView != null) {
                dispatcherState = decorView.getKeyDispatcherState();
            }
            return keyEvent.dispatch(activity, dispatcherState, activity);
        }
        if (callback instanceof Dialog) {
            Dialog dialog = (Dialog) callback;
            if (!LIZJ) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    LIZLLL = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                LIZJ = true;
            }
            Field field = LIZLLL;
            if (field != null) {
                try {
                    DialogInterface.OnKeyListener onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                } catch (IllegalAccessException unused4) {
                }
            }
            Window window2 = dialog.getWindow();
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window2.getDecorView();
            if (h0.LIZJ(decorView2, keyEvent)) {
                return true;
            }
            if (decorView2 != null) {
                dispatcherState = decorView2.getKeyDispatcherState();
            }
            return keyEvent.dispatch(dialog, dispatcherState, dialog);
        }
        if ((view == null || !h0.LIZJ(view, keyEvent)) && !interfaceC16250kP.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }
}
