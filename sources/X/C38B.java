package X;

import com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource$performFullUpdate$3", f = "StorageDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.38B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38B extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<? super LocalListResponse>, Throwable, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;

    public C38B(InterfaceC67352kd<? super C38B> interfaceC67352kd) {
        super(3, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C69542oA.LIZ("DataSource", "getAllPagingFlow error", (Throwable) this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<? super LocalListResponse> interfaceC64672gJ, Throwable th, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C38B c38b = new C38B(interfaceC67352kd);
        c38b.LJLIL = th;
        return c38b.invokeSuspend(C76800UCe.LIZ);
    }
}
