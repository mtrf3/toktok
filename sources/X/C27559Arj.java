package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$changeCacheFavoriteStatus$1", f = "PdpViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Arj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27559Arj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PdpViewModel LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27559Arj(PdpViewModel pdpViewModel, boolean z, InterfaceC67352kd<? super C27559Arj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = pdpViewModel;
        this.LJLILLLLZI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27559Arj(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ProductPackStruct first;
        int i;
        C141335gf.LIZJ(obj);
        LruCache<String, OSZ<ProductPackStruct, String>> lruCache = PdpViewModel.LLLJIL;
        OSZ<ProductPackStruct, String> osz = lruCache.get(this.LJLIL.jw0());
        if (osz == null || (first = osz.getFirst()) == null) {
            return C76800UCe.LIZ;
        }
        if (this.LJLILLLLZI) {
            i = 1;
        } else {
            i = 2;
        }
        ProductPackStruct LIZ = ProductPackStruct.LIZ(first, null, null, null, null, null, new Integer(i), null, null, -1, -4194305);
        lruCache.put(this.LJLIL.jw0(), new OSZ<>(LIZ, C27739Aud.LJI(LIZ)));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
