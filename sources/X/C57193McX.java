package X;

import android.animation.AnimatorSet;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import kotlin.jvm.internal.o;

/* renamed from: X.McX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57193McX extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicCoverAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C57193McX LJLIL = new C57193McX();

    public C57193McX() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicCoverAssem videoMusicCoverAssem, C43I<? extends C195357lb> c43i) {
        VideoMusicCoverAssem selectSubscribe = videoMusicCoverAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            if (!C57188McS.LIZIZ()) {
                MusicDetailService.LJIJJ().LJIIIZ();
            } else {
                selectSubscribe.z4();
                AnimatorSet animatorSet = selectSubscribe.LLILZIL;
                if ((animatorSet != null && animatorSet.isRunning()) || selectSubscribe.LLILZ) {
                    Keva.getRepo("music_marquee_strategy_repo").storeLong(C57186McQ.LIZ("key_music_cover_animation_show_time"), System.currentTimeMillis());
                }
            }
            if (IFM.LIZ) {
                selectSubscribe.LLJJIJI = false;
                selectSubscribe.O4();
            }
        }
        return C76800UCe.LIZ;
    }
}
