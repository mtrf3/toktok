package X;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", l = {190}, m = "invokeSuspend")
/* renamed from: X.2Ci, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54602Ci extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, C23560wC, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ InterfaceC70422pa LJLILLLLZI;
    public /* synthetic */ long LJLJI;
    public final /* synthetic */ InterfaceC88473Ynt<InterfaceC70422pa, Float, InterfaceC67352kd<? super C76800UCe>, Object> LJLJJI;
    public final /* synthetic */ C0UT LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C54602Ci(InterfaceC88473Ynt<? super InterfaceC70422pa, ? super Float, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt, C0UT c0ut, InterfaceC67352kd<? super C54602Ci> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJJI = interfaceC88473Ynt;
        this.LJLJJL = c0ut;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        float LIZIZ;
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
            InterfaceC70422pa interfaceC70422pa = this.LJLILLLLZI;
            long j = this.LJLJI;
            InterfaceC88473Ynt<InterfaceC70422pa, Float, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88473Ynt = this.LJLJJI;
            if (this.LJLJJL == C0UT.Vertical) {
                LIZIZ = C23560wC.LIZJ(j);
            } else {
                LIZIZ = C23560wC.LIZIZ(j);
            }
            Float f = new Float(LIZIZ);
            this.LJLIL = 1;
            if (interfaceC88473Ynt.invoke(interfaceC70422pa, f, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, C23560wC c23560wC, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        long j = c23560wC.LIZ;
        C54602Ci c54602Ci = new C54602Ci(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c54602Ci.LJLILLLLZI = interfaceC70422pa;
        c54602Ci.LJLJI = j;
        return c54602Ci.invokeSuspend(C76800UCe.LIZ);
    }
}
