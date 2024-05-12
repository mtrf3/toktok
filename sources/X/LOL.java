package X;

import android.view.View;
import android.widget.Button;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LOL extends C16120kC {
    public static final LOL LIZ = new LOL();

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL(Button.class.getName());
    }
}
