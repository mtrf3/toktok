package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SWn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72233SWn extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, Music, C76800UCe> {
    public static final C72233SWn LJLIL = new C72233SWn();

    public C72233SWn() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, Music music) {
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C8YN.LJIJI(selectSubscribe.C4(), new AqS143S0200000_12(selectSubscribe, music, 112));
        return C76800UCe.LIZ;
    }
}
