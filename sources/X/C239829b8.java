package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9b8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239829b8 implements InterfaceC208718Hb<C239829b8, InterfaceC57784Mm4> {
    public final boolean LJLIL;
    public final C43I<C239799b5> LJLILLLLZI;
    public final C43I<C76800UCe> LJLJI;
    public final C43I<Boolean> LJLJJI;
    public final C43I<Integer> LJLJJL;
    public final C8HZ<InterfaceC57784Mm4> LJLJJLL;

    public /* synthetic */ C239829b8() {
        this(true, new C43I(null), new C43I(null), new C43I(null), new C43I(null), new C8HZ(null, null, 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.LJLJJLL.hashCode() + C40328FsC.LIZIZ(this.LJLJJL, C40328FsC.LIZIZ(this.LJLJJI, C40328FsC.LIZIZ(this.LJLJI, C40328FsC.LIZIZ(this.LJLILLLLZI, r0 * 31, 31), 31), 31), 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<InterfaceC57784Mm4> getListItemState() {
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
        LIZ.append("OriginMusicListState(needRefresh=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pinEvent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", scrollTop=");
        LIZ.append(this.LJLJI);
        LIZ.append(", unHighlightSuccessEvent=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", scrollToPosition=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLJJLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C239829b8)) {
            return false;
        }
        C239829b8 c239829b8 = (C239829b8) obj;
        if (this.LJLIL == c239829b8.LJLIL && o.LJ(this.LJLILLLLZI, c239829b8.LJLILLLLZI) && o.LJ(this.LJLJI, c239829b8.LJLJI) && o.LJ(this.LJLJJI, c239829b8.LJLJJI) && o.LJ(this.LJLJJL, c239829b8.LJLJJL) && o.LJ(this.LJLJJLL, c239829b8.LJLJJLL)) {
            return true;
        }
        return false;
    }

    public C239829b8(boolean z, C43I<C239799b5> pinEvent, C43I<C76800UCe> scrollTop, C43I<Boolean> unHighlightSuccessEvent, C43I<Integer> scrollToPosition, C8HZ<InterfaceC57784Mm4> listState) {
        o.LJIIIZ(pinEvent, "pinEvent");
        o.LJIIIZ(scrollTop, "scrollTop");
        o.LJIIIZ(unHighlightSuccessEvent, "unHighlightSuccessEvent");
        o.LJIIIZ(scrollToPosition, "scrollToPosition");
        o.LJIIIZ(listState, "listState");
        this.LJLIL = z;
        this.LJLILLLLZI = pinEvent;
        this.LJLJI = scrollTop;
        this.LJLJJI = unHighlightSuccessEvent;
        this.LJLJJL = scrollToPosition;
        this.LJLJJLL = listState;
    }

    public static C239829b8 LIZ(C239829b8 c239829b8, boolean z, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C8HZ c8hz, int i) {
        C8HZ listState = c8hz;
        C43I scrollToPosition = c43i4;
        C43I unHighlightSuccessEvent = c43i3;
        C43I scrollTop = c43i2;
        boolean z2 = z;
        C43I pinEvent = c43i;
        if ((i & 1) != 0) {
            z2 = c239829b8.LJLIL;
        }
        if ((i & 2) != 0) {
            pinEvent = c239829b8.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            scrollTop = c239829b8.LJLJI;
        }
        if ((i & 8) != 0) {
            unHighlightSuccessEvent = c239829b8.LJLJJI;
        }
        if ((i & 16) != 0) {
            scrollToPosition = c239829b8.LJLJJL;
        }
        if ((i & 32) != 0) {
            listState = c239829b8.LJLJJLL;
        }
        c239829b8.getClass();
        o.LJIIIZ(pinEvent, "pinEvent");
        o.LJIIIZ(scrollTop, "scrollTop");
        o.LJIIIZ(unHighlightSuccessEvent, "unHighlightSuccessEvent");
        o.LJIIIZ(scrollToPosition, "scrollToPosition");
        o.LJIIIZ(listState, "listState");
        return new C239829b8(z2, pinEvent, scrollTop, unHighlightSuccessEvent, scrollToPosition, listState);
    }
}
