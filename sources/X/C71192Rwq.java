package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.TraceInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.api.ProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import fjb.a;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.common.popcard.AbsECLiveExplanationCardWidget$getIntroduceProductResponse$1", f = "AbsECLiveExplanationCardWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rwq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71192Rwq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC71187Rwl LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC36621EYv<BaseResponse<PopProductResp>> LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ ECommerceMessage LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71192Rwq(AbstractC71187Rwl abstractC71187Rwl, String str, InterfaceC36621EYv<BaseResponse<PopProductResp>> interfaceC36621EYv, boolean z, ECommerceMessage eCommerceMessage, InterfaceC67352kd<? super C71192Rwq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC71187Rwl;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC36621EYv;
        this.LJLJJI = z;
        this.LJLJJL = eCommerceMessage;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71192Rwq(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        String str;
        JSONObject jSONObject;
        long j;
        C141335gf.LIZJ(obj);
        if (this.LJLIL.LJIJJ()) {
            ProductListApi productListApi = (ProductListApi) C74662wQ.LIZ(ProductListApi.class);
            Room room = this.LJLIL.LJLLI;
            long j2 = 0;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            String str2 = this.LJLILLLLZI;
            if (str2 != null) {
                j2 = CastLongProtector.parseLong(str2);
            }
            productListApi.getBroadcastIntroduceProduct(j, true, j2).enqueue(this.LJLJI);
        } else {
            if (o.LJ(this.LJLIL.LLIIJI, Boolean.TRUE)) {
                i = 2;
            } else if (this.LJLJJI || this.LJLIL.LLIIJI == null) {
                i = 0;
            } else {
                i = 1;
            }
            ProductListApi productListApi2 = (ProductListApi) C74662wQ.LIZ(ProductListApi.class);
            Room room2 = this.LJLIL.LJLLI;
            if (room2 == null || (str = new Long(room2.getId()).toString()) == null) {
                str = "";
            }
            String str3 = this.LJLILLLLZI;
            Integer num = new Integer(1);
            String str4 = this.LJLIL.LLIIIILZ;
            Integer num2 = new Integer(i);
            ECommerceMessage eCommerceMessage = this.LJLJJL;
            if (eCommerceMessage != null) {
                OSZ osz = (OSZ) ((HashMap) C35747E1f.LIZ).remove(eCommerceMessage);
                jSONObject = new JSONObject();
                TraceInfo traceInfo = eCommerceMessage.traceInfo;
                if (traceInfo != null) {
                    jSONObject.put("operation_time", traceInfo.operateTime);
                }
                TraceInfo traceInfo2 = eCommerceMessage.traceInfo;
                if (traceInfo2 != null) {
                    jSONObject.put("arrival_time", traceInfo2.arrivalTime);
                }
                TraceInfo traceInfo3 = eCommerceMessage.traceInfo;
                if (traceInfo3 != null) {
                    jSONObject.put("send_time", traceInfo3.sendTime);
                }
                if (osz != null) {
                    jSONObject.put("get_message_time", ((Number) osz.getFirst()).longValue());
                    jSONObject.put("call_time", ((Number) osz.getSecond()).longValue());
                }
            } else {
                jSONObject = null;
            }
            productListApi2.getIntroduceProduct(str, str3, num, str4, num2, jSONObject).enqueue(this.LJLJI);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
