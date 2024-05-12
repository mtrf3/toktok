package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.C3w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30720C3w extends AbstractC38127Exn<JSONObject, JSONObject> {
    @Override // X.AbstractC38127Exn
    public final JSONObject invoke(JSONObject jSONObject, C38131Exr context) {
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        String optString = params.optString("downloadUrl", "");
        String shootWay = params.optString("shootWay", "livesdk_anchor_highlight_post_click");
        String suffix = params.optString("suffix", ".mp4");
        String fragmentId = params.optString("fragmentIdStr", String.valueOf(System.currentTimeMillis()));
        Context context2 = context.LIZ;
        o.LJIIIIZZ(context2, "context.context");
        String replayRoomId = params.optString("replayRoomId", "");
        String replayTitle = params.optString("replayTitle", "");
        String businessExtra = params.optString("businessExtra", "");
        IGameService iGameService = (IGameService) CN1.LIZ(IGameService.class);
        o.LJIIIIZZ(shootWay, "shootWay");
        o.LJIIIIZZ(suffix, "suffix");
        o.LJIIIIZZ(fragmentId, "fragmentId");
        o.LJIIIIZZ(replayRoomId, "replayRoomId");
        o.LJIIIIZZ(replayTitle, "replayTitle");
        o.LJIIIIZZ(businessExtra, "businessExtra");
        iGameService.U0(context2, optString, shootWay, suffix, fragmentId, replayRoomId, replayTitle, businessExtra);
        return null;
    }
}
