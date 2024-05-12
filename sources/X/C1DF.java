package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.publicscreen.api.TipMessageChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.CommercialVideoInfo;
import com.ss.android.ugc.aweme.creative.model.DraftInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.KeyGenerator;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.linkmic.controller.ResumeResp;

/* renamed from: X.1DF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DF implements InterfaceC111904aI, RTU, InterfaceC48038ItG {
    public static final C1DF LJLIL = new C1DF();
    public static final C1DF LJLILLLLZI = new C1DF();
    public static final C1DF LJLJI = new C1DF();

    public static String[] LJIILJJIL() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = new SecureRandom();
            keyGenerator.init(128, secureRandom);
            byte[] bArr = new byte[8];
            secureRandom.nextBytes(bArr);
            String[] strArr = {LJFF(keyGenerator.generateKey().getEncoded()), LJFF(bArr)};
            if (LJJIIJ(strArr)) {
                return strArr;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.InterfaceC111904aI
    public void LIZ() {
    }

    public static final boolean LJJII() {
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJFF(LLJJJJ, "Looper.getMainLooper()");
        return o.LJ(LLJJJJ.getThread(), C16880lQ.LLLLIIIILLL());
    }

    public static final double LJ(List list) {
        double doubleValue;
        boolean isEmpty = list.isEmpty();
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        if (isEmpty) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (number instanceof Float) {
                doubleValue = number.doubleValue();
            } else if (number instanceof Double) {
                doubleValue = number.doubleValue();
            } else if (number instanceof Integer) {
                doubleValue = number.doubleValue();
            } else if (number instanceof Long) {
                doubleValue = number.doubleValue();
            }
            d += doubleValue;
        }
        return d / list.size();
    }

    public static String LJFF(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr != null) {
            for (byte b : bArr) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
        }
        return sb.toString();
    }

    public static final C83827Wv9 LJI(InterfaceC88472Yns interfaceC88472Yns) {
        Object obj;
        InterfaceC83821Wv3 interfaceC83821Wv3;
        C83824Wv6 c83824Wv6 = new C83824Wv6();
        interfaceC88472Yns.invoke(c83824Wv6);
        Collection creators = c83824Wv6.LIZIZ.values();
        o.LJIIIIZZ(creators, "creators");
        Iterator it = creators.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C83825Wv7) obj).LIZIZ) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C83825Wv7 c83825Wv7 = (C83825Wv7) obj;
        if (c83825Wv7 == null || (interfaceC83821Wv3 = c83825Wv7.LIZ) == null) {
            interfaceC83821Wv3 = ((C83825Wv7) ORZ.LJLLILLLL(creators)).LIZ;
        }
        C65864Pt6 c65864Pt6 = new C65864Pt6();
        for (Map.Entry entry : c83824Wv6.LIZIZ.entrySet()) {
            InterfaceC83821Wv3 interfaceC83821Wv32 = (InterfaceC83821Wv3) entry.getKey();
            C83899WwJ c83899WwJ = new C83899WwJ(((C83825Wv7) entry.getValue()).LIZLLL);
            c65864Pt6.put(interfaceC83821Wv32, new C83841WvN(new C83897WwH(c83899WwJ, c65864Pt6, c83824Wv6), new C83895WwF(interfaceC83821Wv32, c83899WwJ)));
        }
        c65864Pt6.build();
        C83837WvJ LIZIZ = new C65304Pk4().LIZIZ(c65864Pt6);
        C83664WsW c83664WsW = new C83664WsW();
        InterfaceC88472Yns<? super C83664WsW, C76800UCe> interfaceC88472Yns2 = c83824Wv6.LIZ;
        if (interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(c83664WsW);
        }
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptureLog globalContext: ");
        LIZ.append(c83664WsW);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        C83827Wv9 c83827Wv9 = new C83827Wv9(interfaceC83821Wv3, LIZIZ, new AqS164S0100000_14(c83664WsW, 380));
        c83827Wv9.LIZ = new C58589Mz3(c83824Wv6);
        return c83827Wv9;
    }

    public static final UrlModel LJII(Aweme aweme) {
        PhotoModeImageUrlModel photoModeImageUrlModel;
        MultiImageUrlInfo multiImageUrlInfo;
        UrlModel image;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            photoModeImageUrlModel = (PhotoModeImageUrlModel) ORZ.LJLLLL(imageList);
        } else {
            photoModeImageUrlModel = null;
        }
        if (((Boolean) C52277KfR.LIZ.getValue()).booleanValue()) {
            if (photoModeImageUrlModel == null) {
                return null;
            }
            List<MultiImageUrlInfo> bitrateImages = photoModeImageUrlModel.getBitrateImages();
            if (bitrateImages != null) {
                Iterator<MultiImageUrlInfo> it = bitrateImages.iterator();
                while (true) {
                    if (it.hasNext()) {
                        multiImageUrlInfo = it.next();
                        String name = multiImageUrlInfo.getName();
                        C84528XFk.LIZ.getClass();
                        if (o.LJ(name, C84528XFk.LIZLLL.getValue())) {
                            break;
                        }
                    } else {
                        multiImageUrlInfo = null;
                        break;
                    }
                }
                MultiImageUrlInfo multiImageUrlInfo2 = multiImageUrlInfo;
                if (multiImageUrlInfo2 != null && (image = multiImageUrlInfo2.getImage()) != null) {
                    return image;
                }
            }
            return photoModeImageUrlModel.getDisplayImageNoWatermark();
        }
        if (photoModeImageUrlModel == null) {
            return null;
        }
        return photoModeImageUrlModel.getDisplayImageNoWatermark();
    }

    public static final float LJIIIIZZ(int i) {
        return KL2.LIZJ(EF7.LIZIZ(), i);
    }

    public static final int LJIIIZ(int i) {
        return (int) KL2.LIZJ(EF7.LIZIZ(), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final JIB LJIIJ(View view) {
        ViewParent viewParent;
        ViewGroup viewGroup;
        if (view instanceof InterfaceC49780JgG) {
            return ((InterfaceC49780JgG) view).getContainerProvider();
        }
        if (view != 0) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof ViewGroup) || (viewGroup = (ViewGroup) viewParent) == 0) {
            return null;
        }
        if (viewGroup instanceof InterfaceC49780JgG) {
            return ((InterfaceC49780JgG) viewGroup).getContainerProvider();
        }
        return LJIIJ(viewGroup);
    }

    public static final long LJIILL(long j) {
        return C78923UyF.LIZ(C10430b1.LIZLLL(j) / 2.0f, C10430b1.LIZIZ(j) / 2.0f);
    }

    public static final CommercialVideoInfo LJIIZILJ(Aweme aweme) {
        o.LJIIIZ(aweme, "<this>");
        CommercialVideoInfo commercialVideoInfo = null;
        try {
            Gson LIZ = GsonHolder.LIZLLL().LIZ();
            String commercialVideoInfo2 = aweme.getCommercialVideoInfo();
            if (commercialVideoInfo2 == null) {
                commercialVideoInfo2 = null;
            }
            commercialVideoInfo = (CommercialVideoInfo) GsonProtectorUtils.fromJson(LIZ, commercialVideoInfo2, CommercialVideoInfo.class);
            return commercialVideoInfo;
        } catch (s e) {
            C78983UzD.LJIIZILJ(e);
            return commercialVideoInfo;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List LJIJ(List list) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        ArrayList LJ = AnonymousClass391.LJ(list, "exportedEffects");
        for (Object obj : list) {
            DraftInfo draftInfo = ((UploadableMobileEffect2) obj).draftInfo;
            if (draftInfo != null && (str2 = draftInfo.draftId) != null && str2.length() != 0) {
                LJ.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJ, 10));
        Iterator it = LJ.iterator();
        while (it.hasNext()) {
            UploadableMobileEffect2 uploadableMobileEffect2 = (UploadableMobileEffect2) it.next();
            String str3 = uploadableMobileEffect2.effectId;
            String str4 = uploadableMobileEffect2.effectName;
            String str5 = uploadableMobileEffect2.iconFilePath;
            String str6 = uploadableMobileEffect2.zipFilePath;
            DraftInfo draftInfo2 = uploadableMobileEffect2.draftInfo;
            String str7 = "";
            if (draftInfo2 == null || (str = draftInfo2.draftId) == null) {
                str = "";
                if (draftInfo2 == null) {
                    z = false;
                    z2 = true;
                    arrayList.add(new UploadableDraftEffect(str3, str, str4, str5, str6, null, z, z2, str7, 32, 0 == true ? 1 : 0));
                }
            }
            z = draftInfo2.needSubmission;
            z2 = draftInfo2.enableSubmission;
            String str8 = draftInfo2.hintStarlingKey;
            if (str8 != null) {
                str7 = str8;
            }
            arrayList.add(new UploadableDraftEffect(str3, str, str4, str5, str6, null, z, z2, str7, 32, 0 == true ? 1 : 0));
        }
        return arrayList;
    }

    public static final double LJIJI(List list) {
        if (list.isEmpty()) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((Boolean) it.next()).booleanValue()) {
                i++;
            }
        }
        return i / list.size();
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public static final String LJIJJLI(Throwable th) {
        String str;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            str = stringWriter.toString();
            o.LJFF(str, "sw.toString()");
        } catch (Throwable unused) {
            str = "";
        }
        printWriter.close();
        return str;
    }

    public static final boolean LJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdLive() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIII(Aweme aweme) {
        if (aweme == null || !aweme.getIsTikTokStory() || aweme.getAwemeType() != 152) {
            return false;
        }
        return true;
    }

    public static boolean LJJIIJ(String[] strArr) {
        if (strArr == null || strArr.length != 2 || TextUtils.isEmpty(strArr[0]) || strArr[0].length() != 32 || TextUtils.isEmpty(strArr[1]) || strArr[1].length() != 16) {
            return false;
        }
        return true;
    }

    public static final C30267BuJ LJJIIJZLJL(InterfaceC88472Yns interfaceC88472Yns) {
        C30277BuT c30277BuT = new C30277BuT();
        interfaceC88472Yns.invoke(c30277BuT);
        return new C30267BuJ(c30277BuT.LIZ, c30277BuT.LIZIZ);
    }

    public static final long LJJIIZ(List list) {
        if (list.isEmpty()) {
            return 0L;
        }
        Iterator it = list.iterator();
        long j = Long.MIN_VALUE;
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            if (longValue > j) {
                j = longValue;
            }
        }
        return j;
    }

    public static final long LJJIIZI(List list) {
        if (list.isEmpty()) {
            return 0L;
        }
        Iterator it = list.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            if (longValue < j) {
                j = longValue;
            }
        }
        return j;
    }

    public static final C1HU LJJIJ(InterfaceC24520xk interfaceC24520xk) {
        interfaceC24520xk.LJJIIJ(15454635);
        C1HU c1hu = (C1HU) C73975T1n.LJIIIIZZ(new Object[0], C1HU.LIZLLL, C47711u3.LJLIL, interfaceC24520xk, 4);
        c1hu.LIZJ = (C0MG) interfaceC24520xk.LJIILLIIL(C0MH.LIZ);
        interfaceC24520xk.LJJIJIIJIL();
        return c1hu;
    }

    public static final C0DR LJJIJIIJI(C29321Dc c29321Dc) {
        o.LJIIIZ(c29321Dc, "<this>");
        C0DR c0dr = c29321Dc.LJLJLJ;
        if (c0dr != null) {
            return c0dr;
        }
        "LayoutNode should be attached to an owner".toString();
        throw new IllegalStateException("LayoutNode should be attached to an owner");
    }

    public static final C197267og LJJIJIL(MatchedFriendStruct matchedFriendStruct) {
        UrlModel avatarThumb;
        o.LJIIIZ(matchedFriendStruct, "<this>");
        MutualStruct mMutualStruct = matchedFriendStruct.getMMutualStruct();
        if (mMutualStruct == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<MutualUser> userList = mMutualStruct.getUserList();
        if (userList != null) {
            for (MutualUser mutualUser : userList) {
                if (mutualUser != null && ((avatarThumb = mutualUser.getAvatarThumb()) != null || (avatarThumb = mutualUser.getAvatarMedium()) != null)) {
                    arrayList.add(avatarThumb);
                }
            }
        }
        if (arrayList.isEmpty() || mMutualStruct.getTotal() <= 0) {
            return null;
        }
        return new C197267og(arrayList, mMutualStruct.getTotal());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        TJU state = (TJU) obj;
        o.LJIIIZ(state, "state");
        if (state instanceof TJW) {
            return C74413TIj.LIZIZ();
        }
        if (state instanceof TJS) {
            T t = state.LIZ;
            if (t != 0) {
                return C74413TIj.LIZJ(t);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2");
        }
        if (state instanceof TJQ) {
            return C74413TIj.LIZ((Throwable) state.LIZ);
        }
        throw new C162476Zf();
    }

    public static final long LIZIZ(float f, float f2) {
        return (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
    }

    public static final void LIZLLL(java.util.Map commonParams, LaneParams laneParams) {
        String optString;
        o.LJIIIZ(commonParams, "commonParams");
        try {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) commonParams;
            Object obj = concurrentHashMap.get("enter_from_info");
            concurrentHashMap.get("search_result_id");
            JSONObject jSONObject = null;
            if (concurrentHashMap.containsKey("entrance_info")) {
                jSONObject = new JSONObject(String.valueOf(concurrentHashMap.get("entrance_info")));
            }
            if (obj != null) {
                String str = "";
                if (jSONObject != null && (optString = jSONObject.optString("lineup_room_id", "")) != null) {
                    str = optString;
                }
                java.util.Map LJJLIL = C113554cx.LJJLIL(Z9N.LIZIZ.LIZ.LJJZ(obj.toString(), str, "search_id", "search_result_id", "search_entrance", "list_item_id", "click_recom_search_entrance", "last_from_group_id"));
                IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
                String LJIIIIZZ = LJJJJZI.LJIIIIZZ("search_entrance_second");
                if (LJIIIIZZ != null && C78685UuP.LJJJZ(LJIIIIZZ) && !LJJLIL.containsKey("search_entrance_second")) {
                    LJJLIL.put("search_entrance_second", LJIIIIZZ);
                }
                String LJIIIIZZ2 = LJJJJZI.LJIIIIZZ("source_module");
                if (LJIIIIZZ2 != null && C78685UuP.LJJJZ(LJIIIIZZ2) && !LJJLIL.containsKey("source_module")) {
                    LJJLIL.put("source_module", LJIIIIZZ2);
                }
                for (Map.Entry entry : ((LinkedHashMap) LJJLIL).entrySet()) {
                    if ((!o.LJ(entry.getKey(), "list_item_id") || (o.LJ(entry.getKey(), "list_item_id") && laneParams != null && !laneParams.containsKey("list_item_id"))) && !o.LJ(entry.getKey(), "search_result_id")) {
                        if (laneParams != null) {
                            laneParams.put(entry.getKey(), entry.getValue());
                        }
                        if (jSONObject != null) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    if (o.LJ(entry.getKey(), "search_result_id") || o.LJ(entry.getKey(), "search_id") || o.LJ(entry.getKey(), "search_entrance") || o.LJ(entry.getKey(), "last_from_group_id")) {
                        if (!C35173DrF.LIZ()) {
                            String str2 = (String) entry.getValue();
                            if (o.LJ(entry.getKey(), "search_id")) {
                                str2 = ((String) entry.getValue()).toUpperCase(Locale.ROOT);
                                o.LJIIIIZZ(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            }
                            if (ujb.s.LJJJLZIJ(str2, ".", false)) {
                            }
                        }
                    }
                }
                if (jSONObject != null && laneParams != null) {
                    laneParams.put("entrance_info", jSONObject.toString());
                }
            }
        } catch (Exception e) {
            C78983UzD.LJIILL(e.getMessage());
        }
    }

    public static final int LJIIJJI(long j, List list) {
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i < size) {
            long longValue = ((Number) ListProtector.get(list, i)).longValue();
            i++;
            if (longValue >= j) {
                i3 = i;
            }
            i2 = Math.max(i2, i - i3);
        }
        return i2;
    }

    public static final NLETrackSlot LJIIL(NLEModel nLEModel, String uuid) {
        o.LJIIJ(uuid, "uuid");
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        o.LJFF(tracks, "workingModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack track = it.next();
            o.LJFF(track, "track");
            Iterator<NLETrackSlot> it2 = track.LJIILL().iterator();
            while (it2.hasNext()) {
                NLETrackSlot slot = it2.next();
                o.LJFF(slot, "slot");
                if (o.LJ(slot.getUUID(), uuid)) {
                    return slot;
                }
            }
        }
        return null;
    }

    public static final OSZ LJIILIIL(NLEModel nLEModel, String str) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        o.LJFF(tracks, "workingModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack track = it.next();
            o.LJFF(track, "track");
            Iterator<NLETrackSlot> it2 = track.LJIILL().iterator();
            while (it2.hasNext()) {
                NLETrackSlot slot = it2.next();
                o.LJFF(slot, "slot");
                if (o.LJ(slot.getUUID(), str)) {
                    return new OSZ(track, slot);
                }
            }
        }
        return null;
    }

    public static final double LJIJJ(List list, Number specifiedValue) {
        o.LJIIIZ(specifiedValue, "specifiedValue");
        if (list.isEmpty()) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (number instanceof Float) {
                o.LJII(number, "null cannot be cast to non-null type kotlin.Float");
                if (((Float) number).floatValue() < ((Float) specifiedValue).floatValue()) {
                    i++;
                }
            } else if (number instanceof Double) {
                o.LJII(number, "null cannot be cast to non-null type kotlin.Double");
                if (((Double) number).doubleValue() < ((Double) specifiedValue).doubleValue()) {
                    i++;
                }
            } else if (number instanceof Integer) {
                o.LJII(number, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) number).intValue() < ((Integer) specifiedValue).intValue()) {
                    i++;
                }
            } else if (number instanceof Long) {
                o.LJII(number, "null cannot be cast to non-null type kotlin.Long");
                if (((Long) number).longValue() < ((Long) specifiedValue).longValue()) {
                    i++;
                }
            }
        }
        return i / list.size();
    }

    public static final boolean LJJ(Aweme aweme, Aweme aweme2) {
        String batchId;
        if (aweme == null || !LJJIII(aweme) || !LJJIII(aweme2)) {
            return false;
        }
        String str = null;
        if (aweme2 == null || (batchId = aweme2.getBatchId()) == null || batchId.length() == 0) {
            return false;
        }
        String batchId2 = aweme.getBatchId();
        if (aweme2 != null) {
            str = aweme2.getBatchId();
        }
        if (!o.LJ(batchId2, str)) {
            return false;
        }
        return true;
    }

    public static final void LJJI(C82127WLb shakeFreeManager, boolean z) {
        boolean z2;
        o.LJIIIZ(shakeFreeManager, "shakeFreeManager");
        C82891Wg3.LIZLLL().d("CameraAntiShakeV1 -> initShakeFreeMode");
        boolean z3 = false;
        if (shakeFreeManager.LIZIZ() && Build.VERSION.SDK_INT >= 23) {
            boolean LIZ = C82127WLb.LIZ(shakeFreeManager.LIZIZ);
            C82127WLb.LJ = LIZ;
            C82127WLb.LJFF = LIZ;
            InterfaceC83863Wvj interfaceC83863Wvj = shakeFreeManager.LIZJ;
            if (LIZ && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            interfaceC83863Wvj.LJIIZILJ(z2);
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("CameraAntiShakeV1 -> initShakeFreeMode: currentMode = ");
            LIZ2.append(LIZ);
            LIZ2.append("; isBackCamera = ");
            LIZ2.append(z);
            LIZLLL.d(X1D.LIZIZ(LIZ2));
            C5NP LIZLLL2 = C82891Wg3.LIZLLL();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("CameraAntiShakeV1 -> initShakeFreeMode: setEnableAntiShake(");
            if (LIZ && z) {
                z3 = true;
            }
            LIZ3.append(z3);
            LIZ3.append(")");
            LIZLLL2.d(X1D.LIZIZ(LIZ3));
            return;
        }
        C82087WJn.LIZ(shakeFreeManager.LIZIZ).LIZ(2);
        C82127WLb.LJ = false;
        C82127WLb.LJFF = false;
    }

    public static final OF1 LJJIFFI(InterfaceC41034G8o interfaceC41034G8o, InterfaceC88472Yns getter) {
        o.LJIIIZ(interfaceC41034G8o, "<this>");
        o.LJIIIZ(getter, "getter");
        return new OF1(getter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        BaseResponse linkMicResponseResume = (BaseResponse) obj;
        CreateChannelResult createChannelResult = (CreateChannelResult) obj2;
        o.LJIIIZ(linkMicResponseResume, "linkMicResponseResume");
        o.LJIIIZ(createChannelResult, "createChannelResult");
        createChannelResult.resumeResp = (ResumeResp) linkMicResponseResume.data;
        return createChannelResult;
    }

    public static ColorStateList LJIILLIIL(Context context, TypedArray typedArray, int i) {
        if (typedArray == null || !typedArray.hasValue(i)) {
            return null;
        }
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            if (context == null) {
                return null;
            }
            return C04330Ez.LIZJ(resourceId, context);
        }
        return typedArray.getColorStateList(i);
    }

    public static void LJJIJIIJIL(DataChannel dataChannel, int i, ImageModel imageModel) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('%');
        String boldStr = C15380j0.LJIILL(R.string.mv2, X1D.LIZIZ(LIZ));
        String totalStr = C15380j0.LJIILL(R.string.mv0, boldStr);
        if (i == 80) {
            str = "live_goal_80%";
        } else {
            str = "live_goal_50%";
        }
        if (dataChannel != null) {
            o.LJIIIIZZ(totalStr, "totalStr");
            o.LJIIIIZZ(boldStr, "boldStr");
            dataChannel.rv0(TipMessageChannel.class, new CWR(C0E7.LIZ(totalStr, boldStr), true, EnumC264412a.LIVE_TIP_GAMING_LIVE_GOAL.ordinal(), null, new C31977Cgn(str, imageModel, null, 4), 8));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r9.getKey(), "search_result_id") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016a, code lost:
    
        if (r1 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0174, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.toString()) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
    
        r17.put(r9.getKey(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017d, code lost:
    
        if (r0 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017f, code lost:
    
        r0.put((java.lang.String) r9.getKey(), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0189, code lost:
    
        r17.put(r9.getKey(), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (r0 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0192, code lost:
    
        r0.put((java.lang.String) r9.getKey(), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c6, code lost:
    
        r5 = r21.getTrackParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ca, code lost:
    
        if (r5 == 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cc, code lost:
    
        r5.put(r9.getKey(), r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(java.util.Map r17, boolean r18, X.C27943Axv r19, boolean r20, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r21) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DF.LIZJ(java.util.Map, boolean, X.Axv, boolean, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam):void");
    }
}
