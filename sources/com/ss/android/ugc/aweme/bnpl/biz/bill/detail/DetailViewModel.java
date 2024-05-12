package com.ss.android.ugc.aweme.bnpl.biz.bill.detail;

import X.A2G;
import X.C113554cx;
import X.C221108m2;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C8HZ;
import X.C91924a2S;
import X.C92213a77;
import X.C92364a9Y;
import X.C92526aCA;
import X.C93077aL3;
import X.EnumC91907a2B;
import X.EnumC91909a2D;
import X.InterfaceC67352kd;
import X.OSZ;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillDetailData;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.LoanOrderInfo;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class DetailViewModel extends AssemListViewModel<C93077aL3, C92364a9Y, String> {
    public long LJLJJL;
    public long LJLJJLL;
    public Map<String, String> LJLJL;
    public String LJLJLJ;
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, C92213a77.class, "bill_detail_arg_key"), true);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C92526aCA.LJLIL);
    public final Set<String> LJLJI = new LinkedHashSet();
    public boolean LJLJJI = true;
    public String LJLJLLL = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C93077aL3(0);
    }

    public final void gv0(BillDetailData billDetailData) {
        int i;
        String str;
        System.currentTimeMillis();
        long j = this.LJLJJLL - this.LJLJJL;
        List<LoanOrderInfo> list = billDetailData.loanOrderInfoList;
        if (list == null || list.isEmpty()) {
            i = 1;
        } else {
            i = 0;
        }
        boolean LJ = o.LJ(billDetailData.billRepaymentStatus, EnumC91909a2D.OVERDUE.getValue());
        String str2 = billDetailData.billRepaymentStatus;
        if (o.LJ(str2, EnumC91909a2D.REPAID.getValue())) {
            str = "paid";
        } else if (o.LJ(str2, EnumC91909a2D.UNREPAID.getValue())) {
            str = "unpaid";
        } else if (o.LJ(str2, EnumC91909a2D.NO_NEED_TO_PAY.getValue())) {
            str = "no need";
        } else {
            str = "";
        }
        Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("interface_return_cost", String.valueOf(j)), new OSZ("order_type", "all bills"), new OSZ("is_billed", String.valueOf(o.LJ(billDetailData.billStatus, EnumC91907a2B.BILLED.getValue()) ? 1 : 0)), new OSZ("repayment_status", str), new OSZ("is_empty", String.valueOf(i)), new OSZ("is_overdue", String.valueOf(LJ ? 1 : 0)));
        this.LJLJL = LJJLIIIIJ;
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_statement_details_show", "bnpl_statement_details", ((C92213a77) this.LJLIL.getValue()).LJLJI, C113554cx.LJJLIIIJLLLLLLLZ(LJJLIIIIJ), 8);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C92364a9Y> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new IDqS418S0100000_31(newListState, (C8HZ<C92364a9Y>) 10));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<String>> interfaceC67352kd) {
        return onLoadMore("", interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[Catch: Exception -> 0x024f, TryCatch #0 {Exception -> 0x024f, blocks: (B:11:0x006f, B:12:0x0072, B:14:0x007d, B:15:0x0083, B:17:0x0089, B:19:0x0093, B:21:0x00d2, B:22:0x00db, B:24:0x00e1, B:27:0x0104, B:32:0x0108, B:33:0x010c, B:35:0x0112, B:38:0x0136, B:41:0x013b, B:44:0x0146, B:47:0x014b, B:51:0x015a, B:54:0x0173, B:57:0x018f, B:61:0x019b, B:63:0x01b1, B:67:0x01bd, B:69:0x01c9, B:70:0x01cc, B:72:0x01e6, B:74:0x01ea, B:76:0x01fd, B:79:0x01f0, B:65:0x01fa, B:82:0x0208, B:83:0x020d, B:59:0x01ac, B:85:0x020e, B:86:0x0213, B:87:0x0214, B:89:0x021b, B:90:0x0221, B:92:0x0227, B:94:0x023b, B:102:0x0052), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021b A[Catch: Exception -> 0x024f, TryCatch #0 {Exception -> 0x024f, blocks: (B:11:0x006f, B:12:0x0072, B:14:0x007d, B:15:0x0083, B:17:0x0089, B:19:0x0093, B:21:0x00d2, B:22:0x00db, B:24:0x00e1, B:27:0x0104, B:32:0x0108, B:33:0x010c, B:35:0x0112, B:38:0x0136, B:41:0x013b, B:44:0x0146, B:47:0x014b, B:51:0x015a, B:54:0x0173, B:57:0x018f, B:61:0x019b, B:63:0x01b1, B:67:0x01bd, B:69:0x01c9, B:70:0x01cc, B:72:0x01e6, B:74:0x01ea, B:76:0x01fd, B:79:0x01f0, B:65:0x01fa, B:82:0x0208, B:83:0x020d, B:59:0x01ac, B:85:0x020e, B:86:0x0213, B:87:0x0214, B:89:0x021b, B:90:0x0221, B:92:0x0227, B:94:0x023b, B:102:0x0052), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227 A[Catch: Exception -> 0x024f, TryCatch #0 {Exception -> 0x024f, blocks: (B:11:0x006f, B:12:0x0072, B:14:0x007d, B:15:0x0083, B:17:0x0089, B:19:0x0093, B:21:0x00d2, B:22:0x00db, B:24:0x00e1, B:27:0x0104, B:32:0x0108, B:33:0x010c, B:35:0x0112, B:38:0x0136, B:41:0x013b, B:44:0x0146, B:47:0x014b, B:51:0x015a, B:54:0x0173, B:57:0x018f, B:61:0x019b, B:63:0x01b1, B:67:0x01bd, B:69:0x01c9, B:70:0x01cc, B:72:0x01e6, B:74:0x01ea, B:76:0x01fd, B:79:0x01f0, B:65:0x01fa, B:82:0x0208, B:83:0x020d, B:59:0x01ac, B:85:0x020e, B:86:0x0213, B:87:0x0214, B:89:0x021b, B:90:0x0221, B:92:0x0227, B:94:0x023b, B:102:0x0052), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023b A[Catch: Exception -> 0x024f, TryCatch #0 {Exception -> 0x024f, blocks: (B:11:0x006f, B:12:0x0072, B:14:0x007d, B:15:0x0083, B:17:0x0089, B:19:0x0093, B:21:0x00d2, B:22:0x00db, B:24:0x00e1, B:27:0x0104, B:32:0x0108, B:33:0x010c, B:35:0x0112, B:38:0x0136, B:41:0x013b, B:44:0x0146, B:47:0x014b, B:51:0x015a, B:54:0x0173, B:57:0x018f, B:61:0x019b, B:63:0x01b1, B:67:0x01bd, B:69:0x01c9, B:70:0x01cc, B:72:0x01e6, B:74:0x01ea, B:76:0x01fd, B:79:0x01f0, B:65:0x01fa, B:82:0x0208, B:83:0x020d, B:59:0x01ac, B:85:0x020e, B:86:0x0213, B:87:0x0214, B:89:0x021b, B:90:0x0221, B:92:0x0227, B:94:0x023b, B:102:0x0052), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: hv0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r30, X.InterfaceC67352kd<? super X.A2G<java.lang.String>> r31) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bnpl.biz.bill.detail.DetailViewModel.onLoadMore(java.lang.String, X.2kd):java.lang.Object");
    }
}
