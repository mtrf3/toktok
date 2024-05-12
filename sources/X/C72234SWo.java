package X;

import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SWo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72234SWo extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleRefactorAssem, Music, C76800UCe> {
    public static final C72234SWo LJLIL = new C72234SWo();

    public C72234SWo() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleRefactorAssem videoMusicTitleRefactorAssem, Music music) {
        VideoMusicTitleRefactorAssem selectSubscribe = videoMusicTitleRefactorAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C8YN.LJIJI(selectSubscribe.B4(), new AqS143S0200000_12(selectSubscribe, music, 142));
        return C76800UCe.LIZ;
    }
}
