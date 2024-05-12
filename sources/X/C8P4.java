package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.8P4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8P4 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme mAweme, BaseFeedPageParams baseFeedPageParams) {
        o.LJIIIZ(mAweme, "mAweme");
        if (baseFeedPageParams == null) {
            return false;
        }
        if (C53326KwM.LIZ() && o.LJ(baseFeedPageParams.eventType, "homepage_hot") && !AV1.LJIJ(mAweme.getAuthor())) {
            return false;
        }
        if ((((Boolean) C210778Oz.LIZ.getValue()).booleanValue() && o.LJ(baseFeedPageParams.eventType, "homepage_hot")) || mAweme.isAd() || J8V.LIZLLL() || mAweme.getPlaylist_info() == null || baseFeedPageParams.param.isFromDuetModeOrDuetModeDetail() || C2OF.LJI(mAweme, "", new WeakReference(null))) {
            return false;
        }
        return true;
    }
}
