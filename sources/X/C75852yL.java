package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationManager$showNotification$1$1", f = "IMNotificationManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2yL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75852yL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C31Q LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75852yL(C31Q c31q, InterfaceC67352kd<? super C75852yL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c31q;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75852yL(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (C34235Dc7.LIZ()) {
            C112444bA LJI = this.LJLIL.LJI();
            LJI.getClass();
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C75862yM(0L, LJI, null), 3);
        } else {
            this.LJLIL.LJI().LIZJ(0L);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
