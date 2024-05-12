package X;

import kotlin.jvm.internal.o;

/* renamed from: X.BIg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28546BIg {
    public final EnumC28543BId LIZ;
    public final EnumC28545BIf LIZIZ;
    public final String LIZJ;
    public final Object LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28546BIg)) {
            return false;
        }
        C28546BIg c28546BIg = (C28546BIg) obj;
        return this.LIZ == c28546BIg.LIZ && this.LIZIZ == c28546BIg.LIZIZ && o.LJ(this.LIZJ, c28546BIg.LIZJ) && o.LJ(this.LIZLLL, c28546BIg.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZJ, (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31, 31);
        Object obj = this.LIZLLL;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubscriptionPageEvent(page=");
        LIZ.append(this.LIZ);
        LIZ.append(", action=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZJ);
        LIZ.append(", data=");
        return U26.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C28546BIg(EnumC28543BId page, EnumC28545BIf action, String enterFrom, Object obj) {
        o.LJIIIZ(page, "page");
        o.LJIIIZ(action, "action");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ = page;
        this.LIZIZ = action;
        this.LIZJ = enterFrom;
        this.LIZLLL = obj;
    }

    public /* synthetic */ C28546BIg(EnumC28543BId enumC28543BId, EnumC28545BIf enumC28545BIf, String str, int i) {
        this(enumC28543BId, enumC28545BIf, (i & 4) != 0 ? "" : str, (Object) null);
    }
}
