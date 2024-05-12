package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.bytedance.android.live.browser.IHybridPropsService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotionItem;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.Card;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.CommonBlock;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.UgcTemplateSlot;
import com.ss.bduploader.BDVideoInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.1JI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JI implements InterfaceC15710jX, R6I {
    public static String LJIJI(int i) {
        if (i == 449) {
            return "Retry With";
        }
        if (i == 451) {
            return "Unavailable For Legal Reasons";
        }
        if (i == 600) {
            return "Unparseable Response Headers";
        }
        if (i == 509) {
            return "Bandwidth Limit Exceeded";
        }
        if (i == 510) {
            return "Not Extended";
        }
        switch (i) {
            case 100:
                return "Continue";
            case 101:
                return "Switching Protocols";
            case 102:
                return "Processing";
            default:
                switch (i) {
                    case 200:
                        return "OK";
                    case 201:
                        return "Created";
                    case 202:
                        return "Accepted";
                    case 203:
                        return "Non-Authoritative Information";
                    case 204:
                        return "No Content";
                    case 205:
                        return "Reset Content";
                    case 206:
                        return "Partial Content";
                    case 207:
                        return "Multi-Status";
                    default:
                        switch (i) {
                            case 300:
                                return "Multiple Choices";
                            case 301:
                                return "Moved Permanently";
                            case 302:
                                return "Move Temporarily";
                            case 303:
                                return "See Other";
                            case 304:
                                return "Not Modified";
                            case 305:
                                return "Use Proxy";
                            case 306:
                                return "Switch Proxy";
                            case 307:
                                return "Temporary Redirect";
                            default:
                                switch (i) {
                                    case LiveChatShowDelayForHotLiveSetting.DEFAULT /* 400 */:
                                        return "Bad Request";
                                    case 401:
                                        return "Unauthorized";
                                    case 402:
                                        return "Payment Required";
                                    case 403:
                                        return "Forbidden";
                                    case 404:
                                        return "Not Found";
                                    case 405:
                                        return "Method Not Allowed";
                                    case 406:
                                        return "Not Acceptable";
                                    case 407:
                                        return "Proxy Authentication Required";
                                    case 408:
                                        return "Request Timeout";
                                    case 409:
                                        return "Conflict";
                                    case 410:
                                        return "Gone";
                                    case 411:
                                        return "Length Required";
                                    case 412:
                                        return "Precondition Failed";
                                    case 413:
                                        return "Request Entity Too Large";
                                    case 414:
                                        return "Request-URI Too Long";
                                    case 415:
                                        return "Unsupported Media Type";
                                    case 416:
                                        return "Requested Range Not Satisfiable";
                                    case 417:
                                        return "Expectation Failed";
                                    case 418:
                                        return "I'm a teapot";
                                    default:
                                        switch (i) {
                                            case 421:
                                                return "Too Many Connections";
                                            case 422:
                                                return "Unprocessable Entity";
                                            case 423:
                                                return "Locked";
                                            case 424:
                                                return "Failed Dependency";
                                            case 425:
                                                return "Unordered Collection";
                                            case 426:
                                                return "Upgrade Required";
                                            default:
                                                switch (i) {
                                                    case LiveMaxRetainAlogMessageSizeSetting.DEFAULT /* 500 */:
                                                        return "Internal Server Error";
                                                    case 501:
                                                        return "Not Implemented";
                                                    case 502:
                                                        return "Bad Gateway";
                                                    case 503:
                                                        return "Service Unavailable";
                                                    case 504:
                                                        return "Gateway Timeout";
                                                    case 505:
                                                        return "HTTP Version Not Supported";
                                                    case 506:
                                                        return "Variant Also Negotiates";
                                                    case 507:
                                                        return "Insufficient Storage";
                                                    default:
                                                        return "";
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static final C1QX LIZ() {
        return new C1QX(0);
    }

    public static final boolean LJJI() {
        if (C00F.LIZ(31744, 1, "studio_creation_ugc_template_preview_style", true) == 2) {
            return true;
        }
        return false;
    }

    public static void LJII() {
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
        } else {
            throw new IllegalStateException("This method must call on main thread");
        }
    }

    public static final C43340Gzg LJFF(BDVideoInfo bDVideoInfo) {
        if (bDVideoInfo == null) {
            return null;
        }
        return new C43340Gzg(bDVideoInfo.mVideoId, bDVideoInfo.mCoverUri, bDVideoInfo.mTosKey, bDVideoInfo.mLog, bDVideoInfo.mProgress, bDVideoInfo.mErrorCode, bDVideoInfo.mErrorMsg, bDVideoInfo.mVideoMediaInfo, bDVideoInfo.mEncryptionMeta);
    }

    public static final int LJIILIIL(View view) {
        o.LJIIIZ(view, "view");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return view.getHeight() + iArr[1];
    }

    public static final RectF LJIIZILJ(View view) {
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new RectF(iArr[0], iArr[1], view.getWidth() + r2, view.getHeight() + iArr[1]);
        }
        return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public static final boolean LJIJJLI(C1DO c1do) {
        o.LJIIIZ(c1do, "<this>");
        return c1do.LJIIIIZZ().LJLJL;
    }

    public static final boolean LJIL(C67P c67p) {
        String str;
        o.LJIIIZ(c67p, "<this>");
        TextStickerData data = c67p.getData();
        if (data != null) {
            str = data.getType();
        } else {
            str = null;
        }
        return o.LJ(str, "type_inline_caption");
    }

    public static final boolean LJJ(int i) {
        if (i == EnumC56485MEv.UNINITIALIZED.getValue() || i == EnumC56485MEv.DISABLE_SCROLL.getValue()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIFFI(C67P c67p) {
        String str;
        o.LJIIIZ(c67p, "<this>");
        TextStickerData data = c67p.getData();
        if (data != null) {
            str = data.getType();
        } else {
            str = null;
        }
        return o.LJ(str, "type_text_sticker");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1v5] */
    public static final C48351v5 LJJII(InterfaceC88472Yns init) {
        o.LJIIIZ(init, "init");
        final C0Q4 c0q4 = new C0Q4();
        init.invoke(c0q4);
        return new InterfaceC41451jx<T>(c0q4) { // from class: X.1v5
            public final C0Q4<T> LIZ;

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            {
                this.LIZ = c0q4;
            }

            @Override // X.InterfaceC41451jx, X.C0Q2
            /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
            public final <V extends C0Q9> C41401js<V> LIZ(C0QC<T, V> converter) {
                o.LJIIIZ(converter, "converter");
                java.util.Map<Integer, C0Q3<T>> map = this.LIZ.LIZIZ;
                final LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(map.size()));
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    Object key = entry.getKey();
                    C0Q3 c0q3 = (C0Q3) entry.getValue();
                    InterfaceC88472Yns<T, V> convertToVector = converter.LIZ();
                    c0q3.getClass();
                    o.LJIIIZ(convertToVector, "convertToVector");
                    linkedHashMap.put(key, new OSZ(convertToVector.invoke(c0q3.LIZ), c0q3.LIZIZ));
                }
                final int i = this.LIZ.LIZ;
                return (C41401js<V>) new C1J0<V>(i, linkedHashMap) { // from class: X.1js
                    public final java.util.Map<Integer, OSZ<V, InterfaceC07020Pi>> LJLIL;
                    public final int LJLILLLLZI;
                    public final int LJLJI = 0;
                    public V LJLJJI;
                    public V LJLJJL;

                    @Override // X.C0QF
                    public final boolean LIZ() {
                        return false;
                    }

                    @Override // X.C1J0
                    public final int LJFF() {
                        return this.LJLJI;
                    }

                    @Override // X.C1J0
                    public final int LJI() {
                        return this.LJLILLLLZI;
                    }

                    {
                        this.LJLIL = linkedHashMap;
                        this.LJLILLLLZI = i;
                    }

                    @Override // X.C0QF
                    public final V LIZJ(V v, V v2, V v3) {
                        return (V) C07030Pj.LIZIZ(this, v, v2, v3);
                    }

                    @Override // X.C0QF
                    public final long LJII(V v, V v2, V v3) {
                        return C07030Pj.LIZ(this, v, v2, v3);
                    }

                    @Override // X.C0QF
                    public final V LIZIZ(long j, V initialValue, V targetValue, V initialVelocity) {
                        o.LJIIIZ(initialValue, "initialValue");
                        o.LJIIIZ(targetValue, "targetValue");
                        o.LJIIIZ(initialVelocity, "initialVelocity");
                        long LJIILIIL = C78842Uww.LJIILIIL((j / 1000000) - LJFF(), 0L, LJI());
                        if (LJIILIIL <= 0) {
                            return initialVelocity;
                        }
                        C0Q9 LJJIJL = C79146V4k.LJJIJL(this, LJIILIIL - 1, initialValue, targetValue, initialVelocity);
                        C0Q9 LJJIJL2 = C79146V4k.LJJIJL(this, LJIILIIL, initialValue, targetValue, initialVelocity);
                        if (this.LJLJJI == null) {
                            this.LJLJJI = (V) initialValue.LIZJ();
                            this.LJLJJL = (V) initialValue.LIZJ();
                        }
                        int LIZIZ = LJJIJL.LIZIZ();
                        int i2 = 0;
                        while (i2 < LIZIZ) {
                            int i3 = i2 + 1;
                            V v = this.LJLJJL;
                            if (v != null) {
                                v.LJ((LJJIJL.LIZ(i2) - LJJIJL2.LIZ(i2)) * 1000.0f, i2);
                                i2 = i3;
                            } else {
                                o.LJIJI("velocityVector");
                                throw null;
                            }
                        }
                        V v2 = this.LJLJJL;
                        if (v2 != null) {
                            return v2;
                        }
                        o.LJIJI("velocityVector");
                        throw null;
                    }

                    @Override // X.C0QF
                    public final V LIZLLL(long j, V initialValue, V targetValue, V initialVelocity) {
                        o.LJIIIZ(initialValue, "initialValue");
                        o.LJIIIZ(targetValue, "targetValue");
                        o.LJIIIZ(initialVelocity, "initialVelocity");
                        int LJIILIIL = (int) C78842Uww.LJIILIIL((j / 1000000) - LJFF(), 0L, LJI());
                        if (this.LJLIL.containsKey(Integer.valueOf(LJIILIIL))) {
                            return (V) ((OSZ) C113554cx.LJJJLL(Integer.valueOf(LJIILIIL), this.LJLIL)).getFirst();
                        }
                        int i2 = this.LJLILLLLZI;
                        if (LJIILIIL >= i2) {
                            return targetValue;
                        }
                        if (LJIILIIL <= 0) {
                            return initialValue;
                        }
                        InterfaceC07020Pi interfaceC07020Pi = C1J1.LIZ;
                        int i3 = 0;
                        V v = initialValue;
                        int i4 = 0;
                        for (Map.Entry<Integer, OSZ<V, InterfaceC07020Pi>> entry2 : this.LJLIL.entrySet()) {
                            int intValue = entry2.getKey().intValue();
                            OSZ<V, InterfaceC07020Pi> value = entry2.getValue();
                            if (LJIILIIL > intValue && intValue >= i4) {
                                v = value.getFirst();
                                interfaceC07020Pi = value.getSecond();
                                i4 = intValue;
                            } else if (LJIILIIL < intValue && intValue <= i2) {
                                targetValue = value.getFirst();
                                i2 = intValue;
                            }
                        }
                        float LIZ = interfaceC07020Pi.LIZ((LJIILIIL - i4) / (i2 - i4));
                        if (this.LJLJJI == null) {
                            this.LJLJJI = (V) initialValue.LIZJ();
                            this.LJLJJL = (V) initialValue.LIZJ();
                        }
                        int LIZIZ = v.LIZIZ();
                        while (i3 < LIZIZ) {
                            int i5 = i3 + 1;
                            V v2 = this.LJLJJI;
                            if (v2 != null) {
                                v2.LJ((targetValue.LIZ(i3) * LIZ) + ((1 - LIZ) * v.LIZ(i3)), i3);
                                i3 = i5;
                            } else {
                                o.LJIJI("valueVector");
                                throw null;
                            }
                        }
                        V v3 = this.LJLJJI;
                        if (v3 != null) {
                            return v3;
                        }
                        o.LJIJI("valueVector");
                        throw null;
                    }
                };
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof C48351v5) && o.LJ(this.LIZ, ((C48351v5) obj).LIZ)) {
                    return true;
                }
                return false;
            }
        };
    }

    public static final C196477nP LJJIII(C8W0 c8w0) {
        o.LJIIIZ(c8w0, "<this>");
        return new C196477nP(new AqS153S0100000_3(c8w0, 1591));
    }

    public static final void LJJIIJZLJL(String str) {
        long j;
        C29702BlC LIZ = C18230nb.LIZ("ttlive_broadcast_action_all");
        LIZ.LJII("action", str);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            j = ((C29374Bfu) LIZIZ).getCurrentUserId();
        } else {
            j = 0;
        }
        LIZ.LJI(Long.valueOf(j), "user_id");
        LIZ.LJIIIZ();
    }

    public static final void LJJIJIL(SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "<this>");
        for (Map.Entry<String, String> entry : ((IHybridPropsService) CN1.LIZ(IHybridPropsService.class)).Sd0().entrySet()) {
            sparkContext.LJJIIJ(entry.getKey(), entry.getValue());
        }
    }

    @Override // X.InterfaceC15710jX
    public void onFinish(boolean z) {
        if (!z) {
            CL6.LIZIZ("match_in_progress");
        }
        C75622Tm6.LJIJI(EnumC76429Tz7.START_ANIMATION, z, null);
    }

    public static final AbstractC32698CsQ LIZJ(long j, LinkedList linkedList) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5 = null;
        if (C32696CsO.LIZ) {
            C32774Cte c32774Cte = new C32774Cte(new C32775Ctf(0));
            linkedList.addFirst(c32774Cte);
            BZI LIZ = C28787BRn.LIZ("gift_panel_education_entrance_show");
            GuideInfoResponse.UserStats userStats = C32696CsO.LJ;
            if (userStats != null) {
                l = Long.valueOf(userStats.giftPanelShowCnt);
            } else {
                l = null;
            }
            LIZ.LJIJJ(l, "gift_panel_show_cnt");
            GuideInfoResponse.UserStats userStats2 = C32696CsO.LJ;
            if (userStats2 != null) {
                l2 = Long.valueOf(userStats2.shortcutGiftClickCnt);
            } else {
                l2 = null;
            }
            LIZ.LJIJJ(l2, "convenient_gift_click_cnt");
            GuideInfoResponse.UserStats userStats3 = C32696CsO.LJ;
            if (userStats3 != null) {
                l3 = Long.valueOf(userStats3.giftGuidePopupShowCnt);
            } else {
                l3 = null;
            }
            LIZ.LJIJJ(l3, "gift_guide_popup_show_cnt");
            GuideInfoResponse.UserStats userStats4 = C32696CsO.LJ;
            if (userStats4 != null) {
                l4 = Long.valueOf(userStats4.likeCnt);
            } else {
                l4 = null;
            }
            LIZ.LJIJJ(l4, "like_cnt");
            GuideInfoResponse.UserStats userStats5 = C32696CsO.LJ;
            if (userStats5 != null) {
                l5 = Long.valueOf(userStats5.watchDuration);
            }
            LIZ.LJIJJ(l5, "watch_duration");
            LIZ.LJJIIJZLJL();
            C32696CsO.LIZIZ(j, 5);
            return c32774Cte;
        }
        if (!C32696CsO.LIZIZ) {
            return null;
        }
        C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
        if (c32313CmD.LJIIIZ()) {
            Gift LJI = c32313CmD.LJI();
            if (LJI == null) {
                return null;
            }
            C32742Ct8 c32742Ct8 = new C32742Ct8(LJI, false);
            linkedList.addFirst(c32742Ct8);
            return c32742Ct8;
        }
        Gift fastGift = GiftManager.inst().getFastGift(j);
        if (fastGift == null) {
            return null;
        }
        C32742Ct8 c32742Ct82 = new C32742Ct8(fastGift, true);
        linkedList.addFirst(c32742Ct82);
        return c32742Ct82;
    }

    public static final void LJ(LaneParams laneParams, List list) {
        java.util.Set<String> keySet;
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HashMap<String, Object> LJII = C27739Aud.LJII(((SellerPromotionItem) it.next()).daInfo);
                if (LJII != null && (keySet = LJII.keySet()) != null) {
                    for (String key : keySet) {
                        Object obj = LJII.get(key);
                        if (obj != null) {
                            Object obj2 = hashMap.get(key);
                            if (obj2 == null) {
                                o.LJIIIIZZ(key, "key");
                                hashMap.put(key, obj);
                            } else {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(obj2);
                                LIZ.append(',');
                                LIZ.append(obj);
                                String LIZIZ = X1D.LIZIZ(LIZ);
                                o.LJIIIIZZ(key, "key");
                                hashMap.put(key, LIZIZ);
                            }
                        }
                    }
                }
            }
        }
        laneParams.withNotCheckParams(hashMap);
    }

    public static final int LJI(String channelKey, List list) {
        o.LJIIIZ(list, "<this>");
        o.LJIIIZ(channelKey, "channelKey");
        for (Object obj : list) {
            if (o.LJ(obj, channelKey)) {
                return list.indexOf(obj);
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIIZZ(InterfaceC60761Nsz interfaceC60761Nsz, Context context) {
        if (interfaceC60761Nsz != 0) {
            boolean z = interfaceC60761Nsz.LIZJ() instanceof WebView;
            if (z) {
                ((WebView) interfaceC60761Nsz).stopLoading();
            }
            if (context != null && (interfaceC60761Nsz instanceof View)) {
                Context context2 = ((View) interfaceC60761Nsz).getContext();
                if (context2 instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context2).setBaseContext(context);
                }
            }
            if (z) {
                C16880lQ.LLZZ((WebView) interfaceC60761Nsz, "about:blank");
            }
            interfaceC60761Nsz.LJI(true);
        }
    }

    public static final void LJIIIZ(java.util.Map map, JSONObject jSONObject) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), ((Boolean) ((InterfaceC65784Pro) entry.getValue()).invoke()).booleanValue() ? 1 : 0);
            }
        }
    }

    public static final Card LJIIJ(CommonBlock commonBlock, int i) {
        List<Card> cardList = commonBlock.getCardList();
        Card card = null;
        if (cardList == null) {
            return null;
        }
        Iterator<Card> it = cardList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Card next = it.next();
            if (next.getType() == i) {
                card = next;
                break;
            }
        }
        return card;
    }

    public static final List LJIILJJIL(int i, List list) {
        o.LJIIIZ(list, "<this>");
        if (list.size() >= 100) {
            C62397OeH.LIZJ().LIZLLL = Integer.valueOf(((C62707OjH) C64504PTg.LIZIZ(list, -1, list)).LIZ);
        }
        if (list.size() > i && i <= 100) {
            return list.subList(0, i);
        }
        return list;
    }

    public static final int LJIILL(int i, C25600zU c25600zU) {
        Integer LJI;
        Integer LJI2 = C79045V0n.LJI(i, c25600zU);
        if (LJI2 != null) {
            return LJI2.intValue();
        }
        InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
        if (interfaceC62484Ofg != null) {
            interfaceC62484Ofg.LJII();
            Integer valueOf = Integer.valueOf(R.style.ul);
            if (valueOf != null && (LJI = C79045V0n.LJI(i, new C25600zU(c25600zU, valueOf.intValue()))) != null) {
                return LJI.intValue();
            }
        }
        return -1;
    }

    public static final android.net.Uri LJJIIJ(android.net.Uri uri, String str) {
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        o.LJFF(queryParameterNames, "this.queryParameterNames");
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        o.LJFF(clearQuery, "this.buildUpon().clearQuery()");
        for (String str2 : queryParameterNames) {
            if (!o.LJ(str2, str)) {
                clearQuery.appendQueryParameter(str2, UriProtector.getQueryParameter(uri, str2));
            }
        }
        android.net.Uri build = clearQuery.build();
        o.LJFF(build, "newUri.build()");
        return build;
    }

    public static final void LJJIJ(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public static final void LIZIZ(ConcurrentHashMap concurrentHashMap, Object obj, List list) {
        if (obj != null) {
            List list2 = (List) concurrentHashMap.get(obj);
            if (list2 != null) {
                list2.addAll(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            concurrentHashMap.put(obj, arrayList);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void LIZLLL(ConcurrentHashMap concurrentHashMap, Object obj, F9E f9e) {
        if (obj != null) {
            List list = (List) concurrentHashMap.get(obj);
            if (list != null) {
                list.add(f9e);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(f9e);
            concurrentHashMap.put(obj, arrayList);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final java.util.Map LJIIJJI(int i, List list, List typeList) {
        o.LJIIIZ(list, "<this>");
        o.LJIIIZ(typeList, "typeList");
        HashMap hashMap = new HashMap();
        Iterator it = typeList.iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), 0);
        }
        List<C62707OjH> LJIILJJIL = LJIILJJIL(i, list);
        for (C62707OjH c62707OjH : LJIILJJIL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("record: ");
            LIZ.append(c62707OjH.LIZJ);
            C43252GyG.LIZ("RecentTimeMap", X1D.LIZIZ(LIZ));
            int size = LJIILJJIL.size() - LJIILJJIL.indexOf(c62707OjH);
            Integer num = (Integer) hashMap.get(c62707OjH.LIZJ);
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < size) {
                String str = c62707OjH.LIZJ;
                o.LJIIIIZZ(str, "record.channel");
                hashMap.put(str, Integer.valueOf(size));
            }
        }
        return hashMap;
    }

    public static final java.util.Map LJIIL(List list, ArrayList typeList, int i) {
        o.LJIIIZ(list, "<this>");
        o.LJIIIZ(typeList, "typeList");
        HashMap hashMap = new HashMap();
        Iterator it = typeList.iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), 0);
        }
        for (C62707OjH c62707OjH : LJIILJJIL(i, list)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("record: ");
            LIZ.append(c62707OjH.LIZJ);
            C43252GyG.LIZ("TimesMap", X1D.LIZIZ(LIZ));
            Integer num = (Integer) hashMap.get(c62707OjH.LIZJ);
            String str = c62707OjH.LIZJ;
            o.LJIIIIZZ(str, "record.channel");
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            hashMap.put(str, Integer.valueOf(i2));
        }
        return hashMap;
    }

    public static final void LJIJ(ActivityC86117Xqz activity, HQU previewContext, int i) {
        MusicModel musicModel;
        String str;
        String str2;
        String str3;
        String str4;
        C35516Dwm vJ;
        C35516Dwm vJ2;
        Long l;
        MusicModel musicModel2;
        String idStr;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(previewContext, "previewContext");
        UgcTemplateAlbumConfig ugcTemplateAlbumConfig = new UgcTemplateAlbumConfig();
        boolean z = previewContext instanceof HQZ;
        if (z) {
            Music music = previewContext.LIZ().getMusic();
            if (music != null && (idStr = music.getIdStr()) != null) {
                l = Long.valueOf(CastLongProtector.parseLong(idStr));
            } else {
                l = null;
            }
            Music music2 = previewContext.LIZ().getMusic();
            if (music2 != null && (musicModel2 = music2.convertToMusicModel()) != null) {
                if (l != null) {
                    musicModel2.setId(l.longValue());
                }
            } else {
                musicModel2 = null;
            }
            ugcTemplateAlbumConfig.setMusicModel(musicModel2);
        } else {
            Music music3 = previewContext.LIZ().getMusic();
            if (music3 != null) {
                musicModel = music3.convertToMusicModel();
            } else {
                musicModel = null;
            }
            ugcTemplateAlbumConfig.setMusicModel(musicModel);
        }
        UgcTemplateSlot ugcTemplateSlot = previewContext.LJFF;
        if (ugcTemplateSlot != null) {
            double d = 1000;
            ugcTemplateAlbumConfig.setMusicStart((int) (ugcTemplateSlot.clipStart * d));
            ugcTemplateAlbumConfig.setMusicEnd((int) (ugcTemplateSlot.clipEnd * d));
            ugcTemplateAlbumConfig.setMusicRelativeStart((int) (ugcTemplateSlot.getSlotStartTime() * d));
        }
        ArrayList<Float> clipDurations = ugcTemplateAlbumConfig.getClipDurations();
        List<UgcTemplateSlot> list = previewContext.LJ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf((float) ((UgcTemplateSlot) it.next()).getDuration()));
        }
        clipDurations.addAll(arrayList);
        ugcTemplateAlbumConfig.setMusicSlot(previewContext.LJFF);
        ugcTemplateAlbumConfig.getSlotList().addAll(previewContext.LJ);
        ugcTemplateAlbumConfig.setAnchor(HQU.LIZLLL(previewContext.LIZ()));
        if (z) {
            ugcTemplateAlbumConfig.setTemplateId(((HQZ) previewContext).LJIIJ);
        } else {
            AnchorCommonStruct anchor = ugcTemplateAlbumConfig.getAnchor();
            if (anchor != null) {
                str = anchor.getId();
            } else {
                str = null;
            }
            ugcTemplateAlbumConfig.setTemplateId(str);
        }
        ugcTemplateAlbumConfig.setSlotIndex(i);
        InterfaceC44039HQd interfaceC44039HQd = (InterfaceC44039HQd) previewContext.LJ(InterfaceC44039HQd.class);
        if (interfaceC44039HQd != null) {
            str2 = interfaceC44039HQd.getMusicPath();
        } else {
            str2 = null;
        }
        ugcTemplateAlbumConfig.setMusicPath(str2);
        if (interfaceC44039HQd != null && (vJ2 = interfaceC44039HQd.vJ()) != null) {
            str3 = vJ2.LIZ;
        } else {
            str3 = null;
        }
        ugcTemplateAlbumConfig.setTemplateUrl(str3);
        if (interfaceC44039HQd != null && (vJ = interfaceC44039HQd.vJ()) != null) {
            str4 = vJ.LIZIZ;
        } else {
            str4 = null;
        }
        ugcTemplateAlbumConfig.setTemplateMD5(str4);
        CreativeInfo creativeInfo = previewContext.LIZIZ;
        if (creativeInfo != null) {
            ugcTemplateAlbumConfig.setCreativeInfo(creativeInfo);
            ugcTemplateAlbumConfig.setFromPUgc(previewContext.LIZJ);
            if (z) {
                HQZ hqz = (HQZ) previewContext;
                ugcTemplateAlbumConfig.setChallenges(hqz.LJIILIIL);
                ugcTemplateAlbumConfig.setAnchors(hqz.LJIILJJIL);
                ugcTemplateAlbumConfig.setOpenPlatformExtra(hqz.LJIILL);
                ugcTemplateAlbumConfig.setShootWay(previewContext.LIZJ());
                ugcTemplateAlbumConfig.setReporterType(Integer.valueOf(hqz.LJIILLIIL));
                ugcTemplateAlbumConfig.setUgcTemplateTag("ugc_template_tag_game");
            }
            C44018HPi.LJIILL(activity, ugcTemplateAlbumConfig);
            return;
        }
        o.LJIJI("creativeInfo");
        throw null;
    }

    public static C1JB LJIJJ(InterfaceC41451jx interfaceC41451jx, C0QB repeatMode, int i) {
        long j;
        if ((i & 2) != 0) {
            repeatMode = C0QB.Restart;
        }
        if ((i & 4) != 0) {
            j = 0;
        } else {
            j = 0;
        }
        o.LJIIIZ(repeatMode, "repeatMode");
        return new C1JB(interfaceC41451jx, repeatMode, j);
    }

    public static final void LJJIIZI(View view, Number width, Number height) {
        o.LJIIIZ(width, "width");
        o.LJIIIZ(height, "height");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (width.intValue() != -1 && layoutParams != null) {
            layoutParams.width = width.intValue();
        }
        if (height.intValue() != -1 && layoutParams != null) {
            layoutParams.height = height.intValue();
        }
        view.setLayoutParams(layoutParams);
    }

    @Override // X.R6I
    public void LJIILLIIL(AuthResult authResult, int i, C69008R6m c69008R6m) {
        String str;
        int i2;
        int i3;
        C69008R6m LIZIZ = C69007R6l.LIZIZ(this, authResult, c69008R6m, "facebook");
        if (LIZIZ == null) {
            return;
        }
        o.LJI(authResult);
        if (authResult.mIsSuccessful) {
            String str2 = authResult.mToken;
            long j = authResult.mExpiryDateInMillis;
            F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme_friends").edit().putString("fb_access_token", str2).apply();
            F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme_friends").edit().putLong("fb_access_token_exp", j).apply();
            C69009R6n.LIZLLL(LIZIZ);
            return;
        }
        C66504Q8e c66504Q8e = authResult.mErrorCause;
        if (c66504Q8e != null) {
            i2 = c66504Q8e.getErrorCode();
            str = c66504Q8e.getMessage();
        } else {
            str = "";
            i2 = 0;
        }
        if (authResult.mIsCancelled) {
            C69009R6n.LIZIZ(LIZIZ, str, i2, str);
            C69007R6l.LIZ(i, 2, "facebook", i2, str);
            return;
        }
        C36922EeM.LJFF(authResult.mErrorCause);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" | ");
        C66504Q8e c66504Q8e2 = authResult.mErrorCause;
        if (c66504Q8e2 != null && c66504Q8e2.getStackTrace() != null) {
            C66504Q8e c66504Q8e3 = authResult.mErrorCause;
            o.LJI(c66504Q8e3);
            StackTraceElement[] stackTrace = c66504Q8e3.getStackTrace();
            o.LJIIIIZZ(stackTrace, "authResult.errorCause!!.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        if (str != null && str.length() != 0) {
            o.LJI(str);
            if (s.LJJJLZIJ(str, "connection", true)) {
                i3 = -10002;
                V16.LJJJLIIL(sb2, "facebook");
                C69007R6l.LIZ(i, 1, "facebook", i3, sb2);
                C69009R6n.LIZJ(LIZIZ, sb2, i3, str);
            }
        }
        i3 = -10000;
        V16.LJJJLIIL(sb2, "facebook");
        C69007R6l.LIZ(i, 1, "facebook", i3, sb2);
        C69009R6n.LIZJ(LIZIZ, sb2, i3, str);
    }

    public static C41391jr LJJIJIIJI(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new C41391jr(f, f2, obj);
    }

    public static C48361v6 LJJIJIIJIL(int i, int i2, InterfaceC07020Pi easing, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            easing = C07040Pk.LIZ;
        }
        o.LJIIIZ(easing, "easing");
        return new C48361v6(i, i2, easing);
    }

    public static void LJJIIZ(View view, Float f, Float f2, Float f3, Float f4, Float f5, int i) {
        Float f6 = f4;
        Float f7 = f3;
        Float f8 = f;
        Float f9 = f2;
        Float f10 = null;
        if ((i & 1) != 0) {
            f8 = null;
        }
        if ((i & 2) != 0) {
            f9 = null;
        }
        if ((i & 4) != 0) {
            f7 = null;
        }
        if ((i & 8) != 0) {
            f6 = null;
        }
        if ((i & 16) == 0) {
            f10 = f5;
        }
        if (view != null) {
            view.setOutlineProvider(new C42502GmA(f8, f9, f7, f6, f10));
            view.setClipToOutline(true);
        }
    }
}
