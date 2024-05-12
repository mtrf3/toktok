package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Amount;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aL3, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93077aL3 implements InterfaceC208718Hb<C93077aL3, C92364a9Y> {
    public final EnumC91916a2K LJLIL;
    public final EnumC91909a2D LJLILLLLZI;
    public final EnumC91907a2B LJLJI;
    public final boolean LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final Boolean LJLJL;
    public final String LJLJLJ;
    public final Amount LJLJLLL;
    public final Amount LJLL;
    public final Amount LJLLI;
    public final int LJLLILLLL;
    public final String LJLLJ;
    public final boolean LJLLL;
    public final C8HZ<C92364a9Y> LJLLLL;

    public C93077aL3() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI.hashCode()) * 31) + this.LJLJI.hashCode()) * 31;
        boolean z = this.LJLJJI;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int hashCode6 = (((((hashCode5 + i2) * 31) + this.LJLJJL.hashCode()) * 31) + this.LJLJJLL.hashCode()) * 31;
        Boolean bool = this.LJLJL;
        int i3 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int hashCode7 = (((hashCode6 + hashCode) * 31) + this.LJLJLJ.hashCode()) * 31;
        Amount amount = this.LJLJLLL;
        if (amount == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = amount.hashCode();
        }
        int i4 = (hashCode7 + hashCode2) * 31;
        Amount amount2 = this.LJLL;
        if (amount2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = amount2.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        Amount amount3 = this.LJLLI;
        if (amount3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = amount3.hashCode();
        }
        int i6 = (((i5 + hashCode4) * 31) + this.LJLLILLLL) * 31;
        String str = this.LJLLJ;
        if (str != null) {
            i3 = str.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        if (!this.LJLLL) {
            i = 0;
        }
        return ((i7 + i) * 31) + this.LJLLLL.hashCode();
    }

    public final String toString() {
        return "DetailViewState(loadingStatus=" + this.LJLIL + ", billRepaymentStatus=" + this.LJLILLLLZI + ", billStatus=" + this.LJLJI + ", prepareLoading=" + this.LJLJJI + ", billMonth=" + this.LJLJJL + ", amount=" + this.LJLJJLL + ", showRepaymentButton=" + this.LJLJL + ", dueDate=" + this.LJLJLJ + ", totalAmount=" + this.LJLJLLL + ", dueAmount=" + this.LJLL + ", amountRepayment=" + this.LJLLI + ", overdueDays=" + this.LJLLILLLL + ", billPeriod=" + this.LJLLJ + ", showAmountDetailBox=" + this.LJLLL + ", listState=" + this.LJLLLL + ')';
    }

    @Override // X.InterfaceC2064888m
    public final List<C92364a9Y> getListItemState() {
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

    @Override // X.InterfaceC2064788l
    public final C8HZ<C92364a9Y> getListState() {
        return this.LJLLLL;
    }

    public /* synthetic */ C93077aL3(int i) {
        this(EnumC91916a2K.LOADING, EnumC91909a2D.NO_NEED_TO_PAY, EnumC91907a2B.BILLED, false, "", "", Boolean.FALSE, "", null, null, null, 0, "", false, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93077aL3)) {
            return false;
        }
        C93077aL3 c93077aL3 = (C93077aL3) obj;
        if (this.LJLIL == c93077aL3.LJLIL && this.LJLILLLLZI == c93077aL3.LJLILLLLZI && this.LJLJI == c93077aL3.LJLJI && this.LJLJJI == c93077aL3.LJLJJI && o.LJ(this.LJLJJL, c93077aL3.LJLJJL) && o.LJ(this.LJLJJLL, c93077aL3.LJLJJLL) && o.LJ(this.LJLJL, c93077aL3.LJLJL) && o.LJ(this.LJLJLJ, c93077aL3.LJLJLJ) && o.LJ(this.LJLJLLL, c93077aL3.LJLJLLL) && o.LJ(this.LJLL, c93077aL3.LJLL) && o.LJ(this.LJLLI, c93077aL3.LJLLI) && this.LJLLILLLL == c93077aL3.LJLLILLLL && o.LJ(this.LJLLJ, c93077aL3.LJLLJ) && this.LJLLL == c93077aL3.LJLLL && o.LJ(this.LJLLLL, c93077aL3.LJLLLL)) {
            return true;
        }
        return false;
    }

    public C93077aL3(EnumC91916a2K loadingStatus, EnumC91909a2D billRepaymentStatus, EnumC91907a2B billStatus, boolean z, String billMonth, String amount, Boolean bool, String dueDate, Amount amount2, Amount amount3, Amount amount4, int i, String str, boolean z2, C8HZ<C92364a9Y> listState) {
        o.LJIIIZ(loadingStatus, "loadingStatus");
        o.LJIIIZ(billRepaymentStatus, "billRepaymentStatus");
        o.LJIIIZ(billStatus, "billStatus");
        o.LJIIIZ(billMonth, "billMonth");
        o.LJIIIZ(amount, "amount");
        o.LJIIIZ(dueDate, "dueDate");
        o.LJIIIZ(listState, "listState");
        this.LJLIL = loadingStatus;
        this.LJLILLLLZI = billRepaymentStatus;
        this.LJLJI = billStatus;
        this.LJLJJI = z;
        this.LJLJJL = billMonth;
        this.LJLJJLL = amount;
        this.LJLJL = bool;
        this.LJLJLJ = dueDate;
        this.LJLJLLL = amount2;
        this.LJLL = amount3;
        this.LJLLI = amount4;
        this.LJLLILLLL = i;
        this.LJLLJ = str;
        this.LJLLL = z2;
        this.LJLLLL = listState;
    }

    public static C93077aL3 LIZ(C93077aL3 c93077aL3, EnumC91916a2K enumC91916a2K, EnumC91909a2D enumC91909a2D, EnumC91907a2B enumC91907a2B, boolean z, String str, Boolean bool, String str2, Amount amount, Amount amount2, Amount amount3, int i, String str3, boolean z2, C8HZ c8hz, int i2) {
        String amount4;
        C8HZ listState = c8hz;
        boolean z3 = z2;
        String str4 = str3;
        int i3 = i;
        Amount amount5 = amount3;
        Amount amount6 = amount2;
        Amount amount7 = amount;
        String dueDate = str2;
        EnumC91909a2D billRepaymentStatus = enumC91909a2D;
        EnumC91916a2K loadingStatus = enumC91916a2K;
        EnumC91907a2B billStatus = enumC91907a2B;
        boolean z4 = z;
        String billMonth = str;
        Boolean bool2 = bool;
        if ((i2 & 1) != 0) {
            loadingStatus = c93077aL3.LJLIL;
        }
        if ((i2 & 2) != 0) {
            billRepaymentStatus = c93077aL3.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            billStatus = c93077aL3.LJLJI;
        }
        if ((i2 & 8) != 0) {
            z4 = c93077aL3.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            billMonth = c93077aL3.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            amount4 = c93077aL3.LJLJJLL;
        } else {
            amount4 = null;
        }
        if ((i2 & 64) != 0) {
            bool2 = c93077aL3.LJLJL;
        }
        if ((i2 & 128) != 0) {
            dueDate = c93077aL3.LJLJLJ;
        }
        if ((i2 & 256) != 0) {
            amount7 = c93077aL3.LJLJLLL;
        }
        if ((i2 & 512) != 0) {
            amount6 = c93077aL3.LJLL;
        }
        if ((i2 & 1024) != 0) {
            amount5 = c93077aL3.LJLLI;
        }
        if ((i2 & 2048) != 0) {
            i3 = c93077aL3.LJLLILLLL;
        }
        if ((i2 & 4096) != 0) {
            str4 = c93077aL3.LJLLJ;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            z3 = c93077aL3.LJLLL;
        }
        if ((i2 & 16384) != 0) {
            listState = c93077aL3.LJLLLL;
        }
        c93077aL3.getClass();
        o.LJIIIZ(loadingStatus, "loadingStatus");
        o.LJIIIZ(billRepaymentStatus, "billRepaymentStatus");
        o.LJIIIZ(billStatus, "billStatus");
        o.LJIIIZ(billMonth, "billMonth");
        o.LJIIIZ(amount4, "amount");
        o.LJIIIZ(dueDate, "dueDate");
        o.LJIIIZ(listState, "listState");
        Boolean bool3 = bool2;
        return new C93077aL3(loadingStatus, billRepaymentStatus, billStatus, z4, billMonth, amount4, bool3, dueDate, amount7, amount6, amount5, i3, str4, z3, listState);
    }
}
