package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lcr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54665Lcr implements InterfaceC2064888m<C54665Lcr, Aweme> {
    public final C8HZ<Aweme> LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

    public C54665Lcr() {
        this(null, 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        if (!this.LJLJI) {
            i = 0;
        }
        return i3 + i;
    }

    @Override // X.InterfaceC2064888m
    public final List<Aweme> getListItemState() {
        return getListState().LJLJJI;
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadLatestState() {
        return getListState().LJLJI;
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadMoreState() {
        return getListState().LJLILLLLZI;
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getRefreshState() {
        return getListState().LJLIL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NearbyFeedListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", hasMore=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", firstDataFromCache=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<Aweme> getListState() {
        return this.LJLIL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54665Lcr)) {
            return false;
        }
        C54665Lcr c54665Lcr = (C54665Lcr) obj;
        if (o.LJ(this.LJLIL, c54665Lcr.LJLIL) && this.LJLILLLLZI == c54665Lcr.LJLILLLLZI && this.LJLJI == c54665Lcr.LJLJI) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C54665Lcr(C8HZ c8hz, int i) {
        this((i & 1) != 0 ? new C8HZ(null, null, 15) : c8hz, false, false);
    }

    public C54665Lcr(C8HZ<Aweme> listState, boolean z, boolean z2) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }

    public static C54665Lcr LIZ(C54665Lcr c54665Lcr, C8HZ listState, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            listState = c54665Lcr.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c54665Lcr.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z2 = c54665Lcr.LJLJI;
        }
        c54665Lcr.getClass();
        o.LJIIIZ(listState, "listState");
        return new C54665Lcr(listState, z, z2);
    }
}
