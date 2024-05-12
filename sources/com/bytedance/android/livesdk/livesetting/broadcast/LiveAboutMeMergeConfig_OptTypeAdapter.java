package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveAboutMeMergeConfig_OptTypeAdapter extends TypeAdapter<LiveAboutMeMergeConfig> {
    public LiveAboutMeMergeConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveAboutMeMergeConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveAboutMeMergeConfig liveAboutMeMergeConfig = new LiveAboutMeMergeConfig(null, null, null, null, null, 31, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1355851121:
                        if (!LJJ.equals("url_popup_live_sheet")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            liveAboutMeMergeConfig.urlPopupLiveSheet = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1060221358:
                        if (!LJJ.equals("url_upgrade_popup_live_sheet")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            liveAboutMeMergeConfig.urlUpgradePopupLiveSheet = LJJIIZI2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -149577589:
                        if (!LJJ.equals("url_fullscreen")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI3 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI3, "reader.nextString()");
                            liveAboutMeMergeConfig.urlFullscreen = LJJIIZI3;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -14120484:
                        if (!LJJ.equals("url_popup")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI4 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI4, "reader.nextString()");
                            liveAboutMeMergeConfig.urlPopup = LJJIIZI4;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1677480441:
                        if (!LJJ.equals("url_upgrade_popup")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI5 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI5, "reader.nextString()");
                            liveAboutMeMergeConfig.urlUpgradePopup = LJJIIZI5;
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
        return liveAboutMeMergeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveAboutMeMergeConfig liveAboutMeMergeConfig) {
        LiveAboutMeMergeConfig liveAboutMeMergeConfig2 = liveAboutMeMergeConfig;
        o.LJIIIZ(writer, "writer");
        if (liveAboutMeMergeConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("url_popup");
        writer.LJJ(liveAboutMeMergeConfig2.urlPopup);
        writer.LJI("url_popup_live_sheet");
        writer.LJJ(liveAboutMeMergeConfig2.urlPopupLiveSheet);
        writer.LJI("url_fullscreen");
        writer.LJJ(liveAboutMeMergeConfig2.urlFullscreen);
        writer.LJI("url_upgrade_popup");
        writer.LJJ(liveAboutMeMergeConfig2.urlUpgradePopup);
        writer.LJI("url_upgrade_popup_live_sheet");
        writer.LJJ(liveAboutMeMergeConfig2.urlUpgradePopupLiveSheet);
        writer.LJFF();
    }
}
