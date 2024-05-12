package X;

import Y.ARunnableS12S0300000_1;
import android.app.Activity;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.o;

/* renamed from: X.2ly, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68182ly {
    public static final void LIZ(LifecycleOwner lifecycleOwner, LifecycleObserver observer) {
        Lifecycle lifecycle;
        o.LJIIIZ(observer, "observer");
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.addObserver(observer);
                return;
            }
            return;
        }
        XKX.LJ(C36636EZk.LIZ, new C68172lx(lifecycleOwner, observer, null));
    }

    public static final void LIZLLL(LifecycleOwner lifecycleOwner, LifecycleObserver observer) {
        Lifecycle lifecycle;
        o.LJIIIZ(observer, "observer");
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(observer);
                return;
            }
            return;
        }
        XKX.LJ(C36636EZk.LIZ, new C68192lz(lifecycleOwner, observer, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(MutableLiveData mutableLiveData, LifecycleOwner lifecycleOwner, Observer observer) {
        o.LJIIIZ(observer, "observer");
        if (mutableLiveData == null || lifecycleOwner == 0) {
            return;
        }
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            mutableLiveData.observe(lifecycleOwner, observer);
        } else if (lifecycleOwner instanceof Activity) {
            ((Activity) lifecycleOwner).runOnUiThread(new ARunnableS12S0300000_1(mutableLiveData, lifecycleOwner, observer, 11));
        } else {
            XKX.LJ(C36636EZk.LIZ, new C63172dt(mutableLiveData, lifecycleOwner, observer, null));
        }
    }

    public static final void LIZJ(MutableLiveData mutableLiveData, LifecycleOwner lifecycleOwner, Observer observer) {
        o.LJIIIZ(observer, "observer");
        if (mutableLiveData == null || lifecycleOwner == null) {
            return;
        }
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            mutableLiveData.observe(lifecycleOwner, observer);
        } else {
            C1DH.LJJIJIIJI(new ARunnableS12S0300000_1(mutableLiveData, lifecycleOwner, observer, 12));
        }
    }
}
