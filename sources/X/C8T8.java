package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.live.RelatedLiveTagStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.8T8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8T8 {
    public static boolean LIZIZ(VideoItemParams item) {
        boolean z;
        String str;
        String str2;
        o.LJIIIZ(item, "item");
        if (!C8T9.LIZ()) {
            return false;
        }
        User author = item.getAweme().getAuthor();
        String str3 = null;
        if (author == null || Long.valueOf(author.roomId) == null || item.getAweme().getAuthor().roomId <= 0) {
            z = false;
        } else {
            z = true;
        }
        RelatedLiveTagStruct relatedLiveTag = item.getAweme().getRelatedLiveTag();
        if (relatedLiveTag != null) {
            str = relatedLiveTag.getRelatedLiveTag();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (relatedLiveTag != null) {
            str2 = relatedLiveTag.getContent();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) || z) {
            return false;
        }
        if (relatedLiveTag != null) {
            str3 = relatedLiveTag.getTagName();
        }
        if (TextUtils.isEmpty(str3)) {
            return false;
        }
        return true;
    }

    public static void LIZ(String str, VideoItemParams videoItemParams, Integer num) {
        String str2;
        String str3;
        String str4;
        String str5;
        Aweme aweme;
        RelatedLiveTagStruct relatedLiveTag;
        Aweme aweme2;
        RelatedLiveTagStruct relatedLiveTag2;
        Aweme aweme3;
        Aweme aweme4;
        C188727au c188727au = new C188727au();
        String str6 = null;
        if (videoItemParams != null) {
            str2 = videoItemParams.mEventType;
        } else {
            str2 = null;
        }
        c188727au.LJI("enter_from", str2);
        if (videoItemParams != null && (aweme4 = videoItemParams.getAweme()) != null) {
            str3 = aweme4.getAid();
        } else {
            str3 = null;
        }
        c188727au.LJI("group_id", str3);
        if (videoItemParams != null && (aweme3 = videoItemParams.getAweme()) != null) {
            str4 = aweme3.getAuthorUid();
        } else {
            str4 = null;
        }
        c188727au.LJI("author_id", str4);
        if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null && (relatedLiveTag2 = aweme2.getRelatedLiveTag()) != null) {
            str5 = relatedLiveTag2.getRelatedLiveTag();
        } else {
            str5 = null;
        }
        c188727au.LJI("game_related_tag", str5);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (relatedLiveTag = aweme.getRelatedLiveTag()) != null) {
            str6 = relatedLiveTag.getTagName();
        }
        c188727au.LJI("game_name", str6);
        if (num != null) {
            c188727au.LIZLLL(num.intValue(), "cache_room_cnt");
        }
        FMX.LJIIL(str, c188727au.LIZ);
    }
}
