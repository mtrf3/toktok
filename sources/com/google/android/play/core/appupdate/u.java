package com.google.android.play.core.appupdate;

import X.AbstractC538029g;
import X.C00F;
import X.C05L;
import X.C0QR;
import X.C0QS;
import X.C10370av;
import X.C10430b1;
import X.C11160cC;
import X.C11P;
import X.C16880lQ;
import X.C1DT;
import X.C1E4;
import X.C1M3;
import X.C23490w5;
import X.C29321Dc;
import X.C30869C9p;
import X.C36633EZh;
import X.C40675Fxn;
import X.C44432HcC;
import X.C45804HyK;
import X.C47959Irz;
import X.C48658J7u;
import X.C48841JEv;
import X.C5V7;
import X.C5Z5;
import X.C60903NvH;
import X.C63120Opw;
import X.C64962gm;
import X.C78503UrT;
import X.C78507UrX;
import X.C79146V4k;
import X.C84673XKz;
import X.EKS;
import X.EXT;
import X.EnumC139385dW;
import X.EnumC78522Urm;
import X.EnumC96103pu;
import X.InterfaceC36632EZg;
import X.InterfaceC78280Uns;
import X.InterfaceC78502UrS;
import X.InterfaceC78505UrV;
import X.InterfaceC88472Yns;
import X.LY3;
import X.ORZ;
import X.PGH;
import X.UFL;
import X.WM7;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.IHttpService;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentBillSummary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.CommerceAceSurveyInfo;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import djb.IDaS21S0000000_2;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final /* synthetic */ class u {
    public static w LIZ = null;
    public static long LIZIZ = 0;
    public static final /* synthetic */ int LIZJ = 0;
    public static String LIZLLL = "https://i.isnssdk.com/monitor/collect/c/logcollect";
    public static boolean LJ = false;
    public static boolean LJFF = true;

    public static /* synthetic */ boolean LJJJIL(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int LJIILJJIL() {
        return C00F.LIZ(31744, 2, "preloader_type", true);
    }

    public static boolean LJIJJ() {
        if (C44432HcC.LJLJI) {
            if (LJFF) {
                LJ = EKS.LIZ();
                LJFF = false;
            }
            return LJ;
        }
        return EKS.LIZ();
    }

    public static final C64962gm LJFF() {
        C84673XKz LJIILIIL = C79146V4k.LJIILIIL();
        return C48841JEv.LIZ(EXT.LIZ.plus(LJIILIIL).plus(new IDaS21S0000000_2(CoroutineExceptionHandler.LJJJJIZL, 1)));
    }

    public static boolean LJJIIJ() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - LIZIZ;
        LIZIZ = uptimeMillis;
        if (j > 500) {
            return true;
        }
        return false;
    }

    public static final boolean LIZ(C11P c11p) {
        kotlin.jvm.internal.o.LJIIIZ(c11p, "<this>");
        if (!c11p.LJI && c11p.LIZLLL) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(C11P c11p) {
        kotlin.jvm.internal.o.LJIIIZ(c11p, "<this>");
        if (c11p.LJI && !c11p.LIZLLL) {
            return true;
        }
        return false;
    }

    public static final Map LJ(Map map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            Object key = entry.getKey();
            if (value instanceof Boolean) {
                value = Integer.valueOf(((Boolean) value).booleanValue() ? 1 : 0);
            }
            hashMap.put(key, value);
        }
        return hashMap;
    }

    public static final AbstractC538029g LJIIIIZZ(C29321Dc c29321Dc) {
        C1M3 LJIIIIZZ;
        AbstractC538029g abstractC538029g;
        kotlin.jvm.internal.o.LJIIIZ(c29321Dc, "<this>");
        C1DT LJIILL = C1E4.LJIILL(c29321Dc);
        if ((LJIILL == null && (LJIILL = C1E4.LJIILLIIL(c29321Dc)) == null) || (LJIIIIZZ = LJIILL.LJIIIIZZ()) == null || (abstractC538029g = LJIIIIZZ.LJLJJLL) == null) {
            return c29321Dc.LLI.LIZIZ;
        }
        return abstractC538029g;
    }

    public static final String LJIIJJI(UploadSpeedInfo uploadSpeedInfo) {
        boolean z;
        Object next;
        boolean z2;
        String str = null;
        if (uploadSpeedInfo == null || uploadSpeedInfo.getSpeed() <= 0) {
            return null;
        }
        String synthesisSettings = C47959Irz.LIZLLL(31744, "ve_synthesis_settings_by_upload_speed", "", true);
        if (synthesisSettings == null || synthesisSettings.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        kotlin.jvm.internal.o.LJIIIIZZ(synthesisSettings, "synthesisSettings");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(synthesisSettings);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                if (jSONObject != null) {
                    int optInt = jSONObject.optInt("max_speed");
                    JSONObject optJSONObject = jSONObject.optJSONObject("setting");
                    if (optJSONObject != null) {
                        String jSONObject2 = optJSONObject.toString();
                        kotlin.jvm.internal.o.LJIIIIZZ(jSONObject2, "settings.toString()");
                        arrayList.add(new C78507UrX(optInt, jSONObject2));
                    }
                }
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (((C78507UrX) next2).LIZ > uploadSpeedInfo.getSpeed()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList2.add(next2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    int i2 = ((C78507UrX) next).LIZ;
                    do {
                        Object next3 = it2.next();
                        int i3 = ((C78507UrX) next3).LIZ;
                        if (i2 > i3) {
                            next = next3;
                            i2 = i3;
                        }
                    } while (it2.hasNext());
                }
            }
            C78507UrX c78507UrX = (C78507UrX) next;
            if (c78507UrX != null) {
                uploadSpeedInfo.setUsedCompilerSettingGroup(c78507UrX.LIZ);
                str = c78507UrX.LIZIZ;
            }
        }
        C5Z5.LIZ("UploadSpeeds v1 --- speed : " + uploadSpeedInfo.getSpeed() + " ; setting : " + str);
        return str;
    }

    public static final String LJIILIIL(AwemeRawAd awemeRawAd) {
        Integer styleType;
        if (awemeRawAd == null || awemeRawAd.getCommerceAceSurveyInfo() == null) {
            return null;
        }
        CommerceAceSurveyInfo commerceAceSurveyInfo = awemeRawAd.getCommerceAceSurveyInfo();
        if (commerceAceSurveyInfo == null || (styleType = commerceAceSurveyInfo.getStyleType()) == null || styleType.intValue() != 0) {
            return "style2";
        }
        return "style1";
    }

    public static final boolean LJIILL(TextStickerModel textStickerModel) {
        kotlin.jvm.internal.o.LJIIIZ(textStickerModel, "<this>");
        TTSModel ttsModel = textStickerModel.getTtsModel();
        if (ttsModel == null || !ttsModel.hasReadTextAudio) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILLIIL(TextStickerModel textStickerModel) {
        kotlin.jvm.internal.o.LJIIIZ(textStickerModel, "<this>");
        if (textStickerModel.getSourceType() == C5V7.AI_CAPTION) {
            return true;
        }
        return false;
    }

    public static boolean LJIIZILJ(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean LJIJ(TextStickerModel textStickerModel) {
        kotlin.jvm.internal.o.LJIIIZ(textStickerModel, "<this>");
        if (textStickerModel.getCaptionModel() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJI(LY3 ly3) {
        kotlin.jvm.internal.o.LJIIIZ(ly3, "<this>");
        List<FollowingInterestUser> list = ly3.LIZ;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        List<Aweme> list2 = ly3.LIZIZ;
        if (list2 != null && !list2.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJJLI(TextStickerModel textStickerModel) {
        kotlin.jvm.internal.o.LJIIIZ(textStickerModel, "<this>");
        if (textStickerModel.getGuideType() == EnumC139385dW.LIVE_HIGHLIGHT) {
            return true;
        }
        return false;
    }

    public static final boolean LJIL(TextStickerModel textStickerModel) {
        kotlin.jvm.internal.o.LJIIIZ(textStickerModel, "<this>");
        if (textStickerModel.getGuideType() != EnumC139385dW.NONE) {
            return true;
        }
        return false;
    }

    public static final boolean LJJ(FollowingInterestUser followingInterestUser) {
        kotlin.jvm.internal.o.LJIIIZ(followingInterestUser, "<this>");
        if (followingInterestUser.getUser().isLive() && !TextUtils.isEmpty(followingInterestUser.getUser().getUid()) && !followingInterestUser.getSeeAll()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJII(C63120Opw c63120Opw) {
        kotlin.jvm.internal.o.LJIIIZ(c63120Opw, "<this>");
        EnumC96103pu fromValue = EnumC96103pu.fromValue(c63120Opw.getCategory());
        if (fromValue == null || fromValue == EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIII(C63120Opw c63120Opw) {
        kotlin.jvm.internal.o.LJIIIZ(c63120Opw, "<this>");
        if (EnumC96103pu.fromValue(c63120Opw.getCategory()) == EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_SECONDARY) {
            return true;
        }
        return false;
    }

    public static final List LJJIL(InterfaceC78502UrS interfaceC78502UrS) {
        ArrayList arrayList = new ArrayList();
        int size = interfaceC78502UrS.size();
        for (int i = 0; i < size; i++) {
            switch (C78503UrT.LIZ[interfaceC78502UrS.getType(i).ordinal()]) {
                case 1:
                    arrayList.add(interfaceC78502UrS.getString(i));
                    break;
                case 2:
                    arrayList.add(Double.valueOf(interfaceC78502UrS.getDouble(i)));
                    break;
                case 3:
                    arrayList.add(Boolean.valueOf(interfaceC78502UrS.getBoolean(i)));
                    break;
                case 4:
                    arrayList.add(Integer.valueOf(interfaceC78502UrS.getInt(i)));
                    break;
                case 5:
                    InterfaceC78280Uns map = interfaceC78502UrS.getMap(i);
                    if (map != null) {
                        arrayList.add(LJJIZ(map));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    InterfaceC78502UrS array = interfaceC78502UrS.getArray(i);
                    if (array != null) {
                        arrayList.add(LJJIL(array));
                        break;
                    } else {
                        break;
                    }
            }
        }
        return arrayList;
    }

    public static final Map LJJIZ(InterfaceC78280Uns interfaceC78280Uns) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UFL LIZ2 = interfaceC78280Uns.LIZ();
        while (LIZ2.hasNextKey()) {
            String nextKey = LIZ2.nextKey();
            switch (C78503UrT.LIZIZ[interfaceC78280Uns.getType(nextKey).ordinal()]) {
                case 1:
                    linkedHashMap.put(nextKey, interfaceC78280Uns.getString(nextKey));
                    break;
                case 2:
                    linkedHashMap.put(nextKey, Double.valueOf(interfaceC78280Uns.getDouble(nextKey)));
                    break;
                case 3:
                    linkedHashMap.put(nextKey, Boolean.valueOf(interfaceC78280Uns.getBoolean(nextKey)));
                    break;
                case 4:
                    linkedHashMap.put(nextKey, Integer.valueOf(interfaceC78280Uns.getInt(nextKey)));
                    break;
                case 5:
                    InterfaceC78280Uns map = interfaceC78280Uns.getMap(nextKey);
                    if (map == null) {
                        break;
                    } else {
                        linkedHashMap.put(nextKey, LJJIZ(map));
                        break;
                    }
                case 6:
                    InterfaceC78502UrS array = interfaceC78280Uns.getArray(nextKey);
                    if (array == null) {
                        break;
                    } else {
                        linkedHashMap.put(nextKey, LJJIL(array));
                        break;
                    }
            }
        }
        return linkedHashMap;
    }

    public static boolean LIZJ(String str, Context context) {
        if (str == null || str.length() < 2) {
            C05L.LIZLLL(context, R.string.qth);
            return false;
        }
        if (str.length() > 24) {
            C05L.LIZLLL(context, R.string.qti);
            return false;
        }
        if (!str.matches("[0-9A-Za-z_.]*")) {
            C05L.LIZLLL(context, R.string.qte);
            return false;
        }
        if (PatternProtector.compile("[0-9]*").matcher(str).matches()) {
            C05L.LIZLLL(context, R.string.qtf);
            return false;
        }
        return true;
    }

    public static final Summary LJII(BillInfoData billInfoData, String str) {
        PaymentBillSummary paymentBillSummary;
        Summary billSummary;
        kotlin.jvm.internal.o.LJIIIZ(billInfoData, "<this>");
        List<PaymentBillSummary> paymentSummary = billInfoData.getPaymentSummary();
        if (paymentSummary != null) {
            Iterator<PaymentBillSummary> it = paymentSummary.iterator();
            while (true) {
                if (it.hasNext()) {
                    paymentBillSummary = it.next();
                    if (kotlin.jvm.internal.o.LJ(paymentBillSummary.getPaymentMethodId(), str)) {
                        break;
                    }
                } else {
                    paymentBillSummary = null;
                    break;
                }
            }
            PaymentBillSummary paymentBillSummary2 = paymentBillSummary;
            if (paymentBillSummary2 != null && (billSummary = paymentBillSummary2.getBillSummary()) != null) {
                return billSummary;
            }
        }
        return billInfoData.getSummary();
    }

    public static final C29321Dc LJIIIZ(C29321Dc c29321Dc, InterfaceC88472Yns interfaceC88472Yns) {
        kotlin.jvm.internal.o.LJIIIZ(c29321Dc, "<this>");
        if (((Boolean) interfaceC88472Yns.invoke(c29321Dc)).booleanValue()) {
            return c29321Dc;
        }
        List<C29321Dc> LJIJI = c29321Dc.LJIJI();
        int size = LJIJI.size();
        for (int i = 0; i < size; i++) {
            C29321Dc LJIIIZ = LJIIIZ((C29321Dc) ListProtector.get(LJIJI, i), interfaceC88472Yns);
            if (LJIIIZ != null) {
                return LJIIIZ;
            }
        }
        return null;
    }

    public static final void LJIIJ(C29321Dc c29321Dc, List list) {
        List LLJILJILJ;
        kotlin.jvm.internal.o.LJIIIZ(c29321Dc, "<this>");
        kotlin.jvm.internal.o.LJIIIZ(list, "list");
        if (!c29321Dc.LJJIIZ()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<C29321Dc> LJIJI = c29321Dc.LJIJI();
        int size = LJIJI.size();
        for (int i = 0; i < size; i++) {
            C29321Dc c29321Dc2 = (C29321Dc) ListProtector.get(LJIJI, i);
            if (c29321Dc2.LJJIIZ()) {
                arrayList.add(new C0QS(c29321Dc, c29321Dc2));
            }
        }
        try {
            C0QR c0qr = C0QR.Stripe;
            kotlin.jvm.internal.o.LJIIIZ(c0qr, "<set-?>");
            C0QS.LJLJJL = c0qr;
            LLJILJILJ = ORZ.LLJILJILJ(arrayList);
            C40675Fxn.LJJLIIIIJ(LLJILJILJ);
        } catch (IllegalArgumentException unused) {
            C0QR c0qr2 = C0QR.Location;
            kotlin.jvm.internal.o.LJIIIZ(c0qr2, "<set-?>");
            C0QS.LJLJJL = c0qr2;
            LLJILJILJ = ORZ.LLJILJILJ(arrayList);
            C40675Fxn.LJJLIIIIJ(LLJILJILJ);
        }
        ArrayList arrayList2 = new ArrayList(LLJILJILJ.size());
        int size2 = LLJILJILJ.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(((C0QS) ListProtector.get(LLJILJILJ, i2)).LJLILLLLZI);
        }
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C29321Dc c29321Dc3 = (C29321Dc) ListProtector.get(arrayList2, i3);
            C1DT LJIILLIIL = C1E4.LJIILLIIL(c29321Dc3);
            if (LJIILLIIL != null) {
                list.add(LJIILLIIL);
            } else {
                LJIIJ(c29321Dc3, list);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.property.UploadSpeedEncodeSettings LJIIL(com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.u.LJIIL(com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo, boolean):com.ss.android.ugc.aweme.property.UploadSpeedEncodeSettings");
    }

    public static final boolean LJJI(C11P isOutOfBounds, long j) {
        kotlin.jvm.internal.o.LJIIIZ(isOutOfBounds, "$this$isOutOfBounds");
        long j2 = isOutOfBounds.LIZJ;
        float LIZLLL2 = C10370av.LIZLLL(j2);
        float LJ2 = C10370av.LJ(j2);
        int i = (int) (j >> 32);
        int LIZIZ2 = C23490w5.LIZIZ(j);
        if (LIZLLL2 < 0.0f || LIZLLL2 > i || LJ2 < 0.0f || LJ2 > LIZIZ2) {
            return true;
        }
        return false;
    }

    public static final void LJJIIJZLJL(String str, HashMap hashMap) {
        Object obj;
        Object obj2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(WM7.SCENE_SERVICE, "prefetch");
            jSONObject.put("step", str);
            Object obj3 = null;
            if (hashMap == null) {
                obj = null;
            } else {
                obj = hashMap.get("entrance_form");
            }
            jSONObject.put("entrance_form", obj);
            if (hashMap != null) {
                obj3 = hashMap.get("enter_from_info");
            }
            jSONObject.put("enter_from_info", obj3);
            if (hashMap != null) {
                Object obj4 = hashMap.get("click_product_start_time");
                if (obj4 != null && (obj4 instanceof Long)) {
                    ((Number) obj4).longValue();
                    jSONObject.put("click_duration", SystemClock.elapsedRealtime() - ((Number) obj4).longValue());
                }
                if (hashMap != null && (obj2 = hashMap.get("click_scene_start_time")) != null && (obj2 instanceof Long)) {
                    ((Number) obj2).longValue();
                    jSONObject.put("total_duration", SystemClock.elapsedRealtime() - ((Number) obj2).longValue());
                }
            }
            C48658J7u.LIZIZ("rd_ec_prefetch_trace", jSONObject);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static InterfaceC78280Uns LJJIJIIJIL(InterfaceC78280Uns optMap, String str) {
        kotlin.jvm.internal.o.LJIIJ(optMap, "$this$optMap");
        if (optMap.hasKey(str)) {
            InterfaceC78505UrV interfaceC78505UrV = optMap.get(str);
            if (interfaceC78505UrV.getType() == EnumC78522Urm.Map) {
                return interfaceC78505UrV.asMap();
            }
        }
        return null;
    }

    public static /* synthetic */ String LJJIJL(InterfaceC78280Uns interfaceC78280Uns, String str) {
        return LJJIJIL(interfaceC78280Uns, str, "");
    }

    public static final long LJJIJLIJ(C11P c11p, boolean z) {
        long LJFF2 = C10370av.LJFF(c11p.LIZJ, c11p.LJFF);
        if (!z && c11p.LIZIZ()) {
            return C10370av.LIZIZ;
        }
        return LJFF2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.OQg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C27042AjO LJJJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.u.LJJJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, java.lang.String):X.AjO");
    }

    public static final boolean LJJIFFI(C11P isOutOfBounds, long j, long j2) {
        kotlin.jvm.internal.o.LJIIIZ(isOutOfBounds, "$this$isOutOfBounds");
        if (isOutOfBounds.LJII == 1) {
            long j3 = isOutOfBounds.LIZJ;
            float LIZLLL2 = C10370av.LIZLLL(j3);
            float LJ2 = C10370av.LJ(j3);
            float f = -C10430b1.LIZLLL(j2);
            float LIZLLL3 = C10430b1.LIZLLL(j2) + ((int) (j >> 32));
            float f2 = -C10430b1.LIZIZ(j2);
            float LIZIZ2 = C10430b1.LIZIZ(j2) + C23490w5.LIZIZ(j);
            if (LIZLLL2 >= f && LIZLLL2 <= LIZLLL3 && LJ2 >= f2 && LJ2 <= LIZIZ2) {
                return false;
            }
            return true;
        }
        return LJJI(isOutOfBounds, j);
    }

    public static final InterfaceC78502UrS LJJIIZ(InterfaceC78280Uns optArray, String str, InterfaceC78502UrS interfaceC78502UrS) {
        kotlin.jvm.internal.o.LJIIJ(optArray, "$this$optArray");
        if (!optArray.hasKey(str)) {
            return interfaceC78502UrS;
        }
        InterfaceC78505UrV interfaceC78505UrV = optArray.get(str);
        if (interfaceC78505UrV.getType() == EnumC78522Urm.Array) {
            return interfaceC78505UrV.asArray();
        }
        return interfaceC78502UrS;
    }

    public static final boolean LJJIIZI(InterfaceC78280Uns optBoolean, String str, boolean z) {
        kotlin.jvm.internal.o.LJIIJ(optBoolean, "$this$optBoolean");
        if (!optBoolean.hasKey(str)) {
            return z;
        }
        InterfaceC78505UrV interfaceC78505UrV = optBoolean.get(str);
        if (interfaceC78505UrV.getType() == EnumC78522Urm.Boolean) {
            return interfaceC78505UrV.asBoolean();
        }
        return z;
    }

    public static final double LJJIJ(InterfaceC78280Uns optDouble, String str, double d) {
        kotlin.jvm.internal.o.LJIIJ(optDouble, "$this$optDouble");
        if (!optDouble.hasKey(str)) {
            return d;
        }
        InterfaceC78505UrV interfaceC78505UrV = optDouble.get(str);
        if (interfaceC78505UrV.getType() == EnumC78522Urm.Number) {
            return interfaceC78505UrV.asDouble();
        }
        return d;
    }

    public static final int LJJIJIIJI(InterfaceC78280Uns optInt, String str, int i) {
        kotlin.jvm.internal.o.LJIIJ(optInt, "$this$optInt");
        if (!optInt.hasKey(str)) {
            return i;
        }
        InterfaceC78505UrV interfaceC78505UrV = optInt.get(str);
        if (interfaceC78505UrV.getType() == EnumC78522Urm.Int) {
            return interfaceC78505UrV.asInt();
        }
        return i;
    }

    public static final String LJJIJIL(InterfaceC78280Uns optString, String name, String defaultValue) {
        kotlin.jvm.internal.o.LJIIJ(optString, "$this$optString");
        kotlin.jvm.internal.o.LJIIJ(name, "name");
        kotlin.jvm.internal.o.LJIIJ(defaultValue, "defaultValue");
        if (!optString.hasKey(name)) {
            return defaultValue;
        }
        InterfaceC78505UrV interfaceC78505UrV = optString.get(name);
        if (interfaceC78505UrV.getType() == EnumC78522Urm.String) {
            return interfaceC78505UrV.asString();
        }
        return defaultValue;
    }

    public static boolean LIZLLL(String str, String str2, String str3, Context context) {
        if ((str3 != null && str3.toLowerCase().contains("tiktok")) || TextUtils.equals(str, "2062")) {
            C05L.LIZLLL(context, R.string.h3k);
            return false;
        }
        if (TextUtils.equals(str, "2064")) {
            C05L.LIZLLL(context, R.string.qtg);
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        C30869C9p.LIZIZ(context, str2);
        return false;
    }

    public static void LJI(Context context, String str, String str2, String str3) {
        SmartRoute buildRoute = SmartRouter.buildRoute(C45804HyK.LJIJJ(context), "aweme://challenge/detail/");
        buildRoute.withParam("cid", str);
        buildRoute.withParam("enter_from", str2);
        buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0);
        buildRoute.withParam("process_id", str3);
        buildRoute.open();
    }

    public static boolean LJJJI(String str, String str2, String str3, List list, String str4, JSONObject jSONObject, C11160cC c11160cC) {
        String jSONObject2;
        C36633EZh finish;
        try {
            IHttpService iHttpService = (IHttpService) PGH.LIZ(IHttpService.class);
            HashMap hashMap = new HashMap();
            hashMap.put(WM7.SCENE_SERVICE, str4);
            InterfaceC36632EZg buildMultipartUpload = iHttpService.buildMultipartUpload(LIZLLL, "UTF-8", false, hashMap);
            buildMultipartUpload.LIZ("aid", str);
            buildMultipartUpload.LIZ("verify_info", C60903NvH.LJIJ());
            buildMultipartUpload.LIZ("device_id", str2);
            buildMultipartUpload.LIZ("os", "Android");
            buildMultipartUpload.LIZ("process_name", str3);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File file = new File((String) it.next());
                if (file.exists()) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("logtype", "alog");
                    hashMap2.put(WM7.SCENE_SERVICE, str4);
                    hashMap2.put("env", "params.txt");
                    buildMultipartUpload.LIZJ(file.getName(), file, hashMap2);
                }
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("filetype", "common_params");
            hashMap3.put("logtype", "env");
            if (jSONObject == null) {
                jSONObject2 = null;
            } else {
                jSONObject2 = jSONObject.toString();
            }
            if (TextUtils.isEmpty(jSONObject2)) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("defaultData", "none commonParams");
                } catch (JSONException unused) {
                }
                jSONObject2 = jSONObject3.toString();
            }
            buildMultipartUpload.LIZIZ(jSONObject2, hashMap3);
            finish = buildMultipartUpload.finish();
            try {
            } catch (JSONException e) {
                c11160cC.LIZ(false, 7, e, null);
            }
        } catch (IOException e2) {
            c11160cC.LIZ(false, 8, e2, null);
        } catch (Exception e3) {
            c11160cC.LIZ(false, 10, e3, null);
        }
        if (finish.LIZJ == null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("ALOG_UPLOAD_RESPONSE", "null");
            jSONObject4.put("ALOG_UPLOAD_STATUS", finish.LIZ);
            c11160cC.LIZ(false, 11, null, jSONObject4);
            return false;
        }
        JSONObject jSONObject5 = new JSONObject(new String(finish.LIZJ));
        int optInt = jSONObject5.optInt("errno", -1);
        if (optInt == 200) {
            String optString = jSONObject5.optString("message");
            if ("long escape".equals(optString) || "drop data".equals(optString)) {
                c11160cC.LIZ(false, 13, null, jSONObject5);
                return false;
            }
            c11160cC.LIZ(true, -1, null, jSONObject5);
            return true;
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("info", optInt);
        c11160cC.LIZ(false, 6, null, jSONObject6);
        return false;
    }
}
