package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveSdkPublicScreenMessageScheduleStrategySetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSdkPublicScreenMessageScheduleStrategySetting_LivePublicScreenAsyncConfig_OptTypeAdapter extends TypeAdapter<LiveSdkPublicScreenMessageScheduleStrategySetting.LivePublicScreenAsyncConfig> {
    public LiveSdkPublicScreenMessageScheduleStrategySetting_LivePublicScreenAsyncConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSdkPublicScreenMessageScheduleStrategySetting.LivePublicScreenAsyncConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveSdkPublicScreenMessageScheduleStrategySetting.LivePublicScreenAsyncConfig livePublicScreenAsyncConfig = new LiveSdkPublicScreenMessageScheduleStrategySetting.LivePublicScreenAsyncConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "async_schedule")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    livePublicScreenAsyncConfig.messageScheduleStrategy = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "message_schedule_thread_priority")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    livePublicScreenAsyncConfig.threadPriority = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return livePublicScreenAsyncConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveSdkPublicScreenMessageScheduleStrategySetting.LivePublicScreenAsyncConfig livePublicScreenAsyncConfig) {
        LiveSdkPublicScreenMessageScheduleStrategySetting.LivePublicScreenAsyncConfig livePublicScreenAsyncConfig2 = livePublicScreenAsyncConfig;
        o.LJIIIZ(writer, "writer");
        if (livePublicScreenAsyncConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("async_schedule");
        C79062V1e.LJFF(livePublicScreenAsyncConfig2.messageScheduleStrategy, writer, "message_schedule_thread_priority");
        C77339UWx.LJFF(livePublicScreenAsyncConfig2.threadPriority, writer);
    }
}
