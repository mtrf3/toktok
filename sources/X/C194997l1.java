package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.cache.NowSelfAwemeCacheManager$insert$2", f = "NowSelfAwemeCacheManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7l1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194997l1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Aweme LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C194997l1(Aweme aweme, InterfaceC67352kd<? super C194997l1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C194997l1(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        VFJ.LIZ().LJIJ().LIZLLL(C188897bB.LIZ(this.LJLIL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
