package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {147}, m = "invokeSuspend")
/* renamed from: X.3CG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CG extends AbstractC65782Prm implements InterfaceC88471Ynr<C76800UCe, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC65462ha<Object> LJLILLLLZI;
    public final /* synthetic */ MBA LJLJI;
    public final /* synthetic */ Object LJLJJI;
    public final /* synthetic */ XKM<Object> LJLJJL;
    public final /* synthetic */ InterfaceC64672gJ<Object> LJLJJLL;
    public final /* synthetic */ InterfaceC88473Ynt<Object, Object, InterfaceC67352kd<Object>, Object> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3CG(InterfaceC65462ha<Object> interfaceC65462ha, MBA mba, Object obj, XKM<? extends Object> xkm, InterfaceC64672gJ<Object> interfaceC64672gJ, InterfaceC88473Ynt<Object, Object, ? super InterfaceC67352kd<Object>, ? extends Object> interfaceC88473Ynt, InterfaceC67352kd<? super C3CG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC65462ha;
        this.LJLJI = mba;
        this.LJLJJI = obj;
        this.LJLJJL = xkm;
        this.LJLJJLL = interfaceC64672gJ;
        this.LJLJL = interfaceC88473Ynt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3CG(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
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
            InterfaceC65462ha<Object> interfaceC65462ha = this.LJLILLLLZI;
            final MBA mba = this.LJLJI;
            final Object obj2 = this.LJLJJI;
            final XKM<Object> xkm = this.LJLJJL;
            final InterfaceC64672gJ<Object> interfaceC64672gJ = this.LJLJJLL;
            final InterfaceC88473Ynt<Object, Object, InterfaceC67352kd<Object>, Object> interfaceC88473Ynt = this.LJLJL;
            InterfaceC64672gJ<? super Object> interfaceC64672gJ2 = new InterfaceC64672gJ<Object>() { // from class: X.3CF
                @Override // X.InterfaceC64672gJ
                public final Object emit(Object obj3, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    MBA mba2 = MBA.this;
                    C76800UCe c76800UCe = C76800UCe.LIZ;
                    Object LJIIIIZZ = C1RF.LJIIIIZZ(mba2, c76800UCe, obj2, new C3CE(xkm, interfaceC64672gJ, interfaceC88473Ynt, obj3, null), interfaceC67352kd);
                    if (LJIIIIZZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                        return LJIIIIZZ;
                    }
                    return c76800UCe;
                }
            };
            this.LJLIL = 1;
            if (interfaceC65462ha.collect(interfaceC64672gJ2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C76800UCe c76800UCe, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c76800UCe, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
