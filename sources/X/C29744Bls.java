package X;

import android.view.View;
import android.widget.Button;
import kotlin.jvm.internal.o;

/* renamed from: X.Bls, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29744Bls extends C16120kC {
    public final /* synthetic */ String LIZ;

    public C29744Bls(String str) {
        this.LIZ = str;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIJ(this.LIZ);
        info.LJIILJJIL(Button.class.getName());
    }
}
