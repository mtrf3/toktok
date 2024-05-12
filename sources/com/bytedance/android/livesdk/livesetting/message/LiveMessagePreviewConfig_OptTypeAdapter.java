package com.bytedance.android.livesdk.livesetting.message;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveMessagePreviewConfig_OptTypeAdapter extends TypeAdapter<LiveMessagePreviewConfig> {
    public final Gson LIZ;

    public LiveMessagePreviewConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessagePreviewConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMessagePreviewConfig liveMessagePreviewConfig = new LiveMessagePreviewConfig(false, false, 0L, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -2085426228) {
                    if (hashCode != -1777082650) {
                        if (hashCode == -702572213 && LJJ.equals("enable_message")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveMessagePreviewConfig.setEnableMessage(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("stop_disconnect_ws_delay")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessagePreviewConfig.setStopDisconnectWsDelay(reader.LJIJJ());
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("start_message_instant")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveMessagePreviewConfig.setStartMessageInstant(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveMessagePreviewConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMessagePreviewConfig liveMessagePreviewConfig) {
        LiveMessagePreviewConfig liveMessagePreviewConfig2 = liveMessagePreviewConfig;
        o.LJIIIZ(writer, "writer");
        if (liveMessagePreviewConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_message");
        writer.LJJIII(liveMessagePreviewConfig2.getEnableMessage());
        writer.LJI("start_message_instant");
        writer.LJJIII(liveMessagePreviewConfig2.getStartMessageInstant());
        writer.LJI("stop_disconnect_ws_delay");
        writer.LJIJ(liveMessagePreviewConfig2.getStopDisconnectWsDelay());
        writer.LJFF();
    }
}
