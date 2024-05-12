package X;

import android.widget.SeekBar;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WUM implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ WUK LJLIL;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public WUM(WUK wuk) {
        this.LJLIL = wuk;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        VideoPublishEditModel videoPublishEditModel = this.LJLIL.LJIIJ;
        if (videoPublishEditModel != null) {
            H8F.LJJJJZI(videoPublishEditModel, seekBar.getProgress(), "voice");
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float f = (i * 1.0f) / 100.0f;
        WUP wup = this.LJLIL.LJIIJJI;
        if (wup != null) {
            if (wup.LIZ.LLJILJIL().isStitchMode()) {
                InterfaceC143655kP editPreviewApi = wup.LIZ.getEditPreviewApi();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f);
                o.LJIIIIZZ(ofVoice, "ofVoice(voiceVolume)");
                editPreviewApi.Dl0(ofVoice);
            } else {
                InterfaceC143655kP editPreviewApi2 = wup.LIZ.getEditPreviewApi();
                VEVolumeChangeOp ofVoice2 = VEVolumeChangeOp.ofVoice(f);
                o.LJIIIIZZ(ofVoice2, "ofVoice(voiceVolume)");
                editPreviewApi2.Dl0(ofVoice2);
            }
            wup.LIZ.LLJILJIL().voiceVolume = f;
        }
        this.LJLIL.LJIIIIZZ = i;
    }
}
