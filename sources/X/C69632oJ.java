package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.sync.StorageSyncer$triggerFullUpdate$2$1", f = "StorageSyncer.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2oJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69632oJ extends AbstractC65782Prm implements InterfaceC88471Ynr<EnumC111394Yt, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;

    public C69632oJ(InterfaceC67352kd<? super C69632oJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C69632oJ c69632oJ = new C69632oJ(interfaceC67352kd);
        c69632oJ.LJLIL = obj;
        return c69632oJ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        if (this.LJLIL == C69662oM.LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(EnumC111394Yt enumC111394Yt, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(enumC111394Yt, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}