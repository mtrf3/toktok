package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusMsgModel$globalMsgObserver$1$onGetMessage$1", f = "ActivityStatusMsgModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.35g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C782435g extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3A6 LJLIL;
    public final /* synthetic */ List<C109544Rq> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C782435g(C3A6 c3a6, List<C109544Rq> list, int i, InterfaceC67352kd<? super C782435g> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3a6;
        this.LJLILLLLZI = list;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C782435g(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C141335gf.LIZJ(obj);
        C98453th c98453th = this.LJLIL.LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGetMessage size ");
        List<C109544Rq> list = this.LJLILLLLZI;
        if (list != null) {
            num = new Integer(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(" msgSource ");
        LIZ.append(this.LJLJI);
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        this.LJLIL.LIZJ(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
