package com.ss.android.ugc.aweme.share.silent;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C46318IFu;
import X.C4XM;
import X.C56308M8a;
import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SilentSharePopupWindow extends PopupWindow implements GenericLifecycleObserver {
    public final Context LJLIL;
    public final int LJLILLLLZI;
    public final ARunnableS37S0100000_1 LJLJI = new ARunnableS37S0100000_1(this, 84);
    public int LJLJJI;
    public final FrameLayout LJLJJL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onHostDestroy();
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        if (!isShowing()) {
            return;
        }
        Context context = this.LJLIL;
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        Context context2 = this.LJLIL;
        if ((context2 instanceof Activity) && ((Activity) context2).isDestroyed()) {
            return;
        }
        super.dismiss();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onHostDestroy() {
        dismiss();
        getContentView().removeCallbacks(this.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SilentSharePopupWindow(Context context, String str, int i) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        this.LJLIL = context;
        this.LJLILLLLZI = i;
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cm_, C16880lQ.LLZIL(context), null);
        View findViewById = LLLZIIL.findViewById(R.id.m2v);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_content)");
        TextView textView = (TextView) findViewById;
        textView.setText(str);
        textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dk, context));
        textView.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.eh, context));
        View findViewById2 = LLLZIIL.findViewById(R.id.dga);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.fl_root_container)");
        this.LJLJJL = (FrameLayout) findViewById2;
        setContentView(LLLZIIL);
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.la);
        setBackgroundDrawable(new ColorDrawable(0));
        LLLZIIL.measure(0, 0);
        this.LJLJJI = LLLZIIL.getMeasuredHeight();
        LLLZIIL.getMeasuredWidth();
    }

    public static void LIZ(SilentSharePopupWindow silentSharePopupWindow, View view, int i) {
        Context context = silentSharePopupWindow.LJLIL;
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        int i2 = -(view.getHeight() + silentSharePopupWindow.LJLJJI + silentSharePopupWindow.LJLILLLLZI);
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(silentSharePopupWindow));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i3 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                silentSharePopupWindow.showAsDropDown(view, i, i2, 51);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i3;
            } catch (Throwable unused) {
                silentSharePopupWindow.showAsDropDown(view, i, i2, 51);
            }
        } else {
            silentSharePopupWindow.showAsDropDown(view, i, i2, 51);
        }
        silentSharePopupWindow.getContentView().removeCallbacks(silentSharePopupWindow.LJLJI);
        silentSharePopupWindow.getContentView().postDelayed(silentSharePopupWindow.LJLJI, 5000L);
    }
}
