package X;

import android.widget.SeekBar;

/* renamed from: X.Sln, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73055Sln implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C73053Sll LJLIL;

    public C73055Sln(C73053Sll c73053Sll) {
        this.LJLIL = c73053Sll;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.LJLIL.setCustomSliding(true);
        InterfaceC73056Slo onPlayerActionBarListener = this.LJLIL.getOnPlayerActionBarListener();
        if (onPlayerActionBarListener != null) {
            onPlayerActionBarListener.LJ();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i = 0;
        this.LJLIL.setCustomSliding(false);
        if (seekBar != null) {
            i = seekBar.getProgress();
        }
        InterfaceC73056Slo onPlayerActionBarListener = this.LJLIL.getOnPlayerActionBarListener();
        if (onPlayerActionBarListener != null) {
            onPlayerActionBarListener.LIZJ((i * 1.0f) / 10000);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        InterfaceC73056Slo onPlayerActionBarListener = this.LJLIL.getOnPlayerActionBarListener();
        if (onPlayerActionBarListener != null) {
            onPlayerActionBarListener.LIZIZ((i * 1.0f) / 10000);
        }
    }
}
