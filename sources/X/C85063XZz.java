package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailsViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PodcastInfo;
import com.ss.android.ugc.aweme.feed.model.PodcastUrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XZz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85063XZz implements InterfaceC85091XaR {
    public final /* synthetic */ FullEpisodeDetailsViewModel LIZ;

    @Override // X.InterfaceC85091XaR
    public final void LIZJ(InterfaceC85083XaJ interfaceC85083XaJ) {
    }

    @Override // X.InterfaceC85091XaR
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC85091XaR
    public final void onVideoSizeChanged(int i, int i2) {
    }

    @Override // X.InterfaceC85091XaR
    public final void onCompletion() {
        this.LIZ.mobPlayFinish();
        this.LIZ._prepareState.setValue(3);
    }

    @Override // X.InterfaceC85091XaR
    public final void onPrepare() {
        this.LIZ._prepareState.setValue(1);
    }

    @Override // X.InterfaceC85091XaR
    public final void onPrepared() {
        this.LIZ._prepareState.setValue(2);
    }

    @Override // X.InterfaceC85091XaR
    public final void onRenderStart() {
        String str;
        String str2;
        Integer num;
        PodcastInfo podcastInfo;
        PodcastUrlModel playAddr;
        List<String> urlList;
        String str3;
        PodcastInfo podcastInfo2;
        PodcastUrlModel playAddr2;
        User author;
        PodcastInfo podcastInfo3;
        this.LIZ.playFinishStartTime = System.currentTimeMillis();
        FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel = this.LIZ;
        if (!fullEpisodeDetailsViewModel.hasMobPodcastPlay) {
            Aweme aweme = fullEpisodeDetailsViewModel.aweme;
            int playerDuration = (int) fullEpisodeDetailsViewModel.getPlayerDuration();
            C145995oB c145995oB = new C145995oB();
            String str4 = "";
            if (aweme == null || (podcastInfo3 = aweme.getPodcastInfo()) == null || (str = podcastInfo3.getEpisodeItemId()) == null) {
                str = "";
            }
            c145995oB.LJI("podcast_rss_entry_id", str);
            List<String> list = null;
            if (aweme == null || (str2 = aweme.getAid()) == null) {
                str2 = "";
            }
            c145995oB.LJI("preview_video_id", str2);
            String str5 = C85067Xa3.LIZ;
            if (str5 == null) {
                str5 = "";
            }
            c145995oB.LJI("preview_enter_from", str5);
            c145995oB.LIZJ(Float.valueOf(playerDuration / 1000), "episode_duration");
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                num = Integer.valueOf(author.getFollowStatus());
            } else {
                num = null;
            }
            c145995oB.LIZ(C85062XZy.LIZ(num), "follow_status");
            c145995oB.LJI("country_code", C85990Xow.LIZ());
            if (aweme != null && (podcastInfo2 = aweme.getPodcastInfo()) != null && (playAddr2 = podcastInfo2.getPlayAddr()) != null) {
                list = playAddr2.getUrlList();
            }
            if (list != null && !list.isEmpty()) {
                if (aweme != null && (podcastInfo = aweme.getPodcastInfo()) != null && (playAddr = podcastInfo.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null && (str3 = (String) ListProtector.get(urlList, 0)) != null) {
                    str4 = str3;
                }
                c145995oB.LIZLLL("podcast_rss_feed_url", str4);
            }
            FMX.LJIIL("podcast_play", c145995oB.LIZ);
            this.LIZ.hasMobPodcastPlay = true;
        }
    }

    public C85063XZz(FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel) {
        this.LIZ = fullEpisodeDetailsViewModel;
    }

    @Override // X.InterfaceC85091XaR
    public final void LIZ(C85079XaF errorCode) {
        PodcastInfo podcastInfo;
        PodcastUrlModel playAddr;
        List<String> urlList;
        String str;
        PodcastInfo podcastInfo2;
        PodcastUrlModel playAddr2;
        List<String> urlList2;
        PodcastInfo podcastInfo3;
        o.LJIIIZ(errorCode, "errorCode");
        Aweme aweme = this.LIZ.aweme;
        C145995oB c145995oB = new C145995oB();
        String str2 = null;
        if (aweme != null && (podcastInfo3 = aweme.getPodcastInfo()) != null) {
            str2 = podcastInfo3.getEpisodeItemId();
        }
        c145995oB.LJI("podcast_rss_entry_id", str2);
        if (aweme != null && (podcastInfo = aweme.getPodcastInfo()) != null && (playAddr = podcastInfo.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null && !urlList.isEmpty()) {
            if (aweme == null || (podcastInfo2 = aweme.getPodcastInfo()) == null || (playAddr2 = podcastInfo2.getPlayAddr()) == null || (urlList2 = playAddr2.getUrlList()) == null || (str = (String) ListProtector.get(urlList2, 0)) == null) {
                str = "";
            }
            c145995oB.LIZLLL("podcast_rss_feed_url", str);
        }
        FMX.LJIIL("performance_podcast_play_failed", c145995oB.LIZ);
    }

    @Override // X.InterfaceC85091XaR
    public final void LIZIZ(EnumC85066Xa2 loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
        this.LIZ._loadingState.setValue(loadingState);
        if (loadingState == EnumC85066Xa2.LOAD_STATE_PLAYABLE) {
            XOX playerState = this.LIZ.getPlayerState();
            if (playerState.isStopState()) {
                FullEpisodeDetailsViewModel.playPlayer$default(this.LIZ, new C84735XNj("RESUME_FROM_SEEK"), 0, 2, null);
            } else {
                if (!playerState.isErrorState()) {
                    return;
                }
                FullEpisodeDetailsViewModel.playPlayer$default(this.LIZ, new C84735XNj("RESUME_FROM_SEEK"), 0, 2, null);
            }
        }
    }

    @Override // X.InterfaceC85091XaR
    public final void LJ(XOX currentState) {
        boolean z;
        o.LJIIIZ(currentState, "currentState");
        this.LIZ._playbackState.setValue(currentState);
        MutableLiveData<Boolean> mutableLiveData = this.LIZ._isPlaying;
        if (!currentState.isPauseState() && !currentState.isStopState()) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC85091XaR
    public final void onPlaybackTimeChanged(long j) {
        this.LIZ._progress.setValue(Long.valueOf(j));
        long j2 = 5;
        long j3 = j % j2;
        if (((int) (j3 + (j2 & (((j3 ^ j2) & ((-j3) | j3)) >> 63)))) == 0) {
            this.LIZ.storeProgressRolling();
        }
    }

    @Override // X.InterfaceC85091XaR
    public final void LIZLLL(EnumC80000VaW seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}
