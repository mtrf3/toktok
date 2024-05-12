package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LON extends C16120kC {
    public final /* synthetic */ int LIZ;

    public LON(int i) {
        this.LIZ = i;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL(Button.class.getName());
        info.LJIIZILJ(new C17740mo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, this.LIZ, 1, false)));
    }
}
