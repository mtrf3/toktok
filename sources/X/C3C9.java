package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {245}, m = "invokeSuspend")
/* renamed from: X.3C9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3C9 extends AbstractC65782Prm implements InterfaceC88471Ynr<C79973Bx<? extends Object>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C68322mC<Object> LJLJJI;
    public final /* synthetic */ InterfaceC64672gJ<Object> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3C9(InterfaceC67352kd interfaceC67352kd, C68322mC c68322mC, InterfaceC64672gJ interfaceC64672gJ) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c68322mC;
        this.LJLJJL = interfaceC64672gJ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3C9 c3c9 = new C3C9(interfaceC67352kd, this.LJLJJI, this.LJLJJL);
        c3c9.LJLJI = obj;
        return c3c9;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.3BS, T] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C68322mC<Object> c68322mC;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                c68322mC = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            ?? r3 = ((C79973Bx) this.LJLJI).LIZ;
            c68322mC = this.LJLJJI;
            boolean z = r3 instanceof C3C0;
            if (!z) {
                c68322mC.element = r3;
            }
            InterfaceC64672gJ<Object> interfaceC64672gJ = this.LJLJJL;
            if (z) {
                Throwable LIZ = C79973Bx.LIZ(r3);
                if (LIZ == null) {
                    Object obj2 = c68322mC.element;
                    if (obj2 != null) {
                        if (obj2 == C94103mg.LIZ) {
                            obj2 = null;
                        }
                        this.LJLJI = r3;
                        this.LJLIL = c68322mC;
                        this.LJLILLLLZI = 1;
                        if (interfaceC64672gJ.emit(obj2, this) == enumC58928NAu) {
                            return enumC58928NAu;
                        }
                    }
                } else {
                    throw LIZ;
                }
            }
            return C76800UCe.LIZ;
        }
        c68322mC.element = C94103mg.LIZJ;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C79973Bx<? extends Object> c79973Bx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(new C79973Bx(c79973Bx.LIZ), interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
