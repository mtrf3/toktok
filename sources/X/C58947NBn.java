package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NBn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58947NBn extends AbstractC58948NBo {
    public final C76512zP LIZ;
    public final java.util.Set<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58947NBn)) {
            return false;
        }
        C58947NBn c58947NBn = (C58947NBn) obj;
        return o.LJ(this.LIZ, c58947NBn.LIZ) && o.LJ(this.LIZIZ, c58947NBn.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BusinessComponentAppear(componentAppearModel=");
        LIZ.append(this.LIZ);
        LIZ.append(", slotIdList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C58947NBn(C76512zP componentAppearModel, java.util.Set<String> slotIdList) {
        o.LJIIIZ(componentAppearModel, "componentAppearModel");
        o.LJIIIZ(slotIdList, "slotIdList");
        this.LIZ = componentAppearModel;
        this.LIZIZ = slotIdList;
    }
}
