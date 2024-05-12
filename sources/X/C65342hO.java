package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.VCBasePipelineHandler$process2$2$1", f = "VCBasePipelineHandler.kt", l = {66}, m = "invokeSuspend")
/* renamed from: X.2hO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65342hO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<Object>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC88473Ynt<InterfaceC70422pa, C166116fX, InterfaceC67352kd<Object>, Object> LJLJI;
    public final /* synthetic */ C166116fX LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C65342hO(InterfaceC88473Ynt<? super InterfaceC70422pa, ? super C166116fX, ? super InterfaceC67352kd<Object>, ? extends Object> interfaceC88473Ynt, C166116fX c166116fX, InterfaceC67352kd<? super C65342hO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC88473Ynt;
        this.LJLJJI = c166116fX;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C65342hO c65342hO = new C65342hO(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c65342hO.LJLILLLLZI = obj;
        return c65342hO;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            Object obj2 = this.LJLILLLLZI;
            InterfaceC88473Ynt<InterfaceC70422pa, C166116fX, InterfaceC67352kd<Object>, Object> interfaceC88473Ynt = this.LJLJI;
            C166116fX c166116fX = this.LJLJJI;
            this.LJLIL = 1;
            obj = interfaceC88473Ynt.invoke(obj2, c166116fX, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<Object> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
