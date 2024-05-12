package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7m4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195647m4 implements InterfaceC194547kI {
    public final Aweme LJLIL;
    public final Boolean LJLILLLLZI;
    public final Boolean LJLJI;
    public final int LJLJJI;
    public InterfaceC55235Lm3 LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;
    public final boolean LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;
    public final String LJLLI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.LJLIL.hashCode() * 31;
        Boolean bool = this.LJLILLLLZI;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        Boolean bool2 = this.LJLJI;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + this.LJLJJI) * 31;
        InterfaceC55235Lm3 interfaceC55235Lm3 = this.LJLJJL;
        if (interfaceC55235Lm3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = interfaceC55235Lm3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        boolean z = this.LJLJJLL;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        boolean z2 = this.LJLJL;
        int i8 = z2;
        if (z2 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        if (!this.LJLJLJ) {
            i5 = 0;
        }
        int LJ = C79062V1e.LJ(this.LJLJLLL, (i9 + i5) * 31, 31);
        String str = this.LJLL;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i10 = (LJ + hashCode4) * 31;
        String str2 = this.LJLLI;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i10 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowImageItem(aweme=");
        sb.append(this.LJLIL);
        sb.append(", isEmptyCellItem=");
        sb.append(this.LJLILLLLZI);
        sb.append(", isMyPostLoading=");
        sb.append(this.LJLJI);
        sb.append(", nowFeedType=");
        sb.append(this.LJLJJI);
        sb.append(", scope=");
        sb.append(this.LJLJJL);
        sb.append(", isAggregatedChild=");
        sb.append(this.LJLJJLL);
        sb.append(", isFakeItem=");
        sb.append(this.LJLJL);
        sb.append(", isInFeedViewHolder=");
        sb.append(this.LJLJLJ);
        sb.append(", recommendPosition=");
        sb.append(this.LJLJLLL);
        sb.append(", insertItemEnterFrom=");
        sb.append(this.LJLL);
        sb.append(", insertItemEnterPosition=");
        return C07670Rv.LIZIZ(sb, this.LJLLI, ')');
    }

    @Override // X.InterfaceC194547kI
    public final boolean G() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC194547kI
    public final String LJLIL() {
        return this.LJLJLLL;
    }

    @Override // X.C7ML
    public final String LLFFF() {
        return this.LJLLI;
    }

    @Override // X.C7ML
    public final Boolean LLJJJ() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC194547kI
    public final boolean LLLIL() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC194547kI
    public final boolean LLLLIIIILLL() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC194547kI
    public final InterfaceC55235Lm3 LLLLJI() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC194547kI
    public final Boolean d() {
        return this.LJLJI;
    }

    @Override // X.C7ML, X.InterfaceC213078Xv
    public final Aweme getAweme() {
        return this.LJLIL;
    }

    @Override // X.C7ML
    public final String l() {
        return this.LJLL;
    }

    @Override // X.C7ML
    public final int z() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC194547kI
    public final void LLLLIILLL(InterfaceC55235Lm3 interfaceC55235Lm3) {
        this.LJLJJL = interfaceC55235Lm3;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return C194557kJ.LIZ(this, interfaceC57784Mm4);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return C194557kJ.LIZIZ(this, interfaceC57784Mm4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C195647m4)) {
            return false;
        }
        C195647m4 c195647m4 = (C195647m4) obj;
        if (o.LJ(this.LJLIL, c195647m4.LJLIL) && o.LJ(this.LJLILLLLZI, c195647m4.LJLILLLLZI) && o.LJ(this.LJLJI, c195647m4.LJLJI) && this.LJLJJI == c195647m4.LJLJJI && o.LJ(this.LJLJJL, c195647m4.LJLJJL) && this.LJLJJLL == c195647m4.LJLJJLL && this.LJLJL == c195647m4.LJLJL && this.LJLJLJ == c195647m4.LJLJLJ && o.LJ(this.LJLJLLL, c195647m4.LJLJLLL) && o.LJ(this.LJLL, c195647m4.LJLL) && o.LJ(this.LJLLI, c195647m4.LJLLI)) {
            return true;
        }
        return false;
    }

    public C195647m4(Aweme aweme, Boolean bool, Boolean bool2, int i, InterfaceC55235Lm3 interfaceC55235Lm3, boolean z, boolean z2, boolean z3, String recommendPosition, String str, String str2) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(recommendPosition, "recommendPosition");
        this.LJLIL = aweme;
        this.LJLILLLLZI = bool;
        this.LJLJI = bool2;
        this.LJLJJI = i;
        this.LJLJJL = interfaceC55235Lm3;
        this.LJLJJLL = z;
        this.LJLJL = z2;
        this.LJLJLJ = z3;
        this.LJLJLLL = recommendPosition;
        this.LJLL = str;
        this.LJLLI = str2;
    }
}
