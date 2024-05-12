package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9cD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240499cD implements InterfaceC208718Hb<C240499cD, InterfaceC57784Mm4> {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final C43I<C240539cH> LJLJI;
    public final C8HZ<InterfaceC57784Mm4> LJLJJI;

    public C240499cD() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        String str = this.LJLIL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = hashCode * 31;
        boolean z = this.LJLILLLLZI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return this.LJLJJI.hashCode() + C40328FsC.LIZIZ(this.LJLJI, (i + i2) * 31, 31);
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
        LIZ.append("HighlightSelectListState(highlightSourceMusicId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", showLoading=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", highlightEvent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLJJI;
    }

    public /* synthetic */ C240499cD(int i) {
        this(null, false, new C43I(null), new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C240499cD)) {
            return false;
        }
        C240499cD c240499cD = (C240499cD) obj;
        if (o.LJ(this.LJLIL, c240499cD.LJLIL) && this.LJLILLLLZI == c240499cD.LJLILLLLZI && o.LJ(this.LJLJI, c240499cD.LJLJI) && o.LJ(this.LJLJJI, c240499cD.LJLJJI)) {
            return true;
        }
        return false;
    }

    public C240499cD(String str, boolean z, C43I<C240539cH> highlightEvent, C8HZ<InterfaceC57784Mm4> listState) {
        o.LJIIIZ(highlightEvent, "highlightEvent");
        o.LJIIIZ(listState, "listState");
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = highlightEvent;
        this.LJLJJI = listState;
    }

    public static C240499cD LIZ(C240499cD c240499cD, String str, boolean z, C43I highlightEvent, C8HZ listState, int i) {
        if ((i & 1) != 0) {
            str = c240499cD.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c240499cD.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            highlightEvent = c240499cD.LJLJI;
        }
        if ((i & 8) != 0) {
            listState = c240499cD.LJLJJI;
        }
        c240499cD.getClass();
        o.LJIIIZ(highlightEvent, "highlightEvent");
        o.LJIIIZ(listState, "listState");
        return new C240499cD(str, z, highlightEvent, listState);
    }
}
