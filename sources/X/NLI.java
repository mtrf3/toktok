package X;

import Y.ARunnableS46S0100000_10;
import android.os.Handler;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.commercialize.model.AdFeInteractionModel;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class NLI extends NLH {
    public boolean LJLLLL;
    public boolean LJLLLLLL;

    @Override // X.NLH, X.InterfaceC59347NQx
    public final void LIZ() {
        if (this.LJLLLL) {
            this.LJLLLLLL = true;
            this.LJLLLL = false;
            AdFeInteractionModel LIZ = NHM.LIZIZ.LIZ(this.LJLILLLLZI);
            if (LIZ != null) {
                long hideTime = LIZ.getHideTime();
                if (hideTime > 0) {
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS46S0100000_10(this, 199), hideTime);
                    return;
                }
                return;
            }
            return;
        }
        super.LIZ();
    }

    @Override // X.NLH
    public final void LJI() {
        super.LJI();
        this.LJLLLL = false;
        this.LJLLLLLL = false;
    }

    public NLI(ViewStub viewStub) {
        super(viewStub);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void longPressEggStatusEvent(IP5 event) {
        o.LJIIIZ(event, "event");
        if (!this.LJLJLJ) {
            return;
        }
        String str = event.LJLIL;
        if (o.LJ(str, "touch_start")) {
            this.LJLLLL = true;
            return;
        }
        if (!o.LJ(str, "touch_end")) {
            return;
        }
        this.LJLLLL = false;
        if (!this.LJLLLLLL) {
            return;
        }
        LIZ();
        this.LJLLLLLL = false;
    }
}
