package X;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {333, 333}, m = "invokeSuspend")
/* renamed from: X.2fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64462fy extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<Object>, Object[], InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ InterfaceC64672gJ LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ InterfaceC88474Ynu LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64462fy(InterfaceC67352kd interfaceC67352kd, InterfaceC88474Ynu interfaceC88474Ynu) {
        super(3, interfaceC67352kd);
        this.LJLJJI = interfaceC88474Ynu;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<Object> interfaceC64672gJ, Object[] objArr, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C64462fy c64462fy = new C64462fy(interfaceC67352kd, this.LJLJJI);
        c64462fy.LJLILLLLZI = interfaceC64672gJ;
        c64462fy.LJLJI = objArr;
        return c64462fy.invokeSuspend(C76800UCe.LIZ);
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
            InterfaceC88474Ynu interfaceC88474Ynu = this.LJLJJI;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            this.LJLILLLLZI = interfaceC64672gJ;
            this.LJLIL = 1;
            obj = interfaceC88474Ynu.invoke(obj2, obj3, obj4, this);
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
}
