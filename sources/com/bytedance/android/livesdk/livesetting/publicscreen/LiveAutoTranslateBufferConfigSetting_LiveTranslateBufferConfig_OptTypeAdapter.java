package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateBufferConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveAutoTranslateBufferConfigSetting_LiveTranslateBufferConfig_OptTypeAdapter extends TypeAdapter<LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig> {
    public LiveAutoTranslateBufferConfigSetting_LiveTranslateBufferConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig liveTranslateBufferConfig = new LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -2011470864) {
                    if (hashCode != -1840714798) {
                        if (hashCode == -11408869 && LJJ.equals("live_message_auto_translate_request_timeout")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                liveTranslateBufferConfig.messageAutoTranslateRequestTimeout = reader.LJIJJ();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("live_auto_translate_buffer_size")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveTranslateBufferConfig.autoTranslateBufferSize = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("live_auto_translate_buffer_timeout")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        liveTranslateBufferConfig.autoTranslateBufferTimeout = reader.LJIJJ();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveTranslateBufferConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig liveTranslateBufferConfig) {
        LiveAutoTranslateBufferConfigSetting.LiveTranslateBufferConfig liveTranslateBufferConfig2 = liveTranslateBufferConfig;
        o.LJIIIZ(writer, "writer");
        if (liveTranslateBufferConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_auto_translate_buffer_size");
        C79062V1e.LJFF(liveTranslateBufferConfig2.autoTranslateBufferSize, writer, "live_auto_translate_buffer_timeout");
        writer.LJIJ(liveTranslateBufferConfig2.autoTranslateBufferTimeout);
        writer.LJI("live_message_auto_translate_request_timeout");
        writer.LJIJ(liveTranslateBufferConfig2.messageAutoTranslateRequestTimeout);
        writer.LJFF();
    }
}
