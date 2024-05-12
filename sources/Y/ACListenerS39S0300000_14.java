package Y;

import X.C81975WFf;
import X.C82241WPl;
import X.InterfaceC81972WFc;
import X.InterfaceC81974WFe;
import X.WFT;
import X.WFV;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* loaded from: classes15.dex */
public class ACListenerS39S0300000_14 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS39S0300000_14 aCListenerS39S0300000_14, View view) {
        int adapterPosition = ((WFV) aCListenerS39S0300000_14.l0).getAdapterPosition();
        if (adapterPosition == -1) {
            return;
        }
        C81975WFf c81975WFf = (C81975WFf) ListProtector.get(((WFT) aCListenerS39S0300000_14.l1).LJLIL, adapterPosition);
        InterfaceC81972WFc interfaceC81972WFc = c81975WFf.LJLLI;
        if (!c81975WFf.LJLJJLL) {
            if (interfaceC81972WFc != null) {
                interfaceC81972WFc.LIZ(c81975WFf);
                return;
            }
            return;
        }
        InterfaceC81974WFe interfaceC81974WFe = c81975WFf.LJLZ;
        if (interfaceC81974WFe != null) {
            interfaceC81974WFe.LIZIZ(((WFV) aCListenerS39S0300000_14.l0).LJLIL);
        }
        if (interfaceC81972WFc != null) {
            interfaceC81972WFc.LIZLLL((View) aCListenerS39S0300000_14.l2, c81975WFf);
            if (c81975WFf.LJLLLL) {
                ((WFV) aCListenerS39S0300000_14.l0).LJLIL.setImageResource(c81975WFf.LJLILLLLZI);
                c81975WFf.LJLLLL = false;
            }
        }
    }

    public static final void onClick$1(ACListenerS39S0300000_14 aCListenerS39S0300000_14, View view) {
        C82241WPl c82241WPl = (C82241WPl) aCListenerS39S0300000_14.l0;
        c82241WPl.LJ.onNext(aCListenerS39S0300000_14.l2);
    }

    public ACListenerS39S0300000_14(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
