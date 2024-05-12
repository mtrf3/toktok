package X;

import com.ss.android.ugc.aweme.search.TrendingEventModel;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MBa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56386MBa implements InterfaceC208718Hb<C56386MBa, E06> {
    public final C8HZ<E06> LJLIL;
    public final TrendingEventModel LJLILLLLZI;
    public final C43I<Boolean> LJLJI;
    public final C43I<Boolean> LJLJJI;
    public final List<TrendingEventModel> LJLJJL;
    public final Integer LJLJJLL;
    public final boolean LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;

    public C56386MBa() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJLJJL, C40328FsC.LIZIZ(this.LJLJJI, C40328FsC.LIZIZ(this.LJLJI, (this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31, 31), 31), 31);
        Integer num = this.LJLJJLL;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i = (LIZIZ + hashCode) * 31;
        boolean z = this.LJLJL;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return ((((i + i2) * 31) + this.LJLJLJ) * 31) + this.LJLJLLL;
    }

    @Override // X.InterfaceC2064888m
    public final List<E06> getListItemState() {
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
        LIZ.append("TrendingDetailState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", currentTrending=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", showBillboard=");
        LIZ.append(this.LJLJI);
        LIZ.append(", showExpiredToast=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", totalTrendingList=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", loadFrom=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", isInTrendingFlow=");
        LIZ.append(this.LJLJL);
        LIZ.append(", itemCount=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", currentPosition=");
        return b0.LIZJ(LIZ, this.LJLJLLL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<E06> getListState() {
        return this.LJLIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C56386MBa(int r12) {
        /*
            r11 = this;
            X.8HZ r2 = new X.8HZ
            r1 = 15
            r0 = 0
            r2.<init>(r0, r0, r1)
            com.ss.android.ugc.aweme.search.TrendingEventModel r3 = new com.ss.android.ugc.aweme.search.TrendingEventModel
            r3.<init>()
            X.43I r4 = new X.43I
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.<init>(r0)
            X.43I r5 = new X.43I
            r5.<init>(r0)
            X.OQg r6 = X.C61878OQg.INSTANCE
            r7 = 0
            r8 = 1
            r1 = r11
            r9 = r8
            r10 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56386MBa.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56386MBa)) {
            return false;
        }
        C56386MBa c56386MBa = (C56386MBa) obj;
        if (o.LJ(this.LJLIL, c56386MBa.LJLIL) && o.LJ(this.LJLILLLLZI, c56386MBa.LJLILLLLZI) && o.LJ(this.LJLJI, c56386MBa.LJLJI) && o.LJ(this.LJLJJI, c56386MBa.LJLJJI) && o.LJ(this.LJLJJL, c56386MBa.LJLJJL) && o.LJ(this.LJLJJLL, c56386MBa.LJLJJLL) && this.LJLJL == c56386MBa.LJLJL && this.LJLJLJ == c56386MBa.LJLJLJ && this.LJLJLLL == c56386MBa.LJLJLLL) {
            return true;
        }
        return false;
    }

    public C56386MBa(C8HZ<E06> listState, TrendingEventModel currentTrending, C43I<Boolean> showBillboard, C43I<Boolean> showExpiredToast, List<TrendingEventModel> totalTrendingList, Integer num, boolean z, int i, int i2) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(currentTrending, "currentTrending");
        o.LJIIIZ(showBillboard, "showBillboard");
        o.LJIIIZ(showExpiredToast, "showExpiredToast");
        o.LJIIIZ(totalTrendingList, "totalTrendingList");
        this.LJLIL = listState;
        this.LJLILLLLZI = currentTrending;
        this.LJLJI = showBillboard;
        this.LJLJJI = showExpiredToast;
        this.LJLJJL = totalTrendingList;
        this.LJLJJLL = num;
        this.LJLJL = z;
        this.LJLJLJ = i;
        this.LJLJLLL = i2;
    }

    public static C56386MBa LIZ(C56386MBa c56386MBa, C8HZ c8hz, TrendingEventModel trendingEventModel, C43I c43i, C43I c43i2, List list, Integer num, boolean z, int i, int i2, int i3) {
        int i4 = i2;
        int i5 = i;
        boolean z2 = z;
        TrendingEventModel currentTrending = trendingEventModel;
        C8HZ listState = c8hz;
        C43I showBillboard = c43i;
        C43I showExpiredToast = c43i2;
        List totalTrendingList = list;
        Integer num2 = num;
        if ((i3 & 1) != 0) {
            listState = c56386MBa.LJLIL;
        }
        if ((i3 & 2) != 0) {
            currentTrending = c56386MBa.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            showBillboard = c56386MBa.LJLJI;
        }
        if ((i3 & 8) != 0) {
            showExpiredToast = c56386MBa.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            totalTrendingList = c56386MBa.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            num2 = c56386MBa.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            z2 = c56386MBa.LJLJL;
        }
        if ((i3 & 128) != 0) {
            i5 = c56386MBa.LJLJLJ;
        }
        if ((i3 & 256) != 0) {
            i4 = c56386MBa.LJLJLLL;
        }
        c56386MBa.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(currentTrending, "currentTrending");
        o.LJIIIZ(showBillboard, "showBillboard");
        o.LJIIIZ(showExpiredToast, "showExpiredToast");
        o.LJIIIZ(totalTrendingList, "totalTrendingList");
        return new C56386MBa(listState, currentTrending, showBillboard, showExpiredToast, totalTrendingList, num2, z2, i5, i4);
    }
}
