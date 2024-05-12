package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AdmNsConfig_OptTypeAdapter extends TypeAdapter<AdmNsConfig> {
    public final Gson LIZ;

    public AdmNsConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AdmNsConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        AdmNsConfig admNsConfig = new AdmNsConfig(0, false, null, false, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1165276806:
                        if (!LJJ.equals("enable_sami_enginecommon_debug")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            admNsConfig.enableDebug = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -537394595:
                        if (!LJJ.equals("live_adm_ns_url")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            admNsConfig.nsUrl = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 469043488:
                        if (!LJJ.equals("enable_ns_on_headset")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            admNsConfig.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 520613900:
                        if (!LJJ.equals("live_adm_ns_type")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            admNsConfig.nsType = reader.LJIJI();
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
        return admNsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, AdmNsConfig admNsConfig) {
        AdmNsConfig admNsConfig2 = admNsConfig;
        o.LJIIIZ(writer, "writer");
        if (admNsConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_adm_ns_type");
        C79062V1e.LJFF(admNsConfig2.nsType, writer, "enable_ns_on_headset");
        writer.LJJIII(admNsConfig2.enable);
        writer.LJI("live_adm_ns_url");
        writer.LJJ(admNsConfig2.nsUrl);
        writer.LJI("enable_sami_enginecommon_debug");
        writer.LJJIII(admNsConfig2.enableDebug);
        writer.LJFF();
    }
}
