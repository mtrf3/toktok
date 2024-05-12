package X;

import com.bytedance.keva.Keva;
import fjb.a;
import kotlin.jvm.internal.AqS51S1200000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.helper.SocialRecFriendsDialogHelper$startAuthPipeline$1$1", f = "SocialRecFriendsDialogHelper.kt", l = {748}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UPN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ UPK LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UPN(UPK upk, int i, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, InterfaceC67352kd<? super UPN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = upk;
        this.LJLJJI = i;
        this.LJLJJL = str;
        this.LJLJJLL = interfaceC65784Pro;
        this.LJLJL = interfaceC65784Pro2;
        this.LJLJLJ = interfaceC65784Pro3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        UPN upn = new UPN(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        upn.LJLILLLLZI = obj;
        return upn;
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
            UPK upk = this.LJLJI;
            int i2 = this.LJLJJI;
            upk.getClass();
            InterfaceC55726Lty LJIIIIZZ = C77125UOr.LJIIIIZZ(upk.LIZ, new AqS51S1200000_9(upk, UPK.LIZIZ(i2), this.LJLJJL, 1));
            Keva keva = UQ2.LIZ().LIZ;
            UPK upk2 = this.LJLJI;
            int i3 = this.LJLJJI;
            upk2.getClass();
            keva.storeInt("last_permission_pop_up_type", UPK.LJIIL(i3));
            C3C3 LIZ = ((USE) LJIIIIZZ).LIZ();
            UPO upo = new UPO(this.LJLJI, this.LJLJJI, this.LJLJJLL, interfaceC70422pa, this.LJLJL, this.LJLJLJ);
            this.LJLIL = 1;
            if (LIZ.collect(upo, this) == enumC58928NAu) {
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
