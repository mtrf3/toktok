package X;

import Y.IDuS315S0100000_3;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.explore.api.ExploreFeedApi;
import com.ss.android.ugc.aweme.explore.data.ExploreRelatedAwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.RelatedAweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8B3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8B3 {
    public static final C8B3 LIZ = new C8B3();
    public static final ExploreFeedApi.ExploreFeedRetrofitService LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (ExploreFeedApi.ExploreFeedRetrofitService) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, ExploreFeedApi.ExploreFeedRetrofitService.class);
    }

    public static void LIZ(Throwable th, boolean z) {
        if (th instanceof C64799Pbv) {
            StringBuilder LJI = JBR.LJI("explore query cronet error, isRelated", z, ", rid ");
            C1FJ.LJFF(LJI, ((C64800Pbw) th).traceCode, LJI, 6, "exploreFeed");
            return;
        }
        if (th instanceof C38333F2r) {
            StringBuilder LJI2 = JBR.LJI("explore related query error, isRelated", z, " ,");
            LJI2.append(((C38333F2r) th).getResponse());
            C36922EeM.LIZLLL(6, "exploreFeed", X1D.LIZIZ(LJI2));
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("explore related query error, isRelated");
            LIZ2.append(z);
            LIZ2.append(" ,");
            LIZ2.append(th);
            C36922EeM.LIZLLL(6, "exploreFeed", X1D.LIZIZ(LIZ2));
        }
    }

    public final C73422Sri LIZIZ(int i, int i2, List list) {
        ExploreFeedApi.ExploreFeedRetrofitService exploreFeedRetrofitService = LIZIZ;
        Gson LIZIZ2 = C75792yF.LIZIZ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass837 anonymousClass837 = (AnonymousClass837) it.next();
            arrayList.add(new ExploreFeedApi.ExploreAwemeReqestParam(anonymousClass837.LIZ, anonymousClass837.LIZIZ, i));
        }
        String json = GsonProtectorUtils.toJson(LIZIZ2, arrayList);
        o.LJIIIIZZ(json, "getGson().toJson(map { E…, it.awemeType, count) })");
        return AbstractC73672Svk.LJIIJ(new IDuS315S0100000_3(exploreFeedRetrofitService.queryRelatedExploreAwemeList(json, i2, C206928Ae.LIZ, C206978Aj.LIZ()), 0)).LJJIJL(new InterfaceC48038ItG() { // from class: X.8B6
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                ExploreRelatedAwemeList relatedExploreAwemeList = (ExploreRelatedAwemeList) obj;
                o.LJIIIZ(relatedExploreAwemeList, "relatedExploreAwemeList");
                if (C78685UuP.LJJJZ(relatedExploreAwemeList.getRequestId())) {
                    List<? extends RelatedAweme> list2 = relatedExploreAwemeList.relatedAwemes;
                    if (list2 != null) {
                        for (RelatedAweme relatedAweme : list2) {
                            List<Aweme> list3 = relatedAweme.awemeList;
                            if (list3 != null) {
                                int i3 = 0;
                                for (Aweme aweme : list3) {
                                    int i4 = i3 + 1;
                                    if (i3 >= 0) {
                                        Aweme R1 = AwemeService.LIZ().R1(aweme);
                                        List<Aweme> list4 = relatedAweme.awemeList;
                                        if (list4 != null) {
                                            ListProtector.set(list4, i3, R1);
                                        }
                                        if (R1 != null) {
                                            R1.setRequestId(relatedExploreAwemeList.getRequestId());
                                            R1.setLogPbBean(relatedExploreAwemeList.logPb);
                                            IRequestIdService LJ = RequestIdService.LJ();
                                            StringBuilder LIZ2 = X1D.LIZ();
                                            LIZ2.append(R1.getAid());
                                            LIZ2.append("35");
                                            LJ.LIZJ(i3, X1D.LIZIZ(LIZ2), relatedExploreAwemeList.getRequestId());
                                        }
                                        i3 = i4;
                                    } else {
                                        C47261Igj.LJJJJJ();
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                    C3A5.LIZ.LJFF(relatedExploreAwemeList.getRequestId(), relatedExploreAwemeList.logPb);
                }
                return relatedExploreAwemeList;
            }
        }).LJIJJ(new InterfaceC64592gB() { // from class: X.8B9
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                Throwable it2 = (Throwable) obj;
                o.LJIIIIZZ(it2, "it");
                C8B3.LIZ(it2, true);
            }
        }).LJIJJLI(new InterfaceC64592gB() { // from class: X.8B5
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("explore related success, rid ");
                LIZ2.append(((ExploreRelatedAwemeList) obj).getRequestId());
                C36922EeM.LIZLLL(4, "exploreFeed", X1D.LIZIZ(LIZ2));
            }
        });
    }
}
