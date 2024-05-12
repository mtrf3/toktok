package X;

import Y.ARunnableS15S0101000_11;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.livesetting.message.LiveUplinkStrategySetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.EffectInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.notice.api.bean.LinkBusinessExtra;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Uz7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78977Uz7 implements InterfaceC80179VdP, InterfaceC48038ItG, C0WP, YMS {
    public static final C78977Uz7 LJLIL = new C78977Uz7();

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001b, code lost:
    
        if (r2 >= 1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJJJJJ(int r2, int r3) {
        /*
            java.lang.String r1 = "none"
            r0 = 1
            if (r2 != 0) goto L8
            if (r3 != r0) goto Lf
        L7:
            return r1
        L8:
            if (r2 != r0) goto Ld
            if (r3 != 0) goto L1d
            goto L7
        Ld:
            if (r2 != 0) goto L14
        Lf:
            if (r3 <= r0) goto L22
            java.lang.String r1 = "photo"
            goto L7
        L14:
            if (r2 <= r0) goto L1b
            if (r3 != 0) goto L1d
            java.lang.String r1 = "video"
            goto L7
        L1b:
            if (r2 < r0) goto L22
        L1d:
            if (r3 < r0) goto L22
            java.lang.String r1 = "mix"
            goto L7
        L22:
            java.lang.String r1 = ""
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78977Uz7.LJJJJJ(int, int):java.lang.String");
    }

    @Override // X.InterfaceC80185VdV
    public void LIZIZ(InterfaceC78979Uz9 interfaceC78979Uz9, EnumC80174VdK enumC80174VdK, EnumC80174VdK enumC80174VdK2) {
    }

    @Override // X.InterfaceC80179VdP
    public void LJIIIZ() {
    }

    @Override // X.InterfaceC79839VVb
    public void LJIIJ(InterfaceC78979Uz9 interfaceC78979Uz9) {
    }

    @Override // X.InterfaceC80179VdP
    public void LJIJJ() {
    }

    @Override // X.InterfaceC79840VVc
    public void LJIJJLI(C80164VdA c80164VdA) {
    }

    public static boolean LJJJJZ() {
        return e1.LIZ(31744, "cursor_window_shrink", true, false);
    }

    @Override // X.YMS
    public long LIZJ() {
        return LiveUplinkStrategySetting.INSTANCE.getWsUplinkWaitTimeout();
    }

    @Override // X.YMS
    public boolean LJ() {
        return LiveUplinkStrategySetting.INSTANCE.supportWSUplink();
    }

    @Override // X.YMS
    public boolean LJFF() {
        return LiveUplinkStrategySetting.INSTANCE.getWsFailFallbackToHttp();
    }

    @Override // X.YMS
    public boolean LJIIL() {
        return LiveUplinkStrategySetting.INSTANCE.supportUplink();
    }

    @Override // X.YMS
    public boolean LJIJI() {
        return LiveUplinkStrategySetting.INSTANCE.supportHttpUplink();
    }

    @Override // X.YMS
    public String LJIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(((INetworkService) CN1.LIZ(INetworkService.class)).getHostDomain());
        LIZ.append("/webcast/im/gw/uplink/message/");
        return X1D.LIZIZ(LIZ);
    }

    public static final ArrayMap LJJII(OSZ... oszArr) {
        ArrayMap arrayMap = new ArrayMap();
        for (OSZ osz : oszArr) {
            arrayMap.put(osz.getFirst(), osz.getSecond());
        }
        return arrayMap;
    }

    public static byte[] LJJIII(String str) {
        str.getClass();
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static final byte[] LJJIIJ(String str) {
        o.LJIIIZ(str, "str");
        byte[] decode = Base64.decode(str, 2);
        o.LJIIIIZZ(decode, "decode(str, Base64.NO_WRAP)");
        return decode;
    }

    public static final C10390ax LJJIIZ(InterfaceC274415w interfaceC274415w) {
        o.LJIIIZ(interfaceC274415w, "<this>");
        AbstractC538029g LJIILIIL = interfaceC274415w.LJIILIIL();
        if (LJIILIIL != null) {
            return LJIILIIL.LJIIJ(interfaceC274415w, true);
        }
        return new C10390ax(0.0f, 0.0f, (int) (interfaceC274415w.LIZ() >> 32), C23490w5.LIZIZ(interfaceC274415w.LIZ()));
    }

    public static final C10390ax LJJIIZI(InterfaceC274415w interfaceC274415w) {
        o.LJIIIZ(interfaceC274415w, "<this>");
        return LJJIL(interfaceC274415w).LJIIJ(interfaceC274415w, true);
    }

    public static final LinkBusinessExtra LJJIJIIJIL(MusNotice notice) {
        o.LJIIIZ(notice, "notice");
        try {
            JSONObject LJJJI = LJJJI(notice);
            if (LJJJI != null) {
                String optString = LJJJI.optString("type");
                o.LJIIIIZZ(optString, "it.optString(\"type\")");
                String optString2 = LJJJI.optString("link_id");
                o.LJIIIIZZ(optString2, "it.optString(\"link_id\")");
                String optString3 = LJJJI.optString("item_id");
                o.LJIIIIZZ(optString3, "it.optString(\"item_id\")");
                return new LinkBusinessExtra(optString, optString2, optString3, LJJJI.optInt("share_type"));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final int LJJIJIL(int i) {
        return (int) ((i * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static final InterfaceC274415w LJJIL(InterfaceC274415w interfaceC274415w) {
        InterfaceC274415w interfaceC274415w2;
        AbstractC538029g abstractC538029g;
        o.LJIIIZ(interfaceC274415w, "<this>");
        AbstractC538029g LJIILIIL = interfaceC274415w.LJIILIIL();
        while (true) {
            interfaceC274415w2 = interfaceC274415w;
            interfaceC274415w = LJIILIIL;
            if (LJIILIIL == null) {
                break;
            }
            LJIILIIL = LJIILIIL.LJIILIIL();
        }
        if (!(interfaceC274415w2 instanceof AbstractC538029g) || (abstractC538029g = (AbstractC538029g) interfaceC274415w2) == null) {
            return interfaceC274415w2;
        }
        AbstractC538029g abstractC538029g2 = abstractC538029g.LJLJLLL;
        while (true) {
            AbstractC538029g abstractC538029g3 = abstractC538029g;
            abstractC538029g = abstractC538029g2;
            if (abstractC538029g2 != null) {
                abstractC538029g2 = abstractC538029g2.LJLJLLL;
            } else {
                return abstractC538029g3;
            }
        }
    }

    public static final JSONObject LJJJI(MusNotice musNotice) {
        JSONObject jSONObject;
        String str;
        o.LJIIIZ(musNotice, "<this>");
        try {
            GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
            if (generalTemplateNotice != null && (str = generalTemplateNotice.messageExtra) != null) {
                jSONObject = new JSONObject(str);
            } else {
                jSONObject = new JSONObject();
            }
            return new JSONObject(jSONObject.optString("business_extra"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0018, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.JCB LJJJIL(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            boolean r0 = r4.isAd()
            r3 = 0
            if (r0 == 0) goto Ld
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r4.getAwemeRawAd()
            if (r0 != 0) goto L1a
        Ld:
            boolean r0 = X.C63081OpJ.LLF(r4)
            if (r0 == 0) goto L36
            r0 = r4
        L14:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = X.C63081OpJ.LJJJJI(r0)
            if (r0 == 0) goto L31
        L1a:
            X.JCB r3 = new X.JCB
            java.lang.Long r0 = r0.getCreativeId()
            java.lang.String r2 = ""
            if (r0 == 0) goto L34
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L28:
            java.lang.String r0 = r4.getRequestId()
            if (r0 != 0) goto L32
        L2e:
            r3.<init>(r1, r2)
        L31:
            return r3
        L32:
            r2 = r0
            goto L2e
        L34:
            r1 = r2
            goto L28
        L36:
            r0 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78977Uz7.LJJJIL(com.ss.android.ugc.aweme.feed.model.Aweme):X.JCB");
    }

    public static final User LJJJJ(MusNotice musNotice) {
        TitleTemplate titleTemplate;
        List<User> list;
        o.LJIIIZ(musNotice, "<this>");
        NoticeUITemplate noticeUITemplate = musNotice.templateNotice.uiTemplate;
        if (noticeUITemplate != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null) {
            return (User) ORZ.LJLLLL(list);
        }
        return null;
    }

    public static final EnumC78982UzC LJJJJI(XH8 xh8) {
        EnumC78982UzC enumC78982UzC;
        o.LJIIIZ(xh8, "<this>");
        XH6 xh6 = (XH6) xh8.LIZ(XH6.LIZJ);
        if (xh6 == null || (enumC78982UzC = xh6.LIZIZ) == null) {
            return EnumC78982UzC.Net;
        }
        return enumC78982UzC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r4 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map LJJJJIZL(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            com.ss.android.ugc.aweme.notice.api.bean.LinkBusinessExtra r5 = LJJIJIIJIL(r7)
            r0 = 0
            if (r5 == 0) goto L12
            int r0 = r5.shareType
            X.McB r0 = X.C55786Luw.LJFF(r0)
        L12:
            r7 = 0
            if (r0 == 0) goto L7e
            int r6 = r0.getFollowFrom()
            int r0 = r0.getRawValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = r0.toString()
            if (r4 != 0) goto L29
        L27:
            java.lang.String r4 = ""
        L29:
            if (r5 == 0) goto L79
            r0 = 5
            X.OSZ[] r3 = new X.OSZ[r0]
            java.lang.String r2 = r5.linkId
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "video_link_id"
            r1.<init>(r0, r2)
            r3[r7] = r1
            java.lang.String r2 = r5.itemId
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "video_link_item_id"
            r1.<init>(r0, r2)
            r0 = 1
            r3[r0] = r1
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "video_link_share_type"
            r1.<init>(r0, r4)
            r0 = 2
            r3[r0] = r1
            java.lang.String r1 = r5.type
            java.lang.String r0 = "video_sharer"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "link_sharer"
            r1.<init>(r0, r2)
            r0 = 3
            r3[r0] = r1
            java.lang.String r2 = java.lang.String.valueOf(r6)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "from"
            r1.<init>(r0, r2)
            r0 = 4
            r3[r0] = r1
            java.util.Map r0 = X.C113554cx.LJJL(r3)
            if (r0 != 0) goto L7d
        L79:
            X.3mF r0 = X.C113554cx.LJJJLIIL()
        L7d:
            return r0
        L7e:
            r6 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78977Uz7.LJJJJIZL(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice):java.util.Map");
    }

    public static final InterfaceC57326Meg LJJJJJL(XH8 xh8) {
        InterfaceC57326Meg interfaceC57326Meg;
        o.LJIIIZ(xh8, "<this>");
        XH7 xh7 = (XH7) xh8.LIZ(XH7.LIZJ);
        if (xh7 != null && (interfaceC57326Meg = xh7.LIZIZ) != null) {
            return interfaceC57326Meg;
        }
        throw new C57301MeH("Please specific the retrofitBuilder in globalContext or MotaCall");
    }

    public static final boolean LJJJJL(AwemeRawAd awemeRawAd) {
        String str;
        NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
        String str2 = null;
        if (nativeSiteConfig != null) {
            str = nativeSiteConfig.getRenderType();
        } else {
            str = null;
        }
        if (o.LJ(str, "lynx")) {
            NativeSiteConfig nativeSiteConfig2 = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig2 != null) {
                str2 = nativeSiteConfig2.getLynxScheme();
            }
            if (!TextUtils.isEmpty(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJJJJLL(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length + 1;
        int[] iArr = new int[length];
        int length2 = charArray.length - 1;
        int i = 1;
        while (length2 >= 0) {
            iArr[i] = charArray[length2] - '0';
            length2--;
            i++;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 1; i4 < length; i4++) {
            if (i4 % 2 == 0) {
                int i5 = iArr[i4] * 2;
                if (i5 < 10) {
                    i2 += i5;
                } else {
                    i2 = (i5 - 9) + i2;
                }
            } else {
                i3 += iArr[i4];
            }
        }
        if ((i2 + i3) % 10 == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJJJJZI(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("sslocal://")) {
            return false;
        }
        String host = UriProtector.parse(str).getHost();
        if (!"microapp".equals(host) && !"microgame".equals(host)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJLIIL(AwemeRawAd awemeRawAd) {
        String str;
        AwemeSplashInfo splashInfo;
        AwemeSplashInfo splashInfo2;
        if (awemeRawAd != null && (splashInfo2 = awemeRawAd.getSplashInfo()) != null) {
            str = splashInfo2.getAwesomeSplashId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || awemeRawAd == null || (splashInfo = awemeRawAd.getSplashInfo()) == null || splashInfo.getSplashFeedType() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJLL(Hashtag hashtag) {
        String str;
        Long l;
        if (hashtag == null || (str = hashtag.title) == null || str.length() == 0 || (((l = hashtag.id) != null && l.longValue() == 0) || hashtag.id == null)) {
            return false;
        }
        return true;
    }

    public static final long LJJJZ(InterfaceC274415w interfaceC274415w) {
        o.LJIIIZ(interfaceC274415w, "<this>");
        return interfaceC274415w.LJIILL(C10370av.LIZIZ);
    }

    public static final void LJJLIIIIJ(Runnable runnable) {
        try {
            BPR LIZ = C39144FXw.LIZ();
            if (LIZ != null && LIZ.LIZ) {
                runnable.run();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final boolean LJJLIIIJILLIZJL(AwemeRawAd awemeRawAd) {
        FakeAuthor fakeAuthor = awemeRawAd.getFakeAuthor();
        if (fakeAuthor != null) {
            return o.LJ(fakeAuthor.getAutoShowWebview(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LJJLIIIJJI(AwemeRawAd awemeRawAd) {
        FakeAuthor fakeAuthor = awemeRawAd.getFakeAuthor();
        if (fakeAuthor != null && fakeAuthor.getShouldShowBanner()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIIIJJIZ(AwemeRawAd awemeRawAd) {
        FakeAuthor fakeAuthor;
        Integer fakeAuthorVersion;
        if (awemeRawAd == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null || (fakeAuthorVersion = fakeAuthor.getFakeAuthorVersion()) == null || fakeAuthorVersion.intValue() != 2) {
            return false;
        }
        return true;
    }

    public static final void LJJLIIIJLJLI(List list) {
        ExecutorService LLLLZ = C16880lQ.LLLLZ(Runtime.getRuntime().availableProcessors());
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(LLLLZ.submit(new ARunnableS15S0101000_11(2, it.next(), 4)));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Future) it2.next()).get();
        }
        LLLLZ.shutdown();
    }

    @Override // X.C0WP
    public List LJIIZILJ(List effectPanelList) {
        o.LJIIIZ(effectPanelList, "effectPanelList");
        Iterator<Object> it = ORZ.LJLIIIL(effectPanelList).iterator();
        while (it.hasNext()) {
            Iterator<Object> it2 = ((C1QC) it.next()).LJLILLLLZI.iterator();
            while (it2.hasNext()) {
                LiveEffect liveEffect = (LiveEffect) it2.next();
                C1KJ c1kj = C1KJ.LIZ;
                if (!c1kj.LIZ(liveEffect)) {
                    c1kj.LIZLLL(liveEffect.getEffect(), null);
                }
            }
        }
        return effectPanelList;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        SearchMixFeedList it = (SearchMixFeedList) obj;
        o.LJIIIZ(it, "it");
        C50089JlF.LIZ(it);
        return it;
    }

    public static final void LJJIJL(XGR xgr, EnumC199577sP policy) {
        o.LJIIIZ(policy, "policy");
        xgr.LIZ(new XH1(policy));
    }

    public static final InterfaceC26319AUp LJJIZ(Integer num, HashMap hashMap) {
        int value = EnumC78978Uz8.SIGNUP.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = EnumC78978Uz8.PROFILE.getValue();
            if (num == null || num.intValue() != value2) {
                return new C26322AUs();
            }
            return new C26322AUs();
        }
        return new C26327AUx(hashMap);
    }

    public static boolean LJJJ(Intent intent, String str) {
        Object LLJJIII;
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI == null || (LLJJIII = C16880lQ.LLJJIII(LLJJIJI, str)) == null) {
            return false;
        }
        if (LLJJIII instanceof String) {
            try {
                return Boolean.parseBoolean((String) LLJJIII);
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        try {
            return ((Boolean) LLJJIII).booleanValue();
        } catch (ClassCastException unused2) {
            return false;
        }
    }

    public static void LJJL(Context context, X5R x5r) {
        if (context == null || x5r == null) {
            return;
        }
        int i = x5r.LIZIZ;
        if (x5r.LJIIJJI != null) {
            Downloader.getInstance(context).removeMainThreadListener(i, x5r.LJIIJJI);
        }
        if (x5r.LJIIL == null) {
            return;
        }
        Downloader.getInstance(context).removeSubThreadListener(i, x5r.LJIIL);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.LinkedHashMap, java.util.HashMap, O] */
    public static final void LJJLI(Room room, DataChannel dataChannel) {
        String str;
        List<Long> list;
        o.LJIIIZ(room, "room");
        if (room.effectInfo == null) {
            return;
        }
        ?? linkedHashMap = new LinkedHashMap();
        List<EffectInfo> list2 = room.effectInfo;
        o.LJIIIIZZ(list2, "room.effectInfo");
        for (EffectInfo effectInfo : list2) {
            String valueOf = String.valueOf(effectInfo.effectId);
            StringBuilder LIZ = X1D.LIZ();
            String LIZJ = C0H1.LIZJ(LIZ, effectInfo.userId, valueOf, LIZ);
            String zK = ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).zK();
            RoomLinkInfo linkMicInfo = room.getLinkMicInfo();
            if (linkMicInfo != null && (list = linkMicInfo.audienceIdList) != null && (!list.isEmpty())) {
                zK = "video_anchor_guest_connect";
            }
            if (effectInfo.userId == room.getOwnerUserId()) {
                str = "anchor";
            } else {
                str = "connection_user";
            }
            HashMap LIZ2 = C45243HpH.LIZ("watch_effect_scene", zK, "watch_user_type", str);
            LIZ2.put("sticker_id", valueOf);
            LJJLIIIJ("livesdk_audience_sticker_show", LIZ2);
            linkedHashMap.put(LIZJ, new C31529CYz(null, effectInfo, System.currentTimeMillis() / 1000, zK, str));
            if (dataChannel != null) {
                ((C32537Cpp) dataChannel.gv0(CZ0.class)).LIZ = linkedHashMap;
            }
        }
    }

    public static final void LJJLIIIJ(String str, java.util.Map map) {
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJIIZILJ();
        LIZ.LJJIFFI(map);
        LIZ.LJJIIJZLJL();
    }

    public static boolean LJJLIIIJL(byte[] bArr, byte[] bArr2) {
        bArr2.getClass();
        if (bArr2.length > bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static final void LJJLIIIJLLLLLLLZ(XGX xgx, EnumC78982UzC source) {
        o.LJIIIZ(source, "source");
        xgx.LIZJ = xgx.LIZJ.LIZJ(new XH6(source));
    }

    public static C72769ShB LJJIJIIJI(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        int i4;
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            i3 = -16777216;
        } else {
            i3 = 0;
        }
        if ((i & 32) != 0) {
            i4 = C7MY.LIZIZ(8);
        } else {
            i4 = 0;
        }
        o.LJIIIZ(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.m_, R.attr.ma, R.attr.mb, R.attr.bq0, R.attr.bq1, R.attr.bq2, R.attr.bq6}, R.attr.jl, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…dgeStyle,\n        0\n    )");
        C72769ShB LJJIJ = LJJIJ(obtainStyledAttributes, 0, i2, i3, i4);
        obtainStyledAttributes.recycle();
        return LJJIJ;
    }

    public static final int LJJIJLIJ(InterfaceC13090fJ interfaceC13090fJ, Object obj, int i) {
        o.LJIIIZ(interfaceC13090fJ, "<this>");
        if (obj == null) {
            return i;
        }
        if (i < interfaceC13090fJ.getItemCount() && o.LJ(obj, interfaceC13090fJ.LJII(i))) {
            return i;
        }
        Integer num = interfaceC13090fJ.LJI().get(obj);
        if (num != null) {
            return num.intValue();
        }
        return i;
    }

    public static final String LJJJLZIJ(int i, int i2, int i3) {
        if (i == 0) {
            return "";
        }
        if (i2 == 0 || i2 > 9) {
            return String.valueOf(i3);
        }
        int i4 = 1;
        if (1 <= i2) {
            int i5 = 1;
            while (true) {
                i4 *= 10;
                if (i5 == i2) {
                    break;
                }
                i5++;
            }
        }
        int i6 = i4 - 1;
        if (i3 > i6) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i6);
            LIZ.append('+');
            return X1D.LIZIZ(LIZ);
        }
        return String.valueOf(i3);
    }

    public static final void LJJIIJZLJL(ViewGroup viewGroup, List list, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88473Ynt bindView) {
        int i;
        o.LJIIIZ(viewGroup, "<this>");
        o.LJIIIZ(bindView, "bindView");
        if (list == null || list.isEmpty()) {
            i = 8;
        } else {
            i = 0;
        }
        viewGroup.setVisibility(i);
        if (o.LJ(viewGroup.getTag(), list) || list == null) {
            viewGroup.setTag(list);
            return;
        }
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt == null) {
                    View view = (View) interfaceC88472Yns.invoke(obj);
                    viewGroup.addView(view);
                    bindView.invoke(view, obj, Integer.valueOf(i2));
                } else {
                    childAt.setVisibility(0);
                    bindView.invoke(childAt, obj, Integer.valueOf(i2));
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (viewGroup.getChildCount() > list.size()) {
            int childCount = viewGroup.getChildCount();
            for (int size = list.size(); size < childCount; size++) {
                viewGroup.getChildAt(size).setVisibility(8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r6 > r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        if (r8[r6] == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001b, code lost:
    
        if (r6 > r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
    
        r3 = r6 + 1;
        r2 = (r3 + r10) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        if (r3 >= r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
    
        if (r8[r3] != r11[r4]) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
    
        r3 = r3 + 1;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r3 != r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0031, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0032, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r8[r6] != r5) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJJJJLI(byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r11.getClass()
            r7 = -1
            if (r10 <= r9) goto L7
            return r7
        L7:
            r6 = 0
            r5 = r11[r6]
            int r9 = r9 - r10
        Lb:
            if (r6 > r9) goto L35
            r0 = r8[r6]
            r4 = 1
            if (r0 == r5) goto L1b
        L12:
            int r6 = r6 + 1
            if (r6 > r9) goto L1b
            r0 = r8[r6]
            if (r0 == r5) goto L1b
            goto L12
        L1b:
            if (r6 > r9) goto L32
            int r3 = r6 + 1
            int r2 = r3 + r10
            int r2 = r2 - r4
        L22:
            if (r3 >= r2) goto L2f
            r1 = r8[r3]
            r0 = r11[r4]
            if (r1 != r0) goto L2f
            int r3 = r3 + 1
            int r4 = r4 + 1
            goto L22
        L2f:
            if (r3 != r2) goto L32
            return r6
        L32:
            int r6 = r6 + 1
            goto Lb
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78977Uz7.LJJJJLI(byte[], int, int, byte[]):int");
    }

    public static final C72769ShB LJJIJ(TypedArray typedArray, int i, int i2, int i3, int i4) {
        return new C72769ShB(typedArray.getInt(1, i), typedArray.getColor(2, i2), typedArray.getColor(0, i3), typedArray.getDimensionPixelSize(4, i4));
    }
}
