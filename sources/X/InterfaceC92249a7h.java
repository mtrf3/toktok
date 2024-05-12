package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillDetailData;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillHomeData;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillList;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillRepaymentPrepareInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.CustomUnreadInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.RepaymentResultInfo;
import com.ss.android.ugc.aweme.bnpl.network.model.ApplyRepaymentRequest;
import com.ss.android.ugc.aweme.bnpl.network.model.ApplyRepaymentResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.BaseResponse;

/* renamed from: X.a7h, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public interface InterfaceC92249a7h extends InterfaceC88763e4 {
    Object LJIILLIIL(String str, String str2, InterfaceC67352kd<? super C64797Pbt<BaseResponse<BillDetailData>>> interfaceC67352kd);

    Object LJJII(InterfaceC67352kd<? super C64797Pbt<BaseResponse<BillRepaymentPrepareInfo>>> interfaceC67352kd);

    Object LJJLL(InterfaceC67352kd<? super C64797Pbt<CustomUnreadInfo>> interfaceC67352kd);

    Object LJLI(String str, InterfaceC67352kd<? super C64797Pbt<BaseResponse<RepaymentResultInfo>>> interfaceC67352kd);

    Object LJLJJL(InterfaceC67352kd<? super C64797Pbt<BaseResponse<BillHomeData>>> interfaceC67352kd);

    Object LJZI(String str, InterfaceC67352kd<? super C64797Pbt<BaseResponse<BillList>>> interfaceC67352kd);

    Object applyRepayment(ApplyRepaymentRequest applyRepaymentRequest, InterfaceC67352kd<? super C64797Pbt<BaseResponse<ApplyRepaymentResponse>>> interfaceC67352kd);
}
