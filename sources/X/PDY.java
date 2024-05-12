package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class PDY {
    public static final PDY LIZJ = new PDY();
    public volatile PDZ LIZ;
    public C64151PFr LIZIZ;

    public PDY() {
        PC0 pc0 = new PC0(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) PC2.LIZJ;
        if (!copyOnWriteArrayList.contains(pc0)) {
            copyOnWriteArrayList.add(pc0);
        }
    }

    public final boolean LIZ(String str, boolean z) {
        PDZ pdz = this.LIZ;
        if (z || pdz == null || !pdz.LIZ.LIZLLL || C64082PDa.LIZIZ().LIZJ(str, false) != 0) {
            return false;
        }
        return true;
    }
}
