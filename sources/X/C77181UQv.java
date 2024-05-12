package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friends.utils.PermissionDialogManager$newAuthFlowForForAlternateRules$1", f = "PermissionDialogManager.kt", l = {1083}, m = "invokeSuspend")
/* renamed from: X.UQv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77181UQv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ UR7 LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ URA LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77181UQv(ActivityC45651qj activityC45651qj, int i, String str, String str2, UR7 ur7, boolean z, URA ura, InterfaceC67352kd<? super C77181UQv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = activityC45651qj;
        this.LJLJJI = i;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = ur7;
        this.LJLJLJ = z;
        this.LJLJLLL = ura;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C77181UQv c77181UQv = new C77181UQv(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
        c77181UQv.LJLILLLLZI = obj;
        return c77181UQv;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C34K c34k = new C34K();
            C3C3 LIZ = ((USE) C77125UOr.LJII(this.LJLJI, new US5(interfaceC70422pa, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL))).LIZ();
            C77180UQu c77180UQu = new C77180UQu(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJI, this.LJLJLJ, this.LJLJLLL, this.LJLJL, c34k);
            this.LJLIL = 1;
            if (LIZ.collect(c77180UQu, this) == enumC58928NAu) {
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
