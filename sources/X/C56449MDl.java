package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;

/* renamed from: X.MDl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56449MDl extends C56447MDj {
    @Override // X.C56447MDj
    public final String LIZLLL() {
        return "LandscapeSeekBarControl";
    }

    @Override // X.C56447MDj, X.InterfaceC56456MDs
    public final void onStopTrackingTouch(SeekBar seekBar) {
        super.onStopTrackingTouch(seekBar);
        C2U8.LIZ(new C51689KQj(false, this.LJIIJ, this.LJIIZILJ));
        if (seekBar != null) {
            this.LIZJ.setText(C56451MDn.LIZLLL((seekBar.getProgress() / seekBar.getMax()) * 100.0f, this.LJIIL));
        }
    }

    public C56449MDl(C56448MDk c56448MDk, ViewGroup viewGroup, TuxTextView tuxTextView, TuxTextView tuxTextView2, TuxIconView tuxIconView, ImageView imageView, DataCenter dataCenter) {
        super(c56448MDk, viewGroup, tuxTextView, tuxTextView2, tuxIconView, imageView, dataCenter);
    }
}
