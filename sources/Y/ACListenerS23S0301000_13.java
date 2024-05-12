package Y;

import X.C76800UCe;
import X.C78788Uw4;
import X.C78789Uw5;
import X.C78790Uw6;
import X.C78820Uwa;
import X.EnumC78125UlN;
import X.InterfaceC88472Yns;
import X.UHH;
import X.UHI;
import X.UHJ;
import android.view.View;
import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes14.dex */
public class ACListenerS23S0301000_13 implements View.OnClickListener {
    public final int $t;
    public int i3;
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

    public static final void onClick$0(ACListenerS23S0301000_13 aCListenerS23S0301000_13, View view) {
        UHH uhh = (UHH) aCListenerS23S0301000_13.l0;
        int i = uhh.LJLILLLLZI;
        if (i >= uhh.LJLJI) {
            if (!((UHI) aCListenerS23S0301000_13.l1).LJLJJI.isChecked()) {
                UHJ uhj = ((UHH) aCListenerS23S0301000_13.l0).LJLJLLL;
                if (uhj != null) {
                    uhj.LIZIZ((LocationObject) ListProtector.get((List) aCListenerS23S0301000_13.l2, aCListenerS23S0301000_13.i3));
                }
                UHH uhh2 = (UHH) aCListenerS23S0301000_13.l0;
                uhh2.LJLJL = aCListenerS23S0301000_13.i3;
                uhh2.notifyDataSetChanged();
                return;
            }
            return;
        }
        UHJ uhj2 = uhh.LJLJLLL;
        if (uhj2 == null) {
            return;
        }
        uhj2.LIZ(i, (LocationObject) ListProtector.get((List) aCListenerS23S0301000_13.l2, aCListenerS23S0301000_13.i3));
    }

    public static final void onClick$1(ACListenerS23S0301000_13 aCListenerS23S0301000_13, View view) {
        boolean z;
        C78788Uw4 c78788Uw4 = (C78788Uw4) aCListenerS23S0301000_13.l0;
        C78789Uw5 c78789Uw5 = (C78789Uw5) aCListenerS23S0301000_13.l1;
        C78790Uw6 c78790Uw6 = (C78790Uw6) aCListenerS23S0301000_13.l2;
        c78788Uw4.getClass();
        if (c78789Uw5.LJFF == null) {
            c78790Uw6.LJLILLLLZI.setVisibility(8);
        } else if (c78789Uw5.LJIIIZ == EnumC78125UlN.REMOTE) {
            c78790Uw6.LJLILLLLZI.setVisibility(0);
        } else {
            c78790Uw6.LJLILLLLZI.setVisibility(8);
        }
        C78788Uw4 c78788Uw42 = (C78788Uw4) aCListenerS23S0301000_13.l0;
        InterfaceC88472Yns<C78820Uwa, C76800UCe> interfaceC88472Yns = c78788Uw42.LJLJJL;
        String str = c78788Uw42.LJLILLLLZI;
        int i = c78788Uw42.LJLIL;
        int i2 = aCListenerS23S0301000_13.i3;
        C78789Uw5 c78789Uw52 = (C78789Uw5) aCListenerS23S0301000_13.l1;
        if ((!c78788Uw42.LJLJJI.isEmpty()) && !((C78789Uw5) aCListenerS23S0301000_13.l1).LJIIJ) {
            z = true;
        } else {
            z = false;
        }
        interfaceC88472Yns.invoke(new C78820Uwa(str, i, str, i2, c78789Uw52, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS23S0301000_13(Object obj, UHH uhh, UHI uhi, List<LocationObject> list, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = uhh;
        this.l2 = uhi;
        this.i3 = list;
    }
}
