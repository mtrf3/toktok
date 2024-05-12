package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusMsgModel$globalMsgObserver$1$onGetModifyPropertyMsg$1", f = "ActivityStatusMsgModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.35i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C782635i extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3A6 LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;
    public final /* synthetic */ Long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C782635i(C3A6 c3a6, C109544Rq c109544Rq, Long l, Long l2, InterfaceC67352kd<? super C782635i> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3a6;
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = l;
        this.LJLJJI = l2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C782635i(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C98453th c98453th = this.LJLIL.LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("msg sender ");
        LIZ.append(this.LJLILLLLZI.getSender());
        LIZ.append(" updateTimestamp ");
        LIZ.append(this.LJLJI);
        LIZ.append(" sender ");
        LIZ.append(this.LJLJJI);
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        C3A6 c3a6 = this.LJLIL;
        long longValue = this.LJLJJI.longValue();
        long longValue2 = this.LJLJI.longValue();
        C109544Rq c109544Rq = this.LJLILLLLZI;
        c3a6.getClass();
        if ((c109544Rq == null || (C3AA.LIZLLL && c109544Rq.getConversationType() == AbstractC63505Ow9.LIZIZ)) && C3A6.LIZ(longValue)) {
            c3a6.LIZIZ(C47261Igj.LJJIJ(new C782935l(longValue2 / 1000, longValue)));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
