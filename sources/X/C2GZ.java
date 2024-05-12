package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {480, 485}, m = "invokeSuspend")
/* renamed from: X.2GZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2GZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ AbstractC531926x LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2GZ(boolean z, AbstractC531926x abstractC531926x, long j, InterfaceC67352kd<? super C2GZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = abstractC531926x;
        this.LJLJJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2GZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            if (!this.LJLILLLLZI) {
                C25730zh c25730zh = this.LJLJI.LJLIL;
                long j = C23560wC.LIZIZ;
                long j2 = this.LJLJJI;
                this.LJLIL = 1;
                if (c25730zh.LIZ(j, j2, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                C25730zh c25730zh2 = this.LJLJI.LJLIL;
                long j3 = this.LJLJJI;
                long j4 = C23560wC.LIZIZ;
                this.LJLIL = 2;
                if (c25730zh2.LIZ(j3, j4, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
