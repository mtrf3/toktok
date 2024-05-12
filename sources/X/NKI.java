package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.live.feed.banner.FeedLiveLynxBannerImpl$loadLynxBanner$1", f = "FeedLiveLynxBannerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NKI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ NKL LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKI(NKL nkl, InterfaceC67352kd<? super NKI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = nkl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new NKI(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String cardUrl;
        String str;
        AwemeRawAd awemeRawAd;
        Object frontendExtraData;
        Object liveProduct;
        Integer num;
        User user;
        String jSONObject;
        AwemeRawAd awemeRawAd2;
        String str2;
        String str3;
        String str4;
        C141335gf.LIZJ(obj);
        CardStruct cardStruct = this.LJLIL.LIZLLL;
        if (cardStruct != null && (cardUrl = cardStruct.getCardUrl()) != null) {
            NKL nkl = this.LJLIL;
            Uri.Builder buildUpon = UriProtector.parse(cardUrl).buildUpon();
            nkl.getClass();
            m mVar = new m();
            Aweme aweme = nkl.LIZIZ;
            String str5 = null;
            String str6 = "";
            if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                Long adId = awemeRawAd2.getAdId();
                if (adId != null) {
                    str2 = String.valueOf(adId);
                } else {
                    str2 = null;
                }
                mVar.LJJIIZ("adId", str2);
                mVar.LJJIIZ("creativeId", awemeRawAd2.getCreativeIdStr());
                mVar.LJJIIZ("logExtra", awemeRawAd2.getLogExtra());
                Long groupId = awemeRawAd2.getGroupId();
                if (groupId != null) {
                    str3 = String.valueOf(groupId);
                } else {
                    str3 = null;
                }
                mVar.LJJIIZ("groupId", str3);
                UrlModel clickTrackUrlList = awemeRawAd2.getClickTrackUrlList();
                o.LJII(clickTrackUrlList, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
                List<String> clickTrackUrlList2 = clickTrackUrlList.getUrlList();
                if (clickTrackUrlList2 != null && !clickTrackUrlList2.isEmpty()) {
                    g gVar = new g();
                    o.LJIIIIZZ(clickTrackUrlList2, "clickTrackUrlList");
                    Iterator<String> it = clickTrackUrlList2.iterator();
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
                    str4 = nativeSiteConfig.getLynxScheme();
                } else {
                    str4 = null;
                }
                mVar.LJJIIZ("lynxSchema", str4);
            }
            Aweme aweme2 = nkl.LIZIZ;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            mVar.LJJIIZ("itemId", String.valueOf(str));
            mVar.LJJIIJ("isRTL", Integer.valueOf(C90193gN.LIZIZ(nkl.LIZ.getContext()) ? 1 : 0));
            CardStruct cardStruct2 = nkl.LIZLLL;
            if (cardStruct2 != null) {
                JSONObject cardData = cardStruct2.getCardData();
                if (cardData != null && (jSONObject = cardData.toString()) != null) {
                    str6 = jSONObject;
                }
                mVar.LJJIIZ("cardData", str6);
            }
            Context context = nkl.LIZ.getContext();
            o.LJIIIIZZ(context, "container.context");
            mVar.LJJIIJ("topSafeAreaHeight", Integer.valueOf(C63081OpJ.LJJJJLI(context)));
            mVar.LJJIIJ("isCardState", 1);
            mVar.LJJIIJ("enableCardCloseButton", 0);
            Aweme aweme3 = nkl.LIZIZ;
            if (aweme3 != null) {
                AwemeRawAd awemeRawAd3 = aweme3.getAwemeRawAd();
                if (awemeRawAd3 == null) {
                    awemeRawAd3 = new AwemeRawAd();
                }
                AdLiveEnterRoomConfig LIZ = C59406NTe.LIZ(aweme3, awemeRawAd3);
                LiveRoomStruct newLiveRoomData = aweme3.getNewLiveRoomData();
                if (newLiveRoomData != null && (user = newLiveRoomData.owner) != null) {
                    num = Integer.valueOf(user.getFollowStatus());
                } else {
                    num = null;
                }
                LIZ.followStatus = String.valueOf(num);
                mVar.LJJIIZ("adLiveJson", C75792yF.LIZJ(LIZ));
            }
            LiveAdCardModel liveAdCardModel = nkl.LIZJ;
            if (liveAdCardModel != null && (liveProduct = liveAdCardModel.getLiveProduct()) != null) {
                mVar.LJJIIZ("productInfo", C75792yF.LIZJ(liveProduct));
            }
            LiveAdCardModel liveAdCardModel2 = nkl.LIZJ;
            if (liveAdCardModel2 != null && (frontendExtraData = liveAdCardModel2.getFrontendExtraData()) != null) {
                mVar.LJJIIZ("frontendExtraData", C75792yF.LIZJ(frontendExtraData));
            }
            String jVar = mVar.toString();
            o.LJIIIIZZ(jVar, "dataObj.toString()");
            buildUpon.appendQueryParameter("initialData", jVar);
            NKQ nkq = nkl.LJIIIIZZ;
            String builder = buildUpon.toString();
            o.LJIIIIZZ(builder, "urlBuilder.toString()");
            Bundle bundle = new Bundle();
            Context context2 = nkl.LIZ.getContext();
            NLW nlw = (NLW) nkl.LJII.getValue();
            if (nlw != null) {
                Aweme aweme4 = nkl.LIZIZ;
                o.LJIIIIZZ(context2, "context");
                nlw.LJIIIIZZ(context2, bundle, aweme4);
            }
            Aweme aweme5 = nkl.LIZIZ;
            if (aweme5 != null && (awemeRawAd = aweme5.getAwemeRawAd()) != null) {
                str5 = awemeRawAd.getNativeSiteCustomData();
            }
            bundle.putString("bundle_native_site_custom_data", str5);
            nkq.LIZ(bundle, builder);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
