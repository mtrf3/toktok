package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageSyncSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LivePublicScreenMessageSyncSetting_LivePublicScreenMessageSyncConfig_OptTypeAdapter extends TypeAdapter<LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig> {
    public final Gson LIZ;

    public LivePublicScreenMessageSyncSetting_LivePublicScreenMessageSyncConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig livePublicScreenMessageSyncConfig = new LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig(false, false, 0L, 0L, 0L, 0L, 0L, 127, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1599740924:
                        if (!LJJ.equals("sync_delay_max")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenMessageSyncConfig.syncDelayMax = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1071361777:
                        if (!LJJ.equals("enable_message_sync")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenMessageSyncConfig.enableMessageSync = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -888173888:
                        if (!LJJ.equals("sei_delay_max")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenMessageSyncConfig.seiDelayMax = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -778390842:
                        if (!LJJ.equals("sync_delay_reduce")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenMessageSyncConfig.syncDelayReduce = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -758229480:
                        if (!LJJ.equals("enable_message_priority")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenMessageSyncConfig.enableMessagePriority = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -585170883:
                        if (!LJJ.equals("c2c_delay_max")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenMessageSyncConfig.c2cDelayMax = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2111878593:
                        if (!LJJ.equals("host_c2c_delay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenMessageSyncConfig.hostC2CDelay = reader.LJIJJ();
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
        return livePublicScreenMessageSyncConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig livePublicScreenMessageSyncConfig) {
        LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig livePublicScreenMessageSyncConfig2 = livePublicScreenMessageSyncConfig;
        o.LJIIIZ(writer, "writer");
        if (livePublicScreenMessageSyncConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_message_priority");
        writer.LJJIII(livePublicScreenMessageSyncConfig2.enableMessagePriority);
        writer.LJI("enable_message_sync");
        writer.LJJIII(livePublicScreenMessageSyncConfig2.enableMessageSync);
        writer.LJI("host_c2c_delay");
        writer.LJIJ(livePublicScreenMessageSyncConfig2.hostC2CDelay);
        writer.LJI("c2c_delay_max");
        writer.LJIJ(livePublicScreenMessageSyncConfig2.c2cDelayMax);
        writer.LJI("sei_delay_max");
        writer.LJIJ(livePublicScreenMessageSyncConfig2.seiDelayMax);
        writer.LJI("sync_delay_max");
        writer.LJIJ(livePublicScreenMessageSyncConfig2.syncDelayMax);
        writer.LJI("sync_delay_reduce");
        writer.LJIJ(livePublicScreenMessageSyncConfig2.syncDelayReduce);
        writer.LJFF();
    }
}
