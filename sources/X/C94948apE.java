package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.draftupdate.DraftUpdater$updateDraftResources$$inlined$combine$1$3", f = "DraftUpdater.kt", l = {333}, m = "invokeSuspend")
/* renamed from: X.apE, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94948apE extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<? super Effect[]>, Effect[], InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ InterfaceC64672gJ LJLILLLLZI;
    public /* synthetic */ Object LJLJI;

    public C94948apE(InterfaceC67352kd interfaceC67352kd) {
        super(3, interfaceC67352kd);
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<? super Effect[]> interfaceC64672gJ, Effect[] effectArr, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C94948apE c94948apE = new C94948apE(interfaceC67352kd);
        c94948apE.LJLILLLLZI = interfaceC64672gJ;
        c94948apE.LJLJI = effectArr;
        return c94948apE.invokeSuspend(C76800UCe.LIZ);
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
            InterfaceC64672gJ interfaceC64672gJ = this.LJLILLLLZI;
            Object[] objArr = (Object[]) this.LJLJI;
            this.LJLIL = 1;
            if (interfaceC64672gJ.emit(objArr, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
