package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.B4E;
import X.B4L;
import X.C0NB;
import X.C16880lQ;
import X.C76120Tu8;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC75579TlP;
import X.UC4;
import X.UCC;
import X.X1D;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayoutKt;

/* loaded from: classes14.dex */
public class AqS12S0202000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handle IO finished scene=");
        LIZ.append(this.i2);
        LIZ.append(" version=");
        LIZ.append(this.i3);
        LIZ.append(' ');
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        C0NB.LJIIIZ("LiveDslManagerV2", X1D.LIZIZ(LIZ));
        UC4 uc4 = (UC4) this.l0;
        DslLayout dslLayout = ((UCC) this.l1).LIZIZ.get(UCC.LJI(this.i2, this.i3));
        if (dslLayout == null) {
            dslLayout = DslLayoutKt.getDefaultDsl();
        }
        o.LJIIIIZZ(dslLayout, "cache[key(scene, version)] ?: getDefaultDsl()");
        uc4.LIZ(dslLayout);
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS12S0202000_13 aqS12S0202000_13) {
        aqS12S0202000_13.invoke$0();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS12S0202000_13 aqS12S0202000_13) {
        View view = (View) aqS12S0202000_13.l0;
        if ((view instanceof B4E) && (view instanceof B4L)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("textureView ");
            LIZ.append((View) aqS12S0202000_13.l0);
            LIZ.append(' ');
            LIZ.append(aqS12S0202000_13.i2);
            LIZ.append(' ');
            LIZ.append(aqS12S0202000_13.i3);
            C76120Tu8.LJIILJJIL(X1D.LIZIZ(LIZ));
            InterfaceC75579TlP interfaceC75579TlP = ((C76120Tu8) aqS12S0202000_13.l1).LJLJL;
            if (interfaceC75579TlP != null) {
                interfaceC75579TlP.o1((View) aqS12S0202000_13.l0);
            }
            C76120Tu8 c76120Tu8 = (C76120Tu8) aqS12S0202000_13.l1;
            View view2 = (View) aqS12S0202000_13.l0;
            c76120Tu8.LJLJLLL = (B4L) view2;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            C76120Tu8 c76120Tu82 = (C76120Tu8) aqS12S0202000_13.l1;
            c76120Tu82.LJLL = layoutParams;
            c76120Tu82.LJLZ = aqS12S0202000_13.i3;
            c76120Tu82.LJZ = aqS12S0202000_13.i2;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S0202000_13(int i, int i2, UC4 uc4, UCC ucc, int i3) {
        super(0);
        this.$t = i3;
        this.i2 = i;
        this.i3 = i2;
        this.l0 = uc4;
        this.l1 = ucc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S0202000_13(View view, C76120Tu8 c76120Tu8, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = view;
        this.l1 = c76120Tu8;
        this.i2 = i;
        this.i3 = i2;
    }
}
