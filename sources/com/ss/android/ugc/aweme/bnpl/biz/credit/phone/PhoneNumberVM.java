package com.ss.android.ugc.aweme.bnpl.biz.credit.phone;

import X.C113554cx;
import X.C36636EZk;
import X.C47704Ins;
import X.C55749LuL;
import X.C76800UCe;
import X.C91924a2S;
import X.C92273a85;
import X.C92274a86;
import X.C93057aKj;
import X.EnumC58928NAu;
import X.EnumC92023a43;
import X.EnumC92024a44;
import X.InterfaceC67352kd;
import X.OSZ;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.bnpl.network.model.PhoneRule;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PhoneNumberVM extends AssemViewModel<C92273a85> {
    public String LJLILLLLZI;
    public String LJLJI;
    public long LJLJJL;
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, C92274a86.class, "phone_number_data"), true);
    public ArrayList<PhoneRule> LJLJJI = new ArrayList<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C92273a85 defaultState() {
        return new C92273a85(EnumC92023a43.EDIT, false, EnumC92024a44.NOT_START, null, null);
    }

    public final void onEventClick(String objId) {
        o.LJIIIZ(objId, "objId");
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_phone_number_click", "bnpl_activate_phone_number", ((C92274a86) this.LJLIL.getValue()).LJLJI, C113554cx.LJJL(new OSZ("obj_id", objId), new OSZ("click_use_time", String.valueOf(System.currentTimeMillis() - this.LJLJJL))), 8);
    }

    public final Object gv0(String str, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C36636EZk.LIZ, new C93057aKj(this, str, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }
}
