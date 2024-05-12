package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.handlers.PrepareParamsHandler$handleData$2$extractAsync$1", f = "PrepareParamsHandler.kt", l = {50}, m = "invokeSuspend")
/* renamed from: X.6gf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166816gf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C166526gC>, Object> {
    public int LJLIL;
    public final /* synthetic */ NLEModel LJLILLLLZI;
    public final /* synthetic */ C166856gj LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166816gf(NLEModel nLEModel, C166856gj c166856gj, InterfaceC67352kd<? super C166816gf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = nLEModel;
        this.LJLJI = c166856gj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C166816gf(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            NLEModel nLEModel = this.LJLILLLLZI;
            String LIZJ = this.LJLJI.LJ.LIZJ();
            this.LJLIL = 1;
            obj = C167106h8.LIZIZ(nLEModel, LIZJ, false, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C166526gC> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
