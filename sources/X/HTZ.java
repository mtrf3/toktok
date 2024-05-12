package X;

import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorMediaProcess$buildRecordReturnArguments$1$result$resizeImageTask$1", f = "ExteriorMediaProcess.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class HTZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ReturnEcommerceCommentModel>, Object> {
    public final /* synthetic */ HTN LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTZ(HTN htn, String str, String str2, InterfaceC67352kd<? super HTZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = htn;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new HTZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return this.LJLIL.LIZJ(this.LJLILLLLZI, null, this.LJLJI, -1, "shoot");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ReturnEcommerceCommentModel> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
