package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.message.ext.HotTag;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.data.Product;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiReTagEntranceOptExperiment;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiReTagUIExperiment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.VoiceRecognizeStickerHandler;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Uy7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78915Uy7 implements InterfaceC79152V4q, InterfaceC48038ItG {
    public static final C78915Uy7 LJLIL = new C78915Uy7();

    @Override // X.InterfaceC79152V4q
    public boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC79152V4q
    public float LIZIZ() {
        return 4.0f;
    }

    @Override // X.InterfaceC79152V4q
    public boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC79152V4q
    public int LIZLLL() {
        return 15;
    }

    @Override // X.InterfaceC79152V4q
    public boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC79152V4q
    public String LJFF() {
        return "";
    }

    @Override // X.InterfaceC79152V4q
    public float LJII() {
        return 1.0f;
    }

    public void LJJIFFI() {
    }

    public void LJJII() {
    }

    public void LJJIII(VerificationResponse verificationResponse) {
        throw null;
    }

    public static boolean LJIJI() {
        return e1.LIZ(31744, "optimize_combinev2focus", true, false);
    }

    @Override // X.InterfaceC79152V4q
    public EnumC83605WrZ LJI() {
        return EnumC83605WrZ.AS_ENCODE_PROFILE_UNKNOWN;
    }

    public static String LJIIIZ(Object[] objArr) {
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append("#");
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final PopProductResp LJIILJJIL(PopProductResp popProductResp) {
        o.LJIIIZ(popProductResp, "<this>");
        Product product = popProductResp.product;
        HotTag hotTag = popProductResp.hotTag;
        List<AtmosphereTag> list = popProductResp.atmosphereTags;
        List<AtmosphereTag> list2 = popProductResp.pinAtmosphereTags;
        long j = popProductResp.serverTime;
        String str = popProductResp.schema;
        int i = popProductResp.bagIndex;
        if (i <= 0) {
            if (product != null) {
                i = product.bagIndex;
            } else {
                i = 0;
            }
        }
        return new PopProductResp(product, hotTag, list, list2, j, str, i, popProductResp.assistantSwitch, null, 0L, popProductResp.liveBagAndPinCardType, 768, 0 == true ? 1 : 0);
    }

    public static final String LJIILLIIL(User user) {
        if (user == null || user.getNickname() == null) {
            return "";
        }
        String nickname = user.getNickname();
        o.LJIIIIZZ(nickname, "{\n        user.nickname\n    }");
        return nickname;
    }

    public static final AVChallenge LJIIZILJ(I0N i0n) {
        List<? extends AVChallenge> list;
        o.LJIIIZ(i0n, "<this>");
        F4V LLLIIII = i0n.LLLIIII(C63091OpT.INSTANCE);
        if (!(LLLIIII instanceof C46216IBw)) {
            LLLIIII = null;
        }
        C46216IBw c46216IBw = (C46216IBw) LLLIIII;
        if (c46216IBw == null || (list = c46216IBw.LJLILLLLZI) == null) {
            return null;
        }
        return (AVChallenge) ORZ.LJLLLL(list);
    }

    public static final String LJIJ(User user) {
        String userName;
        String remarkName;
        if (user == null) {
            return "";
        }
        String uniqueId = user.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            userName = user.getShortId();
        } else {
            userName = user.getUniqueId();
        }
        if (userName == null || userName.length() == 0) {
            if (TextUtils.isEmpty(user.getRemarkName())) {
                remarkName = user.getNickname();
                if (remarkName == null) {
                    return "";
                }
            } else {
                remarkName = user.getRemarkName();
                if (remarkName == null) {
                    return "";
                }
            }
            return remarkName;
        }
        o.LJIIIIZZ(userName, "userName");
        return userName;
    }

    public static boolean LJIJJ(List list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static java.util.Map LJJ(List list) {
        Object obj;
        if (LJIJJ(list)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair != null && (obj = pair.first) != null) {
                hashMap.put(obj, pair.second);
            }
        }
        return hashMap;
    }

    public static final boolean LJJI(Aweme aweme) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        PoiReTagEntranceOptExperiment.EntranceFrequency frequency;
        Integer notClickTimes;
        PoiReTagEntranceOptExperiment.EntranceFrequency frequency2;
        Integer closeTimes;
        PoiReTagEntranceOptExperiment.EntranceFrequency frequency3;
        Integer frequencyDays;
        int i4;
        if (aweme != null && aweme.getPoiReTagSignal() == 1 && !aweme.isAd() && aweme.getAwemeRawAd() == null) {
            C51556KLg.LIZ.getClass();
            if (!C51556KLg.LIZ().enable()) {
                return false;
            }
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if ((commerceVideoAuthInfo != null && commerceVideoAuthInfo.isPreventSelfSee()) || aweme.getStarAtlasOrderId() > 0 || !C211898Th.LIZ()) {
                return false;
            }
            java.util.Set<String> stringSet = EBF.LIZIZ().getStringSet("key_poi_re_tag_aid", new LinkedHashSet());
            o.LJIIIIZZ(stringSet, "INSTANCE.getStringSet(KE…_TAG_AID, mutableSetOf())");
            if (stringSet.contains(aweme.getAid())) {
                return false;
            }
            if (!PoiReTagEntranceOptExperiment.LIZIZ()) {
                int LIZJ = EBF.LIZJ();
                PoiReTagUIExperiment.PoiReTagConfig poiReTagConfig = (PoiReTagUIExperiment.PoiReTagConfig) PoiReTagUIExperiment.LIZIZ.getValue();
                if (poiReTagConfig != null) {
                    i4 = poiReTagConfig.closeMaxTimes;
                } else {
                    i4 = 2;
                }
                if (LIZJ >= i4) {
                    return false;
                }
            } else {
                PoiReTagEntranceOptExperiment.Config LIZ = PoiReTagEntranceOptExperiment.LIZ();
                if (LIZ != null && (frequency3 = LIZ.getFrequency()) != null && (frequencyDays = frequency3.getFrequencyDays()) != null) {
                    i = frequencyDays.intValue();
                } else {
                    i = 0;
                }
                PoiReTagEntranceOptExperiment.Config LIZ2 = PoiReTagEntranceOptExperiment.LIZ();
                if (LIZ2 != null && (frequency2 = LIZ2.getFrequency()) != null && (closeTimes = frequency2.getCloseTimes()) != null) {
                    i2 = closeTimes.intValue();
                } else {
                    i2 = 0;
                }
                PoiReTagEntranceOptExperiment.Config LIZ3 = PoiReTagEntranceOptExperiment.LIZ();
                if (LIZ3 != null && (frequency = LIZ3.getFrequency()) != null && (notClickTimes = frequency.getNotClickTimes()) != null) {
                    i3 = notClickTimes.intValue();
                } else {
                    i3 = 0;
                }
                if (i != 0) {
                    long j = EBF.LIZIZ().getLong(EBF.LJ("key_poi_re_tag_entrance_next_clear_time"), 0L);
                    if (j != 0) {
                        if (System.currentTimeMillis() >= j) {
                            EBF.LIZIZ().storeInt(EBF.LJ("key_poi_re_tag_entrance_not_click_time"), 0);
                            EBF.LIZIZ().storeInt(EBF.LJ("key_poi_re_tag_entrance_close_time"), 0);
                            EBF.LIZIZ().storeLong(EBF.LJ("key_poi_re_tag_entrance_next_clear_time"), 0L);
                        }
                        return false;
                    }
                    if (i2 != 0 && i2 <= EBF.LIZIZ().getInt(EBF.LJ("key_poi_re_tag_entrance_close_time"), 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i3 != 0 && i3 <= EBF.LIZIZ().getInt(EBF.LJ("key_poi_re_tag_entrance_not_click_time"), 0)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z || z2) {
                        long millis = TimeUnit.DAYS.toMillis(i) + System.currentTimeMillis();
                        if (PoiReTagEntranceOptExperiment.LIZIZ()) {
                            EBF.LIZIZ().storeLong(EBF.LJ("key_poi_re_tag_entrance_next_clear_time"), millis);
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final ExtractedText LJJIJIIJIL(C15010iP c15010iP) {
        o.LJIIIZ(c15010iP, "<this>");
        ExtractedText extractedText = new ExtractedText();
        String str = c15010iP.LIZ.LJLIL;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = C08350Ul.LJ(c15010iP.LIZIZ);
        extractedText.selectionEnd = C08350Ul.LIZLLL(c15010iP.LIZIZ);
        extractedText.flags = !s.LJJJZ(c15010iP.LIZ.LJLIL, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final MusicModel LJJIJIL(AVMusic aVMusic) {
        o.LJIIIZ(aVMusic, "<this>");
        return I9S.LIZ(aVMusic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AddYoursTopic LJJIJL(AddYoursStickerStruct addYoursStickerStruct) {
        return new AddYoursTopic(addYoursStickerStruct.getTopicId(), addYoursStickerStruct.getText(), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, addYoursStickerStruct.getVideoCount(), 0 == true ? 1 : 0, addYoursStickerStruct.getFromQuestion(), 0, addYoursStickerStruct.getViewerInvited(), 348, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        T t = it.data;
        if (t != 0) {
            return t;
        }
        throw new UIM(10001, "exchange threshold info data is null");
    }

    public static void LJIIIIZZ(java.util.Map map, boolean z) {
        ((HashMap) map).put("x-tt-request-tag", KMP.LJ("t=0;n=", z ? 1 : 0));
    }

    public static final void LJIIJJI(VideoPublishEditModel videoPublishEditModel, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        int LIZ = C44517HdZ.LIZ();
        boolean LJ = C19N.LJ("enable_synthetic_fps_set", true);
        int maxFps4Videos = videoPublishEditModel.maxFps4Videos();
        int videoFps = videoPublishEditModel.videoFps(false);
        int LIZ2 = C00F.LIZ(31744, 16, "studio_vq_dynamic_element_low_video_fps_threshold", true);
        if (e1.LIZ(31744, "studio_vq_enable_low_video_fps_opt", true, false)) {
            if (H7R.LJJIII(videoPublishEditModel) && maxFps4Videos < LIZ2) {
                StringBuilder LIZJ = C06460Ne.LIZJ("UploadFps ; opt , video ; fpsLimit : ", LIZ, " , dynamicElementLowVideoFpsThreshold : ", LIZ2, "; sourceFps : ");
                LIZJ.append(maxFps4Videos);
                LIZJ.append(" ; setFps : ");
                LIZJ.append(LIZ2);
                C5Z5.LIZIZ(X1D.LIZIZ(LIZJ));
                interfaceC88472Yns.invoke(Integer.valueOf(LIZ2));
                return;
            }
            if (!LJ || videoFps <= 0) {
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("UploadFps ; opt, video ; enableFpsSet : ");
            LIZ3.append(LJ);
            LIZ3.append(" ; setFps : ");
            LIZ3.append(maxFps4Videos);
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ3));
            interfaceC88472Yns.invoke(Integer.valueOf(videoFps));
            return;
        }
        if (H7R.LJJIII(videoPublishEditModel) && videoFps < 10) {
            if (LIZ > 0) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("UploadFps ; video ; fpsLimit : ");
                LIZ4.append(LIZ);
                LIZ4.append(" ; sourceFps : ");
                LIZ4.append(videoFps);
                LIZ4.append(" ; setFps : 30");
                C5Z5.LIZIZ(X1D.LIZIZ(LIZ4));
                interfaceC88472Yns.invoke(30);
                return;
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("UploadFps ; video ; fpsLimit : ");
            LIZ5.append(LIZ);
            LIZ5.append(" ; setFps : 30");
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ5));
            interfaceC88472Yns.invoke(30);
            return;
        }
        if (!LJ || videoFps <= 0) {
            return;
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("UploadFps ; video ; enableFpsSet : ");
        LIZ6.append(LJ);
        LIZ6.append(" ; setFps : ");
        LIZ6.append(videoFps);
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ6));
        interfaceC88472Yns.invoke(Integer.valueOf(videoFps));
    }

    public static final void LJIIL(I0N i0n, boolean z) {
        o.LJIIIZ(i0n, "<this>");
        F4V LLLIIII = i0n.LLLIIII(C78916Uy8.INSTANCE);
        if (!(LLLIIII instanceof StickerVideoStatusHandler)) {
            LLLIIII = null;
        }
        StickerVideoStatusHandler stickerVideoStatusHandler = (StickerVideoStatusHandler) LLLIIII;
        if (stickerVideoStatusHandler != null) {
            if (z) {
                if (stickerVideoStatusHandler.LJLJI == 1) {
                    stickerVideoStatusHandler.LJLJJLL.start();
                    return;
                }
                return;
            }
            stickerVideoStatusHandler.LJLJJLL.pause();
        }
    }

    public static final boolean LJIILIIL(ArrayList arrayList, MusicModel musicModel) {
        o.LJIIIZ(arrayList, "<this>");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MusicModel musicModel2 = (MusicModel) it.next();
            if ((musicModel2.isSpeechToSong() && musicModel.isSpeechToSong()) || o.LJ(musicModel2.getMusicId(), musicModel.getMusicId())) {
                return true;
            }
        }
        return false;
    }

    public static final int LJIILL(ArrayList arrayList, MusicModel musicModel) {
        o.LJIIIZ(arrayList, "<this>");
        if (musicModel == null) {
            return -1;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                MusicModel musicModel2 = (MusicModel) next;
                if (musicModel2.isSpeechToSong() && musicModel.isSpeechToSong()) {
                    return i;
                }
                if (o.LJ(musicModel2.getMusicId(), musicModel.getMusicId())) {
                    return i;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return -1;
    }

    public static String LJIJJLI(String str, Object... objArr) {
        int indexOf;
        String LIZIZ;
        String valueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            try {
                LIZIZ = String.valueOf(obj);
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(obj.getClass().getName());
                LIZ.append('@');
                LIZ.append(Integer.toHexString(System.identityHashCode(obj)));
                String LIZIZ2 = X1D.LIZIZ(LIZ);
                Logger logger = Logger.getLogger("com.bytedance.jedi.model.guava.base.Strings");
                Level level = Level.WARNING;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Exception during lenientFormat for ");
                LIZ2.append(LIZIZ2);
                logger.log(level, X1D.LIZIZ(LIZ2), (Throwable) e);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("<");
                LIZ3.append(LIZIZ2);
                LIZ3.append(" threw ");
                LIZ3.append(e.getClass().getName());
                LIZ3.append(">");
                LIZIZ = X1D.LIZIZ(LIZ3);
            }
            objArr[i2] = LIZIZ;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) valueOf, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final int LJIL(Context context, Integer num) {
        o.LJIIIZ(context, "context");
        if (num != null) {
            if (num.intValue() == 1) {
                return AnonymousClass636.LJIIIIZZ(R.attr.go, context);
            }
            if (num.intValue() == 2) {
                return AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
            }
            if (num.intValue() == 3) {
                return AnonymousClass636.LJIIIIZZ(R.attr.bx, context);
            }
        }
        return AnonymousClass636.LJIIIIZZ(R.attr.go, context);
    }

    public static final void LJJIIJZLJL(I0N i0n, Cert policyPlaceholder) {
        o.LJIIIZ(i0n, "<this>");
        o.LJIIIZ(policyPlaceholder, "policyPlaceholder");
        F4V LLLIIII = i0n.LLLIIII(C78917Uy9.INSTANCE);
        if (!(LLLIIII instanceof VoiceRecognizeStickerHandler)) {
            LLLIIII = null;
        }
        VoiceRecognizeStickerHandler voiceRecognizeStickerHandler = (VoiceRecognizeStickerHandler) LLLIIII;
        if (voiceRecognizeStickerHandler != null) {
            C46178IAk c46178IAk = new C46178IAk(policyPlaceholder);
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(voiceRecognizeStickerHandler.LJLJJI);
            LIZ.append(" reopenAudioRecorder lifecycleOwner isActive: currentSticker ");
            LIZ.append(voiceRecognizeStickerHandler.LJLILLLLZI);
            LIZLLL.i(X1D.LIZIZ(LIZ));
            if (voiceRecognizeStickerHandler.LJLILLLLZI != null) {
                if (voiceRecognizeStickerHandler.LJLL.invoke().booleanValue()) {
                    voiceRecognizeStickerHandler.LJIILIIL(c46178IAk);
                } else {
                    voiceRecognizeStickerHandler.LJLJJLL.LIZ(c46178IAk);
                }
            }
        }
    }

    public static final void LJJIJLIJ(C26045AKb c26045AKb, CreativeToastBuilder creativeToastBuilder) {
        Long duration = creativeToastBuilder.getConfig().getDuration();
        if (duration != null) {
            c26045AKb.LIZLLL(duration.longValue());
        }
        String message = creativeToastBuilder.getConfig().getMessage();
        if (message != null) {
            c26045AKb.LJIIIZ(message);
        }
        Integer messageRes = creativeToastBuilder.getConfig().getMessageRes();
        if (messageRes != null) {
            c26045AKb.LJIIIIZZ(messageRes.intValue());
        }
        Integer icon = creativeToastBuilder.getConfig().getIcon();
        if (icon != null) {
            c26045AKb.LJFF(icon.intValue());
        }
        Integer iconColor = creativeToastBuilder.getConfig().getIconColor();
        if (iconColor != null) {
            c26045AKb.LJI(iconColor.intValue());
        }
        Integer iconColorRes = creativeToastBuilder.getConfig().getIconColorRes();
        if (iconColorRes != null) {
            c26045AKb.LJII(iconColorRes.intValue());
        }
        Integer maxWidth = creativeToastBuilder.getConfig().getMaxWidth();
        if (maxWidth != null) {
            c26045AKb.LIZ.LJLILLLLZI = maxWidth.intValue();
        }
        Boolean acrossActivities = creativeToastBuilder.getConfig().getAcrossActivities();
        if (acrossActivities != null) {
            c26045AKb.LIZ(acrossActivities.booleanValue());
        }
    }

    public static final void LJJIL(C70858RrS c70858RrS, InterfaceC88472Yns updater) {
        o.LJIIIZ(c70858RrS, "<this>");
        o.LJIIIZ(updater, "updater");
        LJJIZ(c70858RrS, "lib_track_builtin_lane_business", updater);
    }

    public static final void LJJJ(C70858RrS c70858RrS, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(c70858RrS, "<this>");
        LJJIZ(c70858RrS, "lib_track_builtin_lane_rd", interfaceC88472Yns);
    }

    public static void LJJIIJ(PKN pkn, Header header, CrashType crashType) {
        JSONObject jSONObject = pkn.LIZ;
        if (jSONObject == null || crashType == null) {
            return;
        }
        long optLong = jSONObject.optLong("crash_time");
        String LIZ = PK0.LIZLLL().LIZ();
        if (optLong <= 0 || TextUtils.isEmpty(crashType.getName())) {
            return;
        }
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("android__");
            LIZ2.append(LIZ);
            LIZ2.append("_");
            LIZ2.append(optLong);
            LIZ2.append("_");
            LIZ2.append(crashType);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            JSONObject jSONObject2 = header.LIZ;
            if (jSONObject2 == null) {
                return;
            }
            jSONObject2.put("unique_key", LIZIZ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final Object LJJIIZ(C51171zd c51171zd, int i, InterfaceC88472Yns interfaceC88472Yns) {
        InterfaceC273015i interfaceC273015i = c51171zd.LJLJLLL;
        if (interfaceC273015i != null) {
            int i2 = 1;
            if (i == 5) {
                i2 = 5;
            } else if (i == 6) {
                i2 = 6;
            } else if (i == 3) {
                i2 = 3;
            } else if (i == 4) {
                i2 = 4;
            } else if (i == 1 || 0 != 0) {
                i2 = 2;
            } else if (i != 2) {
                "Unsupported direction for beyond bounds layout".toString();
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            return interfaceC273015i.LIZ(i2, interfaceC88472Yns);
        }
        return null;
    }

    public static final void LJJIIZI(Activity activity, int i, CreativeToastBuilder builder) {
        o.LJIIIZ(activity, "<this>");
        o.LJIIIZ(builder, "builder");
        if (builder.getConfig().getMessage() == null && builder.getConfig().getMessageRes() == null) {
            return;
        }
        if (C146685pI.LIZ()) {
            ((C26051AKh) C26052AKi.LIZ.createToast(activity, i, builder)).show();
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(activity);
        LJJIJLIJ(c26045AKb, builder);
        c26045AKb.LJIIJ();
    }

    public static final void LJJIJ(View view, int i, CreativeToastBuilder builder) {
        o.LJIIIZ(view, "<this>");
        o.LJIIIZ(builder, "builder");
        if (builder.getConfig().getMessage() == null && builder.getConfig().getMessageRes() == null) {
            return;
        }
        if (C146685pI.LIZ()) {
            ((C26051AKh) C26052AKi.LIZ.createToast(view, i, builder)).show();
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(view);
        LJJIJLIJ(c26045AKb, builder);
        c26045AKb.LJIIJ();
    }

    public static final void LJJIJIIJI(Fragment fragment, int i, CreativeToastBuilder builder) {
        o.LJIIIZ(fragment, "<this>");
        o.LJIIIZ(builder, "builder");
        if (builder.getConfig().getMessage() == null && builder.getConfig().getMessageRes() == null) {
            return;
        }
        if (C146685pI.LIZ()) {
            ((C26051AKh) C26052AKi.LIZ.createToast(fragment, i, builder)).show();
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(fragment);
        LJJIJLIJ(c26045AKb, builder);
        c26045AKb.LJIIJ();
    }

    public static final void LJJIZ(C70858RrS c70858RrS, String laneName, InterfaceC88472Yns updater) {
        o.LJIIIZ(c70858RrS, "<this>");
        o.LJIIIZ(laneName, "laneName");
        o.LJIIIZ(updater, "updater");
        LaneParams LIZIZ = c70858RrS.LIZIZ(laneName);
        if (LIZIZ == null) {
            LIZIZ = new LaneParams();
        }
        updater.invoke(LIZIZ);
        c70858RrS.LIZLLL(LIZIZ, laneName);
    }

    public static final float LJIIJ(long j, float f, long j2, long j3) {
        long LJIIJJI = C78897Uxp.LJIIJJI(C11850dJ.LIZIZ(j, f), j3);
        float LJJIZ = C78897Uxp.LJJIZ(C78897Uxp.LJIIJJI(j2, LJIIJJI)) + 0.05f;
        float LJJIZ2 = C78897Uxp.LJJIZ(LJIIJJI) + 0.05f;
        return Math.max(LJJIZ, LJJIZ2) / Math.min(LJJIZ, LJJIZ2);
    }
}
