package com.bytedance.effectcreatormobile.behaviour.viewmodel;

import X.AbstractC94370afu;
import X.AbstractC94372afw;
import X.C113554cx;
import X.C93459aRD;
import X.C93624aTs;
import X.C93670aUc;
import X.C93853aXZ;
import X.C93991aZn;
import X.C94666akg;
import X.EnumC93441aQv;
import X.OSZ;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class EditViewModel extends StateViewModel {
    public final C93624aTs<AbstractC94370afu> LJLILLLLZI = new C93624aTs<>();
    public final C93624aTs<EnumC93441aQv> LJLJI = new C93624aTs<>();
    public final C93624aTs<Integer> LJLJJI = new C93624aTs<>();
    public final C93624aTs<Boolean> LJLJJL = new C93624aTs<>();

    public final void jv0() {
        EnumC93441aQv enumC93441aQv;
        Integer num;
        if (this.LJLJI.LIZ.getValue() == null) {
            lv0(-1, EnumC93441aQv.VIEW_TYPE_TRIGGER, true);
        } else {
            C93459aRD LIZ = new C93459aRD(this, this.LJLJI.LIZ.getValue(), this.LJLJJI.LIZ.getValue(), true).LIZ();
            if ((LIZ.LIZ == this.LJLJI.LIZ.getValue() && o.LJ(LIZ.LIZIZ, this.LJLJJI.LIZ.getValue())) || (enumC93441aQv = LIZ.LIZ) == null || (num = LIZ.LIZIZ) == null) {
                StateViewModel.hv0(this.LJLJJL, Boolean.TRUE);
                StateViewModel.hv0(this.LJLJI, EnumC93441aQv.VIEW_TYPE_MORE);
                return;
            }
            lv0(num.intValue(), enumC93441aQv, true);
        }
        kv0();
    }

    public final void kv0() {
        AbstractC94370afu value = this.LJLILLLLZI.LIZ.getValue();
        if (value != null) {
            StateViewModel.hv0(this.LJLILLLLZI, value);
        }
    }

    public final boolean iv0(int i) {
        List<AbstractC94370afu> commandList = C93991aZn.LIZ().getCommandList();
        if (i < 0 || i >= commandList.size()) {
            return false;
        }
        StateViewModel.hv0(this.LJLILLLLZI, ListProtector.get(commandList, i));
        return true;
    }

    public final void lv0(int i, EnumC93441aQv type, boolean z) {
        C94666akg LJII;
        List<AbstractC94372afw> LJI;
        StatisticReporter LIZ;
        List<AbstractC94372afw> LJI2;
        o.LJIIIZ(type, "type");
        Integer value = this.LJLJJI.LIZ.getValue();
        if (value == null || i != value.intValue() || type != this.LJLJI.LIZ.getValue()) {
            int i2 = C93853aXZ.LIZ[type.ordinal()];
            String str = "";
            String str2 = "auto";
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    if (i2 == 5 && (LIZ = C93670aUc.LIZ()) != null) {
                        OSZ[] oszArr = new OSZ[2];
                        if (!z) {
                            str2 = "space_click";
                        }
                        oszArr[0] = new OSZ("page_enter_from", str2);
                        AbstractC94370afu value2 = this.LJLILLLLZI.LIZ.getValue();
                        if (value2 != null && (LJI2 = value2.LJI()) != null && i >= 0 && i < LJI2.size()) {
                            str = ((AbstractC94372afw) ListProtector.get(LJI2, i)).LJ().isEmpty() ? "no_object" : "had_object";
                        }
                        oszArr[1] = new OSZ("status", str);
                        LIZ.onEvent("interaction_object_edit", C113554cx.LJJL(oszArr));
                    }
                } else {
                    StatisticReporter LIZ2 = C93670aUc.LIZ();
                    if (LIZ2 != null) {
                        OSZ[] oszArr2 = new OSZ[2];
                        if (!z) {
                            str2 = "space_click";
                        }
                        oszArr2[0] = new OSZ("page_enter_from", str2);
                        AbstractC94370afu value3 = this.LJLILLLLZI.LIZ.getValue();
                        if (value3 != null && (LJI = value3.LJI()) != null && i >= 0 && i < LJI.size()) {
                            str = ((AbstractC94372afw) ListProtector.get(LJI, i)).LIZLLL().LJII() ? "no_action" : "had_action";
                        }
                        oszArr2[1] = new OSZ("status", str);
                        LIZ2.onEvent("interaction_action_edit", C113554cx.LJJL(oszArr2));
                    }
                }
            } else {
                StatisticReporter LIZ3 = C93670aUc.LIZ();
                if (LIZ3 != null) {
                    OSZ[] oszArr3 = new OSZ[2];
                    if (!z) {
                        str2 = "space_click";
                    }
                    oszArr3[0] = new OSZ("page_enter_from", str2);
                    AbstractC94370afu value4 = this.LJLILLLLZI.LIZ.getValue();
                    if (value4 != null && (LJII = value4.LJII()) != null) {
                        str = LJII.LIZLLL().length() == 0 ? "no_trigger" : "had_trigger";
                    }
                    oszArr3[1] = new OSZ("status", str);
                    LIZ3.onEvent("interaction_trigger_edit", C113554cx.LJJL(oszArr3));
                }
            }
        }
        StateViewModel.hv0(this.LJLJJI, Integer.valueOf(i));
        StateViewModel.hv0(this.LJLJI, type);
    }
}
