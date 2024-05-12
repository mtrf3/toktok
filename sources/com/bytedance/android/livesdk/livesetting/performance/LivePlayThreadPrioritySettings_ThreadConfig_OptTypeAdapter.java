package com.bytedance.android.livesdk.livesetting.performance;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayThreadPrioritySettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LivePlayThreadPrioritySettings_ThreadConfig_OptTypeAdapter extends TypeAdapter<LivePlayThreadPrioritySettings.ThreadConfig> {
    public LivePlayThreadPrioritySettings_ThreadConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePlayThreadPrioritySettings.ThreadConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LivePlayThreadPrioritySettings.ThreadConfig threadConfig = new LivePlayThreadPrioritySettings.ThreadConfig(0, 0, 0, 0, 0, 31, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1507860403:
                        if (!LJJ.equals("upgrade_live_play_conrol_thread_nice_value")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            threadConfig.upgradeNice = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -671520167:
                        if (!LJJ.equals("enable_live_play_thread_priority_opt")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            threadConfig.enable = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -670643457:
                        if (!LJJ.equals("downgrade_logger_thread_nice_value")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            threadConfig.downgradeLoggerNice = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 489145088:
                        if (!LJJ.equals("downgrade_3rd_thread_nice_value")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            threadConfig.downgrade3rdNice = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 600248491:
                        if (!LJJ.equals("downgrade_tea_thread_nice_value")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            threadConfig.downgradeTeaNice = reader.LJIJI();
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
        return threadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LivePlayThreadPrioritySettings.ThreadConfig threadConfig) {
        LivePlayThreadPrioritySettings.ThreadConfig threadConfig2 = threadConfig;
        o.LJIIIZ(writer, "writer");
        if (threadConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_live_play_thread_priority_opt");
        C79062V1e.LJFF(threadConfig2.enable, writer, "upgrade_live_play_conrol_thread_nice_value");
        C79062V1e.LJFF(threadConfig2.upgradeNice, writer, "downgrade_logger_thread_nice_value");
        C79062V1e.LJFF(threadConfig2.downgradeLoggerNice, writer, "downgrade_tea_thread_nice_value");
        C79062V1e.LJFF(threadConfig2.downgradeTeaNice, writer, "downgrade_3rd_thread_nice_value");
        C77339UWx.LJFF(threadConfig2.downgrade3rdNice, writer);
    }
}
