package X;

import com.google.gson.s;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.image.SearchImagePreload$dealVerticalSearchFirstScreenList$1", f = "SearchImagePreload.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2gT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64772gT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C64812gX LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64772gT(C64812gX c64812gX, String str, InterfaceC67352kd<? super C64772gT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c64812gX;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64772gT(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C64812gX c64812gX = this.LJLIL;
        String str = this.LJLILLLLZI;
        c64812gX.getClass();
        try {
            Object LJII = C27739Aud.LJFF().LJII(str, C65330PkU.LIZJ(C65352Pkq.LJI(C2RG.class)));
            if (!(LJII instanceof C2RG)) {
                LJII = null;
            }
        } catch (s | Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
