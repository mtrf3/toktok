package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import fjb.a;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.common.popcard.AbsECLiveExplanationCardWidget$updateIntroduceProduct$1$onResponse$2$1", f = "AbsECLiveExplanationCardWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rws, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71194Rws extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C64797Pbt<BaseResponse<PopProductResp>> LJLIL;
    public final /* synthetic */ AbstractC71187Rwl LJLILLLLZI;
    public final /* synthetic */ PopProductResp LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71194Rws(C64797Pbt<BaseResponse<PopProductResp>> c64797Pbt, AbstractC71187Rwl abstractC71187Rwl, PopProductResp popProductResp, InterfaceC67352kd<? super C71194Rws> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c64797Pbt;
        this.LJLILLLLZI = abstractC71187Rwl;
        this.LJLJI = popProductResp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71194Rws(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String str = null;
        if (C53175Ktv.LIZ()) {
            C64797Pbt<BaseResponse<PopProductResp>> c64797Pbt = this.LJLIL;
            Room room = this.LJLILLLLZI.LJLLI;
            if (room != null) {
                str = new Long(room.getId()).toString();
            }
            S52.LIZ(c64797Pbt, str, true);
        } else {
            String LJI = C27739Aud.LJI(C78915Uy7.LJIILJJIL(this.LJLJI));
            AbstractC71187Rwl abstractC71187Rwl = this.LJLILLLLZI;
            JSONObject LIZJ = C65232Piu.LIZJ("pin_product_data", LJI);
            abstractC71187Rwl.getClass();
            IEventCenter LJ = EventCenter.LJ();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_type", 1);
            jSONObject.put("data", LIZJ);
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …t) }\n        }.toString()");
            LJ.LIZ("ec_audience_message_event", jSONObject2);
            AbstractC71186Rwk LJIJI = this.LJLILLLLZI.LJIJI();
            Room room2 = this.LJLILLLLZI.LJLLI;
            if (room2 != null) {
                str = new Long(room2.getId()).toString();
            }
            LJIJI.LJIIIIZZ(str, LJI);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
