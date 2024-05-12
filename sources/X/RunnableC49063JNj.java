package X;

import android.text.PrecomputedText;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.JNj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC49063JNj implements Runnable {
    public final /* synthetic */ WeakReference<TextView> LJLIL;
    public final /* synthetic */ CharSequence LJLILLLLZI;
    public final /* synthetic */ PrecomputedText.Params LJLJI;

    public RunnableC49063JNj(WeakReference<TextView> weakReference, CharSequence charSequence, PrecomputedText.Params params) {
        this.LJLIL = weakReference;
        this.LJLILLLLZI = charSequence;
        this.LJLJI = params;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            TextView textView = this.LJLIL.get();
            if (textView != null) {
                textView.post(new RunnableC49064JNk(this.LJLIL, PrecomputedText.create(this.LJLILLLLZI, this.LJLJI)));
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
