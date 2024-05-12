package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.notification.creator.manager.CreatorNoticeCacheManager$requestJanusNotice$2", f = "CreatorNoticeCacheManager.kt", l = {79, 80}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MTC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public MTC(InterfaceC67352kd<? super MTC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new MTC(interfaceC67352kd);
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
            C221018lt.LJFF("Creators_Inbox", "start janusRequest");
            MTD.LIZ.getValue().getClass();
            MOR mor = new MOR();
            this.LJLIL = 1;
            obj = mor.LJJJIL(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC72932td<NoticeCombineResponse> abstractC72932td = (AbstractC72932td) obj;
        this.LJLIL = 2;
        C221018lt.LJFF("Creators_Inbox", "writeJanusResponseCache");
        MTD.LIZLLL = abstractC72932td;
        Object emit = ((C3BJ) MTD.LIZJ.getValue()).emit(abstractC72932td, this);
        if (emit != enumC58928NAu) {
            emit = C76800UCe.LIZ;
        }
        if (emit == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new MTC(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
