package X;

import android.widget.ImageView;
import android.widget.SeekBar;

/* renamed from: X.Bww, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30430Bww implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C30429Bwv LJLIL;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public C30430Bww(C30429Bwv c30429Bwv) {
        this.LJLIL = c30429Bwv;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C30735C4l exposureBar = this.LJLIL.getExposureBar();
        if (exposureBar != null) {
            exposureBar.setVisibility(0);
        }
        ((ImageView) this.LJLIL.LIZ()).setVisibility(8);
        C30429Bwv c30429Bwv = this.LJLIL;
        c30429Bwv.LJLLL = ((i - 500) * c30429Bwv.LJLJJI) / 1000;
        if (C29306Beo.LJJI()) {
            InterfaceC30359Bvn LJIILIIL = C87277YNd.LJIILIIL(this.LJLIL.getDataChannel());
            if (LJIILIIL != null) {
                LJIILIIL.setExposureCompensation(this.LJLIL.LJLLL);
                return;
            }
            return;
        }
        CKO cko = this.LJLIL.LJLJI;
        if (cko == null) {
            return;
        }
        cko.setExposureCompensation(r0.LJLLL);
    }
}
