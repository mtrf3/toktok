package X;

import android.widget.SeekBar;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WUL implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ WUK LJLIL;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public WUL(WUK wuk) {
        this.LJLIL = wuk;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        VideoPublishEditModel videoPublishEditModel = this.LJLIL.LJIIJ;
        if (videoPublishEditModel != null) {
            H8F.LJJJJZI(videoPublishEditModel, seekBar.getProgress(), "background");
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float f = (i * 1.0f) / 100.0f;
        WUP wup = this.LJLIL.LJIIJJI;
        if (wup != null) {
            if ((!wup.LIZ.LLJILJIL().isFastImport && !wup.LIZ.LLJILJIL().isCutSameVideoType() && !wup.LIZ.LLJILJIL().hasOriginalSound()) || wup.LIZ.LLJILJIL().isMuted) {
                InterfaceC143655kP editPreviewApi = wup.LIZ.getEditPreviewApi();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
                o.LJIIIIZZ(ofMusic, "ofMusic(musicVolume)");
                editPreviewApi.Dl0(ofMusic);
            } else if (wup.LIZ.LLJILJIL().isStitchMode()) {
                InterfaceC143655kP editPreviewApi2 = wup.LIZ.getEditPreviewApi();
                VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f);
                o.LJIIIIZZ(ofMusic2, "ofMusic(musicVolume)");
                editPreviewApi2.Dl0(ofMusic2);
            } else if (wup.LIZ.LLJILJIL().getMMusicPath() != null) {
                InterfaceC143655kP editPreviewApi3 = wup.LIZ.getEditPreviewApi();
                VEVolumeChangeOp ofMusic3 = VEVolumeChangeOp.ofMusic(f);
                o.LJIIIIZZ(ofMusic3, "ofMusic(musicVolume)");
                editPreviewApi3.Dl0(ofMusic3);
            }
            wup.LIZ.LLJILJIL().musicVolume = f;
        }
        this.LJLIL.LJII = i;
    }
}
