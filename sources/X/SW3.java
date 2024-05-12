package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SW3 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, Boolean, C76800UCe> {
    public static final SW3 LJLIL = new SW3();

    public SW3() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, Boolean bool) {
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (bool != null) {
            selectSubscribe.Yp();
        }
        return C76800UCe.LIZ;
    }
}
