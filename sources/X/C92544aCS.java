package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Amount;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillHomeData;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Notice;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.RepaymentPoint;
import kotlin.jvm.internal.o;

/* renamed from: X.aCS, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92544aCS extends AbstractC65781Prl implements InterfaceC88472Yns<C92209a73, C92209a73> {
    public final /* synthetic */ BillHomeData LJLIL;
    public final /* synthetic */ EnumC91920a2O LJLILLLLZI;
    public final /* synthetic */ EnumC91918a2M LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92544aCS(BillHomeData billHomeData, EnumC91920a2O enumC91920a2O, EnumC91918a2M enumC91918a2M, String str, String str2) {
        super(1);
        this.LJLIL = billHomeData;
        this.LJLILLLLZI = enumC91920a2O;
        this.LJLJI = enumC91918a2M;
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C92209a73 invoke(C92209a73 c92209a73) {
        long j;
        C92209a73 setState = c92209a73;
        o.LJIIIZ(setState, "$this$setState");
        EnumC91916a2K enumC91916a2K = EnumC91916a2K.SUCCESS;
        BillHomeData billHomeData = this.LJLIL;
        String str = billHomeData.billId;
        if (str == null) {
            str = "";
        }
        Long l = billHomeData.dueDate;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        BillHomeData billHomeData2 = this.LJLIL;
        String str2 = billHomeData2.customerServiceUrl;
        String str3 = billHomeData2.settingPageUrl;
        String str4 = billHomeData2.refundRecordUrl;
        String str5 = billHomeData2.repaymentRecordUrl;
        Notice notice = billHomeData2.notice;
        RepaymentPoint repaymentPoint = billHomeData2.repaymentPoint;
        Amount amount = billHomeData2.dueAmount;
        return C92209a73.LIZ(setState, enumC91916a2K, null, false, this.LJLILLLLZI, this.LJLJI, str, j, billHomeData2.overdueDays, amount, this.LJLJJI, this.LJLJJL, notice, str3, str2, str5, str4, repaymentPoint, false, 131078);
    }
}
