package X;

import androidx.lifecycle.LifecycleOwner;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.LDj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53899LDj {
    public final Class<? extends C2K0> LIZ;
    public final InterfaceC55102Lju LIZIZ;
    public final LifecycleOwner LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53899LDj)) {
            return false;
        }
        C53899LDj c53899LDj = (C53899LDj) obj;
        return o.LJ(this.LIZ, c53899LDj.LIZ) && o.LJ(this.LIZIZ, c53899LDj.LIZIZ) && o.LJ(this.LIZJ, c53899LDj.LIZJ) && o.LJ(this.LIZLLL, c53899LDj.LIZLLL);
    }

    public final int hashCode() {
        int hashCode = (this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31;
        String str = this.LIZLLL;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AbilityInfo(abilityClass=");
        LIZ.append(this.LIZ);
        LIZ.append(", abilityObject=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", lifecycleOwner=");
        LIZ.append(this.LIZJ);
        LIZ.append(", tag=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C53899LDj(Class cls, InterfaceC55102Lju abilityObject, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(abilityObject, "abilityObject");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = cls;
        this.LIZIZ = abilityObject;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = null;
    }
}
