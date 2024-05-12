package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A92 extends C16120kC {
    public CharSequence LIZ;
    public Runnable LIZIZ;

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL(ProgressBar.class.getName());
        if (this.LIZIZ != null) {
            info.LJIILL(true);
            info.LIZIZ(new C17720mm(16, this.LIZ));
        }
    }

    @Override // X.C16120kC
    public final boolean performAccessibilityAction(View host, int i, Bundle bundle) {
        o.LJIIIZ(host, "host");
        Runnable runnable = this.LIZIZ;
        if (i == 16 && runnable != null) {
            runnable.run();
            return true;
        }
        return super.performAccessibilityAction(host, i, bundle);
    }
}
