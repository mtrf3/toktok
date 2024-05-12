package com.bytedance.android.livesdk.live.model;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveScrollConfig_OptTypeAdapter extends TypeAdapter<LiveScrollConfig> {
    public LiveScrollConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveScrollConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveScrollConfig liveScrollConfig = new LiveScrollConfig(0.0f, 0, 0.0f, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1697529363) {
                    if (hashCode != -85269079) {
                        if (hashCode == 412910787 && LJJ.equals("turn_page_value")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveScrollConfig.setTurnPageValue((float) reader.LJIJ());
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("min_distance_for_fling")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveScrollConfig.setMinDistanceForFling((float) reader.LJIJ());
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("min_fling_velocity")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveScrollConfig.setMinFlingVelocity(reader.LJIJI());
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveScrollConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveScrollConfig liveScrollConfig) {
        LiveScrollConfig liveScrollConfig2 = liveScrollConfig;
        o.LJIIIZ(writer, "writer");
        if (liveScrollConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("min_distance_for_fling");
        writer.LJIJJ(Float.valueOf(liveScrollConfig2.getMinDistanceForFling()));
        writer.LJI("min_fling_velocity");
        writer.LJIJJ(Integer.valueOf(liveScrollConfig2.getMinFlingVelocity()));
        writer.LJI("turn_page_value");
        writer.LJIJJ(Float.valueOf(liveScrollConfig2.getTurnPageValue()));
        writer.LJFF();
    }
}
