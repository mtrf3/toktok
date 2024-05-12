package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9h1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243479h1 implements InterfaceC208718Hb<C243479h1, InterfaceC57784Mm4> {
    public final EnumC243389gs LJLIL;
    public final Aweme LJLILLLLZI;
    public final C43I<Boolean> LJLJI;
    public final C8HZ<InterfaceC57784Mm4> LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C243479h1() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        Aweme aweme = this.LJLILLLLZI;
        int i = 0;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        C43I<Boolean> c43i = this.LJLJI;
        if (c43i != null) {
            i = c43i.hashCode();
        }
        return this.LJLJJI.hashCode() + ((i2 + i) * 31);
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
        LIZ.append("FeaturedVideoFeaturedVideoState(loadingStatus=");
        LIZ.append(this.LJLIL);
        LIZ.append(", selectedFeatureVideo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", createNewVideo=");
        LIZ.append(this.LJLJI);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLJJI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C243479h1)) {
            return false;
        }
        C243479h1 c243479h1 = (C243479h1) obj;
        if (this.LJLIL == c243479h1.LJLIL && o.LJ(this.LJLILLLLZI, c243479h1.LJLILLLLZI) && o.LJ(this.LJLJI, c243479h1.LJLJI) && o.LJ(this.LJLJJI, c243479h1.LJLJJI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C243479h1(X.EnumC243389gs r4, com.ss.android.ugc.aweme.feed.model.Aweme r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 1
            if (r0 == 0) goto L6
            X.9gs r4 = X.EnumC243389gs.DEFAULT
        L6:
            r0 = r6 & 2
            r2 = 0
            if (r0 == 0) goto Lc
            r5 = r2
        Lc:
            r0 = r6 & 8
            if (r0 == 0) goto L1b
            X.8HZ r1 = new X.8HZ
            r0 = 15
            r1.<init>(r2, r2, r0)
        L17:
            r3.<init>(r4, r5, r2, r1)
            return
        L1b:
            r1 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243479h1.<init>(X.9gs, com.ss.android.ugc.aweme.feed.model.Aweme, int):void");
    }

    public C243479h1(EnumC243389gs loadingStatus, Aweme aweme, C43I<Boolean> c43i, C8HZ<InterfaceC57784Mm4> listState) {
        o.LJIIIZ(loadingStatus, "loadingStatus");
        o.LJIIIZ(listState, "listState");
        this.LJLIL = loadingStatus;
        this.LJLILLLLZI = aweme;
        this.LJLJI = c43i;
        this.LJLJJI = listState;
    }

    public static C243479h1 LIZ(C243479h1 c243479h1, EnumC243389gs loadingStatus, Aweme aweme, C43I c43i, C8HZ listState, int i) {
        if ((i & 1) != 0) {
            loadingStatus = c243479h1.LJLIL;
        }
        if ((i & 2) != 0) {
            aweme = c243479h1.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i = c243479h1.LJLJI;
        }
        if ((i & 8) != 0) {
            listState = c243479h1.LJLJJI;
        }
        c243479h1.getClass();
        o.LJIIIZ(loadingStatus, "loadingStatus");
        o.LJIIIZ(listState, "listState");
        return new C243479h1(loadingStatus, aweme, c43i, listState);
    }
}
