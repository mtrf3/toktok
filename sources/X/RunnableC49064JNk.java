package X;

import android.text.PrecomputedText;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.JNk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC49064JNk implements Runnable {
    public final /* synthetic */ WeakReference<TextView> LJLIL;
    public final /* synthetic */ PrecomputedText LJLILLLLZI;

    public RunnableC49064JNk(WeakReference<TextView> weakReference, PrecomputedText precomputedText) {
        this.LJLIL = weakReference;
        this.LJLILLLLZI = precomputedText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            TextView textView = this.LJLIL.get();
            if (textView != null) {
                textView.setText(this.LJLILLLLZI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
