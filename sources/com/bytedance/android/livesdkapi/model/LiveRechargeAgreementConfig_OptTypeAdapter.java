package com.bytedance.android.livesdkapi.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveRechargeAgreementConfig_OptTypeAdapter extends TypeAdapter<LiveRechargeAgreementConfig> {
    public final Gson LIZ;

    public LiveRechargeAgreementConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRechargeAgreementConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveRechargeAgreementConfig liveRechargeAgreementConfig = new LiveRechargeAgreementConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1249414251:
                        if (!LJJ.equals("live_room_recharge_agreement_for_global")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRechargeAgreementConfig.agreementForGlobal = reader.LJJIIZI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -941189402:
                        if (!LJJ.equals("live_room_recharge_agreement_for_region")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, LiveRechargeAgreementConfig.AgreementForRegion.class);
                            o.LJI(LIZ);
                            liveRechargeAgreementConfig.agreementsForRegion = LIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -845299003:
                        if (!LJJ.equals("is_show_recharge_rule_in_global")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRechargeAgreementConfig.isShowRechargeLawInGlobal = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -537074154:
                        if (!LJJ.equals("is_show_recharge_rule_in_region")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveRechargeAgreementConfig.isShowRechargeLawInRegion = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveRechargeAgreementConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveRechargeAgreementConfig liveRechargeAgreementConfig) {
        LiveRechargeAgreementConfig liveRechargeAgreementConfig2 = liveRechargeAgreementConfig;
        o.LJIIIZ(writer, "writer");
        if (liveRechargeAgreementConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("is_show_recharge_rule_in_global");
        writer.LJJIII(liveRechargeAgreementConfig2.isShowRechargeLawInGlobal);
        writer.LJI("live_room_recharge_agreement_for_global");
        writer.LJJ(liveRechargeAgreementConfig2.agreementForGlobal);
        writer.LJI("is_show_recharge_rule_in_region");
        writer.LJJIII(liveRechargeAgreementConfig2.isShowRechargeLawInRegion);
        writer.LJI("live_room_recharge_agreement_for_region");
        C65412Plo.LIZLLL(this.LIZ, writer, liveRechargeAgreementConfig2.agreementsForRegion, LiveRechargeAgreementConfig.AgreementForRegion.class);
        writer.LJFF();
    }
}
