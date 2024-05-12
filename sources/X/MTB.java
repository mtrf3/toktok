package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM$getJanusRequestDeferred$1", f = "CreatorNoticeResultVM.kt", l = {310, 311}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MTB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AbstractC72932td<? extends NoticeCombineResponse>>, Object> {
    public AbstractC72932td LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ MT7 LJLJI;
    public final /* synthetic */ CreatorNoticeResultVM LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTB(MT7 mt7, CreatorNoticeResultVM creatorNoticeResultVM, InterfaceC67352kd<? super MTB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = mt7;
        this.LJLJJI = creatorNoticeResultVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new MTB(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    AbstractC72932td abstractC72932td = this.LJLIL;
                    C141335gf.LIZJ(obj);
                    return abstractC72932td;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            AbstractC72932td<NoticeCombineResponse> abstractC72932td2 = MTD.LIZLLL;
            if (MTE.LIZIZ.contains(this.LJLJI) || !(abstractC72932td2 instanceof C72912tb)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Need Refresh Janus : ");
                LIZ.append(this.LJLJI);
                LIZ.append(" + ");
                LIZ.append(abstractC72932td2);
                C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ));
                this.LJLJJI.LJLJJLL.getValue().getClass();
                MOR mor = new MOR();
                this.LJLILLLLZI = 1;
                obj = mor.LJJJIL(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Use Janus Cache: ");
                LIZ2.append(this.LJLJI);
                LIZ2.append(" + ");
                LIZ2.append(abstractC72932td2);
                C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ2));
                return abstractC72932td2;
            }
        }
        AbstractC72932td<NoticeCombineResponse> abstractC72932td3 = (AbstractC72932td) obj;
        this.LJLIL = abstractC72932td3;
        this.LJLILLLLZI = 2;
        C221018lt.LJFF("Creators_Inbox", "writeJanusResponseCache");
        MTD.LIZLLL = abstractC72932td3;
        Object emit = ((C3BJ) MTD.LIZJ.getValue()).emit(abstractC72932td3, this);
        if (emit != enumC58928NAu) {
            emit = C76800UCe.LIZ;
        }
        if (emit == enumC58928NAu) {
            return enumC58928NAu;
        }
        return abstractC72932td3;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AbstractC72932td<? extends NoticeCombineResponse>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
