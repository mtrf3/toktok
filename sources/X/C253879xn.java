package X;

import android.view.View;
import android.widget.Button;
import kotlin.jvm.internal.o;

/* renamed from: X.9xn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253879xn extends C16120kC {
    public final /* synthetic */ CharSequence LIZ;
    public final /* synthetic */ boolean LIZIZ;

    public C253879xn(CharSequence charSequence, boolean z) {
        this.LIZ = charSequence;
        this.LIZIZ = z;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        CharSequence charSequence = this.LIZ;
        if (charSequence != null && charSequence.length() != 0) {
            info.LJIJ(this.LIZ);
        }
        info.LJIILJJIL(Button.class.getName());
        if (!this.LIZIZ) {
            info.LJIJJ(false);
        }
    }
}
