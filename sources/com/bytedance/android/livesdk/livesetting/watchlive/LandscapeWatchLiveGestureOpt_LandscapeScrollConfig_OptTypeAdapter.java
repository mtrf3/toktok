package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveGestureOpt;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LandscapeWatchLiveGestureOpt_LandscapeScrollConfig_OptTypeAdapter extends TypeAdapter<LandscapeWatchLiveGestureOpt.LandscapeScrollConfig> {
    public final Gson LIZ;

    public LandscapeWatchLiveGestureOpt_LandscapeScrollConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LandscapeWatchLiveGestureOpt.LandscapeScrollConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LandscapeWatchLiveGestureOpt.LandscapeScrollConfig landscapeScrollConfig = new LandscapeWatchLiveGestureOpt.LandscapeScrollConfig(false, false, 0, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1298848381) {
                    if (hashCode != -560337405) {
                        if (hashCode == -128363830 && LJJ.equals("vertical_angle")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                landscapeScrollConfig.setScrollAngle(reader.LJIJI());
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("enable_hor_opt")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            landscapeScrollConfig.setEnableHorOpt(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("enable")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        landscapeScrollConfig.setEnable(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return landscapeScrollConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LandscapeWatchLiveGestureOpt.LandscapeScrollConfig landscapeScrollConfig) {
        LandscapeWatchLiveGestureOpt.LandscapeScrollConfig landscapeScrollConfig2 = landscapeScrollConfig;
        o.LJIIIZ(writer, "writer");
        if (landscapeScrollConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(landscapeScrollConfig2.getEnable());
        writer.LJI("enable_hor_opt");
        writer.LJJIII(landscapeScrollConfig2.getEnableHorOpt());
        writer.LJI("vertical_angle");
        writer.LJIJJ(Integer.valueOf(landscapeScrollConfig2.getScrollAngle()));
        writer.LJFF();
    }
}
