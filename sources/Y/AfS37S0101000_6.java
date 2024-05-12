package Y;

import X.C16880lQ;
import X.InterfaceC64592gB;
import android.content.Context;
import android.os.Handler;
import com.bytedance.liko.leakdetector.LeakDetectorInstaller;
import com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate;

/* loaded from: classes7.dex */
public class AfS37S0101000_6 implements InterfaceC64592gB {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS37S0101000_6 afS37S0101000_6, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            LeakDetectorInstaller leakDetectorInstaller = LeakDetectorInstaller.INSTANCE;
            if (!leakDetectorInstaller.getHasExcuteBackgroud()) {
                leakDetectorInstaller.setHasExcuteBackgroud(true);
                leakDetectorInstaller.excuteStrategy((Context) afS37S0101000_6.l0, afS37S0101000_6.i1);
            }
        }
    }

    public static final void accept$1(AfS37S0101000_6 afS37S0101000_6, Object obj) {
        if (!((X2CBaseInflate) afS37S0101000_6.l0).LJLJI && obj.hashCode() == afS37S0101000_6.i1) {
            X2CBaseInflate x2CBaseInflate = (X2CBaseInflate) afS37S0101000_6.l0;
            x2CBaseInflate.LJLJI = true;
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS42S0100000_6(x2CBaseInflate, 157));
        }
    }

    public AfS37S0101000_6(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
