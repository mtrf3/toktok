package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.usercard.profilev3.LiveProfileRepository$flushUserQuery$3", f = "LiveProfileRepository.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.BhG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29458BhG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C29465BhN LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29458BhG(C29465BhN c29465BhN, InterfaceC67352kd<? super C29458BhG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c29465BhN;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29458BhG(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZJ.setValue(new C29488Bhk<>(null, 2, null));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
