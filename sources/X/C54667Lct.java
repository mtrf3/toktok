package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lct, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54667Lct implements InterfaceC2064888m<C54667Lct, Aweme> {
    public final C8HZ<Aweme> LJLIL;
    public final boolean LJLILLLLZI;

    public C54667Lct() {
        this(new C8HZ(null, null, 15), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
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
        LIZ.append("TopicFeedListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", hasMore=");
        return C48339Iy7.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<Aweme> getListState() {
        return this.LJLIL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54667Lct)) {
            return false;
        }
        C54667Lct c54667Lct = (C54667Lct) obj;
        if (o.LJ(this.LJLIL, c54667Lct.LJLIL) && this.LJLILLLLZI == c54667Lct.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public C54667Lct(C8HZ<Aweme> listState, boolean z) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
        this.LJLILLLLZI = z;
    }

    public static C54667Lct LIZ(C54667Lct c54667Lct, C8HZ listState, boolean z, int i) {
        if ((i & 1) != 0) {
            listState = c54667Lct.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c54667Lct.LJLILLLLZI;
        }
        c54667Lct.getClass();
        o.LJIIIZ(listState, "listState");
        return new C54667Lct(listState, z);
    }
}
