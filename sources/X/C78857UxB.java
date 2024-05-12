package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bdlocation.event.IEventManager;
import com.bytedance.crash.CrashType;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.navigation.NavigationScene;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.experiment.FullEpisodeConfig;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PodcastInfo;
import com.ss.android.ugc.aweme.feed.model.PodcastUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.portrait.api.PortraitCenterInitService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryDesc;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import defpackage.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* renamed from: X.UxB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78857UxB implements R4B, InterfaceC48540J3g, InterfaceC39656FhM, InterfaceC78864UxI, InterfaceC72973SkT, IEventManager, C0WM, InterfaceC87755YcJ {
    public static final C78857UxB LJLIL = new C78857UxB();

    public static final boolean LJJJ(int i) {
        return i == 2;
    }

    public static final boolean LJJJI(int i) {
        return i == 3;
    }

    @Override // X.InterfaceC87755YcJ
    public void LIZ() {
        C44938HkM.LIZIZ = false;
    }

    @Override // X.InterfaceC87755YcJ
    public void LIZIZ() {
    }

    @Override // X.InterfaceC87755YcJ
    public void LJ() {
        C44938HkM.LIZIZ = true;
    }

    @Override // X.InterfaceC87755YcJ
    public void LJII() {
        C44938HkM.LIZIZ = false;
    }

    @Override // X.InterfaceC39656FhM
    public boolean LJIILL(ClassLoader classLoader, File file, File file2, boolean z) {
        return LJJII(classLoader, file, file2, z);
    }

    @Override // X.InterfaceC87755YcJ
    public void onFailed() {
        C44938HkM.LIZIZ = false;
    }

    @Override // X.R4B
    public void onSuccess() {
        R4D.LIZIZ = null;
        R4D.LIZ = -1;
        R4D.LJ = "";
    }

    public static final GI4 LJJIIZ() {
        return C41025G8f.LIZ("normal");
    }

    public static int LJJIJIIJIL() {
        return C00F.LIZ(31744, -1, "optimize_holdupapplog", true);
    }

    public static boolean LJJIJIL() {
        return e1.LIZ(31744, "optimize_combinev2doframe", true, false);
    }

    @Override // X.InterfaceC48540J3g
    public void tryInit() {
        PortraitCenterInitService.Companion.getClass();
        C58133Mrh.LIZ.checkAndInit();
    }

    public static final Boolean LJIIJ() {
        return Boolean.FALSE;
    }

    public static final Integer LJIIL(int i) {
        return new Integer(i);
    }

    public static boolean LJJ(File file) {
        if (file.exists() && file.length() > 128) {
            return true;
        }
        return false;
    }

    public static final int LJJIIJZLJL(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return view.getHeight() + iArr[1];
    }

    public static final String LJJIIZI(String str) {
        String LJJLL = LiveOuterService.LJJJLL().LJJIJIL().LJJLL(str);
        o.LJIIIIZZ(LJJLL, "get().getService(\n      …getLiveSDKTextString(key)");
        return LJJLL;
    }

    public static final EnumC227268vy LJJIJIIJI(User user) {
        o.LJIIIZ(user, "<this>");
        if (user.getFollowStatus() == 2) {
            return EnumC227268vy.FRIENDS;
        }
        if (user.getFollowStatus() == 1) {
            return EnumC227268vy.FOLLOWING;
        }
        if (user.getMatchedFriendStruct() != null) {
            return EnumC227268vy.MAF;
        }
        return EnumC227268vy.MORE_FRIENDS;
    }

    public static final void LJJIJL(GiftListResult giftListResult) {
        o.LJIIIZ(giftListResult, "<this>");
        List<GiftPage> list = giftListResult.giftPages;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (GiftPage giftPage : list) {
            List<Gift> frequentlyUsedGifts = giftPage.frequentlyUsedGifts;
            o.LJIIIIZZ(frequentlyUsedGifts, "frequentlyUsedGifts");
            ArrayList arrayList = new ArrayList(C32I.LJJL(frequentlyUsedGifts, 10));
            Iterator<Gift> it = frequentlyUsedGifts.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(it.next().id));
            }
            List<Gift> gifts = giftPage.gifts;
            if (!frequentlyUsedGifts.isEmpty() && gifts != null && !gifts.isEmpty()) {
                o.LJIIIIZZ(gifts, "gifts");
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(gifts, 10));
                Iterator<Gift> it2 = gifts.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(it2.next().id));
                }
                java.util.Set LLJJ = ORZ.LLJJ(arrayList2);
                Iterator<T> it3 = ORS.LJJLIIIJL(frequentlyUsedGifts).iterator();
                while (it3.hasNext()) {
                    Gift gift = (Gift) it3.next();
                    if (!LLJJ.contains(Long.valueOf(gift.id))) {
                        ListProtector.add(gifts, 0, gift);
                    }
                }
            }
        }
    }

    public static final boolean LJJJIL(String str) {
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static String LJJJJ(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                sb.append(strArr[i]);
                if (i != strArr.length - 1) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        return sb.toString();
    }

    public static void LJJJJI(InterfaceC88471Ynr interfaceC88471Ynr) {
        XIA dispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(dispatcher, "dispatcher");
        XKX.LIZLLL(C780334l.LJLIL, dispatcher, null, interfaceC88471Ynr, 2);
    }

    public static final void LJJJJL(VideoItemParams videoItemParams) {
        o.LJIIIIZZ(videoItemParams.getAweme(), "item.aweme");
        String str = videoItemParams.mFrom;
        String str2 = videoItemParams.mEventType;
        if ((o.LJ(str, "from_profile_self") || o.LJ(str, "from_profile_other")) && !o.LJ(str2, "others_homepage")) {
            o.LJ(str2, "personal_homepage");
        }
    }

    public static final boolean LJJJJLI(VideoItemParams videoItemParams) {
        Boolean bool;
        String str;
        String str2;
        Aweme aweme;
        PodcastInfo podcastInfo;
        Aweme aweme2;
        PodcastInfo podcastInfo2;
        Aweme aweme3;
        PodcastInfo podcastInfo3;
        PodcastUrlModel playAddr;
        List<String> urlList;
        Aweme aweme4;
        PodcastInfo podcastInfo4;
        Aweme aweme5;
        PodcastInfo podcastInfo5;
        Aweme aweme6;
        PodcastInfo podcastInfo6;
        PodcastUrlModel playAddr2;
        List<String> urlList2;
        Integer isTeenagerMode;
        PodcastInfo podcastInfo7;
        PodcastUrlModel playAddr3;
        PodcastInfo podcastInfo8;
        PodcastInfo podcastInfo9;
        PodcastInfo podcastInfo10;
        StringBuilder LIZ = X1D.LIZ();
        Aweme aweme7 = videoItemParams.getAweme();
        List<String> list = null;
        if (aweme7 != null && (podcastInfo10 = aweme7.getPodcastInfo()) != null) {
            bool = podcastInfo10.isPodcastPreview();
        } else {
            bool = null;
        }
        LIZ.append(bool);
        LIZ.append(", ");
        Aweme aweme8 = videoItemParams.getAweme();
        if (aweme8 != null && (podcastInfo9 = aweme8.getPodcastInfo()) != null) {
            str = podcastInfo9.getEpisodeItemId();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", ");
        Aweme aweme9 = videoItemParams.getAweme();
        if (aweme9 != null && (podcastInfo8 = aweme9.getPodcastInfo()) != null) {
            str2 = podcastInfo8.getFeedTitle();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(", ");
        Aweme aweme10 = videoItemParams.getAweme();
        if (aweme10 != null && (podcastInfo7 = aweme10.getPodcastInfo()) != null && (playAddr3 = podcastInfo7.getPlayAddr()) != null) {
            list = playAddr3.getUrlList();
        }
        LIZ.append(list);
        LIZ.append(", ");
        X1D.LIZIZ(LIZ);
        AdPersonalitySettings LJII = a.LJIIZILJ().LJII();
        if (LJII != null && (isTeenagerMode = LJII.isTeenagerMode()) != null && isTeenagerMode.intValue() == 1) {
            return false;
        }
        Aweme aweme11 = videoItemParams.getAweme();
        if (aweme11 != null && aweme11.isAd()) {
            return false;
        }
        if (videoItemParams.isMyProfile && videoItemParams.isFromPostList) {
            Aweme aweme12 = videoItemParams.getAweme();
            if (aweme12 != null && aweme12.getPodcastInfo() != null && (aweme4 = videoItemParams.getAweme()) != null && (podcastInfo4 = aweme4.getPodcastInfo()) != null && o.LJ(podcastInfo4.isPodcastPreview(), Boolean.TRUE) && (aweme5 = videoItemParams.getAweme()) != null && (podcastInfo5 = aweme5.getPodcastInfo()) != null && podcastInfo5.getPlayAddr() != null && (aweme6 = videoItemParams.getAweme()) != null && (podcastInfo6 = aweme6.getPodcastInfo()) != null && (playAddr2 = podcastInfo6.getPlayAddr()) != null && (urlList2 = playAddr2.getUrlList()) != null && !urlList2.isEmpty() && ((FullEpisodeConfig) IOO.LIZIZ.getValue()).isShownInProfile == 1) {
                return true;
            }
            return false;
        }
        Aweme aweme13 = videoItemParams.getAweme();
        if (aweme13 != null && aweme13.getPodcastInfo() != null && (aweme = videoItemParams.getAweme()) != null && (podcastInfo = aweme.getPodcastInfo()) != null && o.LJ(podcastInfo.isPodcastPreview(), Boolean.TRUE) && (aweme2 = videoItemParams.getAweme()) != null && (podcastInfo2 = aweme2.getPodcastInfo()) != null && podcastInfo2.getPlayAddr() != null && (aweme3 = videoItemParams.getAweme()) != null && (podcastInfo3 = aweme3.getPodcastInfo()) != null && (playAddr = podcastInfo3.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null && !urlList.isEmpty() && ((FullEpisodeConfig) IOO.LIZIZ.getValue()).isShowEntryOnFYP == 1) {
            return true;
        }
        return false;
    }

    public static final NavigationScene LJJJJZI(View requireNavigationScene) {
        o.LJIIIZ(requireNavigationScene, "$this$requireNavigationScene");
        WM7 LJI = C78598Ut0.LJI(requireNavigationScene);
        if (LJI != null) {
            return C78923UyF.LJIILLIIL(LJI);
        }
        throw new IllegalStateException("Scene not found");
    }

    public static final String LJJJLL(IYN iyn) {
        o.LJIIIZ(iyn, "<this>");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) iyn.getGearName());
        LIZ.append(" -> ");
        LIZ.append(iyn.getBitRate());
        LIZ.append(" -> ");
        LIZ.append(iyn.isBytevc1());
        LIZ.append(" -> ");
        LIZ.append(iyn.getQualityType());
        return X1D.LIZIZ(LIZ);
    }

    public static final byte[] LJJJLZIJ(String toByteArrayExt) {
        o.LJIIJ(toByteArrayExt, "$this$toByteArrayExt");
        byte[] bytes = toByteArrayExt.getBytes(PVC.LIZ);
        o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final C25600zU LJJL(Context wrapWithCustomTheme) {
        int i;
        o.LJIIIZ(wrapWithCustomTheme, "$this$wrapWithCustomTheme");
        InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
        if (interfaceC62484Ofg != null) {
            interfaceC62484Ofg.LJIJ();
            C25600zU c25600zU = new C25600zU(wrapWithCustomTheme, R.style.lb);
            Integer LJ = C79045V0n.LJ(R.attr.eu, c25600zU);
            if (LJ != null) {
                i = LJ.intValue();
            } else {
                i = 0;
            }
            return new C25600zU(c25600zU, i);
        }
        return null;
    }

    public static int LJJLI(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    @Override // X.C0WM
    public List LJIIJJI(EffectChannelResponse effectChannelResponse) {
        List arrayList;
        String str;
        List<Effect> allCategoryEffects;
        if (effectChannelResponse != null && (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(allCategoryEffects, 10));
            int i = 0;
            for (Effect effect : allCategoryEffects) {
                int i2 = i + 1;
                if (i >= 0) {
                    Effect effect2 = effect;
                    LiveEffect LIZIZ = C0LT.LIZIZ(effect2);
                    C77412UZs.LJIIL(LIZIZ, 2);
                    LIZIZ.filterId = effect2.getResourceId();
                    LIZIZ.impressionPos = Integer.valueOf(i);
                    LIZIZ.effectPanelName = effectChannelResponse.getPanel();
                    LIZIZ.effectPanelKey = effectChannelResponse.getPanel();
                    arrayList2.add(LIZIZ);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            arrayList = ORZ.LLJILJILJ(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        C0TX.LIZ.LIZJ("ComposerFilter");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("perform composer's convert, effect size: ");
        LIZ.append(arrayList.size());
        LIZ.append('.');
        C0TX.LIZLLL(X1D.LIZIZ(LIZ));
        if (arrayList.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        if (effectChannelResponse == null || (str = effectChannelResponse.getPanel()) == null) {
            str = "";
        }
        ListProtector.add(arrayList, 0, C77412UZs.LJIIJ());
        return C47261Igj.LJJIJ(new C1QC(str, str, arrayList, null, 56));
    }

    public static final long LJIIIIZZ(float f, boolean z) {
        long j;
        long floatToIntBits = Float.floatToIntBits(f);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        return (j & 4294967295L) | (floatToIntBits << 32);
    }

    public static final Integer LJIIIZ(int i, C25600zU c25600zU) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        if (!c25600zU.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        return Integer.valueOf(typedValue.resourceId);
    }

    public static void LJIL(JSONObject jSONObject, File file) {
        CrashType crashType;
        int i;
        boolean z;
        long optLong;
        String str;
        String str2;
        String str3;
        Object opt = jSONObject.opt("data");
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (opt == null) {
            C78685UuP.LJJI();
            return;
        }
        if (optJSONObject == null) {
            C78685UuP.LJJI();
            return;
        }
        boolean z2 = false;
        if (opt instanceof JSONArray) {
            crashType = CrashType.LAUNCH;
            C78685UuP.LJJI();
            jSONObject = ((JSONArray) opt).optJSONObject(0);
            LJIJJ(jSONObject2, "launch_did", jSONObject.opt("launch_did"));
        } else if (jSONObject.optInt("is_anr") == 1) {
            crashType = CrashType.ANR;
            try {
                i = !new JSONObject(jSONObject.optString("data")).optString("mainStackFromTrace").trim().startsWith("at") ? 1 : 0;
            } catch (Throwable unused) {
                i = -1;
            }
            LJIIZILJ(1, Integer.valueOf(i), "has_native_stack", jSONObject2);
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            PKN.LJIILIIL(String.valueOf(z), "filters", "has_native_stack", jSONObject);
            C78685UuP.LJJI();
        } else if (jSONObject.optInt("is_native_crash") == 1) {
            crashType = CrashType.NATIVE;
            C78685UuP.LJJI();
        } else if (jSONObject.optInt("is_dart") == 1) {
            C78685UuP.LJJI();
            return;
        } else {
            crashType = CrashType.JAVA;
            C78685UuP.LJJI();
        }
        PJC.LJIIJ(jSONObject2, "crash_type", crashType);
        PJC.LJIIJ(jSONObject2, "succ_step", Integer.valueOf(jSONObject.optInt("succ_step", -1)));
        LJIJJ(jSONObject2, "logcat", jSONObject.opt("logcat"));
        if (PJC.LJII(jSONObject) || PJC.LJI(jSONObject.optJSONArray("logcat"))) {
            z2 = true;
        }
        PKN.LJIILIIL(String.valueOf(!z2), "filters", "has_logcat", jSONObject);
        LJIJJ(jSONObject2, "crash_time", jSONObject.opt("crash_time"));
        LJIJJ(jSONObject2, "crash_uuid", jSONObject.opt("crash_uuid"));
        LJIJJ(jSONObject2, "storage", jSONObject.opt("storage"));
        LJIJJ(jSONObject2, "filters", jSONObject.opt("filters"));
        if (jSONObject.opt("filters") != null) {
            LJIJJ(jSONObject2, "filters:sdk_version", jSONObject.optJSONObject("filters").opt("sdk_version"));
            LJIJJ(jSONObject2, "filters:is_root", jSONObject.optJSONObject("filters").opt("is_root"));
            LJIJJ(jSONObject2, "filters:is_64_devices", jSONObject.optJSONObject("filters").opt("is_64_devices"));
            LJIJJ(jSONObject2, "filters:is_64_runtime", jSONObject.optJSONObject("filters").opt("is_64_runtime"));
            LJIJJ(jSONObject2, "filters:is_x86_devices", jSONObject.optJSONObject("filters").opt("is_x86_devices"));
            LJIJJ(jSONObject2, "filters:kernel_version", jSONObject.optJSONObject("filters").opt("kernel_version"));
        }
        LJIJ(optJSONObject.optString("sdk_version_name"), "sdk_version_name", jSONObject2);
        LJIJ(optJSONObject.optString("sdk_version"), "sdk_version", jSONObject2);
        LJIIZILJ("Android", optJSONObject.optString("os"), "os", jSONObject2);
        LJIJ(optJSONObject.optString("os_version"), "os_version", jSONObject2);
        LJIJ(optJSONObject.optString("os_api"), "os_api", jSONObject2);
        LJIJ(optJSONObject.optString("device_model"), "device_model", jSONObject2);
        LJIJ(optJSONObject.optString("device_brand"), "device_brand", jSONObject2);
        LJIJ(optJSONObject.optString("device_manufacturer"), "device_manufacturer", jSONObject2);
        LJIJ(optJSONObject.optString("cpu_abi"), "cpu_abi", jSONObject2);
        LJIJ(optJSONObject.optString("package"), "package", jSONObject2);
        LJIJ(optJSONObject.optString("package"), "package", jSONObject2);
        LJIJ(optJSONObject.optString("unique_key"), "unique_key", jSONObject2);
        if (optJSONObject.optLong("version_get_time") == 0) {
            optLong = 0;
        } else {
            optLong = optJSONObject.optLong("version_get_time") - jSONObject.optLong("crash_time");
        }
        if (optLong == 0) {
            str = "normal";
        } else if (optLong < 0) {
            str = "old";
        } else {
            str = "new";
        }
        PKN.LJIILIIL(str, "filters", "version_get_time", jSONObject);
        if (optLong != 0) {
            PJC.LJIIJ(jSONObject3, "version_get_time", Long.valueOf(optLong));
        }
        int optInt = optJSONObject.optInt("first_update_launch", -1);
        if (optInt == -1) {
            str2 = null;
        } else {
            str2 = "value";
        }
        LJIJ(str2, "first_update_launch", jSONObject2);
        PKN.LJIILIIL(String.valueOf(optInt), "filters", "first_update_launch", jSONObject);
        LJIJJ(jSONObject2, "miniapp_id", jSONObject.opt("miniapp_id"));
        LJIJJ(jSONObject2, "plugin_info", jSONObject.opt("plugin_info"));
        LJIJJ(jSONObject2, "process_name", jSONObject.opt("process_name"));
        LJIJJ(jSONObject2, "plugin_info", jSONObject.opt("plugin_info"));
        LJIJJ(jSONObject2, "pid", jSONObject.opt("pid"));
        LJIJJ(jSONObject2, "app_start_time", jSONObject.opt("app_start_time"));
        LJIJJ(jSONObject2, "app_start_time_readable", jSONObject.opt("app_start_time_readable"));
        LJIJJ(jSONObject2, "patch_info", jSONObject.opt("patch_info"));
        LJIJJ(jSONObject2, "is_background", jSONObject.opt("is_background"));
        LJIJJ(jSONObject2, "activity_trace", jSONObject.opt("activity_trace"));
        LJIJJ(jSONObject2, "custom_long", jSONObject.opt("custom_long"));
        LJIJJ(jSONObject2, "custom", jSONObject.opt("custom"));
        if (jSONObject.optJSONObject("custom_long") != null) {
            LJIJJ(jSONObject2, "activity_track", jSONObject.optJSONObject("custom_long").opt("activity_track"));
        }
        LJIJJ(jSONObject2, "battery", jSONObject.opt("battery"));
        LJIJJ(jSONObject2, "filters", jSONObject.opt("filters"));
        if (file != null) {
            LJIJJLI("has_logcat_file", jSONObject, jSONObject2, LJJ(new File(file, "logcat.txt")));
            if (new File(file, "logerr.txt").exists()) {
                str3 = "native";
            } else {
                str3 = "java";
            }
            PKN.LJIILIIL(str3, "filters", "logcat_type", jSONObject);
            LJIJJLI("has_maps_file", jSONObject, jSONObject2, LJJ(new File(file, "maps.txt")));
            LJIJJLI("has_pthread_key_file", jSONObject, jSONObject2, LJJ(new File(file, "pthread_key_info.txt")));
            LJIJJLI("has_pthread_key_map_file", jSONObject, jSONObject2, LJJ(new File(file, "pthread_key_map.txt")));
            LJIJJLI("has_os_memory_file", jSONObject, jSONObject2, LJJ(new File(file, "os_memory.txt")));
            LJIJJLI("has_envinfo_file", jSONObject, jSONObject2, LJJ(new File(file, "envinfo.txt")));
            LJIJJLI("has_meminfo_file", jSONObject, jSONObject2, LJJ(new File(file, "meminfo.txt")));
            LJIJJLI("has_threads_file", jSONObject, jSONObject2, LJJ(new File(file, "threads.txt")));
            LJIJJLI("has_pthreads_file", jSONObject, jSONObject2, LJJ(new File(file, "pthreads.txt")));
            LJIJJLI("has_malloc_file", jSONObject, jSONObject2, LJJ(new File(file, "malloc.txt")));
            LJIJJLI("has_fds_file", jSONObject, jSONObject2, LJJ(new File(file, "fds.txt")));
            LJIJJLI("has_view_tree", jSONObject, jSONObject2, LJJ(new File(file, "threads.txt")));
        }
        PJD.LIZIZ("crash_data_check", jSONObject2, jSONObject3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (ujb.o.LJJJLIIL(r7, "music_recommend", false) == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (ujb.o.LJJJLIIL(r7, "duet", false) != true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (ujb.o.LJJJLIIL(r7, "prop_page_discover", false) != true) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x003d, code lost:
    
        if (r7 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJJIII(java.lang.String r7, boolean r8) {
        /*
            r5 = 1
            r6 = 0
            if (r7 == 0) goto La
            int r0 = r7.length()
            if (r0 != 0) goto Ld
        La:
            java.lang.String r0 = ""
            return r0
        Ld:
            if (r8 != 0) goto L10
            return r7
        L10:
            if (r7 == 0) goto Le3
            java.lang.String r0 = "prop_panel_"
            boolean r0 = ujb.o.LJJJLIIL(r7, r0, r6)
            if (r0 != r5) goto Le3
            r0 = 1
        L1b:
            java.lang.String r1 = "music_recommend"
            java.lang.String r3 = "prop_search"
            java.lang.String r4 = "duet"
            java.lang.String r2 = "prop_recommend"
            if (r0 != 0) goto L2d
            if (r7 == 0) goto L5d
            boolean r0 = ujb.o.LJJJLIIL(r7, r2, r6)
            if (r0 != r5) goto L4f
        L2d:
            java.lang.String r0 = "prop_panel_prop_reuse"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "prop_panel_challenge"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 == 0) goto L45
        L3d:
            if (r7 == 0) goto L5d
        L3f:
            boolean r0 = ujb.o.LJJJLIIL(r7, r4, r6)
            if (r0 != r5) goto L46
        L45:
            return r7
        L46:
            java.lang.String r0 = "prop_page_discover"
            boolean r0 = ujb.o.LJJJLIIL(r7, r0, r6)
            if (r0 != r5) goto L5d
            goto L45
        L4f:
            boolean r0 = ujb.o.LJJJLIIL(r7, r3, r6)
            if (r0 != r5) goto L56
            goto L2d
        L56:
            boolean r0 = ujb.o.LJJJLIIL(r7, r1, r6)
            if (r0 != r5) goto L3f
            goto L2d
        L5d:
            java.lang.String r0 = "prop_reuse"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "prop_collect"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "homepage_prop_maker"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "favorite_prop"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "single_song"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "prop_page"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "qr_code"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "challenge"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "direct_shoot"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "outer_rec"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "outer_save"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = "bubble_rec"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L45
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r4)
            if (r0 != 0) goto L45
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r3)
            if (r0 != 0) goto L45
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r2)
            if (r0 != 0) goto L45
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r1)
            if (r0 != 0) goto L45
            java.lang.String r0 = "previous_video_reuse"
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 == 0) goto Ldf
            goto L45
        Ldf:
            java.lang.String r7 = "other"
            goto L45
        Le3:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78857UxB.LJJIII(java.lang.String, boolean):java.lang.String");
    }

    public static final C78862UxG LJJIIJ(int i, String str) {
        C78862UxG c78862UxG = new C78862UxG(str);
        c78862UxG.attachCustomInfo("dataflowID", Integer.valueOf(i));
        return c78862UxG;
    }

    public static final QueryDesc LJJIJ(QueryCorrectComponentInfo queryCorrectComponentInfo, String str) {
        List<QueryDesc> list;
        QueryDesc queryDesc = null;
        if (queryCorrectComponentInfo == null || (list = queryCorrectComponentInfo.queryDescList) == null) {
            return null;
        }
        Iterator<QueryDesc> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            QueryDesc next = it.next();
            if (o.LJ(str, next.type)) {
                queryDesc = next;
                break;
            }
        }
        return queryDesc;
    }

    public static final List LJJIJLIJ(LinkedList linkedList, List list) {
        Object obj;
        Object obj2;
        Long valueOf;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Number) it.next()).longValue()));
        }
        if (list.isEmpty() || linkedList.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        java.util.Set LLJILLL = ORZ.LLJILLL(list);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            AbstractC32698CsQ abstractC32698CsQ = (AbstractC32698CsQ) it2.next();
            if (abstractC32698CsQ != null && (valueOf = Long.valueOf(abstractC32698CsQ.LIZJ())) != null) {
                arrayList2.add(valueOf);
            }
        }
        java.util.Set LLJJ = ORZ.LLJJ(arrayList2);
        long LIZ = C32778Cti.LIZ(C15380j0.LIZLLL());
        if (LIZ != 0) {
            if (LLJILLL.contains(Long.valueOf(LIZ))) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (LIZ == ((Number) next).longValue()) {
                        if (next != null) {
                            list.remove(next);
                            ListProtector.add(list, 0, next);
                            LLJILLL.add(Long.valueOf(LIZ));
                        }
                    }
                }
            } else if (LLJJ.contains(Long.valueOf(LIZ))) {
                Iterator it4 = linkedList.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj2 = it4.next();
                        AbstractC32698CsQ abstractC32698CsQ2 = (AbstractC32698CsQ) obj2;
                        if (abstractC32698CsQ2 != null && abstractC32698CsQ2.LIZJ() == LIZ) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                AbstractC32698CsQ abstractC32698CsQ3 = (AbstractC32698CsQ) obj2;
                if (abstractC32698CsQ3 != null) {
                    ListProtector.add(list, 0, Long.valueOf(abstractC32698CsQ3.LIZJ()));
                    LLJILLL.add(Long.valueOf(LIZ));
                }
            }
        }
        while (list.size() > 4) {
            LLJILLL.remove(Long.valueOf(((Number) ORS.LJJLL(list)).longValue()));
        }
        Iterator<T> it5 = ORS.LJJLIIIJL(list).iterator();
        while (it5.hasNext()) {
            long longValue = ((Number) it5.next()).longValue();
            Iterator it6 = linkedList.iterator();
            while (true) {
                if (it6.hasNext()) {
                    obj = it6.next();
                    AbstractC32698CsQ abstractC32698CsQ4 = (AbstractC32698CsQ) obj;
                    if (abstractC32698CsQ4 != null && abstractC32698CsQ4.LIZJ() == longValue) {
                        if (obj != null) {
                            linkedList.remove(obj);
                        }
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            linkedList.add(0, obj);
        }
        return list;
    }

    public static final NAP LJJIL(NAT nat, String str) {
        o.LJIIIZ(nat, "<this>");
        return new NAP(nat.LIZIZ(), str);
    }

    public static boolean LJJIZ(Context context, String str) {
        try {
            if (!C38354F3m.LJ(str)) {
                try {
                    if (C16880lQ.LLLLLLZ(context.getPackageManager(), str, 64) != null) {
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return false;
    }

    public static final void LJJJJLL(String str, String str2) {
        JSONObject LJ = C47135Ieh.LJ("search_entrance", "mall", "current_page", str);
        LJ.put("search_type", str2);
        C48658J7u.LIZIZ("photo_search_icon_click", LJ);
    }

    public static final void LJJJJZ(String str, String str2) {
        JSONObject LJ = C47135Ieh.LJ("search_entrance", "mall", "current_page", str);
        LJ.put("search_type", str2);
        C48658J7u.LIZIZ("photo_search_icon_show", LJ);
    }

    public static final InterfaceC07790Sh LJJJLIIL(InterfaceC07790Sh interfaceC07790Sh, float f) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        if (f == 1.0f) {
            return interfaceC07790Sh;
        }
        return C78847Ux1.LJJIIZI(interfaceC07790Sh, f, 1.0f, 0.0f, 0.0f, 0.0f, null, false, 65532);
    }

    @Override // X.R4B
    public void LIZJ(Integer num, String str) {
        R4D.LIZIZ = null;
        R4D.LIZ = -1;
        R4D.LJ = "";
        C40392FtE c40392FtE = new C40392FtE(false);
        Bundle bundle = new Bundle();
        R41.LIZ().accountUserClear();
        C40453FuD.LIZIZ(bundle, c40392FtE);
    }

    @Override // X.InterfaceC39656FhM
    public void LIZLLL(ClassLoader classLoader, java.util.Set set) {
        LJIILJJIL(classLoader, set, new C65314PkE());
    }

    @Override // X.InterfaceC72973SkT
    public Object LJFF(Object obj, Type type) {
        o.LJIIIZ(type, "type");
        return GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), (String) obj, TypeToken.get(type).getType());
    }

    @Override // com.bytedance.bdlocation.event.IEventManager
    public void onEventV3(String str, JSONObject jSONObject) {
        FMX.LJIILJJIL(str, jSONObject);
    }

    public static void LJIILJJIL(ClassLoader classLoader, java.util.Set set, ORQ orq) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object LIZ = new C40657FxV(Object.class, classLoader, C40654FxS.LJIIIZ(classLoader, "pathList")).LIZ();
        C40657FxV c40657FxV = new C40657FxV(List.class, LIZ, C40654FxS.LJIIIZ(LIZ, "nativeLibraryDirectories"));
        synchronized (C37111EhP.class) {
            ArrayList arrayList = new ArrayList((Collection) c40657FxV.LIZ());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            c40657FxV.LIZIZ(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] LIZLLL = orq.LIZLLL(LIZ, new ArrayList<>(hashSet), arrayList2);
        if (!arrayList2.isEmpty()) {
            C39658FhO c39658FhO = new C39658FhO("Error in makePathElements");
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C36662EaA.LIZ(c39658FhO, (Throwable) ListProtector.get(arrayList2, i));
            }
            throw c39658FhO;
        }
        synchronized (C37111EhP.class) {
            C40654FxS.LIZLLL(Object.class, "nativeLibraryPathElements", LIZ).LIZLLL(Arrays.asList(LIZLLL));
        }
    }

    public static void LJIJ(String str, String str2, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            try {
                jSONObject.put(i0.LJFF("err_empty_", str2), 1);
            } catch (JSONException unused) {
            }
        }
    }

    public static void LJIJI(Object obj, String str, Object... objArr) {
        if (obj != null) {
        } else {
            throw new NullPointerException(C78915Uy7.LJIJJLI(str, objArr));
        }
    }

    public static void LJIJJ(JSONObject jSONObject, String str, Object obj) {
        if (obj == null) {
            try {
                jSONObject.put(i0.LJFF("err_null_", str), 1);
            } catch (JSONException unused) {
            }
        }
    }

    public static final void LJJI(C26227ARb c26227ARb, View view, InterfaceC88472Yns interfaceC88472Yns) {
        C244689iy c244689iy = new C244689iy(c26227ARb.LIZ, view);
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c244689iy);
        }
        c26227ARb.LJIIIZ = c244689iy;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILLIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9, java.lang.Integer[] r10, X.InterfaceC88472Yns r11, X.InterfaceC88471Ynr r12) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78857UxB.LJIILLIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.Integer[], X.Yns, X.Ynr):void");
    }

    public static void LJIIZILJ(Object obj, Object obj2, String str, JSONObject jSONObject) {
        if (obj != obj2) {
            try {
                if (obj != null) {
                    if (!obj.equals(obj2)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("err_");
                        LIZ.append(str);
                        LIZ.append("_not_");
                        LIZ.append(obj);
                        jSONObject.put(X1D.LIZIZ(LIZ), 1);
                    }
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("err_");
                    LIZ2.append(str);
                    LIZ2.append("_not_");
                    LIZ2.append(obj);
                    jSONObject.put(X1D.LIZIZ(LIZ2), 1);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public static void LJIJJLI(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        if (!z) {
            try {
                jSONObject2.put(i0.LJFF(str, "_false"), 1);
            } catch (JSONException unused) {
            }
        }
        PKN.LJIILIIL(String.valueOf(z), "filters", str, jSONObject);
    }

    public static final void LJJIFFI(String str, String str2, String str3, HashMap hashMap) {
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), "aweme://user/profile/");
        buildRoute.withParam("uid", str);
        buildRoute.withParam("enter_from", str3);
        buildRoute.withParam("sec_user_id", str2);
        buildRoute.withParam("previous_page", "message");
        buildRoute.withParam("enter_method", "follow_button");
        buildRoute.withParam("extra_from_pre_page", "notification_page");
        buildRoute.withParam("extra_previous_page_position", "card_head");
        o.LJIIIIZZ(buildRoute, "buildRoute(getApplicatio…GE_POSITION, \"card_head\")");
        C57258Mda.LJ(buildRoute, hashMap);
        buildRoute.open();
    }

    public static boolean LJJII(ClassLoader classLoader, File file, File file2, boolean z) {
        return C54840Lfg.LJIJJ(classLoader, file, file2, z, new C78866UxK(), "zip", new C61576OEq());
    }

    public static SpannableString LJJJJJ(SpannableString spannableString, int i, int i2, int i3) {
        int max = Math.max(0, i);
        if (!TextUtils.isEmpty(spannableString) && max <= i2 && max < spannableString.length() && i2 <= spannableString.length()) {
            spannableString.setSpan(new ForegroundColorSpan(i3), max, i2, 17);
        }
        return spannableString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [int] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Throwable, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r8v3 */
    public static final OSZ LJJJJJL(String str, CreativeInfo srcCreativeInfo, CreativeInfo dstCreativeInfo, InterfaceC169226kY interfaceC169226kY) {
        boolean z;
        long LJFF;
        FileChannel fileChannel;
        FileChannel fileChannel2;
        FileChannel fileChannel3;
        FileInputStream LJIIZILJ;
        o.LJIIIZ(str, "<this>");
        o.LJIIIZ(srcCreativeInfo, "srcCreativeInfo");
        o.LJIIIZ(dstCreativeInfo, "dstCreativeInfo");
        ?? r10 = 0;
        r10 = 0;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i = 3;
        ?? r8 = 0;
        FileChannel fileChannel4 = null;
        FileChannel fileChannel5 = null;
        FileChannel fileChannel6 = null;
        if (z || C78966Uyw.LJJIJLIJ(str)) {
            return new OSZ(new DraftFileRestoreException(r10, r8, i, r8), null);
        }
        Iterator<String> it = C168796jr.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (ujb.o.LJJJLIIL(str, next, false)) {
                if (next != null) {
                    return new OSZ(new DraftFileRestoreException(r10, r8, i, r8), null);
                }
            }
        }
        if (new File(str).isDirectory()) {
            C60903NvH.LJIIJJI().LJJIIJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Forbid use CreativePath on directory !!!, trace : ");
            LIZ.append(android.util.Log.getStackTraceString(new RuntimeException()));
            String LIZIZ = X1D.LIZIZ(LIZ);
            C142955jH.LIZ(LIZIZ);
            C5Z2.LIZIZ(LIZIZ);
            return new OSZ(new DraftFileRestoreException(r10, r8, i, r8), null);
        }
        if (!C78966Uyw.LJJIJIL(str)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("path : ");
            LIZ2.append(C30591Hz.LJIIIIZZ(str, srcCreativeInfo.getCreationId()));
            return new OSZ(new DraftFileRestoreException(-502, new RuntimeException(X1D.LIZIZ(LIZ2))), "");
        }
        String LIZ3 = interfaceC169226kY.LIZ(str, srcCreativeInfo, dstCreativeInfo);
        if (o.LJ(str, LIZ3)) {
            return new OSZ(new DraftFileRestoreException(r10, r8, i, r8), null);
        }
        if (C78966Uyw.LJJIJLIJ(str)) {
            LJFF = 0;
        } else {
            LJFF = C44694HgQ.LJFF(str);
        }
        long LJI = GX8.LJI();
        StringBuilder LIZJ = C06490Nh.LIZJ("dstPath : ", LIZ3, " ; availableBytes : ", LJI);
        String LIZLLL = C132805Jc.LIZLLL(LIZJ, " ; srcFileLength : ", LJFF, LIZJ);
        if (LJI < LJFF) {
            return new OSZ(new DraftFileRestoreException(-553, new C249309qQ(LIZLLL)), "");
        }
        if (!C78966Uyw.LJJJJZ(new File(LIZ3))) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("path : ");
            LIZ4.append(C30591Hz.LJIIIIZZ(LIZ3, dstCreativeInfo.getCreationId()));
            return new OSZ(new DraftFileRestoreException(-506, new RuntimeException(X1D.LIZIZ(LIZ4))), "");
        }
        OSZ osz = new OSZ(new DraftFileRestoreException(r10, r8, i, r8), LIZ3);
        try {
            LJIIZILJ = C44694HgQ.LJIIZILJ(0, str);
            try {
            } catch (Exception e) {
                e = e;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
            fileChannel2 = null;
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
            GX8.LIZLLL(r8);
            GX8.LIZLLL(fileChannel);
            throw th;
        }
        if (LJIIZILJ != null) {
            r10 = LJIIZILJ.getChannel();
            if (r10 != 0) {
                fileChannel2 = new FileOutputStream(LIZ3).getChannel();
                try {
                    r10.transferTo(0L, r10.size(), fileChannel2);
                    fileChannel3 = r10;
                } catch (Exception e3) {
                    e = e3;
                    fileChannel4 = fileChannel2;
                    fileChannel2 = fileChannel4;
                    fileChannel6 = r10;
                    try {
                        osz = new OSZ(new DraftFileRestoreException(-550, e), "");
                        fileChannel3 = fileChannel6;
                        GX8.LIZLLL(fileChannel3);
                        GX8.LIZLLL(fileChannel2);
                        return !((DraftFileRestoreException) osz.getFirst()).isSuc() ? osz : osz;
                    } catch (Throwable th3) {
                        th = th3;
                        r10 = fileChannel6;
                        fileChannel5 = fileChannel2;
                        fileChannel = fileChannel5;
                        r8 = r10;
                        GX8.LIZLLL(r8);
                        GX8.LIZLLL(fileChannel);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileChannel5 = fileChannel2;
                    fileChannel = fileChannel5;
                    r8 = r10;
                    GX8.LIZLLL(r8);
                    GX8.LIZLLL(fileChannel);
                    throw th;
                }
                GX8.LIZLLL(fileChannel3);
                GX8.LIZLLL(fileChannel2);
                if (!((DraftFileRestoreException) osz.getFirst()).isSuc() && LJFF != C78496UrM.LIZ(LIZ3)) {
                    return new OSZ(new DraftFileRestoreException(-551, new RuntimeException(LIZLLL)), "");
                }
            }
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("optInputStream() is null ... , fileDes : ");
        LIZ5.append(str);
        throw new IOException(X1D.LIZIZ(LIZ5));
    }

    public static void LJJJJIZL(String str, String str2, Long l, Integer num, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 128) != 0) {
            num = null;
        }
        JSONObject LJ = C47135Ieh.LJ("step", str, WM7.SCENE_SERVICE, str2);
        LJ.put("duration", l);
        LJ.put("set_up", (Object) null);
        LJ.put("items_count", (Object) null);
        LJ.put("search_source", (Object) null);
        LJ.put("cursor", (Object) null);
        LJ.put("is_success", num);
        C48658J7u.LIZIZ("rd_tiktokec_photo_search_trace", LJ);
    }

    public static final void LJJJZ(String str, char[] destination, int i, int i2, int i3) {
        o.LJIIIZ(str, "<this>");
        o.LJIIIZ(destination, "destination");
        str.getChars(i2, i3, destination, i);
    }

    public static final void LJIILIIL(EnterRoomConfig enterRoomConfig, String str, String str2, int i, LiveStreamUrlExtra.SrConfig srConfig, String str3) {
        o.LJIIIZ(enterRoomConfig, "<this>");
        EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
        streamData.pullSDKParam = null;
        streamData.pullStreamData = str;
        streamData.pullDefaultResolution = str2;
        streamData.streamType = i;
        streamData.options = str3;
        if (srConfig != null) {
            streamData.extraStreamSREnable = srConfig.enabled;
            streamData.extraStreamSRAntiAlias = srConfig.antiAlias;
            streamData.extraStreamSRStrength = srConfig.strength;
        }
    }

    public static final void LJI(InterfaceC07790Sh interfaceC07790Sh, C43401n6 c43401n6, long j, float f, C40431iJ c40431iJ, InterfaceC24520xk interfaceC24520xk, int i) {
        long j2;
        float f2 = f;
        long j3 = j;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        AbstractC34231Vz abstractC34231Vz = c43401n6;
        interfaceC24520xk.LJJIIJ(1956755640);
        if ((i & 1) != 0) {
            interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
        }
        if ((i & 2) != 0) {
            abstractC34231Vz = C21350sd.LIZIZ(interfaceC24520xk).LIZIZ;
        }
        if ((i & 4) != 0) {
            j3 = C21350sd.LIZ(interfaceC24520xk).LJI();
        }
        if ((i & 8) != 0) {
            j2 = C21570sz.LIZIZ(j3, interfaceC24520xk);
        } else {
            j2 = 0;
        }
        if ((i & 32) != 0) {
            f2 = 1;
        }
        C21790tL.LIZ(interfaceC07790Sh2, abstractC34231Vz, j3, j2, null, f2, c40431iJ, interfaceC24520xk, 1769472, 0);
        interfaceC24520xk.LJJIJIIJIL();
    }
}
