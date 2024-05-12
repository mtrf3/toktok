package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.337, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass337 {
    public final List<InterfaceC57784Mm4> LIZ;
    public final C87933cj LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass337)) {
            return false;
        }
        AnonymousClass337 anonymousClass337 = (AnonymousClass337) obj;
        return o.LJ(this.LIZ, anonymousClass337.LIZ) && o.LJ(this.LIZIZ, anonymousClass337.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        C87933cj c87933cj = this.LIZIZ;
        return hashCode + (c87933cj == null ? 0 : c87933cj.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SuggestedDefaultRefreshBundle(refreshItemList=");
        LIZ.append(this.LIZ);
        LIZ.append(", searchDefaultPageLoadData=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass337(List<? extends InterfaceC57784Mm4> refreshItemList, C87933cj c87933cj) {
        o.LJIIIZ(refreshItemList, "refreshItemList");
        this.LIZ = refreshItemList;
        this.LIZIZ = c87933cj;
    }
}
