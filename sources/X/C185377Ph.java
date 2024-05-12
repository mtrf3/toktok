package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM$toggleFavorite$1$1$2", f = "BookDetailVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Ph, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185377Ph extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BookDetailVM LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ XGX<? extends InterfaceC199277rv> LJLJJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C185377Ph(BookDetailVM bookDetailVM, boolean z, String str, XGX<? extends InterfaceC199277rv> xgx, InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C185377Ph> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = bookDetailVM;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = xgx;
        this.LJLJJL = interfaceC70422pa;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C185377Ph(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
        BookDetailVM bookDetailVM = this.LJLIL;
        if (z != bookDetailVM.LJLILLLLZI) {
            bookDetailVM.LJLILLLLZI = bookDetailVM.getState().LJLILLLLZI;
            C7OG.LIZLLL(C7PV.BOOK, this.LJLIL.gv0(), !this.LJLILLLLZI);
            BookDetailVM bookDetailVM2 = this.LJLIL;
            boolean z2 = bookDetailVM2.LJLILLLLZI;
            String gv0 = bookDetailVM2.gv0();
            String str4 = this.LJLJI;
            InterfaceC199277rv interfaceC199277rv = (InterfaceC199277rv) ((XGW) this.LJLJJI).LJ;
            if (z2) {
                str = "favorite_topic";
            } else {
                str = "cancel_favorite_book";
            }
            C188727au c188727au = new C188727au();
            if (z2) {
                str2 = "favorite_from";
            } else {
                str2 = "cancel_from";
            }
            c188727au.LJIIIZ(str2, "detail_page");
            c188727au.LJIIIZ("book_id", gv0);
            c188727au.LJIIIZ("book_title", str4);
            if (interfaceC199277rv instanceof C185457Pp) {
                BaseResponse baseResponse = ((C185457Pp) interfaceC199277rv).LIZ;
                if (baseResponse != null && (serverTimeExtra2 = baseResponse.extra) != null) {
                    str3 = serverTimeExtra2.logid;
                    LogPbBean logPbBean = new LogPbBean();
                    logPbBean.setImprId(str3);
                    String LIZ = C3A5.LIZ.LIZ(logPbBean);
                    o.LJIIIIZZ(LIZ, "getInstance().formatLogPb(logPb)");
                    c188727au.LJIIIZ("log_pb", LIZ);
                    c188727au.LJIIIZ("category", "book");
                    FMX.LJIIL(str, c188727au.LIZ);
                }
                str3 = null;
                LogPbBean logPbBean2 = new LogPbBean();
                logPbBean2.setImprId(str3);
                String LIZ2 = C3A5.LIZ.LIZ(logPbBean2);
                o.LJIIIIZZ(LIZ2, "getInstance().formatLogPb(logPb)");
                c188727au.LJIIIZ("log_pb", LIZ2);
                c188727au.LJIIIZ("category", "book");
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
                    c188727au.LJIIIZ("category", "book");
                    FMX.LJIIL(str, c188727au.LIZ);
                }
                str3 = null;
                LogPbBean logPbBean222 = new LogPbBean();
                logPbBean222.setImprId(str3);
                String LIZ222 = C3A5.LIZ.LIZ(logPbBean222);
                o.LJIIIIZZ(LIZ222, "getInstance().formatLogPb(logPb)");
                c188727au.LJIIIZ("log_pb", LIZ222);
                c188727au.LJIIIZ("category", "book");
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
