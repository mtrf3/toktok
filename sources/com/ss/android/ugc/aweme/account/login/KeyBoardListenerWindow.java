package com.ss.android.ugc.aweme.account.login;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C62822Ol8;
import X.SFA;
import X.SFB;
import Y.ARunnableS48S0100000_12;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class KeyBoardListenerWindow extends PopupWindow implements GenericLifecycleObserver, ViewTreeObserver.OnGlobalLayoutListener {
    public final ActivityC45651qj LJLIL;
    public final SFB LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public int LJLJJLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ((Rect) this.LJLJJL.getValue()).setEmpty();
        ((View) this.LJLJJI.getValue()).getWindowVisibleDisplayFrame((Rect) this.LJLJJL.getValue());
        int i = ((Rect) this.LJLJJL.getValue()).bottom;
        int i2 = this.LJLJJLL;
        if (i2 == -1) {
            this.LJLJJLL = i;
        } else {
            if (i2 == i) {
                return;
            }
            if (i2 > i) {
                this.LJLILLLLZI.zi(i);
            } else {
                this.LJLILLLLZI.LLFII();
            }
            this.LJLJJLL = i;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestory() {
        dismiss();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyBoardListenerWindow(Fragment fragment, ActivityC45651qj activityC45651qj, SFB listener) {
        super(activityC45651qj);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(listener, "listener");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = listener;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 94));
        this.LJLJI = LIZIZ;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS162S0100000_12(this, 93));
        this.LJLJJI = LIZIZ2;
        this.LJLJJL = C221108m2.LIZIZ(SFA.LJLIL);
        this.LJLJJLL = -1;
        setContentView((View) LIZIZ2.getValue());
        setWidth(0);
        setHeight(-1);
        ((View) LIZIZ.getValue()).post(new ARunnableS48S0100000_12(this, 9));
        fragment.getLifecycle().addObserver(this);
        setSoftInputMode(37);
        setInputMethodMode(1);
    }
}
