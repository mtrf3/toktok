package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorMediaProcess$buildUploadReturnArguments$1$result$compressResult$compressTask$1", f = "ExteriorMediaProcess.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class HTX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ HTN LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ MyMediaModel LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTX(HTN htn, MyMediaModel myMediaModel, String str, String str2, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = htn;
        this.LJLJI = str;
        this.LJLJJI = myMediaModel;
        this.LJLJJL = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new HTX(this.LJLILLLLZI, this.LJLJJI, this.LJLJI, this.LJLJJL, interfaceC67352kd);
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
            String fileUriPath = this.LJLJI;
            o.LJIIIIZZ(fileUriPath, "fileUriPath");
            MyMediaModel myMediaModel = this.LJLJJI;
            String str = this.LJLJJL;
            this.LJLIL = 1;
            obj = htn.LJFF(fileUriPath, myMediaModel, str, "upload", this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
