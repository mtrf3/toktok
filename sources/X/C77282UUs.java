package X;

import Y.IDuS76S0200000_5;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.service.model.GiftListExtra;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UUs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77282UUs<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ UW7 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public C77282UUs(UW7 uw7, int i) {
        this.LJLIL = uw7;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        UW7 uw7 = this.LJLIL;
        int i = this.LJLILLLLZI;
        uw7.getClass();
        JSONObject LIZLLL = Q7K.LIZLLL("duration", TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - System.nanoTime()));
        LIZLLL.put("fetch_giftlist_from", C32710Csc.LIZ(i));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_code", 0);
        jSONObject.put("error_msg", "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("error_code", 0);
        jSONObject2.put("error_msg", "");
        BZI LIZ = C28787BRn.LIZ("gift_list_v1_data_fetch");
        LIZ.LJIJJ(Integer.valueOf(C77285UUv.LIZ()), "is_anchor");
        LIZ.LJJ(LIZLLL);
        LIZ.LJJ(jSONObject);
        LIZ.LJJ(jSONObject2);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
        }
        C0K2.LJI("gift_list_v1_data_fetch", jSONObject, LIZLLL, jSONObject2);
        if (it.data == null) {
            return AbstractC73672Svk.LJJI(new Exception("response.data is empty"));
        }
        R r = it.extra;
        if (r != 0) {
            C77283UUt.LIZIZ = ((GiftListExtra) r).logId;
        }
        return AbstractC73672Svk.LJIIJ(new IDuS76S0200000_5(it, uw7, 5));
    }
}
