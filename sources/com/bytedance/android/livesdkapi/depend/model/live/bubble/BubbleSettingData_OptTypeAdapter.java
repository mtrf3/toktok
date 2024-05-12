package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class BubbleSettingData_OptTypeAdapter extends TypeAdapter<BubbleSettingData> {
    public BubbleSettingData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final BubbleSettingData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        BubbleSettingData bubbleSettingData = new BubbleSettingData(0L, 0L, 0L, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1984346169) {
                    if (hashCode != -1440865301) {
                        if (hashCode == -1218135838 && LJJ.equals("cache_interval")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                bubbleSettingData.setCacheInterval(reader.LJIJJ());
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("stay_interval")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            bubbleSettingData.setStayInterval(reader.LJIJJ());
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("show_interval")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        bubbleSettingData.setShowInterval(reader.LJIJJ());
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return bubbleSettingData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, BubbleSettingData bubbleSettingData) {
        BubbleSettingData bubbleSettingData2 = bubbleSettingData;
        o.LJIIIZ(writer, "writer");
        if (bubbleSettingData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("show_interval");
        writer.LJIJ(bubbleSettingData2.getShowInterval());
        writer.LJI("stay_interval");
        writer.LJIJ(bubbleSettingData2.getStayInterval());
        writer.LJI("cache_interval");
        writer.LJIJ(bubbleSettingData2.getCacheInterval());
        writer.LJFF();
    }
}
