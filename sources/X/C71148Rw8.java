package X;

import com.ss.android.ugc.aweme.ecommercelive.common.data.OecInitData;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.common.room.EcommerceRoomStatusProvider$parseOecInitData$1", f = "EcommerceRoomStatusProvider.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rw8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71148Rw8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC70422pa, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ OecInitData LJLJI;
    public final /* synthetic */ Long LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C71148Rw8(InterfaceC88472Yns<? super InterfaceC70422pa, C76800UCe> interfaceC88472Yns, OecInitData oecInitData, Long l, boolean z, InterfaceC67352kd<? super C71148Rw8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = oecInitData;
        this.LJLJJI = l;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C71148Rw8 c71148Rw8 = new C71148Rw8(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c71148Rw8.LJLIL = obj;
        return c71148Rw8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLILLLLZI.invoke(this.LJLIL);
        OecInitData oecInitData = this.LJLJI;
        int i = oecInitData.productNum;
        int i2 = oecInitData.displayProductNum;
        if (i > 0 || i2 > 0) {
            C71167RwR.LIZ(this.LJLJJI, false, this.LJLJJL);
        }
        C71150RwA.LIZ = Math.max(i, i2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
