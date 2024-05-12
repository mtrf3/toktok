package X;

import android.widget.SeekBar;

/* renamed from: X.MDp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56453MDp implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C56448MDk LJLIL;

    public C56453MDp(C56448MDk c56448MDk) {
        this.LJLIL = c56448MDk;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        InterfaceC56456MDs mOnSeekBarChangeListener = this.LJLIL.getMOnSeekBarChangeListener();
        if (mOnSeekBarChangeListener != null) {
            mOnSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        InterfaceC56456MDs mOnSeekBarChangeListener = this.LJLIL.getMOnSeekBarChangeListener();
        if (mOnSeekBarChangeListener != null) {
            mOnSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        InterfaceC56456MDs mOnSeekBarChangeListener = this.LJLIL.getMOnSeekBarChangeListener();
        if (mOnSeekBarChangeListener != null) {
            mOnSeekBarChangeListener.onProgressChanged(i);
        }
    }
}
