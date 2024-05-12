package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.VUe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79816VUe extends C16120kC {
    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View child, C17760mq info) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(child, info);
        if (C16300kU.LIZJ(child) != 4 && C16300kU.LIZJ(child) != 2) {
            return;
        }
        info.LJJI(null);
    }
}
