package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveHotDegradeSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveHotDegradeSetting_HotDegradeConfig_OptTypeAdapter extends TypeAdapter<LiveHotDegradeSetting.HotDegradeConfig> {
    public final Gson LIZ;

    public LiveHotDegradeSetting_HotDegradeConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveHotDegradeSetting.HotDegradeConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveHotDegradeSetting.HotDegradeConfig hotDegradeConfig = new LiveHotDegradeSetting.HotDegradeConfig(0, false, false, false, false, false, false, 127, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1983347515:
                        if (!LJJ.equals("hot_disable_gc")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            hotDegradeConfig.hotDisableGc = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1354225541:
                        if (!LJJ.equals("hot_disable_log")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            hotDegradeConfig.hotDisableLog = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1350168642:
                        if (!LJJ.equals("hot_delay_like_widget")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            hotDegradeConfig.hotDelayLikeWidget = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -471470670:
                        if (!LJJ.equals("hot_disable_gauss_bg")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            hotDegradeConfig.hotDisableGaussBg = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -120958385:
                        if (!LJJ.equals("hot_disable_other_like")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            hotDegradeConfig.hotDisableOtherLike = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1908780162:
                        if (!LJJ.equals("hot_temperature")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            hotDegradeConfig.hotTemperature = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1985335282:
                        if (!LJJ.equals("hot_disable_message_anim")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            hotDegradeConfig.hotDisableMessageAnim = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return hotDegradeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveHotDegradeSetting.HotDegradeConfig hotDegradeConfig) {
        LiveHotDegradeSetting.HotDegradeConfig hotDegradeConfig2 = hotDegradeConfig;
        o.LJIIIZ(writer, "writer");
        if (hotDegradeConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("hot_temperature");
        C79062V1e.LJFF(hotDegradeConfig2.hotTemperature, writer, "hot_disable_log");
        writer.LJJIII(hotDegradeConfig2.hotDisableLog);
        writer.LJI("hot_disable_gc");
        writer.LJJIII(hotDegradeConfig2.hotDisableGc);
        writer.LJI("hot_disable_other_like");
        writer.LJJIII(hotDegradeConfig2.hotDisableOtherLike);
        writer.LJI("hot_delay_like_widget");
        writer.LJJIII(hotDegradeConfig2.hotDelayLikeWidget);
        writer.LJI("hot_disable_gauss_bg");
        writer.LJJIII(hotDegradeConfig2.hotDisableGaussBg);
        writer.LJI("hot_disable_message_anim");
        writer.LJJIII(hotDegradeConfig2.hotDisableMessageAnim);
        writer.LJFF();
    }
}
