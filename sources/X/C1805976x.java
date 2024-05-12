package X;

import com.ss.android.ugc.now.interaction.assem.LikeItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.76x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1805976x implements InterfaceC208718Hb<C1805976x, LikeItem> {
    public final C8HZ<LikeItem> LJLIL;
    public final C43I<Long> LJLILLLLZI;

    public C1805976x() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        C43I<Long> c43i = this.LJLILLLLZI;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // X.InterfaceC2064888m
    public final List<LikeItem> getListItemState() {
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
        LIZ.append("LikeListVMState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", likeCount=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<LikeItem> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C1805976x(int i) {
        this(null, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1805976x)) {
            return false;
        }
        C1805976x c1805976x = (C1805976x) obj;
        if (o.LJ(this.LJLIL, c1805976x.LJLIL) && o.LJ(this.LJLILLLLZI, c1805976x.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C1805976x(C43I c43i, C8HZ listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
        this.LJLILLLLZI = c43i;
    }
}
