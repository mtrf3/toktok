package com.bytedance.android.livesdk.livesetting.message;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessageWsTimeSyncConfig_OptTypeAdapter extends TypeAdapter<LiveMessageWsTimeSyncConfig> {
    public final Gson LIZ;

    public LiveMessageWsTimeSyncConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessageWsTimeSyncConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMessageWsTimeSyncConfig liveMessageWsTimeSyncConfig = new LiveMessageWsTimeSyncConfig(0L, false, false, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1031518764) {
                    if (hashCode != -67026251) {
                        if (hashCode == 950325816 && LJJ.equals("send_hb_after_ws_connect")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveMessageWsTimeSyncConfig.setSendHBAfterWsConnect(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("valid_ws_request_interval")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessageWsTimeSyncConfig.setValidWsRequestInterval(reader.LJIJJ());
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("opt_hb_time_sync")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveMessageWsTimeSyncConfig.setOptHBTimeSync(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveMessageWsTimeSyncConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMessageWsTimeSyncConfig liveMessageWsTimeSyncConfig) {
        LiveMessageWsTimeSyncConfig liveMessageWsTimeSyncConfig2 = liveMessageWsTimeSyncConfig;
        o.LJIIIZ(writer, "writer");
        if (liveMessageWsTimeSyncConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("valid_ws_request_interval");
        writer.LJIJ(liveMessageWsTimeSyncConfig2.getValidWsRequestInterval());
        writer.LJI("opt_hb_time_sync");
        writer.LJJIII(liveMessageWsTimeSyncConfig2.getOptHBTimeSync());
        writer.LJI("send_hb_after_ws_connect");
        writer.LJJIII(liveMessageWsTimeSyncConfig2.getSendHBAfterWsConnect());
        writer.LJFF();
    }
}
