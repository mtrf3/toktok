package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveUserRiskVerify_OptTypeAdapter extends TypeAdapter<LiveUserRiskVerify> {
    public LiveUserRiskVerify_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveUserRiskVerify read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveUserRiskVerify liveUserRiskVerify = new LiveUserRiskVerify(null, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "email_verify_url")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    liveUserRiskVerify.emailVerifyUrl = LJJIIZI;
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "phone_verify_url")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI2 = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                    liveUserRiskVerify.phoneVerifyUrl = LJJIIZI2;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveUserRiskVerify;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveUserRiskVerify liveUserRiskVerify) {
        LiveUserRiskVerify liveUserRiskVerify2 = liveUserRiskVerify;
        o.LJIIIZ(writer, "writer");
        if (liveUserRiskVerify2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("email_verify_url");
        writer.LJJ(liveUserRiskVerify2.emailVerifyUrl);
        writer.LJI("phone_verify_url");
        writer.LJJ(liveUserRiskVerify2.phoneVerifyUrl);
        writer.LJFF();
    }
}
