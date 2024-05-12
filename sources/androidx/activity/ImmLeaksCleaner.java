package androidx.activity;

import X.C16880lQ;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements LifecycleEventObserver {
    public static int LJLILLLLZI;
    public static Field LJLJI;
    public static Field LJLJJI;
    public static Field LJLJJL;
    public final Activity LJLIL;

    public ImmLeaksCleaner(Activity activity) {
        this.LJLIL = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (LJLILLLLZI == 0) {
            try {
                LJLILLLLZI = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                LJLJJI = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                LJLJJL = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                LJLJI = declaredField3;
                declaredField3.setAccessible(true);
                LJLILLLLZI = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (LJLILLLLZI == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILIL(this.LJLIL, "input_method");
            try {
                Object obj = LJLJI.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) LJLJJI.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                LJLJJL.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (ClassCastException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
