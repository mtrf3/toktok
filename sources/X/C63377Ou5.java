package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer$recordNewMsgNotifyInSP$1", f = "SingleInboxMessageReceiveBuffer.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Ou5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63377Ou5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C63420Oum LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63377Ou5(long j, long j2, C63420Oum c63420Oum, int i, InterfaceC67352kd<? super C63377Ou5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = c63420Oum;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63377Ou5(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C63308Osy.LJI().getClass();
        java.util.Map LJJL = C113554cx.LJJL(new OSZ("timestamp", String.valueOf(C63308Osy.LJ())), new OSZ("next_cursor", String.valueOf(this.LJLIL)), new OSZ("msg_id", String.valueOf(this.LJLILLLLZI)));
        C63291Osh LJIILJJIL = this.LJLJI.LJ.LJIILJJIL();
        int i = this.LJLJJI;
        String obj2 = LJJL.toString();
        LJIILJJIL.getClass();
        C63291Osh.LIZLLL.putString(C63291Osh.LJIIIIZZ(i, "key_new_msg_notify_snapshot"), obj2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
