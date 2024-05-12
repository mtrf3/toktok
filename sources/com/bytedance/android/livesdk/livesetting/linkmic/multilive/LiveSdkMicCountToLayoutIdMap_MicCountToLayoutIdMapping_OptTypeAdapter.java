package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSdkMicCountToLayoutIdMap;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveSdkMicCountToLayoutIdMap_MicCountToLayoutIdMapping_OptTypeAdapter extends TypeAdapter<LiveSdkMicCountToLayoutIdMap.MicCountToLayoutIdMapping> {
    public LiveSdkMicCountToLayoutIdMap_MicCountToLayoutIdMapping_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSdkMicCountToLayoutIdMap.MicCountToLayoutIdMapping read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveSdkMicCountToLayoutIdMap.MicCountToLayoutIdMapping micCountToLayoutIdMapping = new LiveSdkMicCountToLayoutIdMap.MicCountToLayoutIdMapping(null, null, null, null, null, 31, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1589163540:
                        if (!LJJ.equals("fix_grid_3_ui_btn")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            micCountToLayoutIdMapping.fixGrid3UiBtn = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1465046457:
                        if (!LJJ.equals("fix_grid_8_ui_btn")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            micCountToLayoutIdMapping.fixGrid8UiBtn = LJJIIZI2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 650217375:
                        if (!LJJ.equals("fix_panel_6_ui_btn")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI3 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI3, "reader.nextString()");
                            micCountToLayoutIdMapping.fixPanel6UiBtn = LJJIIZI3;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1459564001:
                        if (!LJJ.equals("fix_panel_4_ui_btn")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI4 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI4, "reader.nextString()");
                            micCountToLayoutIdMapping.fixPanel4UiBtn = LJJIIZI4;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1896457130:
                        if (!LJJ.equals("fix_grid_5_ui_btn")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI5 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI5, "reader.nextString()");
                            micCountToLayoutIdMapping.fixGrid5UiBtn = LJJIIZI5;
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
        return micCountToLayoutIdMapping;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveSdkMicCountToLayoutIdMap.MicCountToLayoutIdMapping micCountToLayoutIdMapping) {
        LiveSdkMicCountToLayoutIdMap.MicCountToLayoutIdMapping micCountToLayoutIdMapping2 = micCountToLayoutIdMapping;
        o.LJIIIZ(writer, "writer");
        if (micCountToLayoutIdMapping2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("fix_grid_3_ui_btn");
        writer.LJJ(micCountToLayoutIdMapping2.fixGrid3UiBtn);
        writer.LJI("fix_grid_5_ui_btn");
        writer.LJJ(micCountToLayoutIdMapping2.fixGrid5UiBtn);
        writer.LJI("fix_grid_8_ui_btn");
        writer.LJJ(micCountToLayoutIdMapping2.fixGrid8UiBtn);
        writer.LJI("fix_panel_4_ui_btn");
        writer.LJJ(micCountToLayoutIdMapping2.fixPanel4UiBtn);
        writer.LJI("fix_panel_6_ui_btn");
        writer.LJJ(micCountToLayoutIdMapping2.fixPanel6UiBtn);
        writer.LJFF();
    }
}
