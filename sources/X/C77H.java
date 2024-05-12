package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.77H, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C77H implements InterfaceC208718Hb<C77H, InterfaceC57784Mm4> {
    public final C8HZ<InterfaceC57784Mm4> LJLIL;
    public final Aweme LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final C43I<Long> LJLJJL;
    public final C43I<Long> LJLJJLL;
    public final int LJLJL;
    public final NowFeedMobHierarchyData LJLJLJ;

    public C77H() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.LJLIL.hashCode() * 31;
        Aweme aweme = this.LJLILLLLZI;
        int i = 0;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        boolean z = this.LJLJI;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i2 + i4) * 31;
        if (!this.LJLJJI) {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        C43I<Long> c43i = this.LJLJJL;
        if (c43i == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c43i.hashCode();
        }
        int i7 = (i6 + hashCode2) * 31;
        C43I<Long> c43i2 = this.LJLJJLL;
        if (c43i2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c43i2.hashCode();
        }
        int i8 = (((i7 + hashCode3) * 31) + this.LJLJL) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LJLJLJ;
        if (nowFeedMobHierarchyData != null) {
            i = nowFeedMobHierarchyData.hashCode();
        }
        return i8 + i;
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
        LIZ.append("InteractionBubbleListVMState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", aweme=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isActive=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isVisible=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", commentCount=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", likeCount=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", commentPosition=");
        LIZ.append(this.LJLJL);
        LIZ.append(", hierarchyData=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C77H(int i) {
        this(new C8HZ(null, null, 15), null, false, false, null, null, 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77H)) {
            return false;
        }
        C77H c77h = (C77H) obj;
        if (o.LJ(this.LJLIL, c77h.LJLIL) && o.LJ(this.LJLILLLLZI, c77h.LJLILLLLZI) && this.LJLJI == c77h.LJLJI && this.LJLJJI == c77h.LJLJJI && o.LJ(this.LJLJJL, c77h.LJLJJL) && o.LJ(this.LJLJJLL, c77h.LJLJJLL) && this.LJLJL == c77h.LJLJL && o.LJ(this.LJLJLJ, c77h.LJLJLJ)) {
            return true;
        }
        return false;
    }

    public C77H(C8HZ<InterfaceC57784Mm4> listState, Aweme aweme, boolean z, boolean z2, C43I<Long> c43i, C43I<Long> c43i2, int i, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
        this.LJLILLLLZI = aweme;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = c43i;
        this.LJLJJLL = c43i2;
        this.LJLJL = i;
        this.LJLJLJ = nowFeedMobHierarchyData;
    }

    public static C77H LIZ(C77H c77h, C8HZ c8hz, Aweme aweme, boolean z, boolean z2, C43I c43i, C43I c43i2, int i, NowFeedMobHierarchyData nowFeedMobHierarchyData, int i2) {
        NowFeedMobHierarchyData nowFeedMobHierarchyData2 = nowFeedMobHierarchyData;
        int i3 = i;
        Aweme aweme2 = aweme;
        C8HZ listState = c8hz;
        boolean z3 = z;
        boolean z4 = z2;
        C43I c43i3 = c43i;
        C43I c43i4 = c43i2;
        if ((i2 & 1) != 0) {
            listState = c77h.LJLIL;
        }
        if ((i2 & 2) != 0) {
            aweme2 = c77h.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            z3 = c77h.LJLJI;
        }
        if ((i2 & 8) != 0) {
            z4 = c77h.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            c43i3 = c77h.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            c43i4 = c77h.LJLJJLL;
        }
        if ((i2 & 64) != 0) {
            i3 = c77h.LJLJL;
        }
        if ((i2 & 128) != 0) {
            nowFeedMobHierarchyData2 = c77h.LJLJLJ;
        }
        c77h.getClass();
        o.LJIIIZ(listState, "listState");
        return new C77H(listState, aweme2, z3, z4, c43i3, c43i4, i3, nowFeedMobHierarchyData2);
    }
}
