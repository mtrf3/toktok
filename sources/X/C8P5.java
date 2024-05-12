package X;

import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.8P5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8P5 {
    public static boolean LIZ(VideoItemParams item) {
        BaseFeedPageParams baseFeedPageParams;
        M89 m89;
        String playListId;
        o.LJIIIZ(item, "item");
        BaseFeedPageParams baseFeedPageParams2 = item.baseFeedPageParams;
        boolean LJIJ = AV1.LJIJ(item.getAweme().getAuthor());
        if (baseFeedPageParams2 == null) {
            return false;
        }
        if (C53326KwM.LIZ() && o.LJ(item.mEventType, "homepage_hot") && !LJIJ) {
            return false;
        }
        if ((o.LJ(item.mEventType, "playlist") || ((baseFeedPageParams = item.baseFeedPageParams) != null && (m89 = baseFeedPageParams.param) != null && (playListId = m89.getPlayListId()) != null && playListId.length() != 0 && o.LJ(item.mEventType, "deeplink"))) && C228118xL.LIZ()) {
            return false;
        }
        if ((((Boolean) C210778Oz.LIZ.getValue()).booleanValue() && o.LJ(item.mEventType, "homepage_hot")) || item.getAweme().isAd() || J8V.LIZLLL() || item.getAweme().getPlaylist_info() == null) {
            return false;
        }
        M89 m892 = baseFeedPageParams2.param;
        if ((m892 != null && m892.isFromDuetModeOrDuetModeDetail()) || C2OF.LJI(item.getAweme(), "", new WeakReference(null))) {
            return false;
        }
        return true;
    }
}
