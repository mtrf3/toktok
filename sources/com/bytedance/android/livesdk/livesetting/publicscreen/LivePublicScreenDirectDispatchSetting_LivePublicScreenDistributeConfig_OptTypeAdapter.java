package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C76965UIn;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenDirectDispatchSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LivePublicScreenDirectDispatchSetting_LivePublicScreenDistributeConfig_OptTypeAdapter extends TypeAdapter<LivePublicScreenDirectDispatchSetting.LivePublicScreenDistributeConfig> {
    public final Gson LIZ;

    public LivePublicScreenDirectDispatchSetting_LivePublicScreenDistributeConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePublicScreenDirectDispatchSetting.LivePublicScreenDistributeConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LivePublicScreenDirectDispatchSetting.LivePublicScreenDistributeConfig livePublicScreenDistributeConfig = new LivePublicScreenDirectDispatchSetting.LivePublicScreenDistributeConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1251037520:
                        if (!LJJ.equals("live_public_screen_min_msg_threshold")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenDistributeConfig.live_public_screen_min_msg_threshold = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1038746637:
                        if (!LJJ.equals("live_public_screen_reset_timer_after_direct_dispatch")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenDistributeConfig.live_public_screen_reset_timer_after_direct_dispatch = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1082920858:
                        if (!LJJ.equals("live_public_screen_dispatch_interval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenDistributeConfig.live_public_screen_dispatch_interval = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2053636504:
                        if (!LJJ.equals("live_public_screen_dispatch_enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePublicScreenDistributeConfig.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return livePublicScreenDistributeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LivePublicScreenDirectDispatchSetting.LivePublicScreenDistributeConfig livePublicScreenDistributeConfig) {
        LivePublicScreenDirectDispatchSetting.LivePublicScreenDistributeConfig livePublicScreenDistributeConfig2 = livePublicScreenDistributeConfig;
        o.LJIIIZ(writer, "writer");
        if (livePublicScreenDistributeConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_public_screen_dispatch_enable");
        writer.LJJIII(livePublicScreenDistributeConfig2.enable);
        writer.LJI("live_public_screen_dispatch_interval");
        C76965UIn.LIZIZ(livePublicScreenDistributeConfig2.live_public_screen_dispatch_interval, writer, "live_public_screen_min_msg_threshold");
        C79062V1e.LJFF(livePublicScreenDistributeConfig2.live_public_screen_min_msg_threshold, writer, "live_public_screen_reset_timer_after_direct_dispatch");
        writer.LJJIII(livePublicScreenDistributeConfig2.live_public_screen_reset_timer_after_direct_dispatch);
        writer.LJFF();
    }
}
