package X;

import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import fjb.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel$preloadAwemeDetails$2", f = "EffectRecommendationCarouselViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class JG2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ EffectRecommendationCarouselViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JG2(EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel, InterfaceC67352kd<? super JG2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = effectRecommendationCarouselViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new JG2(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Aweme aweme;
        String aid;
        C141335gf.LIZJ(obj);
        C51589KMn c51589KMn = (C51589KMn) this.LJLIL.LJLJJL.getValue();
        if (c51589KMn == null) {
            return null;
        }
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = this.LJLIL;
        try {
            DetailFeedService LJIIJ = DetailFeedServiceImpl.LJIIJ();
            List<CardContent> list = c51589KMn.LIZJ;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<CardContent> it = list.iterator();
                while (it.hasNext()) {
                    List<Aweme> list2 = it.next().awemeList;
                    if (list2 != null && (aweme = (Aweme) ORZ.LJLLLL(list2)) != null && (aid = aweme.getAid()) != null) {
                        arrayList.add(aid);
                    }
                }
            } else {
                arrayList = null;
            }
            List<Aweme> list3 = LJIIJ.LJII(String.valueOf(arrayList)).items;
            if (list3 == null) {
                return null;
            }
            for (Aweme it2 : list3) {
                List<Aweme> list4 = effectRecommendationCarouselViewModel.LJLLI;
                o.LJIIIIZZ(it2, "it");
                ((ArrayList) list4).add(it2);
            }
            return C76800UCe.LIZ;
        } catch (IOException e) {
            H78.LJ(e);
            return C76800UCe.LIZ;
        } catch (RuntimeException e2) {
            H78.LJ(e2);
            return C76800UCe.LIZ;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
