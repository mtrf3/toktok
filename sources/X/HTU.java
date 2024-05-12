package X;

import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorMediaProcess$buildUploadReturnArguments$1$result$coverTask$1", f = "ExteriorMediaProcess.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class HTU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ReturnEcommerceCommentModel>, Object> {
    public int LJLIL;
    public final /* synthetic */ HTN LJLILLLLZI;
    public final /* synthetic */ MyMediaModel LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTU(HTN htn, MyMediaModel myMediaModel, String str, InterfaceC67352kd<? super HTU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = htn;
        this.LJLJI = myMediaModel;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new HTU(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            HTN htn = this.LJLILLLLZI;
            String LJIIL = C44694HgQ.LJIIL(this.LJLJI);
            String str = this.LJLJJI;
            int i2 = this.LJLJI.selectIndex;
            this.LJLIL = 1;
            obj = htn.LIZLLL(i2, LJIIL, str, "upload", this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ReturnEcommerceCommentModel> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
