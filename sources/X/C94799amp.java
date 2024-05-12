package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl$onDraftOrEffectSavedSuccess$1", f = "TiktokEffectCreatePipelineImpl.kt", l = {219}, m = "invokeSuspend")
/* renamed from: X.amp, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94799amp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TiktokEffectCreatePipelineImpl LJLILLLLZI;
    public final /* synthetic */ CKEDraftInfoWrapper LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94799amp(TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl, CKEDraftInfoWrapper cKEDraftInfoWrapper, InterfaceC67352kd<? super C94799amp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = tiktokEffectCreatePipelineImpl;
        this.LJLJI = cKEDraftInfoWrapper;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94799amp(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
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
            TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl = this.LJLILLLLZI;
            CKEDraftInfoWrapper cKEDraftInfoWrapper = this.LJLJI;
            String str = null;
            if (cKEDraftInfoWrapper != null) {
                num = new Integer(cKEDraftInfoWrapper.iconEdit);
            } else {
                num = null;
            }
            CKEDraftInfoWrapper cKEDraftInfoWrapper2 = this.LJLJI;
            if (cKEDraftInfoWrapper2 != null) {
                str = V16.LJIILIIL(cKEDraftInfoWrapper2);
            }
            this.LJLIL = 1;
            if (tiktokEffectCreatePipelineImpl.writeLabelToAMECapabilities(num, str, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
