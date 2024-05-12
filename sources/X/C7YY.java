package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7YY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YY extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, C7YQ, C76800UCe> {
    public static final C7YY LJLIL = new C7YY();

    public C7YY() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, C7YQ c7yq) {
        String str;
        User user;
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        C7YQ c7yq2 = c7yq;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        VideoMusicBaseVM A4 = selectSubscribe.A4();
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        List<MusicOwnerInfo> artistProfileList = selectSubscribe.u4(str);
        A4.getClass();
        o.LJIIIZ(artistProfileList, "artistProfileList");
        if (c7yq2 != null && (user = c7yq2.LJLIL) != null) {
            for (MusicOwnerInfo musicOwnerInfo : artistProfileList) {
                if (o.LJ(musicOwnerInfo.getUid(), user.getUid())) {
                    musicOwnerInfo.setFollowStatus(Integer.valueOf(user.getFollowStatus()));
                    musicOwnerInfo.setFollowerStatus(Integer.valueOf(user.getFollowerStatus()));
                    musicOwnerInfo.setBlock(user.isBlock);
                    musicOwnerInfo.setBlocked(user.isBlocked());
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
