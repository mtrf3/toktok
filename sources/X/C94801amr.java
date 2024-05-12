package X;

import android.app.Activity;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl$saveAsDraftAndGoToRecord$1", f = "TiktokEffectCreatePipelineImpl.kt", l = {96, 98}, m = "invokeSuspend")
/* renamed from: X.amr, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94801amr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CKEDraftInfo LJLILLLLZI;
    public final /* synthetic */ TiktokEffectCreatePipelineImpl LJLJI;
    public final /* synthetic */ Activity LJLJJI;
    public final /* synthetic */ EffectPackageData LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94801amr(CKEDraftInfo cKEDraftInfo, TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl, Activity activity, EffectPackageData effectPackageData, String str, InterfaceC67352kd<? super C94801amr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = cKEDraftInfo;
        this.LJLJI = tiktokEffectCreatePipelineImpl;
        this.LJLJJI = activity;
        this.LJLJJL = effectPackageData;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94801amr(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    TiktokEffectCreatePipelineImpl.onDraftOrEffectSavedSuccess$default(this.LJLJI, this.LJLJJI, this.LJLJJL, null, this.LJLJJLL, 4, null);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            if (this.LJLILLLLZI.name.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CKEDraftInfo cKEDraftInfo = this.LJLILLLLZI;
                String str = cKEDraftInfo.defaultName;
                o.LJIIIZ(str, "<set-?>");
                cKEDraftInfo.name = str;
            }
            if (this.LJLILLLLZI.iconPath.length() == 0) {
                CKEDraftInfo cKEDraftInfo2 = this.LJLILLLLZI;
                String str2 = cKEDraftInfo2.defaultIconPath;
                o.LJIIIZ(str2, "<set-?>");
                cKEDraftInfo2.iconPath = str2;
            }
            TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl = this.LJLJI;
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.LJLJJI;
            CKEDraftInfo cKEDraftInfo3 = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (tiktokEffectCreatePipelineImpl.cropAndSaveDraft(activityC45651qj, cKEDraftInfo3, false, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        CKEDraftInfoWrapper LIZJ = C93812aWu.LIZJ(this.LJLILLLLZI);
        TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl2 = this.LJLJI;
        Integer num = new Integer(LIZJ.iconEdit);
        String LJIILIIL = V16.LJIILIIL(LIZJ);
        this.LJLIL = 2;
        if (tiktokEffectCreatePipelineImpl2.writeLabelToAMECapabilities(num, LJIILIIL, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        TiktokEffectCreatePipelineImpl.onDraftOrEffectSavedSuccess$default(this.LJLJI, this.LJLJJI, this.LJLJJL, null, this.LJLJJLL, 4, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
