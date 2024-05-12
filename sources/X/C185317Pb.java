package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM$toggleFavorite$2$1$2", f = "TopicRecommendListVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Pb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185317Pb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ TopicRawInfo LJLILLLLZI;
    public final /* synthetic */ C7PV LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ TopicRecommendListVM LJLJJL;
    public final /* synthetic */ XGX<? extends InterfaceC199277rv> LJLJJLL;
    public final /* synthetic */ InterfaceC70422pa LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C185317Pb(C34K c34k, TopicRawInfo topicRawInfo, C7PV c7pv, String str, TopicRecommendListVM topicRecommendListVM, XGX<? extends InterfaceC199277rv> xgx, InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C185317Pb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c34k;
        this.LJLILLLLZI = topicRawInfo;
        this.LJLJI = c7pv;
        this.LJLJJI = str;
        this.LJLJJL = topicRecommendListVM;
        this.LJLJJLL = xgx;
        this.LJLJL = interfaceC70422pa;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C185317Pb(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        String str3;
        BaseResponse.ServerTimeExtra serverTimeExtra2;
        C141335gf.LIZJ(obj);
        if (!o.LJ(Boolean.valueOf(!this.LJLIL.element), this.LJLILLLLZI.isCollected)) {
            C7OG.LIZLLL(this.LJLJI, this.LJLJJI, !this.LJLIL.element);
            TopicRecommendListVM topicRecommendListVM = this.LJLJJL;
            boolean z = !this.LJLIL.element;
            String str4 = this.LJLJJI;
            String str5 = this.LJLILLLLZI.title;
            if (str5 == null) {
                str5 = "";
            }
            InterfaceC199277rv interfaceC199277rv = (InterfaceC199277rv) ((XGW) this.LJLJJLL).LJ;
            if (topicRecommendListVM.LJLIL != null) {
                C7PR gv0 = topicRecommendListVM.gv0();
                C7PR c7pr = C7PR.BOOK;
                if (gv0 == c7pr) {
                    if (z) {
                        str = "favorite_topic";
                    } else {
                        str = "cancel_favorite_book";
                    }
                    C188727au c188727au = new C188727au();
                    if (z) {
                        str2 = "favorite_from";
                    } else {
                        str2 = "cancel_from";
                    }
                    c188727au.LJIIIZ(str2, "topic_recommend_page");
                    c188727au.LJIIIZ("book_id", str4);
                    c188727au.LJIIIZ("book_title", str5);
                    if (interfaceC199277rv instanceof C185457Pp) {
                        BaseResponse baseResponse = ((C185457Pp) interfaceC199277rv).LIZ;
                        if (baseResponse != null && (serverTimeExtra2 = baseResponse.extra) != null) {
                            str3 = serverTimeExtra2.logid;
                            LogPbBean logPbBean = new LogPbBean();
                            logPbBean.setImprId(str3);
                            String LIZ = C3A5.LIZ.LIZ(logPbBean);
                            o.LJIIIIZZ(LIZ, "getInstance().formatLogPb(logPb)");
                            c188727au.LJIIIZ("log_pb", LIZ);
                            c188727au.LJIIIZ("category", c7pr.getCategory());
                            FMX.LJIIL(str, c188727au.LIZ);
                        }
                        str3 = null;
                        LogPbBean logPbBean2 = new LogPbBean();
                        logPbBean2.setImprId(str3);
                        String LIZ2 = C3A5.LIZ.LIZ(logPbBean2);
                        o.LJIIIIZZ(LIZ2, "getInstance().formatLogPb(logPb)");
                        c188727au.LJIIIZ("log_pb", LIZ2);
                        c188727au.LJIIIZ("category", c7pr.getCategory());
                        FMX.LJIIL(str, c188727au.LIZ);
                    } else {
                        o.LJII(interfaceC199277rv, "null cannot be cast to non-null type com.ss.android.ugc.aweme.topic.book.detail.api.UnCollectBookMutation.Data");
                        BaseResponse baseResponse2 = ((C185467Pq) interfaceC199277rv).LIZ;
                        if (baseResponse2 != null && (serverTimeExtra = baseResponse2.extra) != null) {
                            str3 = serverTimeExtra.logid;
                            LogPbBean logPbBean22 = new LogPbBean();
                            logPbBean22.setImprId(str3);
                            String LIZ22 = C3A5.LIZ.LIZ(logPbBean22);
                            o.LJIIIIZZ(LIZ22, "getInstance().formatLogPb(logPb)");
                            c188727au.LJIIIZ("log_pb", LIZ22);
                            c188727au.LJIIIZ("category", c7pr.getCategory());
                            FMX.LJIIL(str, c188727au.LIZ);
                        }
                        str3 = null;
                        LogPbBean logPbBean222 = new LogPbBean();
                        logPbBean222.setImprId(str3);
                        String LIZ222 = C3A5.LIZ.LIZ(logPbBean222);
                        o.LJIIIIZZ(LIZ222, "getInstance().formatLogPb(logPb)");
                        c188727au.LJIIIZ("log_pb", LIZ222);
                        c188727au.LJIIIZ("category", c7pr.getCategory());
                        FMX.LJIIL(str, c188727au.LIZ);
                    }
                }
            }
        }
        C48841JEv.LIZJ(this.LJLJL, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
