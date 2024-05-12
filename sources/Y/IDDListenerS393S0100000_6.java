package Y;

import X.C34710Djm;
import X.C39739Fih;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;

/* loaded from: classes7.dex */
public class IDDListenerS393S0100000_6 implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(IDDListenerS393S0100000_6 iDDListenerS393S0100000_6) {
        int i;
        C39739Fih c39739Fih = (C39739Fih) iDDListenerS393S0100000_6.l0;
        c39739Fih.getClass();
        if (!((Boolean) C34710Djm.LJJIJIIJI.getValue()).booleanValue() || (i = c39739Fih.LJ) == 0 || c39739Fih.LIZJ) {
            return true;
        }
        c39739Fih.LJ = i - 1;
        return false;
    }

    public static final boolean onPreDraw$1(IDDListenerS393S0100000_6 iDDListenerS393S0100000_6) {
        if (!((MainLooperOptService) iDDListenerS393S0100000_6.l0).LJZL && ((Boolean) C34710Djm.LJJIIZ.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public IDDListenerS393S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
