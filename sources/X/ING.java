package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ING {
    public final Integer LIZ;
    public final Integer LIZIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ING() {
        /*
            r2 = this;
            r1 = 0
            r0 = 3
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ING.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ING)) {
            return false;
        }
        ING ing = (ING) obj;
        return o.LJ(this.LIZ, ing.LIZ) && o.LJ(this.LIZIZ, ing.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursSettings(profileEntrySetting=");
        LIZ.append(this.LIZ);
        LIZ.append(", inviteSetting=");
        return s0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public ING(Integer num, Integer num2) {
        this.LIZ = num;
        this.LIZIZ = num2;
    }

    public /* synthetic */ ING(Integer num, Integer num2, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
