package X;

import android.widget.SeekBar;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OWO implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBar.OnSeekBarChangeListener LJLIL;
    public final /* synthetic */ OWN LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C81239VuV LJLJJI;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        o.LJIIIZ(seekBar, "seekBar");
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LJLIL;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        o.LJIIIZ(seekBar, "seekBar");
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LJLIL;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
        OWN own = this.LJLILLLLZI;
        String enterFrom = this.LJLJI;
        int progress = this.LJLJJI.getProgress();
        own.getClass();
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au LIZJ = C78920UyC.LIZJ(progress, "progress");
        LIZJ.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("adjust_wallpaper_volume", LIZJ.LIZ);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        o.LJIIIZ(seekBar, "seekBar");
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LJLIL;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }

    public OWO(OWF owf, OWN own, String str, C81239VuV c81239VuV) {
        this.LJLIL = owf;
        this.LJLILLLLZI = own;
        this.LJLJI = str;
        this.LJLJJI = c81239VuV;
    }
}
