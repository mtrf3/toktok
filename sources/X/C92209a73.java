package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Amount;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Notice;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.RepaymentPoint;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.a73, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92209a73 implements C33Q {
    public final EnumC91916a2K LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final EnumC91920a2O LJLJJI;
    public final EnumC91918a2M LJLJJL;
    public final String LJLJJLL;
    public final long LJLJL;
    public final Integer LJLJLJ;
    public final Amount LJLJLLL;
    public final String LJLL;
    public final String LJLLI;
    public final Notice LJLLILLLL;
    public final String LJLLJ;
    public final String LJLLL;
    public final String LJLLLL;
    public final String LJLLLLLL;
    public final RepaymentPoint LJLZ;
    public final boolean LJZ;

    public C92209a73() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92209a73)) {
            return false;
        }
        C92209a73 c92209a73 = (C92209a73) obj;
        return this.LJLIL == c92209a73.LJLIL && o.LJ(this.LJLILLLLZI, c92209a73.LJLILLLLZI) && this.LJLJI == c92209a73.LJLJI && this.LJLJJI == c92209a73.LJLJJI && this.LJLJJL == c92209a73.LJLJJL && o.LJ(this.LJLJJLL, c92209a73.LJLJJLL) && this.LJLJL == c92209a73.LJLJL && o.LJ(this.LJLJLJ, c92209a73.LJLJLJ) && o.LJ(this.LJLJLLL, c92209a73.LJLJLLL) && o.LJ(this.LJLL, c92209a73.LJLL) && o.LJ(this.LJLLI, c92209a73.LJLLI) && o.LJ(this.LJLLILLLL, c92209a73.LJLLILLLL) && o.LJ(this.LJLLJ, c92209a73.LJLLJ) && o.LJ(this.LJLLL, c92209a73.LJLLL) && o.LJ(this.LJLLLL, c92209a73.LJLLLL) && o.LJ(this.LJLLLLLL, c92209a73.LJLLLLLL) && o.LJ(this.LJLZ, c92209a73.LJLZ) && this.LJZ == c92209a73.LJZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = (((((((((hashCode2 + i) * 31) + this.LJLJJI.hashCode()) * 31) + this.LJLJJL.hashCode()) * 31) + this.LJLJJLL.hashCode()) * 31) + C16880lQ.LLJIJIL(this.LJLJL)) * 31;
        Integer num = this.LJLJLJ;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Amount amount = this.LJLJLLL;
        int hashCode5 = (((((hashCode4 + (amount == null ? 0 : amount.hashCode())) * 31) + this.LJLL.hashCode()) * 31) + this.LJLLI.hashCode()) * 31;
        Notice notice = this.LJLLILLLL;
        int hashCode6 = (((((hashCode5 + (notice == null ? 0 : notice.hashCode())) * 31) + this.LJLLJ.hashCode()) * 31) + this.LJLLL.hashCode()) * 31;
        String str2 = this.LJLLLL;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLLLLLL;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RepaymentPoint repaymentPoint = this.LJLZ;
        return ((hashCode8 + (repaymentPoint != null ? repaymentPoint.hashCode() : 0)) * 31) + (this.LJZ ? 1 : 0);
    }

    public final String toString() {
        return "BillHomeViewState(loadingStatus=" + this.LJLIL + ", errorMsg=" + this.LJLILLLLZI + ", prepareLoading=" + this.LJLJI + ", userStatus=" + this.LJLJJI + ", userBillStatus=" + this.LJLJJL + ", billId=" + this.LJLJJLL + ", dueDate=" + this.LJLJL + ", overdueDays=" + this.LJLJLJ + ", dueAmount=" + this.LJLJLLL + ", availableAmount=" + this.LJLL + ", limitAmount=" + this.LJLLI + ", notice=" + this.LJLLILLLL + ", settingPageUrl=" + this.LJLLJ + ", customerServiceUrl=" + this.LJLLL + ", repaymentRecordUrl=" + this.LJLLLL + ", refundRecordUrl=" + this.LJLLLLLL + ", pageTipsInfo=" + this.LJLZ + ", showCustomBubble=" + this.LJZ + ')';
    }

    public /* synthetic */ C92209a73(int i) {
        this(EnumC91916a2K.LOADING, null, false, EnumC91920a2O.USER_NORMAL, EnumC91918a2M.BILL_USER_NEW, "", 0L, null, null, "", "", null, "", "", null, null, null, false);
    }

    public C92209a73(EnumC91916a2K loadingStatus, String str, boolean z, EnumC91920a2O userStatus, EnumC91918a2M userBillStatus, String billId, long j, Integer num, Amount amount, String availableAmount, String limitAmount, Notice notice, String settingPageUrl, String customerServiceUrl, String str2, String str3, RepaymentPoint repaymentPoint, boolean z2) {
        o.LJIIIZ(loadingStatus, "loadingStatus");
        o.LJIIIZ(userStatus, "userStatus");
        o.LJIIIZ(userBillStatus, "userBillStatus");
        o.LJIIIZ(billId, "billId");
        o.LJIIIZ(availableAmount, "availableAmount");
        o.LJIIIZ(limitAmount, "limitAmount");
        o.LJIIIZ(settingPageUrl, "settingPageUrl");
        o.LJIIIZ(customerServiceUrl, "customerServiceUrl");
        this.LJLIL = loadingStatus;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = userStatus;
        this.LJLJJL = userBillStatus;
        this.LJLJJLL = billId;
        this.LJLJL = j;
        this.LJLJLJ = num;
        this.LJLJLLL = amount;
        this.LJLL = availableAmount;
        this.LJLLI = limitAmount;
        this.LJLLILLLL = notice;
        this.LJLLJ = settingPageUrl;
        this.LJLLL = customerServiceUrl;
        this.LJLLLL = str2;
        this.LJLLLLLL = str3;
        this.LJLZ = repaymentPoint;
        this.LJZ = z2;
    }

    public static C92209a73 LIZ(C92209a73 c92209a73, EnumC91916a2K enumC91916a2K, String str, boolean z, EnumC91920a2O enumC91920a2O, EnumC91918a2M enumC91918a2M, String str2, long j, Integer num, Amount amount, String str3, String str4, Notice notice, String str5, String str6, String str7, String str8, RepaymentPoint repaymentPoint, boolean z2, int i) {
        boolean z3 = z2;
        RepaymentPoint repaymentPoint2 = repaymentPoint;
        String billId = str2;
        String str9 = str8;
        EnumC91918a2M userBillStatus = enumC91918a2M;
        EnumC91920a2O userStatus = enumC91920a2O;
        boolean z4 = z;
        EnumC91916a2K loadingStatus = enumC91916a2K;
        Amount amount2 = amount;
        String str10 = str;
        String str11 = str7;
        long j2 = j;
        Integer num2 = num;
        String availableAmount = str3;
        Notice notice2 = notice;
        String limitAmount = str4;
        String settingPageUrl = str5;
        String customerServiceUrl = str6;
        if ((i & 1) != 0) {
            loadingStatus = c92209a73.LJLIL;
        }
        if ((i & 2) != 0) {
            str10 = c92209a73.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z4 = c92209a73.LJLJI;
        }
        if ((i & 8) != 0) {
            userStatus = c92209a73.LJLJJI;
        }
        if ((i & 16) != 0) {
            userBillStatus = c92209a73.LJLJJL;
        }
        if ((i & 32) != 0) {
            billId = c92209a73.LJLJJLL;
        }
        if ((i & 64) != 0) {
            j2 = c92209a73.LJLJL;
        }
        if ((i & 128) != 0) {
            num2 = c92209a73.LJLJLJ;
        }
        if ((i & 256) != 0) {
            amount2 = c92209a73.LJLJLLL;
        }
        if ((i & 512) != 0) {
            availableAmount = c92209a73.LJLL;
        }
        if ((i & 1024) != 0) {
            limitAmount = c92209a73.LJLLI;
        }
        if ((i & 2048) != 0) {
            notice2 = c92209a73.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            settingPageUrl = c92209a73.LJLLJ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            customerServiceUrl = c92209a73.LJLLL;
        }
        if ((i & 16384) != 0) {
            str11 = c92209a73.LJLLLL;
        }
        if ((32768 & i) != 0) {
            str9 = c92209a73.LJLLLLLL;
        }
        if ((65536 & i) != 0) {
            repaymentPoint2 = c92209a73.LJLZ;
        }
        if ((i & 131072) != 0) {
            z3 = c92209a73.LJZ;
        }
        c92209a73.getClass();
        o.LJIIIZ(loadingStatus, "loadingStatus");
        o.LJIIIZ(userStatus, "userStatus");
        o.LJIIIZ(userBillStatus, "userBillStatus");
        o.LJIIIZ(billId, "billId");
        o.LJIIIZ(availableAmount, "availableAmount");
        o.LJIIIZ(limitAmount, "limitAmount");
        o.LJIIIZ(settingPageUrl, "settingPageUrl");
        o.LJIIIZ(customerServiceUrl, "customerServiceUrl");
        RepaymentPoint repaymentPoint3 = repaymentPoint2;
        boolean z5 = z3;
        Integer num3 = num2;
        Amount amount3 = amount2;
        return new C92209a73(loadingStatus, str10, z4, userStatus, userBillStatus, billId, j2, num3, amount3, availableAmount, limitAmount, notice2, settingPageUrl, customerServiceUrl, str11, str9, repaymentPoint3, z5);
    }
}
