package Y;

import X.C221018lt;
import X.HH1;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC88473Ynt;
import X.MDH;
import X.MS5;
import X.X1D;

/* loaded from: classes10.dex */
public class AfS0S0112000_9 implements InterfaceC64592gB {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public boolean z1;

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

    public static final void accept$0(AfS0S0112000_9 afS0S0112000_9, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("performUnsubscribe success group = ");
        LIZ.append(afS0S0112000_9.i2);
        LIZ.append(", category = ");
        LIZ.append(afS0S0112000_9.i3);
        LIZ.append(", isUnsubscribe = ");
        HH1.LIZIZ(LIZ, afS0S0112000_9.z1, LIZ, "SNUnsubscribeSheetHelper");
        MS5.LIZ(new MDH(afS0S0112000_9.i2, afS0S0112000_9.i3, afS0S0112000_9.z1));
        ((InterfaceC88473Ynt) afS0S0112000_9.l0).invoke(Integer.valueOf(afS0S0112000_9.i2), Integer.valueOf(afS0S0112000_9.i3), Boolean.valueOf(afS0S0112000_9.z1));
    }

    public static final void accept$1(AfS0S0112000_9 afS0S0112000_9, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("performUnsubscribe error group = ");
        LIZ.append(afS0S0112000_9.i2);
        LIZ.append(", category = ");
        LIZ.append(afS0S0112000_9.i3);
        LIZ.append(", isUnsubscribe = ");
        LIZ.append(afS0S0112000_9.z1);
        LIZ.append(", message = ");
        LIZ.append(((Throwable) obj).getMessage());
        C221018lt.LJFF("SNUnsubscribeSheetHelper", X1D.LIZIZ(LIZ));
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS0S0112000_9.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public AfS0S0112000_9(int i, int i2, Object obj, boolean z, int i3) {
        this.$t = i3;
        this.i2 = i;
        this.i3 = i2;
        this.z1 = z;
        this.l0 = obj;
    }
}
