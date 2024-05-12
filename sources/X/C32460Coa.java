package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.model.GiftResultData;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Coa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32460Coa implements InterfaceC32497CpB {
    public final /* synthetic */ C32461Cob LJLIL;

    public C32460Coa(C32461Cob c32461Cob) {
        this.LJLIL = c32461Cob;
    }

    @Override // X.InterfaceC32497CpB
    public final void LIZIZ(Throwable t) {
        o.LJIIIZ(t, "t");
        this.LJLIL.LJJI(t);
    }

    @Override // X.InterfaceC32497CpB
    public final void LIZJ(SendGiftResult sendGiftResult) {
        List<GiftResultData> list;
        int i;
        if (sendGiftResult != null) {
            list = sendGiftResult.gifts;
        } else {
            list = null;
        }
        if (C32151Nz.LJJIIJZLJL(list)) {
            this.LJLIL.LJJI(new AssertionError());
            return;
        }
        if (sendGiftResult == null) {
            return;
        }
        C32461Cob c32461Cob = this.LJLIL;
        c32461Cob.getClass();
        List<GiftResultData> list2 = sendGiftResult.gifts;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
            JSONArray jSONArray = new JSONArray();
            for (GiftResultData giftResultData : list2) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("gift_id", giftResultData.giftId);
                jSONObject2.put("group_count", giftResultData.groupCount);
                Gift findGiftById = ((IGiftService) CN1.LIZ(IGiftService.class)).findGiftById(giftResultData.giftId);
                if (findGiftById != null) {
                    i = findGiftById.type;
                } else {
                    i = 1;
                }
                jSONObject2.put("gift_type", i);
                jSONObject2.put("combo_count", giftResultData.comboCount);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("result_list", jSONArray);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        c32461Cob.finishWithResult(jSONObject);
    }
}
