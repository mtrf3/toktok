package Y;

import X.C0MT;
import X.C3C5;
import X.C43285Gyn;
import X.C5S1;
import X.C62509Og5;
import X.C62547Ogh;
import X.DialogC25756A8y;
import X.InterfaceC62225ObV;
import X.InterfaceC64592gB;
import X.InterfaceC67352kd;
import X.X1D;
import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class AfS49S0300000_10 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void accept$0(AfS49S0300000_10 afS49S0300000_10, Object obj) {
        if (C62547Ogh.LIZ(((InterfaceC62225ObV) afS49S0300000_10.l0).key())) {
            C43285Gyn.LIZ((DialogC25756A8y) afS49S0300000_10.l1);
        }
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS49S0300000_10.l2;
        C3C5.m7constructorimpl(obj);
        interfaceC67352kd.resumeWith(obj);
    }

    public static final void accept$1(AfS49S0300000_10 afS49S0300000_10, Object obj) {
        String copyText = (String) obj;
        ((DialogC25756A8y) afS49S0300000_10.l0).dismiss();
        if (((C62509Og5) afS49S0300000_10.l1).LJLJJI.length() != 0) {
            StringBuilder LIZ = X1D.LIZ();
            copyText = C0MT.LIZ(LIZ, ((C62509Og5) afS49S0300000_10.l1).LJLJJI, ' ', copyText, LIZ);
        }
        C62509Og5 c62509Og5 = (C62509Og5) afS49S0300000_10.l1;
        o.LJIIIIZZ(copyText, "copyText");
        c62509Og5.LIZJ((Context) afS49S0300000_10.l2, ((C62509Og5) afS49S0300000_10.l1).LJLJL, copyText);
        if (!((C62509Og5) afS49S0300000_10.l1).LJLJJL) {
            C5S1 c5s1 = new C5S1((Context) afS49S0300000_10.l2);
            c5s1.LIZJ(((C62509Og5) afS49S0300000_10.l1).LJLJJLL);
            c5s1.LJ();
        }
    }

    public AfS49S0300000_10(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
