package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.NotificationManager$handleSystemCamera$1$1", f = "NotificationManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66092ib extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C49E LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66092ib(C49E c49e, boolean z, InterfaceC67352kd<? super C66092ib> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c49e;
        this.LJLILLLLZI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66092ib(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZJ = this.LJLILLLLZI;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
