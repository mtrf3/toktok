package com.bytedance.android.livesdk.livesetting.performance;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class LiveFluencySupportSample_OptTypeAdapter extends TypeAdapter<LiveFluencySupportSample> {
    public LiveFluencySupportSample_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveFluencySupportSample read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveFluencySupportSample liveFluencySupportSample = new LiveFluencySupportSample(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 67108863, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2129721603:
                        if (!LJJ.equals("panel_gift_slide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.panelGiftSlide = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1996340539:
                        if (!LJJ.equals("panel_broadcast_link_slide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.panelBroadcastLinkSlide = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1826626983:
                        if (!LJJ.equals("panel_public_screen_auto_slide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.panelPublicScreenAutoSlide = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1614317775:
                        if (!LJJ.equals("watch_period")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.watchPeriod = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1352547195:
                        if (!LJJ.equals("pk_period")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.pkPeriod = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1172181026:
                        if (!LJJ.equals("panel_effect_slide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.panelEffectSlide = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -840534151:
                        if (!LJJ.equals("panel_public_screen_slide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.panelPublicScreenSlide = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -641727696:
                        if (!LJJ.equals("rank_show")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.rankShow = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -450928897:
                        if (!LJJ.equals("broadcast_period")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.broadcastPeriod = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -103392873:
                        if (!LJJ.equals("panel_multi_guest")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.panelMultiGuest = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 195105009:
                        if (!LJJ.equals("panel_hourly_rank_slide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.panelHourlyRankSlide = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 318783000:
                        if (!LJJ.equals("preview_period")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.previewPeriod = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 327423979:
                        if (!LJJ.equals("audience_link_period")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.audienceLinkPeriod = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 481117549:
                        if (!LJJ.equals("link_mic_role_period")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.linkMicRolePeriod = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 570497251:
                        if (!LJJ.equals("gift_play")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.giftPlay = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 651550345:
                        if (!LJJ.equals("panel_extended_public_screen_slide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.panelExtendedPublicScreenSlide = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 693131169:
                        if (!LJJ.equals("preview_enter")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.previewEnter = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 778308916:
                        if (!LJJ.equals("panel_sticker_slide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.panelStickerSlide = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1184962408:
                        if (!LJJ.equals("watch_enter")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.watchEnter = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1197821505:
                        if (!LJJ.equals("watch_slide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.watchSlide = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1345501317:
                        if (!LJJ.equals("panel_filter_slide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.panelFilterSlide = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1443259721:
                        if (!LJJ.equals("panel_extended_public_screen_auto_slide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.panelExtendedPublicScreenAutoSlide = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1494082344:
                        if (!LJJ.equals("broadcast_link_period")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.broadcastLinkPeriod = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1776680410:
                        if (!LJJ.equals("broadcast_enter")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.broadcastEnter = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2071145097:
                        if (!LJJ.equals("panel_beauty_slide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.panelBeautySlide = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 2092999878:
                        if (!LJJ.equals("panel_sound_slide")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveFluencySupportSample.panelSoundSlide = reader.LJIJI();
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
        return liveFluencySupportSample;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveFluencySupportSample liveFluencySupportSample) {
        LiveFluencySupportSample liveFluencySupportSample2 = liveFluencySupportSample;
        o.LJIIIZ(writer, "writer");
        if (liveFluencySupportSample2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("watch_enter");
        C79062V1e.LJFF(liveFluencySupportSample2.watchEnter, writer, "watch_slide");
        C79062V1e.LJFF(liveFluencySupportSample2.watchSlide, writer, "watch_period");
        C79062V1e.LJFF(liveFluencySupportSample2.watchPeriod, writer, "broadcast_enter");
        C79062V1e.LJFF(liveFluencySupportSample2.broadcastEnter, writer, "broadcast_period");
        C79062V1e.LJFF(liveFluencySupportSample2.broadcastPeriod, writer, "preview_enter");
        C79062V1e.LJFF(liveFluencySupportSample2.previewEnter, writer, "preview_period");
        C79062V1e.LJFF(liveFluencySupportSample2.previewPeriod, writer, "broadcast_link_period");
        C79062V1e.LJFF(liveFluencySupportSample2.broadcastLinkPeriod, writer, "audience_link_period");
        C79062V1e.LJFF(liveFluencySupportSample2.audienceLinkPeriod, writer, "pk_period");
        C79062V1e.LJFF(liveFluencySupportSample2.pkPeriod, writer, "gift_play");
        C79062V1e.LJFF(liveFluencySupportSample2.giftPlay, writer, "panel_gift_slide");
        C79062V1e.LJFF(liveFluencySupportSample2.panelGiftSlide, writer, "panel_hourly_rank_slide");
        C79062V1e.LJFF(liveFluencySupportSample2.panelHourlyRankSlide, writer, "panel_broadcast_link_slide");
        C79062V1e.LJFF(liveFluencySupportSample2.panelBroadcastLinkSlide, writer, "panel_public_screen_slide");
        C79062V1e.LJFF(liveFluencySupportSample2.panelPublicScreenSlide, writer, "panel_public_screen_auto_slide");
        C79062V1e.LJFF(liveFluencySupportSample2.panelPublicScreenAutoSlide, writer, "panel_extended_public_screen_slide");
        C79062V1e.LJFF(liveFluencySupportSample2.panelExtendedPublicScreenSlide, writer, "panel_extended_public_screen_auto_slide");
        C79062V1e.LJFF(liveFluencySupportSample2.panelExtendedPublicScreenAutoSlide, writer, "panel_beauty_slide");
        C79062V1e.LJFF(liveFluencySupportSample2.panelBeautySlide, writer, "panel_filter_slide");
        C79062V1e.LJFF(liveFluencySupportSample2.panelFilterSlide, writer, "panel_sticker_slide");
        C79062V1e.LJFF(liveFluencySupportSample2.panelStickerSlide, writer, "panel_sound_slide");
        C79062V1e.LJFF(liveFluencySupportSample2.panelSoundSlide, writer, "panel_multi_guest");
        C79062V1e.LJFF(liveFluencySupportSample2.panelMultiGuest, writer, "link_mic_role_period");
        C79062V1e.LJFF(liveFluencySupportSample2.linkMicRolePeriod, writer, "rank_show");
        C79062V1e.LJFF(liveFluencySupportSample2.rankShow, writer, "panel_effect_slide");
        C77339UWx.LJFF(liveFluencySupportSample2.panelEffectSlide, writer);
    }
}
