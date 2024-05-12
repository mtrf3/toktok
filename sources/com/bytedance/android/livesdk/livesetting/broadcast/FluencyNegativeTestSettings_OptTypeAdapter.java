package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import X.WM7;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FluencyNegativeTestSettings_OptTypeAdapter extends TypeAdapter<FluencyNegativeTestSettings> {
    public final Gson LIZ;

    public FluencyNegativeTestSettings_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FluencyNegativeTestSettings read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        FluencyNegativeTestSettings fluencyNegativeTestSettings = new FluencyNegativeTestSettings(false, 0, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1298848381) {
                    if (hashCode != 70023158) {
                        if (hashCode == 109254796 && LJJ.equals(WM7.SCENE_SERVICE)) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                fluencyNegativeTestSettings.scene = reader.LJIJI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("drop_frames")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            fluencyNegativeTestSettings.dropFrames = reader.LJIJ();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("enable")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        fluencyNegativeTestSettings.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return fluencyNegativeTestSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, FluencyNegativeTestSettings fluencyNegativeTestSettings) {
        FluencyNegativeTestSettings fluencyNegativeTestSettings2 = fluencyNegativeTestSettings;
        o.LJIIIZ(writer, "writer");
        if (fluencyNegativeTestSettings2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(fluencyNegativeTestSettings2.enable);
        writer.LJI(WM7.SCENE_SERVICE);
        C79062V1e.LJFF(fluencyNegativeTestSettings2.scene, writer, "drop_frames");
        writer.LJIILL(fluencyNegativeTestSettings2.dropFrames);
        writer.LJFF();
    }
}
