package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C76965UIn;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ScoreWeights_OptTypeAdapter extends TypeAdapter<ScoreWeights> {
    public ScoreWeights_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final ScoreWeights read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        ScoreWeights scoreWeights = new ScoreWeights();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -561855165:
                        if (!LJJ.equals("temp_weight")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scoreWeights.temperatureWeight = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -86508710:
                        if (!LJJ.equals("net_weight")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scoreWeights.networkWeight = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 795234338:
                        if (!LJJ.equals("mem_weight")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scoreWeights.memoryWeight = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1115820271:
                        if (!LJJ.equals("cpu_weight")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scoreWeights.cpuWeight = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1335626382:
                        if (!LJJ.equals("fps_weight")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scoreWeights.fpsWeight = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1608425486:
                        if (!LJJ.equals("device_score_weight")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scoreWeights.deviceScoreWeight = (float) reader.LJIJ();
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
        return scoreWeights;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, ScoreWeights scoreWeights) {
        ScoreWeights scoreWeights2 = scoreWeights;
        o.LJIIIZ(writer, "writer");
        if (scoreWeights2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("fps_weight");
        C76965UIn.LIZIZ(scoreWeights2.fpsWeight, writer, "temp_weight");
        C76965UIn.LIZIZ(scoreWeights2.temperatureWeight, writer, "mem_weight");
        C76965UIn.LIZIZ(scoreWeights2.memoryWeight, writer, "cpu_weight");
        C76965UIn.LIZIZ(scoreWeights2.cpuWeight, writer, "net_weight");
        C76965UIn.LIZIZ(scoreWeights2.networkWeight, writer, "device_score_weight");
        writer.LJIJJ(Float.valueOf(scoreWeights2.deviceScoreWeight));
        writer.LJFF();
    }
}
