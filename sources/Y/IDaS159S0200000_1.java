package Y;

import X.C34K;
import X.C44D;
import X.C99033ud;
import X.InterfaceC29937Boz;
import X.InterfaceC88472Yns;
import android.widget.EditText;

/* loaded from: classes2.dex */
public class IDaS159S0200000_1 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    public static final void run$0(IDaS159S0200000_1 iDaS159S0200000_1) {
        if (((C99033ud) iDaS159S0200000_1.l0).isReportPage()) {
            ((C44D) iDaS159S0200000_1.l1).LIZJ.remove(((C99033ud) iDaS159S0200000_1.l0).getConversationId());
        } else {
            ((C44D) iDaS159S0200000_1.l1).LIZIZ.remove(((C99033ud) iDaS159S0200000_1.l0).getConversationId());
        }
    }

    public static final void run$1(IDaS159S0200000_1 iDaS159S0200000_1) {
        ((EditText) iDaS159S0200000_1.l0).removeTextChangedListener((IDObjectS174S0100000_1) iDaS159S0200000_1.l1);
    }

    public static final void run$2(IDaS159S0200000_1 iDaS159S0200000_1) {
        ((InterfaceC88472Yns) iDaS159S0200000_1.l0).invoke(Boolean.valueOf(((C34K) iDaS159S0200000_1.l1).element));
    }

    public IDaS159S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
