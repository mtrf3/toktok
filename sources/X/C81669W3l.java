package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.cache.NowMediaCacheManager$deleteCacheByAid$2", f = "NowMediaCacheManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.W3l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81669W3l extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81669W3l(String str, InterfaceC67352kd<? super C81669W3l> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C81669W3l(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C81677W3t LIZ = C81674W3q.LIZLLL().LJIJ().LIZ(this.LJLIL);
        if (LIZ == null) {
            return C76800UCe.LIZ;
        }
        C81674W3q.LIZJ(LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
