package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.activitystatus.data.MUFActivityStatusModel$2", f = "MUFActivityStatusModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Ak, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79583Ak extends AbstractC65782Prm implements InterfaceC88471Ynr<C79593Al, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C79613An LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79583Ak(C79613An c79613An, InterfaceC67352kd<? super C79583Ak> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c79613An;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C79583Ak c79583Ak = new C79583Ak(this.LJLILLLLZI, interfaceC67352kd);
        c79583Ak.LJLIL = obj;
        return c79583Ak;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C79593Al c79593Al = (C79593Al) this.LJLIL;
        C98453th c98453th = this.LJLILLLLZI.LJFF;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notify ui update, size ");
        LIZ.append(c79593Al.LJLIL.size());
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        if (C53117Ksz.LIZIZ) {
            if (c79593Al.LJLJJL) {
                C79603Am.LIZ(c79593Al.LJLJJI, c79593Al.LJLILLLLZI, c79593Al.LJLJI, this.LJLILLLLZI.LIZJ);
            }
            this.LJLILLLLZI.LJIIIZ.postValue(c79593Al.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C79593Al c79593Al, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c79593Al, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
