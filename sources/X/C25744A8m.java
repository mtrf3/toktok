package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.A8m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25744A8m extends HSS {
    @Override // X.HSS
    public final boolean LJJIIJZLJL() {
        return true;
    }

    @Override // X.HSS
    public final String LJJIJIL() {
        return "app_page";
    }

    @Override // X.S1E
    public final S1E clone() {
        return new C25744A8m();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.NEWS.getTYPE();
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        String schema;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJI();
        if (C2NU.LIZ.LIZIZ()) {
            Activity LIZ = LJIIIZ().LIZ();
            HSS.LJJIZ(this, eventMapBuilder, 6);
            AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
            if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(LIZ, schema);
                buildRoute.withParam("EVENT_NAME_WHEN_REQUEST", "request_anchor_detail");
                buildRoute.withParam("EVENT_NAME_FOR_STAY", "multi_anchor_stay_time");
                for (Map.Entry entry : ((HashMap) eventMapBuilder.LIZ).entrySet()) {
                    buildRoute.withParam((String) entry.getKey(), (String) entry.getValue());
                }
                buildRoute.open();
                return;
            }
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(LJJI());
        c26045AKb.LJIIIIZZ(R.string.im9);
        c26045AKb.LJIIJ();
    }
}
