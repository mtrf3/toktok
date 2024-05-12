package X;

import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.ARi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26234ARi extends C16120kC {
    public final /* synthetic */ FrameLayout LIZ;

    public C26234ARi(FrameLayout frameLayout) {
        this.LIZ = frameLayout;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        FrameLayout frameLayout = this.LIZ;
        if (Build.VERSION.SDK_INT >= 22) {
            info.LIZ.setTraversalBefore(frameLayout);
        }
    }
}
