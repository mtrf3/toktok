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
public final class LiveIMMessageTrackConfig_OptTypeAdapter extends TypeAdapter<LiveIMMessageTrackConfig> {
    public final Gson LIZ;

    public LiveIMMessageTrackConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveIMMessageTrackConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveIMMessageTrackConfig liveIMMessageTrackConfig = new LiveIMMessageTrackConfig(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -629024255:
                        if (!LJJ.equals("anchor_ratio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveIMMessageTrackConfig.setAnchorRatio((LiveMessageSampleType) C64.LIZ(this.LIZ, LiveMessageSampleType.class, reader, "gson.getAdapter(LiveMess…:class.java).read(reader)"));
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -205270300:
                        if (!LJJ.equals("common_sampling_rate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveIMMessageTrackConfig.setSamplingRate(reader.LJIJ());
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
                            liveIMMessageTrackConfig.setAllowedMethods(LIZ);
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
                            liveIMMessageTrackConfig.setAllowedP2PMethods(LIZ2);
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1730335399:
                        if (!LJJ.equals("p2p_sampling_rate")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveIMMessageTrackConfig.setP2pFullSampling(reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1945700880:
                        if (!LJJ.equals("audience_ratio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveIMMessageTrackConfig.setAudienceRatio((LiveMessageSampleType) C64.LIZ(this.LIZ, LiveMessageSampleType.class, reader, "gson.getAdapter(LiveMess…:class.java).read(reader)"));
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
        return liveIMMessageTrackConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveIMMessageTrackConfig liveIMMessageTrackConfig) {
        LiveIMMessageTrackConfig liveIMMessageTrackConfig2 = liveIMMessageTrackConfig;
        o.LJIIIZ(writer, "writer");
        if (liveIMMessageTrackConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("common_sampling_rate");
        writer.LJIILL(liveIMMessageTrackConfig2.getSamplingRate());
        writer.LJI("p2p_sampling_rate");
        writer.LJIILL(liveIMMessageTrackConfig2.getP2pFullSampling());
        writer.LJI("allow_method_list");
        C65412Plo.LIZLLL(this.LIZ, writer, liveIMMessageTrackConfig2.getAllowedMethods(), String.class);
        writer.LJI("allow_p2p_method_list");
        C65412Plo.LIZLLL(this.LIZ, writer, liveIMMessageTrackConfig2.getAllowedP2PMethods(), String.class);
        writer.LJI("anchor_ratio");
        TypeAdapter LJIIJ = this.LIZ.LJIIJ(LiveMessageSampleType.class);
        LJIIJ.write(writer, liveIMMessageTrackConfig2.getAnchorRatio());
        writer.LJI("audience_ratio");
        LJIIJ.write(writer, liveIMMessageTrackConfig2.getAudienceRatio());
        writer.LJFF();
    }
}