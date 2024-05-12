package X;

import android.view.View;
import android.view.ViewStub;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.utils.Au2S13S0100000_2;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* renamed from: X.66b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1548966b implements InterfaceC42219Ghb {
    public View LIZ;
    public View LIZIZ;
    public TuxTextView LIZJ;
    public C223338pd LIZLLL;
    public final /* synthetic */ C66Y LJ;

    @Override // X.InterfaceC42219Ghb
    public final void LIZ() {
        C223338pd c223338pd = this.LIZLLL;
        if (c223338pd != null) {
            c223338pd.LIZJ();
            this.LIZLLL.setVisibility(8);
        }
        TuxTextView tuxTextView = this.LIZJ;
        if (tuxTextView != null) {
            tuxTextView.setText(R.string.im9);
        }
    }

    @Override // X.InterfaceC42219Ghb
    public final void LIZJ() {
        View view;
        View view2 = this.LIZ;
        if (view2 != null) {
            view2.setVisibility(8);
            this.LIZLLL.LIZJ();
        }
        if (this.LIZIZ == null && (view = this.LJ.LLD) != null) {
            this.LIZIZ = view.findViewById(R.id.hps);
        }
        View view3 = this.LIZIZ;
        if (view3 != null) {
            view3.setVisibility(0);
        }
    }

    public C1548966b(C66Y c66y) {
        this.LJ = c66y;
    }

    @Override // X.InterfaceC42219Ghb
    public final void LIZIZ(float f, boolean z) {
        View view;
        if (z && this.LIZ == null && (view = this.LJ.LLD) != null) {
            View inflate = ((ViewStub) view.findViewById(R.id.hpt)).inflate();
            this.LIZ = inflate;
            this.LIZJ = (TuxTextView) inflate.findViewById(R.id.g8u);
            C223338pd c223338pd = (C223338pd) this.LIZ.findViewById(R.id.g8y);
            this.LIZLLL = c223338pd;
            c223338pd.LIZIZ();
            C16880lQ.LJIIJ(new Au2S13S0100000_2(this, 2), this.LIZ.findViewById(R.id.b3r));
        }
        TuxTextView tuxTextView = this.LIZJ;
        if (tuxTextView != null) {
            tuxTextView.setText(C16880lQ.LLLZI(Locale.getDefault(), "%s%d%%", new Object[]{this.LIZJ.getContext().getString(R.string.r6l), Integer.valueOf((int) (f * 100.0f))}));
        }
    }
}
