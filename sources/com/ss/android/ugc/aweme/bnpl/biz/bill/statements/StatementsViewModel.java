package com.ss.android.ugc.aweme.bnpl.biz.bill.statements;

import X.A2F;
import X.A2G;
import X.C113554cx;
import X.C221108m2;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C8HZ;
import X.C91834a10;
import X.C91924a2S;
import X.C91933a2b;
import X.C92260a7s;
import X.C92364a9Y;
import X.C92372a9g;
import X.C92575aCx;
import X.C93131aLv;
import X.EnumC92259a7r;
import X.InterfaceC67352kd;
import X.OSZ;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillList;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StatementsViewModel extends AssemListViewModel<C93131aLv, C92372a9g, Integer> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, C92260a7s.class, "statements_category"), true);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 51));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C92575aCx.LJLIL);
    public boolean LJLJJI = true;
    public long LJLJJL;
    public long LJLJJLL;
    public Map<String, String> LJLJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C93131aLv(0);
    }

    public final EnumC92259a7r hv0() {
        return (EnumC92259a7r) this.LJLILLLLZI.getValue();
    }

    public final C92372a9g gv0(BillInfo billInfo) {
        return new C92372a9g(billInfo.billId, C91933a2b.LIZ(billInfo.billMonthTime), C91933a2b.LIZIZ(Long.valueOf(billInfo.dueDate)), billInfo.overdue, billInfo.billAmount, ((C92260a7s) this.LJLIL.getValue()).LJLILLLLZI);
    }

    public final void iv0(BillList billList) {
        String str;
        List<BillInfo> list;
        int i;
        int i2;
        List<BillInfo> list2;
        List<BillInfo> list3;
        List<BillInfo> list4;
        C91834a10.LIZIZ = System.currentTimeMillis();
        long j = this.LJLJJLL - this.LJLJJL;
        if (hv0() == EnumC92259a7r.PAID) {
            str = "paid";
        } else {
            str = "unpaid";
        }
        EnumC92259a7r hv0 = hv0();
        EnumC92259a7r enumC92259a7r = EnumC92259a7r.UNPAID;
        int i3 = 0;
        if (hv0 != enumC92259a7r ? (list = billList.paidBillList) == null || list.isEmpty() : ((list3 = billList.currentBillList) == null || list3.isEmpty()) && ((list4 = billList.upcomingBillList) == null || list4.isEmpty())) {
            i = 1;
        } else {
            i = 0;
        }
        if (hv0() == enumC92259a7r && (list2 = billList.currentBillList) != null) {
            Iterator<BillInfo> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BillInfo next = it.next();
                if (next.overdue) {
                    if (next != null) {
                        i2 = 1;
                    }
                }
            }
        }
        i2 = 0;
        Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("interface_return_cost", String.valueOf(j)), new OSZ("timestamp", String.valueOf(C91834a10.LIZIZ)), new OSZ("sub_page_class", str), new OSZ("is_empty", String.valueOf(i)), new OSZ("is_overdue", String.valueOf(i2)));
        this.LJLJL = LJJLIIIIJ;
        if (hv0() == EnumC92259a7r.UNPAID) {
            if (billList.currentBillList != null && (!r0.isEmpty())) {
                i3 = 1;
            }
            LJJLIIIIJ.put("has_loan", String.valueOf(i3));
        } else {
            LJJLIIIIJ.put("has_loan", CardStruct.IStatusCode.DEFAULT);
        }
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_all_statements_show", "bnpl_all_statements", ((C92260a7s) this.LJLIL.getValue()).LJLILLLLZI, C113554cx.LJJLIIIJLLLLLLLZ(LJJLIIIIJ), 8);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C92372a9g> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new IDqS418S0100000_31(newListState, (C8HZ<C92364a9Y>) 22));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c2 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:11:0x0066, B:12:0x0069, B:14:0x0077, B:16:0x0081, B:19:0x0098, B:21:0x009c, B:27:0x00ac, B:28:0x00bb, B:30:0x00c1, B:32:0x00cf, B:33:0x00dc, B:35:0x00e0, B:40:0x00ee, B:42:0x00f2, B:47:0x0100, B:49:0x0108, B:51:0x010c, B:55:0x0118, B:56:0x0127, B:58:0x012d, B:60:0x01a2, B:61:0x01af, B:67:0x013b, B:69:0x013f, B:73:0x014b, B:74:0x0152, B:76:0x0158, B:79:0x017e, B:81:0x0184, B:83:0x018f, B:85:0x0169, B:88:0x01bc, B:90:0x01c2, B:91:0x01c8, B:97:0x0033, B:100:0x0055), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r14) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bnpl.biz.bill.statements.StatementsViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        num.intValue();
        return A2F.LIZIZ(A2G.LIZ);
    }
}
