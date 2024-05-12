package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LPL implements InterfaceC54167LNr {
    public final /* synthetic */ C54204LPc LIZ;

    @Override // X.InterfaceC54167LNr
    public final int getValue() {
        Integer num;
        C54204LPc c54204LPc = this.LIZ;
        if (c54204LPc != null) {
            num = Integer.valueOf(c54204LPc.getCurrentItem());
        } else {
            num = null;
        }
        o.LJI(num);
        return num.intValue();
    }

    public LPL(C54204LPc c54204LPc) {
        this.LIZ = c54204LPc;
    }

    @Override // X.InterfaceC54167LNr
    public final void LIZ(int i) {
        C54204LPc c54204LPc = this.LIZ;
        if (c54204LPc == null) {
            return;
        }
        c54204LPc.setCurrentItem(i);
    }

    @Override // X.InterfaceC54167LNr
    public final void LIZIZ(int i, boolean z) {
        C54204LPc c54204LPc = this.LIZ;
        if (c54204LPc != null) {
            c54204LPc.setCurrentItem(i, z);
        }
    }
}
