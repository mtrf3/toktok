package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM$toggleFavorite$1$1$2", f = "MovieDetailVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186037Rv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MovieDetailVM LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ XGX<? extends InterfaceC199277rv> LJLJJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C186037Rv(MovieDetailVM movieDetailVM, boolean z, String str, XGX<? extends InterfaceC199277rv> xgx, InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C186037Rv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = movieDetailVM;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = xgx;
        this.LJLJJL = interfaceC70422pa;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C186037Rv(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        String str3;
        BaseResponse.ServerTimeExtra serverTimeExtra2;
        C141335gf.LIZJ(obj);
        boolean z = this.LJLIL.getState().LJLILLLLZI;
        MovieDetailVM movieDetailVM = this.LJLIL;
        if (z != movieDetailVM.LJLILLLLZI) {
            movieDetailVM.LJLILLLLZI = movieDetailVM.getState().LJLILLLLZI;
            C7OG.LIZLLL(C7PV.MOVIE, this.LJLIL.gv0(), !this.LJLILLLLZI);
            MovieDetailVM movieDetailVM2 = this.LJLIL;
            boolean z2 = movieDetailVM2.LJLILLLLZI;
            String gv0 = movieDetailVM2.gv0();
            String str4 = this.LJLJI;
            InterfaceC199277rv interfaceC199277rv = (InterfaceC199277rv) ((XGW) this.LJLJJI).LJ;
            if (z2) {
                str = "favorite_topic";
            } else {
                str = "cancel_favorite_movie";
            }
            C188727au c188727au = new C188727au();
            if (z2) {
                str2 = "favorite_from";
            } else {
                str2 = "cancel_from";
            }
            c188727au.LJIIIZ(str2, "detail_page");
            c188727au.LJIIIZ("movie_id", gv0);
            c188727au.LJIIIZ("movie_title", str4);
            if (interfaceC199277rv instanceof C7S3) {
                BaseResponse baseResponse = ((C7S3) interfaceC199277rv).LIZ;
                if (baseResponse != null && (serverTimeExtra2 = baseResponse.extra) != null) {
                    str3 = serverTimeExtra2.logid;
                    LogPbBean logPbBean = new LogPbBean();
                    logPbBean.setImprId(str3);
                    String LIZ = C3A5.LIZ.LIZ(logPbBean);
                    o.LJIIIIZZ(LIZ, "getInstance().formatLogPb(logPb)");
                    c188727au.LJIIIZ("log_pb", LIZ);
                    c188727au.LJIIIZ("category", "movie");
                    FMX.LJIIL(str, c188727au.LIZ);
                }
                str3 = null;
                LogPbBean logPbBean2 = new LogPbBean();
                logPbBean2.setImprId(str3);
                String LIZ2 = C3A5.LIZ.LIZ(logPbBean2);
                o.LJIIIIZZ(LIZ2, "getInstance().formatLogPb(logPb)");
                c188727au.LJIIIZ("log_pb", LIZ2);
                c188727au.LJIIIZ("category", "movie");
                FMX.LJIIL(str, c188727au.LIZ);
            } else {
                o.LJII(interfaceC199277rv, "null cannot be cast to non-null type com.ss.android.ugc.aweme.topic.movie.detail.api.UnCollectMovieMutation.Data");
                BaseResponse baseResponse2 = ((C7S4) interfaceC199277rv).LIZ;
                if (baseResponse2 != null && (serverTimeExtra = baseResponse2.extra) != null) {
                    str3 = serverTimeExtra.logid;
                    LogPbBean logPbBean22 = new LogPbBean();
                    logPbBean22.setImprId(str3);
                    String LIZ22 = C3A5.LIZ.LIZ(logPbBean22);
                    o.LJIIIIZZ(LIZ22, "getInstance().formatLogPb(logPb)");
                    c188727au.LJIIIZ("log_pb", LIZ22);
                    c188727au.LJIIIZ("category", "movie");
                    FMX.LJIIL(str, c188727au.LIZ);
                }
                str3 = null;
                LogPbBean logPbBean222 = new LogPbBean();
                logPbBean222.setImprId(str3);
                String LIZ222 = C3A5.LIZ.LIZ(logPbBean222);
                o.LJIIIIZZ(LIZ222, "getInstance().formatLogPb(logPb)");
                c188727au.LJIIIZ("log_pb", LIZ222);
                c188727au.LJIIIZ("category", "movie");
                FMX.LJIIL(str, c188727au.LIZ);
            }
        }
        C48841JEv.LIZJ(this.LJLJJL, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}