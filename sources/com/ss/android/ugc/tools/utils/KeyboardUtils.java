package com.ss.android.ugc.tools.utils;

import X.C16880lQ;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class KeyboardUtils {
    public static final List<ClearCursorDecorator> LIZ = new ArrayList(2);
    public static final List<AndroidBug5497Workaround> LIZIZ = new ArrayList(2);

    /* loaded from: classes4.dex */
    public static class AndroidBug5497Workaround implements GenericLifecycleObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop() {
            Iterator it = ((ArrayList) KeyboardUtils.LIZIZ).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next == this) {
                    ((ArrayList) KeyboardUtils.LIZIZ).remove(next);
                    break;
                }
            }
            throw null;
        }
    }

    /* loaded from: classes4.dex */
    public static class ClearCursorDecorator implements GenericLifecycleObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            Iterator it = ((ArrayList) KeyboardUtils.LIZ).iterator();
            while (it.hasNext()) {
                if (it.next() == this) {
                    ((ArrayList) KeyboardUtils.LIZ).remove(this);
                }
            }
        }
    }

    public static void LIZ(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (view != null && (inputMethodManager = (InputMethodManager) C16880lQ.LLILL(context, "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void LIZIZ(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(context, "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }
}
