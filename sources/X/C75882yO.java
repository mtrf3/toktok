package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationPlayer$showNotification$1$1", f = "IMNotificationPlayer.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2yO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75882yO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C112444bA LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75882yO(C112444bA c112444bA, InterfaceC67352kd<? super C75882yO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c112444bA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75882yO(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZIZ = false;
        this.LJLIL.LIZ = false;
        this.LJLIL.LIZJ(0L);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
