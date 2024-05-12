package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.activitystatus.data.MUFActivityStatusModel$1", f = "MUFActivityStatusModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79513Ad extends AbstractC65782Prm implements InterfaceC88471Ynr<Boolean, InterfaceC67352kd<? super C79593Al>, Object> {
    public /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C79613An LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79513Ad(C79613An c79613An, InterfaceC67352kd<? super C79513Ad> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c79613An;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C79513Ad c79513Ad = new C79513Ad(this.LJLILLLLZI, interfaceC67352kd);
        c79513Ad.LJLIL = ((Boolean) obj).booleanValue();
        return c79513Ad;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return this.LJLILLLLZI.LIZJ(this.LJLIL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Boolean bool, InterfaceC67352kd<? super C79593Al> interfaceC67352kd) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
