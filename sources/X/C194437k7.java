package X;

import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import kotlin.jvm.internal.o;

/* renamed from: X.7k7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194437k7 implements C33Q {
    public final AbstractC193947jK LJLIL;
    public final AbstractC194637kR LJLILLLLZI;
    public final C7ML LJLJI;
    public final C181847Bs LJLJJI;
    public final C196577nZ LJLJJL;
    public final String LJLJJLL;
    public final C57778Mly LJLJL;
    public final RelationStatus LJLJLJ;
    public final C43I<Boolean> LJLJLLL;
    public final Integer LJLL;
    public final boolean LJLLI;

    public C194437k7() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C194437k7)) {
            return false;
        }
        C194437k7 c194437k7 = (C194437k7) obj;
        return o.LJ(this.LJLIL, c194437k7.LJLIL) && o.LJ(this.LJLILLLLZI, c194437k7.LJLILLLLZI) && o.LJ(this.LJLJI, c194437k7.LJLJI) && o.LJ(this.LJLJJI, c194437k7.LJLJJI) && o.LJ(this.LJLJJL, c194437k7.LJLJJL) && o.LJ(this.LJLJJLL, c194437k7.LJLJJLL) && o.LJ(this.LJLJL, c194437k7.LJLJL) && o.LJ(this.LJLJLJ, c194437k7.LJLJLJ) && o.LJ(this.LJLJLLL, c194437k7.LJLJLLL) && o.LJ(this.LJLL, c194437k7.LJLL) && this.LJLLI == c194437k7.LJLLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31;
        C7ML c7ml = this.LJLJI;
        int i = 0;
        if (c7ml == null) {
            hashCode = 0;
        } else {
            hashCode = c7ml.hashCode();
        }
        int hashCode5 = (this.LJLJL.hashCode() + C79062V1e.LJ(this.LJLJJLL, (this.LJLJJL.hashCode() + ((this.LJLJJI.hashCode() + ((hashCode4 + hashCode) * 31)) * 31)) * 31, 31)) * 31;
        RelationStatus relationStatus = this.LJLJLJ;
        if (relationStatus == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = relationStatus.hashCode();
        }
        int i2 = (hashCode5 + hashCode2) * 31;
        C43I<Boolean> c43i = this.LJLJLLL;
        if (c43i == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c43i.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        Integer num = this.LJLL;
        if (num != null) {
            i = num.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z = this.LJLLI;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return i4 + i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowPostCellState(cellState=");
        sb.append(this.LJLIL);
        sb.append(", feedPostState=");
        sb.append(this.LJLILLLLZI);
        sb.append(", item=");
        sb.append(this.LJLJI);
        sb.append(", feedHierarchyData=");
        sb.append(this.LJLJJI);
        sb.append(", windowUrlHolder=");
        sb.append(this.LJLJJL);
        sb.append(", cellHeightDimensionRatio=");
        sb.append(this.LJLJJLL);
        sb.append(", userCardState=");
        sb.append(this.LJLJL);
        sb.append(", relationStatus=");
        sb.append(this.LJLJLJ);
        sb.append(", onRelationVisibilityChanged=");
        sb.append(this.LJLJLLL);
        sb.append(", nowMainPostAdjustedWidth=");
        sb.append(this.LJLL);
        sb.append(", hideAllViewByGesture=");
        return C08880Wm.LIZJ(sb, this.LJLLI, ')');
    }

    public /* synthetic */ C194437k7(int i) {
        this(C193907jG.LIZIZ, C194627kQ.LIZ, null, new C181847Bs(new AbstractC193937jJ() { // from class: X.7k8
            @Override // X.AbstractC193937jJ
            public final boolean LIZ() {
                return false;
            }

            @Override // X.AbstractC193937jJ
            public final boolean LIZJ(AbstractC194637kR state) {
                o.LJIIIZ(state, "state");
                return false;
            }

            @Override // X.AbstractC193937jJ
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.AbstractC193937jJ
            public final boolean LJ() {
                return false;
            }

            @Override // X.AbstractC193937jJ
            public final String LJFF() {
                return "NowFeedUninitialized";
            }
        }, null, null, 62), new C196577nZ(null, null, null, null), "H,3:4", new C57778Mly(0), null, null, null, false);
    }

    public C194437k7(AbstractC193947jK cellState, AbstractC194637kR feedPostState, C7ML c7ml, C181847Bs feedHierarchyData, C196577nZ windowUrlHolder, String cellHeightDimensionRatio, C57778Mly userCardState, RelationStatus relationStatus, C43I<Boolean> c43i, Integer num, boolean z) {
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(feedPostState, "feedPostState");
        o.LJIIIZ(feedHierarchyData, "feedHierarchyData");
        o.LJIIIZ(windowUrlHolder, "windowUrlHolder");
        o.LJIIIZ(cellHeightDimensionRatio, "cellHeightDimensionRatio");
        o.LJIIIZ(userCardState, "userCardState");
        this.LJLIL = cellState;
        this.LJLILLLLZI = feedPostState;
        this.LJLJI = c7ml;
        this.LJLJJI = feedHierarchyData;
        this.LJLJJL = windowUrlHolder;
        this.LJLJJLL = cellHeightDimensionRatio;
        this.LJLJL = userCardState;
        this.LJLJLJ = relationStatus;
        this.LJLJLLL = c43i;
        this.LJLL = num;
        this.LJLLI = z;
    }

    public static C194437k7 LIZ(C194437k7 c194437k7, AbstractC193947jK abstractC193947jK, AbstractC194637kR abstractC194637kR, C7ML c7ml, C181847Bs c181847Bs, C196577nZ c196577nZ, String str, RelationStatus relationStatus, C43I c43i, Integer num, boolean z, int i) {
        C57778Mly userCardState;
        boolean z2 = z;
        Integer num2 = num;
        C43I c43i2 = c43i;
        RelationStatus relationStatus2 = relationStatus;
        AbstractC194637kR feedPostState = abstractC194637kR;
        AbstractC193947jK cellState = abstractC193947jK;
        C7ML c7ml2 = c7ml;
        C181847Bs feedHierarchyData = c181847Bs;
        C196577nZ windowUrlHolder = c196577nZ;
        String cellHeightDimensionRatio = str;
        if ((i & 1) != 0) {
            cellState = c194437k7.LJLIL;
        }
        if ((i & 2) != 0) {
            feedPostState = c194437k7.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c7ml2 = c194437k7.LJLJI;
        }
        if ((i & 8) != 0) {
            feedHierarchyData = c194437k7.LJLJJI;
        }
        if ((i & 16) != 0) {
            windowUrlHolder = c194437k7.LJLJJL;
        }
        if ((i & 32) != 0) {
            cellHeightDimensionRatio = c194437k7.LJLJJLL;
        }
        if ((i & 64) != 0) {
            userCardState = c194437k7.LJLJL;
        } else {
            userCardState = null;
        }
        if ((i & 128) != 0) {
            relationStatus2 = c194437k7.LJLJLJ;
        }
        if ((i & 256) != 0) {
            c43i2 = c194437k7.LJLJLLL;
        }
        if ((i & 512) != 0) {
            num2 = c194437k7.LJLL;
        }
        if ((i & 1024) != 0) {
            z2 = c194437k7.LJLLI;
        }
        c194437k7.getClass();
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(feedPostState, "feedPostState");
        o.LJIIIZ(feedHierarchyData, "feedHierarchyData");
        o.LJIIIZ(windowUrlHolder, "windowUrlHolder");
        o.LJIIIZ(cellHeightDimensionRatio, "cellHeightDimensionRatio");
        o.LJIIIZ(userCardState, "userCardState");
        return new C194437k7(cellState, feedPostState, c7ml2, feedHierarchyData, windowUrlHolder, cellHeightDimensionRatio, userCardState, relationStatus2, c43i2, num2, z2);
    }
}
