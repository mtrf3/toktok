package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rds, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70016Rds extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ HashMap<String, Object> LJLIL;
    public final /* synthetic */ HashMap<String, Object> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70016Rds(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, long j, int i) {
        super(1);
        this.LJLIL = hashMap;
        this.LJLILLLLZI = hashMap2;
        this.LJLJI = j;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        Object obj;
        LaneParams update = laneParams;
        o.LJIIIZ(update, "$this$update");
        update.putAll(this.LJLIL);
        HashMap<String, Object> hashMap = this.LJLILLLLZI;
        if (hashMap != null) {
            update.putAll(hashMap);
        }
        HashMap<String, Object> hashMap2 = this.LJLILLLLZI;
        if (hashMap2 == null || (obj = hashMap2.get("click_product_start_time")) == null) {
            obj = -1L;
        }
        if ((obj instanceof Long) && !o.LJ(obj, -1L)) {
            update.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        update.put("api_duration", Long.valueOf(this.LJLJI));
        update.put("is_success", "yes");
        update.put("preload_type", Integer.valueOf(this.LJLJJI));
        if (!update.containsKey((Object) "page_name")) {
            update.put("page_name", "product_detail");
        }
        return C76800UCe.LIZ;
    }
}
