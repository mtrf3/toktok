package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveSheetDemoLynxUrlConfig_OptTypeAdapter extends TypeAdapter<LiveSheetDemoLynxUrlConfig> {
    public LiveSheetDemoLynxUrlConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSheetDemoLynxUrlConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveSheetDemoLynxUrlConfig liveSheetDemoLynxUrlConfig = new LiveSheetDemoLynxUrlConfig(null, null, null, null, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1571455633:
                        if (!LJJ.equals("spark_offline_navigate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            liveSheetDemoLynxUrlConfig.sparkOfflineNavigate = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1518031725:
                        if (!LJJ.equals("spark_navigate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            liveSheetDemoLynxUrlConfig.sparkNavigate = LJJIIZI2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -239971182:
                        if (!LJJ.equals("spark_offline_overlay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI3 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI3, "reader.nextString()");
                            liveSheetDemoLynxUrlConfig.sparkOfflineOverlay = LJJIIZI3;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -99700498:
                        if (!LJJ.equals("spark_overlay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI4 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI4, "reader.nextString()");
                            liveSheetDemoLynxUrlConfig.sparkOverlay = LJJIIZI4;
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
        return liveSheetDemoLynxUrlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveSheetDemoLynxUrlConfig liveSheetDemoLynxUrlConfig) {
        LiveSheetDemoLynxUrlConfig liveSheetDemoLynxUrlConfig2 = liveSheetDemoLynxUrlConfig;
        o.LJIIIZ(writer, "writer");
        if (liveSheetDemoLynxUrlConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("spark_overlay");
        writer.LJJ(liveSheetDemoLynxUrlConfig2.sparkOverlay);
        writer.LJI("spark_navigate");
        writer.LJJ(liveSheetDemoLynxUrlConfig2.sparkNavigate);
        writer.LJI("spark_offline_overlay");
        writer.LJJ(liveSheetDemoLynxUrlConfig2.sparkOfflineOverlay);
        writer.LJI("spark_offline_navigate");
        writer.LJJ(liveSheetDemoLynxUrlConfig2.sparkOfflineNavigate);
        writer.LJFF();
    }
}
