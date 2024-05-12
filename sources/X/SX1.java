package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SX1 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, C43I<? extends Integer>, C76800UCe> {
    public static final SX1 LJLIL = new SX1();

    public SX1() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, C43I<? extends Integer> c43i) {
        VideoMusicTitleAssem selectSubscribeOnAsync = videoMusicTitleAssem;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (!C53324KwK.LIZ() || c43i != null) {
            selectSubscribeOnAsync.A4().nv0();
        }
        return C76800UCe.LIZ;
    }
}
