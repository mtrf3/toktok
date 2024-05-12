package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZuK, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91420ZuK implements C33Q {
    public final C91422ZuM LJLIL;
    public final C91423ZuN LJLILLLLZI;

    public C91420ZuK() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91420ZuK)) {
            return false;
        }
        C91420ZuK c91420ZuK = (C91420ZuK) obj;
        return o.LJ(this.LJLIL, c91420ZuK.LJLIL) && o.LJ(this.LJLILLLLZI, c91420ZuK.LJLILLLLZI);
    }

    public final int hashCode() {
        C91422ZuM c91422ZuM = this.LJLIL;
        int hashCode = (c91422ZuM == null ? 0 : c91422ZuM.hashCode()) * 31;
        C91423ZuN c91423ZuN = this.LJLILLLLZI;
        return hashCode + (c91423ZuN != null ? c91423ZuN.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectVMState(musicCollectData=");
        LIZ.append(this.LJLIL);
        LIZ.append(", songCollectData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C91420ZuK(C91422ZuM c91422ZuM, C91423ZuN c91423ZuN) {
        this.LJLIL = c91422ZuM;
        this.LJLILLLLZI = c91423ZuN;
    }

    public static C91420ZuK LIZ(C91420ZuK c91420ZuK, C91422ZuM c91422ZuM, C91423ZuN c91423ZuN, int i) {
        if ((i & 1) != 0) {
            c91422ZuM = c91420ZuK.LJLIL;
        }
        if ((i & 2) != 0) {
            c91423ZuN = c91420ZuK.LJLILLLLZI;
        }
        c91420ZuK.getClass();
        return new C91420ZuK(c91422ZuM, c91423ZuN);
    }
}
