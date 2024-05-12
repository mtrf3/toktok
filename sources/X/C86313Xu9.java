package X;

import com.ss.android.ugc.aweme.tile.HotVideoTileService;
import org.json.JSONObject;

/* renamed from: X.Xu9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86313Xu9<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ HotVideoTileService LIZ;

    public C86313Xu9(HotVideoTileService hotVideoTileService) {
        this.LIZ = hotVideoTileService;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("start_status", this.LIZ.LJLIL ? 1 : 0);
        C09900aA.LJI("tile_service_open", jSONObject, null, null);
        return c10k;
    }
}
