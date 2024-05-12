package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameDualDeviceSourceSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGameDualDeviceSourceSetting_SourceParam_OptTypeAdapter extends TypeAdapter<LiveGameDualDeviceSourceSetting.SourceParam> {
    public final Gson LIZ;

    public LiveGameDualDeviceSourceSetting_SourceParam_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGameDualDeviceSourceSetting.SourceParam read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveGameDualDeviceSourceSetting.SourceParam sourceParam = new LiveGameDualDeviceSourceSetting.SourceParam(false, 0L, 0, 0, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2062966467:
                        if (!LJJ.equals("live_game_dual_device_camera_enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            sourceParam.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1229463052:
                        if (!LJJ.equals("live_game_dual_device_camera_bit_rate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            sourceParam.bitRate = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1766013807:
                        if (!LJJ.equals("live_game_dual_device_camera_fps")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            sourceParam.cameraFPS = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1789647895:
                        if (!LJJ.equals("live_game_dual_device_camera_retry_duration_sec")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            sourceParam.retryDuration = reader.LJIJJ();
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
        return sourceParam;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveGameDualDeviceSourceSetting.SourceParam sourceParam) {
        LiveGameDualDeviceSourceSetting.SourceParam sourceParam2 = sourceParam;
        o.LJIIIZ(writer, "writer");
        if (sourceParam2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_game_dual_device_camera_enable");
        writer.LJJIII(sourceParam2.enable);
        writer.LJI("live_game_dual_device_camera_retry_duration_sec");
        writer.LJIJ(sourceParam2.retryDuration);
        writer.LJI("live_game_dual_device_camera_fps");
        C79062V1e.LJFF(sourceParam2.cameraFPS, writer, "live_game_dual_device_camera_bit_rate");
        C77339UWx.LJFF(sourceParam2.bitRate, writer);
    }
}
