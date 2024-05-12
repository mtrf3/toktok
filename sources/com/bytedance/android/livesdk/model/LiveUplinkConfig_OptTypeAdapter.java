package com.bytedance.android.livesdk.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveUplinkConfig_OptTypeAdapter extends TypeAdapter<LiveUplinkConfig> {
    public final Gson LIZ;

    public LiveUplinkConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveUplinkConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveUplinkConfig liveUplinkConfig = new LiveUplinkConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveUplinkConfig.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -715886178:
                        if (!LJJ.equals("ws_uplink_wait_timeout")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveUplinkConfig.wsUplinkWaitTimeout = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 777995101:
                        if (!LJJ.equals("uplink_strategy")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveUplinkConfig.uplinkStrategy = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1339572557:
                        if (!LJJ.equals("ws_fail_fallback_to_http")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveUplinkConfig.wsFailFallbackToHttp = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1394820439:
                        if (!LJJ.equals("uplink_api_alternative_service_id_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            Object read = this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends Long>>>() { // from class: X.2Sr
                            }).read(reader);
                            o.LJIIIIZZ(read, "gson.getAdapter(token).read(reader)");
                            liveUplinkConfig.uplinkApiAlternativeServiceIdList = (Map) read;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1731129540:
                        if (!LJJ.equals("uplink_api_allowed_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            Object read2 = this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends Long>>>() { // from class: X.2Sq
                            }).read(reader);
                            o.LJIIIIZZ(read2, "gson.getAdapter(token).read(reader)");
                            liveUplinkConfig.uplinkApiAllowedList = (Map) read2;
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
        return liveUplinkConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveUplinkConfig liveUplinkConfig) {
        LiveUplinkConfig liveUplinkConfig2 = liveUplinkConfig;
        o.LJIIIZ(writer, "writer");
        if (liveUplinkConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(liveUplinkConfig2.enable);
        writer.LJI("uplink_strategy");
        C79062V1e.LJFF(liveUplinkConfig2.uplinkStrategy, writer, "ws_uplink_wait_timeout");
        writer.LJIJ(liveUplinkConfig2.wsUplinkWaitTimeout);
        writer.LJI("uplink_api_allowed_list");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends Long>>>() { // from class: X.2Ss
        }).write(writer, liveUplinkConfig2.uplinkApiAllowedList);
        writer.LJI("uplink_api_alternative_service_id_list");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends Map<String, ? extends Long>>>() { // from class: X.2St
        }).write(writer, liveUplinkConfig2.uplinkApiAlternativeServiceIdList);
        writer.LJI("ws_fail_fallback_to_http");
        writer.LJJIII(liveUplinkConfig2.wsFailFallbackToHttp);
        writer.LJFF();
    }
}
