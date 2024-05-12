package com.bytedance.android.livesdk.livesetting.message;

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

/* loaded from: classes6.dex */
public final class LiveMessageReceiveTrackConfig_OptTypeAdapter extends TypeAdapter<LiveMessageReceiveTrackConfig> {
    public final Gson LIZ;

    public LiveMessageReceiveTrackConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessageReceiveTrackConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMessageReceiveTrackConfig liveMessageReceiveTrackConfig = new LiveMessageReceiveTrackConfig(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -629024255:
                        if (!LJJ.equals("anchor_ratio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageReceiveTrackConfig.setAnchorRatio((LiveMessageSampleType) C64.LIZ(this.LIZ, LiveMessageSampleType.class, reader, "gson.getAdapter(LiveMess…:class.java).read(reader)"));
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -205270300:
                        if (!LJJ.equals("common_sampling_rate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageReceiveTrackConfig.setSamplingRate(reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 338843974:
                        if (!LJJ.equals("allow_method_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ);
                            liveMessageReceiveTrackConfig.setAllowedMethods(LIZ);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 465590389:
                        if (!LJJ.equals("allow_p2p_method_list")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, String.class);
                            o.LJI(LIZ2);
                            liveMessageReceiveTrackConfig.setAllowedP2PMethods(LIZ2);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1730335399:
                        if (!LJJ.equals("p2p_sampling_rate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageReceiveTrackConfig.setP2pFullSampling(reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1945700880:
                        if (!LJJ.equals("audience_ratio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageReceiveTrackConfig.setAudienceRatio((LiveMessageSampleType) C64.LIZ(this.LIZ, LiveMessageSampleType.class, reader, "gson.getAdapter(LiveMess…:class.java).read(reader)"));
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
        return liveMessageReceiveTrackConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMessageReceiveTrackConfig liveMessageReceiveTrackConfig) {
        LiveMessageReceiveTrackConfig liveMessageReceiveTrackConfig2 = liveMessageReceiveTrackConfig;
        o.LJIIIZ(writer, "writer");
        if (liveMessageReceiveTrackConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("common_sampling_rate");
        writer.LJIILL(liveMessageReceiveTrackConfig2.getSamplingRate());
        writer.LJI("p2p_sampling_rate");
        writer.LJIILL(liveMessageReceiveTrackConfig2.getP2pFullSampling());
        writer.LJI("allow_method_list");
        C65412Plo.LIZLLL(this.LIZ, writer, liveMessageReceiveTrackConfig2.getAllowedMethods(), String.class);
        writer.LJI("allow_p2p_method_list");
        C65412Plo.LIZLLL(this.LIZ, writer, liveMessageReceiveTrackConfig2.getAllowedP2PMethods(), String.class);
        writer.LJI("anchor_ratio");
        TypeAdapter LJIIJ = this.LIZ.LJIIJ(LiveMessageSampleType.class);
        LJIIJ.write(writer, liveMessageReceiveTrackConfig2.getAnchorRatio());
        writer.LJI("audience_ratio");
        LJIIJ.write(writer, liveMessageReceiveTrackConfig2.getAudienceRatio());
        writer.LJFF();
    }
}
