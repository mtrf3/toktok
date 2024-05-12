package X;

import Y.IDfS126S0100000_1;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.source.UserCardDataSource$init$2", f = "UserCardDataSource.kt", l = {321}, m = "invokeSuspend")
/* renamed from: X.4gT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115734gT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C57962Mow LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C115734gT(C57962Mow c57962Mow, InterfaceC67352kd<? super C115734gT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c57962Mow;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C115734gT(this.LJLILLLLZI, interfaceC67352kd);
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
            Object value = this.LJLILLLLZI.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value, "<get-subject>(...)");
            final C79793Bf LJFF = V1M.LJFF(new C115704gQ(new C73426Srm((AbstractC73672Svk) value), null));
            InterfaceC65462ha<Object> interfaceC65462ha = new InterfaceC65462ha<Object>() { // from class: X.2zx
                public final /* synthetic */ int LJLILLLLZI = 1;

                @Override // X.InterfaceC65462ha
                public final Object collect(final InterfaceC64672gJ<? super Object> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    final C76732zl c76732zl = new C76732zl();
                    InterfaceC65462ha interfaceC65462ha2 = LJFF;
                    final int i2 = this.LJLILLLLZI;
                    Object collect = interfaceC65462ha2.collect(new InterfaceC64672gJ<Object>() { // from class: X.2zw
                        @Override // X.InterfaceC64672gJ
                        public final Object emit(Object obj2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd2) {
                            C76732zl c76732zl2 = C76732zl.this;
                            int i3 = c76732zl2.element;
                            if (i3 >= i2) {
                                Object emit = interfaceC64672gJ.emit(obj2, interfaceC67352kd2);
                                if (emit == EnumC58928NAu.COROUTINE_SUSPENDED) {
                                    return emit;
                                }
                            } else {
                                c76732zl2.element = i3 + 1;
                            }
                            return C76800UCe.LIZ;
                        }
                    }, interfaceC67352kd);
                    if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
                        return collect;
                    }
                    return C76800UCe.LIZ;
                }
            };
            IDfS126S0100000_1 iDfS126S0100000_1 = new IDfS126S0100000_1(this.LJLILLLLZI, 31);
            this.LJLIL = 1;
            if (interfaceC65462ha.collect(iDfS126S0100000_1, this) == enumC58928NAu) {
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
