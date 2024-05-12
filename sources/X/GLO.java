package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import fjb.a;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.external.CreativeNowDraftService$getNowDraftList$1", f = "CreativeNowDraftService.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GLO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ List<AwemeDraft> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLO(List<AwemeDraft> list, InterfaceC67352kd<? super GLO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GLO(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Iterator<AwemeDraft> it;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                it = (Iterator) this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            it = this.LJLJI.iterator();
        }
        while (it.hasNext()) {
            AwemeDraft next = it.next();
            C268713r.LIZ();
            C41958GdO.LJIILJJIL(next.LIZJ());
            InterfaceC41392GMi LJFF = C60903NvH.LJIIJJI().LJJJI().LJFF();
            GPP gpp = new GPP(next, new C41360GLc("auto delete invalid now draft", "autoDeleteInvalidNowDraft"), null, null, 60);
            this.LJLIL = it;
            this.LJLILLLLZI = 1;
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
