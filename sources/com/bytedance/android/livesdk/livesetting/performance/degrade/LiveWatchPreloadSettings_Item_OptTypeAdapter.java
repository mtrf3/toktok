package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveWatchPreloadSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LiveWatchPreloadSettings_Item_OptTypeAdapter extends TypeAdapter<LiveWatchPreloadSettings.Item> {
    public final Gson LIZ;

    public LiveWatchPreloadSettings_Item_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveWatchPreloadSettings.Item read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveWatchPreloadSettings.Item item = new LiveWatchPreloadSettings.Item(false, false, false, false, false, false, false, 127, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1945447304:
                        if (!LJJ.equals("xml_res")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            item.xmlResDisable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -777416277:
                        if (!LJJ.equals("res_get_opt")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            item.resGetOpt = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -366821515:
                        if (!LJJ.equals("message_manager")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            item.messageManagerDisable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -255680669:
                        if (!LJJ.equals("disable_unused_tea_log")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            item.disableUnusedTeaLog = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 777295233:
                        if (!LJJ.equals("call_ahead_prepare_next_step")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            item.callAheadPrepareNextStep = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1880047109:
                        if (!LJJ.equals("breakup_play_fragment_create")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            item.breakUpPlayFragmentCreate = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2146038026:
                        if (!LJJ.equals("gpu_info_disable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            item.gpuInfoDisable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return item;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveWatchPreloadSettings.Item item) {
        LiveWatchPreloadSettings.Item item2 = item;
        o.LJIIIZ(writer, "writer");
        if (item2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("xml_res");
        writer.LJJIII(item2.xmlResDisable);
        writer.LJI("message_manager");
        writer.LJJIII(item2.messageManagerDisable);
        writer.LJI("gpu_info_disable");
        writer.LJJIII(item2.gpuInfoDisable);
        writer.LJI("res_get_opt");
        writer.LJJIII(item2.resGetOpt);
        writer.LJI("breakup_play_fragment_create");
        writer.LJJIII(item2.breakUpPlayFragmentCreate);
        writer.LJI("disable_unused_tea_log");
        writer.LJJIII(item2.disableUnusedTeaLog);
        writer.LJI("call_ahead_prepare_next_step");
        writer.LJJIII(item2.callAheadPrepareNextStep);
        writer.LJFF();
    }
}
