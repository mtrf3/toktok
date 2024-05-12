package X;

import java.util.Arrays;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.cache.NowMediaCacheManager$checkCachesOverloaded$2", f = "NowMediaCacheManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.W3m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81670W3m extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C81670W3m(InterfaceC67352kd<? super C81670W3m> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C81670W3m(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        int count = (C81674W3q.LIZLLL().LJIJ().getCount() + 1) - 150;
        if (count >= 0) {
            C81677W3t[] LIZLLL = C81674W3q.LIZLLL().LJIJ().LIZLLL(count);
            C81674W3q.LIZJ((C81677W3t[]) Arrays.copyOf(LIZLLL, LIZLLL.length));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C81670W3m(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
