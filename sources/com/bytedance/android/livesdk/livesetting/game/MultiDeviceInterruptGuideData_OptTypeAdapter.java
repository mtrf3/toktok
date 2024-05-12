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
public final class MultiDeviceInterruptGuideData_OptTypeAdapter extends TypeAdapter<MultiDeviceInterruptGuideData> {
    public final Gson LIZ;

    public MultiDeviceInterruptGuideData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiDeviceInterruptGuideData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MultiDeviceInterruptGuideData multiDeviceInterruptGuideData = new MultiDeviceInterruptGuideData(null, null, null, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -2076094036) {
                    if (hashCode != -1923894165) {
                        if (hashCode == -1298848381 && LJJ.equals("enable")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                multiDeviceInterruptGuideData.enable = Integer.valueOf(reader.LJIJI());
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("process_exit_guide")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, ProcessExitGuideData.class);
                            o.LJI(LIZ);
                            multiDeviceInterruptGuideData.processExitGuideList = LIZ;
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("guide_url")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        multiDeviceInterruptGuideData.guideUrl = reader.LJJIIZI();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return multiDeviceInterruptGuideData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MultiDeviceInterruptGuideData multiDeviceInterruptGuideData) {
        MultiDeviceInterruptGuideData multiDeviceInterruptGuideData2 = multiDeviceInterruptGuideData;
        o.LJIIIZ(writer, "writer");
        if (multiDeviceInterruptGuideData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJIJJ(multiDeviceInterruptGuideData2.enable);
        writer.LJI("guide_url");
        writer.LJJ(multiDeviceInterruptGuideData2.guideUrl);
        writer.LJI("process_exit_guide");
        C65412Plo.LIZLLL(this.LIZ, writer, multiDeviceInterruptGuideData2.processExitGuideList, ProcessExitGuideData.class);
        writer.LJFF();
    }
}
