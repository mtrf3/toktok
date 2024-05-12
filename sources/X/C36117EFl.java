package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoCutter$1", f = "CutOptimizedVideoCutter.kt", l = {73, 74}, m = "invokeSuspend")
/* renamed from: X.EFl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36117EFl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C46069I6f LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36117EFl(C46069I6f c46069I6f, InterfaceC67352kd<? super C36117EFl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c46069I6f;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36117EFl c36117EFl = new C36117EFl(this.LJLJI, interfaceC67352kd);
        c36117EFl.LJLILLLLZI = obj;
        return c36117EFl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC68342mE LIZIZ;
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
            LIZIZ = (InterfaceC68342mE) this.LJLILLLLZI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C84661XKn LIZIZ2 = XKX.LIZIZ(interfaceC70422pa, null, null, new C36119EFn(this.LJLJI, null), 3);
            LIZIZ = XKX.LIZIZ(interfaceC70422pa, null, null, new C36118EFm(this.LJLJI, null), 3);
            this.LJLILLLLZI = LIZIZ;
            this.LJLIL = 1;
            if (LIZIZ2.LJJIJ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI = null;
        this.LJLIL = 2;
        if (LIZIZ.LJI(this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
