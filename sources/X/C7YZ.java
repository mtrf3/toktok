package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7YZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YZ extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, C175046tw, C76800UCe> {
    public static final C7YZ LJLIL = new C7YZ();

    public C7YZ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, C175046tw c175046tw) {
        String str;
        User user;
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        C175046tw c175046tw2 = c175046tw;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        VideoMusicBaseVM A4 = selectSubscribe.A4();
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        List<MusicOwnerInfo> artistProfileList = selectSubscribe.u4(str);
        A4.getClass();
        o.LJIIIZ(artistProfileList, "artistProfileList");
        if (c175046tw2 != null && (user = c175046tw2.LJLIL) != null) {
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
