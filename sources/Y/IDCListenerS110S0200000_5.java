package Y;

import X.C30779C6d;
import X.C68322mC;
import X.CQO;
import X.CQQ;
import X.CR6;
import X.CSE;
import X.CUG;
import X.CUH;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDCListenerS110S0200000_5 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(IDCListenerS110S0200000_5 iDCListenerS110S0200000_5, View view) {
        CQQ cqq = (CQQ) iDCListenerS110S0200000_5.l0;
        if (cqq != null) {
            CQO<? extends CR6> cqo = ((CUH) iDCListenerS110S0200000_5.l1).LJLJJI;
            C30779C6d c30779C6d = new C30779C6d();
            CUH cuh = (CUH) iDCListenerS110S0200000_5.l1;
            c30779C6d.LJFF = "comment";
            String a0 = cuh.a0();
            o.LJIIIZ(a0, "<set-?>");
            c30779C6d.LIZ = a0;
            c30779C6d.LIZIZ = "long_press";
            cqq.LJIIJ.LJJIIZ(cqo, c30779C6d);
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onLongClick$1(IDCListenerS110S0200000_5 iDCListenerS110S0200000_5, View view) {
        CSE cse = (CSE) iDCListenerS110S0200000_5.l0;
        CQQ cqq = cse.LJLILLLLZI;
        if (cqq != null) {
            CQO<? extends CR6> cqo = cse.LJLJI;
            C30779C6d c30779C6d = new C30779C6d();
            String str = (String) ((C68322mC) iDCListenerS110S0200000_5.l1).element;
            o.LJIIIZ(str, "<set-?>");
            c30779C6d.LJFF = str;
            c30779C6d.LIZ = "report_user";
            c30779C6d.LIZIZ = "long_press";
            cqq.LJIIJ.LJJIIZ(cqo, c30779C6d);
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onLongClick$2(IDCListenerS110S0200000_5 iDCListenerS110S0200000_5, View view) {
        CUG cug = (CUG) iDCListenerS110S0200000_5.l0;
        CQQ cqq = cug.LJLIL;
        if (cqq != null) {
            CQO<? extends CR6> cqo = cug.LJLJJI;
            C30779C6d c30779C6d = new C30779C6d();
            C68322mC c68322mC = (C68322mC) iDCListenerS110S0200000_5.l1;
            CUG cug2 = (CUG) iDCListenerS110S0200000_5.l0;
            String str = (String) c68322mC.element;
            o.LJIIIZ(str, "<set-?>");
            c30779C6d.LJFF = str;
            cug2.getClass();
            c30779C6d.LIZ = "report_user";
            c30779C6d.LIZIZ = "long_press";
            cqq.LJIIJ.LJJIIZ(cqo, c30779C6d);
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDCListenerS110S0200000_5(Object obj, CQQ cqq, CUH<MODEL, PINNED_MODEL> cuh) {
        this.$t = cuh;
        this.l0 = obj;
        this.l1 = cqq;
    }
}
