package q03;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C2NU;
import X.C51029K0z;
import X.C5S1;
import X.C61996OUu;
import X.C91249ZrZ;
import X.C98T;
import X.L41;
import X.SVF;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect.CollectAssem;
import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUGCButtonAssem;
import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUgcButtonVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;

/* loaded from: classes22.dex */
public class IDaS492S0100000_29 extends C98T {
    public final int $t;
    public Object l0;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS492S0100000_29(CollectAssem collectAssem, int i) {
        super(300L);
        this.$t = i;
        this.l0 = collectAssem;
    }

    public static final void LIZ$0(IDaS492S0100000_29 iDaS492S0100000_29, View view) {
        if (view != null) {
            ((CollectAssem) iDaS492S0100000_29.l0).g4();
        }
    }

    public static final void LIZ$1(IDaS492S0100000_29 iDaS492S0100000_29, View view) {
        Music music;
        Dsp dsp;
        String fullClipId;
        if (view != null) {
            MusicDspUGCButtonAssem musicDspUGCButtonAssem = (MusicDspUGCButtonAssem) iDaS492S0100000_29.l0;
            musicDspUGCButtonAssem.getClass();
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(musicDspUGCButtonAssem)).getAweme();
            if (aweme != null && (music = aweme.getMusic()) != null) {
                long id = music.getId();
                Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(musicDspUGCButtonAssem)).getAweme();
                if (aweme2 == null || (dsp = aweme2.getDsp()) == null || (fullClipId = dsp.getFullClipId()) == null) {
                    return;
                }
                L41.LIZ.getClass();
                if (L41.LJFF()) {
                    SVF.LJI(String.valueOf(id));
                    ActivityC45651qj LIZ = C212428Vi.LIZ(musicDspUGCButtonAssem);
                    if (LIZ != null) {
                        MusicDspUGCButtonAssem.q4(LIZ, id, fullClipId, false);
                    }
                    C91249ZrZ.LIZJ("play_full_song", ((VideoItemParams) C51029K0z.LJIILLIIL(musicDspUGCButtonAssem)).getAweme().getAid(), ((VideoItemParams) C51029K0z.LJIILLIIL(musicDspUGCButtonAssem)).mRequestId.optString("request_id"), null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
                    return;
                }
                if (!L41.LJ()) {
                    return;
                }
                SVF.LJI(String.valueOf(id));
                Dsp dsp2 = ((VideoItemParams) C51029K0z.LJIILLIIL(musicDspUGCButtonAssem)).getAweme().getDsp();
                if (dsp2 != null && dsp2.isCollected()) {
                    ActivityC45651qj LIZ2 = C212428Vi.LIZ(musicDspUGCButtonAssem);
                    if (LIZ2 != null) {
                        MusicDspUGCButtonAssem.q4(LIZ2, id, fullClipId, true);
                    }
                    C91249ZrZ.LIZJ("play_favorite_song", ((VideoItemParams) C51029K0z.LJIILLIIL(musicDspUGCButtonAssem)).getAweme().getAid(), ((VideoItemParams) C51029K0z.LJIILLIIL(musicDspUGCButtonAssem)).mRequestId.optString("request_id"), null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
                    return;
                }
                if (!C2NU.LIZ.LIZIZ()) {
                    C5S1 c5s1 = new C5S1(musicDspUGCButtonAssem.getContext());
                    c5s1.LIZJ(R.string.img);
                    c5s1.LJ();
                } else {
                    C61996OUu c61996OUu = (C61996OUu) musicDspUGCButtonAssem.LLIIJLIL.getValue();
                    if (c61996OUu != null) {
                        c61996OUu.LIZ(0);
                    }
                    ((MusicDspUgcButtonVM) musicDspUGCButtonAssem.LLIIII.LIZ(musicDspUGCButtonAssem, MusicDspUGCButtonAssem.LLIILII[0])).kv0();
                    C91249ZrZ.LIZJ("add_to_favorite", ((VideoItemParams) C51029K0z.LJIILLIIL(musicDspUGCButtonAssem)).getAweme().getAid(), ((VideoItemParams) C51029K0z.LJIILLIIL(musicDspUGCButtonAssem)).mRequestId.optString("request_id"), null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS492S0100000_29(MusicDspUGCButtonAssem musicDspUGCButtonAssem, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = musicDspUGCButtonAssem;
    }
}
