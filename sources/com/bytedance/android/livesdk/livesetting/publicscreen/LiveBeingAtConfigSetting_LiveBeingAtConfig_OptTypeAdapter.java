package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveBeingAtConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveBeingAtConfigSetting_LiveBeingAtConfig_OptTypeAdapter extends TypeAdapter<LiveBeingAtConfigSetting.LiveBeingAtConfig> {
    public final Gson LIZ;

    public LiveBeingAtConfigSetting_LiveBeingAtConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveBeingAtConfigSetting.LiveBeingAtConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveBeingAtConfigSetting.LiveBeingAtConfig liveBeingAtConfig = new LiveBeingAtConfigSetting.LiveBeingAtConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1689144471:
                        if (!LJJ.equals("flagReadThreshold")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveBeingAtConfig.flagReadThreshold = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1207414310:
                        if (!LJJ.equals("messageConsumeInterval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveBeingAtConfig.messageConsumeInterval = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -518282078:
                        if (!LJJ.equals("check_user")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveBeingAtConfig.checkUser = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1911301719:
                        if (!LJJ.equals("messageLifeDuration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveBeingAtConfig.messageLifeDuration = reader.LJIJJ();
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
        return liveBeingAtConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveBeingAtConfigSetting.LiveBeingAtConfig liveBeingAtConfig) {
        LiveBeingAtConfigSetting.LiveBeingAtConfig liveBeingAtConfig2 = liveBeingAtConfig;
        o.LJIIIZ(writer, "writer");
        if (liveBeingAtConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("messageConsumeInterval");
        writer.LJIJ(liveBeingAtConfig2.messageConsumeInterval);
        writer.LJI("messageLifeDuration");
        writer.LJIJ(liveBeingAtConfig2.messageLifeDuration);
        writer.LJI("flagReadThreshold");
        writer.LJIJ(liveBeingAtConfig2.flagReadThreshold);
        writer.LJI("check_user");
        writer.LJJIII(liveBeingAtConfig2.checkUser);
        writer.LJFF();
    }
}
