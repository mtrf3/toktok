package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.anchor.BookAnchorBusinessService$handleIconClick$1$1$2", f = "BookAnchorBusinessService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Pc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185327Pc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C7S7 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ AnchorCommonStruct LJLJJI;
    public final /* synthetic */ XGX<? extends InterfaceC199277rv> LJLJJL;
    public final /* synthetic */ InterfaceC70422pa LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C185327Pc(boolean z, C7S7 c7s7, String str, AnchorCommonStruct anchorCommonStruct, XGX<? extends InterfaceC199277rv> xgx, InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C185327Pc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = c7s7;
        this.LJLJI = str;
        this.LJLJJI = anchorCommonStruct;
        this.LJLJJL = xgx;
        this.LJLJJLL = interfaceC70422pa;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C185327Pc(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        String str2;
        String str3;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        String str4;
        BaseResponse.ServerTimeExtra serverTimeExtra2;
        C141335gf.LIZJ(obj);
        if (!o.LJ(Boolean.valueOf(this.LJLIL), this.LJLILLLLZI.LIZIZ)) {
            this.LJLILLLLZI.LIZIZ = Boolean.valueOf(this.LJLIL);
            C7S7 c7s7 = this.LJLILLLLZI;
            String str5 = this.LJLJI;
            Boolean bool = c7s7.LIZIZ;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = this.LJLIL;
            }
            c7s7.LJIILLIIL(Boolean.valueOf(z), str5);
            Boolean bool2 = this.LJLILLLLZI.LIZIZ;
            o.LJII(bool2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = bool2.booleanValue();
            String str6 = this.LJLJI;
            AnchorCommonStruct anchorCommonStruct = this.LJLJJI;
            if (anchorCommonStruct == null || (str = anchorCommonStruct.getKeyword()) == null) {
                str = "";
            }
            InterfaceC199277rv interfaceC199277rv = (InterfaceC199277rv) ((XGW) this.LJLJJL).LJ;
            if (booleanValue) {
                str2 = "favorite_topic";
            } else {
                str2 = "cancel_favorite_book";
            }
            C188727au c188727au = new C188727au();
            if (booleanValue) {
                str3 = "favorite_from";
            } else {
                str3 = "cancel_from";
            }
            c188727au.LJIIIZ(str3, "book_panel_show");
            c188727au.LJIIIZ("book_id", str6);
            c188727au.LJIIIZ("book_title", str);
            c188727au.LJIIIZ("category", "book");
            if (interfaceC199277rv instanceof C185457Pp) {
                BaseResponse baseResponse = ((C185457Pp) interfaceC199277rv).LIZ;
                if (baseResponse != null && (serverTimeExtra2 = baseResponse.extra) != null) {
                    str4 = serverTimeExtra2.logid;
                    LogPbBean logPbBean = new LogPbBean();
                    logPbBean.setImprId(str4);
                    String LIZ = C3A5.LIZ.LIZ(logPbBean);
                    o.LJIIIIZZ(LIZ, "getInstance().formatLogPb(logPb)");
                    c188727au.LJIIIZ("log_pb", LIZ);
                    FMX.LJIIL(str2, c188727au.LIZ);
                }
                str4 = null;
                LogPbBean logPbBean2 = new LogPbBean();
                logPbBean2.setImprId(str4);
                String LIZ2 = C3A5.LIZ.LIZ(logPbBean2);
                o.LJIIIIZZ(LIZ2, "getInstance().formatLogPb(logPb)");
                c188727au.LJIIIZ("log_pb", LIZ2);
                FMX.LJIIL(str2, c188727au.LIZ);
            } else {
                o.LJII(interfaceC199277rv, "null cannot be cast to non-null type com.ss.android.ugc.aweme.topic.book.detail.api.UnCollectBookMutation.Data");
                BaseResponse baseResponse2 = ((C185467Pq) interfaceC199277rv).LIZ;
                if (baseResponse2 != null && (serverTimeExtra = baseResponse2.extra) != null) {
                    str4 = serverTimeExtra.logid;
                    LogPbBean logPbBean22 = new LogPbBean();
                    logPbBean22.setImprId(str4);
                    String LIZ22 = C3A5.LIZ.LIZ(logPbBean22);
                    o.LJIIIIZZ(LIZ22, "getInstance().formatLogPb(logPb)");
                    c188727au.LJIIIZ("log_pb", LIZ22);
                    FMX.LJIIL(str2, c188727au.LIZ);
                }
                str4 = null;
                LogPbBean logPbBean222 = new LogPbBean();
                logPbBean222.setImprId(str4);
                String LIZ222 = C3A5.LIZ.LIZ(logPbBean222);
                o.LJIIIIZZ(LIZ222, "getInstance().formatLogPb(logPb)");
                c188727au.LJIIIZ("log_pb", LIZ222);
                FMX.LJIIL(str2, c188727au.LIZ);
            }
        }
        C48841JEv.LIZJ(this.LJLJJLL, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
