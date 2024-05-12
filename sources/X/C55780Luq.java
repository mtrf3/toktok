package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.video.vo.ECAwemeListModel$refreshList$2", f = "ECAwemeListModel.kt", l = {103, 104}, m = "invokeSuspend")
/* renamed from: X.Luq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55780Luq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C55781Lur LJLJI;
    public final /* synthetic */ M89 LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55780Luq(long j, C55781Lur c55781Lur, M89 m89, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c55781Lur;
        this.LJLJJI = m89;
        this.LJLJJL = j;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55780Luq c55780Luq = new C55780Luq(this.LJLJJL, this.LJLJI, this.LJLJJI, this.LJLJJLL, interfaceC67352kd);
        c55780Luq.LJLILLLLZI = obj;
        return c55780Luq;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r5 = r16
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r15.LJLIL
            r14 = 0
            r3 = 2
            r7 = 1
            if (r0 == 0) goto L7a
            if (r0 == r7) goto Laa
            if (r0 != r3) goto Lc2
            java.lang.Object r2 = r15.LJLILLLLZI
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            X.C141335gf.LIZJ(r5)
        L16:
            com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel r5 = (com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel) r5
            if (r2 == 0) goto L23
            X.Lur r0 = r15.LJLJI
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.LJLJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
        L23:
            X.Lur r0 = r15.LJLJI
            if (r5 == 0) goto L2b
            java.lang.String r14 = r5.getSessionId()
        L2b:
            r0.LJLJJI = r14
            X.Lur r1 = r15.LJLJI
            X.M89 r0 = r15.LJLJJI
            r1.getClass()
            X.C55781Lur.LJIIJ(r2, r0, r7)
            if (r5 == 0) goto L40
            X.Lur r1 = r15.LJLJI
            X.M89 r0 = r15.LJLJJI
            r1.LJIIIZ(r5, r0)
        L40:
            X.Lur r0 = r15.LJLJI
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.LJLJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L77
            X.Lur r0 = r15.LJLJI
            com.bytedance.common.utility.collection.WeakHandler r1 = r0.mHandler
            r0 = 0
            android.os.Message r4 = r1.obtainMessage(r0)
            java.lang.String r0 = "mHandler.obtainMessage(MSG_REQUEST)"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            if (r5 != 0) goto L67
            com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel r5 = new com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel
            r6 = 0
            r8 = r7
            r9 = r6
            r10 = r6
            r5.<init>(r6, r7, r8, r9, r10)
        L67:
            r4.obj = r5
            X.Lur r3 = r15.LJLJI
            android.os.Handler r2 = r3.LJLJJL
            Y.ARunnableS28S0200000_9 r1 = new Y.ARunnableS28S0200000_9
            r0 = 64
            r1.<init>(r4, r3, r0)
            r2.post(r1)
        L77:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L7a:
            X.C141335gf.LIZJ(r5)
            java.lang.Object r5 = r15.LJLILLLLZI
            X.2pa r5 = (X.InterfaceC70422pa) r5
            X.XIA r4 = X.C78613UtF.LIZJ
            X.Lu2 r1 = new X.Lu2
            X.M89 r0 = r15.LJLJJI
            r1.<init>(r0, r14)
            X.XKn r1 = X.XKX.LIZIZ(r5, r4, r14, r1, r3)
            X.LvE r8 = new X.LvE
            X.M89 r12 = r15.LJLJJI
            X.Lur r11 = r15.LJLJI
            long r9 = r15.LJLJJL
            java.lang.String r13 = r15.LJLJJLL
            r8.<init>(r9, r11, r12, r13, r14)
            X.XKn r0 = X.XKX.LIZIZ(r5, r4, r14, r8, r3)
            r15.LJLILLLLZI = r0
            r15.LJLIL = r7
            java.lang.Object r5 = r1.LJJIJ(r15)
            if (r5 != r2) goto Lb1
            return r2
        Laa:
            java.lang.Object r0 = r15.LJLILLLLZI
            X.2mE r0 = (X.InterfaceC68342mE) r0
            X.C141335gf.LIZJ(r5)
        Lb1:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            r15.LJLILLLLZI = r5
            r15.LJLIL = r3
            java.lang.Object r0 = r0.LJI(r15)
            if (r0 != r2) goto Lbe
            return r2
        Lbe:
            r2 = r5
            r5 = r0
            goto L16
        Lc2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55780Luq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
