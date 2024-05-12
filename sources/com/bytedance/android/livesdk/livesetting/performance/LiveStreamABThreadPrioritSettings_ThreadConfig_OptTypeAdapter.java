package com.bytedance.android.livesdk.livesetting.performance;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.performance.LiveStreamABThreadPrioritSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveStreamABThreadPrioritSettings_ThreadConfig_OptTypeAdapter extends TypeAdapter<LiveStreamABThreadPrioritSettings.ThreadConfig> {
    public LiveStreamABThreadPrioritSettings_ThreadConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveStreamABThreadPrioritSettings.ThreadConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveStreamABThreadPrioritSettings.ThreadConfig threadConfig = new LiveStreamABThreadPrioritSettings.ThreadConfig(0, 0, 0, 0, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1462882783:
                        if (!LJJ.equals("webcast_live_stream_thread_priority_settings")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            threadConfig.settings = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1408738256:
                        if (!LJJ.equals("webcast_live_stream_worker_thread_priority")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            threadConfig.workPriority = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1255905507:
                        if (!LJJ.equals("webcast_live_stream_videocapture_thread_priority")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            threadConfig.videoCapturePriority = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1085506338:
                        if (!LJJ.equals("webcast_live_stream_grk_thread_priority")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            threadConfig.grkPriority = reader.LJIJI();
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
    public final void write(C65403Plf writer, LiveStreamABThreadPrioritSettings.ThreadConfig threadConfig) {
        LiveStreamABThreadPrioritSettings.ThreadConfig threadConfig2 = threadConfig;
        o.LJIIIZ(writer, "writer");
        if (threadConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("webcast_live_stream_thread_priority_settings");
        C79062V1e.LJFF(threadConfig2.settings, writer, "webcast_live_stream_worker_thread_priority");
        C79062V1e.LJFF(threadConfig2.workPriority, writer, "webcast_live_stream_videocapture_thread_priority");
        C79062V1e.LJFF(threadConfig2.videoCapturePriority, writer, "webcast_live_stream_grk_thread_priority");
        C77339UWx.LJFF(threadConfig2.grkPriority, writer);
    }
}
