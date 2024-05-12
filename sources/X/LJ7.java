package X;

import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LJ7 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(ActivityC45651qj activity) {
        LocationRegion LIZJ;
        String name;
        o.LJIIIZ(activity, "activity");
        LJ1 LJII = LJ5.LJII(activity);
        if (LJII == null || !LJII.LJLJJLL || !NearbyTabConfig.LIZIZ().showChangeRegionPopup || (LIZJ = NearbyTabConfig.LIZJ()) == null || (name = LIZJ.getName()) == null || !C78685UuP.LJJJZ(name)) {
            return false;
        }
        return true;
    }
}
