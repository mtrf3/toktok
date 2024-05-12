package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SWB extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, C8UI, C76800UCe> {
    public static final SWB LJLIL = new SWB();

    public SWB() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, C8UI c8ui) {
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c8ui != null) {
            if (C53208KuS.LIZ()) {
                selectSubscribe.c5();
            } else {
                selectSubscribe.Yp();
            }
        }
        return C76800UCe.LIZ;
    }
}
