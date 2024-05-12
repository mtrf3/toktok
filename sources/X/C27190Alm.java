package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.OspPreviewManager$preloadAddress$1", f = "OspPreviewManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Alm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27190Alm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;

    public C27190Alm(InterfaceC67352kd<? super C27190Alm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C27190Alm c27190Alm = new C27190Alm(interfaceC67352kd);
        c27190Alm.LJLIL = obj;
        return c27190Alm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C84661XKn LIZIZ = XKX.LIZIZ((InterfaceC70422pa) this.LJLIL, null, null, new C27189All(null), 3);
        synchronized (C27191Aln.LIZ) {
            C27191Aln.LIZIZ.put("key_address_deferred", LIZIZ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
