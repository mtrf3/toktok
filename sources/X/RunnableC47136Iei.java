package X;

import android.view.View;
import com.bytedance.bae.router.AudioRouteDeviceManager;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Iei, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class RunnableC47136Iei implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                ((AudioRouteDeviceManager) this.LJLILLLLZI).bluetoothScoDisconnectionForNormalMode();
                return;
            case 1:
                ((HashMap) IJZ.LIZ).remove(this.LJLILLLLZI);
                return;
            case 2:
                C1545664u c1545664u = (C1545664u) this.LJLILLLLZI;
                View view = c1545664u.LJLJJI;
                if (view != null && c1545664u.LJLJI != null && c1545664u.LJLILLLLZI != null) {
                    view.getLocationInWindow(new int[2]);
                    int[] iArr = new int[2];
                    c1545664u.LJLJI.getLocationInWindow(iArr);
                    c1545664u.LJLILLLLZI.getLocationInWindow(new int[2]);
                    int i = iArr[1];
                    c1545664u.LJLJJI.setY(((i - r2.getHeight()) - C17N.LJIILL(2.0d)) - r5[1]);
                    return;
                }
                return;
            case 3:
                ((C66Y) this.LJLILLLLZI).LJZI.LIZJ();
                return;
            default:
                C46985IcH this$0 = (C46985IcH) this.LJLILLLLZI;
                o.LJIIIZ(this$0, "this$0");
                this$0.LIZIZ.run();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('[');
                SimRadar.keyScan("CBOF", JBR.LJFF(LIZ, this$0.LIZ, "] executed", LIZ), new Object[0]);
                return;
        }
    }

    public /* synthetic */ RunnableC47136Iei(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
