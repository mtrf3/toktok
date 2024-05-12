package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.video2sticker.api.Video2StickerTextReviewApi;
import com.ss.android.ugc.aweme.shortvideo.video2sticker.api.Video2StickerTextReviewResponse;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.AqS121S0300000_2;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.T2g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73994T2g implements InterfaceC11200cG, IHostRouterDepend, WV3, InterfaceC60837NuD, InterfaceC30436Bx2, InterfaceC38239Ezb {
    @Override // X.InterfaceC60837NuD
    public void LIZIZ() {
    }

    @Override // X.InterfaceC60837NuD
    public void LJ() {
    }

    @Override // X.WV3
    public void LJJIJIIJIL() {
    }

    @Override // X.WV3
    public void LJJJJI() {
    }

    @Override // X.WV3
    public boolean LJLLLLLL() {
        return false;
    }

    @Override // X.WV3
    public void LLIL(int i) {
    }

    @Override // X.WV3
    public void LLJJJJJIL() {
    }

    @Override // X.WV3
    public void LLLLIILLL() {
    }

    @Override // X.WV3
    public void LLLLLZL(float f) {
    }

    @Override // X.WV3
    public boolean LLLLZ() {
        return false;
    }

    @Override // X.WV3
    public void LLLZL() {
    }

    @Override // X.WV3
    public /* synthetic */ void ba() {
    }

    public static boolean LJIL() {
        if (LJIILLIIL("iap_exp_2_optimize_query_order_and_ack_async", 0) != 1) {
            return false;
        }
        return true;
    }

    public static void LJJIIZI() {
        InterfaceC05190Ih currentUser;
        User user;
        if (B83.LIZ().LIZIZ() != null && (currentUser = B83.LIZ().LIZIZ().getCurrentUser()) != null && (currentUser instanceof User) && (user = (User) currentUser) != null && user.getBadgeList() != null) {
            List<BadgeStruct> badgeList = user.getBadgeList();
            for (int i = 0; i < badgeList.size(); i++) {
                if (ListProtector.get(badgeList, i) != null && ((BadgeStruct) ListProtector.get(badgeList, i)).badgeScene == 10) {
                    ListProtector.remove(badgeList, i);
                    return;
                }
            }
        }
    }

    public static final void LJJIJIL() {
        C86393XvR LJJIJIL;
        InterfaceC54761LeP LJJLIIJ;
        BZI LIZIZ;
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && (LJJLIIJ = LJJIJIL.LJJLIIJ("livesdk_live_cover_view_all_icon_show")) != null && (LIZIZ = LJJLIIJ.LIZIZ(C113554cx.LJJL(new OSZ("enter_from_merge", "homepage_follow"), new OSZ("enter_method", "live_cover")))) != null) {
            LIZIZ.LJJIIJZLJL();
        }
    }

    public static String LJIIIZ(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (byte b : bArr) {
                sb.append(C16880lQ.LLLZ("%02x", new Object[]{Byte.valueOf(b)}));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean LJIIJJI(String str) {
        MainPageExperimentServiceImpl.LJ().LIZJ();
        if ("trending_page".equalsIgnoreCase(str) || "challenge".equalsIgnoreCase(str) || "search_result".equalsIgnoreCase(str) || "general_search".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static String LJIIL(String str) {
        String str2 = "MD5";
        byte[] bytes = str.getBytes();
        try {
            if (C38354F3m.LJ("MD5")) {
                str2 = "SHA-256";
            }
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes);
            return LJIIIZ(messageDigest.digest());
        } catch (NoSuchAlgorithmException | Exception unused) {
            return null;
        }
    }

    public static final List LJIILJJIL(List list) {
        UserStory userStory;
        UserStory userStory2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            FriendsFeed friendsFeed = (FriendsFeed) obj;
            C53578L1a.LIZ.getClass();
            if (!C53578L1a.LIZ() && !C7EC.LIZ()) {
                if (!C54838Lfe.LJJI(friendsFeed.getAweme())) {
                    arrayList.add(obj);
                }
            } else if (!C53578L1a.LIZ() && C7EC.LIZ()) {
                if (C54838Lfe.LJJI(friendsFeed.getAweme())) {
                    Aweme aweme = friendsFeed.getAweme();
                    if (C54838Lfe.LJJ(aweme) && aweme != null && (userStory2 = aweme.getUserStory()) != null && userStory2.getTotalCount() == 1 && !userStory2.getHasMoreBefore() && !userStory2.getHasMoreAfter() && userStory2.getCurrentPosition() == 0) {
                    }
                }
                arrayList.add(obj);
            } else if (C53578L1a.LIZ()) {
                Aweme aweme2 = friendsFeed.getAweme();
                if (C54838Lfe.LJJ(aweme2) && aweme2 != null && (userStory = aweme2.getUserStory()) != null && userStory.isPostStyle()) {
                }
                arrayList.add(obj);
            } else if (!C54838Lfe.LJJI(friendsFeed.getAweme())) {
                arrayList.add(obj);
            }
        }
        return ORZ.LLJILJILJ(arrayList);
    }

    public static final boolean LJIILL(FriendsFeed friendsFeed) {
        o.LJIIIZ(friendsFeed, "friendsFeed");
        Aweme aweme = friendsFeed.getAweme();
        if (aweme == null) {
            return true;
        }
        if (aweme.getAwemeType() == 101 || aweme.getAwemeType() == 40 || aweme.getAwemeType() == 152 || aweme.getAwemeType() == 150 || aweme.getAwemeType() == 160) {
            return false;
        }
        return !C78840Uwu.LJJIII(aweme);
    }

    public static final boolean LJIJJ(FriendsFeed friendsFeed) {
        o.LJIIIZ(friendsFeed, "friendsFeed");
        Aweme aweme = friendsFeed.getAweme();
        if (aweme == null || !C78840Uwu.LJJIII(aweme)) {
            return false;
        }
        if (aweme.getVideo() != null && aweme.getVideo().getWidth() != 0 && aweme.getVideo().getHeight() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJJLI(FriendsFeed friendsFeed) {
        o.LJIIIZ(friendsFeed, "friendsFeed");
        Aweme aweme = friendsFeed.getAweme();
        if (aweme == null) {
            return false;
        }
        if (!TextUtils.equals(aweme.getAuthor().getUid(), HG3.LJIILL().getCurUser().getUid()) || !aweme.isPrivate()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJI(Response response) {
        Integer num;
        Integer num2 = response.status_code;
        int i = AbstractC63551Owt.LIZ;
        if ((num2 == null || num2.intValue() != i) && ((num = response.status_code) == null || num.intValue() != 200)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIFFI(FriendsFeed friendsFeed) {
        if (friendsFeed == null || friendsFeed.getAweme() == null) {
            return false;
        }
        if (friendsFeed.getSource() != LII.SORT.getDataLevel() && friendsFeed.getSource() != LII.HISTORY_UNVIEWED.getDataLevel()) {
            return false;
        }
        return true;
    }

    public static Object LJJIJL(List list) {
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        String LIZ = AVApiImpl.LIZJ().LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
        Video2StickerTextReviewApi video2StickerTextReviewApi = (Video2StickerTextReviewApi) networkService.createRetrofit(LIZ, true, Video2StickerTextReviewApi.class);
        String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), list);
        o.LJIIIIZZ(json, "getAPI().getGson().toJson(texts)");
        Video2StickerTextReviewResponse video2StickerTextReviewResponse = video2StickerTextReviewApi.video2StickerTextReview(json).execute().LIZIZ;
        o.LJIIIIZZ(video2StickerTextReviewResponse, "textReviewApi.video2Stic…(texts)).execute().body()");
        return video2StickerTextReviewResponse;
    }

    public static final JSONObject LJJIJLIJ(java.util.Map map) {
        C6BK c6bk = new C6BK();
        for (Map.Entry entry : map.entrySet()) {
            c6bk.LIZLLL((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject LJ = c6bk.LJ();
        o.LJIIIIZZ(LJ, "builder.build()");
        return LJ;
    }

    public static final String LJJIZ(Number number) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(number);
        LIZ.append("kbps");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC60837NuD
    public EnumC60795NtX LIZ(Context context) {
        o.LJIIIZ(context, "context");
        CharSequence LJIIJJI = C79045V0n.LJIIJJI(context);
        if (o.LJ(LJIIJJI, "TikTok Theme Light")) {
            return EnumC60795NtX.LIGHT;
        }
        if (o.LJ(LJIIJJI, "TikTok Theme Dark")) {
            return EnumC60795NtX.DARK;
        }
        return EnumC60795NtX.OTHER;
    }

    @Override // X.InterfaceC38239Ezb
    public C93833mF LIZJ(SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "sparkContext");
        return C113554cx.LJJJLIIL();
    }

    @Override // X.InterfaceC60837NuD
    public Integer LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        return C79045V0n.LJI(R.attr.cl, context);
    }

    @Override // X.InterfaceC60837NuD
    public boolean LJFF(SparkActivity sparkActivity) {
        o.LJIIIZ(sparkActivity, "sparkActivity");
        return AnonymousClass636.LJIILJJIL(sparkActivity);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend
    public boolean isHostScheme(String schema) {
        o.LJIIIZ(schema, "schema");
        return o.LJ(schema, "aweme");
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend
    public boolean openHostScheme(String openUrl) {
        o.LJIIIZ(openUrl, "openUrl");
        return C61200O0e.LIZLLL().LJII(openUrl);
    }

    public static final Object LJIIJ(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 33) {
            return obj;
        }
        return obj2;
    }

    public static int LJIILLIIL(String str, int i) {
        try {
            Object obj = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ().get(str);
            if (obj == null) {
                return i;
            }
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return CastIntegerProtector.parseInt((String) obj);
            }
            return 0;
        } catch (Exception unused) {
            return i;
        }
    }

    public static boolean LJJ(String str, double d) {
        Object obj;
        Object obj2;
        if (C73996T2i.LJ == null) {
            C73996T2i.LJ = new C73996T2i();
        }
        C73996T2i c73996T2i = C73996T2i.LJ;
        boolean z = c73996T2i.LIZ;
        if (!c73996T2i.LIZLLL) {
            try {
                obj2 = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ().get("live_slardar_dolphin_monitor_sample_experiment");
            } catch (Exception unused) {
            }
            if (obj2 != null && (obj2 instanceof Boolean)) {
                z = ((Boolean) obj2).booleanValue();
                c73996T2i.LIZ = z;
                c73996T2i.LIZLLL = true;
            }
            z = false;
            c73996T2i.LIZ = z;
            c73996T2i.LIZLLL = true;
        }
        if (!z) {
            return true;
        }
        if (C73996T2i.LJ == null) {
            C73996T2i.LJ = new C73996T2i();
        }
        C73996T2i c73996T2i2 = C73996T2i.LJ;
        double d2 = c73996T2i2.LIZIZ;
        if (d2 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            d2 = ThreadLocalRandom.current().nextDouble();
            c73996T2i2.LIZIZ = d2;
        }
        java.util.Map<String, Double> map = c73996T2i2.LIZJ;
        if (map == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                obj = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ().get("live_slardar_sample_list");
            } catch (Exception unused2) {
            }
            if (obj != null && (obj instanceof LinkedHashMap)) {
                map = (LinkedHashMap) obj;
                c73996T2i2.LIZJ = map;
            }
            map = linkedHashMap;
            c73996T2i2.LIZJ = map;
        }
        if (map.get(str) != null) {
            d = map.get(str).doubleValue();
        }
        if (d2 >= d) {
            return false;
        }
        return true;
    }

    public static final void LJJII(InterfaceC55235Lm3 vScope, InterfaceC65784Pro interfaceC65784Pro) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        boolean z2;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        List<AddressCardProducts> list;
        String str5;
        String str6;
        String str7;
        EComShopCardStruct eComShopCardStruct2;
        EComShopCardStruct eComShopCardStruct3;
        EComShopCardStruct eComShopCardStruct4;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i2;
        String str13;
        EComShopCardStruct eComShopCardStruct5;
        EComShopCardStruct eComShopCardStruct6;
        com.ss.android.ugc.aweme.profile.model.User user;
        EComShopCardStruct eComShopCardStruct7;
        EComShopCardStruct eComShopCardStruct8;
        List<AddressCardProducts> list2;
        AddressCardProducts addressCardProducts;
        EComShopCardStruct eComShopCardStruct9;
        EComShopCardStruct eComShopCardStruct10;
        EComShopCardStruct eComShopCardStruct11;
        String str14;
        String str15;
        String str16;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct12;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct13;
        SearchMixFeedBase searchMixFeedBase4;
        EComShopCardStruct eComShopCardStruct14;
        SearchMixFeedBase searchMixFeedBase5;
        EComShopCardStruct eComShopCardStruct15;
        com.ss.android.ugc.aweme.profile.model.User user2;
        SearchMixFeedBase searchMixFeedBase6;
        EComShopCardStruct eComShopCardStruct16;
        SearchMixFeedBase searchMixFeedBase7;
        EComShopCardStruct eComShopCardStruct17;
        SearchMixFeedBase searchMixFeedBase8;
        EComShopCardStruct eComShopCardStruct18;
        SearchMixFeedBase searchMixFeedBase9;
        EComShopCardStruct eComShopCardStruct19;
        SearchMixFeedBase searchMixFeedBase10;
        EComShopCardStruct eComShopCardStruct20;
        SearchMixFeedBase searchMixFeedBase11;
        EComShopCardStruct eComShopCardStruct21;
        o.LJIIIZ(vScope, "vScope");
        JXS jxs = (JXS) interfaceC65784Pro.invoke();
        if (jxs != null && (searchMixFeedBase11 = jxs.LJLIL) != null && (eComShopCardStruct21 = searchMixFeedBase11.shopCard) != null && eComShopCardStruct21.liveEntity != null) {
            z = true;
        } else {
            z = false;
        }
        JXS jxs2 = (JXS) interfaceC65784Pro.invoke();
        JSONObject LJ = C47135Ieh.LJ("EVENT_ORIGIN_FEATURE", "TEMAI", "enter_from", "general_search");
        LJ.put("page_name", "general_search");
        if (jxs2 != null && (searchMixFeedBase10 = jxs2.LJLIL) != null && (eComShopCardStruct20 = searchMixFeedBase10.shopCard) != null && o.LJ(eComShopCardStruct20.isOfficial, Boolean.TRUE)) {
            LJ.put("logo_type", "official_brand");
        }
        LJ.put("entrance_type", "shop_card");
        if (jxs2 == null || (searchMixFeedBase9 = jxs2.LJLIL) == null || (eComShopCardStruct19 = searchMixFeedBase9.shopCard) == null || (str = eComShopCardStruct19.shopId) == null) {
            str = "";
        }
        LJ.put("shop_id", str);
        if (jxs2 == null || (searchMixFeedBase8 = jxs2.LJLIL) == null || (eComShopCardStruct18 = searchMixFeedBase8.shopCard) == null || (str2 = eComShopCardStruct18.userId) == null) {
            str2 = "";
        }
        LJ.put("author_id", str2);
        if (jxs2 != null && (searchMixFeedBase7 = jxs2.LJLIL) != null && (eComShopCardStruct17 = searchMixFeedBase7.shopCard) != null) {
            str3 = eComShopCardStruct17.userId;
        } else {
            str3 = null;
        }
        LJ.put("is_self", TextUtils.equals(str3, ((RBX) HG3.LJIILL()).getCurUserId()) ? 1 : 0);
        LJ.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(vScope, ISearchContextAbility.class)).If().LIZJ().LJLJI);
        if (jxs2 == null || (searchMixFeedBase6 = jxs2.LJLIL) == null || (eComShopCardStruct16 = searchMixFeedBase6.shopCard) == null || (str4 = eComShopCardStruct16.docId) == null) {
            str4 = "";
        }
        LJ.put("search_result_id", str4);
        LJ.put("search_entrance", ((ISearchContextAbility) C55096Ljo.LIZIZ(vScope, ISearchContextAbility.class)).cs().LIZJ().LJLIL);
        if (jxs2 != null && (searchMixFeedBase5 = jxs2.LJLIL) != null && (eComShopCardStruct15 = searchMixFeedBase5.shopCard) != null && (user2 = eComShopCardStruct15.userInfo) != null) {
            i = user2.getFollowStatus();
        } else {
            i = -1;
        }
        LJ.put("follow_status", i);
        C48658J7u.LIZIZ("tiktokec_shop_entrance_show", LJ);
        if (z) {
            z2 = true;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(vScope, ISearchContextAbility.class)).If().LIZJ().LJLJI);
            jSONObject.put("enter_from", "general_search");
            if (jxs2 == null || (searchMixFeedBase4 = jxs2.LJLIL) == null || (eComShopCardStruct14 = searchMixFeedBase4.shopCard) == null || (str14 = eComShopCardStruct14.docId) == null) {
                str14 = "";
            }
            jSONObject.put("search_result_id", str14);
            jSONObject.put("list_result_type", "live");
            if (jxs2 == null || (searchMixFeedBase3 = jxs2.LJLIL) == null || (eComShopCardStruct13 = searchMixFeedBase3.shopCard) == null || (str15 = eComShopCardStruct13.roomId) == null) {
                str15 = "";
            }
            jSONObject.put("list_item_id", str15);
            jSONObject.put("search_keyword", ((ISearchContextAbility) C55096Ljo.LIZIZ(vScope, ISearchContextAbility.class)).If().LIZJ().LJLJJI);
            jSONObject.put("token_type", "shop");
            jSONObject.put("rank", ((SearchServiceCenter$CardCommonAbility) C55096Ljo.LIZIZ(vScope, SearchServiceCenter$CardCommonAbility.class)).C40().getLayoutPosition());
            jSONObject.put("aladdin_rank", 0);
            jSONObject.put("is_live", 1);
            if (jxs2 == null || (searchMixFeedBase2 = jxs2.LJLIL) == null || (eComShopCardStruct12 = searchMixFeedBase2.shopCard) == null || (str16 = eComShopCardStruct12.userId) == null) {
                str16 = "";
            }
            jSONObject.put("author_id", str16);
            jSONObject.put("page_name", "general_search");
            C48658J7u.LIZIZ("search_result_show", jSONObject);
        } else {
            z2 = false;
        }
        if (jxs2 != null && (searchMixFeedBase = jxs2.LJLIL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (list = eComShopCardStruct.addressCardProduct) != null) {
            int i3 = 0;
            for (AddressCardProducts addressCardProducts2 : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    AddressCardProducts product = addressCardProducts2;
                    if (!z2) {
                        String str17 = product.productId;
                        if (str17 == null) {
                            str17 = "";
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(vScope, ISearchContextAbility.class)).If().LIZJ().LJLJI);
                        jSONObject2.put("enter_from", "general_search");
                        SearchMixFeedBase searchMixFeedBase12 = jxs2.LJLIL;
                        if (searchMixFeedBase12 == null || (eComShopCardStruct11 = searchMixFeedBase12.shopCard) == null || (str8 = eComShopCardStruct11.docId) == null) {
                            str8 = "";
                        }
                        jSONObject2.put("search_result_id", str8);
                        jSONObject2.put("list_result_type", "mt_goods");
                        jSONObject2.put("list_item_id", str17);
                        jSONObject2.put("search_keyword", ((ISearchContextAbility) C55096Ljo.LIZIZ(vScope, ISearchContextAbility.class)).If().LIZJ().LJLJJI);
                        jSONObject2.put("token_type", "shop");
                        jSONObject2.put("rank", ((SearchServiceCenter$CardCommonAbility) C55096Ljo.LIZIZ(vScope, SearchServiceCenter$CardCommonAbility.class)).C40().getLayoutPosition());
                        jSONObject2.put("aladdin_rank", i3);
                        jSONObject2.put("is_live", 0);
                        SearchMixFeedBase searchMixFeedBase13 = jxs2.LJLIL;
                        if (searchMixFeedBase13 == null || (eComShopCardStruct10 = searchMixFeedBase13.shopCard) == null || (str9 = eComShopCardStruct10.userId) == null) {
                            str9 = "";
                        }
                        jSONObject2.put("author_id", str9);
                        jSONObject2.put("page_name", "general_search");
                        C48658J7u.LIZIZ("search_result_show", jSONObject2);
                        JSONObject jSONObject3 = new JSONObject();
                        SearchMixFeedBase searchMixFeedBase14 = jxs2.LJLIL;
                        if (searchMixFeedBase14 == null || (eComShopCardStruct9 = searchMixFeedBase14.shopCard) == null || (str10 = eComShopCardStruct9.shopId) == null) {
                            str10 = "";
                        }
                        jSONObject3.put("shop_id", str10);
                        SearchMixFeedBase searchMixFeedBase15 = jxs2.LJLIL;
                        if (searchMixFeedBase15 == null || (eComShopCardStruct8 = searchMixFeedBase15.shopCard) == null || (list2 = eComShopCardStruct8.addressCardProduct) == null || (addressCardProducts = (AddressCardProducts) ORZ.LJLLLLLL(0, list2)) == null || (str11 = addressCardProducts.platform) == null) {
                            str11 = CardStruct.IStatusCode.DEFAULT;
                        }
                        jSONObject3.put("product_source", str11);
                        java.util.Map<String, String> map = product.trackExtra;
                        if (map != null) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                if (o.LJ(entry.getKey(), "source_from")) {
                                    jSONObject3.put("source_from", entry.getValue());
                                }
                                if (o.LJ(entry.getKey(), "source")) {
                                    jSONObject3.put("source", entry.getValue());
                                }
                            }
                        }
                        String str18 = product.productId;
                        if (str18 == null) {
                            str18 = "";
                        }
                        jSONObject3.put("product_id", str18);
                        SearchMixFeedBase searchMixFeedBase16 = jxs2.LJLIL;
                        if (searchMixFeedBase16 != null && (eComShopCardStruct7 = searchMixFeedBase16.shopCard) != null) {
                            str12 = eComShopCardStruct7.userId;
                        } else {
                            str12 = null;
                        }
                        jSONObject3.put("is_self", TextUtils.equals(str12, ((RBX) HG3.LJIILL()).getCurUserId()) ? 1 : 0);
                        jSONObject3.put("item_order", i4);
                        jSONObject3.put("page_name", "general_search");
                        SearchMixFeedBase searchMixFeedBase17 = jxs2.LJLIL;
                        if (searchMixFeedBase17 != null && (eComShopCardStruct6 = searchMixFeedBase17.shopCard) != null && (user = eComShopCardStruct6.userInfo) != null) {
                            i2 = user.getFollowStatus();
                        } else {
                            i2 = 0;
                        }
                        jSONObject3.put("follow_status", i2);
                        jSONObject3.put("entrance_form", "shop_card");
                        jSONObject3.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(vScope, ISearchContextAbility.class)).If().LIZJ().LJLJI);
                        SearchMixFeedBase searchMixFeedBase18 = jxs2.LJLIL;
                        if (searchMixFeedBase18 == null || (eComShopCardStruct5 = searchMixFeedBase18.shopCard) == null || (str13 = eComShopCardStruct5.docId) == null) {
                            str13 = "";
                        }
                        jSONObject3.put("search_result_id", str13);
                        String str19 = product.productId;
                        if (str19 == null) {
                            str19 = "";
                        }
                        jSONObject3.put("list_item_id", str19);
                        jSONObject3.put("search_entrance", ((ISearchContextAbility) C55096Ljo.LIZIZ(vScope, ISearchContextAbility.class)).cs().LIZJ().LJLIL);
                        jSONObject3.put("enter_from", "general_search");
                        C48658J7u.LIZIZ("tiktokec_product_show", jSONObject3);
                    } else {
                        o.LJIIIZ(product, "product");
                        JSONObject LJ2 = C47135Ieh.LJ("page_name", "general_search", "enter_from_merge", "general_search");
                        LJ2.put("entrance_form", "search_live_card_anchor");
                        SearchMixFeedBase searchMixFeedBase19 = jxs2.LJLIL;
                        if (searchMixFeedBase19 == null || (eComShopCardStruct4 = searchMixFeedBase19.shopCard) == null || (str5 = eComShopCardStruct4.roomId) == null) {
                            str5 = "";
                        }
                        LJ2.put("list_item_id", str5);
                        LJ2.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(vScope, ISearchContextAbility.class)).If().LIZJ().LJLJI);
                        SearchMixFeedBase searchMixFeedBase20 = jxs2.LJLIL;
                        if (searchMixFeedBase20 == null || (eComShopCardStruct3 = searchMixFeedBase20.shopCard) == null || (str6 = eComShopCardStruct3.docId) == null) {
                            str6 = "";
                        }
                        LJ2.put("search_result_id", str6);
                        LJ2.put("list_result_type", "live");
                        LJII(product, jxs2, vScope, LJ2);
                        C48658J7u.LIZIZ("livesdk_tiktokec_product_entrance_show", LJ2);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("page_name", "general_search");
                        jSONObject4.put("enter_from_merge", "general_search");
                        jSONObject4.put("entrance_form", "search_live_card_anchor");
                        jSONObject4.put("list_item_id", product.productId);
                        jSONObject4.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(vScope, ISearchContextAbility.class)).If().LIZJ().LJLJI);
                        SearchMixFeedBase searchMixFeedBase21 = jxs2.LJLIL;
                        if (searchMixFeedBase21 == null || (eComShopCardStruct2 = searchMixFeedBase21.shopCard) == null || (str7 = eComShopCardStruct2.docId) == null) {
                            str7 = "";
                        }
                        jSONObject4.put("search_result_id", str7);
                        jSONObject4.put("list_result_type", "live");
                        jSONObject4.put("item_order", i4);
                        LJII(product, jxs2, vScope, jSONObject4);
                        C48658J7u.LIZIZ("livesdk_tiktokec_product_show", jSONObject4);
                    }
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public static final void LJIIIIZZ(EnterRoomConfig config, JXS jxs, InterfaceC55235Lm3 scope) {
        String str;
        SearchMixFeedBase searchMixFeedBase;
        String requestId;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct;
        o.LJIIIZ(config, "config");
        o.LJIIIZ(scope, "scope");
        EnterRoomConfig.LogData logData = config.mLogData;
        if (logData != null) {
            String str2 = "";
            if (jxs == null || (searchMixFeedBase2 = jxs.LJLIL) == null || (eComShopCardStruct = searchMixFeedBase2.shopCard) == null || (str = eComShopCardStruct.docId) == null) {
                str = "";
            }
            logData.search_result_id = str;
            String str3 = ((ISearchContextAbility) C55096Ljo.LIZIZ(scope, ISearchContextAbility.class)).If().LIZJ().LJLJI;
            EnterRoomConfig.LogData logData2 = config.mLogData;
            logData2.search_id = str3;
            if (jxs != null && (searchMixFeedBase = jxs.LJLIL) != null && (requestId = searchMixFeedBase.getRequestId()) != null) {
                str2 = requestId;
            }
            logData2.requestId = str2;
        }
    }

    public static void LJIILIIL(ActivityC45651qj activity, InterfaceC73997T2j interfaceC73997T2j, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
        if (interfaceC73997T2j == null) {
            int i = Build.VERSION.SDK_INT;
            if (i < 33 ? i < 23 || C04330Ez.LIZ(activity, "android.permission.READ_EXTERNAL_STORAGE") == 0 : C04330Ez.LIZ(activity, "android.permission.READ_MEDIA_IMAGES") == 0 && C04330Ez.LIZ(activity, "android.permission.READ_MEDIA_VIDEO") == 0) {
                C82890Wg2.LJFF.getClass();
                new C82890Wg2(activity, activity.getString(R.string.jga), 0, 1).LIZ();
                return;
            } else {
                interfaceC65784Pro.invoke();
                return;
            }
        }
        String[] strArr = (String[]) LJIIJ(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
        interfaceC73997T2j.LIZ(activity, strArr, new AqS162S0100000_12((InterfaceC65784Pro) null, 1042), new AqS162S0100000_12((InterfaceC65784Pro) null, 1043), new AqS121S0300000_2(strArr, (InterfaceC65784Pro) null, interfaceC65784Pro, 1));
    }

    public static final List LJIJ(MessagesPerUserResponseBody messagesPerUserResponseBody, String str, String str2) {
        o.LJIIIZ(messagesPerUserResponseBody, "<this>");
        return LJIJI(messagesPerUserResponseBody.messages_pb, messagesPerUserResponseBody.messages, 3, messagesPerUserResponseBody.next_cursor, str, str2);
    }

    public static final void LJJIII(String str, JXS jxs, InterfaceC55235Lm3 scope) {
        String str2;
        int i;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        o.LJIIIZ(scope, "scope");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("search_id", ((ISearchContextAbility) C55096Ljo.LIZIZ(scope, ISearchContextAbility.class)).If().LIZJ().LJLJI);
        jSONObject.put("enter_from", "general_search");
        if (jxs == null || (searchMixFeedBase2 = jxs.LJLIL) == null || (eComShopCardStruct2 = searchMixFeedBase2.shopCard) == null || (str2 = eComShopCardStruct2.docId) == null) {
            str2 = "";
        }
        jSONObject.put("search_result_id", str2);
        jSONObject.put("search_keyword", ((ISearchContextAbility) C55096Ljo.LIZIZ(scope, ISearchContextAbility.class)).If().LIZJ().LJLJJI);
        jSONObject.put("token_type", "shop");
        jSONObject.put("rank", ((SearchServiceCenter$CardCommonAbility) C55096Ljo.LIZIZ(scope, SearchServiceCenter$CardCommonAbility.class)).C40().getLayoutPosition());
        if (jxs != null && (searchMixFeedBase = jxs.LJLIL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && eComShopCardStruct.liveEntity != null) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("is_live", i);
        jSONObject.put("aladdin_button_type", str);
        jSONObject.put("page_name", "general_search");
        C48658J7u.LIZIZ("search_result_click", jSONObject);
    }

    public static User LJJIJ(int i, BadgeStruct badgeStruct, User user) {
        List<BadgeStruct> list;
        if (user != null && badgeStruct != null) {
            List<BadgeStruct> badgeList = user.getBadgeList();
            if (badgeList == null || badgeList.size() == 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(badgeStruct);
                list = arrayList;
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= badgeList.size()) {
                        break;
                    }
                    if (ListProtector.get(badgeList, i2) != null && ((BadgeStruct) ListProtector.get(badgeList, i2)).badgeScene == i) {
                        if (i2 >= 0) {
                            ListProtector.set(badgeList, i2, badgeStruct);
                            list = badgeList;
                        }
                    } else {
                        i2++;
                    }
                }
                badgeList.add(badgeStruct);
                list = badgeList;
            }
            user.setBadgeList(list);
        }
        return user;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00e0, code lost:
    
        if (r10 != null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts r9, X.JXS r10, X.InterfaceC55235Lm3 r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73994T2g.LJII(com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts, X.JXS, X.Lm3, org.json.JSONObject):void");
    }

    public static final List LJIIZILJ(MessagesInConversationResponseBody messagesInConversationResponseBody, int i, String str, String str2) {
        o.LJIIIZ(messagesInConversationResponseBody, "<this>");
        return LJIJI(messagesInConversationResponseBody.messages_pb, messagesInConversationResponseBody.messages, i, messagesInConversationResponseBody.next_cursor, str, str2);
    }

    public static final void LJJIJIIJI(int i, long j, long j2, String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from_merge", "homepage_follow");
        c188727au.LJIIIZ("enter_method", str);
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJ(j, "anchor_id");
        c188727au.LJ(j2, "room_id");
        c188727au.LIZLLL(i, "follow_status");
        c188727au.LIZLLL(0, "is_from_bubble");
        c188727au.LIZLLL(0, "is_from_cache");
        if (!TextUtils.equals("live_cover_recommend", str)) {
            c188727au.LIZLLL(1, "is_from_list");
        } else {
            c188727au.LJI("recommend_type", str2);
        }
        C78688UuS.LJJJJZ(c188727au.LIZ);
    }

    public static final List LJIJI(List list, List list2, int i, Long l, String str, String str2) {
        boolean z;
        long j;
        String str3;
        MessageBody messageBody;
        String str4;
        boolean z2 = true;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    messageBody = MessageBody.ADAPTER.decode((C64537PUn) it.next());
                } catch (IOException e) {
                    C63322OtC.LJI(str2, "getMessagesFromResponse failed to decode.", e);
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = -1;
                    }
                    Long valueOf = Long.valueOf(j);
                    if (str == null) {
                        str3 = "null_log_id";
                    } else {
                        str3 = str;
                    }
                    try {
                        if (e.getMessage() != null) {
                            str4 = e.getMessage();
                        } else {
                            str4 = "";
                        }
                        String stackTraceString = android.util.Log.getStackTraceString(e);
                        if (stackTraceString.length() > 2000) {
                            stackTraceString = stackTraceString.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                        }
                        C63323OtD c63323OtD = new C63323OtD();
                        c63323OtD.LIZJ("im_decode_msg_error");
                        c63323OtD.LIZ(Integer.valueOf(i), "msg_source");
                        c63323OtD.LIZ(str4, "error_msg");
                        c63323OtD.LIZ(stackTraceString, "error_stack");
                        c63323OtD.LIZ(valueOf, "next_cursor");
                        c63323OtD.LIZ(str3, "log_id");
                        c63323OtD.LIZLLL();
                    } catch (Exception unused) {
                    }
                    messageBody = null;
                }
                if (messageBody != null) {
                    arrayList.add(messageBody);
                }
            }
            return arrayList;
        }
        if (list2 != null && !list2.isEmpty()) {
            z2 = false;
        }
        if (!z2) {
            return list2;
        }
        return C61878OQg.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r3 = r19.LIZIZ.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r17 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r0 = r17.shippingToAddressInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r5 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping(r3, r0, null, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r19.LIZ.containsKey(r1) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r0 = r19.LIZ.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r9 = r0.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r19.LIZ.containsKey(r1) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        r0 = r19.LIZ.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r0 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        r13 = r0.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r13 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r22 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r17 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r17.pdpLogisticModule == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        r0 = r17.selectedLogistic;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        r2 = r0.logisticsServiceId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        r0 = r17.pdpLogisticModule.shippingModuleMap;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        r8 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        if (r8.hasNext() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
    
        r1 = r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2, r1.getKey()) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        r14 = r1.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
    
        if (r3 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        r3 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule(r3.moduleId, r3.meta, r3.moduleTitle, r14, r3.pdpShippingServiceModule, r3.pdpReturnPolicyModule, r3.shippingModuleMap);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ae, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c7, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        if (r9 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        r9 = r16.shipping;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f9, code lost:
    
        if (r9 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ff, code lost:
    
        r2 = X.EF7.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:
    
        if (r6 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0107, code lost:
    
        r4 = X.C79004UzY.LJJJJZ(r6, r2, r16.warehouseTag);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0112, code lost:
    
        return new X.C27129Akn(r4, r5, r21, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        r5 = r9.LIZ(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c9, code lost:
    
        r3 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule(r22.moduleId, r22.meta, r22.moduleTitle, r13, r22.pdpShippingServiceModule, r22.pdpReturnPolicyModule, r22.shippingModuleMap);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ed, code lost:
    
        r3 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e8, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e9, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ef, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f2, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0018, code lost:
    
        if (r17 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r0 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r1 = X.C27169AlR.LIZ(r23, r18, r0);
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r1 == null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C27129Akn LJJIL(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r16, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.PackedDeliverySelectResult r17, java.lang.String r18, X.RX6 r19, java.lang.String r20, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo r21, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule r22, java.lang.Integer r23) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73994T2g.LJJIL(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$PackedDeliverySelectResult, java.lang.String, X.RX6, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule, java.lang.Integer):X.Akn");
    }

    public static final AssemViewModel LJJIIJ(InterfaceC65784Pro interfaceC65784Pro, C214528bQ dispatcherFactory, AqS61S0110000_4 aqS61S0110000_4, AqS60S0110000_3 aqS60S0110000_3, InterfaceC65784Pro factoryProducer, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro interfaceC65784Pro3, InterfaceC88472Yns argumentsAcceptor, C65776Prg c65776Prg) {
        AssemViewModel LJJIIJZLJL;
        o.LJIIIZ(dispatcherFactory, "dispatcherFactory");
        o.LJIIIZ(factoryProducer, "factoryProducer");
        o.LJIIIZ(argumentsAcceptor, "argumentsAcceptor");
        if (C214368bA.LJI) {
            synchronized (c65776Prg) {
                LJJIIJZLJL = LJJIIJZLJL(factoryProducer, aqS60S0110000_3, interfaceC65784Pro, aqS61S0110000_4, interfaceC65784Pro2, interfaceC65784Pro3, dispatcherFactory, argumentsAcceptor, c65776Prg);
            }
            return LJJIIJZLJL;
        }
        return LJJIIJZLJL(factoryProducer, aqS60S0110000_3, interfaceC65784Pro, aqS61S0110000_4, interfaceC65784Pro2, interfaceC65784Pro3, dispatcherFactory, argumentsAcceptor, c65776Prg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AssemViewModel LJJIIJZLJL(InterfaceC65784Pro interfaceC65784Pro, AqS60S0110000_3 aqS60S0110000_3, InterfaceC65784Pro interfaceC65784Pro2, AqS61S0110000_4 aqS61S0110000_4, InterfaceC65784Pro interfaceC65784Pro3, InterfaceC65784Pro interfaceC65784Pro4, C214528bQ c214528bQ, InterfaceC88472Yns interfaceC88472Yns, C65776Prg c65776Prg) {
        AssemViewModel assemViewModel = (AssemViewModel) new ViewModelProvider((ViewModelStore) aqS60S0110000_3.invoke(), (ViewModelProvider.Factory) interfaceC65784Pro.invoke(), null, 4, 0 == true ? 1 : 0).get((String) interfaceC65784Pro2.invoke(), C39557Ffl.LIZ(c65776Prg));
        assemViewModel.setLifecycleRef(new WeakReference<>(((LifecycleOwner) aqS61S0110000_4.invoke()).getLifecycle()));
        assemViewModel.hierarchyDataStore = (C7C3) interfaceC65784Pro3.invoke();
        assemViewModel.hierarchyServiceStore = (C8VA) interfaceC65784Pro4.invoke();
        assemViewModel.initialize(c214528bQ.invoke(), interfaceC88472Yns);
        return assemViewModel;
    }
}
