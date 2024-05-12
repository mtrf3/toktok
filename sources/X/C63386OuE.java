package X;

import fjb.a;
import java.util.Collections;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer$notifySingleMsgObservers$2", f = "SingleInboxMessageReceiveBuffer.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.OuE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63386OuE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C109544Rq LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C63420Oum LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63386OuE(C109544Rq c109544Rq, boolean z, int i, C63420Oum c63420Oum, InterfaceC67352kd<? super C63386OuE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c109544Rq;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJI = c63420Oum;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63386OuE(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "notifyMsgListObservers, message ");
        LIZIZ.append(this.LJLIL.getMsgId());
        LIZIZ.append(" isNew ");
        LIZIZ.append(this.LJLILLLLZI);
        LIZIZ.append(" msgSource ");
        LIZIZ.append(this.LJLJI);
        C63322OtC.LJI("SingleInboxMessageReceiveBuffer", X1D.LIZIZ(LIZIZ), null);
        if (this.LJLILLLLZI) {
            this.LJLJJI.LJ.LIZLLL().LJFF(C47261Igj.LJJIJ(this.LJLIL), this.LJLJI, new C107074Id());
        } else {
            C63309Osz LIZLLL = this.LJLJJI.LJ.LIZLLL();
            C109544Rq c109544Rq = this.LJLIL;
            int i = this.LJLJI;
            LIZLLL.getClass();
            LIZLLL.LJIIL(new HashMap(), i, Collections.singletonList(c109544Rq));
        }
        this.LJLJJI.LJ.LJIIIZ().LJIJI(2, this.LJLJJI.LJ.LJIIIZ().LJIIIZ(this.LJLIL.getConversationId()));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
