package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

/* renamed from: X.44H, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44H {
    public static boolean LIZ() {
        if (AnonymousClass449.LJII || AnonymousClass449.LJFF) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(LifecycleOwner lifecycleOwner, Observer observer) {
        if (lifecycleOwner != null) {
            C57082Lw.LIZ.LIZIZ("#TakoTypingEvent").observe(lifecycleOwner, observer);
        } else {
            C57082Lw.LIZ.LIZIZ("#TakoTypingEvent").observeForever(observer);
        }
    }
}
