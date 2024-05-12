package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LOM extends C16120kC {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ int LIZIZ;

    public LOM(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJJIFFI(this.LIZ);
        info.LJIIZILJ(new C17740mo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, this.LIZIZ, 1, false)));
    }
}
