package com.bytedance.android.livesdk.livesetting.subscription;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSubathonConfig_OptTypeAdapter extends TypeAdapter<LiveSubathonConfig> {
    public final Gson LIZ;

    public LiveSubathonConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSubathonConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveSubathonConfig liveSubathonConfig = new LiveSubathonConfig(false, false, 0L, 0L, 0L, false, 63, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1982396586:
                        if (!LJJ.equals("anchor_timer_auto_start")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSubathonConfig.setAnchorTimerAutoStart(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1937171982:
                        if (!LJJ.equals("enable_entrance")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSubathonConfig.setEnableEntrance(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1274317793:
                        if (!LJJ.equals("enable_edit_title")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSubathonConfig.setEnableEditTitle(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -478471055:
                        if (!LJJ.equals("time_align_interval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSubathonConfig.setTimeAlignInterval(reader.LJIJJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -436325297:
                        if (!LJJ.equals("time_align_max_gap")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSubathonConfig.setTimeAlignMaxGap(reader.LJIJJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -216527299:
                        if (!LJJ.equals("time_align_min_gap")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSubathonConfig.setTimeAlignMinGap(reader.LJIJJ());
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
        return liveSubathonConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveSubathonConfig liveSubathonConfig) {
        LiveSubathonConfig liveSubathonConfig2 = liveSubathonConfig;
        o.LJIIIZ(writer, "writer");
        if (liveSubathonConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_entrance");
        writer.LJJIII(liveSubathonConfig2.getEnableEntrance());
        writer.LJI("enable_edit_title");
        writer.LJJIII(liveSubathonConfig2.getEnableEditTitle());
        writer.LJI("time_align_min_gap");
        writer.LJIJ(liveSubathonConfig2.getTimeAlignMinGap());
        writer.LJI("time_align_max_gap");
        writer.LJIJ(liveSubathonConfig2.getTimeAlignMaxGap());
        writer.LJI("time_align_interval");
        writer.LJIJ(liveSubathonConfig2.getTimeAlignInterval());
        writer.LJI("anchor_timer_auto_start");
        writer.LJJIII(liveSubathonConfig2.getAnchorTimerAutoStart());
        writer.LJFF();
    }
}
