package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaCacheRepository$updateMediaTypeCache$1", f = "MediaCacheRepository.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EGq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36148EGq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36148EGq(String str, InterfaceC67352kd<? super C36148EGq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36148EGq(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        boolean LJIJI = C44694HgQ.LJIJI(this.LJLIL, true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set ");
        LIZ.append(this.LJLIL);
        LIZ.append("-->isImage:");
        LIZ.append(LJIJI);
        H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ));
        C37335El1.LIZ.put(this.LJLIL, Boolean.valueOf(LJIJI));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
