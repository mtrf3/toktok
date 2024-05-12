package X;

import android.widget.SeekBar;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel;

/* renamed from: X.agU, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94406agU extends AbstractC93435aQp {
    public final /* synthetic */ LiquefyFragment LJLIL;

    public C94406agU(LiquefyFragment liquefyFragment) {
        this.LJLIL = liquefyFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.LJLIL.Gl().lv0("distortion_y");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        LiquefyViewModel Gl = this.LJLIL.Gl();
        Gl.getClass();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(Gl), null, null, new C94984apo(Gl, ((i / 10000) * 2.0f) - 1.0f, null), 3);
    }
}
