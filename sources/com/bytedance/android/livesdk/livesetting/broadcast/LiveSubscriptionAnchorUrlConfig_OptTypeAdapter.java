package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveSubscriptionAnchorUrlConfig_OptTypeAdapter extends TypeAdapter<LiveSubscriptionAnchorUrlConfig> {
    public LiveSubscriptionAnchorUrlConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSubscriptionAnchorUrlConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveSubscriptionAnchorUrlConfig liveSubscriptionAnchorUrlConfig = new LiveSubscriptionAnchorUrlConfig(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1812985919:
                        if (!LJJ.equals("spotlight_intro")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                            liveSubscriptionAnchorUrlConfig.spotlightIntro = LJJIIZI;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1635521848:
                        if (!LJJ.equals("payout_unsupported_notice_popup")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI2 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                            liveSubscriptionAnchorUrlConfig.payoutUnsupportedNoticePopup = LJJIIZI2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1224287564:
                        if (!LJJ.equals("c2c_trans_guide_page")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI3 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI3, "reader.nextString()");
                            liveSubscriptionAnchorUrlConfig.c2cTransGuidePage = LJJIIZI3;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1000709633:
                        if (!LJJ.equals("subonly_music_intro")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI4 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI4, "reader.nextString()");
                            liveSubscriptionAnchorUrlConfig.subOnlyMusicIntro = LJJIIZI4;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -337085013:
                        if (!LJJ.equals("spotlight_faq")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI5 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI5, "reader.nextString()");
                            liveSubscriptionAnchorUrlConfig.spotlightFaq = LJJIIZI5;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 187935751:
                        if (!LJJ.equals("custom_price_management")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI6 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI6, "reader.nextString()");
                            liveSubscriptionAnchorUrlConfig.customPriceManagement = LJJIIZI6;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 375957870:
                        if (!LJJ.equals("anchor_subscribers_popup")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI7 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI7, "reader.nextString()");
                            liveSubscriptionAnchorUrlConfig.anchorSubscriberList = LJJIIZI7;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 573387114:
                        if (!LJJ.equals("emote_management")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI8 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI8, "reader.nextString()");
                            liveSubscriptionAnchorUrlConfig.emoteManagement = LJJIIZI8;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 584553057:
                        if (!LJJ.equals("pin_management_page")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI9 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI9, "reader.nextString()");
                            liveSubscriptionAnchorUrlConfig.pinManagementPage = LJJIIZI9;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 842839987:
                        if (!LJJ.equals("anchor_subscribe_entry")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI10 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI10, "reader.nextString()");
                            liveSubscriptionAnchorUrlConfig.anchorSubscribeEntry = LJJIIZI10;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 935211226:
                        if (!LJJ.equals("pin_management_intro")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI11 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI11, "reader.nextString()");
                            liveSubscriptionAnchorUrlConfig.pinManagementIntro = LJJIIZI11;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1979686495:
                        if (!LJJ.equals("badge_management")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            String LJJIIZI12 = reader.LJJIIZI();
                            o.LJIIIIZZ(LJJIIZI12, "reader.nextString()");
                            liveSubscriptionAnchorUrlConfig.badgeManagement = LJJIIZI12;
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
        return liveSubscriptionAnchorUrlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveSubscriptionAnchorUrlConfig liveSubscriptionAnchorUrlConfig) {
        LiveSubscriptionAnchorUrlConfig liveSubscriptionAnchorUrlConfig2 = liveSubscriptionAnchorUrlConfig;
        o.LJIIIZ(writer, "writer");
        if (liveSubscriptionAnchorUrlConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("emote_management");
        writer.LJJ(liveSubscriptionAnchorUrlConfig2.emoteManagement);
        writer.LJI("badge_management");
        writer.LJJ(liveSubscriptionAnchorUrlConfig2.badgeManagement);
        writer.LJI("c2c_trans_guide_page");
        writer.LJJ(liveSubscriptionAnchorUrlConfig2.c2cTransGuidePage);
        writer.LJI("payout_unsupported_notice_popup");
        writer.LJJ(liveSubscriptionAnchorUrlConfig2.payoutUnsupportedNoticePopup);
        writer.LJI("anchor_subscribers_popup");
        writer.LJJ(liveSubscriptionAnchorUrlConfig2.anchorSubscriberList);
        writer.LJI("anchor_subscribe_entry");
        writer.LJJ(liveSubscriptionAnchorUrlConfig2.anchorSubscribeEntry);
        writer.LJI("pin_management_page");
        writer.LJJ(liveSubscriptionAnchorUrlConfig2.pinManagementPage);
        writer.LJI("pin_management_intro");
        writer.LJJ(liveSubscriptionAnchorUrlConfig2.pinManagementIntro);
        writer.LJI("custom_price_management");
        writer.LJJ(liveSubscriptionAnchorUrlConfig2.customPriceManagement);
        writer.LJI("spotlight_faq");
        writer.LJJ(liveSubscriptionAnchorUrlConfig2.spotlightFaq);
        writer.LJI("spotlight_intro");
        writer.LJJ(liveSubscriptionAnchorUrlConfig2.spotlightIntro);
        writer.LJI("subonly_music_intro");
        writer.LJJ(liveSubscriptionAnchorUrlConfig2.subOnlyMusicIntro);
        writer.LJFF();
    }
}
