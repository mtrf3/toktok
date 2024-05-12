package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SettingsParams_OptTypeAdapter extends TypeAdapter<SettingsParams> {
    public SettingsParams_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final SettingsParams read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        SettingsParams settingsParams = new SettingsParams(0, null, null, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1763267380) {
                    if (hashCode != -1341386445) {
                        if (hashCode == -892481550 && LJJ.equals("status")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                settingsParams.status = reader.LJIJI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("duration_opt_business_name")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            settingsParams.durationOptBusinessName = LJJIIZI;
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("feature_collect_business_name")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        String LJJIIZI2 = reader.LJJIIZI();
                        o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                        settingsParams.featureCollectBusinessName = LJJIIZI2;
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return settingsParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, SettingsParams settingsParams) {
        SettingsParams settingsParams2 = settingsParams;
        o.LJIIIZ(writer, "writer");
        if (settingsParams2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("status");
        C79062V1e.LJFF(settingsParams2.status, writer, "feature_collect_business_name");
        writer.LJJ(settingsParams2.featureCollectBusinessName);
        writer.LJI("duration_opt_business_name");
        writer.LJJ(settingsParams2.durationOptBusinessName);
        writer.LJFF();
    }
}
