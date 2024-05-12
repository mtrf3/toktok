package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.zhiliaoapp.musically.R;

/* renamed from: X.LOa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54176LOa extends C16120kC {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ C86904Y8u LIZIZ;

    public C54176LOa(C86904Y8u c86904Y8u, int i) {
        this.LIZIZ = c86904Y8u;
        this.LIZ = i;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        c17760mq.LJJIFFI(this.LIZIZ.getContext().getResources().getString(R.string.b25));
        c17760mq.LJIIZILJ(new C17740mo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, this.LIZ, 1, false)));
    }
}
