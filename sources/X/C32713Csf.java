package X;

import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Csf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32713Csf {
    public final int LIZ;
    public final AbstractC32698CsQ<? extends C30896CAq> LIZIZ;
    public final LinkedList<AbstractC32698CsQ<? extends C30896CAq>> LIZJ;
    public final List<Long> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32713Csf)) {
            return false;
        }
        C32713Csf c32713Csf = (C32713Csf) obj;
        return this.LIZ == c32713Csf.LIZ && o.LJ(this.LIZIZ, c32713Csf.LIZIZ) && o.LJ(this.LIZJ, c32713Csf.LIZJ) && o.LJ(this.LIZLLL, c32713Csf.LIZLLL);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = this.LIZIZ;
        int hashCode = (i + (abstractC32698CsQ == null ? 0 : abstractC32698CsQ.hashCode())) * 31;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList = this.LIZJ;
        int hashCode2 = (hashCode + (linkedList == null ? 0 : linkedList.hashCode())) * 31;
        List<Long> list = this.LIZLLL;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftPageInfo(giftPageType=");
        LIZ.append(this.LIZ);
        LIZ.append(", defaultGiftPanel=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", panels=");
        LIZ.append(this.LIZJ);
        LIZ.append(", frequentlyUsedGifts=");
        return C1NE.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C32713Csf(int i, AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ, LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList, List<Long> list) {
        this.LIZ = i;
        this.LIZIZ = abstractC32698CsQ;
        this.LIZJ = linkedList;
        this.LIZLLL = list;
    }
}
