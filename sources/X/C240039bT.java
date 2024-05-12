package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9bT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240039bT implements InterfaceC208718Hb<C240039bT, C185907Ri> {
    public final C8HZ<C185907Ri> LJLIL;
    public final C43I<List<Aweme>> LJLILLLLZI;

    public C240039bT() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C185907Ri> getListItemState() {
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
        LIZ.append("OfflineModeVideoListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", itemDeleteEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C185907Ri> getListState() {
        return this.LJLIL;
    }

    public C240039bT(int i) {
        this(new C43I(C61878OQg.INSTANCE), new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C240039bT)) {
            return false;
        }
        C240039bT c240039bT = (C240039bT) obj;
        if (o.LJ(this.LJLIL, c240039bT.LJLIL) && o.LJ(this.LJLILLLLZI, c240039bT.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C240039bT(C43I itemDeleteEvent, C8HZ listState) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(itemDeleteEvent, "itemDeleteEvent");
        this.LJLIL = listState;
        this.LJLILLLLZI = itemDeleteEvent;
    }

    public static C240039bT LIZ(C240039bT c240039bT, C8HZ listState, C43I itemDeleteEvent, int i) {
        if ((i & 1) != 0) {
            listState = c240039bT.LJLIL;
        }
        if ((i & 2) != 0) {
            itemDeleteEvent = c240039bT.LJLILLLLZI;
        }
        c240039bT.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(itemDeleteEvent, "itemDeleteEvent");
        return new C240039bT(itemDeleteEvent, listState);
    }
}
