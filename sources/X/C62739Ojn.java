package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Ojn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62739Ojn extends C16120kC {
    public final /* synthetic */ C62738Ojm LIZ;
    public final /* synthetic */ Dialog LIZIZ;

    public C62739Ojn(C62738Ojm c62738Ojm, Dialog dialog) {
        this.LIZ = c62738Ojm;
        this.LIZIZ = dialog;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (this.LIZ.LJLILLLLZI) {
            info.LIZ(1048576);
            info.LJIJI(true);
        } else {
            info.LJIJI(false);
        }
    }

    @Override // X.C16120kC
    public final boolean performAccessibilityAction(View host, int i, Bundle bundle) {
        o.LJIIIZ(host, "host");
        if (i == 1048576 && this.LIZ.LJLILLLLZI) {
            this.LIZIZ.cancel();
            return true;
        }
        return super.performAccessibilityAction(host, i, bundle);
    }
}
