package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C08630Vn;
import X.C131555Eh;
import X.C136745Yg;
import X.C52V;
import X.C76800UCe;
import X.InterfaceC29911Fj;
import X.InterfaceC88472Yns;
import X.OSJ;
import androidx.lifecycle.LiveData;

/* loaded from: classes3.dex */
public class AqS0S0120000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S0120000_2 aqS0S0120000_2, Object obj) {
        ((Boolean) obj).booleanValue();
        C136745Yg c136745Yg = (C136745Yg) aqS0S0120000_2.l0;
        LiveData<Void> wf0 = c136745Yg.LJJLIIIIJ().wf0();
        final C136745Yg c136745Yg2 = (C136745Yg) aqS0S0120000_2.l0;
        final boolean z = aqS0S0120000_2.z1;
        final boolean z2 = aqS0S0120000_2.z2;
        wf0.observe(c136745Yg, new InterfaceC29911Fj() { // from class: X.5Yh
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj2) {
                if (!C44701HgX.LJIIJJI(C136745Yg.this.LJJLIIIJJIZ().creativeModel) && z && z2) {
                    C136745Yg.this.LJLJJI.LJII(Boolean.TRUE);
                }
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S0120000_2 aqS0S0120000_2, Object obj) {
        C131555Eh setState = (C131555Eh) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C131555Eh.LIZ(setState, 0L, 0L, null, null, null, new C08630Vn(new OSJ((C52V) aqS0S0120000_2.l0, Boolean.valueOf(aqS0S0120000_2.z1), Boolean.valueOf(aqS0S0120000_2.z2))), null, 95);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0120000_2(C52V c52v, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c52v;
        this.z1 = z;
        this.z2 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0120000_2(C136745Yg c136745Yg, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c136745Yg;
        this.z1 = z;
        this.z2 = z2;
    }
}
