package X;

import com.ss.android.ugc.aweme.tile.PublishTileService;
import org.json.JSONObject;

/* renamed from: X.XuA, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86314XuA<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ PublishTileService LIZ;

    public C86314XuA(PublishTileService publishTileService) {
        this.LIZ = publishTileService;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("start_status", this.LIZ.LJLIL ? 1 : 0);
        C09900aA.LJI("tile_service_open", jSONObject, null, null);
        return c10k;
    }
}
