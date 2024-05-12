package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Amount;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillDetailData;
import kotlin.jvm.internal.o;

/* renamed from: X.aC7, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92523aC7 extends AbstractC65781Prl implements InterfaceC88472Yns<C93077aL3, C93077aL3> {
    public final /* synthetic */ BillDetailData LJLIL;
    public final /* synthetic */ EnumC91909a2D LJLILLLLZI;
    public final /* synthetic */ EnumC91907a2B LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92523aC7(BillDetailData billDetailData, EnumC91909a2D enumC91909a2D, EnumC91907a2B enumC91907a2B, String str, String str2, String str3) {
        super(1);
        this.LJLIL = billDetailData;
        this.LJLILLLLZI = enumC91909a2D;
        this.LJLJI = enumC91907a2B;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C93077aL3 invoke(C93077aL3 c93077aL3) {
        int i;
        C93077aL3 setState = c93077aL3;
        o.LJIIIZ(setState, "$this$setState");
        BillDetailData billDetailData = this.LJLIL;
        Amount amount = billDetailData.totalStatement;
        Amount amount2 = billDetailData.amountDue;
        Amount amount3 = billDetailData.amountRepayment;
        Integer num = billDetailData.overdueDays;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        return C93077aL3.LIZ(setState, EnumC91916a2K.SUCCESS, this.LJLILLLLZI, this.LJLJI, false, this.LJLJJI, Boolean.valueOf(this.LJLIL.repaymentButtonShow), this.LJLJJL, amount, amount2, amount3, i, this.LJLJJLL, false, null, 24616);
    }
}
