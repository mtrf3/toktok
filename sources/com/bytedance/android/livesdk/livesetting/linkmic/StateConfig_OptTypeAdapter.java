package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class StateConfig_OptTypeAdapter extends TypeAdapter<StateConfig> {
    public final Gson LIZ;

    public StateConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final StateConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        StateConfig stateConfig = new StateConfig(0, false, false, false, 0, 0, 63, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1096925525:
                        if (!LJJ.equals("state_sync_rtc")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            stateConfig.setSyncWithRTC(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 157161169:
                        if (!LJJ.equals("state_stat_report")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            stateConfig.setEnableStat(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 587372633:
                        if (!LJJ.equals("state_check_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            stateConfig.setCheckDuration(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 786409929:
                        if (!LJJ.equals("state_filter_by_type")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            stateConfig.setFilterStateType(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1070646701:
                        if (!LJJ.equals("state_compare_recheck")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            stateConfig.setDoubleCheck(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1397825679:
                        if (!LJJ.equals("state_im_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            stateConfig.setImConfig(reader.LJIJI());
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
        return stateConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, StateConfig stateConfig) {
        StateConfig stateConfig2 = stateConfig;
        o.LJIIIZ(writer, "writer");
        if (stateConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("state_im_config");
        writer.LJIJJ(Integer.valueOf(stateConfig2.getImConfig()));
        writer.LJI("state_stat_report");
        writer.LJJIII(stateConfig2.getEnableStat());
        writer.LJI("state_sync_rtc");
        writer.LJJIII(stateConfig2.getSyncWithRTC());
        writer.LJI("state_filter_by_type");
        writer.LJJIII(stateConfig2.getFilterStateType());
        writer.LJI("state_compare_recheck");
        writer.LJIJJ(Integer.valueOf(stateConfig2.getDoubleCheck()));
        writer.LJI("state_check_duration");
        writer.LJIJJ(Integer.valueOf(stateConfig2.getCheckDuration()));
        writer.LJFF();
    }
}
