package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SWF extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final SWF LJLIL = new SWF();

    public SWF() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, C43I<? extends C195357lb> c43i) {
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLILL = false;
        }
        return C76800UCe.LIZ;
    }
}
