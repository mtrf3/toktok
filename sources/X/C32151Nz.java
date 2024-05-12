package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.fcm.FcmPushAdapter;
import com.google.android.play.core.appupdate.b;
import com.google.android.play.core.appupdate.h;
import com.google.android.play.core.appupdate.u;
import com.google.android.play.core.appupdate.v;
import com.google.android.play.core.appupdate.w;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GlobalWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.TransAnchorData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.bduploader.logupload.VideoEventEngineUploader;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1Nz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32151Nz implements C0WM, InterfaceC156476Cd, InterfaceC73592SuS, VideoEventEngineUploader, InterfaceC47078Idm {
    public static final C32151Nz LJLIL = new C32151Nz();
    public static Method LJLILLLLZI;
    public static boolean LJLJI;

    public static void LJIIJ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-2283104779066971264")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    @Override // X.InterfaceC47078Idm
    public /* synthetic */ void LIZ() {
    }

    public static C63946P7u LJIILJJIL() {
        C63946P7u c63946P7u = new C63946P7u();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        c63946P7u.LIZ = EF7.LIZLLL();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        c63946P7u.LIZJ = AppLog.getServerDeviceId();
        c63946P7u.LIZIZ = C77339UWx.LIZJ();
        c63946P7u.LIZLLL = EnumC63863P4p.VEABSetType_MobileUGCv2;
        return c63946P7u;
    }

    @Override // X.InterfaceC47078Idm
    public String LIZLLL() {
        return AppLog.getCurrentSessionId();
    }

    @Override // X.InterfaceC47078Idm
    public String getServerDeviceId() {
        return AppLog.getServerDeviceId();
    }

    public static final void LIZJ(EditorProContext editorProContext) {
        o.LJIIIZ(editorProContext, "<this>");
        if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C124614un.LIZJ(editorProContext);
        }
        C79057V0z.LJIILL(editorProContext, C6YK.LIZ(new C139795eB(EnumC126814yL.ADD_AUDIO.getNameId(), null, null, null, null, 30)));
    }

    public static void LJI(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void LJIIIZ(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static final AnchorTransData LJIIL(TransAnchorData transAnchorData) {
        o.LJIIIZ(transAnchorData, "<this>");
        return new AnchorTransData(transAnchorData.businessType, transAnchorData.anchorContent, transAnchorData.title, transAnchorData.anchorTag, transAnchorData.source, transAnchorData.id, transAnchorData.anchorIcon, transAnchorData.canDelete, transAnchorData.url, transAnchorData.language, transAnchorData.addTime, transAnchorData.extra, transAnchorData.subtype, false, FileUtils.BUFFER_SIZE, null);
    }

    public static b LJIILIIL(Context context) {
        w wVar;
        synchronized (u.class) {
            if (u.LIZ == null) {
                new v(0);
                Context LLLLL = C16880lQ.LLLLL(context);
                if (LLLLL != null) {
                    context = LLLLL;
                }
                u.LIZ = new w(new h(context));
            }
            wVar = u.LIZ;
        }
        return wVar.LIZ.a();
    }

    public static final int LJIILLIIL(Number number) {
        o.LJIIIZ(number, "<this>");
        return O6R.LJJIIZ(LJIIZILJ(number));
    }

    public static final float LJIIZILJ(Number number) {
        o.LJIIIZ(number, "<this>");
        return TypedValue.applyDimension(1, number.floatValue(), Resources.getSystem().getDisplayMetrics());
    }

    public static final InterfaceC83701Wt7 LJIJ(InterfaceC83700Wt6 ckCameraView) {
        o.LJIIIZ(ckCameraView, "ckCameraView");
        InterfaceC83719WtP m0 = ckCameraView.getFunctionApiMgr().m0(InterfaceC83701Wt7.class);
        if (m0 != null) {
            return (InterfaceC83701Wt7) m0;
        }
        StringBuilder LIZ = X1D.LIZ();
        throw new Exception(AnonymousClass028.LIZLLL(LIZ, "Not exist Impl for ", InterfaceC83701Wt7.class, LIZ));
    }

    public static final NLETrack LJIJI(EditorProContext editorProContext) {
        o.LJIIIZ(editorProContext, "<this>");
        List LJIJJLI = LJIJJLI(editorProContext);
        if (((ArrayList) LJIJJLI).isEmpty()) {
            return null;
        }
        return (NLETrack) ListProtector.get(LJIJJLI, 0);
    }

    public static final InterfaceC83687Wst LJIJJ(InterfaceC83700Wt6 ckCameraView) {
        o.LJIIIZ(ckCameraView, "ckCameraView");
        InterfaceC83719WtP m0 = ckCameraView.getFunctionApiMgr().m0(InterfaceC83687Wst.class);
        if (m0 != null) {
            return (InterfaceC83687Wst) m0;
        }
        StringBuilder LIZ = X1D.LIZ();
        throw new Exception(AnonymousClass028.LIZLLL(LIZ, "Not exist Impl for ", InterfaceC83687Wst.class, LIZ));
    }

    public static final List LJIJJLI(EditorProContext editorProContext) {
        o.LJIIIZ(editorProContext, "<this>");
        return LJIL(C79057V0z.LJJI(editorProContext));
    }

    public static final List LJIL(NLEModel nleModel) {
        o.LJIIIZ(nleModel, "nleModel");
        VecNLETrackSPtr tracks = nleModel.getTracks();
        o.LJIIIIZZ(tracks, "nleModel.tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (C124574uj.LJJIL(nLETrack) || C124574uj.LJJJ(nLETrack)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final Cert LJJ(AbstractC79069V1l abstractC79069V1l) {
        o.LJIIIZ(abstractC79069V1l, "<this>");
        if (o.LJ(abstractC79069V1l, C78921UyD.LIZ)) {
            return C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.STOP_AUDIO_USING_SOUND_EFFECT, EnumC158826Le.USER_OPERATION);
        }
        if (o.LJ(abstractC79069V1l, C79071V1n.LIZ)) {
            return C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.STOP_AUDIO_CANCEL_SOUND_EFFECT, EnumC158826Le.USER_OPERATION);
        }
        if (o.LJ(abstractC79069V1l, C79072V1o.LIZ)) {
            return C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.STOP_AUDIO_SOUND_EFFECT_STOP, EnumC158826Le.PAGE_INVISIBLE);
        }
        if (o.LJ(abstractC79069V1l, C79074V1q.LIZ)) {
            return C83651WsJ.LIZIZ.LIZ(EnumC83653WsL.AUDIO_START_RECORD_USE_EFFECT, null);
        }
        if (o.LJ(abstractC79069V1l, IC1.LIZ)) {
            return C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.AUDIO_START_SWITCH_TO_VOICE_TAB, null);
        }
        if (o.LJ(abstractC79069V1l, IC0.LIZ)) {
            return C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_SWITCH_TO_NO_VOICE_TAB, EnumC158826Le.USER_OPERATION);
        }
        if (!(abstractC79069V1l instanceof C46178IAk)) {
            return null;
        }
        return ((C46178IAk) abstractC79069V1l).LIZ;
    }

    public static final EnumC101413yT LJJI(String str) {
        EnumC101413yT enumC101413yT = EnumC101413yT.O18;
        if (o.LJ(str, enumC101413yT.getNoticeCode())) {
            return enumC101413yT;
        }
        EnumC101413yT enumC101413yT2 = EnumC101413yT.U18;
        if (o.LJ(str, enumC101413yT2.getNoticeCode())) {
            return enumC101413yT2;
        }
        return EnumC101413yT.U16;
    }

    public static final int LJJIFFI(Context context) {
        o.LJIIIZ(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return 0;
    }

    public static final int LJJII(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return 0;
    }

    public static final float LJJIII(Number number) {
        o.LJIIIZ(number, "<this>");
        return TypedValue.applyDimension(2, number.floatValue(), Resources.getSystem().getDisplayMetrics());
    }

    public static final int LJJIIJ(TextStickerModel textStickerModel) {
        o.LJIIIZ(textStickerModel, "<this>");
        return textStickerModel.getBaseStickerModel().getId();
    }

    public static boolean LJJIIJZLJL(List list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIZ(String str) {
        if (C102343zy.LIZ(str) || !C43J.LIZLLL()) {
            return false;
        }
        int i = C43J.LIZJ().getInt(C43J.LIZIZ(), 0);
        if (((Boolean) C43J.LIZ.getValue()).booleanValue()) {
            if (i > 0) {
                return false;
            }
        } else if (((Boolean) C43J.LIZIZ.getValue()).booleanValue() && (i > 0 || C43J.LIZJ().getInt(C43J.LIZ(), 0) >= 3)) {
            return false;
        }
        if (LJJI(str) == EnumC101413yT.U16) {
            return false;
        }
        return true;
    }

    public static boolean LJJIIZI(List list) {
        if (list != null && list.size() > 0) {
            return true;
        }
        return false;
    }

    public static final String LJJIJ(List steps) {
        o.LJIIIZ(steps, "steps");
        StringBuilder sb = new StringBuilder();
        Iterator it = steps.iterator();
        while (it.hasNext()) {
            sb.append(((G1A) it.next()).type());
            sb.append(",");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "stringBuilder.toString()");
        return sb2;
    }

    public static final void LJJIJIIJIL(boolean z) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "chat");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJIIIZ("to_status", str);
        FMX.LJIIL("read_receipt_pop_up_close", c188727au.LIZ);
    }

    public static final void LJJIJIL(EditorProContext editorProContext) {
        o.LJIIIZ(editorProContext, "<this>");
        if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C124614un.LIZJ(editorProContext);
        }
        C79057V0z.LJIILL(editorProContext, C6YK.LIZ(new C139795eB(EnumC126814yL.REPLACE_AUDIO.getNameId(), null, null, null, null, 30)));
    }

    public static final boolean LJJIL(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIIZZ(itemView.getContext(), "itemView.context");
        return !KB1.LJII(KB1.LIZ(JTO.LIZIZ(C45804HyK.LJJIFFI(r1))));
    }

    public static final FlashSale LJJIZ(GlobalWaistBanner globalWaistBanner) {
        long j;
        o.LJIIIZ(globalWaistBanner, "<this>");
        String valueOf = String.valueOf(globalWaistBanner.countDown);
        String valueOf2 = String.valueOf(SystemClock.elapsedRealtime());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l = globalWaistBanner.countDown;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        return new FlashSale(null, 2, valueOf, valueOf2, String.valueOf(elapsedRealtime + j), globalWaistBanner.title, null, null, null, null, null, 2, null, null);
    }

    public static final FlashSale LJJJ(PromotionEntrance promotionEntrance) {
        o.LJIIIZ(promotionEntrance, "<this>");
        return new FlashSale(null, promotionEntrance.flashSaleStatus, promotionEntrance.countdown, promotionEntrance.startTime, promotionEntrance.endTime, promotionEntrance.title, null, null, null, null, null, 2, null, null);
    }

    @Override // X.C0WM
    public List LJIIJJI(EffectChannelResponse effectChannelResponse) {
        ArrayList arrayList;
        List<Effect> allCategoryEffects;
        if (effectChannelResponse != null && (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) != null) {
            arrayList = new ArrayList(C32I.LJJL(allCategoryEffects, 10));
            Iterator<Effect> it = allCategoryEffects.iterator();
            while (it.hasNext()) {
                arrayList.add(C0LT.LIZIZ(it.next()));
            }
        } else {
            arrayList = new ArrayList();
        }
        C0TX.LIZ.LIZJ("VoiceEffect");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("perform voice's convert. effects size: ");
        LIZ.append(arrayList.size());
        C0TX.LIZLLL(X1D.LIZIZ(LIZ));
        if (arrayList.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        return C47261Igj.LJJIJ(new C1QC("livesoundeffect", "livesoundeffect", arrayList, null, 56));
    }

    @Override // X.InterfaceC156476Cd
    public C6B3 create(Context context) {
        o.LJIIIZ(context, "context");
        C6B3 c6b3 = new C6B3(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        c6b3.setLayoutParams(layoutParams);
        return c6b3;
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        JSONObject jsonObject = (JSONObject) obj;
        o.LJIIIZ(jsonObject, "jsonObject");
        if (TextUtils.equals(jsonObject.optString("source"), "TTLiveSDK_Android") || TextUtils.equals(jsonObject.optString("source"), "TTLiveSDK_IOS")) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(String action, EditorProContext editorProContext) {
        o.LJIIIZ(editorProContext, "<this>");
        o.LJIIIZ(action, "action");
        C79057V0z.LJIILL(editorProContext, C6YK.LIZ(new C139795eB(action, null, null, null, null, 30)));
    }

    public static void LJFF(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void LJII(int i, int i2) {
        String LJIILL;
        if (i < 0 || i >= i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    LJIILL = LJIILL("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
                } else {
                    throw new IllegalArgumentException(KMP.LJ("negative size: ", i2));
                }
            } else {
                LJIILL = LJIILL("%s (%s) must not be negative", "index", Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(LJIILL);
        }
    }

    public static void LJIIIIZZ(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static String LJIILL(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final int LJJIJIIJI(Context context, float f) {
        return O6R.LJJIIZ(f / context.getResources().getDisplayMetrics().density);
    }

    public static void LJJIJLIJ(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            QRM.LJIIIIZZ().LIZJ(context, FcmPushAdapter.getFcmPush(), str);
        } else {
            QRM.LJFF().LJIILL(FcmPushAdapter.getFcmPush(), 102, CardStruct.IStatusCode.DEFAULT, "token is empty");
        }
    }

    @Override // com.ss.bduploader.logupload.VideoEventEngineUploader
    public void onEventV3(String str, JSONObject jSONObject) {
        AppLogNewUtils.onEventV3(str, jSONObject);
    }

    @Override // X.InterfaceC47078Idm
    public void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        AppLog.recordMiscLog(context, str, jSONObject);
    }

    public static final void LJJIJL(LiveRoomStruct liveRoomStruct, String enterFromMerge, String str, String str2) {
        String str3;
        C86393XvR LJJIJIL;
        InterfaceC54761LeP LJJLIIJ;
        BZI LIZIZ;
        o.LJIIIZ(enterFromMerge, "enterFromMerge");
        if (liveRoomStruct != null) {
            HashMap LIZ = C45243HpH.LIZ("enter_from_merge", enterFromMerge, "enter_method", "live_cell");
            User user = liveRoomStruct.owner;
            if (user == null || (str3 = user.getUid()) == null) {
                str3 = "";
            }
            LIZ.put("anchor_id", str3);
            C43881HKb.LIZJ(liveRoomStruct.id, LIZ, "room_id", "action_type", str2);
            LIZ.put("click_icon", str);
            ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
            if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && (LJJLIIJ = LJJIJIL.LJJLIIJ("livesdk_mask_layer_click")) != null && (LIZIZ = LJJLIIJ.LIZIZ(LIZ)) != null) {
                LIZIZ.LJJIIJZLJL();
            }
        }
    }

    public static final Request LJ(int i, int i2, RequestBody requestBody, InterfaceC63292Osi clientBridge, C114444eO options) {
        java.util.Map<String, String> linkedHashMap;
        o.LJIIIZ(clientBridge, "clientBridge");
        o.LJIIIZ(options, "options");
        java.util.Map<String, String> LJFF = clientBridge.LJFF();
        if (LJFF != null) {
            linkedHashMap = C113554cx.LJJLIL(LJFF);
        } else {
            linkedHashMap = new LinkedHashMap<>();
        }
        C63767P0x c63767P0x = new C63767P0x();
        if (C63517OwL.LIZIZ == null) {
            synchronized (C63517OwL.class) {
                if (C63517OwL.LIZIZ == null) {
                    C63517OwL.LIZIZ = new C63517OwL();
                }
            }
        }
        c63767P0x.LJ = Long.valueOf(C63517OwL.LIZIZ.LIZ());
        c63767P0x.LJFF = "local";
        c63767P0x.LJI = clientBridge.getToken();
        c63767P0x.LJII = P10.ANDROID;
        c63767P0x.LJIIJJI = clientBridge.getDeviceId();
        c63767P0x.LJIIIIZZ = Integer.valueOf(i);
        c63767P0x.LJIIIZ = CardStruct.IStatusCode.DEFAULT;
        c63767P0x.LJIIL = options.LJI;
        c63767P0x.LJIILIIL = "android";
        c63767P0x.LJIILJJIL = Build.MODEL;
        c63767P0x.LJIILL = Build.VERSION.RELEASE;
        c63767P0x.LJIILLIIL = String.valueOf(options.LJFF);
        c63767P0x.LIZLLL = Integer.valueOf(i2);
        c63767P0x.LJIIJ = requestBody;
        C63685Oz3.LIZIZ(linkedHashMap);
        c63767P0x.LJIIZILJ = linkedHashMap;
        c63767P0x.LJIJJ = EnumC63768P0y.fromValue(0);
        return c63767P0x.build();
    }
}
