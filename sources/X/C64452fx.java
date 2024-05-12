package X;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {33, 33}, m = "invokeSuspend")
/* renamed from: X.2fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64452fx extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<Object>, Object[], InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ InterfaceC64672gJ LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ InterfaceC88473Ynt<Object, Object, InterfaceC67352kd<Object>, Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C64452fx(InterfaceC88473Ynt<Object, Object, ? super InterfaceC67352kd<Object>, ? extends Object> interfaceC88473Ynt, InterfaceC67352kd<? super C64452fx> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJJI = interfaceC88473Ynt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC64672gJ interfaceC64672gJ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC64672gJ = this.LJLILLLLZI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            interfaceC64672gJ = this.LJLILLLLZI;
            Object[] objArr = (Object[]) this.LJLJI;
            InterfaceC88473Ynt<Object, Object, InterfaceC67352kd<Object>, Object> interfaceC88473Ynt = this.LJLJJI;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.LJLILLLLZI = interfaceC64672gJ;
            this.LJLIL = 1;
            obj = interfaceC88473Ynt.invoke(obj2, obj3, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI = null;
        this.LJLIL = 2;
        if (interfaceC64672gJ.emit(obj, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<Object> interfaceC64672gJ, Object[] objArr, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C64452fx c64452fx = new C64452fx(this.LJLJJI, interfaceC67352kd);
        c64452fx.LJLILLLLZI = interfaceC64672gJ;
        c64452fx.LJLJI = objArr;
        return c64452fx.invokeSuspend(C76800UCe.LIZ);
    }
}
