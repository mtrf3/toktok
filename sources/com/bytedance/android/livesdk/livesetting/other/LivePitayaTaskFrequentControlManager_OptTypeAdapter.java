package com.bytedance.android.livesdk.livesetting.other;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LivePitayaTaskFrequentControlManager_OptTypeAdapter extends TypeAdapter<LivePitayaTaskFrequentControlManager> {
    public final Gson LIZ;

    public LivePitayaTaskFrequentControlManager_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePitayaTaskFrequentControlManager read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LivePitayaTaskFrequentControlManager livePitayaTaskFrequentControlManager = new LivePitayaTaskFrequentControlManager(false, null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1023, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1458784405:
                        if (!LJJ.equals("enable_frequent_control_white_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ);
                            livePitayaTaskFrequentControlManager.enableFrequentControlWhiteList = LIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1397834929:
                        if (!LJJ.equals("fps_limit_anchor")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaTaskFrequentControlManager.fpsLimitAnchor = reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -244045595:
                        if (!LJJ.equals("fps_limit")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaTaskFrequentControlManager.fpsLimit = reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -40648276:
                        if (!LJJ.equals("cpu_speed_limit")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaTaskFrequentControlManager.cpuSpeedLimit = reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 39716008:
                        if (!LJJ.equals("cpu_speed_limit_anchor")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaTaskFrequentControlManager.cpuSpeedLimitAnchor = reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 115773075:
                        if (!LJJ.equals("cpu_rate_limit")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaTaskFrequentControlManager.cpuRateLimit = reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 287732279:
                        if (!LJJ.equals("memory_limit_anchor")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaTaskFrequentControlManager.memoryLimitAnchor = reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1003930664:
                        if (!LJJ.equals("enable_frequent_control")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaTaskFrequentControlManager.enableFrequentControl = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1025959677:
                        if (!LJJ.equals("memory_limit")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaTaskFrequentControlManager.memoryLimit = reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1690121697:
                        if (!LJJ.equals("cpu_rate_limit_anchor")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePitayaTaskFrequentControlManager.cpuRateLimitAnchor = reader.LJIJ();
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
        return livePitayaTaskFrequentControlManager;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LivePitayaTaskFrequentControlManager livePitayaTaskFrequentControlManager) {
        LivePitayaTaskFrequentControlManager livePitayaTaskFrequentControlManager2 = livePitayaTaskFrequentControlManager;
        o.LJIIIZ(writer, "writer");
        if (livePitayaTaskFrequentControlManager2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_frequent_control");
        writer.LJJIII(livePitayaTaskFrequentControlManager2.enableFrequentControl);
        writer.LJI("enable_frequent_control_white_list");
        C65412Plo.LIZLLL(this.LIZ, writer, livePitayaTaskFrequentControlManager2.enableFrequentControlWhiteList, String.class);
        writer.LJI("fps_limit");
        writer.LJIILL(livePitayaTaskFrequentControlManager2.fpsLimit);
        writer.LJI("cpu_rate_limit");
        writer.LJIILL(livePitayaTaskFrequentControlManager2.cpuRateLimit);
        writer.LJI("cpu_speed_limit");
        writer.LJIILL(livePitayaTaskFrequentControlManager2.cpuSpeedLimit);
        writer.LJI("memory_limit");
        writer.LJIILL(livePitayaTaskFrequentControlManager2.memoryLimit);
        writer.LJI("fps_limit_anchor");
        writer.LJIILL(livePitayaTaskFrequentControlManager2.fpsLimitAnchor);
        writer.LJI("cpu_rate_limit_anchor");
        writer.LJIILL(livePitayaTaskFrequentControlManager2.cpuRateLimitAnchor);
        writer.LJI("cpu_speed_limit_anchor");
        writer.LJIILL(livePitayaTaskFrequentControlManager2.cpuSpeedLimitAnchor);
        writer.LJI("memory_limit_anchor");
        writer.LJIILL(livePitayaTaskFrequentControlManager2.memoryLimitAnchor);
        writer.LJFF();
    }
}
