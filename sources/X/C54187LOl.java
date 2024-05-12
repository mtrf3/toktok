package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.LOl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54187LOl extends C16120kC {
    public final /* synthetic */ int LIZ;

    public C54187LOl(int i) {
        this.LIZ = i;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        int i = this.LIZ;
        if (i > 0) {
            info.LJIILLIIL(new C17730mn(AccessibilityNodeInfo.CollectionInfo.obtain(1, i, false)));
        }
    }
}
