package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BeautyControlGroupAppLogSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3UseTimeFixSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.google.android.play.core.appupdate.a;
import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import defpackage.i0;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.ref.ReferenceQueue;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.UOp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77123UOp implements InterfaceC40563Fvz, BTW, InterfaceC65419Plv, HMB, InterfaceC48038ItG, InterfaceC67661Qgz, QSE {
    public static DateFormat LJLILLLLZI;
    public static DateFormat LJLJI;
    public static DateFormat LJLJJI;
    public static ISpeedCalculator LJLJJL;
    public static final C77123UOp LJLIL = new C77123UOp();
    public static final C77123UOp LJLJJLL = new C77123UOp();
    public static final C77123UOp LJLJL = new C77123UOp();

    @Override // X.InterfaceC65419Plv
    public void LIZ(Throwable th, java.util.Map map) {
    }

    @Override // X.InterfaceC65419Plv
    public void LJ() {
    }

    @Override // X.InterfaceC65419Plv
    public void LJFF(Throwable th) {
    }

    @Override // X.InterfaceC65419Plv
    public void LJI() {
    }

    @Override // X.InterfaceC65419Plv
    public void LJII() {
    }

    @Override // X.InterfaceC65419Plv
    public void LJIIIIZZ() {
    }

    @Override // X.QSE
    public String getDefaultUninstallQuestionUrl() {
        return "";
    }

    public static DateFormat LJJII() {
        if (LJLJI == null) {
            LJLJI = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        }
        return LJLJI;
    }

    public static DateFormat LJJIII() {
        if (LJLJJI == null) {
            LJLJJI = new SimpleDateFormat("yyyy-MM-dd@HH-mm-ss", Locale.getDefault());
        }
        return LJLJJI;
    }

    public static final java.util.Map LJJIIJZLJL() {
        RtcUserInfo rtcUserInfo;
        String str;
        String linkMicId;
        String str2;
        String invoke;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("guest_id", String.valueOf(B83.LIZ().LIZIZ().getCurrentUserId()));
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        String str3 = null;
        if (R6 != null) {
            rtcUserInfo = R6.LLLLLJIL();
        } else {
            rtcUserInfo = null;
        }
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (rtcUserInfo == null || (str = Long.valueOf(rtcUserInfo.getChannelId()).toString()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("channel_id", str);
        if (LinkMicMultiGuestV3UseTimeFixSetting.INSTANCE.getValue()) {
            InterfaceC65784Pro<String> interfaceC65784Pro = BU9.LIZIZ;
            if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
                str4 = invoke;
            }
            linkedHashMap.put("link_id", str4);
        } else {
            HashSet<String> hashSet = C74951TbH.LIZ;
            if (rtcUserInfo != null) {
                str3 = rtcUserInfo.getLinkMicId();
            }
            if (!hashSet.contains(str3) || !LinkMicMultiGuestV3BeautyControlGroupAppLogSetting.INSTANCE.getValue()) {
                if (rtcUserInfo != null && (linkMicId = rtcUserInfo.getLinkMicId()) != null) {
                    str4 = linkMicId;
                }
                linkedHashMap.put("link_id", str4);
            }
        }
        InterfaceC65784Pro<String> interfaceC65784Pro2 = BU9.LJ;
        if (interfaceC65784Pro2 == null || (str2 = interfaceC65784Pro2.invoke()) == null) {
            str2 = "";
        }
        linkedHashMap.put("event_page", str2);
        return linkedHashMap;
    }

    public static final HashMap LJJIIZ() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", B83.LIZ().LIZIZ().LJ().getIdStr());
        C30553Byv c30553Byv = (C30553Byv) DataChannelGlobal.LJLJJI.mv0(C30386BwE.class);
        if (c30553Byv != null && c30553Byv.LJLIL == 1) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        hashMap.put("is_new_anchor", str);
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CompileConfigResolution LJIILLIIL() {
        if (C44762HhW.LIZ()) {
            return new CompileConfigResolution(1080, 1920, null, 0 == true ? 1 : 0, 12, 0 == true ? 1 : 0);
        }
        return new CompileConfigResolution(720, 1280, null, 0 == true ? 1 : 0, 12, 0 == true ? 1 : 0);
    }

    public static final void LJIIIZ(java.util.Map map) {
        String str;
        String str2;
        HashMap hashMap = (HashMap) map;
        hashMap.put("enhance_level", String.valueOf(C74740TUy.LIZLLL().LJ));
        if (C74740TUy.LIZLLL().LJFF != null) {
            str = C74740TUy.LIZLLL().LJFF.realId;
            str2 = C74740TUy.LIZLLL().LJFF.getResourceId();
        } else {
            str = "";
            str2 = "";
        }
        hashMap.put("sticker_id", str);
        hashMap.put("sticker_resource_id", str2);
    }

    public static final void LJIIJ(java.util.Map map) {
        map.put("enhance_level", String.valueOf(C74740TUy.LIZLLL().LJ));
    }

    public static final void LJIIJJI(java.util.Map map) {
        String str;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null && multiGuestDataHolder.LIZLLL) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        map.put("is_muted", str);
    }

    public static final void LJIIL(java.util.Map map) {
        String str;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null) {
            str = multiGuestDataHolder.LJIIIIZZ();
        } else {
            str = "";
        }
        map.put("guest_permission", str);
    }

    public static final void LJIILIIL(java.util.Map map) {
        String str;
        String l;
        LiveEffect liveEffect = C74740TUy.LIZLLL().LJFF;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (liveEffect == null || (str = liveEffect.getResourceId()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("sticker_resource_id", str);
        LiveEffect liveEffect2 = C74740TUy.LIZLLL().LJFF;
        if (liveEffect2 != null && (l = Long.valueOf(liveEffect2.effectId).toString()) != null) {
            str2 = l;
        }
        map.put("sticker_id", str2);
    }

    public static final void LJIILJJIL(java.util.Map map) {
        String str;
        if (C74789TWv.LIZIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_multi_guest_moderator", str);
    }

    public static final boolean LJJ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        if (!shortVideoContext.mIsFromDraft && shortVideoContext.creativeModel.searchCreateModel.isFromSearch()) {
            return true;
        }
        return false;
    }

    public static String LJJIIJ(long j) {
        if (j < 0) {
            return String.valueOf(0);
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return LJJIZ("K", "1000.0", j, false, 1000L, "1.0M");
        }
        if (j < 1000000000) {
            return LJJIZ("M", "1000.0", j, false, 1000000L, "1.0B");
        }
        return LJJIL(j, 1000000000L, "B", false);
    }

    public static final EnumC123864ta LJJIIZI(NLETrack nLETrack) {
        if (nLETrack == null) {
            return EnumC123864ta.NONE;
        }
        EnumC123864ta LJIIZILJ = nLETrack.LJIIZILJ();
        EnumC123864ta LJII = nLETrack.LJII();
        EnumC123864ta enumC123864ta = EnumC123864ta.NONE;
        if (LJIIZILJ != enumC123864ta && LJIIZILJ != EnumC123864ta.FILTER) {
            o.LJIIIIZZ(LJIIZILJ, "{\n        trackType\n    }");
            return LJIIZILJ;
        }
        if (LJII != enumC123864ta) {
            o.LJIIIIZZ(LJII, "{\n        extTrackType\n    }");
            return LJII;
        }
        return enumC123864ta;
    }

    public static final long LJJIJ(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        return new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), gregorianCalendar.get(11), gregorianCalendar.get(12), 0).getTimeInMillis();
    }

    public static final boolean LJJIJIIJIL(String str) {
        if (str == null) {
            return false;
        }
        if (!o.LJ(str, "STORY_ENTRANCE_INBOX_TOP_LIST") && !o.LJ(str, "STORY_ENTRANCE_FEED_TOP_LIST") && !o.LJ(str, "STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST") && !o.LJ(str, "STORY_ENTRANCE_GUIDE_CARD")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIL(NLETrack nLETrack) {
        if (nLETrack == null || !nLETrack.getEnable() || LJJIIZI(nLETrack) != EnumC123864ta.STICKER) {
            return false;
        }
        if (!o.LJ(nLETrack.getExtra("StickerTrackType"), EnumC121564ps.TEXT.name())) {
            VecNLETrackSlotSPtr LJIILL = nLETrack.LJIILL();
            if (LJIILL.isEmpty()) {
                return false;
            }
            Iterator<NLETrackSlot> it = LJIILL.iterator();
            while (it.hasNext()) {
                if (NLESegmentTextSticker.LJFF(it.next().LJI()) != null) {
                }
            }
            return false;
        }
        return true;
    }

    public static List LJJIJL(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
            return new ArrayList();
        }
    }

    public static final void LJJJIL(GUP gup) {
        C60903NvH.LJIIJJI().LJJIIJ();
        GXW.LIZJ();
        String message = gup.getMessage();
        HashMap hashMap = new HashMap();
        if (message != null) {
            hashMap.put("message", message);
        }
        C78983UzD.LJIILLIIL("[PublishParallelIllegalStateException]", hashMap);
    }

    public static JSONObject LJJJLL(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new JSONObject();
            }
            return new JSONObject(str);
        } catch (Exception e) {
            C77117UOj.LJIIZILJ(e);
            return new JSONObject();
        }
    }

    public static final void LJJJLZIJ(View view) {
        o.LJIIIZ(view, "view");
        float f = 2;
        view.setPivotX(view.getWidth() / f);
        view.setPivotY(view.getHeight() / f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(ofFloat2, ofFloat);
        animatorSet.start();
    }

    @Override // X.InterfaceC65419Plv
    public void LIZIZ(Throwable th) {
        if (th != null) {
            Keva repo = KevaImpl.getRepo("protector_throwable_repo", 1);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream(byteArrayOutputStream));
            repo.storeString("protector_throwable_key", byteArrayOutputStream.toString());
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        C221018lt.LIZJ("TopDataSource", "refresh janus error", it);
        return C76800UCe.LIZ;
    }

    @Override // X.BTW
    public boolean canHandle(android.net.Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        return TextUtils.equals("one_tap_go_live", str);
    }

    @Override // X.InterfaceC67661Qgz
    public void onComplete(AbstractC67638Qgc task) {
        o.LJIIIZ(task, "task");
        if (task.LJIILIIL()) {
            C36746EbW.LIZ(4, "Sms Retriever started");
        } else {
            C36746EbW.LIZ(4, "Failed to start SMS Retriever");
        }
    }

    @Override // X.InterfaceC40563Fvz
    public void onSuccess(Object obj) {
        int LIZ = ((a) obj).LIZ();
        if (!BetaAppExperiment.LIZIZ(LIZ)) {
            return;
        }
        BetaAppExperiment.LIZLLL(LIZ);
    }

    public static final void LJIILL(C26227ARb c26227ARb, InterfaceC88472Yns buttonGroup) {
        o.LJIIIZ(buttonGroup, "buttonGroup");
        ARH arh = new ARH(c26227ARb.LIZ);
        buttonGroup.invoke(arh);
        c26227ARb.LJIIL = arh;
    }

    public static final CompileConfigResolution LJIIZILJ(Bitmap bitmap, String str) {
        o.LJIIIZ(str, "<this>");
        CompileConfigResolution LIZ = new C44645Hfd(new C44648Hfg(bitmap, str)).LIZ();
        C60903NvH.LJIIJJI().LJJIIJ();
        return LIZ;
    }

    public static void LJIJJLI(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                LJJJLIIL(jSONObject, next, LJJJJJL(next, jSONObject2));
            }
        } catch (Exception e) {
            C77117UOj.LJIIZILJ(e);
        }
    }

    public static final C158366Jk LJIL(long j, long j2) {
        float f = ((float) (j - j2)) / 1000.0f;
        if (f > 0.0f) {
            int i = (int) (f / 86400.0f);
            float f2 = (int) (f - (((i * 24.0f) * 60.0f) * 60.0f));
            int i2 = (int) (f2 / 3600.0f);
            float f3 = (int) (f2 - ((i2 * 60.0f) * 60.0f));
            int i3 = (int) (f3 / 60.0f);
            return new C158366Jk(j, String.valueOf(i), String.valueOf(i2), String.valueOf(i3), String.valueOf((int) (f3 - (i3 * 60.0f))));
        }
        return new C158366Jk(j, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT);
    }

    public static final int LJJI(ZoomService zoomService, String str) {
        if (zoomService == null || str == null || str.length() == 0 || !zoomService.LJIIIIZZ(str)) {
            return 0;
        }
        return 1;
    }

    public static final java.util.Map LJJIFFI(InterfaceC60761Nsz interfaceC60761Nsz, HybridSchemaParam hybridSchemaParam) {
        String str;
        HashMap<String, Object> commonVarParams;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC60761Nsz != null) {
            C39836FkG.LJII.getClass();
            C39858Fkc c39858Fkc = C38262Ezy.LIZ().LIZLLL;
            if (c39858Fkc != null && (commonVarParams = c39858Fkc.getCommonVarParams(interfaceC60761Nsz)) != null) {
                linkedHashMap.putAll(commonVarParams);
            }
            C39858Fkc c39858Fkc2 = C38262Ezy.LIZ().LIZLLL;
            if (c39858Fkc2 != null) {
                if (hybridSchemaParam == null || (str = hybridSchemaParam.getPreloadSettingsKeys()) == null) {
                    str = "";
                }
                HashMap<String, Object> preloadSettingKeys = c39858Fkc2.getPreloadSettingKeys(interfaceC60761Nsz, str);
                if (preloadSettingKeys != null) {
                    linkedHashMap.putAll(preloadSettingKeys);
                }
            }
        }
        return linkedHashMap;
    }

    public static boolean LJJIJIIJI(Comparator comparator, Iterable iterable) {
        Object comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = C65547Pnz.LJLIL;
            }
        } else if (iterable instanceof C32Q) {
            comparator2 = ((C32Q) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }

    public static JSONObject LJJIJLIJ(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
        if (jSONObject == null) {
            return LJJIJLIJ(new JSONObject(), jSONObject2);
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject2.opt(next);
            if (opt instanceof JSONObject) {
                LJJJLIIL(jSONObject, next, LJJIJLIJ(jSONObject.optJSONObject(next), jSONObject2.optJSONObject(next)));
            } else {
                LJJJLIIL(jSONObject, next, opt);
            }
        }
        return jSONObject;
    }

    public static final void LJJJI(QDR qdr, AbstractC73910Sza abstractC73910Sza) {
        M6L m6l = M6L.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(qdr.getClass());
        LIZ.append('_');
        LIZ.append(qdr.hashCode());
        String k = X1D.LIZIZ(LIZ);
        m6l.getClass();
        o.LJIIJ(k, "k");
        C56237M5h c56237M5h = m6l.LIZ;
        c56237M5h.getClass();
        ((ConcurrentHashMap) c56237M5h.LIZ).put(k, new C77124UOq(k, abstractC73910Sza, (ReferenceQueue) c56237M5h.LIZIZ));
    }

    public static int LJJJJI(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt(str, 0);
    }

    public static JSONArray LJJJJIZL(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONArray();
        }
        return jSONObject.optJSONArray(str);
    }

    public static JSONObject LJJJJJ(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject.optJSONObject(str);
    }

    public static Object LJJJJJL(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return new Object();
        }
        return jSONObject.opt(str);
    }

    public static String LJJJJLI(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optString(str, "");
    }

    public static A2G LJJJZ(AbstractC57709Mkr abstractC57709Mkr, InterfaceC88472Yns mappingData) {
        Exception exc;
        o.LJIIIZ(abstractC57709Mkr, "<this>");
        o.LJIIIZ(mappingData, "mappingData");
        if (abstractC57709Mkr instanceof C57708Mkq) {
            A2F a2f = A2G.LIZ;
            Params params = ((C57708Mkq) abstractC57709Mkr).LIZIZ;
            List<T> list = ((C57708Mkq) abstractC57709Mkr).LIZJ;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object invoke = mappingData.invoke(it.next());
                if (invoke != null) {
                    arrayList.add(invoke);
                }
            }
            return A2F.LJ(a2f, null, params, arrayList, 1);
        }
        if (abstractC57709Mkr instanceof C57710Mks) {
            A2F a2f2 = A2G.LIZ;
            List<T> list2 = ((C57710Mks) abstractC57709Mkr).LIZIZ;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Object invoke2 = mappingData.invoke(it2.next());
                if (invoke2 != null) {
                    arrayList2.add(invoke2);
                }
            }
            a2f2.getClass();
            return A2F.LIZ(arrayList2);
        }
        if (abstractC57709Mkr instanceof C57714Mkw) {
            A2F a2f3 = A2G.LIZ;
            Throwable th = ((C57714Mkw) abstractC57709Mkr).LIZIZ;
            if (!(th instanceof Exception) || (exc = (Exception) th) == null) {
                exc = new Exception();
            }
            a2f3.getClass();
            return A2F.LIZJ(exc);
        }
        throw new C162476Zf();
    }

    @Override // X.HMB
    public HM5 LIZLLL(Context context, String closetName) {
        o.LJIIJ(context, "context");
        o.LJIIJ(closetName, "closetName");
        return new C36820Eci(context, closetName);
    }

    @Override // X.BTW
    public boolean handle(Context context, android.net.Uri uri) {
        return ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).oneTapGoLive(context, uri);
    }

    public static final void LJIJI(C60737Nsb hybridContext, HybridSchemaParam hybridSchemaParam, long j) {
        AbstractC40201Fq9 abstractC40201Fq9;
        IResourceService copyAndModifyConfig;
        o.LJIIJ(hybridContext, "hybridContext");
        if (!o.LJ(hybridSchemaParam.getBid(), "hybridkit_default_bid")) {
            String bid = hybridSchemaParam.getBid();
            o.LJIIJ(bid, "<set-?>");
            hybridContext.bid = bid;
        }
        String str = hybridContext.containerId;
        if (str == null) {
            str = "";
        }
        FD5.LIZJ(j, str, "prepare_component_start");
        hybridContext.LIZIZ(C60728NsS.class);
        hybridContext.LJII(C37953Euz.class, new C37953Euz(hybridContext.containerId));
        hybridContext.LJII(InterfaceC60176NjY.class, new C58315Mud());
        if (hybridContext.LIZIZ(IResourceService.class) != null) {
            return;
        }
        C61483OBb.LIZJ.getClass();
        IResourceService iResourceService = (IResourceService) C61484OBc.LIZIZ().LIZIZ(IResourceService.class, hybridContext.bid);
        if (iResourceService == null || (abstractC40201Fq9 = (AbstractC40201Fq9) hybridContext.LIZIZ(AbstractC40201Fq9.class)) == null || (copyAndModifyConfig = iResourceService.copyAndModifyConfig(abstractC40201Fq9)) == null) {
            return;
        }
        hybridContext.LJII(IResourceService.class, copyAndModifyConfig);
        C39836FkG.LJII.getClass();
        hybridContext.LJII(C39902FlK.class, new C39902FlK(C38262Ezy.LIZ().LIZIZ(), new C39917FlZ(copyAndModifyConfig.getResourceConfig())));
    }

    public static void LJJJ(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception e) {
                C77117UOj.LJIIZILJ(e);
            }
        }
    }

    public static boolean LJJJJ(JSONObject jSONObject, JSONObject jSONObject2, String... strArr) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        for (String str : strArr) {
            if (!LJJJJLI(str, jSONObject).equals(LJJJJLI(str, jSONObject2))) {
                return false;
            }
        }
        return true;
    }

    public static String LJJJJL(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            return str2;
        }
        try {
            return jSONObject.optString(str, str2);
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
            return str2;
        }
    }

    public static void LJJJJLL(int i, String str, JSONObject jSONObject) {
        try {
            jSONObject.put(str, i);
        } catch (Exception e) {
            C77117UOj.LJIIZILJ(e);
        }
    }

    public static void LJJJJZ(String str, long j, JSONObject jSONObject) {
        try {
            jSONObject.put(str, j);
        } catch (Exception e) {
            C77117UOj.LJIIZILJ(e);
        }
    }

    public static void LJJJJZI(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception e) {
            C77117UOj.LJIIZILJ(e);
        }
    }

    public static void LJJJLIIL(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (Exception e) {
            C77117UOj.LJIIZILJ(e);
        }
    }

    @Override // X.BTW
    public boolean LIZJ(Context context, android.net.Uri uri, java.util.Map map) {
        return handle(context, uri);
    }

    public static String LJJIL(long j, long j2, String str, boolean z) {
        String bigDecimal;
        BigDecimal divide = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP);
        if (z) {
            bigDecimal = divide.stripTrailingZeros().toPlainString();
        } else {
            bigDecimal = divide.toString();
        }
        return i0.LJFF(bigDecimal, str);
    }

    public static void LJIJ(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (i4 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32151Nz.LJI(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C32151Nz.LJI(z3);
        if (i + i4 <= i5) {
            z4 = true;
        } else {
            z4 = false;
        }
        C32151Nz.LJI(z4);
        if (i3 + i4 > i2) {
            z5 = false;
        }
        C32151Nz.LJI(z5);
    }

    public static final void LJIJJ(InterfaceC60761Nsz interfaceC60761Nsz, InterfaceC60710NsA interfaceC60710NsA, C60737Nsb hybridContext, int i, long j, HybridSchemaParam hybridSchemaParam) {
        o.LJIIJ(hybridContext, "hybridContext");
        String str = hybridContext.containerId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        FD5.LIZJ(System.currentTimeMillis(), str, "prepare_globalprops_start");
        if (interfaceC60710NsA != null) {
            interfaceC60710NsA.LIZ(LJJIFFI(interfaceC60761Nsz, hybridSchemaParam));
        }
        if (hybridContext.runtimeInfo.size() > 0 && interfaceC60710NsA != null) {
            interfaceC60710NsA.LIZ(hybridContext.runtimeInfo);
        }
        String str3 = hybridContext.containerId;
        if (str3 == null) {
            str3 = "";
        }
        FD5.LIZJ(System.currentTimeMillis(), str3, "prepare_globalprops_end");
        long currentTimeMillis = System.currentTimeMillis();
        FD5.LIZIZ(i, hybridContext.containerId, WM7.SCENE_SERVICE);
        String str4 = hybridContext.containerId;
        if (str4 != null) {
            str2 = str4;
        }
        FD5.LIZJ(currentTimeMillis, str2, "prepare_component_end");
        hybridContext.LIZIZ(C60728NsS.class);
        FD5.LJII("hybrid_log_report", C113554cx.LJJL(new OSZ(WM7.SCENE_SERVICE, "prepare_component_time"), new OSZ("system_duration", Long.valueOf(currentTimeMillis - j))));
    }

    public static String LJJIZ(String str, String str2, long j, boolean z, long j2, String str3) {
        String LJJIL = LJJIL(j, j2, "", z);
        if (LJJIL.equals(str2)) {
            return str3;
        }
        return i0.LJFF(LJJIL, str);
    }
}
