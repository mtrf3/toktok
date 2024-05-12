package X;

import android.widget.SeekBar;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity;

/* loaded from: classes11.dex */
public final class OWF implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ LiveWallPaperPreviewActivity LJLIL;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public OWF(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity) {
        this.LJLIL = liveWallPaperPreviewActivity;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        LiveWallPaperBean liveWallPaperBean;
        if (z) {
            LiveWallPaperPreviewActivity liveWallPaperPreviewActivity = this.LJLIL;
            float f = (i * 1.0f) / 100.0f;
            liveWallPaperPreviewActivity.LJLJJL = f;
            OWI owi = liveWallPaperPreviewActivity.LJLJJI;
            if (owi == null || owi.LIZJ == null || (liveWallPaperBean = owi.LJ) == null || liveWallPaperBean.isShouldMute()) {
                return;
            }
            owi.LJ.setVolume(f);
            owi.LIZJ.LLJJIJIL(f, f);
        }
    }
}
