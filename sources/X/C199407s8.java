package X;

import Y.IDfS127S0100000_3;
import com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailApi;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM$refreshMovieDetail$1", f = "MovieDetailVM.kt", l = {200}, m = "invokeSuspend")
/* renamed from: X.7s8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199407s8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MovieDetailVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199407s8(MovieDetailVM movieDetailVM, InterfaceC67352kd<? super C199407s8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = movieDetailVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C199407s8(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLILLLLZI.setState(C7SM.LJLIL);
            C199427sA c199427sA = MovieDetailApi.LIZ;
            String gv0 = this.LJLILLLLZI.gv0();
            boolean z = this.LJLILLLLZI.LJLJI;
            c199427sA.getClass();
            XGR LIZIZ = XGJ.LIZ().LIZIZ(new C199317rz(gv0));
            AbstractC54815LfH abstractC54815LfH = (AbstractC54815LfH) C199427sA.LJ.getValue();
            C199467sE c199467sE = C199467sE.LJLIL;
            C199527sK c199527sK = C199527sK.LJLIL;
            if (o.LJ(C186317Sx.class, C186317Sx.class) || (c199467sE != null && c199527sK != null)) {
                LIZIZ.LIZ(new C84569XGz(new C57354Mf8(abstractC54815LfH, c199467sE, c199527sK, C186317Sx.class, C186317Sx.class)));
                if (z) {
                    enumC199577sP = C199427sA.LIZJ;
                } else {
                    enumC199577sP = C199427sA.LIZIZ;
                }
                C78977Uz7.LJJIJL(LIZIZ, enumC199577sP);
                InterfaceC65462ha LIZIZ2 = LIZIZ.LIZIZ();
                IDfS127S0100000_3 iDfS127S0100000_3 = new IDfS127S0100000_3(this.LJLILLLLZI, 6);
                this.LJLIL = 1;
                if (LIZIZ2.collect(iDfS127S0100000_3, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("po is ");
                LIZ.append(C186317Sx.class);
                LIZ.append(", do is ");
                LIZ.append(C186317Sx.class);
                LIZ.append(", please pass the onFetchCache and onQueryNet param to map cache");
                String LIZIZ3 = X1D.LIZIZ(LIZ);
                LIZIZ3.toString();
                throw new IllegalStateException(LIZIZ3);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
