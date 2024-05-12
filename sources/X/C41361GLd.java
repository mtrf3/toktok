package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.now.model.CreativeNowDraft;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.external.CreativeNowDraftService$deleteDraft$1", f = "CreativeNowDraftService.kt", l = {80}, m = "invokeSuspend")
/* renamed from: X.GLd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41361GLd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CreativeNowDraft LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41361GLd(CreativeNowDraft creativeNowDraft, InterfaceC67352kd<? super C41361GLd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = creativeNowDraft;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41361GLd(this.LJLILLLLZI, interfaceC67352kd);
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
            AwemeDraft sourceDraftData = this.LJLILLLLZI.getSourceDraftData();
            if (sourceDraftData == null) {
                sourceDraftData = C1DG.LJFF().LJ(new C41363GLf(new CreativeInfo(this.LJLILLLLZI.getCreationId(), 0, null, 6, null), false));
            }
            if (sourceDraftData == null) {
                return C76800UCe.LIZ;
            }
            C268713r.LIZ();
            C41958GdO.LJIILJJIL(sourceDraftData.LIZJ());
            InterfaceC41392GMi LJFF = C60903NvH.LJIIJJI().LJJJI().LJFF();
            GPP gpp = new GPP(sourceDraftData, new C41360GLc("delete from CreativeNowDraftService"), null, null, 60);
            this.LJLIL = 1;
            if (LJFF.LJFF(gpp, this) == enumC58928NAu) {
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
