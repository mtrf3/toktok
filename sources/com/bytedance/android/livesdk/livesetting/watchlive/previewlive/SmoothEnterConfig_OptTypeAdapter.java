package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SmoothEnterConfig_OptTypeAdapter extends TypeAdapter<SmoothEnterConfig> {
    public final Gson LIZ;

    public SmoothEnterConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SmoothEnterConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        SmoothEnterConfig smoothEnterConfig = new SmoothEnterConfig(false, false, 0L, null, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            smoothEnterConfig.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -786517174:
                        if (!LJJ.equals("force_remove_enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            smoothEnterConfig.forceRemove = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 499523152:
                        if (!LJJ.equals("force_remove_delay_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            smoothEnterConfig.forceRemoveDelayTime = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1105192402:
                        if (!LJJ.equals("entrance_enable_high_prio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            HashMap LIZIZ = C65412Plo.LIZIZ(this.LIZ, reader, Boolean.TYPE);
                            o.LJI(LIZIZ);
                            smoothEnterConfig.entranceMap = LIZIZ;
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
        return smoothEnterConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, SmoothEnterConfig smoothEnterConfig) {
        SmoothEnterConfig smoothEnterConfig2 = smoothEnterConfig;
        o.LJIIIZ(writer, "writer");
        if (smoothEnterConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(smoothEnterConfig2.enable);
        writer.LJI("force_remove_enable");
        writer.LJJIII(smoothEnterConfig2.forceRemove);
        writer.LJI("force_remove_delay_time");
        writer.LJIJ(smoothEnterConfig2.forceRemoveDelayTime);
        writer.LJI("entrance_enable_high_prio");
        C65412Plo.LJ(this.LIZ, writer, smoothEnterConfig2.entranceMap, Boolean.TYPE);
        writer.LJFF();
    }
}
