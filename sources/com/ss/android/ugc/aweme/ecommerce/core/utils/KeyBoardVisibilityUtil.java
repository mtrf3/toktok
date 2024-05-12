package com.ss.android.ugc.aweme.ecommerce.core.utils;

import X.C16880lQ;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class KeyBoardVisibilityUtil implements GenericLifecycleObserver, ViewTreeObserver.OnGlobalLayoutListener {
    public final Window LJLIL;
    public final View LJLILLLLZI;
    public final InterfaceC88471Ynr<Boolean, Integer, C76800UCe> LJLJI;
    public boolean LJLJJI;
    public final int LJLJJL;
    public final Rect LJLJJLL;
    public int LJLJL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZ() {
        this.LJLILLLLZI.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z = true;
        int applyDimension = (int) TypedValue.applyDimension(1, this.LJLJJL, this.LJLILLLLZI.getResources().getDisplayMetrics());
        this.LJLILLLLZI.getWindowVisibleDisplayFrame(this.LJLJJLL);
        int height = this.LJLILLLLZI.getRootView().getHeight();
        Rect rect = this.LJLJJLL;
        if (height - (rect.bottom - rect.top) < applyDimension) {
            z = false;
        }
        if (z == this.LJLJJI) {
            return;
        }
        this.LJLJJI = z;
        this.LJLJI.invoke(Boolean.valueOf(z), Integer.valueOf(this.LJLJJLL.bottom));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LIZ();
    }

    public static void LIZIZ(KeyBoardVisibilityUtil keyBoardVisibilityUtil) {
        View findFocus = keyBoardVisibilityUtil.LJLIL.getDecorView().findFocus();
        if (findFocus == null) {
            return;
        }
        try {
            Object LLILL = C16880lQ.LLILL(keyBoardVisibilityUtil.LJLILLLLZI.getContext(), "input_method");
            o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) LLILL).hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        findFocus.clearFocus();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KeyBoardVisibilityUtil(X.C1AU r8, java.lang.Integer r9, X.InterfaceC88471Ynr<? super java.lang.Boolean, ? super java.lang.Integer, X.C76800UCe> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "listener"
            r6 = r10
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            androidx.lifecycle.Lifecycle r2 = r8.getLifecycle()
            java.lang.String r0 = "activity.lifecycle"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            android.view.Window r3 = r8.getWindow()
            java.lang.String r0 = "activity.window"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r8.findViewById(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 0
            android.view.View r4 = r1.getChildAt(r0)
            java.lang.String r0 = "activity.findViewById<Vi…id.content).getChildAt(0)"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            r5 = r9
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil.<init>(X.1AU, java.lang.Integer, X.Ynr):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyBoardVisibilityUtil(Lifecycle lifecycle, Window window, View parentView, Integer num, InterfaceC88471Ynr<? super Boolean, ? super Integer, C76800UCe> listener) {
        o.LJIIIZ(parentView, "parentView");
        o.LJIIIZ(listener, "listener");
        this.LJLIL = window;
        this.LJLILLLLZI = parentView;
        this.LJLJI = listener;
        this.LJLJJL = 148;
        this.LJLJJLL = new Rect();
        if (num != null) {
            window.setSoftInputMode(num.intValue());
        }
        lifecycle.addObserver(this);
        parentView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
