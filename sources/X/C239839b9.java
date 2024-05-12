package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9b9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239839b9 implements InterfaceC208718Hb<C239839b9, InterfaceC57784Mm4> {
    public final C9RI LJLIL;
    public final C43I<Boolean> LJLILLLLZI;
    public final String LJLJI;
    public final C43I<Integer> LJLJJI;
    public final C8HZ<InterfaceC57784Mm4> LJLJJL;

    public C239839b9() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        C43I<Boolean> c43i = this.LJLILLLLZI;
        int i = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLJI, (hashCode2 + hashCode) * 31, 31);
        C43I<Integer> c43i2 = this.LJLJJI;
        if (c43i2 != null) {
            i = c43i2.hashCode();
        }
        return this.LJLJJL.hashCode() + ((LJ + i) * 31);
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
        LIZ.append("ArtistMusicFeaturedVideoState(loadingStatus=");
        LIZ.append(this.LJLIL);
        LIZ.append(", showRecordSheet=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", selectedAwemeId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", toastMessageId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLJJL;
    }

    public /* synthetic */ C239839b9(int i) {
        this(C9RI.DEFAULT, null, "", null, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C239839b9)) {
            return false;
        }
        C239839b9 c239839b9 = (C239839b9) obj;
        if (this.LJLIL == c239839b9.LJLIL && o.LJ(this.LJLILLLLZI, c239839b9.LJLILLLLZI) && o.LJ(this.LJLJI, c239839b9.LJLJI) && o.LJ(this.LJLJJI, c239839b9.LJLJJI) && o.LJ(this.LJLJJL, c239839b9.LJLJJL)) {
            return true;
        }
        return false;
    }

    public C239839b9(C9RI loadingStatus, C43I<Boolean> c43i, String selectedAwemeId, C43I<Integer> c43i2, C8HZ<InterfaceC57784Mm4> listState) {
        o.LJIIIZ(loadingStatus, "loadingStatus");
        o.LJIIIZ(selectedAwemeId, "selectedAwemeId");
        o.LJIIIZ(listState, "listState");
        this.LJLIL = loadingStatus;
        this.LJLILLLLZI = c43i;
        this.LJLJI = selectedAwemeId;
        this.LJLJJI = c43i2;
        this.LJLJJL = listState;
    }

    public static C239839b9 LIZ(C239839b9 c239839b9, C9RI c9ri, C43I c43i, String str, C43I c43i2, C8HZ c8hz, int i) {
        C8HZ listState = c8hz;
        C43I c43i3 = c43i2;
        String selectedAwemeId = str;
        C9RI loadingStatus = c9ri;
        C43I c43i4 = c43i;
        if ((i & 1) != 0) {
            loadingStatus = c239839b9.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i4 = c239839b9.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            selectedAwemeId = c239839b9.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i3 = c239839b9.LJLJJI;
        }
        if ((i & 16) != 0) {
            listState = c239839b9.LJLJJL;
        }
        c239839b9.getClass();
        o.LJIIIZ(loadingStatus, "loadingStatus");
        o.LJIIIZ(selectedAwemeId, "selectedAwemeId");
        o.LJIIIZ(listState, "listState");
        return new C239839b9(loadingStatus, c43i4, selectedAwemeId, c43i3, listState);
    }
}
