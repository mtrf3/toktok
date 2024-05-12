package X;

import android.app.Activity;
import com.bytedance.bae.router.AudioRouteDeviceManager;
import kotlin.jvm.internal.o;

/* renamed from: X.PkH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC65317PkH implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                ((AudioRouteDeviceManager) this.LJLILLLLZI).bluetoothScoConnectionCheck();
                return;
            case 1:
                ((EnumC84152X0y) this.LJLILLLLZI).mCameraInstance = null;
                return;
            case 2:
                C59436NUi.LIZIZ = ((NQP) this.LJLILLLLZI).LIZ();
                return;
            default:
                Activity this$0 = (Activity) this.LJLILLLLZI;
                o.LJIIIZ(this$0, "this$0");
                if (!this$0.isFinishing()) {
                    this$0.isDestroyed();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC65317PkH(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
