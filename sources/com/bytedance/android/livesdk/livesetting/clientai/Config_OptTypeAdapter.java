package com.bytedance.android.livesdk.livesetting.clientai;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class Config_OptTypeAdapter extends TypeAdapter<Config> {
    public final Gson LIZ;

    public Config_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final Config read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        Config config = new Config(0, null, 0, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1343047742) {
                    if (hashCode != -1298848381) {
                        if (hashCode == -489773823 && LJJ.equals("im_msg_enable_list")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                                o.LJI(LIZ);
                                config.imMsgEnableList = LIZ;
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("enable")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            config.enable = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("delay_download_pkgs")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        config.delayDownloadPkgs = reader.LJIJI();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, Config config) {
        Config config2 = config;
        o.LJIIIZ(writer, "writer");
        if (config2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        C79062V1e.LJFF(config2.enable, writer, "im_msg_enable_list");
        C65412Plo.LIZLLL(this.LIZ, writer, config2.imMsgEnableList, String.class);
        writer.LJI("delay_download_pkgs");
        C77339UWx.LJFF(config2.delayDownloadPkgs, writer);
    }
}
