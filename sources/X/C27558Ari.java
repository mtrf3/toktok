package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$clearUnreadMsgCountInCache$1$1", f = "PdpViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Ari, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27558Ari extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27558Ari(String str, InterfaceC67352kd<? super C27558Ari> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27558Ari(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        SellerInfo sellerInfo;
        Integer num;
        C141335gf.LIZJ(obj);
        OSZ<ProductPackStruct, String> osz = PdpViewModel.LLLJIL.get(this.LJLIL);
        SellerInfo sellerInfo2 = null;
        if (osz != null) {
            str = osz.getSecond();
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(ProductPackStruct.class)));
                if (!(fromJson instanceof ProductPackStruct)) {
                    fromJson = null;
                }
                ProductPackStruct productPackStruct = (ProductPackStruct) fromJson;
                if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null && (num = sellerInfo.unreadMsgCount) != null && num.intValue() > 0) {
                    SellerInfo sellerInfo3 = productPackStruct.sellerInfo;
                    if (sellerInfo3 != null) {
                        sellerInfo2 = new SellerInfo(sellerInfo3.sellerId, sellerInfo3.name, sellerInfo3.avatar, sellerInfo3.productCount, sellerInfo3.rating, sellerInfo3.link, sellerInfo3.imSchema, sellerInfo3.phoneContact, sellerInfo3.shopLink, sellerInfo3.storeLabel, sellerInfo3.shopRecommend, sellerInfo3.isHide, sellerInfo3.sellerDetailInfos, sellerInfo3.ratingPercentile, sellerInfo3.ratingStyle, new Integer(0), sellerInfo3.ratingShowNA, sellerInfo3.sloganText, sellerInfo3.sellerSellingPoint);
                    }
                    ProductPackStruct LIZ = ProductPackStruct.LIZ(productPackStruct, sellerInfo2, null, null, null, null, null, null, null, -5, -1);
                    PdpViewModel.LLLJIL.put(this.LJLIL, new OSZ<>(LIZ, C27739Aud.LJI(LIZ)));
                }
            } catch (s unused) {
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
