package X;

import com.ss.android.ugc.aweme.watch.history.api.WatchHistoryCopyResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Zm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188027Zm implements InterfaceC208718Hb<C188027Zm, C188067Zq> {
    public final C43I<Integer> LJLIL;
    public final String LJLILLLLZI;
    public final C43I<String> LJLJI;
    public final C43I<String> LJLJJI;
    public final C43I<Integer> LJLJJL;
    public final C43I<Boolean> LJLJJLL;
    public final C43I<Boolean> LJLJL;
    public final C43I<WatchHistoryCopyResponse> LJLJLJ;
    public final C8HZ<C188067Zq> LJLJLLL;

    public C188027Zm() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        C43I<Integer> c43i = this.LJLIL;
        int i = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.LJLILLLLZI;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C43I<String> c43i2 = this.LJLJI;
        if (c43i2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c43i2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        C43I<String> c43i3 = this.LJLJJI;
        if (c43i3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c43i3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        C43I<Integer> c43i4 = this.LJLJJL;
        if (c43i4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c43i4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        C43I<Boolean> c43i5 = this.LJLJJLL;
        if (c43i5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c43i5.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        C43I<Boolean> c43i6 = this.LJLJL;
        if (c43i6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c43i6.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        C43I<WatchHistoryCopyResponse> c43i7 = this.LJLJLJ;
        if (c43i7 != null) {
            i = c43i7.hashCode();
        }
        return this.LJLJLLL.hashCode() + ((i8 + i) * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C188067Zq> getListItemState() {
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
        LIZ.append("WatchHistoryListState(scroll2PositionEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", currentTimestamp=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", longClickEvent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", toastMessage=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", selectedItemSize=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", selectMode=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", isLoading=");
        LIZ.append(this.LJLJL);
        LIZ.append(", remoteCopy=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLJLLL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C188067Zq> getListState() {
        return this.LJLJLLL;
    }

    public /* synthetic */ C188027Zm(int i) {
        this(null, "", null, null, null, null, null, null, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C188027Zm)) {
            return false;
        }
        C188027Zm c188027Zm = (C188027Zm) obj;
        if (o.LJ(this.LJLIL, c188027Zm.LJLIL) && o.LJ(this.LJLILLLLZI, c188027Zm.LJLILLLLZI) && o.LJ(this.LJLJI, c188027Zm.LJLJI) && o.LJ(this.LJLJJI, c188027Zm.LJLJJI) && o.LJ(this.LJLJJL, c188027Zm.LJLJJL) && o.LJ(this.LJLJJLL, c188027Zm.LJLJJLL) && o.LJ(this.LJLJL, c188027Zm.LJLJL) && o.LJ(this.LJLJLJ, c188027Zm.LJLJLJ) && o.LJ(this.LJLJLLL, c188027Zm.LJLJLLL)) {
            return true;
        }
        return false;
    }

    public C188027Zm(C43I<Integer> c43i, String str, C43I<String> c43i2, C43I<String> c43i3, C43I<Integer> c43i4, C43I<Boolean> c43i5, C43I<Boolean> c43i6, C43I<WatchHistoryCopyResponse> c43i7, C8HZ<C188067Zq> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = c43i;
        this.LJLILLLLZI = str;
        this.LJLJI = c43i2;
        this.LJLJJI = c43i3;
        this.LJLJJL = c43i4;
        this.LJLJJLL = c43i5;
        this.LJLJL = c43i6;
        this.LJLJLJ = c43i7;
        this.LJLJLLL = listState;
    }

    public static C188027Zm LIZ(C188027Zm c188027Zm, String str, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, C8HZ c8hz, int i) {
        C43I<Integer> c43i7;
        C8HZ listState = c8hz;
        C43I c43i8 = c43i6;
        C43I c43i9 = c43i;
        String str2 = str;
        C43I c43i10 = c43i2;
        C43I c43i11 = c43i3;
        C43I c43i12 = c43i4;
        C43I c43i13 = c43i5;
        if ((i & 1) != 0) {
            c43i7 = c188027Zm.LJLIL;
        } else {
            c43i7 = null;
        }
        if ((i & 2) != 0) {
            str2 = c188027Zm.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i9 = c188027Zm.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i10 = c188027Zm.LJLJJI;
        }
        if ((i & 16) != 0) {
            c43i11 = c188027Zm.LJLJJL;
        }
        if ((i & 32) != 0) {
            c43i12 = c188027Zm.LJLJJLL;
        }
        if ((i & 64) != 0) {
            c43i13 = c188027Zm.LJLJL;
        }
        if ((i & 128) != 0) {
            c43i8 = c188027Zm.LJLJLJ;
        }
        if ((i & 256) != 0) {
            listState = c188027Zm.LJLJLLL;
        }
        c188027Zm.getClass();
        o.LJIIIZ(listState, "listState");
        return new C188027Zm(c43i7, str2, c43i9, c43i10, c43i11, c43i12, c43i13, c43i8, listState);
    }
}
