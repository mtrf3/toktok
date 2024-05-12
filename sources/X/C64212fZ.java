package X;

import com.zhiliaoapp.musically.R;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostDeleteServiceImpl$delete$1$2", f = "NowPostDeleteService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2fZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64212fZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C64212fZ(InterfaceC67352kd<? super C64212fZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64212fZ(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZJ(R.string.efx);
        c5s1.LJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C64212fZ(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
