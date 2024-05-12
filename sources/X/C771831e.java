package X;

import fjb.a;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationManager$onGetModifyPropertyMsg$1$onSuccess$1", f = "IMNotificationManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.31e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C771831e extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<AnonymousClass323> LJLIL;
    public final /* synthetic */ C31Q LJLILLLLZI;
    public final /* synthetic */ C109544Rq LJLJI;
    public final /* synthetic */ C63120Opw LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C771831e(List<AnonymousClass323> list, C31Q c31q, C109544Rq c109544Rq, C63120Opw c63120Opw, InterfaceC67352kd<? super C771831e> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = c31q;
        this.LJLJI = c109544Rq;
        this.LJLJJI = c63120Opw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C771831e(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C34K c34k = new C34K();
        List<AnonymousClass323> list = this.LJLIL;
        if (list != null) {
            C109544Rq message = this.LJLJI;
            C63120Opw conversation = this.LJLJJI;
            for (AnonymousClass323 property : list) {
                C771931f.LJI.getClass();
                o.LJIIIZ(message, "message");
                o.LJIIIZ(conversation, "conversation");
                o.LJIIIZ(property, "property");
                C771931f c771931f = new C771931f(EnumC772331j.PROPERTY, 0, message, conversation, property, null, 34);
                if (C773631w.LIZJ(c771931f)) {
                    ((LinkedBlockingDeque) C3GW.LIZIZ).offer(c771931f);
                    c34k.element = true;
                }
            }
        }
        if (c34k.element) {
            this.LJLILLLLZI.LIZJ();
            C31Q.LJIIL(this.LJLILLLLZI, 1000L, 2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
