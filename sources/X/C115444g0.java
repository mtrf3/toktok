package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.receivenewmessage.NewMsgNotifyUseCase$recordDebugSnapshotInSP$1", f = "NewMsgNotifyUseCase.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4g0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115444g0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C63385OuD LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C115444g0(long j, long j2, String str, C63385OuD c63385OuD, int i, InterfaceC67352kd<? super C115444g0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = str;
        this.LJLJJI = c63385OuD;
        this.LJLJJL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C115444g0(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C63308Osy.LJI().getClass();
        java.util.Map LJJL = C113554cx.LJJL(new OSZ("timestamp", String.valueOf(C63308Osy.LJ())), new OSZ("next_cursor", String.valueOf(this.LJLIL)), new OSZ("msg_id", String.valueOf(this.LJLILLLLZI)), new OSZ("log_id", this.LJLJI));
        C63291Osh invoke = this.LJLJJI.LIZJ.invoke();
        int i = this.LJLJJL;
        String obj2 = LJJL.toString();
        invoke.getClass();
        C63291Osh.LIZLLL.putString(C63291Osh.LJIIIIZZ(i, "key_new_msg_notify_snapshot"), obj2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
