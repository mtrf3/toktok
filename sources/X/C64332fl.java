package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.util.GsonUtilHelper$toJsonOnCoroutine$2", f = "GsonUtilHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64332fl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public final /* synthetic */ Object LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64332fl(Object obj, InterfaceC67352kd<? super C64332fl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = obj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64332fl(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C75792yF.LIZJ(this.LJLIL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
