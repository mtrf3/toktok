package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.GetMsgByUserUseCase$recordDebugSnapshotInSP$1", f = "GetMsgByUserUseCase.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115254fh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C115254fh(long j, int i, int i2, boolean z, String str, String str2, int i3, InterfaceC67352kd<? super C115254fh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = j;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = z;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = i3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C115254fh(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C63308Osy.LJI().getClass();
        java.util.Map LJJL = C113554cx.LJJL(new OSZ("timestamp", String.valueOf(C63308Osy.LJ())), new OSZ("next_cursor", String.valueOf(this.LJLIL)), new OSZ("conv_count", String.valueOf(this.LJLILLLLZI)), new OSZ("msg_count", String.valueOf(this.LJLJI)), new OSZ("is_success", String.valueOf(this.LJLJJI)), new OSZ("error_msg", this.LJLJJL), new OSZ("log_id", this.LJLJJLL));
        C63291Osh LIZ = C63291Osh.LIZ();
        int i = this.LJLJL;
        String obj2 = LJJL.toString();
        LIZ.getClass();
        C63291Osh.LIZLLL.putString(C63291Osh.LJIIIIZZ(i, "key_pull_msg_by_user_snapshot"), obj2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
