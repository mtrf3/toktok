package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFL;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ReleaseWindowBackgroundTask implements EE1 {
    public final WeakReference<Activity> LJLIL;

    @Override // X.EEY
    public final String key() {
        return "ReleaseWindowBackgroundTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    public ReleaseWindowBackgroundTask(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = new WeakReference<>(activity);
    }

    @Override // X.EEY
    public final void run(Context context) {
        WeakReference<Activity> weakReference;
        Activity activity;
        Window window;
        View decorView;
        o.LJIIIZ(context, "context");
        FFL.LJIIIZ().getClass();
        Drawable drawable = null;
        if (!FFL.LJ(31744, "is_release_window_background", true, true) && (weakReference = this.LJLIL) != null && (activity = weakReference.get()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            drawable = decorView.getBackground();
        }
        try {
            Object LLILL = C16880lQ.LLILL(C16880lQ.LLLLL(context), "input_method");
            o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) LLILL;
            if (inputMethodManager != null) {
                try {
                    Field declaredField = inputMethodManager.getClass().getDeclaredField("mCurRootView");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(inputMethodManager);
                    if (obj != null && (obj instanceof View)) {
                        Field declaredField2 = obj.getClass().getDeclaredField("mResizingBackgroundDrawable");
                        declaredField2.setAccessible(true);
                        declaredField2.set(obj, drawable);
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
