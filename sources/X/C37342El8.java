package X;

import com.bytedance.mt.protector.impl.UriProtector;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.ecommerce.live.TopLiveProductViewNew$preloadImage$1", f = "TopLiveProductViewNew.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.El8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37342El8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ KSB LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37342El8(KSB ksb, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = ksb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C37342El8(this.LJLILLLLZI, this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70869Rrd LIZJ = W5U.LIZJ();
        if (LIZJ == null || !LIZJ.LIZ(UriProtector.parse(this.LJLIL))) {
            W5U.LJIIIIZZ(this.LJLIL).LJIIIZ(new C37343El9(this.LJLILLLLZI));
        } else {
            C84657XKj c84657XKj = this.LJLILLLLZI.LJLLLLLL;
            if (c84657XKj != null) {
                c84657XKj.LJJLI(C76800UCe.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
