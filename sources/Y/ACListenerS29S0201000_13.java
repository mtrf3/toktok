package Y;

import X.C75093TdZ;
import X.C76800UCe;
import X.C77584Uce;
import X.C77596Ucq;
import X.C77680UeC;
import X.C78800UwG;
import X.C78801UwH;
import X.C78820Uwa;
import X.InterfaceC75119Tdz;
import X.InterfaceC88472Yns;
import X.UF7;
import X.UF8;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;

/* loaded from: classes14.dex */
public class ACListenerS29S0201000_13 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS29S0201000_13 aCListenerS29S0201000_13, View view) {
        C77596Ucq c77596Ucq = (C77596Ucq) aCListenerS29S0201000_13.l0;
        c77596Ucq.LJLILLLLZI.LIZ(aCListenerS29S0201000_13.i2, c77596Ucq.LJLJI.vv0());
        C77680UeC.LIZ(((C77584Uce) aCListenerS29S0201000_13.l1).LJLJJI);
    }

    public static final void onClick$1(ACListenerS29S0201000_13 aCListenerS29S0201000_13, View view) {
        UF8 uf8 = (UF8) aCListenerS29S0201000_13.l0;
        if (uf8 != null) {
            ((UF7) aCListenerS29S0201000_13.l1).LJLIL.invoke(uf8, Integer.valueOf(aCListenerS29S0201000_13.i2));
        }
    }

    public static final void onClick$2(ACListenerS29S0201000_13 aCListenerS29S0201000_13, View view) {
        InterfaceC88472Yns<C78820Uwa, C76800UCe> interfaceC88472Yns = ((C78800UwG) aCListenerS29S0201000_13.l0).LJLJJI;
        String str = ((C78801UwH) aCListenerS29S0201000_13.l1).LIZ;
        interfaceC88472Yns.invoke(new C78820Uwa(str, aCListenerS29S0201000_13.i2, str, -1, null));
    }

    public static final void onClick$3(ACListenerS29S0201000_13 aCListenerS29S0201000_13, View view) {
        InterfaceC75119Tdz interfaceC75119Tdz = ((C75093TdZ) aCListenerS29S0201000_13.l0).LJLILLLLZI;
        if (interfaceC75119Tdz != null) {
            interfaceC75119Tdz.LJIIIIZZ(aCListenerS29S0201000_13.i2, (LinkPlayerInfo) aCListenerS29S0201000_13.l1);
        }
    }

    public static final void onClick$4(ACListenerS29S0201000_13 aCListenerS29S0201000_13, View view) {
        InterfaceC75119Tdz interfaceC75119Tdz = ((C75093TdZ) aCListenerS29S0201000_13.l0).LJLILLLLZI;
        if (interfaceC75119Tdz != null) {
            interfaceC75119Tdz.LJIIJJI(aCListenerS29S0201000_13.i2, (LinkPlayerInfo) aCListenerS29S0201000_13.l1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$5(Y.ACListenerS29S0201000_13 r8, android.view.View r9) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS29S0201000_13.onClick$5(Y.ACListenerS29S0201000_13, android.view.View):void");
    }

    public ACListenerS29S0201000_13(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
