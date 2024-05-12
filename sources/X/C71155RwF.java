package X;

import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommercelive.common.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import fjb.a;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.common.room.EcommerceRoomStatusProvider$onEnterRoom$1$1", f = "EcommerceRoomStatusProvider.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.RwF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71155RwF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ OecInitData LJLIL;
    public final /* synthetic */ Room LJLILLLLZI;
    public final /* synthetic */ C71151RwB LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71155RwF(OecInitData oecInitData, Room room, C71151RwB c71151RwB, InterfaceC67352kd<? super C71155RwF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = oecInitData;
        this.LJLILLLLZI = room;
        this.LJLJI = c71151RwB;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71155RwF(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        if (this.LJLIL.product != null) {
            String str2 = null;
            if (C53175Ktv.LIZ()) {
                CommerceStruct commerceStruct = this.LJLILLLLZI.getCommerceStruct();
                if (commerceStruct != null && (str = commerceStruct.oecInitDataString) != null) {
                    try {
                        HashMap hashMap = (HashMap) C75792yF.LIZIZ().LJII(str, new TypeToken<HashMap<String, Object>>() { // from class: X.2Z3
                        }.getType());
                        if (hashMap != null) {
                            Object obj2 = hashMap.get("pop_product");
                            if (obj2 != null) {
                                hashMap.put("product", obj2);
                            }
                            hashMap.remove("pop_product");
                            str2 = C27739Aud.LJI(hashMap);
                        }
                    } catch (Exception unused) {
                    }
                }
            } else {
                C71151RwB c71151RwB = this.LJLJI;
                OecInitData oecInitData = this.LJLIL;
                c71151RwB.getClass();
                if (oecInitData != null) {
                    str2 = C27739Aud.LJI(new PopProductResp(oecInitData.product, oecInitData.hotTag, oecInitData.atmosphereTags, oecInitData.pinAtmosphereTags, oecInitData.serverTime, oecInitData.schema, oecInitData.bagIndex, null, null, 0L, 0, 1920, null));
                }
            }
            C71284RyK.LIZIZ("pin_product", String.valueOf(this.LJLILLLLZI.getId()), str2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
