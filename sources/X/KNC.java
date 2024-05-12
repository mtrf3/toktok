package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.recommendationcard.data.BusinessInfo;
import com.ss.android.ugc.aweme.recommendationcard.data.CardMaterials;
import com.ss.android.ugc.aweme.recommendationcard.data.FeedCardEventTrackInfo;
import com.ss.android.ugc.aweme.recommendationcard.data.FeedCardTemplate;
import com.ss.android.ugc.aweme.recommendationcard.data.FeedEventCardInfo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.recommendationcard.data.ParseCardMaterialsUseCase$execute$2", f = "ParseCardMaterialsUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KNC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends CardMaterials, ? extends String>>, Object> {
    public final /* synthetic */ Aweme LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KNC(Aweme aweme, InterfaceC67352kd<? super KNC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KNC(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        FeedEventCardInfo feedEventCardInfo;
        FeedCardTemplate feedCardTemplate;
        FeedCardEventTrackInfo feedCardEventTrackInfo;
        CardInsertInfo cardInsertInfo;
        C141335gf.LIZJ(obj);
        try {
            Gson LIZ = C6YQ.LIZ();
            Aweme aweme = this.LJLIL;
            if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null) {
                str = cardInsertInfo.getCardInsertStatus();
            } else {
                str = null;
            }
            KNB.LIZ = (CardMaterials) GsonProtectorUtils.fromJson(LIZ, str, CardMaterials.class);
            Gson LIZ2 = C6YQ.LIZ();
            CardMaterials cardMaterials = KNB.LIZ;
            if (cardMaterials != null && (feedEventCardInfo = cardMaterials.feedEventCardInfo) != null && (feedCardTemplate = feedEventCardInfo.feedCardTemplate) != null && (feedCardEventTrackInfo = feedCardTemplate.feedCardEventTrackInfo) != null) {
                str2 = feedCardEventTrackInfo.businessInfo;
            } else {
                str2 = null;
            }
            KNB.LIZIZ = (BusinessInfo) GsonProtectorUtils.fromJson(LIZ2, str2, BusinessInfo.class);
            CardMaterials cardMaterials2 = KNB.LIZ;
            BusinessInfo businessInfo = KNB.LIZIZ;
            if (businessInfo != null) {
                str3 = businessInfo.musicId;
            } else {
                str3 = null;
            }
            return new OSZ(cardMaterials2, str3);
        } catch (s e) {
            KNB.LIZ = null;
            KNB.LIZIZ = null;
            H78.LJ(e);
            return new OSZ(null, null);
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends CardMaterials, ? extends String>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
