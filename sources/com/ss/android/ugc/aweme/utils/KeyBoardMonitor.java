package com.ss.android.ugc.aweme.utils;

import X.InterfaceC187177Wf;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes4.dex */
public class KeyBoardMonitor implements GenericLifecycleObserver, ViewTreeObserver.OnGlobalLayoutListener {
    public View LJLIL;
    public InterfaceC187177Wf LJLILLLLZI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZIZ() {
        View view = this.LJLIL;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.LJLIL.getWindowVisibleDisplayFrame(new Rect());
        if (this.LJLIL.getBottom() - r2.bottom > this.LJLIL.getResources().getDisplayMetrics().density * 100.0f) {
            this.LJLILLLLZI.LLLLLILLIL();
        } else {
            this.LJLILLLLZI.S2();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        LIZIZ();
    }

    public KeyBoardMonitor(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    public void LIZ(View view, InterfaceC187177Wf interfaceC187177Wf) {
        View rootView = view.getRootView();
        this.LJLIL = rootView;
        this.LJLILLLLZI = interfaceC187177Wf;
        if (rootView != null) {
            rootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }
}
