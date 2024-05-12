package com.bytedance.android.livesdk.livesetting.message;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessageDispatchConfig_OptTypeAdapter extends TypeAdapter<LiveMessageDispatchConfig> {
    public final Gson LIZ;

    public LiveMessageDispatchConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessageDispatchConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMessageDispatchConfig liveMessageDispatchConfig = new LiveMessageDispatchConfig(false, false, null, null, null, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, false, false, false, 131071, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1673715327:
                        if (!LJJ.equals("direct_dispatch_p2p_msg")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.directDispatchP2pMsg = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1647602539:
                        if (!LJJ.equals("enable_dispatch_list_optimize")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.enableDispatchListOptimize = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1628875079:
                        if (!LJJ.equals("dispatch_dynamic_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.dispatchDynamicDuration = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1463312869:
                        if (!LJJ.equals("enable_inactive_opt")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.enableInactiveOpt = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1374723228:
                        if (!LJJ.equals("dispatch_message_timeout")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.dispatchMessageTimeout = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1332283248:
                        if (!LJJ.equals("fixfreq_strategy_dispatch_interval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.fixfreqDispatchInterval = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1214758844:
                        if (!LJJ.equals("fixfreq_strategy_max_queue_size")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.fixfreqMaxQueueSize = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -273598287:
                        if (!LJJ.equals("smooth_dispatch_optimize")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.smoothDispatchOptimize = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -237784807:
                        if (!LJJ.equals("enable_async_dispatch")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.enableAsyncDispatch = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -161914615:
                        if (!LJJ.equals("optwindow_strategy_min_dispatch_size")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.optwindowMinDispatchSize = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 175545341:
                        if (!LJJ.equals("dispatch_limit_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.dispatchLimitDuration = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1147441607:
                        if (!LJJ.equals("by_pass_dispatch_allow_method_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ);
                            liveMessageDispatchConfig.byPassDispatchAllowList = LIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1411905944:
                        if (!LJJ.equals("dispatch_strategy")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.dispatchStrategy = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1466732876:
                        if (!LJJ.equals("fixfreq_strategy_dispatch_size")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.fixfreqDispatchSize = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1468182154:
                        if (!LJJ.equals("direct_dispatch_p2p_block_method_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ2);
                            liveMessageDispatchConfig.directDispatchP2pBlockList = LIZ2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1707249367:
                        if (!LJJ.equals("direct_dispatch_allow_method_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ3 = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ3);
                            liveMessageDispatchConfig.directDispatchAllowList = LIZ3;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1816355148:
                        if (!LJJ.equals("optwindow_strategy_window_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageDispatchConfig.optwindowWindowTime = reader.LJIJJ();
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
        return liveMessageDispatchConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMessageDispatchConfig liveMessageDispatchConfig) {
        LiveMessageDispatchConfig liveMessageDispatchConfig2 = liveMessageDispatchConfig;
        o.LJIIIZ(writer, "writer");
        if (liveMessageDispatchConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("direct_dispatch_p2p_msg");
        writer.LJJIII(liveMessageDispatchConfig2.directDispatchP2pMsg);
        writer.LJI("smooth_dispatch_optimize");
        writer.LJJIII(liveMessageDispatchConfig2.smoothDispatchOptimize);
        writer.LJI("direct_dispatch_allow_method_list");
        C65412Plo.LIZLLL(this.LIZ, writer, liveMessageDispatchConfig2.directDispatchAllowList, String.class);
        writer.LJI("by_pass_dispatch_allow_method_list");
        C65412Plo.LIZLLL(this.LIZ, writer, liveMessageDispatchConfig2.byPassDispatchAllowList, String.class);
        writer.LJI("direct_dispatch_p2p_block_method_list");
        C65412Plo.LIZLLL(this.LIZ, writer, liveMessageDispatchConfig2.directDispatchP2pBlockList, String.class);
        writer.LJI("dispatch_message_timeout");
        writer.LJIJ(liveMessageDispatchConfig2.dispatchMessageTimeout);
        writer.LJI("dispatch_strategy");
        C79062V1e.LJFF(liveMessageDispatchConfig2.dispatchStrategy, writer, "optwindow_strategy_window_time");
        writer.LJIJ(liveMessageDispatchConfig2.optwindowWindowTime);
        writer.LJI("optwindow_strategy_min_dispatch_size");
        C79062V1e.LJFF(liveMessageDispatchConfig2.optwindowMinDispatchSize, writer, "fixfreq_strategy_dispatch_interval");
        writer.LJIJ(liveMessageDispatchConfig2.fixfreqDispatchInterval);
        writer.LJI("fixfreq_strategy_dispatch_size");
        C79062V1e.LJFF(liveMessageDispatchConfig2.fixfreqDispatchSize, writer, "fixfreq_strategy_max_queue_size");
        C79062V1e.LJFF(liveMessageDispatchConfig2.fixfreqMaxQueueSize, writer, "dispatch_limit_duration");
        C79062V1e.LJFF(liveMessageDispatchConfig2.dispatchLimitDuration, writer, "dispatch_dynamic_duration");
        C79062V1e.LJFF(liveMessageDispatchConfig2.dispatchDynamicDuration, writer, "enable_dispatch_list_optimize");
        writer.LJJIII(liveMessageDispatchConfig2.enableDispatchListOptimize);
        writer.LJI("enable_async_dispatch");
        writer.LJJIII(liveMessageDispatchConfig2.enableAsyncDispatch);
        writer.LJI("enable_inactive_opt");
        writer.LJJIII(liveMessageDispatchConfig2.enableInactiveOpt);
        writer.LJFF();
    }
}
