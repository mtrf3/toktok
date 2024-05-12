package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.ugc.aweme.services.external.ui.DuetConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* loaded from: classes8.dex */
public final class HB5 implements ISDKService.SplitCallback {
    public final /* synthetic */ DuetConfig LIZ;
    public final /* synthetic */ HPU LIZIZ;
    public final /* synthetic */ RecordConfig LIZJ;
    public final /* synthetic */ Context LIZLLL;
    public final /* synthetic */ IRecordService.UICallback LJ;
    public final /* synthetic */ String LJFF;

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final boolean checkIsCanceled() {
        IRecordService.UICallback uICallback = this.LJ;
        if (uICallback != null) {
            return uICallback.checkIsCanceled();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final void onFail() {
        IRecordService.UICallback uICallback = this.LJ;
        if (uICallback != null) {
            uICallback.preFail(-1);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
    public final void onSuccess(int i, int i2) {
        DuetConfig duetConfig = this.LIZ;
        this.LIZIZ.getClass();
        double d = 16;
        duetConfig.setDuetVideoWidth(((int) Math.round((i * 1.0d) / d)) * 16);
        DuetConfig duetConfig2 = this.LIZ;
        this.LIZIZ.getClass();
        duetConfig2.setDuetVideoHeight(((int) Math.round((i2 * 1.0d) / d)) * 16);
        HPU hpu = this.LIZIZ;
        RecordConfig recordConfig = this.LIZJ;
        hpu.getClass();
        Intent LIZ = HPU.LIZ(recordConfig);
        HPU hpu2 = this.LIZIZ;
        DuetConfig duetConfig3 = this.LIZ;
        hpu2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("duet_hash_tag", duetConfig3.getDuetChallenge());
        bundle.putString("duet_video_path", duetConfig3.getMp4Path());
        bundle.putString("duet_audio_path", duetConfig3.getWavPath());
        bundle.putInt("duet_video_width", duetConfig3.getDuetVideoWidth());
        bundle.putString("video_id", duetConfig3.getOriginVideo());
        bundle.putInt("origin_video_aigc_label_type", duetConfig3.getOriginVideoAIGCLabelType());
        bundle.putInt("duet_video_height", duetConfig3.getDuetVideoHeight());
        bundle.putBoolean("duet_from_duet_button", duetConfig3.isFromDuetButton());
        bundle.putString("duet_from", duetConfig3.getDuetFrom());
        if (duetConfig3.getAuthor() == null) {
            H78.LIZ("DuetUser -> RecordServiceBaseImpl -> addDuet -> duetConfig.author is null");
            C78983UzD.LJIILL("RecordServiceBaseImpl -> addDuet -> duetConfig.author is null");
        }
        bundle.putSerializable("duet_author", duetConfig3.getAuthor());
        MusicWaveBean LJIIIZ = C78934UyQ.LJLIL.getMusicService().LJIIIZ(C81995WFz.LIZLLL(duetConfig3.getWavPath()));
        if (LJIIIZ != null) {
            bundle.putSerializable("music_wave_data", LJIIIZ);
        }
        bundle.putParcelable("duet_layout_effect", duetConfig3.getDuetLayout());
        bundle.putFloat("duet_src_loudness", duetConfig3.getSrcLoudness());
        LIZ.putExtras(bundle);
        if (this.LIZ.getMStickerDownloadConfig() != null) {
            StickerDownloadConfig mStickerDownloadConfig = this.LIZ.getMStickerDownloadConfig();
            if (mStickerDownloadConfig != null) {
                HPU hpu3 = this.LIZIZ;
                Context context = this.LIZLLL;
                C42446GlG c42446GlG = new C42446GlG(this.LJ, this.LJFF, hpu3, this.LIZJ, LIZ, this.LIZ, context);
                hpu3.getClass();
                HPU.LIZLLL(context, mStickerDownloadConfig, c42446GlG);
                return;
            }
            return;
        }
        C10K.LIZIZ(new CallableC42444GlE(this.LJ, this.LIZJ, this.LJFF, this.LIZIZ, this.LIZLLL, LIZ), ExecutorC149205tM.LJLILLLLZI, null);
    }

    public HB5(DuetConfig duetConfig, HPU hpu, RecordConfig recordConfig, Context context, IRecordService.UICallback uICallback, String str) {
        this.LIZ = duetConfig;
        this.LIZIZ = hpu;
        this.LIZJ = recordConfig;
        this.LIZLLL = context;
        this.LJ = uICallback;
        this.LJFF = str;
    }
}
