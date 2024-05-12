package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillDetailData;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillHomeData;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillList;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillRepaymentPrepareInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.CustomUnreadInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.RepaymentResultInfo;
import com.ss.android.ugc.aweme.bnpl.network.BillApi;
import com.ss.android.ugc.aweme.bnpl.network.RepaymentResultRequest;
import com.ss.android.ugc.aweme.bnpl.network.StatementsDetailRequest;
import com.ss.android.ugc.aweme.bnpl.network.StatementsListRequest;
import com.ss.android.ugc.aweme.bnpl.network.model.ApplyRepaymentRequest;
import com.ss.android.ugc.aweme.bnpl.network.model.ApplyRepaymentResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;

/* renamed from: X.a9f, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92371a9f implements InterfaceC92249a7h {
    @Override // X.InterfaceC92249a7h
    public final Object LJJII(InterfaceC67352kd<? super C64797Pbt<BaseResponse<BillRepaymentPrepareInfo>>> interfaceC67352kd) {
        BillApi.LIZ.getClass();
        return C91818a0k.LIZIZ.queryBillRepaymentPrepare("application/json", interfaceC67352kd);
    }

    @Override // X.InterfaceC92249a7h
    public final Object LJJLL(InterfaceC67352kd<? super C64797Pbt<CustomUnreadInfo>> interfaceC67352kd) {
        BillApi.LIZ.getClass();
        return C91818a0k.LIZIZ.getCustomUnread("application/json", 37, interfaceC67352kd);
    }

    @Override // X.InterfaceC92249a7h
    public final Object LJLJJL(InterfaceC67352kd<? super C64797Pbt<BaseResponse<BillHomeData>>> interfaceC67352kd) {
        BillApi.LIZ.getClass();
        return C91818a0k.LIZIZ.queryBillHome("application/json", interfaceC67352kd);
    }

    @Override // X.InterfaceC92249a7h
    public final Object LJLI(String str, InterfaceC67352kd<? super C64797Pbt<BaseResponse<RepaymentResultInfo>>> interfaceC67352kd) {
        BillApi.LIZ.getClass();
        return C91818a0k.LIZIZ.getRepaymentResult(new RepaymentResultRequest(str), interfaceC67352kd);
    }

    @Override // X.InterfaceC92249a7h
    public final Object LJZI(String str, InterfaceC67352kd<? super C64797Pbt<BaseResponse<BillList>>> interfaceC67352kd) {
        BillApi.LIZ.getClass();
        return C91818a0k.LIZIZ.queryBillList(new StatementsListRequest(str), interfaceC67352kd);
    }

    @Override // X.InterfaceC92249a7h
    public final Object applyRepayment(ApplyRepaymentRequest applyRepaymentRequest, InterfaceC67352kd<? super C64797Pbt<BaseResponse<ApplyRepaymentResponse>>> interfaceC67352kd) {
        BillApi.LIZ.getClass();
        return C91818a0k.LIZIZ.applyRepayment(applyRepaymentRequest, interfaceC67352kd);
    }

    @Override // X.InterfaceC92249a7h
    public final Object LJIILLIIL(String str, String str2, InterfaceC67352kd<? super C64797Pbt<BaseResponse<BillDetailData>>> interfaceC67352kd) {
        BillApi.LIZ.getClass();
        return C91818a0k.LIZIZ.queryBillDetail(new StatementsDetailRequest(str, str2), interfaceC67352kd);
    }
}
