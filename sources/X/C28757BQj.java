package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.goodybag.presenter.GoodyBagPresenter$logOpenIsOverTime$1$1", f = "GoodyBagPresenter.kt", l = {871}, m = "invokeSuspend")
/* renamed from: X.BQj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28757BQj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C72242sW LJLILLLLZI;
    public final /* synthetic */ BR1 LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28757BQj(C72242sW c72242sW, BR1 br1, String str, int i, String str2, InterfaceC67352kd<? super C28757BQj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c72242sW;
        this.LJLJI = br1;
        this.LJLJJI = str;
        this.LJLJJL = i;
        this.LJLJJLL = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28757BQj(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
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
            long j = this.LJLILLLLZI.element + 2500;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        BR1 br1 = this.LJLJI;
        if (br1.LJ && !(z = br1.LIZJ)) {
            BR4.LIZLLL(this.LJLJJL, this.LJLJJI, this.LJLJJLL, z);
        } else {
            boolean z2 = br1.LIZJ;
            if (z2) {
                BR4.LIZLLL(this.LJLJJL, this.LJLJJI, this.LJLJJLL, z2);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}