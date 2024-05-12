package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.EcUgVSAData;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NHP {
    public static final /* synthetic */ int LIZ = 0;

    public static Bundle LIZIZ(Context context, Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        Bundle bundle = new Bundle();
        NLW LIZ2 = NGL.LIZ();
        if (LIZ2 != null) {
            LIZ2.LJIIIIZZ(context, bundle, aweme);
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd.getNativeSiteCustomData();
        } else {
            str = null;
        }
        bundle.putString("bundle_native_site_custom_data", str);
        return bundle;
    }

    public static m LIZ(Aweme aweme, CardStruct cardStruct, Context context) {
        String str;
        String str2;
        String str3;
        User author;
        User author2;
        UrlModel avatarMedium;
        List<String> urlList;
        String jSONObject;
        String str4;
        String str5;
        String str6;
        int i;
        Integer adType;
        List<String> urlList2;
        m mVar = new m();
        String str7 = "";
        Number number = null;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                Long adId = awemeRawAd.getAdId();
                if (adId != null) {
                    str4 = String.valueOf(adId);
                } else {
                    str4 = null;
                }
                mVar.LJJIIZ("adId", str4);
                mVar.LJJIIZ("creativeId", awemeRawAd.getCreativeIdStr());
                mVar.LJJIIZ("logExtra", awemeRawAd.getLogExtra());
                Long groupId = awemeRawAd.getGroupId();
                if (groupId != null) {
                    str5 = String.valueOf(groupId);
                } else {
                    str5 = null;
                }
                mVar.LJJIIZ("groupId", str5);
                UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                if (clickTrackUrlList != null && (urlList2 = clickTrackUrlList.getUrlList()) != null && !urlList2.isEmpty()) {
                    g gVar = new g();
                    Iterator<String> it = urlList2.iterator();
                    while (it.hasNext()) {
                        gVar.LJJIIJ(it.next());
                    }
                    mVar.LJJII("clickTrackUrlList", gVar);
                }
                String nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
                if (nativeSiteAdInfo == null) {
                    nativeSiteAdInfo = "";
                }
                mVar.LJJIIZ("pageData", nativeSiteAdInfo);
                NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    str6 = nativeSiteConfig.getLynxScheme();
                } else {
                    str6 = null;
                }
                mVar.LJJIIZ("lynxSchema", str6);
                EcUgVSAData ecUgVSAData = awemeRawAd.getEcUgVSAData();
                if (ecUgVSAData != null && (adType = ecUgVSAData.getAdType()) != null) {
                    i = adType.intValue();
                } else {
                    i = 0;
                }
                mVar.LJJIIJ("vsaType", Integer.valueOf(i));
            }
            str = aweme.getAid();
        } else {
            str = null;
        }
        mVar.LJJIIZ("itemId", String.valueOf(str));
        mVar.LJJIIJ("isRTL", Integer.valueOf(C90193gN.LIZIZ(context) ? 1 : 0));
        if (cardStruct != null) {
            JSONObject cardData = cardStruct.getCardData();
            if (cardData != null && (jSONObject = cardData.toString()) != null) {
                str7 = jSONObject;
            }
            mVar.LJJIIZ("cardData", str7);
        }
        mVar.LJJIIJ("topSafeAreaHeight", Integer.valueOf(C63081OpJ.LJJJJLI(context)));
        mVar.LJJIIJ("isCardState", 1);
        if (aweme != null && C63081OpJ.LLJJJJ(aweme)) {
            User author3 = aweme.getAuthor();
            if (author3 != null && (avatarMedium = author3.getAvatarMedium()) != null && (urlList = avatarMedium.getUrlList()) != null) {
                str2 = (String) ListProtector.get(urlList, 0);
            } else {
                str2 = null;
            }
            mVar.LJJIIZ("userAvatar", str2);
            if (aweme != null && (author2 = aweme.getAuthor()) != null) {
                str3 = author2.getUniqueId();
            } else {
                str3 = null;
            }
            mVar.LJJIIZ("userNickname", str3);
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                number = Integer.valueOf(author.getFollowerCount());
            }
            mVar.LJJIIJ("followNumber", number);
        }
        return mVar;
    }
}
