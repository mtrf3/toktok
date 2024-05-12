package com.bytedance.android.livesdk.livesetting.other;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.other.LiveSelfLinkedLikeBehaviorSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSelfLinkedLikeBehaviorSetting_LikeBehaviorConfig_OptTypeAdapter extends TypeAdapter<LiveSelfLinkedLikeBehaviorSetting.LikeBehaviorConfig> {
    public final Gson LIZ;

    public LiveSelfLinkedLikeBehaviorSetting_LikeBehaviorConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSelfLinkedLikeBehaviorSetting.LikeBehaviorConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveSelfLinkedLikeBehaviorSetting.LikeBehaviorConfig likeBehaviorConfig = new LiveSelfLinkedLikeBehaviorSetting.LikeBehaviorConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "self_like_linked_animator_enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    likeBehaviorConfig.self_like_linked_animator_enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "self_like_lottie_animation_enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    likeBehaviorConfig.self_like_lottie_animation_enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return likeBehaviorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveSelfLinkedLikeBehaviorSetting.LikeBehaviorConfig likeBehaviorConfig) {
        LiveSelfLinkedLikeBehaviorSetting.LikeBehaviorConfig likeBehaviorConfig2 = likeBehaviorConfig;
        o.LJIIIZ(writer, "writer");
        if (likeBehaviorConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("self_like_linked_animator_enable");
        writer.LJJIII(likeBehaviorConfig2.self_like_linked_animator_enable);
        writer.LJI("self_like_lottie_animation_enable");
        writer.LJJIII(likeBehaviorConfig2.self_like_lottie_animation_enable);
        writer.LJFF();
    }
}
