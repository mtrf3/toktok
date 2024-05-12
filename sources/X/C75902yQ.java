package X;

import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationManager$reviewMsgReceivedInBackgroundWhenBack2Foreground$1", f = "IMNotificationManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2yQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75902yQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C31Q LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75902yQ(C31Q c31q, InterfaceC67352kd<? super C75902yQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c31q;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75902yQ(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List LLJI;
        C141335gf.LIZJ(obj);
        List<C109544Rq> msgListCacheForBackground = this.LJLIL.LJII;
        o.LJIIIIZZ(msgListCacheForBackground, "msgListCacheForBackground");
        C31Q c31q = this.LJLIL;
        synchronized (msgListCacheForBackground) {
            List<C109544Rq> msgListCacheForBackground2 = c31q.LJII;
            o.LJIIIIZZ(msgListCacheForBackground2, "msgListCacheForBackground");
            LLJI = ORZ.LLJI(msgListCacheForBackground2);
        }
        this.LJLIL.LJIILIIL(9, LLJI);
        this.LJLIL.LJII.clear();
        C31Q.LJIIL(this.LJLIL, 1000L, 2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
