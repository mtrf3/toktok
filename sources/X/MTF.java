package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM$requestNotice$1$1$1", f = "CreatorNoticeResultVM.kt", l = {279, 280, 284}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MTF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public AbstractC72932td LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ NoticeTabModel LJLJI;
    public final /* synthetic */ MT7 LJLJJI;
    public final /* synthetic */ InterfaceC68342mE<AbstractC72932td<CreatorNoticeResponse>> LJLJJL;
    public final /* synthetic */ InterfaceC68342mE<AbstractC72932td<NoticeCombineResponse>> LJLJJLL;
    public final /* synthetic */ CreatorNoticeResultVM LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MTF(NoticeTabModel noticeTabModel, MT7 mt7, InterfaceC68342mE<? extends AbstractC72932td<CreatorNoticeResponse>> interfaceC68342mE, InterfaceC68342mE<? extends AbstractC72932td<NoticeCombineResponse>> interfaceC68342mE2, CreatorNoticeResultVM creatorNoticeResultVM, InterfaceC67352kd<? super MTF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = noticeTabModel;
        this.LJLJJI = mt7;
        this.LJLJJL = interfaceC68342mE;
        this.LJLJJLL = interfaceC68342mE2;
        this.LJLJL = creatorNoticeResultVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new MTF(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r1 = r9
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLILLLLZI
            r5 = 3
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 == r2) goto L55
            if (r0 == r4) goto L27
            if (r0 != r5) goto L8b
            X.C141335gf.LIZJ(r1)
        L13:
            X.2td r1 = (X.AbstractC72932td) r1
            kotlin.jvm.internal.AqS69S0400000_9 r0 = new kotlin.jvm.internal.AqS69S0400000_9
            com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM r4 = r8.LJLJL
            X.MT7 r2 = r8.LJLJJI
            com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel r3 = r8.LJLJI
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            X.MS5.LIZ(r0)
        L24:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L27:
            X.2td r5 = r8.LJLIL
            X.C141335gf.LIZJ(r1)
            goto L69
        L2d:
            X.C141335gf.LIZJ(r1)
            com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel r0 = r8.LJLJI
            boolean r0 = r0.needCombineExtraData
            if (r0 == 0) goto L7b
            java.util.List<X.MT7> r1 = X.MTE.LIZ
            X.MT7 r0 = r8.LJLJJI
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L7b
            X.2mE<X.2td<com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse>> r0 = r8.LJLJJL
            r0.LJIILL()
            X.2mE<X.2td<com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse>> r0 = r8.LJLJJLL
            r0.LJIILL()
            X.2mE<X.2td<com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse>> r0 = r8.LJLJJL
            r8.LJLILLLLZI = r2
            java.lang.Object r1 = r0.LJI(r8)
            if (r1 != r3) goto L58
            return r3
        L55:
            X.C141335gf.LIZJ(r1)
        L58:
            X.2td r1 = (X.AbstractC72932td) r1
            X.2mE<X.2td<com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse>> r0 = r8.LJLJJLL
            r8.LJLIL = r1
            r8.LJLILLLLZI = r4
            java.lang.Object r0 = r0.LJI(r8)
            if (r0 != r3) goto L67
            return r3
        L67:
            r5 = r1
            r1 = r0
        L69:
            X.2td r1 = (X.AbstractC72932td) r1
            X.MTM r2 = new X.MTM
            com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM r3 = r8.LJLJL
            X.MT7 r6 = r8.LJLJJI
            com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel r7 = r8.LJLJI
            r4 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            X.MS5.LIZ(r2)
            goto L24
        L7b:
            X.2mE<X.2td<com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse>> r0 = r8.LJLJJL
            r0.LJIILL()
            X.2mE<X.2td<com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse>> r0 = r8.LJLJJL
            r8.LJLILLLLZI = r5
            java.lang.Object r1 = r0.LJI(r8)
            if (r1 != r3) goto L13
            return r3
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MTF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
