package com.ss.android.ugc.aweme.bnpl.biz.bill.home;

import X.C113554cx;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C91824a0q;
import X.C91924a2S;
import X.C92209a73;
import X.C92543aCR;
import X.C92545aCT;
import X.C93056aKi;
import X.EnumC91918a2M;
import X.EnumC91920a2O;
import X.OSZ;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillHomeData;
import com.ss.android.ugc.aweme.bnpl.utils.BillHomeArg;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BillHomeViewModel extends AssemViewModel<C92209a73> {
    public long LJLJI;
    public long LJLJJI;
    public int LJLJJLL;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C92545aCT.LJLIL);
    public boolean LJLILLLLZI = true;
    public final C55749LuL LJLJJL = new C55749LuL(C47704Ins.LJFF(this, BillHomeArg.class, "bill_detail_arg_key"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C92209a73 defaultState() {
        return new C92209a73(0);
    }

    public final void gv0(boolean z) {
        if (z || this.LJLILLLLZI) {
            setState(C92543aCR.LJLIL);
        }
        if (this.LJLILLLLZI) {
            this.LJLJJLL = 0;
        } else {
            this.LJLJJLL = 1;
        }
        this.LJLILLLLZI = false;
        XKX.LIZLLL(getAssemVMScope(), null, null, new C93056aKi(this, null), 3);
    }

    public final void iv0(BillHomeData billHomeData) {
        String str;
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("interface_return_cost", String.valueOf(System.currentTimeMillis() - this.LJLJJI)), new OSZ("timestamp", String.valueOf(this.LJLJI)), new OSZ("is_new", String.valueOf(o.LJ(billHomeData.userBillStatus, EnumC91918a2M.BILL_USER_NEW.getValue()) ? 1 : 0)), new OSZ("has_loan", String.valueOf(o.LJ(billHomeData.userBillStatus, EnumC91918a2M.BILL_USER_NORMAL_UNREPAID.getValue()) ? 1 : 0)), new OSZ("is_risky", String.valueOf(o.LJ(billHomeData.userStatus, EnumC91920a2O.USER_FREEZE.getValue()) ? 1 : 0)), new OSZ("is_overdue", String.valueOf(o.LJ(billHomeData.userStatus, EnumC91920a2O.USER_OVERDUE.getValue()) ? 1 : 0)), new OSZ("has_bubble", String.valueOf(0)), new OSZ("is_back", String.valueOf(this.LJLJJLL)));
        BillHomeArg billHomeArg = (BillHomeArg) this.LJLJJL.getValue();
        if (billHomeArg != null && o.LJ(billHomeArg.getReportLandingCostTime(), Boolean.TRUE)) {
            LJJLIIIIJ.put("landing_page_cost", String.valueOf(System.currentTimeMillis() - C91824a0q.LJIIIIZZ));
        }
        C91924a2S c91924a2S = C91924a2S.LIZ;
        BillHomeArg billHomeArg2 = (BillHomeArg) this.LJLJJL.getValue();
        if (billHomeArg2 != null) {
            str = billHomeArg2.getPreviousPageId();
        } else {
            str = null;
        }
        C91924a2S.LIZ(c91924a2S, "fp_sdk_bnpl_account_home_show", "bnpl_account_home", str, C113554cx.LJJLIIIJLLLLLLLZ(LJJLIIIIJ), 8);
    }

    public final void hv0(Boolean bool, String str) {
        String str2;
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("obj_id", str), new OSZ("click_use_time", String.valueOf(System.currentTimeMillis() - this.LJLJI)));
        if (bool != null) {
            bool.booleanValue();
            LJJLIIIIJ.put("is_repayable", String.valueOf(bool.booleanValue() ? 1 : 0));
        }
        C91924a2S c91924a2S = C91924a2S.LIZ;
        BillHomeArg billHomeArg = (BillHomeArg) this.LJLJJL.getValue();
        if (billHomeArg != null) {
            str2 = billHomeArg.getPreviousPageId();
        } else {
            str2 = null;
        }
        C91924a2S.LIZ(c91924a2S, "fp_sdk_bnpl_account_home_click", "bnpl_account_home", str2, C113554cx.LJJLIIIJLLLLLLLZ(LJJLIIIIJ), 8);
    }
}
