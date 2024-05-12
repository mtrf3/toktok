package com.bytedance.android.livesdk.chatroom.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LikeConfig_OptTypeAdapter extends TypeAdapter<LikeConfig> {
    public final Gson LIZ;

    public LikeConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LikeConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LikeConfig likeConfig = new LikeConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1370468909:
                        if (!LJJ.equals("digg_send_likes_tap_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeConfig.sendLikesTapCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -777526519:
                        if (!LJJ.equals("like_style")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeConfig.likeStyle = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 157145888:
                        if (!LJJ.equals("digg_progress_max_tap_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeConfig.fullProgressTapCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 200905162:
                        if (!LJJ.equals("digg_others_flow_anim_repeat_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeConfig.othersFlowAnimRepeatCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 903541766:
                        if (!LJJ.equals("digg_icon_force_heart")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeConfig.iconForceHeart = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1540214857:
                        if (!LJJ.equals("digg_show_progress_tap_count")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeConfig.showProgressTapCount = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1754875396:
                        if (!LJJ.equals("digg_others_flow_anim_delay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeConfig.othersFlowAnimDelay = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2147434427:
                        if (!LJJ.equals("digg_tap_interval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeConfig.tapInterval = reader.LJIJJ();
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
        return likeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LikeConfig likeConfig) {
        LikeConfig likeConfig2 = likeConfig;
        o.LJIIIZ(writer, "writer");
        if (likeConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("like_style");
        C79062V1e.LJFF(likeConfig2.likeStyle, writer, "digg_tap_interval");
        writer.LJIJ(likeConfig2.tapInterval);
        writer.LJI("digg_send_likes_tap_count");
        C79062V1e.LJFF(likeConfig2.sendLikesTapCount, writer, "digg_show_progress_tap_count");
        C79062V1e.LJFF(likeConfig2.showProgressTapCount, writer, "digg_progress_max_tap_count");
        C79062V1e.LJFF(likeConfig2.fullProgressTapCount, writer, "digg_others_flow_anim_repeat_count");
        C79062V1e.LJFF(likeConfig2.othersFlowAnimRepeatCount, writer, "digg_icon_force_heart");
        writer.LJJIII(likeConfig2.iconForceHeart);
        writer.LJI("digg_others_flow_anim_delay");
        writer.LJIJ(likeConfig2.othersFlowAnimDelay);
        writer.LJFF();
    }
}
