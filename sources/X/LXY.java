package X;

import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.ui.FeedNearbyFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LXY implements LDY {
    public final /* synthetic */ FeedNearbyFragment LJLIL;

    public LXY(FeedNearbyFragment feedNearbyFragment) {
        this.LJLIL = feedNearbyFragment;
    }

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        o.LJIIIZ(to, "to");
        if (o.LJ(str, "Nearby")) {
            IPoiService LIZIZ = PoiServiceImpl.LIZIZ();
            M3Z m3z = new M3Z("nearby_page_stage");
            String str2 = this.LJLIL.Il().LJLJLJ;
            if (str2 == null) {
                str2 = "";
            }
            m3z.LIZLLL = str2;
            LIZIZ.LJJLIIIJ(m3z);
        }
    }
}
