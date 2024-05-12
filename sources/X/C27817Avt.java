package X;

import com.bytedance.mt.protector.impl.UriProtector;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.utils.ShopWindowViewImageFetcher$loadImage$1", f = "ShopWindowViewImageFetcher.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Avt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27817Avt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC43919HLn<C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27817Avt(String str, InterfaceC43919HLn<C76800UCe> interfaceC43919HLn, InterfaceC67352kd<? super C27817Avt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC43919HLn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27817Avt(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String imageUrl = this.LJLIL;
        o.LJIIIZ(imageUrl, "imageUrl");
        android.net.Uri parse = UriProtector.parse(imageUrl);
        o.LJIIIIZZ(parse, "parse(imageUrl)");
        if (!C70759Rpr.LIZIZ(parse)) {
            C70759Rpr.LIZLLL(this.LJLIL).LJIIIZ(new C27818Avu(this.LJLILLLLZI));
        } else {
            this.LJLILLLLZI.LJ(C76800UCe.LIZ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
