package X;

import Y.AObserverS65S0200000_1;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import com.bytedance.android.livesdk.livesetting.banner.TiktokLiveBannerLynxEnableConfigSetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.CommercialVideoInfo;
import com.ss.android.ugc.aweme.commerce.model.MissionInfo;
import com.ss.android.ugc.aweme.commerce.model.MissionItemStatus;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UZt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77413UZt implements HF7, IAA {
    @Override // X.IAA
    public void LIZ(InterfaceC83624Wrs asCameraView) {
        o.LJIIIZ(asCameraView, "asCameraView");
    }

    public void LJJIIJZLJL(Context context, String str) {
        o.LJIIIZ(context, "context");
    }

    public static String LJJIIJ() {
        String str = V0N.LJLIL;
        o.LJIIIIZZ(str, "getShotFrom()");
        return str;
    }

    public static boolean LJIIZILJ() {
        LiveOuterService.LJJJLL().LJIL();
        return true;
    }

    public static final C26227ARb LIZIZ(Context context) {
        o.LJIIIZ(context, "<this>");
        return new C26227ARb(context);
    }

    public static void LJI(String str) {
        if (C56662Kg.LIZ().LIZLLL) {
            C56662Kg.LIZ().LIZJ(str, false);
        }
    }

    public static final C33011Rh LJIIIZ(Context context) {
        int i;
        C32941Ra c32941Ra = new C32941Ra(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i = 0;
        }
        return new C33011Rh(c32941Ra, new C32951Rb(i));
    }

    public static void LJIIJ(String str) {
        if (C56662Kg.LIZ().LIZLLL) {
            C56662Kg.LIZ().LJFF(str, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJIIJJI(com.bytedance.android.livesdk.model.BannerInRoom r5) {
        /*
            java.lang.String r4 = "activityId"
            java.lang.String r3 = ""
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = r5.schemaUrl     // Catch: java.lang.Exception -> L37
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r4)     // Catch: java.lang.Exception -> L37
            if (r2 != 0) goto L16
            r2 = r3
        L16:
            java.lang.String r0 = "url"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L37
            if (r0 != 0) goto L1f
            return r2
        L1f:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r0, r4)     // Catch: java.lang.Exception -> L37
            if (r1 == 0) goto L32
            int r0 = r1.length()     // Catch: java.lang.Exception -> L37
            if (r0 != 0) goto L30
            goto L32
        L30:
            r0 = 0
            goto L33
        L32:
            r0 = 1
        L33:
            if (r0 == 0) goto L36
            return r2
        L36:
            return r1
        L37:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77413UZt.LJIIJJI(com.bytedance.android.livesdk.model.BannerInRoom):java.lang.String");
    }

    public static File LJIIL(Context context) {
        File LLIIIZ = C16880lQ.LLIIIZ(context);
        if (LLIIIZ == null) {
            return C16880lQ.LLIIIL(context);
        }
        return LLIIIZ;
    }

    public static boolean LJIILL(List list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILLIIL(PromotionItem promotionItem) {
        Integer style;
        GImage icon;
        List<String> urls;
        if (promotionItem != null && (((style = promotionItem.getStyle()) == null || style.intValue() != 1) && (icon = promotionItem.getIcon()) != null && (urls = icon.getUrls()) != null && !urls.isEmpty())) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJ(Aweme aweme) {
        MissionItemStatus missionItemStatus;
        AwemeCommerceStruct commerceVideoAuthInfo;
        java.util.Set LJIIIIZZ = C77275UUl.LJIIIIZZ(MissionItemStatus.IN_REVIEW, MissionItemStatus.PASS_BY_MACHINE, MissionItemStatus.PASS_BY_AUDIT, MissionItemStatus.GREY);
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            missionItemStatus = commerceVideoAuthInfo.getMissionItemStatusEnum();
        } else {
            missionItemStatus = null;
        }
        return ORZ.LJLJJI(missionItemStatus, LJIIIIZZ);
    }

    public static final boolean LJIJI(Aweme aweme) {
        CommercialVideoInfo LJIIZILJ;
        MissionInfo missionInfo;
        if (aweme == null || (LJIIZILJ = C1DF.LJIIZILJ(aweme)) == null || (missionInfo = LJIIZILJ.getMissionInfo()) == null || !missionInfo.m105isMissionAd()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJJ(BannerInRoom bannerInRoom) {
        Long l;
        o.LJIIIZ(bannerInRoom, "<this>");
        Long l2 = bannerInRoom.businessType;
        if (((l2 == null || l2.longValue() != 0) && ((l = bannerInRoom.businessType) == null || l.longValue() != 1)) || !C15650jR.LIZIZ(bannerInRoom.image)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJJLI(Handler handler) {
        if (handler == null) {
            return false;
        }
        try {
            if (!handler.getLooper().getThread().isAlive()) {
                return false;
            }
            if (handler.getLooper().getThread().isInterrupted()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void LJIL(String str) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_type", "normal_type");
        c145995oB.LJI("shoot_way", str);
        GXR.LIZ("shoot_live_tab_alert_show", c145995oB.LIZ);
    }

    public static boolean LJJ(List list) {
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void LJJIFFI(File file) {
        File[] listFiles;
        try {
            if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    LJJIFFI(file2);
                } else {
                    C16880lQ.LLLZZIL(file2);
                }
            }
            C16880lQ.LLLZZIL(file);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final boolean LJJIIZ(BannerInRoom bannerInRoom) {
        BannerInRoom.BannerContentDynamic bannerContentDynamic;
        String str;
        Long l;
        Long l2;
        java.util.Map<String, Boolean> value;
        Boolean bool;
        o.LJIIIZ(bannerInRoom, "<this>");
        if (LJIJJ(bannerInRoom)) {
            return true;
        }
        if (!LJIJJ(bannerInRoom) && (bannerContentDynamic = bannerInRoom.dynamicBanner) != null && (str = bannerContentDynamic.jsonResource) != null && str.length() != 0) {
            try {
                String optString = new JSONObject(bannerInRoom.dynamicBanner.jsonResource).optString("lynx_js");
                if (optString != null) {
                    if (optString.length() != 0) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        Long l3 = bannerInRoom.businessType;
        if ((l3 == null || l3.longValue() != 0) && (((l = bannerInRoom.businessType) == null || l.longValue() != 1) && (((l2 = bannerInRoom.businessType) == null || l2.longValue() != 2) && (value = TiktokLiveBannerLynxEnableConfigSetting.INSTANCE.getValue()) != null && (bool = value.get(String.valueOf(bannerInRoom.businessType))) != null && bool.booleanValue()))) {
            return true;
        }
        return false;
    }

    public static final void LIZLLL(C78160Ulw c78160Ulw, java.util.Map map) {
        long j;
        if (map == null) {
            return;
        }
        Long l = c78160Ulw.LJIILIIL.get("sendReceivedDuration");
        if (l != null) {
            map.put("send_receive_dur", String.valueOf(l.longValue()));
        }
        Long l2 = c78160Ulw.LJIILIIL.get("createReceivedDuration");
        if (l2 != null) {
            map.put("msg_create_receive_dur", String.valueOf(l2.longValue()));
        }
        Long l3 = c78160Ulw.LJIILIIL.get("sendEnqueueDuration");
        if (l3 != null) {
            map.put("send_enqueue_dur", String.valueOf(l3.longValue()));
        }
        Long l4 = c78160Ulw.LJIILIIL.get("receivedEnqueueDuration");
        if (l4 != null) {
            map.put("receive_enqueue_dur", String.valueOf(l4.longValue()));
        }
        Long l5 = c78160Ulw.LJIILIIL.get("enqueueDequeueDuration");
        if (l5 != null) {
            map.put("in_queue_dur", String.valueOf(l5.longValue()));
            j = l5.longValue();
        } else {
            j = 0;
        }
        Long l6 = c78160Ulw.LJIILIIL.get("playStart");
        if (l6 == null) {
            l6 = 0L;
        }
        long longValue = l6.longValue();
        if (longValue > 0) {
            Long l7 = c78160Ulw.LJIILIIL.get("sendTs");
            if (l7 != null) {
                map.put("send_effect_start_total_dur", String.valueOf(longValue - l7.longValue()));
            }
            Long l8 = c78160Ulw.LJIILIIL.get("receiveTs");
            if (l8 != null) {
                map.put("receive_effect_start_dur", String.valueOf(longValue - l8.longValue()));
                map.put("receive_effect_start_without_queue_dur", String.valueOf((longValue - l8.longValue()) - j));
            }
            Long l9 = c78160Ulw.LJIILIIL.get("dequeueTs");
            if (l9 != null) {
                map.put("dequeue_effect_start_dur", String.valueOf(longValue - l9.longValue()));
            }
        }
    }

    public static final void LJ(C78160Ulw c78160Ulw, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZLLL(c78160Ulw, linkedHashMap);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Exception e) {
                C32444CoK.LIZJ(e);
            }
        }
    }

    public static final void LJFF(GradientDrawable gradientDrawable, C49V backgroundConfig) {
        o.LJIIIZ(backgroundConfig, "backgroundConfig");
        gradientDrawable.setShape(0);
        C4AH c4ah = backgroundConfig.LIZ;
        if (c4ah != null) {
            float f = c4ah.LJLIL;
            float f2 = c4ah.LJLILLLLZI;
            float f3 = c4ah.LJLJI;
            float f4 = c4ah.LJLJJI;
            gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
        }
        C4KA c4ka = backgroundConfig.LIZIZ;
        if (c4ka != null) {
            c4ka.LJLLJ(EF7.LIZIZ(), gradientDrawable);
        }
        C48E c48e = backgroundConfig.LIZJ;
        if (c48e != null) {
            gradientDrawable.setColor(c48e.LJLIL);
        }
    }

    public static File LJIIIIZZ(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                if (!z) {
                    file.mkdirs();
                } else {
                    try {
                        File parentFile = file.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        file.createNewFile();
                    } catch (IOException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            return file;
        }
        return null;
    }

    public static final InterfaceC07790Sh LJJI(InterfaceC07790Sh interfaceC07790Sh, InterfaceC88472Yns onSizeChanged) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(onSizeChanged, "onSizeChanged");
        return interfaceC07790Sh.LLLIIIL(new C536528r(onSizeChanged));
    }

    public void LJJIIZI(View view, float f) {
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        float abs = 1 - (Math.abs(f) * 0.1f);
        view.setScaleX(abs);
        view.setScaleY(abs);
    }

    public static final void LIZJ(MediatorLiveData mediatorLiveData, LiveData[] liveDataArr, InterfaceC88471Ynr interfaceC88471Ynr) {
        for (LiveData liveData : liveDataArr) {
            mediatorLiveData.addSource(liveData, new AObserverS65S0200000_1(interfaceC88471Ynr, mediatorLiveData, 3));
        }
        interfaceC88471Ynr.invoke(mediatorLiveData, C76800UCe.LIZ);
    }

    public static void LJJII(int i, String str, JSONObject jSONObject) {
        try {
            jSONObject.put(str, i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJJIII(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final C49V LJIILIIL(Context context, boolean z, boolean z2, boolean z3) {
        C48E c48e;
        C4AH LIZ = C49W.LIZ(false, z, z3);
        if (z2) {
            if (z3) {
                LIZ = C4AH.L(LIZ, 11);
            } else {
                LIZ = C4AH.L(LIZ, 7);
            }
        }
        C1045248i c1045248i = C49R.LIZ;
        Integer LJI = C79045V0n.LJI(c1045248i.LIZJ, context);
        if (LJI != null) {
            c48e = new C48E(LJI.intValue());
        } else {
            c48e = null;
        }
        return new C49V(LIZ, c1045248i.LJIIJ, c48e);
    }

    public static final String LJIILJJIL(C139795eB c139795eB, EnumC126674y7 op, Context context, java.util.Map actionMap) {
        String str;
        int i;
        Integer num;
        Integer num2;
        boolean LJ;
        o.LJIIIZ(op, "op");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(actionMap, "actionMap");
        EnumC126674y7 enumC126674y7 = EnumC126674y7.UNDO;
        if (op == enumC126674y7) {
            str = c139795eB.LJLILLLLZI;
        } else {
            str = c139795eB.LJLJI;
        }
        if (op == enumC126674y7) {
            i = R.string.b7h;
        } else {
            i = R.string.b7a;
        }
        String string = context.getString(i);
        o.LJIIIIZZ(string, "context.getString(if (op…lse R.string.action_redo)");
        Object[] objArr = (Object[]) actionMap.get(c139795eB.LJLIL);
        if (objArr == null || (num = (Integer) ORY.LJJJJI(0, objArr)) == null) {
            return "";
        }
        int intValue = num.intValue();
        Object[] objArr2 = (Object[]) actionMap.get(c139795eB.LJLIL);
        if (objArr2 != null) {
            num2 = (Integer) ORY.LJJJJI(1, objArr2);
        } else {
            num2 = null;
        }
        String str2 = c139795eB.LJLIL;
        if (o.LJ(str2, EnumC126814yL.TRANSITION.getNameId())) {
            return str;
        }
        if (o.LJ(str2, EnumC126814yL.VIDEO_TRANSITION.getNameId())) {
            LJ = true;
        } else {
            LJ = o.LJ(str2, EnumC126814yL.MAGIC.getNameId());
        }
        if (LJ) {
            if (num2 == null) {
                StringBuilder LIZJ = b1.LIZJ(string, ": ");
                LIZJ.append(context.getString(intValue));
                return X1D.LIZIZ(LIZJ);
            }
            if (op != enumC126674y7) {
                intValue = num2.intValue();
            }
            String string2 = context.getString(intValue);
            o.LJIIIIZZ(string2, "context.getString(strId)");
            return Q8U.LIZIZ(new Object[]{c139795eB.LJLJJI}, 1, string2, "format(format, *args)");
        }
        if (o.LJ(str2, EnumC126814yL.APPLY_VOICE_EFFECT.getNameId()) || o.LJ(str2, EnumC126814yL.APPLYTOALL_VOICE_EFFECT.getNameId())) {
            if (op == enumC126674y7) {
                num2 = Integer.valueOf(intValue);
            }
            if (num2 == null) {
                return "";
            }
            num2.intValue();
            String string3 = context.getString(num2.intValue());
            o.LJIIIIZZ(string3, "context.getString(strId)");
            return Q8U.LIZIZ(new Object[]{c139795eB.LJLJJI}, 1, string3, "format(format, *args)");
        }
        if (num2 == null) {
            StringBuilder LIZJ2 = b1.LIZJ(string, ": ");
            LIZJ2.append(context.getString(intValue));
            return X1D.LIZIZ(LIZJ2);
        }
        if (op != enumC126674y7) {
            intValue = num2.intValue();
        }
        String string4 = context.getString(intValue);
        o.LJIIIIZZ(string4, "{\n                contex…lse redoId)\n            }");
        return string4;
    }

    public static final Object LJII(InterfaceC67352kd interfaceC67352kd, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC64672gJ interfaceC64672gJ, InterfaceC65462ha[] interfaceC65462haArr) {
        C77416UZw c77416UZw = new C77416UZw(null, interfaceC65784Pro, interfaceC88473Ynt, interfaceC64672gJ, interfaceC65462haArr);
        C79843Bk c79843Bk = new C79843Bk(interfaceC67352kd, interfaceC67352kd.getContext());
        Object LJJJIL = C78555UsJ.LJJJIL(c79843Bk, c79843Bk, c77416UZw);
        if (LJJJIL == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJJJIL;
        }
        return C76800UCe.LIZ;
    }
}
