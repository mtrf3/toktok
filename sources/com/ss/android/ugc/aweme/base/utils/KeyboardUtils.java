package com.ss.android.ugc.aweme.base.utils;

import X.C16880lQ;
import X.C17N;
import X.EF7;
import X.InterfaceC228778yP;
import Y.IDLListenerS191S0100000_3;
import android.app.Activity;
import android.view.View;
import android.view.Window;
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
        public IDLListenerS191S0100000_3 LJLIL;
        public View LJLILLLLZI;
        public InterfaceC228778yP LJLJI;

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
            View view = this.LJLILLLLZI;
            if (view != null && view.getViewTreeObserver() != null && this.LJLILLLLZI.getViewTreeObserver().isAlive()) {
                this.LJLILLLLZI.getViewTreeObserver().removeOnGlobalLayoutListener(this.LJLIL);
            }
            this.LJLILLLLZI = null;
            this.LJLIL = null;
            this.LJLJI = null;
        }

        public AndroidBug5497Workaround(LifecycleOwner lifecycleOwner, View view, InterfaceC228778yP interfaceC228778yP) {
            lifecycleOwner.getLifecycle().addObserver(this);
            this.LJLJI = interfaceC228778yP;
            this.LJLIL = new IDLListenerS191S0100000_3(this, 1);
            View rootView = view.getRootView();
            this.LJLILLLLZI = rootView;
            rootView.getViewTreeObserver().addOnGlobalLayoutListener(this.LJLIL);
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

    static {
        C17N.LJIILL(73.0d);
    }

    public static void LIZIZ(View view) {
        InputMethodManager inputMethodManager;
        if (view != null && (inputMethodManager = (InputMethodManager) C16880lQ.LLILL(EF7.LIZIZ(), "input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void LIZJ(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(EF7.LIZIZ(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2);
        }
    }

    public static void LIZLLL(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(EF7.LIZIZ(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    public static void LIZ(LifecycleOwner lifecycleOwner, View view, InterfaceC228778yP interfaceC228778yP) {
        ((ArrayList) LIZIZ).add(new AndroidBug5497Workaround(lifecycleOwner, view, interfaceC228778yP));
    }

    public static void LJ(int i, int i2, Activity activity) {
        Window window = activity.getWindow();
        int i3 = window.getAttributes().softInputMode;
        int i4 = i & i2;
        if ((i3 & i2) == i4) {
            return;
        }
        window.setSoftInputMode(i4 ^ ((~i2) & i3));
    }
}
