package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import kotlin.jvm.internal.o;

/* renamed from: X.TzB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76433TzB {
    public final long LIZ;
    public final ItemInfo4FE LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76433TzB)) {
            return false;
        }
        C76433TzB c76433TzB = (C76433TzB) obj;
        return this.LIZ == c76433TzB.LIZ && o.LJ(this.LIZIZ, c76433TzB.LIZIZ) && this.LIZJ == c76433TzB.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        ItemInfo4FE itemInfo4FE = this.LIZIZ;
        int hashCode = (LLJIJIL + (itemInfo4FE == null ? 0 : itemInfo4FE.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BattleItemEffectLeftState(leftTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", itemInfo4FE=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", initialized=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C76433TzB(long j, ItemInfo4FE itemInfo4FE, boolean z) {
        this.LIZ = j;
        this.LIZIZ = itemInfo4FE;
        this.LIZJ = z;
    }
}
