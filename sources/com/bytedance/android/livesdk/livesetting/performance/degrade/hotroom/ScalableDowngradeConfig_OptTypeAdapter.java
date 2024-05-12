package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ScalableDowngradeConfig_OptTypeAdapter extends TypeAdapter<ScalableDowngradeConfig> {
    public final Gson LIZ;

    public ScalableDowngradeConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ScalableDowngradeConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        ScalableDowngradeConfig scalableDowngradeConfig = new ScalableDowngradeConfig(false, false, 0, false, false, false, false, false, false, false, 0L, 0, 0, 0, 0, 0, 65535, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2067636382:
                        if (!LJJ.equals("disable_gift_tray_anim")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setDisableGiftTrayAnim(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1804615242:
                        if (!LJJ.equals("level_serious_fps_start")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setLevelSeriousFpsStart(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1613626395:
                        if (!LJJ.equals("disable_public_screen_anim")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setDisablePublicScreenAnim(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1416391533:
                        if (!LJJ.equals("level_serious_fps")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setLevelSeriousFps(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1216843956:
                        if (!LJJ.equals("disable_apm_log")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setDisableApmLog(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1196722697:
                        if (!LJJ.equals("disable_public_screen_avatar_preload")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setDisablePublicAvatarPreload(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -986455494:
                        if (!LJJ.equals("disable_alog")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setDisableAlog(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -672281809:
                        if (!LJJ.equals("level_serious_fps_end")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setLevelSeriousFpsEnd(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -502888514:
                        if (!LJJ.equals("msg_qps_heavy")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setMsgQpsHeavy(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -294682637:
                        if (!LJJ.equals("disable_other_like_anim")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setDisableOtherLikeAnim(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -109284052:
                        if (!LJJ.equals("is_enabled")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setEnabled(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 551154991:
                        if (!LJJ.equals("disable_gift_notify_anim")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setDisableGiftNotifyAnim(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1071439174:
                        if (!LJJ.equals("public_screen_refresh_interval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setPublicScreenRefreshInterval(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1222493283:
                        if (!LJJ.equals("disable_banner")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setDisableBanner(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1726433176:
                        if (!LJJ.equals("online_audience_refresh_interval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setOnlineAudienceRefreshInterval(reader.LJIJJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1908780162:
                        if (!LJJ.equals("hot_temperature")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            scalableDowngradeConfig.setHotTemperature(reader.LJIJI());
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
        return scalableDowngradeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, ScalableDowngradeConfig scalableDowngradeConfig) {
        ScalableDowngradeConfig scalableDowngradeConfig2 = scalableDowngradeConfig;
        o.LJIIIZ(writer, "writer");
        if (scalableDowngradeConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("is_enabled");
        writer.LJJIII(scalableDowngradeConfig2.isEnabled());
        writer.LJI("disable_public_screen_anim");
        writer.LJJIII(scalableDowngradeConfig2.getDisablePublicScreenAnim());
        writer.LJI("public_screen_refresh_interval");
        writer.LJIJJ(Integer.valueOf(scalableDowngradeConfig2.getPublicScreenRefreshInterval()));
        writer.LJI("disable_public_screen_avatar_preload");
        writer.LJJIII(scalableDowngradeConfig2.getDisablePublicAvatarPreload());
        writer.LJI("disable_other_like_anim");
        writer.LJJIII(scalableDowngradeConfig2.getDisableOtherLikeAnim());
        writer.LJI("disable_banner");
        writer.LJJIII(scalableDowngradeConfig2.getDisableBanner());
        writer.LJI("disable_alog");
        writer.LJJIII(scalableDowngradeConfig2.getDisableAlog());
        writer.LJI("disable_apm_log");
        writer.LJJIII(scalableDowngradeConfig2.getDisableApmLog());
        writer.LJI("disable_gift_tray_anim");
        writer.LJJIII(scalableDowngradeConfig2.getDisableGiftTrayAnim());
        writer.LJI("disable_gift_notify_anim");
        writer.LJJIII(scalableDowngradeConfig2.getDisableGiftNotifyAnim());
        writer.LJI("online_audience_refresh_interval");
        writer.LJIJ(scalableDowngradeConfig2.getOnlineAudienceRefreshInterval());
        writer.LJI("hot_temperature");
        writer.LJIJJ(Integer.valueOf(scalableDowngradeConfig2.getHotTemperature()));
        writer.LJI("level_serious_fps_start");
        writer.LJIJJ(Integer.valueOf(scalableDowngradeConfig2.getLevelSeriousFpsStart()));
        writer.LJI("level_serious_fps_end");
        writer.LJIJJ(Integer.valueOf(scalableDowngradeConfig2.getLevelSeriousFpsEnd()));
        writer.LJI("level_serious_fps");
        writer.LJIJJ(Integer.valueOf(scalableDowngradeConfig2.getLevelSeriousFps()));
        writer.LJI("msg_qps_heavy");
        writer.LJIJJ(Integer.valueOf(scalableDowngradeConfig2.getMsgQpsHeavy()));
        writer.LJFF();
    }
}
