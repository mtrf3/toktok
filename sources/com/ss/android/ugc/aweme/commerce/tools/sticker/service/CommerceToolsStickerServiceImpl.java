package com.ss.android.ugc.aweme.commerce.tools.sticker.service;

import X.C025908h;
import X.C145995oB;
import X.C164826dS;
import X.C164846dU;
import X.C29S;
import X.C32I;
import X.C42480Glo;
import X.C42484Gls;
import X.C43284Gym;
import X.C43882HKc;
import X.C47261Igj;
import X.C58096Mr6;
import X.C60903NvH;
import X.C61878OQg;
import X.C6BK;
import X.C72856Sia;
import X.C78983UzD;
import X.C79004UzY;
import X.EnumC164816dR;
import X.FMX;
import X.GF4;
import X.HCA;
import X.I9V;
import X.InterfaceC153045zY;
import X.ORZ;
import X.OSZ;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.commerce.VideoInterval;
import com.ss.android.ugc.aweme.commerce.tools.sticker.CommerceToolsStickerContext;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEContext;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEStickerHandler;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class CommerceToolsStickerServiceImpl implements ICommerceToolsStickerService {
    public static ICommerceToolsStickerService LJIIL() {
        Object LIZ = C58096Mr6.LIZ(ICommerceToolsStickerService.class, false);
        if (LIZ != null) {
            return (ICommerceToolsStickerService) LIZ;
        }
        if (C58096Mr6.LLLIIIIL == null) {
            synchronized (ICommerceToolsStickerService.class) {
                if (C58096Mr6.LLLIIIIL == null) {
                    C58096Mr6.LLLIIIIL = new CommerceToolsStickerServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLIIIIL;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final C42484Gls LIZ(GF4 gf4) {
        return new C42484Gls(gf4);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
            o.LJIIIIZZ(finalVideoList, "model.finalVideoList");
            Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                if (!next.getRecordExtras().isEmpty() && next.getFromRecordExtras("extra_key_ibe_info") != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final boolean LIZJ(HCA hca) {
        if (hca == null || hca.isEmpty()) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it = hca.iterator();
        while (it.hasNext()) {
            if (it.next().isBusiSticker()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final void LJ(ShortVideoContext shortVideoContext) {
        Long l;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        CommerceToolsStickerContext stickerContext = shortVideoContext.creativeModel.commerceModel.getStickerContext();
        if (!stickerContext.getStartedUsingEffect()) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("prop_id", stickerContext.getPropId());
        Long startUseTime = stickerContext.getStartUseTime();
        if (startUseTime != null) {
            l = Long.valueOf(SystemClock.elapsedRealtime() - startUseTime.longValue());
        } else {
            l = null;
        }
        c145995oB.LIZJ(l, "duration");
        FMX.LJIIL("prop_click_time", c145995oB.LIZ);
        stickerContext.setStartedUsingEffect(false);
        stickerContext.setPropId(null);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final void LJFF(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            AwemeRawAd awemeRawAd = (AwemeRawAd) new Gson().LJI(str, AwemeRawAd.class);
            if (awemeRawAd == null) {
                return;
            }
            C025908h.LIZLLL("camera_ad", "click", awemeRawAd, "sticker", "refer");
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final void LJIIIZ(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            AwemeRawAd awemeRawAd = (AwemeRawAd) new Gson().LJI(str, AwemeRawAd.class);
            if (awemeRawAd == null) {
                return;
            }
            C025908h.LIZLLL("camera_ad", "show", awemeRawAd, "sticker", "refer");
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final void LIZLLL(InterfaceC153045zY interfaceC153045zY, VideoPublishEditModel videoPublishEditModel) {
        ?? r9;
        ?? arrayList;
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = new HashMap();
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        if (finalVideoList != null) {
            r9 = new ArrayList();
            Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                TimeSpeedModelExtension timeSpeedModelExtension = next;
                if (!timeSpeedModelExtension.getRecordExtras().isEmpty() && timeSpeedModelExtension.getFromRecordExtras("extra_key_ibe_info") != null) {
                    r9.add(next);
                }
            }
        } else {
            r9 = C61878OQg.INSTANCE;
        }
        Float valueOf = Float.valueOf(0.0f);
        int LJJL = C32I.LJJL(r9, 9);
        if (LJJL == 0) {
            arrayList = C47261Igj.LJJIJ(valueOf);
        } else {
            arrayList = new ArrayList(LJJL + 1);
            arrayList.add(valueOf);
            Iterator it2 = r9.iterator();
            while (it2.hasNext()) {
                valueOf = Float.valueOf(valueOf.floatValue() + ((TimeSpeedModelExtension) it2.next()).getDuration());
                arrayList.add(valueOf);
            }
        }
        List LLJJIII = ORZ.LLJJIII(ORZ.LJLJL(1, arrayList), r9);
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LLJJIII, 10));
        Iterator it3 = ((ArrayList) LLJJIII).iterator();
        while (it3.hasNext()) {
            OSZ osz = (OSZ) it3.next();
            float floatValue = ((Number) osz.getFirst()).floatValue();
            InteractiveBrandedEffectInfo LIZ = C42480Glo.LIZ((TimeSpeedModelExtension) osz.getSecond());
            if (LIZ != null) {
                VideoInterval videoInterval = new VideoInterval();
                videoInterval.setStart(Float.valueOf(floatValue));
                videoInterval.setEnd(Float.valueOf(floatValue + r10.getDuration()));
                LIZ.setVideoInterval(videoInterval);
            } else {
                LIZ = null;
            }
            arrayList2.add(LIZ);
        }
        IBEContext ibeContext = videoPublishEditModel.creativeModel.commerceModel.getIbeContext();
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = r9.iterator();
        while (it4.hasNext()) {
            InteractiveBrandedEffectInfo LIZ2 = C42480Glo.LIZ((TimeSpeedModelExtension) it4.next());
            if (LIZ2 != null) {
                arrayList3.add(LIZ2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            InteractiveBrandedEffectInfo interactiveBrandedEffectInfo = (InteractiveBrandedEffectInfo) it5.next();
            int ibeType = interactiveBrandedEffectInfo.getIbeType();
            String lynxSchema = interactiveBrandedEffectInfo.getLynxSchema();
            if (lynxSchema == null) {
                C78983UzD.LJIILJJIL();
                lynxSchema = "";
            }
            arrayList4.add(new IBEInfo(ibeType, lynxSchema, interactiveBrandedEffectInfo.getStickerId()));
        }
        ibeContext.setIbeInfos(arrayList4);
        videoPublishEditModel.creativeModel.commerceModel.getStickerContext().setHasIBEMetaData(!arrayList2.isEmpty());
        if (!arrayList2.isEmpty()) {
            videoPublishEditModel.creativeModel.commerceModel.getIbeContext().setMetadata((InteractiveBrandedEffectInfo) ORZ.LLFF(arrayList2));
            String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), arrayList2);
            o.LJIIIIZZ(json, "getAPI().networkService.…).toJson(ibeMetadataList)");
            hashMap.put("interactive_branded_effect_infos", json);
        }
        if (!(!arrayList2.isEmpty())) {
            C164846dU mainBusinessContext = videoPublishEditModel.getMainBusinessContext();
            if (mainBusinessContext == null) {
                return;
            }
            List<InteractStickerStruct> LIZLLL = C164826dS.LIZLLL(mainBusinessContext, EnumC164816dR.TRACK_PAGE_RECORD);
            if (!C79004UzY.LJJIFFI(LIZLLL)) {
                String interactionJson = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), LIZLLL);
                o.LJIIIIZZ(interactionJson, "interactionJson");
                hashMap.put("interaction_stickers", interactionJson);
                videoPublishEditModel.creativeModel.commerceModel.getStickerContext().setHasCommerceStickerMetaData(true);
            } else {
                videoPublishEditModel.creativeModel.commerceModel.getStickerContext().setHasCommerceStickerMetaData(false);
                return;
            }
        }
        try {
            jSONObject.put("com.bytedance.info", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), hashMap));
        } catch (JSONException unused) {
            C78983UzD.LJIILJJIL();
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "jsonInfo.toString()");
        interfaceC153045zY.LLILLL("com.android.information", jSONObject2);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final IBEStickerHandler LJIIIIZZ(C29S activity, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(activity, "activity");
        return new IBEStickerHandler(activity, shortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final C72856Sia LJII(ShortVideoContext shortVideoContext, C43284Gym c43284Gym, List list) {
        return new C72856Sia(shortVideoContext, c43284Gym, list);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final I9V LJIIJ(C29S activity, AqS157S0100000_7 aqS157S0100000_7, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        return new I9V(activity, aqS157S0100000_7, shortVideoContext);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final void LJIIJJI(ShortVideoContext shortVideoContext, Effect effect, boolean z, boolean z2) {
        String str;
        String str2;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        CommerceToolsStickerContext stickerContext = shortVideoContext.creativeModel.commerceModel.getStickerContext();
        if (TextUtils.equals(stickerContext.getPropId(), effect.getId())) {
            return;
        }
        LJ(shortVideoContext);
        if (!z) {
            return;
        }
        shortVideoContext.LJI();
        String id = effect.getId();
        stickerContext.setStartedUsingEffect(true);
        stickerContext.setPropId(id);
        stickerContext.setStartUseTime(Long.valueOf(SystemClock.elapsedRealtime()));
        if (z2 && effect.isBusiness()) {
            C145995oB c145995oB = new C145995oB();
            if (TextUtils.isEmpty(shortVideoContext.enterFrom)) {
                str = shortVideoContext.shootWay;
            } else {
                str = shortVideoContext.enterFrom;
            }
            c145995oB.LJI("enter_from", str);
            c145995oB.LJI("prop_id", effect.getId());
            if (shortVideoContext.isCarouselOpen) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c145995oB.LJI("carousel_open", str2);
            FMX.LJIIL("commerce_prop_click", c145995oB.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService
    public final void LJI(ShortVideoContext shortVideoContext, boolean z, String str, String str2, Boolean bool) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (TextUtils.equals(shortVideoContext.creativeModel.commerceModel.getStickerContext().getPropId(), str2) || !z || !TextUtils.equals(shortVideoContext.shootWay, "challenge") || !o.LJ(bool, Boolean.TRUE)) {
            return;
        }
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("shoot_way", shortVideoContext.shootWay);
        if (str == null) {
            str = "";
        }
        c6bk.LIZ.put("challenge_id", str);
        c6bk.LIZ.put("sticker_id", str2);
        C43882HKc.LIZLLL(0, "autoselected_sticker_monitor", c6bk.LJ(), true);
    }
}
