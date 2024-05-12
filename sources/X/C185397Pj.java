package X;

import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM$toggleFavorite$1", f = "BookDetailVM.kt", l = {179}, m = "invokeSuspend")
/* renamed from: X.7Pj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185397Pj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC65462ha<XGX<? extends InterfaceC199277rv>> LJLJI;
    public final /* synthetic */ BookDetailVM LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C185397Pj(InterfaceC65462ha<? extends XGX<? extends InterfaceC199277rv>> interfaceC65462ha, BookDetailVM bookDetailVM, boolean z, String str, InterfaceC67352kd<? super C185397Pj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC65462ha;
        this.LJLJJI = bookDetailVM;
        this.LJLJJL = z;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C185397Pj c185397Pj = new C185397Pj(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c185397Pj.LJLILLLLZI = obj;
        return c185397Pj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            final InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            InterfaceC65462ha<XGX<? extends InterfaceC199277rv>> interfaceC65462ha = this.LJLJI;
            final BookDetailVM bookDetailVM = this.LJLJJI;
            final boolean z = this.LJLJJL;
            final String str = this.LJLJJLL;
            InterfaceC64672gJ<XGX<? extends InterfaceC199277rv>> interfaceC64672gJ = new InterfaceC64672gJ<XGX<? extends InterfaceC199277rv>>() { // from class: X.7Pi
                @Override // X.InterfaceC64672gJ
                public final Object emit(XGX<? extends InterfaceC199277rv> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    XGX<? extends InterfaceC199277rv> xgx2 = xgx;
                    if (xgx2 instanceof XGW) {
                        if (C78977Uz7.LJJJJI(xgx2.LIZJ) == EnumC78982UzC.Optimistic) {
                            Object LJI = XKX.LJI(C36636EZk.LIZ, new C185417Pl(bookDetailVM, z, null), interfaceC67352kd);
                            if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
                                return LJI;
                            }
                        } else {
                            Object LJI2 = XKX.LJI(C36636EZk.LIZ, new C185377Ph(bookDetailVM, z, str, xgx2, InterfaceC70422pa.this, null), interfaceC67352kd);
                            if (LJI2 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                                return LJI2;
                            }
                        }
                    } else if (xgx2 instanceof XGT) {
                        Object LJI3 = XKX.LJI(C36636EZk.LIZ, new C185407Pk(xgx2, bookDetailVM, InterfaceC70422pa.this, null), interfaceC67352kd);
                        if (LJI3 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                            return LJI3;
                        }
                    } else {
                        C48841JEv.LIZJ(InterfaceC70422pa.this, null);
                    }
                    return C76800UCe.LIZ;
                }
            };
            this.LJLIL = 1;
            if (interfaceC65462ha.collect(interfaceC64672gJ, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
