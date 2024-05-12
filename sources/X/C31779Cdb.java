package X;

import android.widget.SeekBar;

/* renamed from: X.Cdb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31779Cdb implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C31778Cda LJLIL;
    public final /* synthetic */ SeekBar.OnSeekBarChangeListener LJLILLLLZI;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.LJLILLLLZI.onStartTrackingTouch(seekBar);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.LJLILLLLZI.onStopTrackingTouch(seekBar);
    }

    public C31779Cdb(C31778Cda c31778Cda, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.LJLIL = c31778Cda;
        this.LJLILLLLZI = onSeekBarChangeListener;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar != null && i != this.LJLIL.LJLJJLL && i >= 0 && i <= seekBar.getMax()) {
            this.LJLIL.LIZ(seekBar);
            this.LJLILLLLZI.onProgressChanged(seekBar, i, true);
        }
    }
}
