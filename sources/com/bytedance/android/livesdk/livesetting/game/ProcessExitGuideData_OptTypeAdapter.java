package com.bytedance.android.livesdk.livesetting.game;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ProcessExitGuideData_OptTypeAdapter extends TypeAdapter<ProcessExitGuideData> {
    public final Gson LIZ;

    public ProcessExitGuideData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ProcessExitGuideData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        ProcessExitGuideData processExitGuideData = new ProcessExitGuideData(null, null, null, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1938360187) {
                    if (hashCode != 93997959) {
                        if (hashCode == 1222565467 && LJJ.equals("exit_description")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                                o.LJI(LIZ);
                                processExitGuideData.exitDescriptionList = LIZ;
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("brand")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            processExitGuideData.brand = reader.LJJIIZI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("exit_reason")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, Integer.TYPE);
                        o.LJI(LIZ2);
                        processExitGuideData.exitReasonList = LIZ2;
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return processExitGuideData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, ProcessExitGuideData processExitGuideData) {
        ProcessExitGuideData processExitGuideData2 = processExitGuideData;
        o.LJIIIZ(writer, "writer");
        if (processExitGuideData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("brand");
        writer.LJJ(processExitGuideData2.brand);
        writer.LJI("exit_reason");
        C65412Plo.LIZLLL(this.LIZ, writer, processExitGuideData2.exitReasonList, Integer.TYPE);
        writer.LJI("exit_description");
        C65412Plo.LIZLLL(this.LIZ, writer, processExitGuideData2.exitDescriptionList, String.class);
        writer.LJFF();
    }
}
