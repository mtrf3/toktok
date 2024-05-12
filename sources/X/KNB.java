package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.recommendationcard.data.BusinessInfo;
import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import com.ss.android.ugc.aweme.recommendationcard.data.CardMaterials;
import com.ss.android.ugc.aweme.recommendationcard.data.EffectStructV2;
import com.ss.android.ugc.aweme.recommendationcard.data.UrlStructV2;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class KNB {
    public static CardMaterials LIZ;
    public static BusinessInfo LIZIZ;

    public static Object LIZ(Aweme aweme, InterfaceC67352kd interfaceC67352kd) {
        BusinessInfo businessInfo;
        CardMaterials cardMaterials = LIZ;
        if (cardMaterials != null && (businessInfo = LIZIZ) != null) {
            return new OSZ(cardMaterials, businessInfo.musicId);
        }
        return XKX.LJI(C78613UtF.LIZ, new KNC(aweme, null), interfaceC67352kd);
    }

    public static void LIZIZ(CardMaterials cardMaterials, Context context) {
        List<CardContent> list;
        List<String> list2;
        UrlStructV2 urlStructV2;
        if (cardMaterials != null && (list = cardMaterials.cardContent) != null) {
            Iterator<CardContent> it = list.iterator();
            while (it.hasNext()) {
                EffectStructV2 effectStructV2 = it.next().effect;
                if (effectStructV2 != null && (urlStructV2 = effectStructV2.iconUrl) != null) {
                    list2 = urlStructV2.urlList;
                } else {
                    list2 = null;
                }
                W5F LJIIIZ = W5U.LJIIIZ(new C62562cu(list2));
                LJIIIZ.LIZJ = context;
                LJIIIZ.LJI();
            }
        }
    }

    public static void LIZJ(CardMaterials cardMaterials, Context context) {
        List<CardContent> list;
        List<String> list2;
        Aweme aweme;
        Video video;
        UrlModel originCover;
        if (cardMaterials != null && (list = cardMaterials.cardContent) != null) {
            Iterator<CardContent> it = list.iterator();
            while (it.hasNext()) {
                List<Aweme> list3 = it.next().awemeList;
                if (list3 != null && (aweme = (Aweme) ORZ.LJLLLL(list3)) != null && (video = aweme.getVideo()) != null && (originCover = video.getOriginCover()) != null) {
                    list2 = originCover.getUrlList();
                } else {
                    list2 = null;
                }
                W5F LJIIIZ = W5U.LJIIIZ(new C62562cu(list2));
                LJIIIZ.LIZJ = context;
                LJIIIZ.LJI();
            }
        }
    }
}
