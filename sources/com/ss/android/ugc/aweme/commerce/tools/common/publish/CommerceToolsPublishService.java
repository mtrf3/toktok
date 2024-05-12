package com.ss.android.ugc.aweme.commerce.tools.common.publish;

import X.C164826dS;
import X.C164846dU;
import X.C40999G7f;
import X.C42478Glm;
import X.C58096Mr6;
import X.C60903NvH;
import X.C79004UzY;
import X.EnumC164816dR;
import X.GF4;
import X.H7R;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commerce.CommercialVideoInfo;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import defpackage.e1;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceToolsPublishService implements ICommerceToolsPublishService {
    public static ICommerceToolsPublishService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ICommerceToolsPublishService.class, false);
        if (LIZ != null) {
            return (ICommerceToolsPublishService) LIZ;
        }
        if (C58096Mr6.LLLFZ == null) {
            synchronized (ICommerceToolsPublishService.class) {
                if (C58096Mr6.LLLFZ == null) {
                    C58096Mr6.LLLFZ = new CommerceToolsPublishService();
                }
            }
        }
        return C58096Mr6.LLLFZ;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.common.publish.ICommerceToolsPublishService
    public final C40999G7f LIZ(GF4 gf4) {
        return new C40999G7f(gf4);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.common.publish.ICommerceToolsPublishService
    public final void LIZIZ(VideoPublishEditModel args, LinkedHashMap<String, String> linkedHashMap) {
        String str;
        String str2;
        String str3;
        CommerceToolsModel commerceToolsModel;
        Mission mission;
        o.LJIIIZ(args, "args");
        CommerceToolsModel commerceToolsModel2 = args.creativeModel.commerceModel;
        if (args.isDefaultProp) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_default_prop", str);
        InteractiveBrandedEffectInfo interactiveBrandedEffectInfo = null;
        boolean z = false;
        String str4 = "2";
        if (commerceToolsModel2.getStickerContext().getHasCommerceStickerMetaData()) {
            str2 = "3";
        } else {
            C164846dU mainBusinessContext = args.getMainBusinessContext();
            EnumC164816dR[] enumC164816dRArr = {EnumC164816dR.TRACK_PAGE_RECORD};
            LinkedList linkedList = new LinkedList();
            InteractStickerTracksContext LJII = C164826dS.LJII(mainBusinessContext);
            if (LJII == null || LJII.isEmpty(enumC164816dRArr)) {
                linkedList = null;
            } else {
                linkedList.addAll(LJII.getStickerStructsByPage(enumC164816dRArr));
            }
            if (!C79004UzY.LJJIFFI(linkedList)) {
                str2 = "2";
            } else {
                C164846dU mainBusinessContext2 = args.getMainBusinessContext();
                if (mainBusinessContext2 != null && mainBusinessContext2.interactStickerCheckEffectSdk) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
            }
        }
        linkedHashMap.put("interact_sticker_check", str2);
        if (commerceToolsModel2.getStickerContext().getHasIBEMetaData()) {
            str4 = "3";
        } else if (!CommerceToolsStickerServiceImpl.LJIIL().LIZIZ(args)) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("ibe_status_monitor", str4);
        List<IBEInfo> ibeInfos = commerceToolsModel2.getIbeContext().getIbeInfos();
        if (!ibeInfos.isEmpty()) {
            Gson retrofitFactoryGson = C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson();
            CommercialVideoInfo commercialVideoInfo = new CommercialVideoInfo();
            commercialVideoInfo.setIbeInfos(ibeInfos);
            InteractiveBrandedEffectInfo metadata = commerceToolsModel2.getIbeContext().getMetadata();
            if ((metadata == null || !metadata.getEnableTap()) && e1.LIZ(31744, "ibe_enable_decouple_metadata", true, false)) {
                z = true;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                interactiveBrandedEffectInfo = metadata;
            }
            commercialVideoInfo.setIbeMetaInfo(interactiveBrandedEffectInfo);
            String json = GsonProtectorUtils.toJson(retrofitFactoryGson, commercialVideoInfo);
            o.LJIIIIZZ(json, "getAPI().networkService.…         },\n            )");
            linkedHashMap.put("commercial_video_info", json);
        }
        if (C42478Glm.LJFF) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_commercial_sound_page", str3);
        if (args.creativeModel.commerceModel.getMusicUsageConfirmation() != 0) {
            linkedHashMap.put("music_usage_confirmation", String.valueOf(args.creativeModel.commerceModel.getMusicUsageConfirmation()));
        }
        CreativeModel creativeModel = args.creativeModel;
        if (creativeModel != null && (commerceToolsModel = creativeModel.commerceModel) != null && (mission = commerceToolsModel.getMission()) != null) {
            String missionId = mission.getMissionId();
            String str5 = "";
            if (missionId == null) {
                missionId = "";
            }
            linkedHashMap.put("mission_id", missionId);
            String enterFrom = mission.getEnterFrom();
            if (enterFrom != null) {
                str5 = enterFrom;
            }
            linkedHashMap.put("mission_from", str5);
        }
        CommerceToolsTcmModel tcmModel = args.creativeModel.commerceModel.getTcmModel();
        if (!H7R.LJJLIIIJILLIZJL(args)) {
            if (tcmModel.isTcmOrder()) {
                linkedHashMap.put("is_star_atlas", "1");
            } else {
                linkedHashMap.put("is_star_atlas", CardStruct.IStatusCode.DEFAULT);
            }
            if (!TextUtils.isEmpty(tcmModel.getTcmCampaignInfo())) {
                linkedHashMap.put("star_atlas_content", String.valueOf(tcmModel.getTcmCampaignInfo()));
            }
            if (!TextUtils.isEmpty(tcmModel.getTcmParams())) {
                linkedHashMap.put("tcm_params", String.valueOf(tcmModel.getTcmParams()));
            }
        }
        if (!TextUtils.isEmpty(tcmModel.getBrandedContentSwitch())) {
            linkedHashMap.put("branded_content_type", tcmModel.getBrandedContentSwitch());
        }
        String brandOrganicType = tcmModel.getBrandOrganicType();
        if (brandOrganicType != null) {
            linkedHashMap.put("brand_organic_type", brandOrganicType);
        }
    }
}
