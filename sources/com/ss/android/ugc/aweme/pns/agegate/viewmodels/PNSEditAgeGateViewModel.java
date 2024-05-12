package com.ss.android.ugc.aweme.pns.agegate.viewmodels;

import X.AbstractC40941G4z;
import X.AbstractC86076XqK;
import X.C47261Igj;
import X.C48360IyS;
import X.C63062Op0;
import X.C63144OqK;
import X.C86079XqN;
import X.C86092Xqa;
import X.EnumC86061Xq5;
import X.EnumC86062Xq6;
import X.InterfaceC86091XqZ;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.pns.agegate.network.DoBResponse;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PNSEditAgeGateViewModel extends PNSBaseAgeGateViewModel {
    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final void mv0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("input_time", String.valueOf(System.currentTimeMillis() - this.LJZL));
        C48360IyS.LIZ("click_age_edit_confirm", linkedHashMap, this.LJLJJI);
        gv0();
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final PNSFeedbackModel nv0(DoBResponse doBResponse) {
        PNSFeedbackModel LJI;
        int i;
        int i2;
        if (doBResponse.getAgeGateFeedback() != null) {
            LJI = doBResponse.getAgeGateFeedback();
        } else {
            if (doBResponse.getAge() != null) {
                C48360IyS.LIZ("show_age_edit_confirm_popup", new LinkedHashMap(), this.LJLJJI);
                InterfaceC86091XqZ interfaceC86091XqZ = this.LJLJI;
                if (interfaceC86091XqZ != null) {
                    C86079XqN c86079XqN = (C86079XqN) interfaceC86091XqZ;
                    String value = this.LJLLLLLL.getValue();
                    Integer age = doBResponse.getAge();
                    o.LJI(age);
                    int intValue = age.intValue();
                    String string = c86079XqN.LIZIZ.getString(R.string.bjf, value);
                    Locale locale = Locale.ROOT;
                    Resources resources = c86079XqN.LIZIZ.getResources();
                    C63062Op0 c63062Op0 = c86079XqN.LIZ;
                    if (c63062Op0 == null || c63062Op0.getDescType() != 1) {
                        i = R.plurals.b9;
                    } else {
                        i = R.plurals.uf;
                    }
                    String quantityString = resources.getQuantityString(i, intValue);
                    o.LJIIIIZZ(quantityString, "context.resources.getQua…        age\n            )");
                    StringBuilder sb = new StringBuilder(C63144OqK.LIZIZ(new Object[]{Integer.valueOf(intValue)}, 1, locale, quantityString, "java.lang.String.format(locale, format, *args)"));
                    sb.append("\n\n");
                    Resources resources2 = c86079XqN.LIZIZ.getResources();
                    C63062Op0 c63062Op02 = c86079XqN.LIZ;
                    if (c63062Op02 == null || c63062Op02.getDescType() != 1) {
                        i2 = R.string.bje;
                    } else {
                        i2 = R.string.thw;
                    }
                    sb.append(resources2.getString(i2));
                    String sb2 = sb.toString();
                    o.LJIIIIZZ(sb2, "msg.toString()");
                    String string2 = c86079XqN.LIZIZ.getString(R.string.dsg);
                    o.LJIIIIZZ(string2, "context.getString(R.string.confirm)");
                    String string3 = c86079XqN.LIZIZ.getString(R.string.fgu);
                    o.LJIIIIZZ(string3, "context.getString(R.string.edit)");
                    return new PNSFeedbackModel(null, new PNSDialogModel(sb2, string, C47261Igj.LJJIJIIJI(new PNSAgeConfirmOption(string2, null, EnumC86061Xq5.CONTINUE.getType(), 2, null), new PNSAgeConfirmOption(string3, null, EnumC86061Xq5.DISMISS.getType(), 2, null)), Integer.valueOf(EnumC86062Xq6.ACTION.getValue()), 0, true, false, false, C47261Igj.LJJIJ(new PNSHyperlink(String.valueOf(intValue), "")), 16, null), null, 5, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.pns.agegate.handlers.PNSEditBirthdayDefaultUIHandler");
            }
            InterfaceC86091XqZ interfaceC86091XqZ2 = this.LJLJI;
            if (interfaceC86091XqZ2 != null) {
                LJI = ((AbstractC86076XqK) interfaceC86091XqZ2).LJI();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.pns.agegate.handlers.PNSEditBirthdayDefaultUIHandler");
            }
        }
        if (LJI == null) {
            return new PNSFeedbackModel(null, null, null, 7, null);
        }
        return LJI;
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final void kv0(AbstractC40941G4z abstractC40941G4z, InterfaceC86091XqZ interfaceC86091XqZ, long j, C86092Xqa params) {
        o.LJIIIZ(params, "params");
        super.kv0(abstractC40941G4z, interfaceC86091XqZ, j, params);
        this.LLD = 2;
        this.LLF = 2;
        C48360IyS.LIZ("show_age_edit_page", new LinkedHashMap(), this.LJLJJI);
        this.LLFF = "age_edit_response";
        this.LLFFF = false;
    }
}
