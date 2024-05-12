package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubsPayoutOnboardingUrlConfig_OptTypeAdapter extends TypeAdapter<SubsPayoutOnboardingUrlConfig> {
    public SubsPayoutOnboardingUrlConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final SubsPayoutOnboardingUrlConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        SubsPayoutOnboardingUrlConfig subsPayoutOnboardingUrlConfig = new SubsPayoutOnboardingUrlConfig(null, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "payout_onboarding_popup")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    subsPayoutOnboardingUrlConfig.payoutOnboardingPopup = LJJIIZI;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return subsPayoutOnboardingUrlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, SubsPayoutOnboardingUrlConfig subsPayoutOnboardingUrlConfig) {
        SubsPayoutOnboardingUrlConfig subsPayoutOnboardingUrlConfig2 = subsPayoutOnboardingUrlConfig;
        o.LJIIIZ(writer, "writer");
        if (subsPayoutOnboardingUrlConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("payout_onboarding_popup");
        writer.LJJ(subsPayoutOnboardingUrlConfig2.payoutOnboardingPopup);
        writer.LJFF();
    }
}
