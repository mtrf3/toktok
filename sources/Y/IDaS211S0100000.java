package Y;

import X.C0NB;
import X.C0PX;
import X.C0W0;
import X.C18280ng;
import X.C1VH;
import X.C29306Beo;
import X.C30922CBq;
import X.C42111l1;
import X.InterfaceC29937Boz;
import X.X1D;
import com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS420S0100000;
import webcast.api.game.TnsPiracyDetail;

/* loaded from: classes.dex */
public class IDaS211S0100000 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS211S0100000 iDaS211S0100000) {
        ((C0PX) iDaS211S0100000.l0).LIZIZ();
        C29306Beo.LJJJIL(new IDqS420S0100000((C0PX) iDaS211S0100000.l0, 76));
    }

    public static final void run$1(IDaS211S0100000 iDaS211S0100000) {
        ((GamePreparationNetworkSpeedDetectionDialog) iDaS211S0100000.l0).Ol(0L, true);
    }

    public static final void run$2(IDaS211S0100000 iDaS211S0100000) {
        C42111l1 c42111l1 = (C42111l1) iDaS211S0100000.l0;
        C0W0 c0w0 = C0W0.DISCONNECT_TYPE_ON_SPEED_TEST_TIME_DELAY;
        c42111l1.LJ(c0w0.getCode(), c0w0.getMessage());
    }

    public static final void run$3(IDaS211S0100000 iDaS211S0100000) {
        ((C1VH) iDaS211S0100000.l0).LJIIJ(true);
    }

    public static final void run$4(IDaS211S0100000 iDaS211S0100000) {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MobileGameTnsSignalReporter. report(). onComplete! ThreadName=");
            LIZ.append(C18280ng.LIZ());
            C0NB.LJIIIZ("MobileGameTnsSignalReporter", X1D.LIZIZ(LIZ));
        }
        Iterator it = ((List) iDaS211S0100000.l0).iterator();
        while (it.hasNext()) {
            C18280ng.LIZJ((TnsPiracyDetail) it.next());
            it.remove();
        }
    }

    public IDaS211S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
