package X;

import Y.IDComparatorS32S0000000_4;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.play.core.assetpacks.q0;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTABaseComponent;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.UgcTemplateSlot;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.1JD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JD implements InterfaceC48038ItG, InterfaceC153055zZ, HBL, RTU {
    public static final C1JD LJLIL = new C1JD();
    public static final C1JD LJLILLLLZI = new C1JD();

    public static final boolean LIZLLL() {
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_VOLUME_ADJUST_OPTIMIZATION, Boolean.FALSE)).booleanValue() && ((Number) C5BA.LIZ(EnumC127484zQ.VOLUME_DB_RANGE, Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX))).doubleValue() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return true;
        }
        return false;
    }

    public static final void LJIIZILJ() {
        String str;
        String str2;
        C75832TpU c75832TpU = C75832TpU.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        C75832TpU.LJFF(c75832TpU, linkedHashMap, false, false, 6);
        C75832TpU.LJIILIIL(linkedHashMap);
        C75832TpU.LJI(linkedHashMap, false);
        linkedHashMap.put("pk_inviter_id", String.valueOf(C75832TpU.LJIILLIIL()));
        if (LJJIJIL()) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put("user_type", str);
        C76280Twi c76280Twi = C76265TwT.LIZ;
        linkedHashMap.put("pk_id", String.valueOf(c76280Twi.LIZIZ()));
        linkedHashMap.put("channel_id", String.valueOf(c76280Twi.LIZJ()));
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ == null || (str2 = Long.valueOf(((C29374Bfu) LIZIZ).getCurrentUserId()).toString()) == null) {
            str2 = "";
        }
        linkedHashMap.put("user_id", str2);
        if (C76265TwT.LJIILJJIL == EnumC76330TxW.MATCH_TYPE_2V2) {
            z = true;
        }
        if (z) {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_match_item_guide_click", linkedHashMap, "1");
        } else {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_match_item_guide_click", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
    }

    public static final void LJIJ() {
        String str;
        String str2;
        C75832TpU c75832TpU = C75832TpU.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        C75832TpU.LJFF(c75832TpU, linkedHashMap, false, false, 6);
        C75832TpU.LJIILIIL(linkedHashMap);
        C75832TpU.LJI(linkedHashMap, false);
        linkedHashMap.put("pk_inviter_id", String.valueOf(C75832TpU.LJIILLIIL()));
        if (LJJIJIL()) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put("user_type", str);
        C76280Twi c76280Twi = C76265TwT.LIZ;
        linkedHashMap.put("pk_id", String.valueOf(c76280Twi.LIZIZ()));
        linkedHashMap.put("channel_id", String.valueOf(c76280Twi.LIZJ()));
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ == null || (str2 = Long.valueOf(((C29374Bfu) LIZIZ).getCurrentUserId()).toString()) == null) {
            str2 = "";
        }
        linkedHashMap.put("user_id", str2);
        if (C76265TwT.LJIILJJIL == EnumC76330TxW.MATCH_TYPE_2V2) {
            z = true;
        }
        if (z) {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_match_item_guide_show", linkedHashMap, "1");
        } else {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_match_item_guide_show", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
    }

    public static final boolean LJJIJIL() {
        User owner;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (owner = room.getOwner()) != null && ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == owner.getId()) {
            return true;
        }
        return false;
    }

    @Override // X.HBL
    public boolean LIZIZ() {
        if (Q7K.LIZIZ("beauty_model", 0) <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC153055zZ
    public Object a() {
        return new q0();
    }

    public static final InterfaceC74210TAo LJFF(MBA mba) {
        InterfaceC74210TAo interfaceC74210TAo;
        MBD mbd = mba.get(C3CQ.LJJIJLIJ);
        if (!(mbd instanceof InterfaceC74210TAo) || (interfaceC74210TAo = (InterfaceC74210TAo) mbd) == null) {
            return XIE.LIZ;
        }
        return interfaceC74210TAo;
    }

    public static final IFeedCleanAbility LJI(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        InterfaceC55235Lm3 LJFF = KR8.LJFF(fragment);
        if (LJFF == null) {
            return null;
        }
        return (IFeedCleanAbility) C55096Ljo.LIZ(LJFF, IFeedCleanAbility.class, null);
    }

    public static final String LJII(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return String.valueOf(i);
                }
                return "magic_smokes";
            }
            return "boosting_gloves";
        }
        return "";
    }

    public static final boolean LJIIIZ(C0VD c0vd) {
        o.LJIIIZ(c0vd, "<this>");
        if (c0vd.LJFF != null || c0vd.LIZLLL != null || c0vd.LIZJ != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (previewInfo != null && previewInfo.getPreviewVideoLength() != 0) {
                if (previewInfo.getPreviewVideoLength() >= 61000) {
                    return true;
                }
            } else if (videoPublishEditModel != null && videoPublishEditModel.videoDurationFromVideoCutPage >= 61000) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIIL(AVMusic aVMusic) {
        if (aVMusic == null || aVMusic.isPgc() || aVMusic.isLocalMusic() || C5IF.LIZ()) {
            return false;
        }
        return true;
    }

    public static void LJIILIIL(String str) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("comment_not_show_message", str);
        FUA.LIZJ("comment_not_show", c198517qh.LJ());
    }

    public static void LJIJJ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NOTICE:");
        LIZ.append(str);
        LJIILIIL(X1D.LIZIZ(LIZ));
    }

    public static final MainBusinessAbility LJIJJLI(MainActivityScope mainActivityScope) {
        InterfaceC55235Lm3 interfaceC55235Lm3 = mainActivityScope.LJLIL;
        if (interfaceC55235Lm3 == null) {
            return null;
        }
        return (MainBusinessAbility) C55096Ljo.LIZ(interfaceC55235Lm3, MainBusinessAbility.class, null);
    }

    public static final MainBusinessAbility LJIL(InterfaceC55235Lm3 interfaceC55235Lm3) {
        o.LJIIIZ(interfaceC55235Lm3, "<this>");
        return (MainBusinessAbility) C55096Ljo.LIZ(interfaceC55235Lm3, MainBusinessAbility.class, null);
    }

    public static final void LJJIL(UrlModel urlModel) {
        List<String> urlList = urlModel.getUrlList();
        ArrayList arrayList = null;
        if (urlList != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(urlList, 10));
            for (String str : urlList) {
                if (str != null) {
                    if (ujb.o.LJJJLIIL(str, "http://", false)) {
                        str = ujb.o.LJJJJZI(str, "http://", "https://", false);
                    }
                } else {
                    str = null;
                }
                arrayList2.add(str);
            }
            arrayList = arrayList2;
        }
        urlModel.setUrlList(arrayList);
    }

    public static final void LJJIZ(MusicModel musicModel) {
        o.LJIIIZ(musicModel, "<this>");
        UrlModel url = musicModel.getUrl();
        UrlModel urlModel = null;
        if (url != null) {
            LJJIL(url);
        } else {
            url = null;
        }
        musicModel.setUrl(url);
        UrlModel strongBeatUrl = musicModel.getStrongBeatUrl();
        if (strongBeatUrl != null) {
            LJJIL(strongBeatUrl);
            urlModel = strongBeatUrl;
        }
        musicModel.setStrongBeatUrl(urlModel);
    }

    public static final JSONArray LJJJ(InterfaceC78502UrS interfaceC78502UrS) {
        JSONArray jSONArray = new JSONArray();
        int size = interfaceC78502UrS.size();
        for (int i = 0; i < size; i++) {
            switch (C78506UrW.LIZIZ[interfaceC78502UrS.getType(i).ordinal()]) {
                case 1:
                    jSONArray.put(interfaceC78502UrS.getString(i));
                    break;
                case 2:
                    jSONArray.put(interfaceC78502UrS.getDouble(i));
                    break;
                case 3:
                    jSONArray.put(interfaceC78502UrS.getBoolean(i));
                    break;
                case 4:
                    jSONArray.put(interfaceC78502UrS.getInt(i));
                    break;
                case 5:
                    InterfaceC78280Uns map = interfaceC78502UrS.getMap(i);
                    if (map != null) {
                        jSONArray.put(LJJJI(map));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    InterfaceC78502UrS array = interfaceC78502UrS.getArray(i);
                    if (array != null) {
                        jSONArray.put(LJJJ(array));
                        break;
                    } else {
                        break;
                    }
            }
        }
        return jSONArray;
    }

    public static final JSONObject LJJJI(InterfaceC78280Uns toJSONObject) {
        o.LJIIJ(toJSONObject, "$this$toJSONObject");
        JSONObject jSONObject = new JSONObject();
        UFL LIZ = toJSONObject.LIZ();
        while (LIZ.hasNextKey()) {
            String nextKey = LIZ.nextKey();
            switch (C78506UrW.LIZ[toJSONObject.getType(nextKey).ordinal()]) {
                case 1:
                    jSONObject.putOpt(nextKey, toJSONObject.getString(nextKey));
                    break;
                case 2:
                    jSONObject.putOpt(nextKey, Double.valueOf(toJSONObject.getDouble(nextKey)));
                    break;
                case 3:
                    jSONObject.putOpt(nextKey, Boolean.valueOf(toJSONObject.getBoolean(nextKey)));
                    break;
                case 4:
                    jSONObject.putOpt(nextKey, Integer.valueOf(toJSONObject.getInt(nextKey)));
                    break;
                case 5:
                    InterfaceC78280Uns map = toJSONObject.getMap(nextKey);
                    if (map == null) {
                        break;
                    } else {
                        jSONObject.putOpt(nextKey, LJJJI(map));
                        break;
                    }
                case 6:
                    InterfaceC78502UrS array = toJSONObject.getArray(nextKey);
                    if (array == null) {
                        break;
                    } else {
                        jSONObject.putOpt(nextKey, LJJJ(array));
                        break;
                    }
            }
        }
        return jSONObject;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        C221018lt.LIZJ("TopDataSource", "refreshFollowReq error", it);
        return Boolean.FALSE;
    }

    public static final Object LIZJ(long j, InterfaceC67352kd interfaceC67352kd) {
        if (j <= 0) {
            return C76800UCe.LIZ;
        }
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        if (j < Long.MAX_VALUE) {
            LJFF(xks.getContext()).scheduleResumeAfterDelay(j, xks);
        }
        Object LJIIJJI = xks.LJIIJJI();
        if (LJIIJJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIIJJI;
        }
        return C76800UCe.LIZ;
    }

    public static final Integer LJIIIIZZ(HQU hqu, int i) {
        Object LJLLLL;
        o.LJIIIZ(hqu, "<this>");
        List<UgcTemplateSlot> list = null;
        if (((ArrayList) hqu.LJ).isEmpty()) {
            return null;
        }
        if (i >= 0 && i < ((ArrayList) hqu.LJ).size()) {
            Object obj = ListProtector.get(hqu.LJ, i);
            Iterator<List<UgcTemplateSlot>> it = hqu.LJI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List<UgcTemplateSlot> next = it.next();
                if (next.contains(obj)) {
                    list = next;
                    break;
                }
            }
            List<UgcTemplateSlot> list2 = list;
            if (list2 == null || (LJLLLL = ORZ.LJLLLL(list2)) == null) {
                return Integer.valueOf(i);
            }
            return Integer.valueOf(((ArrayList) hqu.LJ).indexOf(LJLLLL));
        }
        return hqu.LJIIIIZZ.getValue();
    }

    public static final void LJIIJ(ProfileCTABaseComponent profileCTABaseComponent, InterfaceC65784Pro interfaceC65784Pro) {
        C9I2 c9i2;
        o.LJIIIZ(profileCTABaseComponent, "<this>");
        interfaceC65784Pro.invoke();
        C8VV.LIZJ(profileCTABaseComponent, new AqS170S0100000_4(profileCTABaseComponent, 1350));
        ArrayList arrayList = (ArrayList) profileCTABaseComponent.LJLIL;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS32S0000000_4(9));
        }
        Iterator it = ((ArrayList) profileCTABaseComponent.LJLIL).iterator();
        while (it.hasNext()) {
            C9I0 c9i0 = (C9I0) ((LinkedHashMap) profileCTABaseComponent.LJLJJI).get(((C9I1) it.next()).LJLIL);
            if (c9i0 != null && (c9i2 = c9i0.LJII) != null) {
                LinearLayout linearLayout = profileCTABaseComponent.LJLL;
                if (linearLayout != null) {
                    linearLayout.addView(c9i2);
                } else {
                    o.LJIJI("ctaContainerView");
                    throw null;
                }
            }
        }
    }

    public static void LJJIJLIJ(String str, OSZ[] oszArr) {
        boolean z;
        JSONObject jSONObject;
        long currentTimeMillis = System.currentTimeMillis();
        if (oszArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        C78528Urs c78528Urs = null;
        if (z) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            for (OSZ osz : oszArr) {
                jSONObject.put((String) osz.getFirst(), osz.getSecond());
            }
        }
        if (jSONObject != null) {
            c78528Urs = new C78528Urs(jSONObject);
        }
        C01R.LIZIZ(currentTimeMillis, c78528Urs, str);
    }

    public static final void LJJJIL(EventBus eventBus, Object subscriber) {
        o.LJIIIZ(subscriber, "subscriber");
        if (eventBus != null && !eventBus.LJI(subscriber)) {
            eventBus.LJIILJJIL(subscriber);
        }
    }

    public static final void LJJJJ(EventBus eventBus, Object subscriber) {
        o.LJIIIZ(subscriber, "subscriber");
        if (eventBus != null && eventBus.LJI(subscriber)) {
            eventBus.LJIJ(subscriber);
        }
    }

    public static final Object LJJJJI(InterfaceC88472Yns interfaceC88472Yns, InterfaceC67352kd interfaceC67352kd) {
        MBA context = interfaceC67352kd.getContext();
        o.LJIIIZ(context, "<this>");
        InterfaceC44041o8 interfaceC44041o8 = (InterfaceC44041o8) context.get(InterfaceC44041o8.LJJLIL);
        if (interfaceC44041o8 != null) {
            return interfaceC44041o8.LJIIJ(interfaceC88472Yns, interfaceC67352kd);
        }
        "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString();
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        String t1 = (String) obj;
        String t2 = (String) obj2;
        o.LJIIIZ(t1, "t1");
        o.LJIIIZ(t2, "t2");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(t1);
        LIZ.append(t2);
        return X1D.LIZIZ(LIZ);
    }

    public static final C43916HLk LJ(TEZ tez, TID request, int i) {
        o.LJIIIZ(tez, "<this>");
        o.LJIIIZ(request, "request");
        TJV LIZ = tez.LJJJJLL().LIZ();
        boolean isEmpty = TextUtils.isEmpty(request.LIZIZ.getSearchType());
        String str = "1000001";
        if (!isEmpty) {
            return new C43916HLk("1000001", "Search", "sticker_category:search");
        }
        if (i >= 0 && i < C30581Hy.LJIILJJIL(LIZ).size()) {
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) ListProtector.get(C30581Hy.LJIILJJIL(LIZ), i);
            String key = effectCategoryModel.getKey();
            if (!o.LJ(key, "sticker_category:search")) {
                if (o.LJ(key, "sticker_category:favorite")) {
                    str = "1000000";
                } else {
                    str = effectCategoryModel.getId();
                }
            }
            return new C43916HLk(str, effectCategoryModel.getName(), effectCategoryModel.getKey());
        }
        return null;
    }

    public static final void LJIILL(int i, String str, ItemInfo4FE itemInfo4FE) {
        boolean z;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        C75832TpU c75832TpU = C75832TpU.LIZ;
        String str5 = C75832TpU.LJI;
        boolean z2 = true;
        if (str5 == null || ujb.o.LJJJJJL(str5)) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool2 = null;
        if (C29306Beo.LJIILLIIL(Boolean.valueOf(z))) {
            String str6 = C75832TpU.LJI;
            if (itemInfo4FE != null) {
                str4 = itemInfo4FE.itemId;
            } else {
                str4 = null;
            }
            if (o.LJ(str6, str4)) {
                return;
            }
        }
        if (itemInfo4FE != null) {
            str2 = itemInfo4FE.itemId;
        } else {
            str2 = null;
        }
        C75832TpU.LJI = str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C75832TpU.LJFF(c75832TpU, linkedHashMap, false, false, 6);
        C75832TpU.LJIILIIL(linkedHashMap);
        C75832TpU.LJI(linkedHashMap, false);
        linkedHashMap.put("pk_inviter_id", String.valueOf(C75832TpU.LJIILLIIL()));
        if (LJJIJIL()) {
            str3 = "anchor";
        } else {
            str3 = "user";
        }
        linkedHashMap.put("user_type", str3);
        linkedHashMap.put("match_item_type", LJII(i));
        C76280Twi c76280Twi = C76265TwT.LIZ;
        linkedHashMap.put("pk_id", String.valueOf(c76280Twi.LIZIZ()));
        linkedHashMap.put("channel_id", String.valueOf(c76280Twi.LIZJ()));
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("user_id", str);
        linkedHashMap.put("is_opposite", "1");
        if (itemInfo4FE != null) {
            bool = Boolean.valueOf(itemInfo4FE.isSelfRoom);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            if (itemInfo4FE != null) {
                bool2 = Boolean.valueOf(itemInfo4FE.isTeamMate);
            }
            C29306Beo.LJIILLIIL(bool2);
        }
        linkedHashMap.put("is_sender", CardStruct.IStatusCode.DEFAULT);
        if (C76265TwT.LJIILJJIL != EnumC76330TxW.MATCH_TYPE_2V2) {
            z2 = false;
        }
        if (z2) {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_match_item_effect_show", linkedHashMap, "1");
        } else {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_match_item_effect_show", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
    }

    public static final void LJIJI(int i, long j, long j2) {
        String str;
        String str2;
        C75832TpU c75832TpU = C75832TpU.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        C75832TpU.LJFF(c75832TpU, linkedHashMap, false, false, 6);
        C75832TpU.LJIILIIL(linkedHashMap);
        linkedHashMap.put("pk_inviter_id", String.valueOf(C75832TpU.LJIILLIIL()));
        if (LJJIJIL()) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put("user_type", str);
        linkedHashMap.put("match_item_type", LJII(i));
        linkedHashMap.put("show_type", "popup");
        linkedHashMap.put("pk_id", String.valueOf(j));
        linkedHashMap.put("channel_id", String.valueOf(j2));
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ == null || (str2 = Long.valueOf(((C29374Bfu) LIZIZ).getCurrentUserId()).toString()) == null) {
            str2 = "";
        }
        linkedHashMap.put("user_id", str2);
        if (C76265TwT.LJIILJJIL == EnumC76330TxW.MATCH_TYPE_2V2) {
            z = true;
        }
        if (z) {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_mvp_get_match_item_show", linkedHashMap, "1");
        } else {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_mvp_get_match_item_show", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
    }

    public static void LJJII(String str, String str2, String str3) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", str);
        c35936E8m.LIZLLL("page", str2);
        c35936E8m.LIZLLL("enter_method", str3);
        FMX.LJIIL("email_binding_show", c35936E8m.LIZ);
    }

    public static void LJJIJL(String str, JSONObject jSONObject, int i) {
        long j;
        C78528Urs c78528Urs = null;
        if ((i & 2) != 0) {
            jSONObject = null;
        }
        if ((i & 4) != 0) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        if (jSONObject != null) {
            c78528Urs = new C78528Urs(jSONObject);
        }
        C01R.LIZIZ(j, c78528Urs, str);
    }

    public static final void LIZ(ProfileCTABaseComponent profileCTABaseComponent, C9IF type, C65776Prg c65776Prg, EnumC234329Ho maxStyle) {
        o.LJIIIZ(profileCTABaseComponent, "<this>");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(maxStyle, "maxStyle");
        ((ArrayList) profileCTABaseComponent.LJLIL).add(new C9I1(maxStyle, type, c65776Prg));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILJJIL(int r9, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1JD.LJIILJJIL(int, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, boolean, boolean):void");
    }

    public static void LJJIFFI(String str, String str2, String str3, String str4) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", str);
        c35936E8m.LIZLLL("enter_method", str3);
        c35936E8m.LIZLLL("profile_bind_from", str2);
        c35936E8m.LIZLLL("bind_type", str4);
        c35936E8m.LIZLLL("params_for_special", "uc_login");
        FMX.LJIIL("uc_bind_click_exit", c35936E8m.LIZ);
    }

    public static void LJJIIJ(String str, String str2, String str3, String str4) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", str);
        c35936E8m.LIZLLL("bind_type", str2);
        c35936E8m.LIZLLL("profile_bind_from", str3);
        c35936E8m.LIZLLL("enter_method", str4);
        c35936E8m.LIZLLL("params_for_special", "uc_login");
        FMX.LJIIL("uc_bind_notify", c35936E8m.LIZ);
    }

    public static void LJJ(int i, String str, String str2, String str3, String str4) {
        int i2;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", str);
        c35936E8m.LIZLLL("enter_method", str2);
        c35936E8m.LIZLLL("platform", str3);
        c35936E8m.LIZLLL("profile_bind_from", str4);
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        c35936E8m.LIZ(i2, "status");
        FMX.LJIIL("bind_status", c35936E8m.LIZ);
    }

    public static void LJJI(String str, String str2, String str3, String str4, String str5) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", str2);
        c35936E8m.LIZLLL("enter_method", str3);
        c35936E8m.LIZLLL("page", str4);
        c35936E8m.LIZLLL("bind_status", str5);
        FMX.LJIIL(str, c35936E8m.LIZ);
    }

    public static void LJJIII(int i, int i2, String str, String str2, String str3) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", str3);
        c35936E8m.LIZLLL("enter_from", str);
        c35936E8m.LIZLLL("page", str2);
        c35936E8m.LIZ(i, "is_success");
        c35936E8m.LIZ(i2, "error_code");
        FMX.LJIIL("email_code_verification_result", c35936E8m.LIZ);
    }

    public static void LJJIIJZLJL(String str, String str2, String str3, String str4, String str5) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", str);
        c35936E8m.LIZLLL("bind_type", str2);
        c35936E8m.LIZLLL("profile_bind_from", str3);
        c35936E8m.LIZLLL("enter_method", str4);
        c35936E8m.LIZLLL("platform", str5);
        c35936E8m.LIZLLL("params_for_special", "uc_login");
        FMX.LJIIL("uc_bind_submit", c35936E8m.LIZ);
    }

    public static final void LJJIIZI(String str, String str2, String str3, int i, java.util.Map map) {
        map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        map.put("session_id", str);
        map.put("manager_id", str2);
        map.put("type", str3);
        C0K2.LJII(i, O5Y.LJJL("ttlive_speed_detection_full_chain_service"), map);
    }

    public static final void LJJIJ(int i, String sessionId, String managerId, String errorMsg, String str) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(managerId, "managerId");
        o.LJIIIZ(errorMsg, "errorMsg");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("detect_failure_code", Integer.valueOf(i));
        linkedHashMap.put("detect_failure_msg", errorMsg);
        LJJIIZI(sessionId, managerId, str, 1, linkedHashMap);
    }

    public static final void LJJIJIIJI(int i, String sessionId, String managerId, String message, String str) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(managerId, "managerId");
        o.LJIIIZ(message, "message");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("interrupt_code", Integer.valueOf(i));
        linkedHashMap.put("interrupt_msg", message);
        LJJIIZI(sessionId, managerId, str, -1, linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILLIIL(int r8, java.lang.String r9, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r10, boolean r11, java.lang.String r12, int r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1JD.LJIILLIIL(int, java.lang.String, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, boolean, java.lang.String, int):void");
    }

    public static final void LJJIJIIJIL(long j, long j2, String sessionId, String managerId, String str, String str2, boolean z) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(managerId, "managerId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("upload_speed", Long.valueOf(j));
        linkedHashMap.put("download_speed", Long.valueOf(j2));
        linkedHashMap.put("suggest_sdk_key", str);
        linkedHashMap.put("detect_result_network_good", Boolean.valueOf(z));
        LJJIIZI(sessionId, managerId, str2, 0, linkedHashMap);
    }

    public static void LJJIIZ(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", str);
        c35936E8m.LIZLLL("bind_type", str2);
        if (i == 0) {
            str8 = "success";
        } else {
            str8 = "fail";
        }
        c35936E8m.LIZLLL("status", str8);
        c35936E8m.LIZ(i, "error_code");
        c35936E8m.LIZLLL("fail_info", str3);
        c35936E8m.LIZLLL("profile_bind_from", str5);
        c35936E8m.LIZLLL("enter_method", str6);
        c35936E8m.LIZLLL("platform", str7);
        c35936E8m.LIZLLL("params_for_special", "uc_login");
        if (str4 != null) {
            try {
                c35936E8m.LIZ(C66513Q8n.LIZJ().LJIIL(str4, null).getCountryCode(), "phone_country");
            } catch (C63860P4m e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        FMX.LJIIL("uc_bind_result", c35936E8m.LIZ);
    }
}
