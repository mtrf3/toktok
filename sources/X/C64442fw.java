package X;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {217, 217}, m = "invokeSuspend")
/* renamed from: X.2fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64442fw extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<Object>, Object, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ InterfaceC64672gJ LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<Object, InterfaceC67352kd<Object>, Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C64442fw(InterfaceC88471Ynr<Object, ? super InterfaceC67352kd<Object>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C64442fw> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJJI = interfaceC88471Ynr;
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
            Object obj2 = this.LJLJI;
            InterfaceC88471Ynr<Object, InterfaceC67352kd<Object>, Object> interfaceC88471Ynr = this.LJLJJI;
            this.LJLILLLLZI = interfaceC64672gJ;
            this.LJLIL = 1;
            obj = interfaceC88471Ynr.invoke(obj2, this);
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
    public final Object invoke(InterfaceC64672gJ<Object> interfaceC64672gJ, Object obj, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C64442fw c64442fw = new C64442fw(this.LJLJJI, interfaceC67352kd);
        c64442fw.LJLILLLLZI = interfaceC64672gJ;
        c64442fw.LJLJI = obj;
        return c64442fw.invokeSuspend(C76800UCe.LIZ);
    }
}
