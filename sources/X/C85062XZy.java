package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PodcastInfo;
import com.ss.android.ugc.aweme.feed.model.PodcastUrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: X.XZy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85062XZy {
    public static int LIZ(Integer num) {
        if (num == null || num.intValue() < 1) {
            return 0;
        }
        return 1;
    }

    public static void LIZIZ(int i, Aweme aweme) {
        String str;
        PodcastInfo podcastInfo;
        PodcastUrlModel playAddr;
        List<String> urlList;
        PodcastInfo podcastInfo2;
        PodcastUrlModel playAddr2;
        List<String> urlList2;
        String str2;
        PodcastInfo podcastInfo3;
        C145995oB c145995oB = new C145995oB();
        String str3 = "";
        if (aweme == null || (podcastInfo3 = aweme.getPodcastInfo()) == null || (str = podcastInfo3.getEpisodeItemId()) == null) {
            str = "";
        }
        c145995oB.LJI("podcast_rss_entry_id", str);
        String str4 = null;
        if (aweme != null) {
            str4 = aweme.getAuthorUid();
        }
        c145995oB.LJI("author_id", str4);
        c145995oB.LJI("enter_from", "homepage_podcast");
        c145995oB.LIZ(i, "is_background");
        if (aweme != null && (podcastInfo = aweme.getPodcastInfo()) != null && (playAddr = podcastInfo.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null && !urlList.isEmpty()) {
            if (aweme != null && (podcastInfo2 = aweme.getPodcastInfo()) != null && (playAddr2 = podcastInfo2.getPlayAddr()) != null && (urlList2 = playAddr2.getUrlList()) != null && (str2 = (String) ListProtector.get(urlList2, 0)) != null) {
                str3 = str2;
            }
            c145995oB.LIZLLL("podcast_rss_feed_url", str3);
        }
        FMX.LJIIL("click_10_forward", c145995oB.LIZ);
    }

    public static void LJ(int i, Aweme aweme) {
        String str;
        PodcastInfo podcastInfo;
        PodcastUrlModel playAddr;
        List<String> urlList;
        PodcastInfo podcastInfo2;
        PodcastUrlModel playAddr2;
        List<String> urlList2;
        String str2;
        PodcastInfo podcastInfo3;
        C145995oB c145995oB = new C145995oB();
        String str3 = "";
        if (aweme == null || (podcastInfo3 = aweme.getPodcastInfo()) == null || (str = podcastInfo3.getEpisodeItemId()) == null) {
            str = "";
        }
        c145995oB.LJI("podcast_rss_entry_id", str);
        String str4 = null;
        if (aweme != null) {
            str4 = aweme.getAuthorUid();
        }
        c145995oB.LJI("author_id", str4);
        c145995oB.LJI("enter_from", "homepage_podcast");
        c145995oB.LIZ(i, "is_background");
        if (aweme != null && (podcastInfo = aweme.getPodcastInfo()) != null && (playAddr = podcastInfo.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null && !urlList.isEmpty()) {
            if (aweme != null && (podcastInfo2 = aweme.getPodcastInfo()) != null && (playAddr2 = podcastInfo2.getPlayAddr()) != null && (urlList2 = playAddr2.getUrlList()) != null && (str2 = (String) ListProtector.get(urlList2, 0)) != null) {
                str3 = str2;
            }
            c145995oB.LIZLLL("podcast_rss_feed_url", str3);
        }
        FMX.LJIIL("click_10_rewind", c145995oB.LIZ);
    }

    public static void LIZJ(int i, int i2, Aweme aweme) {
        String str;
        String str2;
        PodcastInfo podcastInfo;
        PodcastUrlModel playAddr;
        List<String> urlList;
        PodcastInfo podcastInfo2;
        PodcastUrlModel playAddr2;
        List<String> urlList2;
        String str3;
        User author;
        PodcastInfo podcastInfo3;
        C145995oB c145995oB = new C145995oB();
        String str4 = "";
        if (aweme == null || (podcastInfo3 = aweme.getPodcastInfo()) == null || (str = podcastInfo3.getEpisodeItemId()) == null) {
            str = "";
        }
        c145995oB.LJI("podcast_rss_entry_id", str);
        Integer num = null;
        if (aweme == null || (str2 = aweme.getAid()) == null) {
            str2 = "";
        }
        c145995oB.LJI("preview_video_id", str2);
        c145995oB.LJI("preview_enter_from", C85067Xa3.LIZ);
        c145995oB.LIZJ(Float.valueOf(i / 1000), "episode_duration");
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            num = Integer.valueOf(author.getFollowStatus());
        }
        c145995oB.LIZ(LIZ(num), "follow_status");
        c145995oB.LJI("country_code", C85990Xow.LIZ());
        c145995oB.LIZ(i2, "is_background");
        if (aweme != null && (podcastInfo = aweme.getPodcastInfo()) != null && (playAddr = podcastInfo.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null && !urlList.isEmpty()) {
            if (aweme != null && (podcastInfo2 = aweme.getPodcastInfo()) != null && (playAddr2 = podcastInfo2.getPlayAddr()) != null && (urlList2 = playAddr2.getUrlList()) != null && (str3 = (String) ListProtector.get(urlList2, 0)) != null) {
                str4 = str3;
            }
            c145995oB.LIZLLL("podcast_rss_feed_url", str4);
        }
        FMX.LJIIL("click_podcast_play", c145995oB.LIZ);
    }

    public static void LIZLLL(int i, int i2, Aweme aweme) {
        String str;
        String str2;
        PodcastInfo podcastInfo;
        PodcastUrlModel playAddr;
        List<String> urlList;
        PodcastInfo podcastInfo2;
        PodcastUrlModel playAddr2;
        List<String> urlList2;
        String str3;
        User author;
        PodcastInfo podcastInfo3;
        C145995oB c145995oB = new C145995oB();
        String str4 = "";
        if (aweme == null || (podcastInfo3 = aweme.getPodcastInfo()) == null || (str = podcastInfo3.getEpisodeItemId()) == null) {
            str = "";
        }
        c145995oB.LJI("podcast_rss_entry_id", str);
        Integer num = null;
        if (aweme == null || (str2 = aweme.getAid()) == null) {
            str2 = "";
        }
        c145995oB.LJI("preview_video_id", str2);
        c145995oB.LJI("preview_enter_from", C85067Xa3.LIZ);
        c145995oB.LIZJ(Float.valueOf(i / 1000), "episode_duration");
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            num = Integer.valueOf(author.getFollowStatus());
        }
        c145995oB.LIZ(LIZ(num), "follow_status");
        c145995oB.LJI("country_code", C85990Xow.LIZ());
        c145995oB.LIZ(i2, "is_background");
        if (aweme != null && (podcastInfo = aweme.getPodcastInfo()) != null && (playAddr = podcastInfo.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null && !urlList.isEmpty()) {
            if (aweme != null && (podcastInfo2 = aweme.getPodcastInfo()) != null && (playAddr2 = podcastInfo2.getPlayAddr()) != null && (urlList2 = playAddr2.getUrlList()) != null && (str3 = (String) ListProtector.get(urlList2, 0)) != null) {
                str4 = str3;
            }
            c145995oB.LIZLLL("podcast_rss_feed_url", str4);
        }
        FMX.LJIIL("click_podcast_progess_bar", c145995oB.LIZ);
    }

    public static void LJFF(int i, int i2, Aweme aweme) {
        String str;
        String str2;
        PodcastInfo podcastInfo;
        PodcastUrlModel playAddr;
        List<String> urlList;
        PodcastInfo podcastInfo2;
        PodcastUrlModel playAddr2;
        List<String> urlList2;
        String str3;
        User author;
        PodcastInfo podcastInfo3;
        C145995oB c145995oB = new C145995oB();
        String str4 = "";
        if (aweme == null || (podcastInfo3 = aweme.getPodcastInfo()) == null || (str = podcastInfo3.getEpisodeItemId()) == null) {
            str = "";
        }
        c145995oB.LJI("podcast_rss_entry_id", str);
        Integer num = null;
        if (aweme == null || (str2 = aweme.getAid()) == null) {
            str2 = "";
        }
        c145995oB.LJI("preview_video_id", str2);
        c145995oB.LJI("preview_enter_from", C85067Xa3.LIZ);
        c145995oB.LIZJ(Float.valueOf(i / 1000), "episode_duration");
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            num = Integer.valueOf(author.getFollowStatus());
        }
        c145995oB.LIZ(LIZ(num), "follow_status");
        c145995oB.LJI("country_code", C85990Xow.LIZ());
        c145995oB.LIZ(i2, "is_background");
        if (aweme != null && (podcastInfo = aweme.getPodcastInfo()) != null && (playAddr = podcastInfo.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null && !urlList.isEmpty()) {
            if (aweme != null && (podcastInfo2 = aweme.getPodcastInfo()) != null && (playAddr2 = podcastInfo2.getPlayAddr()) != null && (urlList2 = playAddr2.getUrlList()) != null && (str3 = (String) ListProtector.get(urlList2, 0)) != null) {
                str4 = str3;
            }
            c145995oB.LIZLLL("podcast_rss_feed_url", str4);
        }
        FMX.LJIIL("podcast_pause", c145995oB.LIZ);
    }
}
