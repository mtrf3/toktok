package X;

import fjb.a;
import java.util.LinkedHashMap;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.preloader.EcomLynxImagePreloader$updateBitmapCacheForBiz$1", f = "EcomLynxImagePreloader.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2ux, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73752ux extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73752ux(String str, InterfaceC67352kd<? super C73752ux> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C73752ux(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<C78727Uv5> LIZ;
        C141335gf.LIZJ(obj);
        AbstractC73692ur abstractC73692ur = (AbstractC73692ur) ((LinkedHashMap) C73732uv.LIZIZ).get(this.LJLIL);
        if (abstractC73692ur != null && (LIZ = abstractC73692ur.LIZ()) != null) {
            String str = this.LJLIL;
            for (C78727Uv5 c78727Uv5 : LIZ) {
                ((C78758Uva) C73732uv.LIZ.getValue()).LJFF(str, c78727Uv5.LIZ, c78727Uv5.LIZIZ, c78727Uv5.LIZJ, c78727Uv5.LIZLLL, c78727Uv5.LJ, c78727Uv5.LJFF, c78727Uv5.LJI, c78727Uv5.LJII, c78727Uv5.LJIIIIZZ, c78727Uv5.LJIILIIL, c78727Uv5.LJIIL);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
