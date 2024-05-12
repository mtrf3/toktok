package com.bytedance.android.livesdk.livesetting.performance;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LikeAnimationOptModel_OptTypeAdapter extends TypeAdapter<LikeAnimationOptModel> {
    public final Gson LIZ;

    public LikeAnimationOptModel_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LikeAnimationOptModel read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LikeAnimationOptModel likeAnimationOptModel = new LikeAnimationOptModel(false, 0, false, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1466104494) {
                    if (hashCode != 153379590) {
                        if (hashCode == 1402535903 && LJJ.equals("like_animation_fluency_opt")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                likeAnimationOptModel.likeAnimationFluencyOpt = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("like_animation_fps")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeAnimationOptModel.likeAnimationFps = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("like_animation_dynamic_adjust")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        likeAnimationOptModel.likeAnimationDynamicAdjust = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return likeAnimationOptModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LikeAnimationOptModel likeAnimationOptModel) {
        LikeAnimationOptModel likeAnimationOptModel2 = likeAnimationOptModel;
        o.LJIIIZ(writer, "writer");
        if (likeAnimationOptModel2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("like_animation_fluency_opt");
        writer.LJJIII(likeAnimationOptModel2.likeAnimationFluencyOpt);
        writer.LJI("like_animation_fps");
        C79062V1e.LJFF(likeAnimationOptModel2.likeAnimationFps, writer, "like_animation_dynamic_adjust");
        writer.LJJIII(likeAnimationOptModel2.likeAnimationDynamicAdjust);
        writer.LJFF();
    }
}
