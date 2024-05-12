package X;

import Y.ARunnableS20S0200000_1;
import android.os.Handler;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.unread.DMInboxUnreadHelper$onNoticeReady$1", f = "DMInboxUnreadHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3KW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3KV LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3KW(C3KV c3kv, InterfaceC67352kd<? super C3KW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3kv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3KW(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.getClass();
        C3KX LIZJ = C3KV.LIZJ();
        if (LIZJ == null) {
            return C76800UCe.LIZ;
        }
        ARunnableS20S0200000_1 aRunnableS20S0200000_1 = new ARunnableS20S0200000_1(this.LJLIL, LIZJ, 64);
        if ((C82133Kf.LIZ() & 4) != 0) {
            ((Handler) this.LJLIL.LIZ.getValue()).postAtFrontOfQueue(aRunnableS20S0200000_1);
        } else {
            ((Handler) this.LJLIL.LIZ.getValue()).post(aRunnableS20S0200000_1);
        }
        this.LJLIL.LIZJ = null;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
