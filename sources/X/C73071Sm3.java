package X;

import android.widget.SeekBar;

/* renamed from: X.Sm3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73071Sm3 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C73063Slv LJLIL;

    public C73071Sm3(C73063Slv c73063Slv) {
        this.LJLIL = c73063Slv;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.LJLIL.setCustomSliding(true);
        InterfaceC73072Sm4 onPlayerActionBarListener = this.LJLIL.getOnPlayerActionBarListener();
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
        InterfaceC73072Sm4 onPlayerActionBarListener = this.LJLIL.getOnPlayerActionBarListener();
        if (onPlayerActionBarListener != null) {
            onPlayerActionBarListener.LIZJ((i * 1.0f) / 10000);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        InterfaceC73072Sm4 onPlayerActionBarListener = this.LJLIL.getOnPlayerActionBarListener();
        if (onPlayerActionBarListener != null) {
            onPlayerActionBarListener.LIZIZ((i * 1.0f) / 10000);
        }
    }
}
