package X;

import android.app.Activity;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl$onExportWhenExit$1", f = "TiktokEffectCreatePipelineImpl.kt", l = {364, 367}, m = "invokeSuspend")
/* renamed from: X.amq, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94800amq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TiktokEffectCreatePipelineImpl LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ CKEDraftInfo LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94800amq(TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl, Activity activity, CKEDraftInfo cKEDraftInfo, InterfaceC67352kd<? super C94800amq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = tiktokEffectCreatePipelineImpl;
        this.LJLJI = activity;
        this.LJLJJI = cKEDraftInfo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94800amq(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl = this.LJLILLLLZI;
            Activity activity = this.LJLJI;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            CKEDraftInfo cKEDraftInfo = this.LJLJJI;
            this.LJLIL = 1;
            if (tiktokEffectCreatePipelineImpl.cropAndSaveDraft((ActivityC45651qj) activity, cKEDraftInfo, true, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        CKEDraftInfoWrapper LIZJ = C93812aWu.LIZJ(this.LJLJJI);
        TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl2 = this.LJLILLLLZI;
        Integer num = new Integer(LIZJ.iconEdit);
        String LJIILIIL = V16.LJIILIIL(LIZJ);
        this.LJLIL = 2;
        if (tiktokEffectCreatePipelineImpl2.writeLabelToAMECapabilities(num, LJIILIIL, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
