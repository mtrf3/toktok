package X;

import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;

/* loaded from: classes5.dex */
public final class A82 implements OnActivityResultCallback {
    public final /* synthetic */ A85 LJLIL;

    public A82(A85 a85) {
        this.LJLIL = a85;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        ActivityC45651qj activityC45651qj = this.LJLIL.LIZJ;
        if (activityC45651qj != null && !activityC45651qj.isFinishing() && !this.LJLIL.LIZJ.isDestroyed()) {
            this.LJLIL.LIZ().gv0();
        }
    }
}
