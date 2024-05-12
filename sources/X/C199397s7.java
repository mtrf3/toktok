package X;

import com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailApi;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieVideoListVM;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieVideoListVM$onLoadMore$response$1", f = "MovieVideoListVM.kt", l = {109}, m = "invokeSuspend")
/* renamed from: X.7s7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199397s7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super XGX<C7T1>>, Object> {
    public int LJLIL;
    public final /* synthetic */ MovieVideoListVM LJLILLLLZI;
    public final /* synthetic */ C185957Rn LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199397s7(MovieVideoListVM movieVideoListVM, C185957Rn c185957Rn, InterfaceC67352kd<? super C199397s7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = movieVideoListVM;
        this.LJLJI = c185957Rn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C199397s7(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC199577sP enumC199577sP;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C199427sA c199427sA = MovieDetailApi.LIZ;
            MovieVideoListVM movieVideoListVM = this.LJLILLLLZI;
            String str = movieVideoListVM.LJLIL;
            if (str != null) {
                String str2 = this.LJLJI.LIZ;
                boolean z = movieVideoListVM.LJLJJI;
                c199427sA.getClass();
                XGR LIZIZ = XGJ.LIZ().LIZIZ(new C199307ry(str, str2));
                AbstractC54815LfH abstractC54815LfH = (AbstractC54815LfH) C199427sA.LIZLLL.getValue();
                C199477sF c199477sF = C199477sF.LJLIL;
                C199537sL c199537sL = C199537sL.LJLIL;
                if (o.LJ(C7T1.class, C7T1.class) || (c199477sF != null && c199537sL != null)) {
                    LIZIZ.LIZ(new C84569XGz(new C57354Mf8(abstractC54815LfH, c199477sF, c199537sL, C7T1.class, C7T1.class)));
                    if (z) {
                        enumC199577sP = C199427sA.LIZJ;
                    } else {
                        enumC199577sP = C199427sA.LIZIZ;
                    }
                    C78977Uz7.LJJIJL(LIZIZ, enumC199577sP);
                    InterfaceC65462ha LIZIZ2 = LIZIZ.LIZIZ();
                    this.LJLIL = 1;
                    obj = V1M.LJJJJJL(LIZIZ2, this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("po is ");
                    LIZ.append(C7T1.class);
                    LIZ.append(", do is ");
                    LIZ.append(C7T1.class);
                    LIZ.append(", please pass the onFetchCache and onQueryNet param to map cache");
                    String LIZIZ3 = X1D.LIZIZ(LIZ);
                    LIZIZ3.toString();
                    throw new IllegalStateException(LIZIZ3);
                }
            } else {
                o.LJIJI("movieId");
                throw null;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super XGX<C7T1>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
