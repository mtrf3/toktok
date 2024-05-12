package com.ss.android.ugc.aweme.bnpl.network;

import X.C64797Pbt;
import X.C91818a0k;
import X.E8M;
import X.EKC;
import X.InterfaceC195727mC;
import X.InterfaceC64986Pew;
import X.InterfaceC65002PfC;
import X.InterfaceC67352kd;
import X.InterfaceC91835a11;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillDetailData;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillHomeData;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillList;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillRepaymentPrepareInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.CustomUnreadInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.RepaymentResultInfo;
import com.ss.android.ugc.aweme.bnpl.network.model.ApplyRepaymentRequest;
import com.ss.android.ugc.aweme.bnpl.network.model.ApplyRepaymentResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;

/* loaded from: classes20.dex */
public interface BillApi {
    public static final C91818a0k LIZ = C91818a0k.LIZ;

    @E8M("/credit/v1/repayment/repay")
    @InterfaceC91835a11
    Object applyRepayment(@InterfaceC195727mC ApplyRepaymentRequest applyRepaymentRequest, InterfaceC67352kd<? super C64797Pbt<BaseResponse<ApplyRepaymentResponse>>> interfaceC67352kd);

    @E8M("/api/customer_complaint/v1/bnpl/ticket_im/unread_num")
    Object getCustomUnread(@InterfaceC65002PfC("Content-Type") String str, @InterfaceC64986Pew("im_channel") int i, InterfaceC67352kd<? super C64797Pbt<CustomUnreadInfo>> interfaceC67352kd);

    @E8M("/credit/v1/repayment/result")
    Object getRepaymentResult(@InterfaceC195727mC RepaymentResultRequest repaymentResultRequest, InterfaceC67352kd<? super C64797Pbt<BaseResponse<RepaymentResultInfo>>> interfaceC67352kd);

    @E8M("/credit/v1/bill/detail")
    Object queryBillDetail(@InterfaceC195727mC StatementsDetailRequest statementsDetailRequest, InterfaceC67352kd<? super C64797Pbt<BaseResponse<BillDetailData>>> interfaceC67352kd);

    @E8M("/credit/v1/bill/main_page")
    Object queryBillHome(@InterfaceC65002PfC("Content-Type") String str, InterfaceC67352kd<? super C64797Pbt<BaseResponse<BillHomeData>>> interfaceC67352kd);

    @E8M("/credit/v1/bill/list")
    Object queryBillList(@InterfaceC195727mC StatementsListRequest statementsListRequest, InterfaceC67352kd<? super C64797Pbt<BaseResponse<BillList>>> interfaceC67352kd);

    @E8M("/credit/v1/repayment/prepare")
    @EKC({"Content-Type: application/json"})
    Object queryBillRepaymentPrepare(@InterfaceC65002PfC("Content-Type") String str, InterfaceC67352kd<? super C64797Pbt<BaseResponse<BillRepaymentPrepareInfo>>> interfaceC67352kd);
}
