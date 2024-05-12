package X;

import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;

/* loaded from: classes5.dex */
public final class A81 implements OnActivityResultCallback {
    public final /* synthetic */ A85 LJLIL;

    public A81(A85 a85) {
        this.LJLIL = a85;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (!this.LJLIL.LIZJ.isFinishing() && !this.LJLIL.LIZJ.isDestroyed()) {
            this.LJLIL.LIZ().gv0();
        }
    }
}
