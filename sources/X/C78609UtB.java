package X;

import Y.ARunnableS10S0110000_4;
import Y.ARunnableS14S0110000_8;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.webkit.CookieManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.ShowSubscribeSetting;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.k;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import defpackage.i0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.o;
import ujb.s;

/* renamed from: X.UtB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78609UtB implements IGM, C0K7 {
    public static final C78609UtB LJLIL = new C78609UtB();
    public static final int[] LJLILLLLZI = {LiveCenterDelayLoadSetting.DEFAULT, 11025, 16000, 22050, 32000, 37800, 44056, 44100, 47250, 48000, LiveExchangeConfirmThreshold.DEFAULT, 50400, 88200, 96000, 176400, 192000, 352800, 2822400, 5644800};
    public static C38759FJb LJLJI;
    public static volatile String LJLJJI;
    public static int LJLJJL;
    public static volatile String LJLJJLL;
    public static volatile long LJLJL;

    public static float LJJIIJZLJL(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int LJJIIZ(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static String LJJIJ(CookieManager cookieManager, String str) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "5126440014514218334"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : cookieManager.getCookie(str);
    }

    @Override // X.IGM
    public boolean LIZ() {
        return true;
    }

    @Override // X.IGM
    public /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.IGM
    public /* synthetic */ boolean LIZJ() {
        return false;
    }

    @Override // X.IGM
    public /* synthetic */ boolean LIZLLL() {
        return false;
    }

    @Override // X.IGM
    public /* synthetic */ HashMap LJFF(String str, boolean z) {
        return null;
    }

    @Override // X.IGM
    public /* synthetic */ HashMap LJII(String str, JSONObject jSONObject) {
        return null;
    }

    @Override // X.IGM
    public /* synthetic */ HashMap LJIIIIZZ(String str) {
        return null;
    }

    @Override // X.IGM
    public /* synthetic */ boolean LJIIIZ() {
        return false;
    }

    @Override // X.IGM
    public /* synthetic */ HashMap LJIIJ(String str) {
        return null;
    }

    @Override // X.IGM
    public /* synthetic */ boolean LJIIJJI() {
        return false;
    }

    @Override // X.IGM
    public /* synthetic */ HashMap LJIIL(String str) {
        return null;
    }

    @Override // X.IGM
    public /* synthetic */ boolean LJIILIIL() {
        return false;
    }

    @Override // X.IGM
    public /* synthetic */ boolean LJIILJJIL() {
        return false;
    }

    @Override // X.IGM
    public /* synthetic */ boolean LJIILL() {
        return false;
    }

    @Override // X.IGM
    public /* synthetic */ boolean LJIIZILJ() {
        return false;
    }

    @Override // X.IGM
    public /* synthetic */ HashMap LJIJ(String str, boolean z) {
        return null;
    }

    public static NetworkInfo LJJIJLIJ() {
        try {
            Class<?> cls = Class.forName("android.net.NetworkInfo");
            Class<?> cls2 = Integer.TYPE;
            return (NetworkInfo) cls.getConstructor(cls2, cls2, String.class, String.class).newInstance(1, 0, "CONNECTED", "CONNECTED");
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            return null;
        }
    }

    @Override // X.IGM
    public ILN LJ() {
        return ILN.DEFAULT;
    }

    @Override // X.IGM
    public ILO LJI() {
        return ILO.AUDIO;
    }

    public static final String LJIJJ(String str) {
        if (str != null && !o.LJJJLIIL(str, "http://", false) && !o.LJJJLIIL(str, "https://", false)) {
            return i0.LJFF("https://", str);
        }
        return str;
    }

    public static final String LJJ(String str) {
        if (str == null || str.length() == 0 || s.LJJJLZIJ(str, "timestamp=", false)) {
            return str;
        }
        EZQ ezq = new EZQ(str);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        List<String> list = (List) ((LinkedHashMap) ezq.LIZ).get("timestamp");
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(currentTimeMillis));
        ezq.LIZ.put("timestamp", list);
        return ezq.LIZLLL();
    }

    public static final String LJJI(String str) {
        if (str == null || str.length() == 0 || !HG3.LJIILL().isLogin()) {
            return str;
        }
        EZQ ezq = new EZQ(str);
        ezq.LIZJ("user_id", HG3.LJIILL().getCurUserId());
        ezq.LIZJ("sec_user_id", HG3.LJIILL().getCurSecUserId());
        return ezq.LIZLLL();
    }

    public static final void LJJIFFI(C119644mm c119644mm) {
        UrlModel LJJI = C78688UuS.LJJI(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser());
        if (LJJI != null) {
            C78765Uvh.LJFF(c119644mm, LJJI);
        }
    }

    public static void LJJIIZI(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            OC6.LIZJ("gecko-debug-tag", "close:", e);
        }
    }

    public static final JSONObject LJJIJIIJI(JSONObject jSONObject) {
        kotlin.jvm.internal.o.LJIIIZ(jSONObject, "<this>");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.LJIIIIZZ(keys, "keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.putOpt(next, jSONObject.get(next));
        }
        return jSONObject2;
    }

    public static final int LJJIL(C63120Opw c63120Opw) {
        kotlin.jvm.internal.o.LJIIIZ(c63120Opw, "<this>");
        C82223Ko c82223Ko = C99033ud.Companion;
        String conversationId = c63120Opw.getConversationId();
        c82223Ko.getClass();
        if (C82223Ko.LIZ(conversationId) && (((Number) C52722Kmc.LIZ.getValue()).intValue() == 1 || ((Number) C52720Kma.LIZ.getValue()).intValue() == 1)) {
            return 60;
        }
        if (!c63120Opw.isStickTop()) {
            return 0;
        }
        return 50;
    }

    public static final NLESegmentVideo LJJIZ(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot != null) {
            return NLESegmentVideo.LJJ(nLETrackSlot.LJI());
        }
        return null;
    }

    public static String LJJJI(View view) {
        if (view.getContext() != null && view.getContext().getResources() != null) {
            StringBuilder sb = new StringBuilder(128);
            int i = LJLJJL;
            LJLJJL = i + 1;
            sb.append(i);
            if (view instanceof ProgressBar) {
                sb.append("#ProgressBar#");
            }
            return sb.toString();
        }
        return "";
    }

    public static final boolean LJJJJ(Context context) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        if (Build.VERSION.SDK_INT >= 33) {
            if (C04330Ez.LIZ(context, "android.permission.READ_MEDIA_IMAGES") == 0 && C04330Ez.LIZ(context, "android.permission.READ_MEDIA_VIDEO") == 0) {
                return true;
            }
        } else if (C04330Ez.LIZ(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJIZL(PaymentMethod paymentMethod) {
        if (paymentMethod != null) {
            if (ORZ.LJLJJI(paymentMethod.id, C71691SBr.LIZ)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJJJJ(ResourceItem resourceItem) {
        kotlin.jvm.internal.o.LJIIIZ(resourceItem, "<this>");
        if (kotlin.jvm.internal.o.LJ(resourceItem.getIcon(), "") && kotlin.jvm.internal.o.LJ(resourceItem.getPath(), "")) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJJL(ProductPackStruct productPackStruct) {
        kotlin.jvm.internal.o.LJIIIZ(productPackStruct, "<this>");
        Integer num = productPackStruct.template;
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final void LJJJJZ(ShortVideoContext shortVideoContext) {
        String str;
        kotlin.jvm.internal.o.LJIIIZ(shortVideoContext, "shortVideoContext");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        if (C60903NvH.LJIIJJI().LJJIL().getSpeedPanelOpen(false)) {
            str = "show";
        } else {
            str = "hide";
        }
        c145995oB.LJI("to_status", str);
        int i = shortVideoContext.draftId;
        if (i != 0) {
            c145995oB.LIZ(i, "draft_id");
        }
        String str2 = shortVideoContext.newDraftId;
        kotlin.jvm.internal.o.LJIIIIZZ(str2, "shortVideoContext.newDraftId");
        if (str2.length() > 0) {
            c145995oB.LIZLLL("new_draft_id", shortVideoContext.newDraftId);
        }
        c145995oB.LIZLLL("shoot_page", "video_shoot_page");
        c145995oB.LIZLLL("shoot_tab_name", shortVideoContext.LJIJI());
        FMX.LJIIL("edit_speed", c145995oB.LIZ);
    }

    public static boolean LJJJZ(boolean z) {
        if (z || ShowSubscribeSetting.INSTANCE.getShow()) {
            return true;
        }
        return false;
    }

    public static final Activity LJJLIIIJ(Context context) {
        kotlin.jvm.internal.o.LJIIIZ(context, "<this>");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                Context baseContext = contextWrapper.getBaseContext();
                kotlin.jvm.internal.o.LJII(baseContext, "null cannot be cast to non-null type android.app.Activity");
                return (Activity) baseContext;
            }
        }
        return C84763XOl.LJIIIIZZ();
    }

    public static final Object LJJLIIIJILLIZJL(InterfaceC67352kd interfaceC67352kd) {
        Object obj;
        XKT xkt;
        MBA context = interfaceC67352kd.getContext();
        C79146V4k.LJJIIJ(context);
        InterfaceC67352kd LJJII = C78555UsJ.LJJII(interfaceC67352kd);
        if (!(LJJII instanceof XKT) || (xkt = (XKT) LJJII) == null) {
            obj = C76800UCe.LIZ;
        } else {
            if (xkt.LJLJJI.isDispatchNeeded(context)) {
                xkt.LJLJJLL = C76800UCe.LIZ;
                xkt.LJLJI = 1;
                xkt.LJLJJI.dispatchYield(context, xkt);
            } else {
                C78610UtC c78610UtC = new C78610UtC();
                MBA plus = context.plus(c78610UtC);
                C76800UCe c76800UCe = C76800UCe.LIZ;
                xkt.LJLJJLL = c76800UCe;
                xkt.LJLJI = 1;
                xkt.LJLJJI.dispatchYield(plus, xkt);
                if (c78610UtC.LJLIL) {
                    AbstractC78624UtQ LIZ = XJG.LIZ();
                    if (!LIZ.isUnconfinedQueueEmpty()) {
                        if (LIZ.isUnconfinedLoopActive()) {
                            xkt.LJLJJLL = c76800UCe;
                            xkt.LJLJI = 1;
                            LIZ.dispatchUnconfined(xkt);
                            obj = EnumC58928NAu.COROUTINE_SUSPENDED;
                        } else {
                            LIZ.incrementUseCount(true);
                            try {
                                xkt.run();
                                do {
                                } while (LIZ.processUnconfinedEvent());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = C76800UCe.LIZ;
                }
            }
            obj = EnumC58928NAu.COROUTINE_SUSPENDED;
        }
        if (obj == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return obj;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static final String LJIJI(Aweme aweme, String str) {
        List<PhotoModeImageUrlModel> imageList;
        kotlin.jvm.internal.o.LJIIIZ(aweme, "aweme");
        if (str.length() == 0 || !C4LD.LIZIZ.LJIILLIIL(aweme)) {
            return str;
        }
        EZQ ezq = new EZQ(str);
        ezq.LIZ(aweme.getAwemeType(), "aweme_type");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            ezq.LIZ(imageList.size(), "pic_cnt");
        }
        return ezq.LIZLLL();
    }

    public static final String LJIJJLI(String str, String panelSource) {
        kotlin.jvm.internal.o.LJIIIZ(panelSource, "panelSource");
        if (str.length() == 0 || C53293Kvp.LIZIZ() || !TextUtils.equals("screenshot_popup", panelSource)) {
            return str;
        }
        EZQ ezq = new EZQ(str);
        ezq.LIZ(1, "is_screenshot");
        return ezq.LIZLLL();
    }

    public static final String LJIL(Aweme aweme, String str) {
        kotlin.jvm.internal.o.LJIIIZ(aweme, "aweme");
        if (str.length() == 0 || !C54838Lfe.LJIIZILJ(aweme)) {
            return str;
        }
        EZQ ezq = new EZQ(str);
        ezq.LIZJ("story_uid", aweme.getAuthorUid());
        return ezq.LIZLLL();
    }

    public static final InterfaceC70542pm LJJII(Context context, InterfaceC88472Yns interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(context, "<this>");
        US4 us4 = new US4(context);
        interfaceC88472Yns.invoke(us4);
        return us4.LIZ();
    }

    public static final InterfaceC70542pm LJJIII(Fragment fragment, InterfaceC88472Yns interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(fragment, "<this>");
        Context requireContext = fragment.requireContext();
        kotlin.jvm.internal.o.LJIIIIZZ(requireContext, "this.requireContext()");
        US4 us4 = new US4(requireContext);
        interfaceC88472Yns.invoke(us4);
        return us4.LIZ();
    }

    public static final InterfaceC70542pm LJJIIJ(EnumC56196M3s enumC56196M3s, InterfaceC88472Yns block) {
        kotlin.jvm.internal.o.LJIIIZ(enumC56196M3s, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(block, "block");
        US4 us4 = new US4(EF7.LIZIZ());
        us4.LIZJ = enumC56196M3s;
        block.invoke(us4);
        return us4.LIZ();
    }

    public static final void LJJIJIL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        kotlin.jvm.internal.o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (CCJ.LIZ(view.getContext())) {
                marginLayoutParams.leftMargin = i;
            } else {
                marginLayoutParams.rightMargin = i;
            }
            marginLayoutParams.setMarginEnd(i);
        }
    }

    public static void LJJIJL(View view, boolean z) {
        boolean z2;
        kotlin.jvm.internal.o.LJIIIZ(view, "<this>");
        if (view.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((z == z2 && view.getAnimation() == null && view.getTag(-1282133481) == null) || kotlin.jvm.internal.o.LJ(view.getTag(-1282133481), Boolean.valueOf(z))) {
            return;
        }
        view.setTag(-1282133481, Boolean.valueOf(z));
        float f = 1.0f;
        view.setTag(-431929977, Float.valueOf(1.0f));
        if (z && view.getAlpha() == 1.0f) {
            view.setAlpha(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        if (!z) {
            f = 0.0f;
        }
        animate.alpha(f).withStartAction(new ARunnableS10S0110000_4(view, z, 8)).withEndAction(new ARunnableS14S0110000_8(view, z, 12)).setInterpolator(new C30901Je()).setDuration(300L).setStartDelay(0L).start();
    }

    public static final int LJJJ(int i, Context context) {
        Integer LJI;
        if (context != null && (LJI = C79045V0n.LJI(i, context)) != null) {
            return LJI.intValue();
        }
        return 0;
    }

    public static final void LJJJJLL(ShortVideoContext shortVideoContext, EnumC82528WaC speed) {
        kotlin.jvm.internal.o.LJIIIZ(shortVideoContext, "shortVideoContext");
        kotlin.jvm.internal.o.LJIIIZ(speed, "speed");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LIZ(shortVideoContext.draftId, "draft_id");
        c145995oB.LJI("speed_mode", speed.description());
        c145995oB.LJI("shoot_page", "video_shoot_page");
        c145995oB.LJI("shoot_tab_name", shortVideoContext.LJIJI());
        FMX.LJIIL("choose_speed_mode", c145995oB.LIZ);
    }

    public static void LJJJJZI(String str, HashMap hashMap) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("_all");
        if ("ttlive_query_pipo_purchase_all".equals(X1D.LIZIZ(LIZ)) && !LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_query_pipo_purchase_all", 0.2d)) {
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        hashMap.put("big_optimize", 1);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("_all");
        C0K2.LJII(0, X1D.LIZIZ(LIZ2), hashMap);
    }

    public static final void LJJJLZIJ(InteractStickerStruct interactStickerStruct, List list) {
        if (C78886Uxe.LJJIJ(list)) {
            interactStickerStruct.setTrackList("");
        } else {
            try {
                interactStickerStruct.setTrackList(GsonProtectorUtils.toJson(C6PB.LIZIZ(), list));
            } catch (k unused) {
            }
        }
    }

    public static final void LJJL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        kotlin.jvm.internal.o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (CCJ.LIZ(view.getContext())) {
                marginLayoutParams.rightMargin = i;
            } else {
                marginLayoutParams.leftMargin = i;
            }
            marginLayoutParams.setMarginStart(i);
        }
    }

    public static final void LJJLI(Object obj, InterfaceC88472Yns interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(obj, "<this>");
        synchronized (obj) {
            interfaceC88472Yns.invoke(obj);
        }
    }

    public static final void LJJLIIIIJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        kotlin.jvm.internal.o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = i;
        }
    }

    public static JSONObject LJJJIL(ViewGroup viewGroup, List list, HashSet hashSet) {
        boolean z;
        if (viewGroup == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", viewGroup.getId());
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getId() == -1) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    ArrayList arrayList = (ArrayList) list;
                    if (arrayList.contains(Integer.valueOf(childAt.getId()))) {
                        hashSet.add(Integer.valueOf(childAt.getId()));
                    } else {
                        arrayList.add(Integer.valueOf(childAt.getId()));
                    }
                }
                if (childAt instanceof ViewGroup) {
                    jSONObject.put(LJJJI(childAt), LJJJIL((ViewGroup) childAt, list, hashSet));
                } else {
                    jSONObject.put(LJJJI(childAt), String.valueOf(childAt.getId()));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void LJJJJI(int i, String str, String str2) {
        if (!TextUtils.isEmpty(str) && (str.contains("check/in") || str.contains("story") || str.contains("rec/new") || str.contains("follow/feed"))) {
            return;
        }
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (i != 8 || !createIUserServicebyMonsterPlugin.isLogin()) {
            return;
        }
        try {
            HG3.LJIIIIZZ().logout("LoginoutMonitorHelperLancet", "sdk_expired_logout");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorDesc", "api return errorcode==8");
            jSONObject.put("errorUrl", str);
            jSONObject.put("errorCookies", LJJIJ(CookieManager.getInstance(), NetworkUtils.getShareCookieHost()));
            jSONObject.put("errorResponse", str2);
            FUA.LIZIZ("aweme_user_logout", "", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void LJJJJL(ImageView imageView, ImageModel imageModel, int i, int i2) {
        kotlin.jvm.internal.o.LJIIIZ(imageView, "<this>");
        C30760C5k.LJ(imageView, imageModel, i, i2, 0, null, 112);
    }

    public static void LJJJLIIL(int i, int i2, String str, String str2) {
        LJJJLL(i, i2, str, str2, new HashMap());
    }

    public static final InteractStickerStruct LJJIJIIJIL(float f, float f2, PointF centerPointF, PointF contentPointF, float f3) {
        kotlin.jvm.internal.o.LJIIIZ(centerPointF, "centerPointF");
        kotlin.jvm.internal.o.LJIIIZ(contentPointF, "contentPointF");
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(19);
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        C67O.LLLLII.getClass();
        normalTrackTimeStamp.setRotation(C1553967z.LIZ(f));
        normalTrackTimeStamp.setScale(Float.valueOf(f2));
        normalTrackTimeStamp.setX(centerPointF.x);
        normalTrackTimeStamp.setY(centerPointF.y);
        normalTrackTimeStamp.setStartTime(0.0f);
        normalTrackTimeStamp.setEndTime(f3);
        normalTrackTimeStamp.setWidth(contentPointF.x);
        normalTrackTimeStamp.setHeight(contentPointF.y);
        LinkedList linkedList = new LinkedList();
        linkedList.add(normalTrackTimeStamp);
        LJJJLZIJ(interactStickerStruct, linkedList);
        return interactStickerStruct;
    }

    public static final void LJJJJLI(ImageView imageView, ImageModel imageModel, int i, int i2, int i3) {
        kotlin.jvm.internal.o.LJIIIZ(imageView, "<this>");
        C30760C5k.LJ(imageView, imageModel, i2, i3, i, null, 80);
    }

    public static void LJJJLL(int i, int i2, String str, String str2, HashMap hashMap) {
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        hashMap.put("error_code", Integer.valueOf(i));
        hashMap.put("detail_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str2);
        hashMap.put("big_optimize", 1);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("_all");
        if (!"ttlive_query_pipo_purchase_all".equals(X1D.LIZIZ(LIZ)) || LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_query_pipo_purchase_all", 0.2d)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append("_all");
            C0K2.LJII(1, X1D.LIZIZ(LIZ2), hashMap);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(str);
        LIZ3.append("_error");
        C0K2.LJII(1, X1D.LIZIZ(LIZ3), hashMap);
    }
}
