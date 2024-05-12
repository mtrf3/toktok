package com.bytedance.android.livesdk.livesetting.other;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C76965UIn;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.other.LiveBottomRightLikeBehaviorSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LiveBottomRightLikeBehaviorSetting_LikeBehaviorConfig_OptTypeAdapter extends TypeAdapter<LiveBottomRightLikeBehaviorSetting.LikeBehaviorConfig> {
    public final Gson LIZ;

    public LiveBottomRightLikeBehaviorSetting_LikeBehaviorConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveBottomRightLikeBehaviorSetting.LikeBehaviorConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveBottomRightLikeBehaviorSetting.LikeBehaviorConfig likeBehaviorConfig = new LiveBottomRightLikeBehaviorSetting.LikeBehaviorConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1965821472:
                        if (!LJJ.equals("right_bottom_others_appear_animation_alpha_end")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_others_appear_animation_alpha_end = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1793517249:
                        if (!LJJ.equals("right_bottom_others_disappear_animation_alpha_start")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_others_disappear_animation_alpha_start = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1680704195:
                        if (!LJJ.equals("right_bottom_others_animation_bezier_enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_others_animation_bezier_enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1552276618:
                        if (!LJJ.equals("right_bottom_self_animation_time_ratio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_self_animation_time_ratio = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1065393153:
                        if (!LJJ.equals("right_bottom_others_animation_time_ratio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_others_animation_time_ratio = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -253707225:
                        if (!LJJ.equals("right_bottom_others_animation_distance_ratio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_others_animation_distance_ratio = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 265607528:
                        if (!LJJ.equals("right_bottom_self_disappear_animation_alpha_start")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_self_disappear_animation_alpha_start = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 644284455:
                        if (!LJJ.equals("right_bottom_others_appear_animation_alpha_start")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_others_appear_animation_alpha_start = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 663288855:
                        if (!LJJ.equals("right_bottom_self_appear_animation_alpha_end")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_self_appear_animation_alpha_end = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 686387448:
                        if (!LJJ.equals("right_bottom_others_disappear_animation_alpha_end")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_others_disappear_animation_alpha_end = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1357965342:
                        if (!LJJ.equals("right_bottom_self_animation_distance_ratio")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_self_animation_distance_ratio = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1488529249:
                        if (!LJJ.equals("right_bottom_self_disappear_animation_alpha_end")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_self_disappear_animation_alpha_end = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1778538654:
                        if (!LJJ.equals("right_bottom_self_appear_animation_alpha_start")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_self_appear_animation_alpha_start = (float) reader.LJIJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1973515878:
                        if (!LJJ.equals("right_bottom_self_animation_bezier_enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            likeBehaviorConfig.right_bottom_self_animation_bezier_enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
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
        return likeBehaviorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveBottomRightLikeBehaviorSetting.LikeBehaviorConfig likeBehaviorConfig) {
        LiveBottomRightLikeBehaviorSetting.LikeBehaviorConfig likeBehaviorConfig2 = likeBehaviorConfig;
        o.LJIIIZ(writer, "writer");
        if (likeBehaviorConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("right_bottom_others_appear_animation_alpha_start");
        C76965UIn.LIZIZ(likeBehaviorConfig2.right_bottom_others_appear_animation_alpha_start, writer, "right_bottom_others_appear_animation_alpha_end");
        C76965UIn.LIZIZ(likeBehaviorConfig2.right_bottom_others_appear_animation_alpha_end, writer, "right_bottom_others_disappear_animation_alpha_start");
        C76965UIn.LIZIZ(likeBehaviorConfig2.right_bottom_others_disappear_animation_alpha_start, writer, "right_bottom_others_disappear_animation_alpha_end");
        C76965UIn.LIZIZ(likeBehaviorConfig2.right_bottom_others_disappear_animation_alpha_end, writer, "right_bottom_others_animation_bezier_enable");
        writer.LJJIII(likeBehaviorConfig2.right_bottom_others_animation_bezier_enable);
        writer.LJI("right_bottom_others_animation_distance_ratio");
        C76965UIn.LIZIZ(likeBehaviorConfig2.right_bottom_others_animation_distance_ratio, writer, "right_bottom_others_animation_time_ratio");
        C76965UIn.LIZIZ(likeBehaviorConfig2.right_bottom_others_animation_time_ratio, writer, "right_bottom_self_disappear_animation_alpha_start");
        C76965UIn.LIZIZ(likeBehaviorConfig2.right_bottom_self_disappear_animation_alpha_start, writer, "right_bottom_self_disappear_animation_alpha_end");
        C76965UIn.LIZIZ(likeBehaviorConfig2.right_bottom_self_disappear_animation_alpha_end, writer, "right_bottom_self_appear_animation_alpha_start");
        C76965UIn.LIZIZ(likeBehaviorConfig2.right_bottom_self_appear_animation_alpha_start, writer, "right_bottom_self_appear_animation_alpha_end");
        C76965UIn.LIZIZ(likeBehaviorConfig2.right_bottom_self_appear_animation_alpha_end, writer, "right_bottom_self_animation_bezier_enable");
        writer.LJJIII(likeBehaviorConfig2.right_bottom_self_animation_bezier_enable);
        writer.LJI("right_bottom_self_animation_distance_ratio");
        C76965UIn.LIZIZ(likeBehaviorConfig2.right_bottom_self_animation_distance_ratio, writer, "right_bottom_self_animation_time_ratio");
        writer.LJIJJ(Float.valueOf(likeBehaviorConfig2.right_bottom_self_animation_time_ratio));
        writer.LJFF();
    }
}
