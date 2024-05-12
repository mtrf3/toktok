package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.StoryDraftServiceImpl$deleteDraft$1", f = "StoryDraftServiceImpl.kt", l = {61}, m = "invokeSuspend")
/* renamed from: X.GLe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41362GLe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SimplePublishModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41362GLe(SimplePublishModel simplePublishModel, InterfaceC67352kd<? super C41362GLe> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = simplePublishModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41362GLe(this.LJLILLLLZI, interfaceC67352kd);
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
            AwemeDraft LJ = C60903NvH.LJIIJJI().LJJJI().LIZJ().LJ(new C41363GLf(new CreativeInfo(this.LJLILLLLZI.getCreationId(), 0, null, 6, null), false));
            if (LJ == null) {
                return C76800UCe.LIZ;
            }
            C268713r.LIZ();
            C41958GdO.LJIILJJIL(LJ.LIZJ());
            InterfaceC41392GMi LJFF = C60903NvH.LJIIJJI().LJJJI().LJFF();
            GPP gpp = new GPP(LJ, new C41360GLc("delete from CreativeNowDraftService", "deleteStory"), null, null, 60);
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
