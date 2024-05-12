package com.bytedance.android.livesdk.livesetting.message;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessageFrequencyConfig_OptTypeAdapter extends TypeAdapter<LiveMessageFrequencyConfig> {
    public final Gson LIZ;

    public LiveMessageFrequencyConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessageFrequencyConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMessageFrequencyConfig liveMessageFrequencyConfig = new LiveMessageFrequencyConfig(false, null, null, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != 952107014) {
                    if (hashCode != 1175330246) {
                        if (hashCode == 1396623652 && LJJ.equals("frequency_method")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                HashMap LIZIZ = C65412Plo.LIZIZ(this.LIZ, reader, LiveMessageFrequency.class);
                                o.LJI(LIZIZ);
                                liveMessageFrequencyConfig.setFrequencyMethod(LIZIZ);
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("frequency_enable")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageFrequencyConfig.setFrequencyEnable(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("all_message_frequency")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveMessageFrequencyConfig.setAllMessageFrequency((AllMessageFrequency) C64.LIZ(this.LIZ, AllMessageFrequency.class, reader, "gson.getAdapter(AllMessa…:class.java).read(reader)"));
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveMessageFrequencyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMessageFrequencyConfig liveMessageFrequencyConfig) {
        LiveMessageFrequencyConfig liveMessageFrequencyConfig2 = liveMessageFrequencyConfig;
        o.LJIIIZ(writer, "writer");
        if (liveMessageFrequencyConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("frequency_enable");
        writer.LJJIII(liveMessageFrequencyConfig2.getFrequencyEnable());
        writer.LJI("all_message_frequency");
        this.LIZ.LJIIJ(AllMessageFrequency.class).write(writer, liveMessageFrequencyConfig2.getAllMessageFrequency());
        writer.LJI("frequency_method");
        C65412Plo.LJ(this.LIZ, writer, liveMessageFrequencyConfig2.getFrequencyMethod(), LiveMessageFrequency.class);
        writer.LJFF();
    }
}
