package com.bytedance.android.livesdk.livesetting.message;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessagePreloadConfig_OptTypeAdapter extends TypeAdapter<LiveMessagePreloadConfig> {
    public final Gson LIZ;

    public LiveMessagePreloadConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessagePreloadConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMessagePreloadConfig liveMessagePreloadConfig = new LiveMessagePreloadConfig(false, false, false, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1906611530) {
                    if (hashCode != -1466923809) {
                        if (hashCode == -1298848381 && LJJ.equals("enable")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveMessagePreloadConfig.setEnable(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("preload_after_ws_connected")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveMessagePreloadConfig.setPreloadAfterWSConnected(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("decode_message")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveMessagePreloadConfig.setDecodeMessage(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveMessagePreloadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMessagePreloadConfig liveMessagePreloadConfig) {
        LiveMessagePreloadConfig liveMessagePreloadConfig2 = liveMessagePreloadConfig;
        o.LJIIIZ(writer, "writer");
        if (liveMessagePreloadConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(liveMessagePreloadConfig2.getEnable());
        writer.LJI("decode_message");
        writer.LJJIII(liveMessagePreloadConfig2.getDecodeMessage());
        writer.LJI("preload_after_ws_connected");
        writer.LJJIII(liveMessagePreloadConfig2.getPreloadAfterWSConnected());
        writer.LJFF();
    }
}
