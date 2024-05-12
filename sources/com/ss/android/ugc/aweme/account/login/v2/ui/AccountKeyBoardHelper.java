package com.ss.android.ugc.aweme.account.login.v2.ui;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C5H3;
import X.C62822Ol8;
import X.C9WM;
import X.EnumC221088m0;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AccountKeyBoardHelper implements GenericLifecycleObserver, ViewTreeObserver.OnGlobalLayoutListener {
    public static final C5H3<Boolean> LJLJLLL = C221108m2.LIZ(EnumC221088m0.NONE, C9WM.LJLIL);
    public final View LJLIL;
    public final Fragment LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final Rect LJLJJL;
    public Boolean LJLJJLL;
    public boolean LJLJL;
    public Fragment LJLJLJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            startListen();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            stopListen();
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.9WN, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.9WN, androidx.fragment.app.Fragment] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Window window;
        View decorView;
        boolean z = false;
        if (this.LJLJL) {
            this.LJLJL = false;
            return;
        }
        this.LJLJJL.setEmpty();
        ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(this.LJLJJL);
        }
        if (((Number) this.LJLJI.getValue()).intValue() - this.LJLJJL.bottom > ((Number) this.LJLJJI.getValue()).intValue()) {
            z = true;
        }
        if (!o.LJ(Boolean.valueOf(z), this.LJLJJLL)) {
            this.LJLJJLL = Boolean.valueOf(z);
            if (z) {
                ?? r0 = this.LJLJLJ;
                if (r0 != 0) {
                    r0.Rg();
                    return;
                }
                return;
            }
            ?? r02 = this.LJLJLJ;
            if (r02 == 0) {
                return;
            }
            r02.LLFII();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void startListen() {
        this.LJLIL.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void stopListen() {
        this.LJLIL.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public AccountKeyBoardHelper(View view, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = view;
        this.LJLILLLLZI = fragment;
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 46));
        this.LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 45));
        this.LJLJJL = new Rect();
        this.LJLJL = true;
        fragment.getLifecycle().addObserver(this);
    }
}
