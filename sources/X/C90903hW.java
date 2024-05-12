package X;

import android.view.View;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.3hW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90903hW {
    public static void LIZ(C29S c29s) {
        if (c29s == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(c29s.getWindow().getDecorView(), c29s);
        ViewTreeViewModelStoreOwner.set(c29s.getWindow().getDecorView(), c29s);
        View decorView = c29s.getWindow().getDecorView();
        o.LJIIIIZZ(decorView, "act.window.decorView");
        C10A.LIZIZ(decorView, c29s);
    }
}
