package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AnimationConfig_OptTypeAdapter extends TypeAdapter<AnimationConfig> {
    public final Gson LIZ;

    public AnimationConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AnimationConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        AnimationConfig animationConfig = new AnimationConfig(false, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "start_anim_opt")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    animationConfig.start_anim_opt = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "punish_anim_use_lottie")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    animationConfig.punish_anim_use_lottie = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return animationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, AnimationConfig animationConfig) {
        AnimationConfig animationConfig2 = animationConfig;
        o.LJIIIZ(writer, "writer");
        if (animationConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("start_anim_opt");
        writer.LJJIII(animationConfig2.start_anim_opt);
        writer.LJI("punish_anim_use_lottie");
        writer.LJJIII(animationConfig2.punish_anim_use_lottie);
        writer.LJFF();
    }
}
