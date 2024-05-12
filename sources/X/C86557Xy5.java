package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xy5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86557Xy5 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoProgressBarAssem, C46361IHl, C76800UCe> {
    public static final C86557Xy5 LJLIL = new C86557Xy5();

    public C86557Xy5() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoProgressBarAssem videoProgressBarAssem, C46361IHl c46361IHl) {
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        VideoControl videoControl;
        VideoProgressBarAssem selectSubscribeOnAsync = videoProgressBarAssem;
        C46361IHl c46361IHl2 = c46361IHl;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (!C225488t6.LIZ || !C54840Lfg.LJJZ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme())) {
            VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync);
            String str = null;
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && aweme.getVideoControl() != null) {
                VideoItemParams videoItemParams2 = (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync);
                int i = 0;
                if ((videoItemParams2 == null || (aweme4 = videoItemParams2.getAweme()) == null || (videoControl = aweme4.getVideoControl()) == null || videoControl.showProgressBar != 0) && c46361IHl2 != null) {
                    VideoProgressBarViewModel r4 = selectSubscribeOnAsync.r4();
                    C5S7 c5s7 = selectSubscribeOnAsync.LLIFFJFJJ;
                    if (c5s7 != null) {
                        i = c5s7.getProgress();
                    }
                    r4.getClass();
                    VideoItemParams gv0 = r4.gv0();
                    if (gv0 != null && gv0.getAweme() != null && (aweme2 = c46361IHl2.LJLIL) != null) {
                        String aid = aweme2.getAid();
                        VideoItemParams gv02 = r4.gv0();
                        if (gv02 != null && (aweme3 = gv02.getAweme()) != null) {
                            str = aweme3.getAid();
                        }
                        if (aid == str && (i != 0 || SystemClock.elapsedRealtime() >= r4.LJLJLLL + 600)) {
                            r4.setState(new AqS146S0200000_15(r4, c46361IHl2, 74));
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
