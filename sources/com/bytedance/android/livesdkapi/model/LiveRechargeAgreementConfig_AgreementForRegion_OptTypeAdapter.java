package com.bytedance.android.livesdkapi.model;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveRechargeAgreementConfig_AgreementForRegion_OptTypeAdapter extends TypeAdapter<LiveRechargeAgreementConfig.AgreementForRegion> {
    public LiveRechargeAgreementConfig_AgreementForRegion_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRechargeAgreementConfig.AgreementForRegion read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveRechargeAgreementConfig.AgreementForRegion agreementForRegion = new LiveRechargeAgreementConfig.AgreementForRegion();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "title")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    agreementForRegion.lawName = reader.LJJIIZI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "url")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    agreementForRegion.lawUrl = reader.LJJIIZI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return agreementForRegion;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveRechargeAgreementConfig.AgreementForRegion agreementForRegion) {
        LiveRechargeAgreementConfig.AgreementForRegion agreementForRegion2 = agreementForRegion;
        o.LJIIIZ(writer, "writer");
        if (agreementForRegion2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("title");
        writer.LJJ(agreementForRegion2.lawName);
        writer.LJI("url");
        writer.LJJ(agreementForRegion2.lawUrl);
        writer.LJFF();
    }
}
