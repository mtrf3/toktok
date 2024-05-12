package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ComponentData;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NKM implements InterfaceC59183NKp {
    public static WeakReference<Context> LIZJ;
    public static final NKM LIZ = new NKM();
    public static final ConcurrentHashMap<String, NKN> LIZIZ = new ConcurrentHashMap<>();
    public static final String LIZLLL = "feed_lynx_product_banner_preload_cache_error";
    public static final int LJ = 6;
    public static final int LJFF = 4;

    @Override // X.InterfaceC59183NKp
    public final boolean LJI() {
        return true;
    }

    @Override // X.InterfaceC59183NKp
    public final int LIZIZ() {
        return LJFF().size();
    }

    @Override // X.InterfaceC59183NKp
    public final int LJ() {
        return LJ;
    }

    @Override // X.InterfaceC59183NKp
    public final ConcurrentHashMap<String, NKN> LJFF() {
        return LIZIZ;
    }

    @Override // X.InterfaceC59183NKp
    public final String LJII() {
        return LIZLLL;
    }

    @Override // X.InterfaceC59183NKp
    public final int LJIIIZ() {
        return LJFF;
    }

    @Override // X.InterfaceC59183NKp
    public final WeakReference<Context> LJIILIIL() {
        return LIZJ;
    }

    @Override // X.InterfaceC59183NKp
    public final void releaseAll() {
        C59182NKo.LJ(this);
    }

    @Override // X.InterfaceC59183NKp
    public final AbstractC59184NKq LIZ(String str) {
        return C59182NKo.LIZIZ(this, str);
    }

    @Override // X.InterfaceC59183NKp
    public final boolean LIZJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && awemeRawAd.getLiveAdCardModel() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC59183NKp, X.InterfaceC58172Qb
    public final void LIZLLL(String str) {
        C59182NKo.LJFF(this, str);
    }

    @Override // X.InterfaceC58172Qb
    public final void LJIIIIZZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        C59182NKo.LIZLLL(this, aweme);
    }

    @Override // X.InterfaceC59183NKp
    public final void LJIIL(WeakReference<Context> weakReference) {
        LIZJ = weakReference;
    }

    public final void LJIILJJIL(Context context) {
        C59182NKo.LIZ(this, context);
        C42625Go9.LIZIZ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(F9N event) {
        int i;
        int i2;
        o.LJIIIZ(event, "event");
        Iterator LIZLLL2 = C47135Ieh.LIZLLL(LIZIZ, "cacheModelMap.values");
        while (LIZLLL2.hasNext()) {
            NKN nkn = (NKN) LIZLLL2.next();
            NKR nkr = nkn.LJIIJ;
            if (nkr != null) {
                int i3 = event.LJLILLLLZI;
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = nkr.LIZ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                    i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode();
                } else {
                    i = 0;
                }
                if (i3 == i) {
                    if (event.LJLIL == 1) {
                        i2 = 3;
                    } else {
                        i2 = 2;
                    }
                    nkn.LIZLLL(i2);
                }
            }
        }
    }

    @Override // X.InterfaceC58172Qb
    public final void LJIIJ(int i, List list) {
        o.LJIIIZ(list, "list");
        C59182NKo.LIZJ(i, this, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC59183NKp
    public final void LJIIJJI(Context context, Aweme aweme) {
        LiveAdCardModel liveAdCardModel;
        ComponentData componentData;
        CardStruct cardInfo;
        String cardUrl;
        Integer num;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        User user;
        String str;
        String str2;
        Number number;
        UrlModel avatarMedium;
        List<String> urlList;
        String jSONObject;
        String str3;
        String str4;
        String str5;
        List<String> urlList2;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
        o.LJIIIZ(aweme, "aweme");
        NKN nkn = new NKN(aweme);
        String str6 = null;
        nkn.LIZLLL = new SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS(context, null == true ? 1 : 0, 62);
        nkn.LIZJ = new C60193Njp(context, null, 6, 0);
        NKR nkr = new NKR(NGL.LIZ(), nkn);
        nkn.LJIIJ = nkr;
        nkr.LIZLLL = false;
        nkr.LJ = false;
        ConcurrentHashMap<String, NKN> concurrentHashMap = LIZIZ;
        NKN nkn2 = concurrentHashMap.get(aweme.getAid());
        if (nkn2 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = nkn2.LIZLLL) != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = nkn2.LIZLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3);
            }
            nkn2.LJ = null;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        concurrentHashMap.put(aid, nkn);
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (liveAdCardModel = awemeRawAd.getLiveAdCardModel()) != null && (componentData = liveAdCardModel.getComponentData()) != null && (cardInfo = componentData.getCardInfo()) != null && (cardUrl = cardInfo.getCardUrl()) != null) {
            Uri.Builder buildUpon = UriProtector.parse(cardUrl).buildUpon();
            m mVar = new m();
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            String str7 = "";
            if (awemeRawAd2 != null) {
                Long adId = awemeRawAd2.getAdId();
                if (adId != null) {
                    str3 = String.valueOf(adId);
                } else {
                    str3 = null;
                }
                mVar.LJJIIZ("adId", str3);
                mVar.LJJIIZ("creativeId", awemeRawAd2.getCreativeIdStr());
                mVar.LJJIIZ("logExtra", awemeRawAd2.getLogExtra());
                Long groupId = awemeRawAd2.getGroupId();
                if (groupId != null) {
                    str4 = String.valueOf(groupId);
                } else {
                    str4 = null;
                }
                mVar.LJJIIZ("groupId", str4);
                UrlModel clickTrackUrlList = awemeRawAd2.getClickTrackUrlList();
                if (clickTrackUrlList != null && (urlList2 = clickTrackUrlList.getUrlList()) != null && !urlList2.isEmpty()) {
                    g gVar = new g();
                    Iterator<String> it = urlList2.iterator();
                    while (it.hasNext()) {
                        gVar.LJJIIJ(it.next());
                    }
                    mVar.LJJII("clickTrackUrlList", gVar);
                }
                String nativeSiteAdInfo = awemeRawAd2.getNativeSiteAdInfo();
                if (nativeSiteAdInfo == null) {
                    nativeSiteAdInfo = "";
                }
                mVar.LJJIIZ("pageData", nativeSiteAdInfo);
                NativeSiteConfig nativeSiteConfig = awemeRawAd2.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    str5 = nativeSiteConfig.getLynxScheme();
                } else {
                    str5 = null;
                }
                mVar.LJJIIZ("lynxSchema", str5);
            }
            mVar.LJJIIZ("itemId", String.valueOf(aweme.getAid()));
            mVar.LJJIIJ("isRTL", Integer.valueOf(C90193gN.LIZIZ(context) ? 1 : 0));
            JSONObject cardData = cardInfo.getCardData();
            if (cardData != null && (jSONObject = cardData.toString()) != null) {
                str7 = jSONObject;
            }
            mVar.LJJIIZ("cardData", str7);
            mVar.LJJIIJ("topSafeAreaHeight", Integer.valueOf(C63081OpJ.LJJJJLI(context)));
            mVar.LJJIIJ("isCardState", 1);
            if (C63081OpJ.LLJJJJ(aweme)) {
                User author = aweme.getAuthor();
                if (author != null && (avatarMedium = author.getAvatarMedium()) != null && (urlList = avatarMedium.getUrlList()) != null) {
                    str = (String) ListProtector.get(urlList, 0);
                } else {
                    str = null;
                }
                mVar.LJJIIZ("userAvatar", str);
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    str2 = author2.getUniqueId();
                } else {
                    str2 = null;
                }
                mVar.LJJIIZ("userNickname", str2);
                User author3 = aweme.getAuthor();
                if (author3 != null) {
                    number = Integer.valueOf(author3.getFollowerCount());
                } else {
                    number = null;
                }
                mVar.LJJIIJ("followNumber", number);
            }
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 == null) {
                awemeRawAd3 = new AwemeRawAd();
            }
            AdLiveEnterRoomConfig LIZ2 = C59406NTe.LIZ(aweme, awemeRawAd3);
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData != null && (user = newLiveRoomData.owner) != null) {
                num = Integer.valueOf(user.getFollowStatus());
            } else {
                num = null;
            }
            LIZ2.followStatus = String.valueOf(num);
            mVar.LJJIIZ("adLiveJson", C75792yF.LIZJ(LIZ2));
            Object liveProduct = liveAdCardModel.getLiveProduct();
            if (liveProduct != null) {
                mVar.LJJIIZ("productInfo", C75792yF.LIZJ(liveProduct));
            }
            Object frontendExtraData = liveAdCardModel.getFrontendExtraData();
            if (frontendExtraData != null) {
                mVar.LJJIIZ("frontendExtraData", C75792yF.LIZJ(frontendExtraData));
            }
            buildUpon.appendQueryParameter("initialData", mVar.toString());
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 = nkn.LIZLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4.getKitView() != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = nkn.LIZLLL) != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
            }
            NKR nkr2 = nkn.LJIIJ;
            if (nkr2 != null) {
                String builder = buildUpon.toString();
                o.LJIIIIZZ(builder, "urlBuilder.toString()");
                Bundle bundle = new Bundle();
                NLW LIZ3 = NGL.LIZ();
                if (LIZ3 != null) {
                    LIZ3.LJIIIIZZ(context, bundle, aweme);
                }
                AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                if (awemeRawAd4 != null) {
                    str6 = awemeRawAd4.getNativeSiteCustomData();
                }
                bundle.putString("bundle_native_site_custom_data", str6);
                nkr2.LIZ(bundle, builder);
            }
        }
    }

    public final void LJIILL(int i, List<? extends Aweme> items) {
        o.LJIIIZ(items, "items");
        C59182NKo.LJI(i, this, items);
    }
}
