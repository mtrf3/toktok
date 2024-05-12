package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Rrj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC70875Rrj extends AbstractC70995Rtf {
    @Override // X.AbstractC70995Rtf
    public final void LJ(LaneParams params) {
        o.LJIIIZ(params, "params");
        Object obj = this.LJ.get((Object) "biz_type");
        if (obj != null) {
            params.put("biz_type", obj);
        }
    }

    @Override // X.AbstractC70995Rtf
    public void LJFF(LaneParams params) {
        o.LJIIIZ(params, "params");
        if (!params.containsKey("EVENT_ORIGIN_FEATURE")) {
            params.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC70875Rrj(String str, String lane) {
        super(str, lane);
        o.LJIIIZ(lane, "lane");
    }
}
