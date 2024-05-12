package com.bytedance.android.livesdk.livesetting.gift;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGiftResourceManagerConfig_OptTypeAdapter extends TypeAdapter<LiveGiftResourceManagerConfig> {
    public final Gson LIZ;

    public LiveGiftResourceManagerConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGiftResourceManagerConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveGiftResourceManagerConfig liveGiftResourceManagerConfig = new LiveGiftResourceManagerConfig(0, 0, false, 0L, 0L, false, false, false, 255, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1913256876:
                        if (!LJJ.equals("enable_delete_unused_resources")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGiftResourceManagerConfig.enableDeleteUnusedResource = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1900775544:
                        if (!LJJ.equals("thread_crash_fix")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGiftResourceManagerConfig.threadCrashFix = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1382073737:
                        if (!LJJ.equals("resource_disk_limitation_enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGiftResourceManagerConfig.resourceDiskLimitationEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -327574278:
                        if (!LJJ.equals("resource_preload_strategy")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGiftResourceManagerConfig.resourcePreloadStrategy = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 864660311:
                        if (!LJJ.equals("resource_disk_control_line_tier1")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGiftResourceManagerConfig.diskRedLine = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 864660312:
                        if (!LJJ.equals("resource_disk_control_line_tier2")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGiftResourceManagerConfig.diskYellowLine = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1950421635:
                        if (!LJJ.equals("resource_expire_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGiftResourceManagerConfig.resourceExpireDuration = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2127397551:
                        if (!LJJ.equals("enable_delete_all_resources")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveGiftResourceManagerConfig.enableDeleteAllResource = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return liveGiftResourceManagerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveGiftResourceManagerConfig liveGiftResourceManagerConfig) {
        LiveGiftResourceManagerConfig liveGiftResourceManagerConfig2 = liveGiftResourceManagerConfig;
        o.LJIIIZ(writer, "writer");
        if (liveGiftResourceManagerConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("resource_preload_strategy");
        C79062V1e.LJFF(liveGiftResourceManagerConfig2.resourcePreloadStrategy, writer, "resource_expire_duration");
        C79062V1e.LJFF(liveGiftResourceManagerConfig2.resourceExpireDuration, writer, "resource_disk_limitation_enable");
        writer.LJJIII(liveGiftResourceManagerConfig2.resourceDiskLimitationEnable);
        writer.LJI("resource_disk_control_line_tier1");
        writer.LJIJ(liveGiftResourceManagerConfig2.diskRedLine);
        writer.LJI("resource_disk_control_line_tier2");
        writer.LJIJ(liveGiftResourceManagerConfig2.diskYellowLine);
        writer.LJI("enable_delete_unused_resources");
        writer.LJJIII(liveGiftResourceManagerConfig2.enableDeleteUnusedResource);
        writer.LJI("enable_delete_all_resources");
        writer.LJJIII(liveGiftResourceManagerConfig2.enableDeleteAllResource);
        writer.LJI("thread_crash_fix");
        writer.LJJIII(liveGiftResourceManagerConfig2.threadCrashFix);
        writer.LJFF();
    }
}
