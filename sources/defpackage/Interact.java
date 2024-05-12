package defpackage;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Interact {

    @InterfaceC65349Pkn("ccdcInteract")
    public final Integer _ccdcInteract;

    /* JADX WARN: Multi-variable type inference failed */
    public Interact() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Interact) && o.LJ(this._ccdcInteract, ((Interact) obj)._ccdcInteract);
    }

    public final int hashCode() {
        Integer num = this._ccdcInteract;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ() {
        /*
            r3 = this;
            java.lang.Integer r0 = r3._ccdcInteract
            r2 = 1
            if (r0 != 0) goto L17
            EcomPaymentStyleModel r0 = defpackage.f0.LIZIZ
            Interact r1 = r0.interact
            if (r1 != 0) goto L11
            Interact r1 = new Interact
            r0 = 0
            r1.<init>(r0, r2, r0)
        L11:
            java.lang.Integer r0 = r1._ccdcInteract
            if (r0 != 0) goto L17
        L15:
            r2 = 0
        L16:
            return r2
        L17:
            int r0 = r0.intValue()
            if (r0 != r2) goto L15
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Interact.LIZ():boolean");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Interact(_ccdcInteract=");
        return s0.LIZJ(LIZ, this._ccdcInteract, ')', LIZ);
    }

    public Interact(Integer num) {
        this._ccdcInteract = num;
    }

    public /* synthetic */ Interact(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num);
    }
}
