package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.broadcast.model.SurveyResponse;
import com.bytedance.apm.block.evil.EvilMethodSwitcher;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.SplashAdConfig;
import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.cct.OpenCCTUtils;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdButtonReshowStrategyModel;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdDisclaimer;
import com.ss.android.ugc.aweme.commercialize.model.AdLynxEntryData;
import com.ss.android.ugc.aweme.commercialize.model.AdNativeProduct;
import com.ss.android.ugc.aweme.commercialize.model.AdProductTile;
import com.ss.android.ugc.aweme.commercialize.model.AdQuestionnaire;
import com.ss.android.ugc.aweme.commercialize.model.AdSlideBackInfoModel;
import com.ss.android.ugc.aweme.commercialize.model.AdStickerData;
import com.ss.android.ugc.aweme.commercialize.model.AdTagStruct;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAwemeRawAd;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.EcUgVSAService;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.AdLive;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.BottomBanner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.DynamicVideo;
import com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.ugc.effectplatform.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import dmt.av.video.ReplayLiveData;
import java.io.Closeable;
import java.io.File;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.OpJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63081OpJ implements NX8, InterfaceC29735Blj, InterfaceC83139Wk3, InterfaceC48038ItG {
    public static boolean LJLIL = false;
    public static boolean LJLILLLLZI = false;
    public static PFC LJLJI = null;
    public static boolean LJLJJI = true;
    public static boolean LJLJJL;
    public static C17J LJLJJLL;
    public static final C63081OpJ LJLJL = new C63081OpJ();

    public static String LJIJI(int i) {
        if (i == 1) {
            return "beauty_brighten";
        }
        if (i == 2) {
            return "beauty_smooth";
        }
        if (i == 4) {
            return "reshape_eye";
        }
        if (i == 5) {
            return "reshape cheek";
        }
        if (i == 9) {
            return "sharp";
        }
        switch (i) {
            case 17:
                return "beauty_lipstick";
            case 18:
                return "beauty_blusher";
            case 19:
                return "beauty_nasolabial";
            case 20:
                return "beauty_pouch";
            default:
                return "";
        }
    }

    @Override // X.InterfaceC83139Wk3
    public void LIZ() {
    }

    @Override // X.InterfaceC83139Wk3
    public void LIZJ() {
    }

    @Override // X.InterfaceC29735Blj
    public void onFailed(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    public static boolean LLFF() {
        if (!TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "genymotion") && !TextUtils.equals(Build.MODEL.toLowerCase(), "virtual machine") && !Build.DEVICE.contains("generic_")) {
            return true;
        }
        return false;
    }

    public static synchronized void LLILZLL() {
        synchronized (C63081OpJ.class) {
            if (LJLJI != null && EvilMethodSwitcher.isOpenLaunchEvilMethod()) {
                LJLJI.LJIILIIL();
            }
        }
    }

    public static synchronized void LLJLLL() {
        synchronized (C63081OpJ.class) {
            if (!LJLIL) {
                return;
            }
            LJLIL = false;
            PFC pfc = LJLJI;
            EvilMethodSwitcher.isLimitEvilMethodDepth();
            pfc.getClass();
            PFC.LJIILJJIL(EvilMethodSwitcher.getEvilThresholdMs());
            C06140Ly.LIZJ("app_launch_evil_method_scene_apm_2");
        }
    }

    public static final IEcomSearchService LJJIJL() {
        IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
        o.LJIIIIZZ(LJJJJZI, "get().getService(IEcomSearchService::class.java)");
        return LJJJJZI;
    }

    public static boolean LJZ() {
        if (!C36839Ed1.LIZIZ(EF7.LIZIZ())) {
            return false;
        }
        return true;
    }

    public static final boolean LLIIJLIL() {
        String LIZ = C85990Xow.LIZ();
        Locale US = Locale.US;
        o.LJIIIIZZ(US, "US");
        String upperCase = LIZ.toUpperCase(US);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return o.LJ(upperCase, "US");
    }

    public static void LIZLLL(Context context) {
        if (!LJLJJL) {
            try {
                Reflect.on(Reflect.on("android.webkit.WebViewDelegate").create().get()).call("addWebViewAssetPath", new Class[]{Context.class}, context);
            } catch (Throwable unused) {
            }
            try {
                C39647FhD.LJ(context);
                FQX.LIZJ(context);
                for (Activity activity : ActivityStack.getActivityStack()) {
                    C39647FhD.LJ(activity);
                    FQX.LIZJ(activity);
                }
            } catch (IllegalStateException unused2) {
            }
            LJLJJL = true;
        }
    }

    public static final boolean LJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String openUrl;
        android.net.Uri parse;
        String scheme;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !TextUtils.isEmpty(awemeRawAd.getAuthorUrl()) || (openUrl = awemeRawAd.getOpenUrl()) == null || (parse = UriProtector.parse(openUrl)) == null || (scheme = parse.getScheme()) == null) {
            return false;
        }
        if (!NPC.LJ(scheme) && !NPC.LJIIJ(openUrl) && !NPC.LJFF(parse)) {
            return false;
        }
        return true;
    }

    public static void LJII(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.4iN] */
    public static C116914iN LJIILJJIL(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        final String str = (String) map.get("s:protrait");
        final String str2 = (String) map.get("s:nick_name");
        final String str3 = (String) map.get("s:basic_ext_info");
        return new Serializable(str, str2, str3) { // from class: X.4iN
            public String basicExtInfo;
            public String senderNickName;
            public String senderPortrait;

            public String getBasicExtInfo() {
                return this.basicExtInfo;
            }

            public String getSenderNickName() {
                return this.senderNickName;
            }

            public String getSenderPortrait() {
                return this.senderPortrait;
            }

            {
                this.senderPortrait = str;
                this.senderNickName = str2;
                this.basicExtInfo = str3;
            }
        };
    }

    public static String LJIILLIIL(java.util.Map map) {
        if (map == null) {
            return "";
        }
        try {
            if (map.size() <= 0) {
                return "";
            }
            return C63682Oz0.LIZ.LJIILL(map);
        } catch (Exception unused) {
            return "";
        }
    }

    public static C39670Fha LJIIZILJ(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                C39670Fha c39670Fha = new C39670Fha(3);
                if (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next) && next.hashCode() == 1481071862 && next.equals("country_code")) {
                        c39670Fha.LJLIL = Integer.valueOf(jSONObject.optInt(next));
                    }
                }
                return c39670Fha;
            }
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static String LJIJ(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static final boolean LJIJJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isDisableLikeType()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        Integer searchDeliveryType;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || (searchDeliveryType = searchAdInfo.getSearchDeliveryType()) == null) {
            return false;
        }
        int intValue = searchDeliveryType.intValue();
        if (intValue != 3 && (intValue != 1 || !CommerceSearchAdConfigSetting.LIZ().enableDedupShowAndOmsdk)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!LJLJJL(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getFakeAuthor() == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJJI(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (H7R.LJJJLL(videoPublishEditModel) && e1.LIZ(31744, "allow_post_single_photo_as_photo_mode_story", true, false) && C150325vA.LIZ()) {
            return true;
        }
        if (H7R.LJJJJL(videoPublishEditModel) && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null && !imageList.isEmpty() && e1.LIZ(31744, "allow_post_album_as_story", true, false)) {
            return true;
        }
        return false;
    }

    public static final C73G LJJII(C8W0 c8w0) {
        o.LJIIIZ(c8w0, "<this>");
        return (C73G) new C55749LuL(C47704Ins.LIZJ(c8w0, C73G.class, null), c8w0.checkSupervisorPrepared()).getValue();
    }

    public static final AdStickerData LJJIIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return awemeRawAd.getStickerData();
        }
        return null;
    }

    public static final String LJJIIZI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String webUrl;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (webUrl = awemeRawAd.getWebUrl()) == null) {
            return "";
        }
        return webUrl;
    }

    public static final TopViewAwemeRawAd LJJIJ(NPX npx) {
        if (npx.LJZ()) {
            return npx.LIZ();
        }
        return null;
    }

    public static final String LJJIJIIJI(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        String bCHashtag;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (bCHashtag = commerceVideoAuthInfo.getBCHashtag()) == null) {
            return "";
        }
        return bCHashtag;
    }

    public static final CardStruct LJJIJIIJIL(Aweme aweme) {
        CardStruct followCardInfo;
        if (aweme == null) {
            return null;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (followCardInfo = awemeRawAd.getLiveCardInfo()) == null) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                followCardInfo = awemeRawAd2.getFollowCardInfo();
                if (followCardInfo == null) {
                    if (aweme == null) {
                        return null;
                    }
                }
            }
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 == null) {
                return null;
            }
            return awemeRawAd3.getDefaultCardInfo();
        }
        return followCardInfo;
    }

    public static String LJJIJIL(long j) {
        if (j >= 1000000) {
            StringBuilder LIZ = X1D.LIZ();
            return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000000.0d)}, LIZ, "m", LIZ);
        }
        if (j >= 1000) {
            StringBuilder LIZ2 = X1D.LIZ();
            return C03660Ck.LIZIZ("%.1f", new Object[]{C1DD.LIZJ(j, 1.0d, 1000.0d)}, LIZ2, "k", LIZ2);
        }
        return String.valueOf(j);
    }

    public static final String LJJIJLIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdLive adLive;
        String buttonText;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adLive = awemeRawAd.getAdLive()) == null || (buttonText = adLive.getButtonText()) == null) {
            return "";
        }
        return buttonText;
    }

    public static final String LJJIZ(Aweme aweme) {
        AwemeSplashInfo LJJJJZI;
        String splashButtonText;
        if (aweme == null || (LJJJJZI = LJJJJZI(aweme)) == null || (splashButtonText = LJJJJZI.getSplashButtonText()) == null) {
            return "";
        }
        return splashButtonText;
    }

    public static final CardStruct LJJJ(Aweme aweme) {
        CardStruct LJJIJIIJIL = LJJIJIIJIL(aweme);
        if (LJJIJIIJIL != null && LJJIJIIJIL.getCardType() == 14) {
            return LJJIJIIJIL;
        }
        return null;
    }

    public static final CardStruct LJJJI(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        CardStruct cardStruct;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (cardStruct = commerceVideoAuthInfo.getCardStruct()) == null || cardStruct.getCardType() != 14) {
            return null;
        }
        return cardStruct;
    }

    public static final CardStruct LJJJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        java.util.Map<String, CardStruct> cardInfos;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (cardInfos = awemeRawAd.getCardInfos()) == null) {
            return null;
        }
        return cardInfos.get("5");
    }

    public static final AwemeRawAd LJJJJI(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null) {
            return null;
        }
        return commerceVideoAuthInfo.getPseudoAdData();
    }

    public static final int LJJJJIZL(String str) {
        int LJJLIIIJJIZ;
        int LJJLIIIJJIZ2 = s.LJJLIIIJJIZ(str, File.separatorChar, 0, false, 4);
        if (LJJLIIIJJIZ2 == 0) {
            if (str.length() > 1) {
                char charAt = str.charAt(1);
                char c = File.separatorChar;
                if (charAt == c && (LJJLIIIJJIZ = s.LJJLIIIJJIZ(str, c, 2, false, 4)) >= 0) {
                    int LJJLIIIJJIZ3 = s.LJJLIIIJJIZ(str, File.separatorChar, LJJLIIIJJIZ + 1, false, 4);
                    if (LJJLIIIJJIZ3 >= 0) {
                        return LJJLIIIJJIZ3 + 1;
                    }
                    return str.length();
                }
            }
            return 1;
        }
        if (LJJLIIIJJIZ2 > 0) {
            if (str.charAt(LJJLIIIJJIZ2 - 1) == ':') {
                return LJJLIIIJJIZ2 + 1;
            }
        } else if (LJJLIIIJJIZ2 == -1 && s.LJJL(str, ':')) {
            return str.length();
        }
        return 0;
    }

    public static final int LJJJJJL(Context context) {
        o.LJIIIZ(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return 0;
    }

    public static final int LJJJJL(Context context) {
        o.LJIIIZ(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return 0;
    }

    public static final int LJJJJLI(Context context) {
        o.LJIIIZ(context, "<this>");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final List LJJJJLL(InterfaceC82400WVo stickerChallenge) {
        o.LJIIIZ(stickerChallenge, "$this$stickerChallenge");
        F4V LLLIIII = stickerChallenge.LLLIIII(C63083OpL.INSTANCE);
        if (!(LLLIIII instanceof C46216IBw)) {
            LLLIIII = null;
        }
        C46216IBw c46216IBw = (C46216IBw) LLLIIII;
        if (c46216IBw == null) {
            return null;
        }
        return c46216IBw.LJLILLLLZI;
    }

    public static final String LJJJJZ(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            return commerceVideoAuthInfo.getStudyId();
        }
        return null;
    }

    public static final AwemeSplashInfo LJJJJZI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return awemeRawAd.getSplashInfo();
        }
        return null;
    }

    public static final AwemeSplashInfo LJJJLIIL(NPX npx) {
        TopViewAwemeRawAd LJJIJ = LJJIJ(npx);
        if (LJJIJ != null) {
            return LJJIJ.getSplashInfo();
        }
        return null;
    }

    public static final String LJJJLL(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        String adFeedBackEntrance;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (adFeedBackEntrance = commerceVideoAuthInfo.getAdFeedBackEntrance()) == null) {
            return "";
        }
        return adFeedBackEntrance;
    }

    public static final boolean LJJJLZIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        NativeAuthorInfo nativeAuthorInfo;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if ((author != null && author.isAdFake()) || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || nativeAuthorInfo.getBottomBanner() == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJZ(Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd.getWebUrl();
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    public static final boolean LJJL(Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd.getOpenUrl();
        } else {
            str = null;
        }
        return NPC.LJI(str);
    }

    public static final boolean LJJLI(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (!LJLL(aweme) || aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isHasUserSubmittedFeedback()) {
            return false;
        }
        return true;
    }

    public static final void LJJLIIIIJ(InterfaceC82400WVo hideGuide) {
        o.LJIIIZ(hideGuide, "$this$hideGuide");
        F4V LLLIIII = hideGuide.LLLIIII(C63082OpK.INSTANCE);
        if (!(LLLIIII instanceof IDD)) {
            LLLIIII = null;
        }
        IDD idd = (IDD) LLLIIII;
        if (idd != null) {
            idd.LJLIL.hide();
        }
    }

    public static final boolean LJJLIIIJILLIZJL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && aweme.isAd() && aweme.getAwemeRawAd() != null && ((awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getAceSceneType() != 0)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIIIJJI(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIJJIZ(Aweme aweme) {
        String extra;
        boolean z;
        boolean z2;
        if (aweme != null) {
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            if (anchors != null) {
                Iterator<AnchorCommonStruct> it = anchors.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnchorCommonStruct next = it.next();
                    if (next.getType() == 24 && (extra = next.getExtra()) != null && extra.length() != 0) {
                        Boolean bool = (Boolean) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.parse(new com.google.gson.o(), next.getExtra()).LJIIZILJ().LJJIJ("is_schema_lynx"), new C63086OpO().getType());
                        if (bool != null && bool.booleanValue()) {
                            return true;
                        }
                    }
                }
            }
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null || TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
                return false;
            }
            if (awemeRawAd.getWebviewType() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (awemeRawAd.getProfileWithWebview() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJLIIIJL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AdDisclaimer disclaimer;
        AwemeRawAd awemeRawAd4;
        AdDisclaimer disclaimer2;
        String lightWebUrl;
        AwemeRawAd awemeRawAd5;
        String str = null;
        if (aweme == null || (((awemeRawAd2 = aweme.getAwemeRawAd()) == null || (lightWebUrl = awemeRawAd2.getLightWebUrl()) == null || lightWebUrl.length() <= 0 || (awemeRawAd5 = aweme.getAwemeRawAd()) == null || awemeRawAd5.getWebviewType() != 0) && !LLIFFJFJJ(aweme) && ((awemeRawAd3 = aweme.getAwemeRawAd()) == null || (disclaimer = awemeRawAd3.getDisclaimer()) == null || disclaimer.getType() == 0 || (awemeRawAd4 = aweme.getAwemeRawAd()) == null || (disclaimer2 = awemeRawAd4.getDisclaimer()) == null || disclaimer2.getType() != 2))) {
            C58283Mu7 c58283Mu7 = C58283Mu7.LIZIZ;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                str = awemeRawAd.getWebUrl();
            }
            if (!c58283Mu7.LIZIZ(str) && (aweme == null || !LJJLIIIJILLIZJL(aweme))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJLIIIJLJLI(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 34) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIJLLLLLLLZ(Aweme aweme) {
        String str;
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str = awemeRawAd.getType();
            } else {
                str = null;
            }
            if (o.LJ(str, "app")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJLIIJ(Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        String str2 = null;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd2.getType();
        } else {
            str = null;
        }
        if (!o.LJ(str, "app") || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getWebType() != 1) {
            return false;
        }
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            str2 = awemeRawAd3.getWebUrl();
        }
        if (!C78685UuP.LJJJZ(str2)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIL(Aweme aweme) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && awemeRawAd.getBrandSafetyType() == EnumC62232cN.ONE_PART_BRAND_SAFETY_AD.ordinal()) {
                return true;
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && awemeRawAd2.getBrandSafetyType() == EnumC62232cN.THIRD_PART_BRAND_SAFETY_AD.ordinal()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJLJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && o.LJ(awemeRawAd.getType(), "phone") && !TextUtils.isEmpty(awemeRawAd.getPhoneNumber())) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLJLI(Aweme aweme) {
        User author;
        AwemeRawAd awemeRawAd;
        if (aweme != null && aweme.isAd() && aweme.getAuthor() != null && (((author = aweme.getAuthor()) == null || !author.isAdFake()) && (awemeRawAd = aweme.getAwemeRawAd()) != null && o.LJ(awemeRawAd.getType(), "message") && awemeRawAd.getSystemOrigin() != 51)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLL(Aweme aweme) {
        LinkData LIZ = C63077OpF.LIZ(aweme);
        if (LIZ == null || LIZ.feedShowType != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LJJZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        List<AdTagStruct> adTags;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adTags = awemeRawAd.getAdTags()) == null || adTags.isEmpty()) {
            return false;
        }
        for (AdTagStruct adTagStruct : adTags) {
            if (adTagStruct.getPosition() == 1 && !TextUtils.isEmpty(adTagStruct.getTagText())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJZZI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) == null || !photoCarouselInfo.getEnableLabel()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJZZIII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdDescriptiveCTA() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        NativeSiteConfig nativeSiteConfig;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNonNativeClick() == 0 && (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) != null && TextUtils.equals(nativeSiteConfig.getRenderType(), "lynx") && !TextUtils.isEmpty(nativeSiteConfig.getLynxScheme())) {
            return true;
        }
        return false;
    }

    public static final boolean LJLI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        List<AdTagStruct> adTags;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adTags = awemeRawAd.getAdTags()) == null || adTags.isEmpty()) {
            return false;
        }
        for (AdTagStruct adTagStruct : adTags) {
            if (adTagStruct.getPosition() == 2 && !TextUtils.isEmpty(adTagStruct.getTagText())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJLIIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdSlideBackInfoModel slideBackInfoModel;
        AdButtonReshowStrategyModel buttonStrategy;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && (slideBackInfoModel = awemeRawAd.getSlideBackInfoModel()) != null && (buttonStrategy = slideBackInfoModel.getButtonStrategy()) != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && awemeRawAd2.isReshowCTA()) {
            if (buttonStrategy.getTriggerCondition() == 1) {
                return true;
            }
            if (buttonStrategy.getTriggerCondition() == 2 && (awemeRawAd3 = aweme.getAwemeRawAd()) != null && awemeRawAd3.isCTAFirstShown()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJLIIL(LifecycleRegistry lifecycle) {
        o.LJIIIZ(lifecycle, "lifecycle");
        if (C214368bA.LJIIIZ && C16880lQ.LLJJIJIL(lifecycle.getCurrentState(), Lifecycle.State.DESTROYED) <= 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJLIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getSystemOrigin() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJLILLLLZI(Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd.getType();
        } else {
            str = null;
        }
        return TextUtils.equals(str, "app");
    }

    public static final boolean LJLJI(Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        DynamicVideo dynamicVideo;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (dynamicVideo = awemeRawAd.getDynamicVideo()) != null) {
            str = dynamicVideo.getLynxScheme();
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    public static final boolean LJLJJI(Aweme aweme) {
        Integer valueOf;
        if (aweme == null || !LJLJI(aweme)) {
            return false;
        }
        FeedAdServiceImpl.LJJIJLIJ().LJIIJJI();
        C59201NLh LJFF = C59198NLe.LJFF(aweme.getAid());
        if (LJFF != null && (valueOf = Integer.valueOf(LJFF.LIZJ)) != null && valueOf.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJLJJL(Aweme aweme) {
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null || !author.isAdFake()) {
            return false;
        }
        return true;
    }

    public static final boolean LJLJJLL(Aweme aweme) {
        if (!LJJLIIIJJI(aweme) || aweme == null) {
            return false;
        }
        if (aweme.isLive()) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null || !author.isLive() || !C1DF.LJIL(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LJLJL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getSystemOrigin() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJLJLJ(Aweme aweme) {
        Integer valueOf;
        User author = aweme.getAuthor();
        if (author == null || ((valueOf = Integer.valueOf(author.getFollowStatus())) != null && (valueOf.intValue() == 0 || valueOf.intValue() == 4))) {
            return false;
        }
        return true;
    }

    public static boolean LJLJLLL(Aweme aweme) {
        if (aweme != null && aweme.getTakeDownReason() == 6) {
            return true;
        }
        return false;
    }

    public static final boolean LJLL(Aweme aweme) {
        if (aweme != null && aweme.getCommerceVideoAuthInfo() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJLLI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdInteractionData adInteractionData;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adInteractionData = awemeRawAd.getAdInteractionData()) != null && adInteractionData.getGestureGuidance() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJLLILLLL(Context context) {
        o.LJIIIZ(context, "<this>");
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    public static final boolean LJLLJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getButtonType() != 1 || awemeRawAd.getAnimationType() == -1) {
            return false;
        }
        return true;
    }

    public static final boolean LJLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdLynxEntryData lynxEntryData;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (lynxEntryData = awemeRawAd.getLynxEntryData()) != null && lynxEntryData.getEntryType() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJLLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdType() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean LJLLLLLL(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (!LJLL(aweme) || aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isMusicNotClickable()) {
            return false;
        }
        return true;
    }

    public static final boolean LJLZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getSystemOrigin() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJZI(Context context) {
        o.LJIIIZ(context, "<this>");
        if (Math.min(r3.widthPixels, r3.heightPixels) > context.getResources().getDisplayMetrics().density * 650) {
            return true;
        }
        return false;
    }

    public static final boolean LJZL(Aweme aweme) {
        if (aweme != null && aweme.isAd() && aweme.isPhotoMode()) {
            return true;
        }
        return false;
    }

    public static final boolean LL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getPlayFunModel() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLD(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && !LJLJJL(aweme) && TextUtils.equals(awemeRawAd.getType(), "message") && awemeRawAd.getSystemOrigin() == 51) {
            return true;
        }
        return false;
    }

    public static final boolean LLF(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isPseudoAd() || commerceVideoAuthInfo.getPseudoAdData() == null) {
            return false;
        }
        return true;
    }

    public static boolean LLFII(Aweme aweme) {
        if (LJLJLLL(aweme) && C78996UzQ.LJJIIZI(aweme)) {
            return true;
        }
        return false;
    }

    public static final boolean LLFZ(Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        AdQuestionnaire adQuestionnaire;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adQuestionnaire = awemeRawAd.getAdQuestionnaire()) != null) {
            str = adQuestionnaire.getSchema();
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    public static final boolean LLI(Aweme aweme) {
        if (LJJJ(aweme) != null || LLIFFJFJJ(aweme)) {
            return true;
        }
        return false;
    }

    public static final boolean LLIFFJFJJ(Aweme aweme) {
        if (LJJJI(aweme) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLII(Aweme aweme) {
        AdProductTile adProductTile;
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            adProductTile = awemeRawAd.getProductTile();
        } else {
            adProductTile = null;
        }
        if (adProductTile == null) {
            return false;
        }
        if (!TextUtils.isEmpty(adProductTile.getContainerType()) && !o.LJ(adProductTile.getContainerType(), "lynx")) {
            return false;
        }
        return true;
    }

    public static final boolean LLIIII(Aweme aweme) {
        String str;
        AwemeSplashInfo LJJJJZI = LJJJJZI(aweme);
        if (LJJJJZI != null) {
            str = LJJJJZI.getAwesomeSplashId();
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    public static final boolean LLIIIILZ(Aweme aweme) {
        AwemeSplashInfo LJJJJZI = LJJJJZI(aweme);
        if (LJJJJZI == null || TextUtils.isEmpty(LJJJJZI.getAwesomeSplashId()) || LJJJJZI.getSplashFeedType() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LLIIIJ(Aweme aweme) {
        boolean z = false;
        if (!LLIIIILZ(aweme)) {
            return false;
        }
        AwemeSplashInfo LJJJJZI = LJJJJZI(aweme);
        if (LJJJJZI != null && LJJJJZI.hasUpdateLiving) {
            z = true;
        }
        return !z;
    }

    public static final boolean LLIIIL(Aweme aweme) {
        User author;
        if (!LLIIIILZ(aweme)) {
            return false;
        }
        if (LLIIIJ(aweme)) {
            return true;
        }
        if (aweme == null || (author = aweme.getAuthor()) == null || !author.isLive()) {
            return false;
        }
        return true;
    }

    public static final boolean LLIIIZ(Aweme aweme) {
        int i;
        AwemeSplashInfo LJJJJZI = LJJJJZI(aweme);
        if (LJJJJZI != null) {
            i = LJJJJZI.getEndTime();
        } else {
            i = 0;
        }
        if (i >= System.currentTimeMillis() / 1000) {
            return false;
        }
        return true;
    }

    public static final boolean LLIIJI(Aweme aweme) {
        AwemeSplashInfo LJJJJZI = LJJJJZI(aweme);
        if (LJJJJZI == null || !LJJJJZI.isShown()) {
            return false;
        }
        return true;
    }

    public static final boolean LLIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (((aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isOpenSystemBrowser()) && !OpenCCTUtils.LJFF().LIZLLL(aweme)) || LJL(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LLIILII(Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            str = awemeRawAd.getType();
        } else {
            str = null;
        }
        return TextUtils.equals(str, "web");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static List LLILLL(java.net.URI uri) {
        String str;
        ?? emptyList = Collections.emptyList();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyList = new ArrayList();
            Scanner scanner = new Scanner(rawQuery);
            scanner.useDelimiter("&");
            while (scanner.hasNext()) {
                String[] split = scanner.next().split("=");
                if (split.length != 0 && split.length <= 2) {
                    String LJIJ = LJIJ(split[0]);
                    if (split.length == 2) {
                        str = LJIJ(split[1]);
                    } else {
                        str = null;
                    }
                    emptyList.add(new C66619QCp(LJIJ, str));
                } else {
                    throw new IllegalArgumentException("bad parameter");
                }
            }
        }
        return emptyList;
    }

    public static java.util.Map LLILZIL(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public static final boolean LLIZLLLIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!LJJLIIIJILLIZJL(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getAceSceneType() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LLJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        if (!LJJJLZIJ(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || TextUtils.isEmpty(awemeRawAd.getOpenUrl()) || !awemeRawAd.isOpenUrlSupportPullUp() || awemeRawAd.isDisableUserprofileAdLabel() || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || (bottomBanner = nativeAuthorInfo.getBottomBanner()) == null || bottomBanner.getVersion() != 1 || nativeAuthorInfo.getAutoPullStyle() != 1) {
            return false;
        }
        return !EcUgVSAService.LJIIJJI().LIZLLL(awemeRawAd.getOpenUrl());
    }

    public static final boolean LLJI(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || C78977Uz7.LJJJJL(awemeRawAd) || LJJL(aweme) || TextUtils.isEmpty(awemeRawAd.getWebUrl()) || !C78977Uz7.LJJLIIIJJI(awemeRawAd) || !C78977Uz7.LJJLIIIJILLIZJL(awemeRawAd) || !LJLILLLLZI(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LLJIJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        if (!LJJJLZIJ(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || !o.LJ(awemeRawAd.getType(), "app") || TextUtils.isEmpty(awemeRawAd.getWebUrl()) || LJJL(aweme) || awemeRawAd.isDisableUserprofileAdLabel() || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || (bottomBanner = nativeAuthorInfo.getBottomBanner()) == null || bottomBanner.getVersion() != 1 || nativeAuthorInfo.getAutoPullStyle() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LLJILJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || !C78977Uz7.LJJLIIIJJI(awemeRawAd) || ((C78977Uz7.LJJJJL(awemeRawAd) || !LJJL(aweme)) && ((C78977Uz7.LJJJJL(awemeRawAd) || LJJL(aweme) || C78977Uz7.LJJLIIIJILLIZJL(awemeRawAd) || !LJLILLLLZI(aweme)) && (!C78977Uz7.LJJJJL(awemeRawAd) || !LJLILLLLZI(aweme))))) {
            return false;
        }
        return true;
    }

    public static final boolean LLJILJILJ(Aweme aweme) {
        String str;
        if (aweme == null || !LJJLIIIJLLLLLLLZ(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            str = awemeRawAd.getLightWebUrl();
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    public static final boolean LLJILLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdSlideBackInfoModel slideBackInfoModel;
        AdButtonReshowStrategyModel buttonStrategy;
        if (aweme != null && LJLIIIL(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (slideBackInfoModel = awemeRawAd.getSlideBackInfoModel()) != null && (buttonStrategy = slideBackInfoModel.getButtonStrategy()) != null && buttonStrategy.getShowColorSeconds() > buttonStrategy.getShowSeconds()) {
            return true;
        }
        return false;
    }

    public static final boolean LLJJ(Aweme aweme) {
        String[] strArr;
        boolean z = false;
        if (aweme == null || !LLIIII(aweme) || !LJJLIIIJLLLLLLLZ(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String str = null;
        if (awemeRawAd != null) {
            str = awemeRawAd.getPackageName();
        }
        try {
            SettingsManager.LIZLLL().getClass();
            SplashAdConfig splashAdConfig = (SplashAdConfig) SettingsManager.LJII("ad_splash_config", SplashAdConfig.class);
            if (splashAdConfig != null && (strArr = splashAdConfig.appNameAllowList) != null && ORY.LJJIJIIJIL(str, strArr)) {
                z = true;
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
        return !z;
    }

    public static final boolean LLJJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String webUrl;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (webUrl = awemeRawAd.getWebUrl()) == null) {
            return false;
        }
        return ujb.o.LJJJJ(webUrl, ".apk", false);
    }

    public static final boolean LLJJIII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdDescriptiveCTAStruct adDescriptiveCTA;
        if ((aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (!awemeRawAd.isHideMusicDisk() && ((adDescriptiveCTA = awemeRawAd.getAdDescriptiveCTA()) == null || !adDescriptiveCTA.getHideMusicDisc()))) && (!LJLLJ(aweme) || !LLJLL(aweme))) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJIJI(Aweme aweme) {
        if (!aweme.isAd() || LJLIL(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJIJIIJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || TextUtils.isEmpty(awemeRawAd.getOpenUrl())) {
            return false;
        }
        return awemeRawAd.isOpenUrlSupportPullUp();
    }

    public static final boolean LLJJIJIL(Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        if (!aweme.isAd()) {
            return false;
        }
        String str2 = null;
        if (LLIIIILZ(aweme) && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && awemeRawAd2.getCallToActionBarInfo() != null) {
            return LLIIIL(aweme);
        }
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            str = awemeRawAd3.getWebUrl();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null) {
                str2 = awemeRawAd4.getType();
            }
            if (!TextUtils.equals(str2, "app")) {
                return false;
            }
        }
        User author = aweme.getAuthor();
        if (author != null && author.isAdFake()) {
            return false;
        }
        AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
        if (awemeRawAd5 != null && awemeRawAd5.getCallToActionBarInfo() != null) {
            return true;
        }
        if (!LLD(aweme) && ((awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isDisableUserprofileAdLabel())) {
            return true;
        }
        return false;
    }

    public static final boolean LLJJJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeTextLabelModel label;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (label = awemeRawAd.getLabel()) == null || label.getCompliancePosition() != 4) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJJIL(Aweme aweme) {
        CardStruct LJJJIL = LJJJIL(aweme);
        if (LJJJIL == null) {
            return false;
        }
        if (LJJJIL.getCardType() != 13 && LJJJIL.getCardType() != 15) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJJJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        java.util.Map<String, CardStruct> cardInfos;
        CardStruct cardStruct;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (cardInfos = awemeRawAd.getCardInfos()) == null || (cardStruct = cardInfos.get("3")) == null || cardStruct.getCardSubType() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJJJJIL(Aweme aweme) {
        if (aweme != null && LJJIIZ(aweme) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLJJJJLIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdLynxEntryData lynxEntryData;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (lynxEntryData = awemeRawAd.getLynxEntryData()) != null && lynxEntryData.getEntryType() != 0 && lynxEntryData.getLynxScheme() != null && lynxEntryData.getGeckoChannel() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLJJL(Aweme aweme) {
        AdProductTile adProductTile;
        List<AdNativeProduct> productList;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            adProductTile = awemeRawAd.getProductTile();
        } else {
            adProductTile = null;
        }
        if (adProductTile == null || !TextUtils.equals(adProductTile.getContainerType(), "native") || (productList = adProductTile.getProductList()) == null || !(!productList.isEmpty())) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJLIIIJLLLLLLLZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!LJJLIIIJJI(aweme) || aweme == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if ((author != null && author.isAdFake()) || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        if (LLIIIILZ(aweme)) {
            if (awemeRawAd.getCallToActionBarInfo() == null || !LLIIIL(aweme)) {
                return false;
            }
            return true;
        }
        if (C1DF.LJIL(aweme)) {
            if (!LJLJJLL(aweme) || awemeRawAd.getCallToActionBarInfo() == null) {
                return false;
            }
        } else if (awemeRawAd.getCallToActionBarInfo() == null || TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
            return false;
        }
        return true;
    }

    public static final boolean LLJL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        if (!LJJJLZIJ(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || (bottomBanner = nativeAuthorInfo.getBottomBanner()) == null) {
            return false;
        }
        if ((TextUtils.isEmpty(awemeRawAd.getOpenUrl()) && !o.LJ(awemeRawAd.getType(), "app") && !o.LJ(awemeRawAd.getType(), "phone") && !LJJLJLI(aweme)) || bottomBanner.getVersion() != 1 || awemeRawAd.isDisableUserprofileAdLabel()) {
            return false;
        }
        return true;
    }

    public static final boolean LLJLIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        AwemeRawAd awemeRawAd2;
        NativeSiteConfig nativeSiteConfig;
        if (!LJJJLZIJ(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || !o.LJ(awemeRawAd.getType(), "web") || !TextUtils.isEmpty(awemeRawAd.getOpenUrl())) {
            return false;
        }
        if ((TextUtils.isEmpty(awemeRawAd.getWebUrl()) && ((awemeRawAd2 = aweme.getAwemeRawAd()) == null || (nativeSiteConfig = awemeRawAd2.getNativeSiteConfig()) == null || !o.LJ(nativeSiteConfig.getRenderType(), "lynx") || TextUtils.isEmpty(nativeSiteConfig.getLynxScheme()))) || awemeRawAd.isDisableUserprofileAdLabel() || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || (bottomBanner = nativeAuthorInfo.getBottomBanner()) == null || bottomBanner.getVersion() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LLJLILLLLZIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!LJLJJL(aweme)) {
            return false;
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdAvatarLinkTagStyle() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LLJLL(Aweme aweme) {
        AdButtonReshowStrategyModel buttonStrategy;
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        if (LLIIIL(aweme)) {
            return true;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return false;
        }
        if (LJLIIIL(aweme)) {
            AdSlideBackInfoModel slideBackInfoModel = awemeRawAd.getSlideBackInfoModel();
            if (slideBackInfoModel != null && (buttonStrategy = slideBackInfoModel.getButtonStrategy()) != null && buttonStrategy.getShowSeconds() == 0) {
                return true;
            }
            return false;
        }
        if ((!TextUtils.isEmpty(awemeRawAd.getWebUrl()) || LLD(aweme)) && (awemeRawAd.getAnimationType() == 1 || awemeRawAd.getAnimationType() == 2)) {
            return true;
        }
        return false;
    }

    public static final boolean LLJLLIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getAdTagPosition() != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.OQg] */
    public static final OR8 LLJZ(File file) {
        ?? arrayList;
        String path = file.getPath();
        o.LJIIIIZZ(path, "path");
        int LJJJJIZL = LJJJJIZL(path);
        String substring = path.substring(0, LJJJJIZL);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(LJJJJIZL);
        o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            arrayList = C61878OQg.INSTANCE;
        } else {
            List LJLJJI2 = s.LJLJJI(substring2, new char[]{File.separatorChar}, false, 6);
            arrayList = new ArrayList(C32I.LJJL(LJLJJI2, 10));
            Iterator it = LJLJJI2.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
        }
        return new OR8(new File(substring), arrayList);
    }

    public static final EnumC43998HOo LLJZIJLIL(int i) {
        for (EnumC43998HOo enumC43998HOo : EnumC43998HOo.values()) {
            if (enumC43998HOo.getValue() == i) {
                return enumC43998HOo;
            }
        }
        return null;
    }

    public static final E94 LLL(String str) {
        o.LJIIIZ(str, "<this>");
        return new E94(str);
    }

    @Override // X.InterfaceC29735Blj
    public void LIZIZ(SurveyResponse surveyResponse) {
        o.LJIIIZ(surveyResponse, "surveyResponse");
        C63100Opc.LIZ = surveyResponse.courseTheme;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        java.util.Map it = (java.util.Map) obj;
        o.LJIIIZ(it, "it");
        return TemplateData.LJ(it);
    }

    public static final Integer LJ(C132005Ga c132005Ga, NLETrackSlot slot) {
        View view;
        o.LJIIIZ(c132005Ga, "<this>");
        o.LJIIIZ(slot, "slot");
        View view2 = (View) ((ArrayMap) c132005Ga.LJLL).get(slot.getUUID());
        if (view2 == null) {
            return null;
        }
        Object parent = view2.getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return null;
        }
        return Integer.valueOf(view.getWidth());
    }

    public static final Rect LJFF(C132005Ga c132005Ga, NLETrackSlot slot) {
        o.LJIIIZ(c132005Ga, "<this>");
        o.LJIIIZ(slot, "slot");
        View view = (View) ((ArrayMap) c132005Ga.LJLL).get(slot.getUUID());
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i = iArr[0];
            int i2 = iArr[1];
            return new Rect(i, i2, measuredWidth + i, measuredHeight + i2);
        }
        return null;
    }

    public static C63090OpS LJIIJ(C63090OpS c63090OpS, ConversationSettingInfo conversationSettingInfo) {
        int i;
        int i2;
        if (c63090OpS == null) {
            c63090OpS = new C63090OpS();
            c63090OpS.setConversationId(conversationSettingInfo.conversation_id);
        }
        Long l = conversationSettingInfo.setting_version;
        if (l != null && l.longValue() >= c63090OpS.getVersion()) {
            Integer num = conversationSettingInfo.mute;
            int i3 = 0;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            c63090OpS.setMute(i);
            Integer num2 = conversationSettingInfo.stick_on_top;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            c63090OpS.setStickTop(i2);
            c63090OpS.setExt(conversationSettingInfo.ext);
            Integer num3 = conversationSettingInfo.favorite;
            if (num3 != null) {
                i3 = num3.intValue();
            }
            c63090OpS.setFavor(i3);
            c63090OpS.setVersion(conversationSettingInfo.setting_version.longValue());
            c63090OpS.setSetTopTime(conversationSettingInfo.set_top_time.longValue());
            c63090OpS.setSetFavoriteTime(conversationSettingInfo.set_favorite_time.longValue());
            EnumC96103pu enumC96103pu = conversationSettingInfo.category;
            if (enumC96103pu == null) {
                enumC96103pu = EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY;
            }
            c63090OpS.setCategory(enumC96103pu.getValue());
        }
        return c63090OpS;
    }

    public static C63089OpR LJIIJJI(String str, Participant participant) {
        if (participant == null || participant.user_id == null) {
            return null;
        }
        C63089OpR c63089OpR = new C63089OpR();
        c63089OpR.setConversationId(str);
        c63089OpR.setUid(participant.user_id.longValue());
        c63089OpR.setSecUid(participant.sec_uid);
        Integer num = participant.role;
        if (num != null) {
            c63089OpR.setRole(num.intValue());
        }
        c63089OpR.setAlias(participant.alias);
        Long l = participant.sort_order;
        if (l != null) {
            c63089OpR.setSortOrder(l.longValue());
        }
        EnumC63751P0h enumC63751P0h = participant.blocked;
        if (enumC63751P0h != null) {
            c63089OpR.setSilent(enumC63751P0h.getValue());
        }
        Long l2 = participant.left_block_time;
        if (l2 != null) {
            c63089OpR.setSilentTime(l2.longValue());
        }
        return c63089OpR;
    }

    public static List LJIILL(String str, List list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Participant participant = (Participant) it.next();
            if (participant.user_id != null) {
                C63089OpR c63089OpR = new C63089OpR();
                c63089OpR.setConversationId(str);
                c63089OpR.setAlias(participant.alias);
                Integer num = participant.role;
                if (num != null) {
                    c63089OpR.setRole(num.intValue());
                }
                Long l = participant.sort_order;
                if (l != null) {
                    c63089OpR.setSortOrder(l.longValue());
                }
                EnumC63751P0h enumC63751P0h = participant.blocked;
                if (enumC63751P0h != null) {
                    c63089OpR.setSilent(enumC63751P0h.getValue());
                }
                Long l2 = participant.left_block_time;
                if (l2 != null) {
                    c63089OpR.setSilentTime(l2.longValue());
                }
                c63089OpR.setUid(participant.user_id.longValue());
                c63089OpR.setSecUid(participant.sec_uid);
                arrayList.add(c63089OpR);
            }
        }
        return arrayList;
    }

    public static int LJIJJLI(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static String LJJIFFI(String str, String str2) {
        try {
            if (str2 == null) {
                return URLEncoder.encode(str, "ISO-8859-1");
            }
            if (str2.equals("null_encoding")) {
                return str;
            }
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String LJJIII(List list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC49552Jca interfaceC49552Jca = (InterfaceC49552Jca) it.next();
            String LJJIFFI = LJJIFFI(interfaceC49552Jca.getName(), str);
            String value = interfaceC49552Jca.getValue();
            if (value != null) {
                str2 = LJJIFFI(value, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            C1DI.LIZIZ(sb, LJJIFFI, "=", str2);
        }
        return sb.toString();
    }

    public static final int LJJIIJ(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeTextLabelModel label;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (label = awemeRawAd.getLabel()) == null) {
            return -1;
        }
        int labelBgColor = label.getLabelBgColor();
        if (labelBgColor != 1) {
            if (labelBgColor != 400) {
                return -1;
            }
            return C78609UtB.LJJJ(R.attr.d7, context);
        }
        return 0;
    }

    public static final int LJJIIJZLJL(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeTextLabelModel label;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (label = awemeRawAd.getLabel()) == null) {
            return -1;
        }
        int labelTextColor = label.getLabelTextColor();
        if (labelTextColor != 1) {
            switch (labelTextColor) {
                case 100:
                    return C78609UtB.LJJJ(R.attr.dj, context);
                case 101:
                    return C78609UtB.LJJJ(R.attr.c6, context);
                case 102:
                    return C78609UtB.LJJJ(R.attr.dm, context);
                default:
                    return -1;
            }
        }
        return 0;
    }

    public static String LJJIL(int i, Aweme aweme) {
        if (aweme != null && !TextUtils.isEmpty(aweme.getTakeDownDesc()) && LJLJLLL(aweme)) {
            return aweme.getTakeDownDesc();
        }
        return EF7.LIZIZ().getString(i);
    }

    public static Object LJJJJJ(Context context, Class cls) {
        Context LLLLL;
        if (context != null && (LLLLL = C16880lQ.LLLLL(context)) != null && cls.isInterface()) {
            if (InterfaceC40957G5p.class.equals(cls)) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C58249MtZ.LIZ;
                Object obj = concurrentHashMap.get(cls);
                if (obj != null && (obj instanceof C43999HOp)) {
                    return obj;
                }
                C43999HOp c43999HOp = new C43999HOp(LLLLL);
                concurrentHashMap.put(cls, c43999HOp);
                return c43999HOp;
            }
            if (M8Z.class.equals(cls)) {
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) C58249MtZ.LIZ;
                Object obj2 = concurrentHashMap2.get(cls);
                if (obj2 != null && (obj2 instanceof E91)) {
                    return obj2;
                }
                E91 e91 = new E91(LLLLL);
                concurrentHashMap2.put(cls, e91);
                return e91;
            }
            if (InterfaceC39089FVt.class.equals(cls)) {
                ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) C58249MtZ.LIZ;
                Object obj3 = concurrentHashMap3.get(cls);
                if (obj3 != null && (obj3 instanceof C39093FVx)) {
                    return obj3;
                }
                C39093FVx c39093FVx = new C39093FVx(LLLLL);
                concurrentHashMap3.put(cls, c39093FVx);
                return c39093FVx;
            }
            if (InterfaceC63087OpP.class.equals(cls)) {
                ConcurrentHashMap concurrentHashMap4 = (ConcurrentHashMap) C58249MtZ.LIZ;
                Object obj4 = concurrentHashMap4.get(cls);
                if (obj4 != null && (obj4 instanceof C63085OpN)) {
                    return obj4;
                }
                C63085OpN c63085OpN = new C63085OpN(LLLLL);
                concurrentHashMap4.put(cls, c63085OpN);
                return c63085OpN;
            }
            if (OVU.class.equals(cls)) {
                ConcurrentHashMap concurrentHashMap5 = (ConcurrentHashMap) C58249MtZ.LIZ;
                Object obj5 = concurrentHashMap5.get(cls);
                if (obj5 != null && (obj5 instanceof C54299LSt)) {
                    return obj5;
                }
                C54299LSt c54299LSt = new C54299LSt(LLLLL);
                concurrentHashMap5.put(cls, c54299LSt);
                return c54299LSt;
            }
        }
        return null;
    }

    public static final AbstractC73672Svk LJJLIIIJ(AbstractC73672Svk abstractC73672Svk, String str) {
        o.LJIIIZ(abstractC73672Svk, "<this>");
        C72041SPd.LIZ.getClass();
        return C72041SPd.LIZJ().LIZIZ(abstractC73672Svk, str);
    }

    public static final boolean LLFFF(Aweme aweme, String eventType) {
        o.LJIIIZ(eventType, "eventType");
        if (aweme != null && aweme.isAd() && TextUtils.equals(eventType, "general_search") && aweme.isLive()) {
            return true;
        }
        return false;
    }

    public static float LLILZ(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().density;
    }

    public static C63088OpQ LJIIIZ(String str, C63088OpQ c63088OpQ, ConversationCoreInfo conversationCoreInfo) {
        long j;
        int i;
        int intValue;
        if (c63088OpQ == null) {
            c63088OpQ = new C63088OpQ();
            String str2 = conversationCoreInfo.conversation_id;
            if (str2 != null) {
                str = str2;
            }
            c63088OpQ.setConversationId(str);
        }
        Long l = conversationCoreInfo.info_version;
        if (l != null && l.longValue() >= c63088OpQ.getVersion()) {
            c63088OpQ.setName(conversationCoreInfo.name);
            c63088OpQ.setIcon(conversationCoreInfo.icon);
            c63088OpQ.setDesc(conversationCoreInfo.desc);
            c63088OpQ.setNotice(conversationCoreInfo.notice);
            c63088OpQ.setExt(conversationCoreInfo.ext);
            c63088OpQ.setVersion(conversationCoreInfo.info_version.longValue());
            Long l2 = conversationCoreInfo.owner;
            if (l2 != null) {
                j = l2.longValue();
            } else {
                j = -1;
            }
            c63088OpQ.setOwner(j);
            c63088OpQ.setSecOwner(conversationCoreInfo.sec_owner);
            EnumC63751P0h enumC63751P0h = conversationCoreInfo.block_status;
            if (enumC63751P0h == null) {
                enumC63751P0h = EnumC63751P0h.UNBLOCK;
            }
            c63088OpQ.setSilent(enumC63751P0h.getValue());
            Boolean bool = conversationCoreInfo.block_normal_only;
            if (bool != null && bool.booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
            c63088OpQ.setSilentNormalOnly(i);
            Integer num = conversationCoreInfo.mode;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            c63088OpQ.setMode(intValue);
        }
        return c63088OpQ;
    }

    public static C109544Rq LJIIL(String str, C109544Rq c109544Rq, MessageBody messageBody) {
        return LJIILIIL(str, c109544Rq, messageBody, false, EnumC63179Oqt.MESSAGE_TYPE_NOT_USED.getValue());
    }

    public static final C58655N0h LJJJJ(String str, Aweme aweme, String str2) {
        AwemeRawAd LJJJJI;
        if (aweme == null || !LLF(aweme) || (LJJJJI = LJJJJI(aweme)) == null) {
            return null;
        }
        return C58704N2e.LIZLLL(str, str2, LJJJJI);
    }

    public static final void LLILIL(InterfaceC58749N3x interfaceC58749N3x, boolean z, XCG config, java.util.Map map) {
        o.LJIIJ(config, "config");
        OSZ[] oszArr = new OSZ[1];
        String str = config.LJIIJ;
        if (str == null) {
            str = "";
        }
        oszArr[0] = new OSZ("app_id", str);
        java.util.Map<String, ? extends Object> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        LJJLIIIIJ.putAll(map);
        interfaceC58749N3x.monitorStatusRate("effect_download_info", !z ? 1 : 0, LJJLIIIIJ);
    }

    public static C109544Rq LJIILIIL(String str, C109544Rq c109544Rq, MessageBody messageBody, boolean z, int i) {
        int i2;
        Long l;
        HashMap hashMap;
        long j;
        if (c109544Rq == null) {
            c109544Rq = new C109544Rq();
            Long l2 = messageBody.order_in_conversation;
            if (l2 != null) {
                j = l2.longValue();
            } else {
                j = 0;
            }
            c109544Rq.setOrderIndex(j);
            c109544Rq.setMsgId(messageBody.server_message_id.longValue());
            if (TextUtils.isEmpty(str)) {
                str = UUID.randomUUID().toString();
            }
            c109544Rq.setUuid(str);
            Long l3 = messageBody.create_time;
            if (l3 != null) {
                c109544Rq.setCreatedAt(l3.longValue());
            }
            c109544Rq.setMsgType(messageBody.message_type.intValue());
            c109544Rq.setConversationId(messageBody.conversation_id);
            c109544Rq.setConversationType(messageBody.conversation_type.intValue());
            c109544Rq.setSender(messageBody.sender.longValue());
            c109544Rq.setSecSender(messageBody.sec_sender);
            c109544Rq.setContent(messageBody.content);
            c109544Rq.setDeleted(0);
            c109544Rq.setMsgStatus(5);
            C63308Osy.LJI().LIZLLL().getClass();
        } else {
            C47922IrO.LIZ();
        }
        C64537PUn c64537PUn = messageBody.content_pb;
        if (c64537PUn != null && c64537PUn.size() > 0) {
            c109544Rq.setContentPB(messageBody.content_pb);
        }
        String str2 = messageBody.scene;
        if (str2 != null && str2.length() > 0) {
            c109544Rq.setScene(messageBody.scene);
        }
        if (!z) {
            C47922IrO.LIZ();
        }
        c109544Rq.setConversationShortId(messageBody.conversation_short_id.longValue());
        if (!z) {
            Long l4 = messageBody.index_in_conversation;
            if (l4 != null) {
                c109544Rq.setIndex(l4.longValue());
                c109544Rq.getLocalExt().remove("s:message_index_is_local");
            }
            if (messageBody.order_in_conversation != null) {
                if (c109544Rq.getOrderIndex() >= 10000) {
                    C47922IrO.LIZ();
                } else {
                    c109544Rq.setOrderIndex(messageBody.order_in_conversation.longValue());
                }
            }
        }
        Long l5 = messageBody.index_in_conversation_v2;
        if (l5 != null) {
            c109544Rq.setIndexInConversationV2(l5.longValue());
        }
        Integer num = messageBody.status;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        c109544Rq.setSvrStatus(i2);
        Long l6 = messageBody.version;
        if (l6 != null && l6.longValue() >= c109544Rq.getVersion()) {
            if (i == EnumC63179Oqt.MESSAGE_TYPE_UPDATE_MESSAGE_EXT.getValue() || i == EnumC63179Oqt.MESSAGE_TYPE_NOT_USED.getValue()) {
                if (messageBody.ext == null) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap(messageBody.ext);
                }
                c109544Rq.setExt(hashMap);
            }
            if (i == EnumC63179Oqt.MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY.getValue() || i == EnumC63179Oqt.MESSAGE_TYPE_NOT_USED.getValue()) {
                c109544Rq.updatePropertyFromServer(messageBody);
            }
            c109544Rq.setVersion(messageBody.version.longValue());
        }
        Integer num2 = messageBody.message_type;
        if (num2 != null && num2.intValue() == c109544Rq.getMsgType() && (l = messageBody.server_message_id) != null && l.longValue() >= c109544Rq.getMsgId()) {
            c109544Rq.setMsgId(messageBody.server_message_id.longValue());
        }
        c109544Rq.setSenderInfo(LJIILJJIL(messageBody.user_profile));
        c109544Rq.setReadStatus(!C63162Oqc.LIZLLL(c109544Rq) ? 1 : 0);
        InterfaceC63163Oqd LJIJ = C63308Osy.LJI().LIZIZ().LJIJ();
        if (c109544Rq.getSvrStatus() == 0 && LJIJ != null) {
            LJIJ.LIZ();
            c109544Rq.setSvrStatus(0);
        }
        ReferenceInfo referenceInfo = messageBody.reference_info;
        if (referenceInfo != null) {
            c109544Rq.setRefMsg(referenceInfo);
        }
        EnumC96123pw enumC96123pw = messageBody.conv_rank_update_rule;
        if (enumC96123pw != null) {
            c109544Rq.setConvRankUpdateRule(enumC96123pw.getValue());
        }
        return c109544Rq;
    }

    public static final void LLILL(InterfaceC58749N3x interfaceC58749N3x, boolean z, XCG config, Effect effect, String str) {
        o.LJIIJ(config, "config");
        o.LJIIJ(effect, "effect");
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("effect_id", effect.getEffect_id());
        oszArr[1] = new OSZ("effect_name", effect.getName());
        String str2 = config.LJIIJ;
        if (str2 == null) {
            str2 = "";
        }
        oszArr[2] = new OSZ("app_id", str2);
        java.util.Map<String, ? extends Object> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (!z) {
            if (str == null) {
                str = "";
            }
            LJJLIIIIJ.put("error_msg", str);
        }
        interfaceC58749N3x.monitorStatusRate("effect_resource_unzip_success_rate", !z ? 1 : 0, LJJLIIIIJ);
    }

    public static final void LLILLJJLI(InterfaceC58749N3x interfaceC58749N3x, boolean z, XCG config, String modelName, String str) {
        o.LJIIJ(config, "config");
        o.LJIIJ(modelName, "modelName");
        OSZ[] oszArr = new OSZ[2];
        String str2 = config.LJIIJ;
        if (str2 == null) {
            str2 = "";
        }
        oszArr[0] = new OSZ("app_id", str2);
        oszArr[1] = new OSZ("model_name", modelName);
        java.util.Map<String, ? extends Object> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (!z) {
            if (str == null) {
                str = "";
            }
            LJJLIIIIJ.put("error_msg", str);
        }
        interfaceC58749N3x.monitorStatusRate("find_model_success_rate", !z ? 1 : 0, LJJLIIIIJ);
    }

    public static void LLIZ(List list, ReplayLiveData replayLiveData, C133725Mq c133725Mq, Boolean bool, boolean z) {
        int uiStartPoint;
        int uiEndPoint;
        for (int i = 0; i < list.size(); i++) {
            EffectPointModel effectPointModel = (EffectPointModel) ListProtector.get(list, i);
            if (effectPointModel.getType() != 2) {
                String resDir = effectPointModel.getResDir();
                if (bool.booleanValue()) {
                    uiStartPoint = effectPointModel.getStartPoint();
                } else {
                    uiStartPoint = effectPointModel.getUiStartPoint();
                }
                C5RT LIZIZ = C5RT.LIZIZ(uiStartPoint, resDir);
                LIZIZ.LJ = effectPointModel.getUiStartPoint();
                LIZIZ.LJFF = effectPointModel.getUiEndPoint();
                LIZIZ.LJIIIIZZ = effectPointModel.getSelectedColor();
                LIZIZ.LJIIL = effectPointModel.getKey();
                LIZIZ.LJIILJJIL = effectPointModel.getName();
                LIZIZ.LJII = effectPointModel.isFromEnd();
                LIZIZ.LJIILLIIL = effectPointModel.getCategory();
                LIZIZ.LJIIJ = effectPointModel.getSelectFrom();
                LIZIZ.LJIIIZ = effectPointModel.getIndex();
                LIZIZ.LJIILL = effectPointModel.getDuration();
                LIZIZ.LJIIZILJ = effectPointModel.getExtra();
                LIZIZ.LIZIZ = new String[]{effectPointModel.getUuid()};
                LIZIZ.LJIJJ = z;
                LIZIZ.LJIJ = effectPointModel.getAdjustParams();
                LIZIZ.LJIJI = effectPointModel.getIsNewEngineEffect();
                if (replayLiveData != null) {
                    replayLiveData.setValue(LIZIZ);
                }
                if (c133725Mq != null) {
                    c133725Mq.LIZ(LIZIZ);
                }
                if (bool.booleanValue()) {
                    uiEndPoint = effectPointModel.getEndPoint();
                } else {
                    uiEndPoint = effectPointModel.getUiEndPoint();
                }
                C5RT LIZJ = C5RT.LIZJ(uiEndPoint);
                LIZJ.LJ = effectPointModel.getUiStartPoint();
                LIZJ.LJFF = effectPointModel.getUiEndPoint();
                LIZJ.LJII = effectPointModel.isFromEnd();
                LIZJ.LIZIZ = new String[]{effectPointModel.getUuid()};
                LIZJ.LJIJJ = z;
                LIZJ.LJIJI = effectPointModel.getIsNewEngineEffect();
                if (replayLiveData != null) {
                    replayLiveData.setValue(LIZJ);
                }
                if (c133725Mq != null) {
                    c133725Mq.LIZ(LIZJ);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        if (r3 == X.C24500xi.LIZIZ) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC07790Sh LLIILZL(X.InterfaceC07790Sh r9, X.InterfaceC13090fJ r10, X.InterfaceC13170fR r11, X.C0UT r12, boolean r13, X.InterfaceC24520xk r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "itemProvider"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            r0 = 1548174271(0x5c4743bf, float:2.2435203E17)
            r14.LJJIIJ(r0)
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r14.LJJIIJ(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.LJJIIJ(r0)
            java.lang.Object r0 = r14.LJIILL()
            X.0xi r1 = X.InterfaceC24520xk.LIZ
            r1.getClass()
            X.0xh r1 = X.C24500xi.LIZIZ
            if (r0 != r1) goto L41
            X.MBB r0 = X.MBB.INSTANCE
            X.2gm r1 = X.C24610xt.LJII(r0, r14)
            X.1as r0 = new X.1as
            r0.<init>(r1)
            r14.LJJIII(r0)
        L41:
            r14.LJJIJIIJIL()
            X.1as r0 = (X.C35821as) r0
            X.2pa r2 = r0.LJLIL
            r14.LJJIJIIJIL()
            r6 = 4
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r1 = 0
            r5[r1] = r10
            r0 = 1
            r5[r0] = r11
            r0 = 2
            r5[r0] = r12
            r3 = 3
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r5[r3] = r0
            r0 = -568225417(0xffffffffde219177, float:-2.9105543E18)
            r14.LJJIIJ(r0)
            r3 = 0
            r4 = 0
        L66:
            r0 = r5[r3]
            boolean r0 = r14.LJIJJ(r0)
            r4 = r4 | r0
            int r3 = r3 + 1
            if (r3 >= r6) goto L72
            goto L66
        L72:
            java.lang.Object r3 = r14.LJIILL()
            if (r4 != 0) goto L81
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r3 != r0) goto Lb2
        L81:
            X.0UT r0 = X.C0UT.Vertical
            if (r12 != r0) goto Lc1
            r4 = 1
        L86:
            kotlin.jvm.internal.IDqS416S0100000 r3 = new kotlin.jvm.internal.IDqS416S0100000
            r0 = 209(0xd1, float:2.93E-43)
            r3.<init>(r10, r0)
            X.0QX r5 = r11.LIZ()
            r7 = 0
            if (r13 == 0) goto Lbf
            X.20t r6 = new X.20t
            r6.<init>(r4, r2, r11)
            kotlin.jvm.internal.IDqS28S0300000 r7 = new kotlin.jvm.internal.IDqS28S0300000
            r0 = 18
            r7.<init>(r10, r2, r11, r0)
        La0:
            X.0QL r8 = r11.LIZIZ()
            X.1M1 r0 = X.InterfaceC07790Sh.LJJJI
            X.211 r2 = new X.211
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.0Sh r3 = com.google.gson.internal.b.LJJII(r0, r1, r2)
            r14.LJJIII(r3)
        Lb2:
            r14.LJJIJIIJIL()
            X.0Sh r3 = (X.InterfaceC07790Sh) r3
            X.0Sh r0 = r9.LLLIIIL(r3)
            r14.LJJIJIIJIL()
            return r0
        Lbf:
            r6 = r7
            goto La0
        Lc1:
            r4 = 0
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63081OpJ.LLIILZL(X.0Sh, X.0fJ, X.0fR, X.0UT, boolean, X.0xk):X.0Sh");
    }

    public static final void LLIIZ(InterfaceC58749N3x interfaceC58749N3x, boolean z, String str, XCG config, java.util.Map map, String str2) {
        o.LJIIJ(config, "config");
        OSZ[] oszArr = new OSZ[2];
        String str3 = config.LJIIJ;
        if (str3 == null) {
            str3 = "";
        }
        oszArr[0] = new OSZ("app_id", str3);
        oszArr[1] = new OSZ("event_name", str);
        java.util.Map<String, ? extends Object> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        LJJLIIIIJ.putAll(map);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            LJJLIIIIJ.put("error_msg", str2);
        }
        interfaceC58749N3x.monitorStatusRate("ep_common_event", !z ? 1 : 0, LJJLIIIIJ);
    }

    public static final void LLILII(InterfaceC58749N3x interfaceC58749N3x, boolean z, XCG config, Effect effect, java.util.Map map, String str) {
        o.LJIIJ(config, "config");
        o.LJIIJ(effect, "effect");
        OSZ[] oszArr = new OSZ[6];
        String str2 = config.LJIIJ;
        if (str2 == null) {
            str2 = "";
        }
        int i = 0;
        oszArr[0] = new OSZ("app_id", str2);
        oszArr[1] = new OSZ("effect_id", effect.getEffect_id());
        Integer url_sub_type = effect.getFile_url().getUrl_sub_type();
        if (url_sub_type != null) {
            i = url_sub_type.intValue();
        }
        oszArr[2] = new OSZ("effect_type", Integer.valueOf(i));
        oszArr[3] = new OSZ("source", Integer.valueOf(effect.getSource()));
        oszArr[4] = new OSZ("panel", effect.getPanel());
        String LJIL = C78966Uyw.LJIL(effect);
        if (LJIL == null) {
            LJIL = "";
        }
        oszArr[5] = new OSZ("md5", LJIL);
        java.util.Map<String, ? extends Object> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        LJJLIIIIJ.putAll(map);
        if (!z) {
            if (str == null) {
                str = "";
            }
            LJJLIIIIJ.put("error_msg", str);
        }
        interfaceC58749N3x.monitorStatusRate("effect_download_success_rate", !z ? 1 : 0, LJJLIIIIJ);
    }

    public static C63120Opw LJIIIIZZ(int i, C63120Opw c63120Opw, ConversationInfoV2 conversationInfoV2, long j, C109544Rq c109544Rq, List list, boolean z) {
        java.util.Map<String, String> map;
        ConversationCoreInfo conversationCoreInfo = conversationInfoV2.conversation_core_info;
        ConversationSettingInfo conversationSettingInfo = conversationInfoV2.conversation_setting_info;
        if (c63120Opw == null) {
            c63120Opw = new C63120Opw();
            c63120Opw.setConversationId(conversationInfoV2.conversation_id);
            Integer num = conversationInfoV2.conversation_type;
            if (num != null) {
                c63120Opw.setConversationType(num.intValue());
            }
            if (c109544Rq != null) {
                c63120Opw.setLastShowMessage(c109544Rq);
            } else {
                c63120Opw.setLastShowMessage(C63150OqQ.LJIIJ(conversationInfoV2.conversation_id));
            }
        }
        long updatedTime = c63120Opw.getUpdatedTime();
        if (c63120Opw.getLastShowMessage() != null) {
            j = c63120Opw.getLastShowMessage().getCreatedAt();
        }
        c63120Opw.setUpdatedTime(Math.max(updatedTime, j));
        if (c109544Rq != null) {
            c63120Opw.setLastMessageIndex(c109544Rq.getIndex());
            c63120Opw.setMaxIndexV2(c109544Rq.getIndexInConversationV2());
        } else {
            c63120Opw.setLastMessageIndex(C63150OqQ.LJIIIZ(conversationInfoV2.conversation_id));
            c63120Opw.setMaxIndexV2(C63150OqQ.LJIIL(conversationInfoV2.conversation_id));
        }
        Long l = conversationInfoV2.conversation_short_id;
        if (l != null) {
            c63120Opw.setConversationShortId(l.longValue());
        }
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((C63089OpR) it.next()).getUid()));
            }
            c63120Opw.setMemberIds(arrayList);
        } else {
            c63120Opw.setMemberIds(C63124Oq0.LJ(conversationInfoV2.conversation_id));
        }
        Integer num2 = conversationInfoV2.participants_count;
        if (num2 != null) {
            c63120Opw.setMemberCount(num2.intValue());
        }
        if (conversationInfoV2.badge_count != null && c63120Opw.getBadgeCount() <= 0) {
            c63120Opw.setBadgeCount(conversationInfoV2.badge_count.intValue());
        }
        if (conversationSettingInfo != null) {
            Long l2 = conversationSettingInfo.min_index;
            if (l2 != null && l2.longValue() > c63120Opw.getMinIndex()) {
                c63120Opw.setMinIndex(conversationSettingInfo.min_index.longValue());
            }
            Long l3 = conversationSettingInfo.read_index;
            if (l3 != null && l3.longValue() > c63120Opw.getReadIndex()) {
                c63120Opw.setReadIndex(conversationSettingInfo.read_index.longValue());
            }
            Long l4 = conversationSettingInfo.min_index_v2;
            if (l4 != null) {
                c63120Opw.setMinIndexV2(l4.longValue());
            }
            Long l5 = conversationSettingInfo.read_index_v2;
            if (l5 != null) {
                c63120Opw.setReadIndexV2(l5.longValue());
            }
            Integer num3 = conversationSettingInfo.read_badge_count;
            if (num3 != null) {
                c63120Opw.setReadBadgeCount(num3.intValue());
                c63120Opw.getLocalExt().put("s:read_badge_count_update", "1");
            }
        }
        if (z && conversationSettingInfo != null && (conversationSettingInfo.read_index != null || conversationSettingInfo.read_index_v2 != null || conversationSettingInfo.read_badge_count != null)) {
            c63120Opw.setUnreadCount(C63133Oq9.LJ(c63120Opw));
        }
        if (conversationSettingInfo != null && (map = conversationSettingInfo.ext) != null && map.get("a:s_is_in_box") != null) {
            if (String.valueOf(conversationSettingInfo.ext.get("a:s_is_in_box")).equals(String.valueOf(1))) {
                c63120Opw.setInBox(true);
                C47922IrO.LIZ();
            } else if (String.valueOf(conversationSettingInfo.ext.get("a:s_is_in_box")).equals(String.valueOf(0))) {
                c63120Opw.setInBox(false);
            }
        }
        c63120Opw.setInboxType(i);
        if (conversationCoreInfo != null) {
            c63120Opw.setCoreInfo(LJIIIZ(conversationInfoV2.conversation_id, c63120Opw.getCoreInfo(), conversationCoreInfo));
            Integer num4 = conversationCoreInfo.status;
            if (num4 != null) {
                c63120Opw.setStatus(num4.intValue());
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Updating conversation ");
                LIZ.append(c63120Opw.getConversationId());
                LIZ.append(" status to ");
                LIZ.append(c63120Opw.getStatus());
                C63322OtC.LIZ(X1D.LIZIZ(LIZ));
            }
        }
        if (conversationSettingInfo != null) {
            c63120Opw.setSettingInfo(LJIIJ(c63120Opw.getSettingInfo(), conversationSettingInfo));
        }
        Boolean bool = conversationInfoV2.is_participant;
        if (bool != null) {
            c63120Opw.setIsMember(bool.booleanValue());
        }
        C63119Opv.LIZLLL(c63120Opw, c109544Rq, false);
        c63120Opw.setFiltered(C63119Opv.LIZ(Long.valueOf(C63308Osy.LJI().LIZIZ().getUid()), c63120Opw.getCoreInfo().getExt()));
        c63120Opw.setMember(LJIIJJI(conversationInfoV2.conversation_id, conversationInfoV2.user_info));
        java.util.Map<String, String> localExt = c63120Opw.getLocalExt();
        if (localExt != null && localExt.containsKey("s:conv_wait_info")) {
            localExt.remove("s:conv_wait_info");
            c63120Opw.setLocalExt(localExt);
        }
        return c63120Opw;
    }

    public static final void LLILLIZIL(InterfaceC58749N3x interfaceC58749N3x, boolean z, XCG config, Effect effect, String modelName, String str, String modelType, java.util.Map map, String str2) {
        o.LJIIJ(config, "config");
        o.LJIIJ(modelName, "modelName");
        o.LJIIJ(modelType, "modelType");
        OSZ[] oszArr = new OSZ[6];
        String str3 = config.LJIIJ;
        if (str3 == null) {
            str3 = "";
        }
        oszArr[0] = new OSZ("app_id", str3);
        oszArr[1] = new OSZ("effect_id", effect.getEffect_id());
        oszArr[2] = new OSZ("panel", effect.getPanel());
        oszArr[3] = new OSZ("model_name", modelName);
        oszArr[4] = new OSZ("resource_type", modelType);
        if (str == null) {
            str = "";
        }
        oszArr[5] = new OSZ("model_version", str);
        java.util.Map<String, ? extends Object> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        LJJLIIIIJ.putAll(map);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            LJJLIIIIJ.put("error_msg", str2);
        }
        interfaceC58749N3x.monitorStatusRate("model_download_success_rate", !z ? 1 : 0, LJJLIIIIJ);
    }
}
