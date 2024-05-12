package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.GiftsBoxInfoForSend;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Cob, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32461Cob extends AbstractC38123Exj<JSONObject, JSONObject> {
    public final C32460Coa LJLIL = new C32460Coa(this);

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    public final void LJJI(Throwable th) {
        if (th instanceof C53759L7z) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            if (th instanceof C276516r) {
                jSONObject.put("error_code", ((C276516r) th).getErrorCode());
            }
            finishWithResult(jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr context) {
        int i;
        Object LIZ;
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        C0NB.LIZIZ("SendGiftV2Tag", "Send Gift V1");
        long optLong = params.optLong("gift_id");
        int optInt = params.optInt("gift_count");
        String source = params.optString("enter_from");
        String streamGoalEntrance = params.optString("stream_goal_entrance");
        String optString = params.optString("gifts_in_box");
        String optString2 = params.optString("giftbox_enter_from");
        boolean optBoolean = params.optBoolean("close_gift_panel_immediate");
        boolean optBoolean2 = params.optBoolean("is_event_report");
        params.optString("gift_type");
        params.optBoolean("close_gift_panel");
        int optInt2 = params.optInt("combo_offset_x");
        int optInt3 = params.optInt("combo_offset_y");
        if (params.has("show_combo")) {
            if (params.optBoolean("show_combo")) {
                i = 1;
            } else {
                i = 2;
            }
        } else {
            i = 0;
        }
        if (optLong <= 0 || optInt <= 0) {
            LJJI(new IllegalArgumentException());
            return;
        }
        C32460Coa c32460Coa = this.LJLIL;
        o.LJIIIIZZ(source, "source");
        C15940ju c15940ju = new C15940ju(optLong, optInt, c32460Coa, i, source, optBoolean, optInt2, optInt3);
        o.LJIIIIZZ(streamGoalEntrance, "streamGoalEntrance");
        c15940ju.LJIILLIIL = streamGoalEntrance;
        c15940ju.LJIILJJIL = optBoolean2;
        if (optString != null && optString.length() != 0) {
            try {
                LIZ = (GiftsBoxInfoForSend) C09650Zl.LIZIZ.LJI(optString, GiftsBoxInfoForSend.class);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m10exceptionOrNullimpl(LIZ);
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            c15940ju.LJIIL = (GiftsBoxInfoForSend) LIZ;
            c15940ju.LJIIJJI = optString;
        }
        c15940ju.LJIILIIL = optString2;
        ((IGiftService) CN1.LIZ(IGiftService.class)).sendGiftInternal(context.LIZ, c15940ju);
    }
}
