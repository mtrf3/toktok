package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Rmu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70576Rmu extends C70858RrS {
    @Override // X.C70858RrS
    public final LaneParams LIZIZ(String lane) {
        o.LJIIIZ(lane, "lane");
        LaneParams LIZIZ = super.LIZIZ(lane);
        if (LIZIZ == null) {
            return new LaneParams();
        }
        return LIZIZ;
    }
}
