package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestLiveShowConfig_OptTypeAdapter extends TypeAdapter<MultiGuestLiveShowConfig> {
    public MultiGuestLiveShowConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestLiveShowConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MultiGuestLiveShowConfig multiGuestLiveShowConfig = new MultiGuestLiveShowConfig(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2135938324:
                        if (!LJJ.equals("start_animation_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            multiGuestLiveShowConfig.startAnimationDuration = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -842868118:
                        if (!LJJ.equals("banner_refresh_shuffle_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            multiGuestLiveShowConfig.bannerRefreshShuffleTime = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -506085817:
                        if (!LJJ.equals("mute_audio_im_back_up")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            multiGuestLiveShowConfig.muteAudioImBackUp = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -393032391:
                        if (!LJJ.equals("new_version")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            multiGuestLiveShowConfig.newVersion = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -214557341:
                        if (!LJJ.equals("initial_allow_open_mic")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            multiGuestLiveShowConfig.initialAllowOpenMic = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 179834187:
                        if (!LJJ.equals("calibrate_content_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            multiGuestLiveShowConfig.calibrateContentTime = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 233228668:
                        if (!LJJ.equals("animation_downgrade_enabled")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            multiGuestLiveShowConfig.animationDowngradeEnabled = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 968952645:
                        if (!LJJ.equals("enable_calibrate_content")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            multiGuestLiveShowConfig.enableCalibrateContent = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1585635007:
                        if (!LJJ.equals("audience_main_switch")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            multiGuestLiveShowConfig.audienceMainSwitch = reader.LJIJI();
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
        return multiGuestLiveShowConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MultiGuestLiveShowConfig multiGuestLiveShowConfig) {
        MultiGuestLiveShowConfig multiGuestLiveShowConfig2 = multiGuestLiveShowConfig;
        o.LJIIIZ(writer, "writer");
        if (multiGuestLiveShowConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("audience_main_switch");
        C79062V1e.LJFF(multiGuestLiveShowConfig2.audienceMainSwitch, writer, "initial_allow_open_mic");
        C79062V1e.LJFF(multiGuestLiveShowConfig2.initialAllowOpenMic, writer, "new_version");
        C79062V1e.LJFF(multiGuestLiveShowConfig2.newVersion, writer, "banner_refresh_shuffle_time");
        C79062V1e.LJFF(multiGuestLiveShowConfig2.bannerRefreshShuffleTime, writer, "calibrate_content_time");
        C79062V1e.LJFF(multiGuestLiveShowConfig2.calibrateContentTime, writer, "animation_downgrade_enabled");
        C79062V1e.LJFF(multiGuestLiveShowConfig2.animationDowngradeEnabled, writer, "start_animation_duration");
        C79062V1e.LJFF(multiGuestLiveShowConfig2.startAnimationDuration, writer, "enable_calibrate_content");
        C79062V1e.LJFF(multiGuestLiveShowConfig2.enableCalibrateContent, writer, "mute_audio_im_back_up");
        C77339UWx.LJFF(multiGuestLiveShowConfig2.muteAudioImBackUp, writer);
    }
}
