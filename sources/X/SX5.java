package X;

import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SX5 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleRefactorAssem, Boolean, C76800UCe> {
    public static final SX5 LJLIL = new SX5();

    public SX5() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleRefactorAssem videoMusicTitleRefactorAssem, Boolean bool) {
        VideoMusicTitleRefactorAssem selectSubscribe = videoMusicTitleRefactorAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            selectSubscribe.I4(8);
        } else {
            selectSubscribe.I4(0);
        }
        return C76800UCe.LIZ;
    }
}
