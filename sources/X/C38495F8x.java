package X;

import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.pns.scopedid.GetScopedUserIdResponse;
import com.bytedance.pns.scopedid.IdPair;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.F8x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38495F8x implements InterfaceC36621EYv<GetScopedUserIdResponse> {
    public final /* synthetic */ String LJLIL;

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<GetScopedUserIdResponse> call, Throwable t) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
    }

    public C38495F8x(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<GetScopedUserIdResponse> call, C64797Pbt<GetScopedUserIdResponse> response) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(response, "response");
        C38496F8y.LIZ();
        GetScopedUserIdResponse getScopedUserIdResponse = response.LIZIZ;
        if (getScopedUserIdResponse.getCode() == 0 && o.LJ(getScopedUserIdResponse.getMsg(), "success")) {
            if (getScopedUserIdResponse.getData() == null) {
                ApmEvent apmEvent = new ApmEvent("scoped_id_monitor");
                apmEvent.LIZ("dataIsNull", "error_code");
                C66059PwF.LIZIZ(apmEvent);
                return;
            }
            if (getScopedUserIdResponse.getData().getList() == null) {
                ApmEvent apmEvent2 = new ApmEvent("scoped_id_monitor");
                apmEvent2.LIZ("idListIsNull", "error_code");
                C66059PwF.LIZIZ(apmEvent2);
                return;
            }
            if (!ujb.o.LJJJJ(this.LJLIL, getScopedUserIdResponse.getData().getUserIdSuffix(), false)) {
                ApmEvent apmEvent3 = new ApmEvent("scoped_id_monitor");
                apmEvent3.LIZ("userIdNotMatch", "error_code");
                C66059PwF.LIZIZ(apmEvent3);
                return;
            }
            List<IdPair> list = getScopedUserIdResponse.getData().getList();
            String str = this.LJLIL;
            for (IdPair idPair : list) {
                if (idPair.getBizId().length() > 0 && idPair.getBizUserId().length() > 0) {
                    String bizId = idPair.getBizId();
                    String bizUserId = idPair.getBizUserId();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(bizId);
                    LIZ.append('_');
                    LIZ.append(str);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    C38496F8y.LIZ();
                    C38497F8z.LIZ.put(LIZIZ, bizUserId);
                    C38497F8z.LIZIZ.storeString(LIZIZ, bizUserId);
                } else {
                    ApmEvent apmEvent4 = new ApmEvent("scoped_id_monitor");
                    apmEvent4.LIZ("bizIdOrBizUserIdIsEmpty", "error_code");
                    C66059PwF.LIZIZ(apmEvent4);
                }
            }
        }
    }
}
