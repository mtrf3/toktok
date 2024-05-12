package com.bytedance.android.livesdk.live.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class LivePreviewCardMaskConfig_OptTypeAdapter extends TypeAdapter<LivePreviewCardMaskConfig> {
    public final Gson LIZ;

    public LivePreviewCardMaskConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePreviewCardMaskConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LivePreviewCardMaskConfig livePreviewCardMaskConfig = new LivePreviewCardMaskConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != 885586298) {
                    if (hashCode != 920600943) {
                        if (hashCode == 1877101707 && LJJ.equals("live_preview_card_bottom_mask_height")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                livePreviewCardMaskConfig.setBottomMaskHeight(reader.LJIJI());
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("live_preview_card_mask_top_optimized")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            livePreviewCardMaskConfig.setTopOptimized(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("live_preview_card_bottom_mask_alpha")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        livePreviewCardMaskConfig.setBottomMaskAlpha(reader.LJIJI());
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return livePreviewCardMaskConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LivePreviewCardMaskConfig livePreviewCardMaskConfig) {
        LivePreviewCardMaskConfig livePreviewCardMaskConfig2 = livePreviewCardMaskConfig;
        o.LJIIIZ(writer, "writer");
        if (livePreviewCardMaskConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_preview_card_bottom_mask_height");
        writer.LJIJJ(Integer.valueOf(livePreviewCardMaskConfig2.getBottomMaskHeight()));
        writer.LJI("live_preview_card_mask_top_optimized");
        writer.LJJIII(livePreviewCardMaskConfig2.getTopOptimized());
        writer.LJI("live_preview_card_bottom_mask_alpha");
        writer.LJIJJ(Integer.valueOf(livePreviewCardMaskConfig2.getBottomMaskAlpha()));
        writer.LJFF();
    }
}
