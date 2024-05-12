package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectHouseEffectSetting;
import com.bytedance.android.livesdk.livesetting.gift.EnableRxBusWrapperSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.canvas.ForwardMusic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment$PreloadProfileMLModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.LoudnessDetectResult;
import com.ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoCropFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import defpackage.i0;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.UzY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79004UzY implements V04, C0T1, InterfaceC37239EjT, InterfaceC13370fl, InterfaceC48038ItG {
    public static boolean LJLIL;
    public static SmartPreloadProfileV2Experiment$PreloadProfileMLModel LJLILLLLZI;
    public static int LJLJI;
    public static final String[] LJLJJI = new String[0];
    public static final C79004UzY LJLJJL = new C79004UzY();
    public static V52 LJLJJLL;

    public static Object LJII(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-8937276080345288614"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static final String LJJJJLL(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static SmartPreloadProfileV2Experiment$PreloadProfileMLModel LJIJI() {
        if (!LJLIL) {
            SmartPreloadProfileV2Experiment$PreloadProfileMLModel smartPreloadProfileV2Experiment$PreloadProfileMLModel = (SmartPreloadProfileV2Experiment$PreloadProfileMLModel) i0.LJ(false, "smart_feed_preload_profile_ml", 31744, SmartPreloadProfileV2Experiment$PreloadProfileMLModel.class, null);
            LJLILLLLZI = smartPreloadProfileV2Experiment$PreloadProfileMLModel;
            if (smartPreloadProfileV2Experiment$PreloadProfileMLModel != null) {
                LJLJI = smartPreloadProfileV2Experiment$PreloadProfileMLModel.groupId;
            }
            LJLIL = true;
        }
        return LJLILLLLZI;
    }

    public static void LJJJJJ() {
        if (((Boolean) DSR.LIZ.getValue()).booleanValue()) {
            if (C35818E3y.LIZIZ()) {
                if (C2NW.LIZ().isNewUser()) {
                    if (!C2NW.LIZ().LJIILLIIL(DS5.LJLIL)) {
                        return;
                    }
                } else if ((C33780DNo.LIZ() & 512) != 512) {
                    return;
                }
                C35801E3h.LJI();
                return;
            }
            if (!DSR.LIZJ() && !DSR.LIZLLL()) {
                return;
            }
            JatoXL.resetPriority(Process.myTid());
            return;
        }
        C35801E3h.LJI();
    }

    public static void LJJJJJL() {
        if (((Boolean) DSR.LIZ.getValue()).booleanValue()) {
            if (C35818E3y.LIZIZ()) {
                if (C2NW.LIZ().isNewUser()) {
                    if (!C2NW.LIZ().LJIILLIIL(DS5.LJLIL)) {
                        return;
                    }
                } else if ((C33780DNo.LIZ() & 512) != 512) {
                    return;
                }
                C35801E3h.LJFF();
                return;
            }
            if (DSR.LIZJ()) {
                EVM.LIZ(Process.myTid(), -12);
                return;
            } else {
                if (!DSR.LIZLLL()) {
                    return;
                }
                EVM.LIZ(Process.myTid(), -16);
                return;
            }
        }
        C35801E3h.LJFF();
    }

    @Override // X.C0T1
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public static final long LJIIIZ() {
        return C025908h.LIZ();
    }

    public static boolean LJJ() {
        if (LJIJI() == null) {
            return false;
        }
        if (LJIJI().groupId != 5 && LJLJI != 6) {
            return false;
        }
        return true;
    }

    @Override // X.C0T1
    public String[] LIZ() {
        return LJLJJI;
    }

    public static final List LJFF(C215518d1 bucket) {
        int i;
        o.LJIIIZ(bucket, "bucket");
        ArrayList arrayList = new ArrayList();
        if (bucket.LIZLLL == EnumC215768dQ.APPEND) {
            i = bucket.LJ;
        } else {
            i = 0;
        }
        int size = bucket.LIZJ.size();
        while (i < size) {
            Iterator<InterfaceC215558d5> it = ((C214998cB) ListProtector.get(bucket.LIZJ, i)).LIZJ.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getData());
            }
            i++;
        }
        return arrayList;
    }

    public static void LJI(Object obj) {
        Object[] objArr = new Object[0];
        try {
            C36538EVq.LIZ(obj, C36538EVq.LIZIZ(obj.getClass(), "clear", C36538EVq.LJ(objArr)), C36538EVq.LJFF(objArr));
        } catch (Exception unused) {
        }
    }

    public static final List LJIIJ(Iterable iterable) {
        o.LJIIIZ(iterable, "<this>");
        if (LiveEffectHouseEffectSetting.INSTANCE.shouldFilterEffectHouseEffects()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!LJJI((LiveEffect) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return ORZ.LLJI(iterable);
    }

    public static final IMUser LJIIJJI(C63120Opw c63120Opw) {
        if (c63120Opw == null || !c63120Opw.isSingleChat()) {
            return null;
        }
        long LIZLLL = C81273Gx.LIZLLL(c63120Opw.getConversationId());
        return C80533Eb.LJIIJ(String.valueOf(LIZLLL), LJIILJJIL(c63120Opw));
    }

    public static final String LJIILIIL(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        return LJIILJJIL(C4WC.LIZIZ.LIZ(str));
    }

    public static /* synthetic */ String LJIILJJIL(C63120Opw c63120Opw) {
        return LJIIL(c63120Opw, LJIILL(c63120Opw));
    }

    public static final String LJIILL(C63120Opw c63120Opw) {
        long LIZLLL;
        if (c63120Opw == null) {
            LIZLLL = -1;
        } else {
            LIZLLL = C81273Gx.LIZLLL(c63120Opw.getConversationId());
        }
        return String.valueOf(LIZLLL);
    }

    public static final LoudnessDetectResult LJIIZILJ(CanvasVideoData canvasVideoData) {
        CanvasExtra extra;
        ForwardCanvasExtra forwardCanvasExtra;
        String mediaMeta;
        LoudnessDetectResult loudnessDetectResult = null;
        if (canvasVideoData == null || (extra = canvasVideoData.getExtra()) == null || (forwardCanvasExtra = extra.getForwardCanvasExtra()) == null || (mediaMeta = forwardCanvasExtra.getMediaMeta()) == null || mediaMeta.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(mediaMeta);
            double optDouble = jSONObject.optDouble("peak");
            double optDouble2 = jSONObject.optDouble("loudness");
            if (Double.isNaN(optDouble) || Double.isNaN(optDouble2)) {
                return null;
            }
            LoudnessDetectResult loudnessDetectResult2 = new LoudnessDetectResult();
            loudnessDetectResult2.avgLoudness = optDouble2;
            loudnessDetectResult2.peakLoudness = optDouble;
            loudnessDetectResult = loudnessDetectResult2;
            return loudnessDetectResult;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return loudnessDetectResult;
        }
    }

    public static final ForwardMusic LJIJ(CanvasVideoData canvasVideoData) {
        CanvasExtra extra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData != null && (extra = canvasVideoData.getExtra()) != null && (forwardCanvasExtra = extra.getForwardCanvasExtra()) != null) {
            return forwardCanvasExtra.getForwardMusic();
        }
        return null;
    }

    public static final List LJIJJ(Intent intent) {
        Object[] objArr;
        o.LJIIIZ(intent, "intent");
        Object serializableExtra = intent.getSerializableExtra("extra.region.list");
        if (serializableExtra == null || !(serializableExtra instanceof TranslatedRegion[]) || (objArr = (Object[]) serializableExtra) == null) {
            return null;
        }
        return ORY.LJJZZIII(objArr);
    }

    public static final boolean LJIJJLI(CanvasVideoData canvasVideoData) {
        CanvasExtra extra;
        if (LJJIII(canvasVideoData) && canvasVideoData != null && (extra = canvasVideoData.getExtra()) != null && extra.getStreamEditConfigure() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJI(LiveEffect liveEffect) {
        Effect effect;
        if (liveEffect == null || (effect = liveEffect.getEffect()) == null || effect.getSource() != 1) {
            return false;
        }
        return true;
    }

    public static boolean LJJIFFI(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIII(CanvasVideoData canvasVideoData) {
        CanvasExtra extra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData == null || (extra = canvasVideoData.getExtra()) == null || (forwardCanvasExtra = extra.getForwardCanvasExtra()) == null || forwardCanvasExtra.getForwardType() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIJ(CanvasVideoData canvasVideoData) {
        if (LJJIII(canvasVideoData) || LJJIJLIJ(canvasVideoData)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIJZLJL(C63120Opw c63120Opw) {
        String str;
        java.util.Map<String, String> ext;
        o.LJIIIZ(c63120Opw, "<this>");
        if (c63120Opw.isSingleChat()) {
            C63088OpQ coreInfo = c63120Opw.getCoreInfo();
            String str2 = null;
            if (coreInfo != null && (ext = coreInfo.getExt()) != null) {
                str = ext.get("a:banner_indicator");
            } else {
                str = null;
            }
            if (!o.LJ(str, "tcm")) {
                java.util.Map<String, String> localExt = c63120Opw.getLocalExt();
                if (localExt != null) {
                    str2 = localExt.get("a:banner_indicator");
                }
                if (o.LJ(str2, "tcm")) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean LJJIIZ(C63120Opw c63120Opw) {
        java.util.Map<String, String> localExt;
        String str;
        java.util.Map<String, String> ext;
        o.LJIIIZ(c63120Opw, "<this>");
        C63088OpQ coreInfo = c63120Opw.getCoreInfo();
        if ((coreInfo == null || (ext = coreInfo.getExt()) == null || (str = ext.get("risk")) == null) && ((localExt = c63120Opw.getLocalExt()) == null || (str = localExt.get("risk")) == null)) {
            str = "";
        }
        List LJLJJL2 = s.LJLJJL(str, new String[]{":"}, 0, 6);
        if (LJLJJL2.size() != 2 || !o.LJ(ListProtector.get(LJLJJL2, 1), "high")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIZI(CanvasVideoData canvasVideoData) {
        if (canvasVideoData == null || canvasVideoData.getCanvasType() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!H7R.LJJJJL(videoPublishEditModel) || H7R.LJJLI(videoPublishEditModel)) {
            return false;
        }
        if (!GA4.LIZ() && (!C41535GRv.LIZ() || (str = videoPublishEditModel.heading) == null || str.length() == 0)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIIJI(Context context) {
        Activity LJIJJ;
        if (context == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null || !C217628gQ.LIZIZ.LIZJ(LJIJJ)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIIJIL(Aweme aweme) {
        C217628gQ c217628gQ = C217628gQ.LIZIZ;
        if (c217628gQ.LJ(aweme)) {
            return true;
        }
        if (c217628gQ.LIZLLL(aweme) && LJJII(aweme, true)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJIL(C63120Opw c63120Opw) {
        o.LJIIIZ(c63120Opw, "<this>");
        if (C3U8.LIZ()) {
            if (c63120Opw.isStranger() || c63120Opw.isFiltered()) {
                return true;
            }
            return false;
        }
        return c63120Opw.isStranger();
    }

    public static final boolean LJJIJL(CanvasVideoData canvasVideoData) {
        CanvasExtra extra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData == null || (extra = canvasVideoData.getExtra()) == null || (forwardCanvasExtra = extra.getForwardCanvasExtra()) == null || forwardCanvasExtra.getForwardType() != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJLIJ(CanvasVideoData canvasVideoData) {
        CanvasExtra extra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData == null || (extra = canvasVideoData.getExtra()) == null || (forwardCanvasExtra = extra.getForwardCanvasExtra()) == null || forwardCanvasExtra.getForwardType() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIL(CanvasVideoData canvasVideoData) {
        if (LJJJI(canvasVideoData) && LJJIJLIJ(canvasVideoData)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIZ(CanvasVideoData canvasVideoData) {
        CanvasExtra extra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData == null || (extra = canvasVideoData.getExtra()) == null || (forwardCanvasExtra = extra.getForwardCanvasExtra()) == null || !forwardCanvasExtra.isQuickForward()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJ(CanvasVideoData canvasVideoData) {
        String str;
        CanvasFilterParam canvasFilterParam;
        o.LJIIIZ(canvasVideoData, "<this>");
        List<String> sourceInfo = canvasVideoData.getSourceInfo();
        String str2 = null;
        if (sourceInfo != null) {
            str = (String) ORZ.LJLLLL(sourceInfo);
        } else {
            str = null;
        }
        List<CanvasFilterParam> transformList = canvasVideoData.getTransformList();
        if (transformList != null && (canvasFilterParam = (CanvasFilterParam) ORZ.LJLLLL(transformList)) != null) {
            str2 = canvasFilterParam.getAnimPath();
        }
        if (str != null && C78966Uyw.LJJIJIL(str) && str2 != null && C78966Uyw.LJJIJIL(str2)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJI(CanvasVideoData canvasVideoData) {
        if (canvasVideoData == null || canvasVideoData.getCanvasType() != 1) {
            return false;
        }
        return true;
    }

    public static final long LJJJJIZL(C63120Opw c63120Opw) {
        String str;
        String str2;
        Long LJJIZ;
        C76662ze c76662ze = C76662ze.LJLIL;
        if (c63120Opw != null) {
            str = c63120Opw.getConversationId();
        } else {
            str = null;
        }
        c76662ze.getClass();
        if (!AnonymousClass304.LIZIZ() || (str2 = (String) C76662ze.LJIIIZ().get(str)) == null || (LJJIZ = C38350F3i.LJJIZ(str2)) == null) {
            return 0L;
        }
        return LJJIZ.longValue();
    }

    public static final BaseUserComponent LJJJJLI(C79129V3t c79129V3t) {
        TextComponent textComponent;
        TextComponent textComponent2;
        ImageComponent imageComponent;
        ActionLinkComponent LIZ;
        Long l = c79129V3t.user_id;
        RUF ruf = c79129V3t.nickname;
        TextComponent textComponent3 = null;
        if (ruf != null) {
            textComponent = C17N.LJJL(ruf);
        } else {
            textComponent = null;
        }
        RUF ruf2 = c79129V3t.description;
        if (ruf2 != null) {
            textComponent2 = C17N.LJJL(ruf2);
        } else {
            textComponent2 = null;
        }
        C79135V3z c79135V3z = c79129V3t.avatar;
        if (c79135V3z != null) {
            imageComponent = C79081V1x.LJJIZ(c79135V3z);
        } else {
            imageComponent = null;
        }
        C63714OzW c63714OzW = c79129V3t.link_info;
        if (c63714OzW != null) {
            LIZ = C62814Ol0.LJJIIZI(c63714OzW);
        } else {
            ActionLinkComponent.Companion.getClass();
            LIZ = C63715OzX.LIZ();
        }
        RUF ruf3 = c79129V3t.username;
        if (ruf3 != null) {
            textComponent3 = C17N.LJJL(ruf3);
        }
        return new BaseUserComponent(l, textComponent, textComponent2, imageComponent, LIZ, textComponent3, c79129V3t.follower_count, c79129V3t.is_verify);
    }

    public static final VEVideoTransformFilterParam LJJJJZI(CanvasFilterParam canvasFilterParam) {
        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
        vEVideoTransformFilterParam.scaleFactor = canvasFilterParam.getScaleFactor();
        vEVideoTransformFilterParam.transX = canvasFilterParam.getTransX();
        vEVideoTransformFilterParam.transY = canvasFilterParam.getTransY();
        vEVideoTransformFilterParam.degree = canvasFilterParam.getDegree();
        vEVideoTransformFilterParam.borderColor = canvasFilterParam.getBorderColor();
        if (canvasFilterParam.getBorderWidthPx() != -2) {
            vEVideoTransformFilterParam.borderWidth = canvasFilterParam.getBorderWidthPx();
        }
        vEVideoTransformFilterParam.transformType = canvasFilterParam.getTransformType();
        vEVideoTransformFilterParam.animStartTime = canvasFilterParam.getAnimStartTime();
        vEVideoTransformFilterParam.animEndTime = canvasFilterParam.getAnimEndTime();
        vEVideoTransformFilterParam.animPath = canvasFilterParam.getAnimPath();
        vEVideoTransformFilterParam.animJsonParam = canvasFilterParam.getAnimJsonParam();
        return vEVideoTransformFilterParam;
    }

    public static final List LJJJLIIL(CanvasFilterParam canvasFilterParam) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(LJJJJZI(canvasFilterParam));
        if (canvasFilterParam.getVolume() == -2.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            VEAudioVolumeFilterParam vEAudioVolumeFilterParam = new VEAudioVolumeFilterParam();
            vEAudioVolumeFilterParam.volume = canvasFilterParam.getVolume();
            arrayList.add(vEAudioVolumeFilterParam);
        }
        try {
            if (canvasFilterParam.getLeftTopPoint().getFirst().floatValue() == -2.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (canvasFilterParam.getLeftTopPoint().getSecond().floatValue() == -2.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    if (canvasFilterParam.getRightBottomPoint().getFirst().floatValue() == -2.0f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        if (canvasFilterParam.getRightBottomPoint().getSecond().floatValue() == -2.0f) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            VEVideoCropFilterParam vEVideoCropFilterParam = new VEVideoCropFilterParam();
                            vEVideoCropFilterParam.cropNodesCoord = new float[]{canvasFilterParam.getLeftTopPoint().getFirst().floatValue(), canvasFilterParam.getLeftTopPoint().getSecond().floatValue(), canvasFilterParam.getRightBottomPoint().getFirst().floatValue(), canvasFilterParam.getLeftTopPoint().getSecond().floatValue(), canvasFilterParam.getLeftTopPoint().getFirst().floatValue(), canvasFilterParam.getRightBottomPoint().getSecond().floatValue(), canvasFilterParam.getRightBottomPoint().getFirst().floatValue(), canvasFilterParam.getRightBottomPoint().getSecond().floatValue()};
                            arrayList.add(vEVideoCropFilterParam);
                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            H78.LJ(e);
        }
        return arrayList;
    }

    public static boolean LJJJZ(Aweme aweme) {
        if (aweme != null && aweme.getAwemeRawAd() != null && (aweme.getAwemeRawAd().getPivOption() == 1 || aweme.getAwemeRawAd().getPivOption() == 2)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        OSZ it = (OSZ) obj;
        o.LJIIJ(it, "it");
        return it.getFirst();
    }

    public static final String LJIIL(C63120Opw c63120Opw, String uid) {
        String secUid;
        String secSender;
        o.LJIIIZ(uid, "uid");
        if (c63120Opw != null && c63120Opw.isSingleChat()) {
            if (C80763Ey.LIZ(false).equals(uid)) {
                return C36L.LIZ();
            }
            User LIZJ = C80763Ey.LIZJ();
            if (LIZJ == null || (secUid = LIZJ.getSecUid()) == null) {
                return null;
            }
            List<C63089OpR> singleChatMembers = c63120Opw.getSingleChatMembers();
            if (singleChatMembers != null) {
                for (C63089OpR c63089OpR : singleChatMembers) {
                    String secUid2 = c63089OpR.getSecUid();
                    if (secUid2 == null || secUid2.length() == 0 || o.LJ(c63089OpR.getSecUid(), secUid)) {
                        String secUid3 = c63089OpR.getSecUid();
                        C3H5 c3h5 = new C3H5(C34B.LIZ);
                        if (secUid3 == null || secUid3.length() == 0) {
                            if (uid.length() == 0) {
                                c3h5.invoke("SecUidHelper", new IllegalArgumentException("Null or empty uid and SecUid"));
                            }
                        }
                    } else {
                        return c63089OpR.getSecUid();
                    }
                }
            }
            C109544Rq lastShowMessage = c63120Opw.getLastShowMessage();
            if (lastShowMessage != null && (!lastShowMessage.isSelf()) && (secSender = lastShowMessage.getSecSender()) != null && secSender.length() != 0) {
                return lastShowMessage.getSecSender();
            }
        }
        return null;
    }

    public static final Fragment LJIILLIIL(Context context, C65776Prg c65776Prg) {
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        List<Fragment> LJJJJLI;
        Fragment fragment;
        o.LJIIIZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (!(LJIJJ instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) LJIJJ) == null || (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) == null || (LJJJJLI = supportFragmentManager.LJJJJLI()) == null) {
            return null;
        }
        Iterator<Fragment> it = LJJJJLI.iterator();
        while (true) {
            if (it.hasNext()) {
                fragment = it.next();
                if (c65776Prg.LIZ(fragment)) {
                    break;
                }
            } else {
                fragment = null;
                break;
            }
        }
        Fragment fragment2 = fragment;
        if (fragment2 == null) {
            return null;
        }
        return fragment2;
    }

    public static final Object LJIL(DataChannel dataChannel, Class cls) {
        o.LJIIIZ(dataChannel, "<this>");
        TQW tqw = (TQW) dataChannel.kv0(C74971Tbb.class);
        if (tqw != null) {
            return tqw.LIZ(cls);
        }
        return null;
    }

    public static final boolean LJJII(Aweme aweme, boolean z) {
        Video video;
        FakeLandscapeInfo fakeLandscapeInfo;
        if (aweme == null || C217628gQ.LIZIZ.LJ(aweme)) {
            return false;
        }
        List<Integer> list = C2304692s.LIZ;
        if (!list.isEmpty() && aweme.getCreateTime() >= DU7.LIZ && (video = aweme.getVideo()) != null && (fakeLandscapeInfo = video.getFakeLandscapeInfo()) != null && fakeLandscapeInfo.isValid() && !list.isEmpty()) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() == aweme.getVideo().getFakeLandscapeInfo().getFakeLandscapeVideoType()) {
                    if (!z) {
                        return true;
                    }
                    if (((aweme.getVideo().getFakeLandscapeInfo().getRight() - aweme.getVideo().getFakeLandscapeInfo().getLeft()) * aweme.getVideo().getWidth()) / ((aweme.getVideo().getFakeLandscapeInfo().getBottom() - aweme.getVideo().getFakeLandscapeInfo().getTop()) * aweme.getVideo().getHeight()) < C227788wo.LIZ) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final int LJJJIL(Context context, Aweme aweme) {
        Activity LJIJJ;
        if (context == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null || !C217628gQ.LIZIZ.LIZJ(LJIJJ)) {
            return 0;
        }
        if (LJJII(aweme, false)) {
            return 2;
        }
        if (!C217628gQ.LIZIZ.LJ(aweme)) {
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object[], java.io.Serializable] */
    public static final void LJJJJI(Intent intent, List list) {
        o.LJIIIZ(list, "list");
        intent.putExtra("extra.region.list", (Serializable) list.toArray(new TranslatedRegion[0]));
    }

    public static final C73411SrX LJJJJL(C73454SsE c73454SsE, InterfaceC64592gB interfaceC64592gB) {
        InterfaceC92693kP LJJJJZI;
        if ((interfaceC64592gB instanceof C32214Ckc) || !EnableRxBusWrapperSetting.INSTANCE.enable()) {
            LJJJJZI = c73454SsE.LJJJJZI(interfaceC64592gB);
        } else {
            LJJJJZI = c73454SsE.LJJJJZI(new C32214Ckc(interfaceC64592gB));
        }
        return (C73411SrX) LJJJJZI;
    }

    public static boolean LJJL(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC13370fl
    public Typeface LIZJ(C13640gC fontWeight, int i) {
        o.LJIIIZ(fontWeight, "fontWeight");
        return LJIIIIZZ(null, fontWeight, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface LJIIIIZZ(java.lang.String r3, X.C13640gC r4, int r5) {
        /*
            r2 = 1
            r1 = 0
            if (r5 != 0) goto L1c
            X.0gC r0 = X.C13640gC.LJLJJLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 == 0) goto L1c
            if (r3 == 0) goto L14
            int r0 = r3.length()
            if (r0 != 0) goto L30
        L14:
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            java.lang.String r0 = "DEFAULT"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        L1c:
            if (r3 != 0) goto L30
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
        L20:
            int r0 = r4.LJLIL
            if (r5 != r2) goto L2e
        L24:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r0, r2)
            java.lang.String r0 = "create(\n            fami…ontStyle.Italic\n        )"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        L2e:
            r2 = 0
            goto L24
        L30:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r3, r1)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79004UzY.LJIIIIZZ(java.lang.String, X.0gC, int):android.graphics.Typeface");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C27124Aki LJJJJZ(com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO r36, android.content.Context r37, com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag r38) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79004UzY.LJJJJZ(com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO, android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag):X.Aki");
    }

    public static final void LJJJLZIJ(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.LayoutParams) || layoutParams == null) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC13370fl
    public Typeface LIZLLL(C42881mG name, C13640gC fontWeight, int i) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(fontWeight, "fontWeight");
        return LJIIIIZZ(name.LJLILLLLZI, fontWeight, i);
    }

    public static void LJJJJ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("serviceName=");
        LIZ.append(str);
        LIZ.append(", category=");
        LIZ.append(jSONObject);
        LIZ.append(", metric=");
        LIZ.append(jSONObject2);
        LIZ.append(", extraLog=");
        LIZ.append(jSONObject3);
        X1D.LIZIZ(LIZ);
        if (LJLJJLL != null) {
            C09900aA.LJI(str, jSONObject, jSONObject2, jSONObject3);
        } else {
            C1JX.LJIIIIZZ("monitor impl is null when send event = ", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[Catch: Exception -> 0x00fb, TryCatch #0 {Exception -> 0x00fb, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0022, B:8:0x0036, B:10:0x0043, B:14:0x0053, B:15:0x004a, B:17:0x0050, B:22:0x0058, B:24:0x005c, B:26:0x0086, B:28:0x0097, B:29:0x009c, B:31:0x00b3, B:32:0x00c6, B:36:0x00bd, B:37:0x00ae, B:38:0x0060, B:39:0x006f, B:41:0x0073, B:42:0x0078, B:43:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[Catch: Exception -> 0x00fb, TryCatch #0 {Exception -> 0x00fb, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0022, B:8:0x0036, B:10:0x0043, B:14:0x0053, B:15:0x004a, B:17:0x0050, B:22:0x0058, B:24:0x005c, B:26:0x0086, B:28:0x0097, B:29:0x009c, B:31:0x00b3, B:32:0x00c6, B:36:0x00bd, B:37:0x00ae, B:38:0x0060, B:39:0x006f, B:41:0x0073, B:42:0x0078, B:43:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[Catch: Exception -> 0x00fb, TryCatch #0 {Exception -> 0x00fb, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0022, B:8:0x0036, B:10:0x0043, B:14:0x0053, B:15:0x004a, B:17:0x0050, B:22:0x0058, B:24:0x005c, B:26:0x0086, B:28:0x0097, B:29:0x009c, B:31:0x00b3, B:32:0x00c6, B:36:0x00bd, B:37:0x00ae, B:38:0x0060, B:39:0x006f, B:41:0x0073, B:42:0x0078, B:43:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[Catch: Exception -> 0x00fb, TryCatch #0 {Exception -> 0x00fb, blocks: (B:3:0x0001, B:5:0x001d, B:6:0x0022, B:8:0x0036, B:10:0x0043, B:14:0x0053, B:15:0x004a, B:17:0x0050, B:22:0x0058, B:24:0x005c, B:26:0x0086, B:28:0x0097, B:29:0x009c, B:31:0x00b3, B:32:0x00c6, B:36:0x00bd, B:37:0x00ae, B:38:0x0060, B:39:0x006f, B:41:0x0073, B:42:0x0078, B:43:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // X.InterfaceC37239EjT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LIZIZ(java.lang.ClassLoader r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79004UzY.LIZIZ(java.lang.ClassLoader, java.lang.String, boolean, boolean):boolean");
    }

    public static final void LJJJLL(C47061t0 c47061t0, Integer num, Integer num2, Integer num3, Integer num4) {
        ViewGroup.LayoutParams layoutParams = c47061t0.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.LayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams == null) {
            return;
        }
        if (num != null) {
            num.intValue();
            marginLayoutParams.leftMargin = num.intValue();
        }
        if (num2 != null) {
            num2.intValue();
            marginLayoutParams.topMargin = num2.intValue();
        }
        if (num3 != null) {
            num3.intValue();
            marginLayoutParams.rightMargin = num3.intValue();
        }
        if (num4 != null) {
            num4.intValue();
            marginLayoutParams.bottomMargin = num4.intValue();
        }
        c47061t0.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b  */
    @Override // X.V04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C79007Uzb LJ(java.lang.String r18, X.V0B r19, int r20, int r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79004UzY.LJ(java.lang.String, X.V0B, int, int, java.util.Map):X.Uzb");
    }
}
