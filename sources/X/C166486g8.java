package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.UploadAudioHandler$handleData$2$resultList$2", f = "UploadAudioHandler.kt", l = {45}, m = "invokeSuspend")
/* renamed from: X.6g8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166486g8 extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, C166116fX, InterfaceC67352kd<? super C166546gE>, Object> {
    public int LJLIL;
    public /* synthetic */ C166116fX LJLILLLLZI;
    public final /* synthetic */ UploadAuthKeyConfig LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166486g8(UploadAuthKeyConfig uploadAuthKeyConfig, InterfaceC67352kd<? super C166486g8> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJI = uploadAuthKeyConfig;
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
            C166116fX c166116fX = this.LJLILLLLZI;
            UploadAuthKeyConfig uploadAuthKeyConfig = this.LJLJI;
            this.LJLIL = 1;
            obj = C167106h8.LIZLLL(c166116fX.LIZLLL, uploadAuthKeyConfig, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, C166116fX c166116fX, InterfaceC67352kd<? super C166546gE> interfaceC67352kd) {
        C166486g8 c166486g8 = new C166486g8(this.LJLJI, interfaceC67352kd);
        c166486g8.LJLILLLLZI = c166116fX;
        return c166486g8.invokeSuspend(C76800UCe.LIZ);
    }
}
