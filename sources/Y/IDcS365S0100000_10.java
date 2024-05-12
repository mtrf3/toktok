package Y;

import X.C141335gf;
import X.C3C4;
import X.C3C5;
import X.C63222Ora;
import X.C63407OuZ;
import X.C63623Oy3;
import X.InterfaceC67352kd;
import X.InterfaceC86963bA;
import java.util.List;

/* loaded from: classes11.dex */
public class IDcS365S0100000_10 implements InterfaceC86963bA {
    public final int $t;
    public Object l0;

    public static final void LIZIZ$2(IDcS365S0100000_10 iDcS365S0100000_10, C63623Oy3 c63623Oy3) {
    }

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c63623Oy3);
                return;
            case 1:
                LIZIZ$1(this, c63623Oy3);
                return;
            case 2:
                LIZIZ$2(this, c63623Oy3);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                return;
            case 1:
                onSuccess$1(this, obj);
                return;
            case 2:
                onSuccess$2(this, obj);
                return;
            default:
                return;
        }
    }

    public IDcS365S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(IDcS365S0100000_10 iDcS365S0100000_10, C63623Oy3 c63623Oy3) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDcS365S0100000_10.l0;
        C3C4 LIZ = C141335gf.LIZ(new C63407OuZ(c63623Oy3));
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }

    public static final void LIZIZ$1(IDcS365S0100000_10 iDcS365S0100000_10, C63623Oy3 c63623Oy3) {
        C63222Ora.LJIL((C63222Ora) iDcS365S0100000_10.l0);
    }

    public static final void onSuccess$0(IDcS365S0100000_10 iDcS365S0100000_10, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDcS365S0100000_10.l0;
        C3C5.m7constructorimpl(obj);
        interfaceC67352kd.resumeWith(obj);
    }

    public static final void onSuccess$1(IDcS365S0100000_10 iDcS365S0100000_10, Object obj) {
        C63222Ora.LJIJJLI((C63222Ora) iDcS365S0100000_10.l0);
    }

    public static final void onSuccess$2(IDcS365S0100000_10 iDcS365S0100000_10, Object obj) {
        ((List) iDcS365S0100000_10.l0).add(obj);
    }
}
