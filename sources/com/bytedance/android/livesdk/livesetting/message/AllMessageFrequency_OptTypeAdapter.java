package com.bytedance.android.livesdk.livesetting.message;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AllMessageFrequency_OptTypeAdapter extends TypeAdapter<AllMessageFrequency> {
    public final Gson LIZ;

    public AllMessageFrequency_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AllMessageFrequency read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        AllMessageFrequency allMessageFrequency = new AllMessageFrequency(false, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2037446092:
                        if (!LJJ.equals("ignore_filter_p2p")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            allMessageFrequency.setIgnoreFilterP2P(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1923800971:
                        if (!LJJ.equals("frequency_time_ms")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            allMessageFrequency.setFrequencyTimeMs(reader.LJIJJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            allMessageFrequency.setEnable(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -656620436:
                        if (!LJJ.equals("frequency_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            allMessageFrequency.setFrequencyCount(reader.LJIJJ());
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
        return allMessageFrequency;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, AllMessageFrequency allMessageFrequency) {
        AllMessageFrequency allMessageFrequency2 = allMessageFrequency;
        o.LJIIIZ(writer, "writer");
        if (allMessageFrequency2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(allMessageFrequency2.getEnable());
        writer.LJI("ignore_filter_p2p");
        writer.LJJIII(allMessageFrequency2.getIgnoreFilterP2P());
        writer.LJI("frequency_time_ms");
        writer.LJIJ(allMessageFrequency2.getFrequencyTimeMs());
        writer.LJI("frequency_count");
        writer.LJIJ(allMessageFrequency2.getFrequencyCount());
        writer.LJFF();
    }
}
