package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUGCButtonAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.o;

/* renamed from: X.Zwh, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91567Zwh extends AbstractC65781Prl implements InterfaceC88471Ynr<MusicDspUGCButtonAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C91567Zwh LJLIL = new C91567Zwh();

    public C91567Zwh() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MusicDspUGCButtonAssem musicDspUGCButtonAssem, C43I<? extends Integer> c43i) {
        Music music;
        MusicDspUGCButtonAssem selectSubscribe = musicDspUGCButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && !selectSubscribe.LLIIJI) {
            selectSubscribe.LLIIJI = true;
            L41.LIZ.getClass();
            if (L41.LJFF()) {
                C91249ZrZ.LJIIL("play_full_song", ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid(), ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mRequestId.optString("request_id"), null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
                C91249ZrZ.LJIILIIL("full_song_button", "1");
            } else {
                C91249ZrZ.LJIIL("add_to_favorite", ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid(), ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mRequestId.optString("request_id"), null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
                C91249ZrZ.LJIILIIL("feed_fav_button", "1");
            }
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            if (aweme != null && (music = aweme.getMusic()) != null) {
                SVF.LJII(String.valueOf(music.getId()));
            }
        }
        return C76800UCe.LIZ;
    }
}
