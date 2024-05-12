package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SX4 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, Boolean, C76800UCe> {
    public static final SX4 LJLIL = new SX4();

    public SX4() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, Boolean bool) {
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            selectSubscribe.R4(8);
        } else {
            selectSubscribe.R4(0);
        }
        return C76800UCe.LIZ;
    }
}
