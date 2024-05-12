package X;

import com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A1P implements InterfaceC208718Hb<A1P, SeriesItem> {
    public final C8HZ<SeriesItem> LJLIL;
    public final AbstractC72932td<SeriesItem> LJLILLLLZI;
    public final boolean LJLJI;
    public final AbstractC72932td<SeriesItem> LJLJJI;
    public final int LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final boolean LJLJLJ;

    public A1P() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZ = C03090Af.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        boolean z = this.LJLJI;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ = C79062V1e.LJ(this.LJLJL, C79062V1e.LJ(this.LJLJJLL, (C03090Af.LIZ(this.LJLJJI, (LIZ + i2) * 31, 31) + this.LJLJJL) * 31, 31), 31);
        if (!this.LJLJLJ) {
            i = 0;
        }
        return LJ + i;
    }

    @Override // X.InterfaceC2064888m
    public final List<SeriesItem> getListItemState() {
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
        LIZ.append("SeriesListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selectedItem=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", hasSelectedItem=");
        LIZ.append(this.LJLJI);
        LIZ.append(", collectionDetailResponse=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", collectionCnt=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", entryPoint=");
        LIZ.append(this.LJLJL);
        LIZ.append(", isNewCollection=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJLJ, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<SeriesItem> getListState() {
        return this.LJLIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ A1P(int r11) {
        /*
            r10 = this;
            X.8HZ r2 = new X.8HZ
            r1 = 15
            r0 = 0
            r2.<init>(r0, r0, r1)
            X.33X r3 = X.C33X.LIZ
            r4 = 0
            java.lang.String r7 = ""
            r1 = r10
            r5 = r3
            r6 = r4
            r8 = r7
            r9 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1P.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A1P)) {
            return false;
        }
        A1P a1p = (A1P) obj;
        if (o.LJ(this.LJLIL, a1p.LJLIL) && o.LJ(this.LJLILLLLZI, a1p.LJLILLLLZI) && this.LJLJI == a1p.LJLJI && o.LJ(this.LJLJJI, a1p.LJLJJI) && this.LJLJJL == a1p.LJLJJL && o.LJ(this.LJLJJLL, a1p.LJLJJLL) && o.LJ(this.LJLJL, a1p.LJLJL) && this.LJLJLJ == a1p.LJLJLJ) {
            return true;
        }
        return false;
    }

    public A1P(C8HZ<SeriesItem> listState, AbstractC72932td<SeriesItem> selectedItem, boolean z, AbstractC72932td<SeriesItem> collectionDetailResponse, int i, String enterFrom, String entryPoint, boolean z2) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(selectedItem, "selectedItem");
        o.LJIIIZ(collectionDetailResponse, "collectionDetailResponse");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(entryPoint, "entryPoint");
        this.LJLIL = listState;
        this.LJLILLLLZI = selectedItem;
        this.LJLJI = z;
        this.LJLJJI = collectionDetailResponse;
        this.LJLJJL = i;
        this.LJLJJLL = enterFrom;
        this.LJLJL = entryPoint;
        this.LJLJLJ = z2;
    }

    public static A1P LIZ(A1P a1p, C8HZ c8hz, AbstractC72932td abstractC72932td, boolean z, int i, String str, String str2, boolean z2, int i2) {
        AbstractC72932td<SeriesItem> collectionDetailResponse;
        boolean z3 = z2;
        AbstractC72932td selectedItem = abstractC72932td;
        C8HZ listState = c8hz;
        boolean z4 = z;
        int i3 = i;
        String enterFrom = str;
        String entryPoint = str2;
        if ((i2 & 1) != 0) {
            listState = a1p.LJLIL;
        }
        if ((i2 & 2) != 0) {
            selectedItem = a1p.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            z4 = a1p.LJLJI;
        }
        if ((i2 & 8) != 0) {
            collectionDetailResponse = a1p.LJLJJI;
        } else {
            collectionDetailResponse = null;
        }
        if ((i2 & 16) != 0) {
            i3 = a1p.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            enterFrom = a1p.LJLJJLL;
        }
        if ((i2 & 64) != 0) {
            entryPoint = a1p.LJLJL;
        }
        if ((i2 & 128) != 0) {
            z3 = a1p.LJLJLJ;
        }
        a1p.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(selectedItem, "selectedItem");
        o.LJIIIZ(collectionDetailResponse, "collectionDetailResponse");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(entryPoint, "entryPoint");
        return new A1P(listState, selectedItem, z4, collectionDetailResponse, i3, enterFrom, entryPoint, z3);
    }
}
