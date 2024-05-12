package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.0c2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11060c2 {
    public final boolean LIZ;
    public final InterfaceC08020Te LIZIZ;
    public final ViewGroup LIZJ;
    public final InterfaceC65784Pro<String> LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11060c2)) {
            return false;
        }
        C11060c2 c11060c2 = (C11060c2) obj;
        return this.LIZ == c11060c2.LIZ && o.LJ(this.LIZIZ, c11060c2.LIZIZ) && o.LJ(this.LIZJ, c11060c2.LIZJ) && o.LJ(this.LIZLLL, c11060c2.LIZLLL) && o.LJ(this.LJ, c11060c2.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode2 = (this.LIZIZ.hashCode() + (r0 * 31)) * 31;
        ViewGroup viewGroup = this.LIZJ;
        if (viewGroup == null) {
            hashCode = 0;
        } else {
            hashCode = viewGroup.hashCode();
        }
        return this.LJ.hashCode() + C1JX.LIZLLL(this.LIZLLL, (hashCode2 + hashCode) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiGuestStickerFullListViewBean(isGoLive=");
        LIZ.append(this.LIZ);
        LIZ.append(", effectWrapper=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fullListParentViewGroup=");
        LIZ.append(this.LIZJ);
        LIZ.append(", eventPage=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", removeFullStickerList=");
        return C06540Nm.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C11060c2(boolean z, C75213TfV c75213TfV, ViewGroup viewGroup, InterfaceC65784Pro eventPage, AqS160S0200000_13 aqS160S0200000_13) {
        o.LJIIIZ(eventPage, "eventPage");
        this.LIZ = z;
        this.LIZIZ = c75213TfV;
        this.LIZJ = viewGroup;
        this.LIZLLL = eventPage;
        this.LJ = aqS160S0200000_13;
    }
}
