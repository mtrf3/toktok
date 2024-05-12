package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SWD extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, C8UR, C76800UCe> {
    public static final SWD LJLIL = new SWD();

    public SWD() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, C8UR c8ur) {
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c8ur != null) {
            if (C53208KuS.LIZ()) {
                selectSubscribe.c5();
            } else {
                selectSubscribe.Yp();
            }
        }
        return C76800UCe.LIZ;
    }
}
