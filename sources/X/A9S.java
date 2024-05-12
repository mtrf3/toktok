package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes5.dex */
public final class A9S extends C16120kC {
    public final C17720mm LIZ;

    public A9S(Context context, int i) {
        this.LIZ = new C17720mm(16, context.getString(i));
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        c17760mq.LIZIZ(this.LIZ);
    }
}
