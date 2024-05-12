package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.G9d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41049G9d {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ() {
        Keva repo = Keva.getRepo("geofencing_region_list");
        o.LJIIIIZZ(repo, "getRepo(REPO_REGION)");
        String string = repo.getString("regions", "");
        if (string == null || string.length() == 0) {
            return C61878OQg.INSTANCE;
        }
        return C75792yF.LIZLLL(TranslatedRegion[].class, string);
    }

    public static void LIZIZ(List regions) {
        o.LJIIIZ(regions, "regions");
        Keva repo = Keva.getRepo("geofencing_region_list");
        o.LJIIIIZZ(repo, "getRepo(REPO_REGION)");
        repo.storeString("regions", C75792yF.LIZJ(regions));
    }
}
