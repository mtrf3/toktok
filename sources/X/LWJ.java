package X;

import com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LWJ {
    public static final FollowFeedApiV2 LIZ;
    public static boolean LIZIZ;

    static {
        Object obj;
        String str = EFJ.LIZJ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "API_URL_PREFIX_SI", str);
        if (LJI != null) {
            obj = LJI.create(FollowFeedApiV2.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        LIZ = (FollowFeedApiV2) obj;
    }
}
