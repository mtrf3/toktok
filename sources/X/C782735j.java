package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusMsgModel$typingStatusEventObserver$1$1", f = "ActivityStatusMsgModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.35j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C782735j extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3A6 LJLIL;
    public final /* synthetic */ Long LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C782735j(C3A6 c3a6, Long l, Long l2, InterfaceC67352kd<? super C782735j> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3a6;
        this.LJLILLLLZI = l;
        this.LJLJI = l2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C782735j(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C98453th c98453th = this.LJLIL.LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receiving typing event create time ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" sender ");
        LIZ.append(this.LJLJI);
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        C3A6 c3a6 = this.LJLIL;
        long longValue = this.LJLILLLLZI.longValue() / 1000;
        Long senderUid = this.LJLJI;
        o.LJIIIIZZ(senderUid, "senderUid");
        c3a6.LIZIZ(C47261Igj.LJJIJ(new C782935l(longValue, senderUid.longValue())));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
