package X;

import com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailApi;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookVideoListVM;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.detail.vm.BookVideoListVM$onLoadMore$response$1", f = "BookVideoListVM.kt", l = {98}, m = "invokeSuspend")
/* renamed from: X.7s6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199387s6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super XGX<C7T0>>, Object> {
    public int LJLIL;
    public final /* synthetic */ BookVideoListVM LJLILLLLZI;
    public final /* synthetic */ C185917Rj LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199387s6(BookVideoListVM bookVideoListVM, C185917Rj c185917Rj, InterfaceC67352kd<? super C199387s6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = bookVideoListVM;
        this.LJLJI = c185917Rj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C199387s6(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C199417s9 c199417s9 = BookDetailApi.LIZ;
            BookVideoListVM bookVideoListVM = this.LJLILLLLZI;
            String str = bookVideoListVM.LJLIL;
            if (str != null) {
                String str2 = this.LJLJI.LIZ;
                boolean z = bookVideoListVM.LJLJJI;
                c199417s9.getClass();
                XGR LIZIZ = XGJ.LIZ().LIZIZ(new C199297rx(str, str2));
                AbstractC54815LfH abstractC54815LfH = (AbstractC54815LfH) C199417s9.LIZLLL.getValue();
                C199457sD c199457sD = C199457sD.LJLIL;
                C199497sH c199497sH = C199497sH.LJLIL;
                if (o.LJ(C7T0.class, C7T0.class) || (c199457sD != null && c199497sH != null)) {
                    LIZIZ.LIZ(new C84569XGz(new C57354Mf8(abstractC54815LfH, c199457sD, c199497sH, C7T0.class, C7T0.class)));
                    if (z) {
                        enumC199577sP = C199417s9.LIZJ;
                    } else {
                        enumC199577sP = C199417s9.LIZIZ;
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
                    LIZ.append(C7T0.class);
                    LIZ.append(", do is ");
                    LIZ.append(C7T0.class);
                    LIZ.append(", please pass the onFetchCache and onQueryNet param to map cache");
                    String LIZIZ3 = X1D.LIZIZ(LIZ);
                    LIZIZ3.toString();
                    throw new IllegalStateException(LIZIZ3);
                }
            } else {
                o.LJIJI("bookId");
                throw null;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super XGX<C7T0>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
