package X;

import Y.IDComparatorS35S0000000_7;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.app.AwemeApplicationServiceImpl;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.service.camera.exp.DMCameraSafetyExperiment;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.MediaSafetyModel;
import com.ss.android.ugc.aweme.im.service.model.UserVideoModel;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.experiment.HomepageRecommendSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.UyV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78939UyV implements InterfaceC73592SuS {
    public static final C78939UyV LJLIL = new C78939UyV();
    public static String LJLILLLLZI;
    public static String LJLJI;

    public static final float LJIL(float f) {
        if (f < 0.5f) {
            f = 0.5f;
        } else if (f > 0.9f) {
            f = 0.9f;
        }
        return (((f - 0.5f) / 0.39999998f) * 1.0f) + 0.0f;
    }

    public static boolean LJJIJIIJI(char c) {
        return c >= 128 && c <= 255;
    }

    public static boolean LJJIJL(char c) {
        return c == '\r' || c == '*' || c == '>' || c == ' ' || (c >= '0' && (c <= '9' || (c >= 'A' && c <= 'Z')));
    }

    public static boolean LJJIJ() {
        if (C00F.LIZ(31744, 0, "enable_setting_disk_manager", true) != 1) {
            return false;
        }
        return true;
    }

    public static String LIZIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        C66960QPs.LIZ().getClass();
        return JBR.LJFF(LIZ, "api-va.tiktokv.com", str, LIZ);
    }

    public static ImageUrlModel LJ(UrlModel urlModel) {
        if (urlModel == null) {
            return new ImageUrlModel("", Collections.emptyList());
        }
        return new ImageUrlModel(urlModel.getUri(), urlModel.getUrlList());
    }

    public static final List LJFF(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UrlModel urlModel = (UrlModel) it.next();
            CommentImageStruct commentImageStruct = new CommentImageStruct();
            commentImageStruct.setOriginUrl(urlModel);
            commentImageStruct.setCropUrl(urlModel);
            String uri = urlModel.getUri();
            int i = 0;
            if (uri != null && uri.length() != 0) {
                i = 100;
            }
            commentImageStruct.setProgress(i);
            arrayList.add(commentImageStruct);
        }
        return arrayList;
    }

    public static String[] LJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            String binaryString = Integer.toBinaryString(charAt);
            if (binaryString.length() < 8) {
                sb.append(charAt);
            } else {
                int parseInt = CastIntegerProtector.parseInt(binaryString.substring(0, binaryString.length() - 8), 2);
                int parseInt2 = CastIntegerProtector.parseInt(binaryString.substring(binaryString.length() - 8), 2);
                sb.append((char) parseInt);
                sb.append((char) parseInt2);
            }
        }
        return sb.toString().split("\n");
    }

    public static final void LJIIIIZZ(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        C72794Sha c72794Sha;
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int LLILL = linearLayoutManager.LLILL();
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        if (LLILL == -1 || LLILLJJLI == -1 || LLILLJJLI < LLILL || LLILL > LLILLJJLI) {
            return;
        }
        while (true) {
            RecyclerView.ViewHolder LJJIZ = recyclerView.LJJIZ(LLILL);
            if ((LJJIZ instanceof C72794Sha) && (c72794Sha = (C72794Sha) LJJIZ) != null) {
                c72794Sha.L();
            }
            if (LLILL == LLILLJJLI) {
                return;
            } else {
                LLILL++;
            }
        }
    }

    public static final List LJIIIZ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) it.next();
            if (!TextUtils.isEmpty(musicOwnerInfo.getUid()) && !TextUtils.isEmpty(musicOwnerInfo.getSecUid()) && !TextUtils.isEmpty(musicOwnerInfo.getNickName()) && !TextUtils.isEmpty(musicOwnerInfo.getHandle())) {
                arrayList.add(musicOwnerInfo);
            }
        }
        return arrayList;
    }

    public static final List LJIIJ(String str) {
        int parseInt;
        if (!C44687HgJ.LIZIZ(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] files = new File(str).listFiles();
        o.LJIIIIZZ(files, "files");
        for (File file : files) {
            if (!file.isHidden()) {
                String name = file.getName();
                o.LJIIIIZZ(name, "waterFile.name");
                if (ujb.o.LJJJLIIL(name, "dynamic_watermark_", false)) {
                    String path = file.getPath();
                    o.LJIIIIZZ(path, "waterFile.path");
                    if (ujb.o.LJJJJ(path, ".png", false)) {
                        String name2 = file.getName();
                        o.LJIIIIZZ(name2, "waterFile.name");
                        String LJLLJ = s.LJLLJ(name2, "dynamic_watermark_");
                        String LJLZ = s.LJLZ(LJLLJ, ".png", LJLLJ);
                        if (C38350F3i.LJJIL(LJLZ) == null) {
                            parseInt = 0;
                        } else {
                            parseInt = CastIntegerProtector.parseInt(LJLZ);
                        }
                        String path2 = file.getPath();
                        o.LJIIIIZZ(path2, "waterFile.path");
                        arrayList.add(new HN3(parseInt, path2));
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS35S0000000_7(8));
        }
        return arrayList;
    }

    public static final String LJIILJJIL(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        return aweme.getAid();
    }

    public static final String LJIILL(String str) {
        java.util.Map<Long, PushStreamInfo> map;
        PushStreamInfo pushStreamInfo;
        List<PushStreamInfo.Quality> list;
        if (ujb.o.LJJJJJL(str)) {
            return "";
        }
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) DataChannelGlobal.LJLJJI.mv0(C29039BaV.class);
        if (roomCreateInfo == null || (map = roomCreateInfo.pushStreamInfoMap) == null || (pushStreamInfo = map.get(4L)) == null || (list = pushStreamInfo.qualityList) == null || list.isEmpty()) {
            String str2 = (String) ((LinkedHashMap) B96.LIZJ).get(str);
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        for (PushStreamInfo.Quality quality : list) {
            if (o.LJ(quality.sdkKey, str)) {
                String str3 = quality.name;
                o.LJIIIIZZ(str3, "it.name");
                return str3;
            }
        }
        String str4 = (String) ((LinkedHashMap) B96.LIZJ).get(str);
        if (str4 == null) {
            return "";
        }
        return str4;
    }

    public static final String LJIIZILJ(C64907Pdf path) {
        o.LJIIIZ(path, "$this$path");
        return path.LIZIZ.LJFF.LIZ();
    }

    public static final java.util.Set LJIJJ(android.net.Uri getQueryParameterNamesSafely) {
        o.LJIIJ(getQueryParameterNamesSafely, "$this$getQueryParameterNamesSafely");
        if (!getQueryParameterNamesSafely.isHierarchical()) {
            return null;
        }
        return UriProtector.getQueryParameterNames(getQueryParameterNamesSafely);
    }

    public static Throwable LJJII(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (!(obj instanceof Throwable)) {
            return null;
        }
        return (Throwable) obj;
    }

    public static final WebKitView LJJIII(SparkContext sparkContext) {
        C31999Ch9 c31999Ch9 = C31999Ch9.LIZJ;
        String str = sparkContext.containerId;
        c31999Ch9.getClass();
        InterfaceC60761Nsz LIZIZ = C31999Ch9.LIZIZ(str);
        if (LIZIZ == null || !(LIZIZ instanceof WebKitView)) {
            return null;
        }
        return (WebKitView) LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJIIJ(R3V r3v) {
        R41.LJIILIIL(r3v.LIZ);
        Bundle bundle = new Bundle();
        bundle.putBoolean("block_bind_phone", true);
        C40453FuD.LIZIZ(bundle, null).LIZLLL(new OUE(bundle));
        IPrevLoginPlatformService LJIIL = PrevLoginPlatformService.LJIIL();
        String str = (String) LJIIL.getPlatform().getValue();
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("platform", "sms_verification");
        c35936E8m.LIZLLL("enter_type", "find_account_back");
        C68972R5c.LIZ(c35936E8m);
        C35936E8m c35936E8m2 = new C35936E8m();
        c35936E8m2.LIZLLL("platform", "sms_verification");
        c35936E8m2.LIZLLL("enter_type", "find_account_back");
        c35936E8m2.LIZLLL("prev_login_platform", str);
        c35936E8m2.LIZ(LJIIL.LJIIIZ(), "encouraged_platform");
        FMX.LJIIL("login_submit", c35936E8m2.LIZ);
        C35936E8m c35936E8m3 = new C35936E8m();
        c35936E8m3.LIZLLL("enter_type", "find_account_back");
        c35936E8m3.LIZLLL("platform", "sms_verification");
        c35936E8m3.LIZ(1, "status");
        c35936E8m3.LIZLLL("prev_login_platform", str);
        c35936E8m3.LIZ(LJIIL.LJIIIZ(), "encouraged_platform");
        C68972R5c.LIZ(c35936E8m);
        FMX.LJIIL("login_success", c35936E8m3.LIZ);
    }

    public static void LJJIIJZLJL(char c) {
        String hexString = Integer.toHexString(c);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("0000".substring(0, 4 - hexString.length()));
        LIZ.append(hexString);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + X1D.LIZIZ(LIZ) + ')');
    }

    public static final boolean LJJIIZ(Aweme aweme) {
        String str;
        if (aweme != null) {
            str = aweme.getSearchFeedType();
        } else {
            str = null;
        }
        return o.LJ(str, "search_aggregated_video");
    }

    public static final boolean LJJIIZI(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return o.LJ("auto", lowerCase);
    }

    public static final boolean LJJIJLIJ(C64907Pdf c64907Pdf) {
        return o.LJ("POST", c64907Pdf.LIZLLL.LIZ);
    }

    public static final boolean LJJIL(C109544Rq c109544Rq) {
        int msgType = c109544Rq.getMsgType();
        if (msgType == -1 || msgType == 1 || msgType == 15 || msgType == 1026 || msgType == 4001 || msgType == 1022 || msgType == 1023 || msgType == 1030 || msgType == 1031) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIZ(AwemeRawAd awemeRawAd) {
        o.LJIIIZ(awemeRawAd, "<this>");
        if (awemeRawAd.getUseOrdinaryWeb_() == null) {
            return true;
        }
        Boolean useOrdinaryWeb_ = awemeRawAd.getUseOrdinaryWeb_();
        o.LJIIIIZZ(useOrdinaryWeb_, "useOrdinaryWeb_");
        return useOrdinaryWeb_.booleanValue();
    }

    public static void LJJJJ(Activity activity) {
        Intent intent;
        String LJFF;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "backurl");
        if (intent.getParcelableExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY") != null) {
            return;
        }
        if (!TextUtils.isEmpty(LLJJIJIIJIL) && !TextUtils.equals("__BACKURL__", LLJJIJIIJIL) && !LLJJIJIIJIL.startsWith("http")) {
            try {
                android.net.Uri parse = UriProtector.parse(LLJJIJIIJIL);
                Intent intent2 = new Intent();
                intent2.setData(parse);
                intent2.setAction("android.intent.action.VIEW");
                intent2.addCategory("android.intent.category.BROWSABLE");
                intent2.setComponent(null);
                intent2.setSelector(null);
                activity.startActivityIfNeeded(intent2, -1);
                activity.moveTaskToBack(true);
                return;
            } catch (Exception unused) {
            }
        }
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
        int intExtra = intent.getIntExtra("extra_story_is_friend", -1);
        boolean booleanExtra = intent.getBooleanExtra("is_from_push", false);
        if (intent.getBooleanExtra("is_have_intents", false)) {
            return;
        }
        if (!AwemeApplicationServiceImpl.LIZ().isAppHot() || booleanExtra) {
            Activity[] activityStack = ActivityStack.getActivityStack();
            if (activityStack.length == 1 && activityStack[0].equals(activity)) {
                if (TextUtils.isEmpty(LLJJIJIIJIL2)) {
                    LJFF = "aweme://main";
                } else {
                    LJFF = i0.LJFF("aweme://main?com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=", LLJJIJIIJIL2);
                }
                if (intExtra != -1) {
                    C58590Mz4 c58590Mz4 = C61200O0e.LIZLLL().LIZ;
                    if (c58590Mz4.LIZ == null) {
                        c58590Mz4.LIZ = new ArrayList<>();
                    }
                    c58590Mz4.LIZ.add("extra_story_is_friend");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LJFF);
                    LIZ.append("&");
                    LIZ.append("extra_story_is_friend");
                    LIZ.append("=");
                    LIZ.append(intExtra);
                    LJFF = X1D.LIZIZ(LIZ);
                }
                C61200O0e.LIZLLL().LJI(null, LJFF);
            }
        }
    }

    public static final boolean LJJJJLI(User user) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        o.LJIIIZ(user, "<this>");
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        boolean isChildrenMode = ((RBY) HG3.LJIILL()).isChildrenMode();
        if (((RBX) HG3.LJIILL()).getCurUser().getAccountType() == 3) {
            z = true;
        } else {
            z = false;
        }
        long j = HomepageRecommendSetting.LIZ().lowMufBound;
        long max = Math.max(C99H.LIZ(), user.getFriendCount());
        if (max <= j && max >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = HomepageRecommendSetting.LIZ().lowFollowerBound;
        int i = user.historyMaxFollowerCount;
        if (i < j2) {
            z3 = true;
        } else {
            z3 = false;
        }
        C62822Ol8 c62822Ol8 = C99U.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (isLogin && !isChildrenMode && !z && z2 && z3 && z4) {
            z5 = true;
        } else {
            z5 = false;
        }
        StringBuilder sb = new StringBuilder("shouldShowExpandBtn[result:");
        sb.append(z5);
        sb.append("][isLogin:");
        sb.append(isLogin);
        sb.append("][notKidsAccount:");
        sb.append(!isChildrenMode);
        sb.append("][notBAAccount:");
        C76965UIn.LIZJ(sb, !z, "][muf:", z2, ", ");
        sb.append(max);
        sb.append('<');
        sb.append(j);
        sb.append("?][follower:");
        sb.append(z3);
        sb.append(", ");
        sb.append(i);
        sb.append('<');
        sb.append(j2);
        sb.append("?][expGroup:");
        sb.append(((Number) c62822Ol8.getValue()).intValue());
        sb.append(']');
        C221018lt.LJFF("HomepageRecommend", sb.toString());
        return z5;
    }

    public static final boolean LJJJJLL(MusicOwnerInfo musicOwnerInfo) {
        Integer status;
        if (AV1.LJIJI(musicOwnerInfo.getUid()) || musicOwnerInfo.isBlock() || musicOwnerInfo.isBlocked() || (status = musicOwnerInfo.getStatus()) == null || status.intValue() != 1 || !((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        return true;
    }

    public static final Rect LJJJJZ(C10390ax c10390ax) {
        o.LJIIIZ(c10390ax, "<this>");
        return new Rect((int) c10390ax.LIZ, (int) c10390ax.LIZIZ, (int) c10390ax.LIZJ, (int) c10390ax.LIZLLL);
    }

    public static final AwemeCardTemplate LJJJJZI(C79134V3y c79134V3y) {
        VideoCoverComponent videoCoverComponent;
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent;
        BaseUserComponent value;
        PreviewHintComponent LIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        V43 v43 = c79134V3y.video;
        if (v43 != null) {
            videoCoverComponent = V3N.LJJIJIIJIL(v43);
        } else {
            VideoCoverComponent.Companion.getClass();
            videoCoverComponent = VideoCoverComponent.EMPTY_VIDEO_COVER;
        }
        V4W v4w = c79134V3y.fallback;
        if (v4w != null) {
            videoCardFallbackInfoComponent = C45804HyK.LJJLIIIJLJLI(v4w);
        } else {
            VideoCardFallbackInfoComponent.Companion.getClass();
            videoCardFallbackInfoComponent = VideoCardFallbackInfoComponent.EMPTY_FALLBACK;
        }
        C79129V3t c79129V3t = c79134V3y.user_info;
        if (c79129V3t != null) {
            value = C79004UzY.LJJJJLI(c79129V3t);
        } else {
            BaseUserComponent.Companion.getClass();
            value = BaseUserComponent.EMPTY_USER_INFO$delegate.getValue();
        }
        V4L v4l = c79134V3y.preview_hint;
        if (v4l != null) {
            LIZ = V2B.LJIIZILJ(v4l);
        } else {
            PreviewHintComponent.Companion.getClass();
            LIZ = C79087V2d.LIZ();
        }
        RU2 ru2 = c79134V3y.req_base;
        if (ru2 != null) {
            baseRequestComponent = C62819Ol5.LJJIIJZLJL(ru2);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        RUB rub = c79134V3y.resp_base;
        if (rub != null) {
            baseResponseComponent = C69648RVc.LIZJ(rub);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        return new AwemeCardTemplate(videoCoverComponent, videoCardFallbackInfoComponent, value, LIZ, baseRequestComponent, baseResponseComponent);
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        Boolean it = (Boolean) obj;
        o.LJIIIZ(it, "it");
        return it.booleanValue();
    }

    public static final long LIZ(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final int LIZJ(SearchMixFeed searchMixFeed, Aweme aweme) {
        AggregatedVideo aggregatedVideo;
        List<Aweme> list;
        String str;
        if (searchMixFeed == null || !searchMixFeed.LJII() || (aggregatedVideo = searchMixFeed.aggregatedVideo) == null || (list = aggregatedVideo.awemes) == null) {
            return -1;
        }
        Iterator<Aweme> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            String aid = it.next().getAid();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (o.LJ(aid, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void LIZLLL(C145995oB c145995oB, InterfaceC83727WtX effectController) {
        String str;
        String str2;
        String str3;
        Float valueOf;
        String f;
        Float valueOf2;
        Float valueOf3;
        o.LJIIIZ(effectController, "effectController");
        C78941UyX aa = effectController.aa();
        Float f2 = null;
        if (aa != null) {
            f2 = Float.valueOf(aa.LIZ);
        }
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (f2 == null || (str = f2.toString()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("process_texture_time", str);
        if (aa == null || (valueOf3 = Float.valueOf(aa.LIZIZ)) == null || (str2 = valueOf3.toString()) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("pure_render_time", str2);
        if (aa == null || (valueOf2 = Float.valueOf(aa.LIZJ)) == null || (str3 = valueOf2.toString()) == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("wait_algorithm_time", str3);
        if (aa != null && (valueOf = Float.valueOf(aa.LIZLLL)) != null && (f = valueOf.toString()) != null) {
            str4 = f;
        }
        c145995oB.LIZLLL("pure_algorithm_time", str4);
    }

    public static void LJII(String str, Object... objArr) {
        LJIILIIL(str, LJJII(objArr), objArr);
    }

    public static final C1811078w LJIIL(User user, C1811278y c1811278y) {
        return new C1811078w(user, C47261Igj.LJJIJ(1001), "like", c1811278y);
    }

    public static final String LJIILLIIL(DataChannel dataChannel, String sdkKey) {
        RoomCreateInfo roomCreateInfo;
        java.util.Map<Long, PushStreamInfo> map;
        PushStreamInfo pushStreamInfo;
        List<PushStreamInfo.Quality> list;
        o.LJIIIZ(sdkKey, "sdkKey");
        if (ujb.o.LJJJJJL(sdkKey)) {
            return "";
        }
        if (dataChannel == null || (roomCreateInfo = (RoomCreateInfo) dataChannel.kv0(RoomCreateInfoChannel.class)) == null || (map = roomCreateInfo.pushStreamInfoMap) == null || (pushStreamInfo = map.get(4L)) == null || (list = pushStreamInfo.qualityList) == null || list.isEmpty()) {
            String str = (String) ((LinkedHashMap) B96.LIZJ).get(sdkKey);
            if (str == null) {
                return "";
            }
            return str;
        }
        for (PushStreamInfo.Quality quality : list) {
            if (o.LJ(quality.sdkKey, sdkKey)) {
                String str2 = quality.name;
                o.LJIIIIZZ(str2, "it.name");
                return str2;
            }
        }
        String str3 = (String) ((LinkedHashMap) B96.LIZJ).get(sdkKey);
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    public static final String LJIJJLI(android.net.Uri getQueryParameterSafely, String key) {
        o.LJIIJ(getQueryParameterSafely, "$this$getQueryParameterSafely");
        o.LJIIJ(key, "key");
        if (!getQueryParameterSafely.isHierarchical()) {
            return null;
        }
        return UriProtector.getQueryParameter(getQueryParameterSafely, key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MediaSafetyModel LJJ(C109544Rq c109544Rq, boolean z) {
        boolean z2;
        if (!C93793mB.LJI(c109544Rq)) {
            return null;
        }
        DMCameraSafetyExperiment.LIZ.getClass();
        if (DMCameraSafetyExperiment.LIZLLL && c109544Rq.getCreatedAt() > DMCameraSafetyExperiment.LIZJ && !c109544Rq.isSelf() && (C78897Uxp.LJJIIJZLJL(c109544Rq) || z)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C52406KhW.LIZ || z2 || C78897Uxp.LJJIJIL(c109544Rq)) {
            String uuid = c109544Rq.getUuid();
            o.LJIIIIZZ(uuid, "uuid");
            return new MediaSafetyModel(uuid, String.valueOf(c109544Rq.getMsgId()), true, z2, C78897Uxp.LJJIJIL(c109544Rq), o.LJ(c109544Rq.getExt().get("a:is_nude"), "true"), C78897Uxp.LJJIIJZLJL(c109544Rq), C62070OXq.LIZIZ(c109544Rq));
        }
        boolean z3 = false;
        return new MediaSafetyModel(null, 0 == true ? 1 : 0, z3, z3, z3, z3, z3, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public static final PrivacySettingsRestrictionOption LJJIFFI(PrivacySettingsRestrictionItem privacySettingsRestrictionItem, Integer num) {
        List<PrivacySettingsRestrictionOption> values = privacySettingsRestrictionItem.getValues();
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption = null;
        if (values == null) {
            return null;
        }
        Iterator<PrivacySettingsRestrictionOption> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PrivacySettingsRestrictionOption next = it.next();
            int value = next.getValue();
            if (num != null && value == num.intValue()) {
                privacySettingsRestrictionOption = next;
                break;
            }
        }
        return privacySettingsRestrictionOption;
    }

    public static final boolean LJJIJIIJIL(C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        o.LJIIIZ(c109544Rq, "<this>");
        if (C93793mB.LJIIZILJ(c109544Rq) || c109544Rq2 == null || c109544Rq.getSender() != c109544Rq2.getSender() || c109544Rq.getCreatedAt() - c109544Rq2.getCreatedAt() > 30000 || LJJIL(c109544Rq2)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJIL(C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        boolean z;
        o.LJIIIZ(c109544Rq, "<this>");
        if (c109544Rq2 == null || c109544Rq2.getSender() != c109544Rq.getSender() || c109544Rq2.getCreatedAt() - c109544Rq.getCreatedAt() > 30000 || LJJIL(c109544Rq2) || C93793mB.LJIIZILJ(c109544Rq2)) {
            z = true;
        } else {
            z = false;
        }
        if (C93793mB.LJIIL(c109544Rq2)) {
            if (!z && !C93793mB.LJIILJJIL(c109544Rq2)) {
                return false;
            }
            return true;
        }
        return z;
    }

    public static final void LJJJ(TextView textView, CRD message) {
        CharSequence content;
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(message, "message");
        if (!(message instanceof CQO) || (content = message.getContent()) == null) {
            return;
        }
        textView.setText(content);
        if (message instanceof C31290CPu) {
            ((C31290CPu) message).LJIJJ(new C31403CUd(textView, content));
        }
    }

    public static void LJJJIL(String str, boolean z) {
        EF7.LIZIZ();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("filePath", str);
                c198517qh.LIZ.put("share_platform", "download");
                c198517qh.LIZ.put("fileLength", String.valueOf(new File(str).length()));
                c198517qh.LIZ.put("fileExist", String.valueOf(z));
                FUA.LIZJ("aweme_share_monitor", c198517qh.LJ());
            }
        } catch (Exception unused) {
        }
    }

    public static void LJJJJI(AnimatorSet animatorSet, List list) {
        int size = ((ArrayList) list).size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) ListProtector.get(list, i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        ListProtector.add(list, 0, ofInt);
        animatorSet.playTogether(list);
    }

    public static final android.net.Uri LJJJJIZL(android.net.Uri uri, String queryParameterName) {
        o.LJIIJ(queryParameterName, "queryParameterName");
        if (!uri.isHierarchical()) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        o.LJFF(clearQuery, "this.buildUpon().clearQuery()");
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            if (!o.LJ(str, queryParameterName)) {
                Iterator<String> it = UriProtector.getQueryParameters(uri, str).iterator();
                while (it.hasNext()) {
                    clearQuery.appendQueryParameter(str, it.next());
                }
            }
        }
        android.net.Uri build = clearQuery.build();
        o.LJFF(build, "builder.build()");
        return build;
    }

    public static final android.net.Uri LJJJJJ(android.net.Uri removeQueryParametersSafely, List queryParameterNames) {
        o.LJIIJ(removeQueryParametersSafely, "$this$removeQueryParametersSafely");
        o.LJIIJ(queryParameterNames, "queryParameterNames");
        if (!removeQueryParametersSafely.isHierarchical()) {
            return removeQueryParametersSafely;
        }
        Uri.Builder clearQuery = removeQueryParametersSafely.buildUpon().clearQuery();
        o.LJFF(clearQuery, "this.buildUpon().clearQuery()");
        for (String str : UriProtector.getQueryParameterNames(removeQueryParametersSafely)) {
            if (!queryParameterNames.contains(str)) {
                Iterator<String> it = UriProtector.getQueryParameters(removeQueryParametersSafely, str).iterator();
                while (it.hasNext()) {
                    clearQuery.appendQueryParameter(str, it.next());
                }
            }
        }
        android.net.Uri build = clearQuery.build();
        o.LJFF(build, "builder.build()");
        return build;
    }

    public static final InnerEffectTextLayoutConfig LJJJJJL(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, float f) {
        ArrayList arrayList = new ArrayList();
        Iterator<InnerEffectTextConfig> it = innerEffectTextLayoutConfig.getTextConfigs().iterator();
        while (it.hasNext()) {
            arrayList.add(InnerEffectTextConfig.copy$default(it.next(), 0, 0, 0, 0, 0, 0, 0, 0, 0, (int) (r3.getTextSize() * f), 0, 0, 0, 0, null, 0, null, 0, 0, null, null, 0, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, 2147483135, null));
        }
        return InnerEffectTextLayoutConfig.copy$default(innerEffectTextLayoutConfig, null, 0, 0.0f, 0, 0, 0, 0, arrayList, null, 383, null);
    }

    public static boolean LJJJJL(C117434jD c117434jD, EnumC78943UyZ enumC78943UyZ) {
        if (c117434jD == null) {
            return false;
        }
        if (enumC78943UyZ == EnumC78943UyZ.AUTO) {
            if (!C78964Uyu.LJ(c117434jD.LIZIZ()) && !"file".equals(C78964Uyu.LIZIZ(c117434jD.LIZIZ()))) {
                return false;
            }
            return true;
        }
        if (enumC78943UyZ != EnumC78943UyZ.RESIZE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0023, code lost:
    
        if (r5 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.feed.model.Aweme LJJJLIIL(X.C109544Rq r6, java.lang.Boolean r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r5 = X.C1DJ.LJIILL(r6)
            com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate r5 = (com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate) r5
            java.lang.String r0 = X.C78923UyF.LJIIIZ(r6)
            if (r0 == 0) goto L5f
            java.util.List r3 = X.C47261Igj.LJJIJ(r0)
        L15:
            if (r5 == 0) goto L21
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r5.imageComponent
            if (r0 == 0) goto L21
            java.util.List r2 = X.C79081V1x.LJIIL(r0)
            if (r2 != 0) goto L25
        L21:
            X.OQg r2 = X.C61878OQg.INSTANCE
            if (r5 == 0) goto L2f
        L25:
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r5.thumbnailComponent
            if (r0 == 0) goto L2f
            java.util.List r1 = X.C79081V1x.LJIIL(r0)
            if (r1 != 0) goto L31
        L2f:
            X.OQg r1 = X.C61878OQg.INSTANCE
        L31:
            com.ss.android.ugc.aweme.feed.model.Video r4 = new com.ss.android.ugc.aweme.feed.model.Video
            r4.<init>()
            java.util.List r0 = X.ORZ.LLIIIZ(r2, r3)
            java.util.List r0 = X.ORZ.LLIIIZ(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L47:
            boolean r0 = r2.hasNext()
            r1 = 0
            if (r0 == 0) goto L62
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L47
            r3.add(r1)
            goto L47
        L5f:
            X.OQg r3 = X.C61878OQg.INSTANCE
            goto L15
        L62:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = X.C78934UyQ.LJJIIJ(r3)
            r4.setCover(r0)
            if (r5 == 0) goto Ld8
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r5.imageComponent
            if (r0 == 0) goto Ld8
            com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent r0 = r0.resolution
            if (r0 == 0) goto Ld8
            int r0 = r0.height
        L75:
            r4.setHeight(r0)
            if (r5 == 0) goto L84
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r5.imageComponent
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent r0 = r0.resolution
            if (r0 == 0) goto L84
            int r1 = r0.width
        L84:
            r4.setWidth(r1)
            long r0 = r6.getSender()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r6.getSecSender()
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = X.C80533Eb.LJFF(r1, r0)
            com.ss.android.ugc.aweme.profile.model.User r3 = new com.ss.android.ugc.aweme.profile.model.User
            r3.<init>()
            r0 = 0
            if (r1 == 0) goto La3
            java.lang.String r0 = r1.getNickName()
        La3:
            java.lang.String r2 = ""
            if (r0 != 0) goto La8
            r0 = r2
        La8:
            r3.setNickname(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = new com.ss.android.ugc.aweme.feed.model.Aweme
            r1.<init>()
            r1.setAuthor(r3)
            r0 = 501(0x1f5, float:7.02E-43)
            r1.setAwemeType(r0)
            r1.setVideo(r4)
            if (r5 == 0) goto Lc5
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r5.imageComponent
            if (r0 == 0) goto Lc5
            java.lang.String r0 = r0.id
            if (r0 != 0) goto Ld6
        Lc5:
            r1.setAid(r2)
            if (r7 == 0) goto Ld5
            boolean r0 = r7.booleanValue()
            com.ss.android.ugc.aweme.im.service.model.MediaSafetyModel r0 = LJJ(r6, r0)
            r1.setDMMediaSafetyModel(r0)
        Ld5:
            return r1
        Ld6:
            r2 = r0
            goto Lc5
        Ld8:
            r0 = 0
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78939UyV.LJJJLIIL(X.4Rq, java.lang.Boolean):com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    public static final Aweme LJJJLL(C109544Rq c109544Rq, Boolean bool) {
        VideoCoverComponent videoCoverComponent;
        C117824jq c117824jq;
        Iterable iterable;
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        VideoUrlModel videoUrlModel;
        C117824jq c117824jq2;
        String localPath;
        ResolutionComponent resolutionComponent;
        ResolutionComponent resolutionComponent2;
        ImageComponent imageComponent;
        o.LJIIIZ(c109544Rq, "<this>");
        VideoCardTemplate videoCardTemplate = (VideoCardTemplate) C1DJ.LJIILL(c109544Rq);
        String str4 = null;
        if (videoCardTemplate != null) {
            videoCoverComponent = videoCardTemplate.baseVideoComponent;
        } else {
            videoCoverComponent = null;
        }
        List<C117824jq> attachments = c109544Rq.getAttachments();
        if (attachments != null) {
            c117824jq = (C117824jq) ORZ.LJLLLLLL(0, attachments);
        } else {
            c117824jq = null;
        }
        List LJJIJIIJIL = C47261Igj.LJJIJIIJIL(C78923UyF.LJIIJ(c109544Rq));
        if (videoCoverComponent == null || (imageComponent = videoCoverComponent.coverImage) == null || (iterable = imageComponent.urls) == null) {
            iterable = C61878OQg.INSTANCE;
        }
        IMUser LJIIJ = C80533Eb.LJIIJ(String.valueOf(c109544Rq.getSender()), c109544Rq.getSecSender());
        if (LJIIJ != null) {
            str = LJIIJ.getNickName();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (videoCoverComponent == null || (str2 = videoCoverComponent.id) == null) {
            str2 = "";
        }
        if (videoCoverComponent != null && (resolutionComponent2 = videoCoverComponent.resolutionComponent) != null && resolutionComponent2.width > 0 && resolutionComponent2.height > 0) {
            i = resolutionComponent2.width;
        } else if (c117824jq != null) {
            i = c117824jq.getOriginalWidth();
        } else {
            i = 0;
        }
        if (videoCoverComponent != null && (resolutionComponent = videoCoverComponent.resolutionComponent) != null && resolutionComponent.width > 0 && resolutionComponent.height > 0) {
            i2 = resolutionComponent.height;
        } else if (c117824jq != null) {
            i2 = c117824jq.getOriginalHeight();
        } else {
            i2 = 0;
        }
        List<C117824jq> attachments2 = c109544Rq.getAttachments();
        if (attachments2 != null && (c117824jq2 = (C117824jq) ORZ.LJLLLLLL(0, attachments2)) != null && (localPath = c117824jq2.getLocalPath()) != null) {
            str3 = C78923UyF.LJIJI(localPath);
        } else {
            str3 = null;
        }
        if (videoCoverComponent != null) {
            str4 = videoCoverComponent.videoModel;
        }
        UserVideoModel userVideoModel = new UserVideoModel(str, str2, str3, i, i2, ORZ.LLIIIZ(iterable, LJJIJIIJIL), str4);
        Video video = new Video();
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(userVideoModel.thumbnails);
        video.setCover(urlModel);
        String str5 = userVideoModel.localVideoPath;
        if (str5 == null || str5.length() == 0) {
            videoUrlModel = new VideoUrlModel();
        } else {
            videoUrlModel = new VideoUrlModel();
            videoUrlModel.setSourceId(userVideoModel.vid);
            videoUrlModel.setUri(userVideoModel.localVideoPath);
            videoUrlModel.setUrlList(C47261Igj.LJJIJ(userVideoModel.localVideoPath));
            videoUrlModel.setUrlKey(userVideoModel.vid);
        }
        video.setPlayAddr(videoUrlModel);
        video.setVideoModelStr(userVideoModel.videoModel);
        video.setWidth(userVideoModel.originalWidth);
        video.setHeight(userVideoModel.originalHeight);
        video.setPlayAddrBytevc1(video.getPlayAddr());
        User user = new User();
        user.setNickname(userVideoModel.senderNickname);
        Aweme aweme = new Aweme();
        aweme.setAuthor(user);
        aweme.setDesc("");
        aweme.setEllipsizeDesc("");
        aweme.setVideo(video);
        aweme.setAid(userVideoModel.vid);
        if (bool != null) {
            aweme.setDMMediaSafetyModel(LJJ(c109544Rq, bool.booleanValue()));
        }
        aweme.setAwemeType(502);
        return aweme;
    }

    public static int LJIIJJI(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        do {
            int ceil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = ceil;
            if (i > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i = ceil;
            }
            if (i == ceil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
            i2++;
        } while (i2 < 6);
        return i;
    }

    public static String LJIILIIL(String str, Throwable th, Object... objArr) {
        if ((th == null && objArr.length > 0) || objArr.length > 1) {
            return C16880lQ.LLLZI(Locale.US, str, objArr);
        }
        return str;
    }

    public static final int LJIJ(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            int i4 = i2 % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            int i5 = i % i3;
            if (i5 < 0) {
                i5 += i3;
            }
            int i6 = (i4 - i5) % i3;
            if (i6 < 0) {
                i6 += i3;
            }
            return i2 - i6;
        }
        if (i3 < 0) {
            if (i <= i2) {
                return i2;
            }
            int i7 = -i3;
            int i8 = i % i7;
            if (i8 < 0) {
                i8 += i7;
            }
            int i9 = i2 % i7;
            if (i9 < 0) {
                i9 += i7;
            }
            int i10 = (i8 - i9) % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            return i2 + i10;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final long LJIJI(long j, long j2, long j3) {
        if (j3 > 0) {
            if (j >= j2) {
                return j2;
            }
            long j4 = j2 % j3;
            if (j4 < 0) {
                j4 += j3;
            }
            long j5 = j % j3;
            if (j5 < 0) {
                j5 += j3;
            }
            long j6 = (j4 - j5) % j3;
            if (j6 < 0) {
                j6 += j3;
            }
            return j2 - j6;
        }
        if (j3 < 0) {
            if (j <= j2) {
                return j2;
            }
            long j7 = -j3;
            long j8 = j % j7;
            if (j8 < 0) {
                j8 += j7;
            }
            long j9 = j2 % j7;
            if (j9 < 0) {
                j9 += j7;
            }
            long j10 = (j8 - j9) % j7;
            if (j10 < 0) {
                j10 += j7;
            }
            return j2 + j10;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final PrivacySettingsRestrictionItem LJJI(PrivacySettingsRestriction privacySettingsRestriction, int i, String target) {
        java.util.Map<String, PrivacySettingsRestrictionItem> account;
        o.LJIIIZ(target, "target");
        if (i != 0) {
            if (i != 1 && i != 2) {
                return null;
            }
            account = privacySettingsRestriction.getVideoPrivacy();
        } else {
            account = privacySettingsRestriction.getAccount();
        }
        if (account == null) {
            return null;
        }
        return account.get(target);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0170, code lost:
    
        if (r14 == 1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0165, code lost:
    
        return 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01d5, code lost:
    
        if (r1 == 1) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01dc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJJJI(int r16, int r17, java.lang.CharSequence r18) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78939UyV.LJJJI(int, int, java.lang.CharSequence):int");
    }
}
