package com.ss.android.ugc.aweme.main;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TabAlphaController extends Handler implements GenericLifecycleObserver {
    public static final String[] LJLJJI = {"SM-G9500", "SM-G9550", "SM-G9600", "SM-G9608", "SM-G9650", "SM-N9500"};
    public static TabAlphaController LJLJJL;
    public View LJLIL;
    public boolean LJLILLLLZI;
    public final boolean LJLJI;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (hasMessages(1)) {
            removeMessages(1);
        }
        this.LJLIL = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        LIZ(false);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public TabAlphaController() {
        String BRAND = Build.BRAND;
        o.LJIIIIZZ(BRAND, "BRAND");
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        String lowerCase = BRAND.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (TextUtils.equals("samsung", lowerCase)) {
            for (String str : LJLJJI) {
                if (TextUtils.equals(str, Build.MODEL)) {
                    this.LJLJI = true;
                    return;
                }
            }
        }
    }

    public final void LIZ(boolean z) {
        if (this.LJLIL == null || !this.LJLJI) {
            return;
        }
        if (z && !this.LJLILLLLZI) {
            if (hasMessages(1)) {
                return;
            }
            sendEmptyMessageDelayed(1, 1200000L);
        } else {
            if (!hasMessages(1)) {
                return;
            }
            removeMessages(1);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        View view;
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1 && (view = this.LJLIL) != null && !this.LJLILLLLZI) {
            o.LJI(view);
            View view2 = this.LJLIL;
            o.LJI(view2);
            view.setAlpha(view2.getAlpha() / 2);
            this.LJLILLLLZI = true;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume(LifecycleOwner lifecycleOwner) {
        LIZ(true);
    }
}
