package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeTabVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeTabVM$deletedNotice$1$2", f = "CreatorNoticeTabVM.kt", l = {183}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MDN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MusNotice LJLILLLLZI;
    public final /* synthetic */ CreatorNoticeTabVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MDN(MusNotice musNotice, CreatorNoticeTabVM creatorNoticeTabVM, InterfaceC67352kd<? super MDN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = musNotice;
        this.LJLJI = creatorNoticeTabVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new MDN(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                AbstractC73672Svk<BaseResponse> deleteNotice = NotificationApi.LIZ().deleteNotice(this.LJLILLLLZI.nid);
                this.LJLIL = 1;
                obj = C77318UWc.LIZIZ(deleteNotice, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (BaseResponse) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        CreatorNoticeTabVM creatorNoticeTabVM = this.LJLJI;
        MusNotice musNotice = this.LJLILLLLZI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            C221018lt.LIZ("Creators_Inbox", "Server deleted Notice success");
            creatorNoticeTabVM.setState(MS9.LJLIL);
            C56760MPk.LIZLLL(musNotice, (BaseResponse) LIZ, null);
        }
        CreatorNoticeTabVM creatorNoticeTabVM2 = this.LJLJI;
        MusNotice musNotice2 = this.LJLILLLLZI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("Creators_Inbox", "deleteData error", m10exceptionOrNullimpl);
            creatorNoticeTabVM2.setState(MS8.LJLIL);
            C56760MPk.LIZLLL(musNotice2, null, m10exceptionOrNullimpl);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
