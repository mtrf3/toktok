package X;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyPeriodDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyPeriodIntervalSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CHL implements Runnable {
    public final Handler LJLIL;
    public final CHP LJLILLLLZI;
    public boolean LJLJI;

    public final void LIZ() {
        if (this.LJLJI) {
            CHP chp = this.LJLILLLLZI;
            if (chp != null) {
                chp.start();
            }
            this.LJLJI = false;
            this.LJLIL.postDelayed(this, LiveFluencyPeriodDurationSetting.INSTANCE.getValue());
            return;
        }
        CHP chp2 = this.LJLILLLLZI;
        if (chp2 != null) {
            chp2.stop();
        }
        this.LJLJI = true;
        this.LJLIL.postDelayed(this, LiveFluencyPeriodIntervalSetting.INSTANCE.getValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public CHL(Handler handler, CHK chk) {
        o.LJIIIZ(handler, "handler");
        this.LJLIL = handler;
        this.LJLILLLLZI = chk;
        this.LJLJI = true;
    }
}
