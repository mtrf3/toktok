package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ta6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74878Ta6 {
    public final CJ2 LIZ;
    public final CJ2 LIZIZ;
    public final CJ2 LIZJ;
    public final CJ2 LIZLLL;
    public final CJ2 LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74878Ta6)) {
            return false;
        }
        C74878Ta6 c74878Ta6 = (C74878Ta6) obj;
        return o.LJ(this.LIZ, c74878Ta6.LIZ) && o.LJ(this.LIZIZ, c74878Ta6.LIZIZ) && o.LJ(this.LIZJ, c74878Ta6.LIZJ) && o.LJ(this.LIZLLL, c74878Ta6.LIZLLL) && o.LJ(this.LJ, c74878Ta6.LJ) && this.LJFF == c74878Ta6.LJFF && this.LJI == c74878Ta6.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LJ.hashCode() + ((this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + (this.LJI ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OldUserItemsDataAnchorSide(oldOnlineItems=");
        LIZ.append(this.LIZ);
        LIZ.append(", oldConnectingItems=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", oldWaitingItems=");
        LIZ.append(this.LIZJ);
        LIZ.append(", oldViewerItems=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", oldNotViewerFriendList=");
        LIZ.append(this.LJ);
        LIZ.append(", oldIsShowAllWaiting=");
        LIZ.append(this.LJFF);
        LIZ.append(", oldIsShowAllViewer=");
        return C48339Iy7.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public C74878Ta6(CJ2 oldOnlineItems, CJ2 oldConnectingItems, CJ2 oldWaitingItems, CJ2 oldViewerItems, CJ2 oldNotViewerFriendList, boolean z, boolean z2) {
        o.LJIIIZ(oldOnlineItems, "oldOnlineItems");
        o.LJIIIZ(oldConnectingItems, "oldConnectingItems");
        o.LJIIIZ(oldWaitingItems, "oldWaitingItems");
        o.LJIIIZ(oldViewerItems, "oldViewerItems");
        o.LJIIIZ(oldNotViewerFriendList, "oldNotViewerFriendList");
        this.LIZ = oldOnlineItems;
        this.LIZIZ = oldConnectingItems;
        this.LIZJ = oldWaitingItems;
        this.LIZLLL = oldViewerItems;
        this.LJ = oldNotViewerFriendList;
        this.LJFF = z;
        this.LJI = z2;
    }
}
