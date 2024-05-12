package X;

import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Np, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184937Np implements InterfaceC208718Hb<C184937Np, C184817Nd> {
    public final C8HZ<C184817Nd> LJLIL;
    public final List<C184817Nd> LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;

    public C184937Np() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LIZIZ + i) * 31;
        String str = this.LJLJJI;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i2 + hashCode;
    }

    @Override // X.InterfaceC2064888m
    public final List<C184817Nd> getListItemState() {
        return C208708Ha.LIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadLatestState() {
        return C208708Ha.LIZIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadMoreState() {
        return C208708Ha.LIZJ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getRefreshState() {
        return C208708Ha.LIZLLL(this);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopicRecommendListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", recommendListState=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", hasMore=");
        LIZ.append(this.LJLJI);
        LIZ.append(", pageExtra=");
        return q.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C184817Nd> getListState() {
        return this.LJLIL;
    }

    public C184937Np(int i) {
        this(new C8HZ(null, null, 15), C61878OQg.INSTANCE, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C184937Np)) {
            return false;
        }
        C184937Np c184937Np = (C184937Np) obj;
        if (o.LJ(this.LJLIL, c184937Np.LJLIL) && o.LJ(this.LJLILLLLZI, c184937Np.LJLILLLLZI) && this.LJLJI == c184937Np.LJLJI && o.LJ(this.LJLJJI, c184937Np.LJLJJI)) {
            return true;
        }
        return false;
    }

    public C184937Np(C8HZ<C184817Nd> listState, List<C184817Nd> recommendListState, boolean z, String str) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(recommendListState, "recommendListState");
        this.LJLIL = listState;
        this.LJLILLLLZI = recommendListState;
        this.LJLJI = z;
        this.LJLJJI = str;
    }

    public static C184937Np LIZ(C184937Np c184937Np, C8HZ listState, List recommendListState, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            listState = c184937Np.LJLIL;
        }
        if ((i & 2) != 0) {
            recommendListState = c184937Np.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z = c184937Np.LJLJI;
        }
        if ((i & 8) != 0) {
            str = c184937Np.LJLJJI;
        }
        c184937Np.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(recommendListState, "recommendListState");
        return new C184937Np(listState, recommendListState, z, str);
    }
}
