package X;

import android.widget.SeekBar;

/* renamed from: X.Slf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73047Slf implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C73046Sle LJLIL;

    public C73047Slf(C73046Sle c73046Sle) {
        this.LJLIL = c73046Sle;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.LJLIL.setCustomSliding(true);
        InterfaceC73048Slg onPlayerActionBarListener = this.LJLIL.getOnPlayerActionBarListener();
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
        InterfaceC73048Slg onPlayerActionBarListener = this.LJLIL.getOnPlayerActionBarListener();
        if (onPlayerActionBarListener != null) {
            onPlayerActionBarListener.LIZJ((i * 1.0f) / 10000);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        InterfaceC73048Slg onPlayerActionBarListener = this.LJLIL.getOnPlayerActionBarListener();
        if (onPlayerActionBarListener != null) {
            onPlayerActionBarListener.LIZIZ((i * 1.0f) / 10000);
        }
    }
}
