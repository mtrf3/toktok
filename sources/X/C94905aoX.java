package X;

import com.bytedance.effectcreatormobile.ckeapi.api.IRecovery;
import fjb.a;
import kotlin.jvm.internal.IDqS446S0100000_42;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.EnterProcessor$enter$2$modelTask$1", f = "EnterProcessor.kt", l = {39}, m = "invokeSuspend")
/* renamed from: X.aoX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94905aoX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ C94906aoY LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94905aoX(C94906aoY c94906aoY, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c94906aoY;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94905aoX(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String modelPictureId;
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
            C93930aYo c93930aYo = this.LJLILLLLZI.LJLJI;
            this.LJLIL = 1;
            c93930aYo.getClass();
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            IRecovery LIZ = C93943aZ1.LIZ();
            if (LIZ != null && (modelPictureId = LIZ.getModelPictureId()) != null) {
                C93797aWf.LIZ().setSelectedModel(modelPictureId);
            }
            C93797aWf.LIZ().fetchDefaultModel(new IDqS446S0100000_42(xks, 14));
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
