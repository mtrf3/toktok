package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.ProductListApi$deleteProducts$2", f = "ProductListApi.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EJy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36234EJy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C36235EJz>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ EK0 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36234EJy(boolean z, String str, String str2, EK0 ek0, InterfaceC67352kd<? super C36234EJy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = ek0;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36234EJy(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        java.util.Map<String, String> LJJL;
        C141335gf.LIZJ(obj);
        try {
            if (this.LJLIL) {
                LJJL = C51029K0z.LJJIIZI(new OSZ("delete_mode", "1"));
            } else {
                LJJL = C113554cx.LJJL(new OSZ("room_id", this.LJLILLLLZI), new OSZ("product_ids", this.LJLJI), new OSZ("delete_mode", CardStruct.IStatusCode.DEFAULT));
            }
            return new C36235EJz(this.LJLJJI.LIZ.deleteProducts(LJJL).execute().LIZIZ, this.LJLJI, 4);
        } catch (Exception e) {
            return new C36235EJz((BaseResponse<String>) null, this.LJLJI, e);
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C36235EJz> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
