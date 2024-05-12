package X;

import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorMediaProcess$buildUploadReturnArguments$1$result$resizeImageTask$1", f = "ExteriorMediaProcess.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class HTY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ReturnEcommerceCommentModel>, Object> {
    public final /* synthetic */ HTN LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ MyMediaModel LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTY(HTN htn, MyMediaModel myMediaModel, String str, String str2, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = htn;
        this.LJLILLLLZI = str;
        this.LJLJI = myMediaModel;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new HTY(this.LJLIL, this.LJLJI, this.LJLILLLLZI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        HTN htn = this.LJLIL;
        String fileUriPath = this.LJLILLLLZI;
        o.LJIIIIZZ(fileUriPath, "fileUriPath");
        MyMediaModel myMediaModel = this.LJLJI;
        return htn.LIZJ(fileUriPath, myMediaModel, this.LJLJJI, myMediaModel.selectIndex, "upload");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ReturnEcommerceCommentModel> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
