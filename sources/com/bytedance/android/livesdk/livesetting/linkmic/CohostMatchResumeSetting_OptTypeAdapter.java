package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CohostMatchResumeSetting_OptTypeAdapter extends TypeAdapter<CohostMatchResumeSetting> {
    public CohostMatchResumeSetting_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final CohostMatchResumeSetting read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        CohostMatchResumeSetting cohostMatchResumeSetting = new CohostMatchResumeSetting(0, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable_cohost_match_resume")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    cohostMatchResumeSetting.enableMatchResume = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "max_app_exit_duration")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    cohostMatchResumeSetting.maxAppExitDuration = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return cohostMatchResumeSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, CohostMatchResumeSetting cohostMatchResumeSetting) {
        CohostMatchResumeSetting cohostMatchResumeSetting2 = cohostMatchResumeSetting;
        o.LJIIIZ(writer, "writer");
        if (cohostMatchResumeSetting2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_cohost_match_resume");
        C79062V1e.LJFF(cohostMatchResumeSetting2.enableMatchResume, writer, "max_app_exit_duration");
        C77339UWx.LJFF(cohostMatchResumeSetting2.maxAppExitDuration, writer);
    }
}
