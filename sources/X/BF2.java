package X;

import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BF2 extends FrameLayout {
    public C47061t0 LJLIL;
    public C47061t0 LJLILLLLZI;

    public BF2(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dli, this, true);
        this.LJLIL = (C47061t0) LLLLIILL.findViewById(R.id.a52);
        this.LJLILLLLZI = (C47061t0) LLLLIILL.findViewById(R.id.a55);
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJII(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_ic_loading_center.webp"));
        LIZJ.LJIIJ = true;
        this.LJLIL.setController(LIZJ.LIZ());
        C81705W4v LIZJ2 = W5I.LIZJ();
        LIZJ2.LJII(C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_ic_loading_point.webp"));
        LIZJ2.LJIIJ = true;
        this.LJLILLLLZI.setController(LIZJ2.LIZ());
    }
}
