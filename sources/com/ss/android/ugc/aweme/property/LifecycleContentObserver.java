package com.ss.android.ugc.aweme.property;

import X.ActivityC45651qj;
import android.database.ContentObserver;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LifecycleContentObserver extends ContentObserver implements GenericLifecycleObserver {
    public final ActivityC45651qj LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public boolean LJLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZ() {
        if (!this.LJLJI) {
            this.LJLJI = true;
            this.LJLILLLLZI.getLifecycle().removeObserver(this);
            this.LJLIL.getContentResolver().unregisterContentObserver(this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LIZ();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        Window window = this.LJLIL.getWindow();
        WindowManager.LayoutParams attributes = this.LJLIL.getWindow().getAttributes();
        attributes.screenBrightness = 2.0f;
        window.setAttributes(attributes);
        LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleContentObserver(ActivityC45651qj activity, Handler handler, LifecycleOwner lifecycleOwner) {
        super(handler);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = activity;
        this.LJLILLLLZI = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
