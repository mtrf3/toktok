package Y;

import X.C15W;
import X.C15Y;
import X.C16880lQ;
import X.C44831pP;
import X.DialogC77438UaI;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;

/* loaded from: classes.dex */
public class IDCallbackS366S0100000 implements Handler.Callback {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                return handleMessage$0(this, message);
            case 1:
                return handleMessage$1(this, message);
            default:
                return false;
        }
    }

    public IDCallbackS366S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean handleMessage$0(IDCallbackS366S0100000 iDCallbackS366S0100000, Message message) {
        C15W c15w = (C15W) message.obj;
        if (c15w.LIZLLL == null) {
            c15w.LIZLLL = C16880lQ.LLLLIILL(((C15Y) iDCallbackS366S0100000.l0).LIZ, c15w.LIZJ, c15w.LIZIZ, false);
        }
        c15w.LJ.onInflateFinished(c15w.LIZLLL, c15w.LIZJ, c15w.LIZIZ);
        C44831pP c44831pP = ((C15Y) iDCallbackS366S0100000.l0).LIZJ;
        c44831pP.getClass();
        c15w.LJ = null;
        c15w.LIZ = null;
        c15w.LIZIZ = null;
        c15w.LIZJ = 0;
        c15w.LIZLLL = null;
        c44831pP.LJLILLLLZI.LIZ(c15w);
        return true;
    }

    public static final boolean handleMessage$1(IDCallbackS366S0100000 iDCallbackS366S0100000, Message message) {
        DialogC77438UaI dialogC77438UaI;
        CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) iDCallbackS366S0100000.l0;
        copyrightViolationHelper.getClass();
        int i = message.what;
        if (i == 1) {
            DialogC77438UaI dialogC77438UaI2 = copyrightViolationHelper.LJLILLLLZI;
            if (dialogC77438UaI2 != null && !dialogC77438UaI2.isShowing()) {
                C16880lQ.LIZ(copyrightViolationHelper.LJLILLLLZI);
                return true;
            }
        } else if (i == 2 && (dialogC77438UaI = copyrightViolationHelper.LJLJI) != null && !dialogC77438UaI.isShowing()) {
            copyrightViolationHelper.LJLJLJ.run();
            return true;
        }
        return false;
    }
}
