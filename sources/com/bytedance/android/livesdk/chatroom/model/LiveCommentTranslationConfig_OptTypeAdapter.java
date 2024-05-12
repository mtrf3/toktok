package com.bytedance.android.livesdk.chatroom.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveCommentTranslationConfig_OptTypeAdapter extends TypeAdapter<LiveCommentTranslationConfig> {
    public final Gson LIZ;

    public LiveCommentTranslationConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveCommentTranslationConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveCommentTranslationConfig liveCommentTranslationConfig = new LiveCommentTranslationConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1620134352:
                        if (!LJJ.equals("guidance_total_display_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveCommentTranslationConfig.guidanceTotalDisplayCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1609594047:
                        if (!LJJ.equals("enabled")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveCommentTranslationConfig.enabled = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -823484347:
                        if (!LJJ.equals("guidance_daily_display_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveCommentTranslationConfig.guidanceDailyDisplayCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1547859446:
                        if (!LJJ.equals("hot_live_message_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveCommentTranslationConfig.hotLiveMessageCount = reader.LJIJI();
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
        return liveCommentTranslationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveCommentTranslationConfig liveCommentTranslationConfig) {
        LiveCommentTranslationConfig liveCommentTranslationConfig2 = liveCommentTranslationConfig;
        o.LJIIIZ(writer, "writer");
        if (liveCommentTranslationConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enabled");
        writer.LJJIII(liveCommentTranslationConfig2.enabled);
        writer.LJI("guidance_daily_display_count");
        C79062V1e.LJFF(liveCommentTranslationConfig2.guidanceDailyDisplayCount, writer, "guidance_total_display_count");
        C79062V1e.LJFF(liveCommentTranslationConfig2.guidanceTotalDisplayCount, writer, "hot_live_message_count");
        C77339UWx.LJFF(liveCommentTranslationConfig2.hotLiveMessageCount, writer);
    }
}
