package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187647Ya extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, FollowStatusEvent, C76800UCe> {
    public static final C187647Ya LJLIL = new C187647Ya();

    public C187647Ya() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, FollowStatusEvent followStatusEvent) {
        String str;
        FollowStatus followStatus;
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        FollowStatusEvent followStatusEvent2 = followStatusEvent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        VideoMusicBaseVM A4 = selectSubscribe.A4();
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        List<MusicOwnerInfo> artistProfileList = selectSubscribe.u4(str);
        A4.getClass();
        o.LJIIIZ(artistProfileList, "artistProfileList");
        if (followStatusEvent2 != null && (followStatus = followStatusEvent2.status) != null) {
            for (MusicOwnerInfo musicOwnerInfo : artistProfileList) {
                if (o.LJ(musicOwnerInfo.getUid(), followStatus.userId)) {
                    musicOwnerInfo.setFollowStatus(Integer.valueOf(followStatus.followStatus));
                    int i = followStatusEvent2.status.followStatus;
                    if (i != 0 && i != -1) {
                        musicOwnerInfo.setBlock(false);
                        musicOwnerInfo.setBlocked(false);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
