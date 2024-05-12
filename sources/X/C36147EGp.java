package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaCacheRepository$cacheImageSize$1", f = "MediaCacheRepository.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EGp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36147EGp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36147EGp(String str, InterfaceC67352kd<? super C36147EGp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36147EGp(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        OSZ<Integer, Integer> LJIJJ = C38891fp.LJIJJ(this.LJLIL);
        if (LJIJJ.getFirst().intValue() != 0 && LJIJJ.getSecond().intValue() != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cacheImageSize ");
            LIZ.append(this.LJLIL);
            LIZ.append("-->");
            LIZ.append(LJIJJ);
            H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ));
            C37335El1.LIZIZ.put(this.LJLIL, LJIJJ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
