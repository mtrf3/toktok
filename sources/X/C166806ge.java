package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.handlers.UploadAudioHandler$handleData$2$asyncTask$1", f = "UploadAudioHandler.kt", l = {27}, m = "invokeSuspend")
/* renamed from: X.6ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166806ge extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C166546gE>, Object> {
    public int LJLIL;
    public final /* synthetic */ C166856gj LJLILLLLZI;
    public final /* synthetic */ UploadAuthKeyConfig LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166806ge(C166856gj c166856gj, UploadAuthKeyConfig uploadAuthKeyConfig, InterfaceC67352kd<? super C166806ge> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c166856gj;
        this.LJLJI = uploadAuthKeyConfig;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C166806ge(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            String str = this.LJLILLLLZI.LJI;
            UploadAuthKeyConfig uploadAuthKeyConfig = this.LJLJI;
            this.LJLIL = 1;
            obj = C167106h8.LIZLLL(str, uploadAuthKeyConfig, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C166546gE> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
