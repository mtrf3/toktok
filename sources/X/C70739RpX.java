package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.RpX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70739RpX implements IQB {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ C70756Rpo LJLILLLLZI;

    @Override // X.IPR
    public final void LIZIZ(int i) {
    }

    @Override // X.IPR
    public final void LIZJ(String str) {
    }

    @Override // X.IQB
    public final void LIZLLL(boolean z) {
    }

    @Override // X.IPR
    public final void LJIILL(String str) {
    }

    @Override // X.IPR
    public final void LJJJI() {
    }

    @Override // X.IPR
    public final void onBuffering(boolean z) {
    }

    @Override // X.IPR
    public final void onPlayProgressChange(float f) {
    }

    @Override // X.IPR
    public final void LIZ() {
        View findViewById;
        View view = this.LJLIL;
        if (view == null || (findViewById = view.findViewById(R.id.n79)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // X.IPR
    public final void LJJJJZI() {
        View findViewById;
        View view = this.LJLIL;
        if (view != null && (findViewById = view.findViewById(R.id.n79)) != null) {
            findViewById.setVisibility(0);
        }
        if (this.LJLILLLLZI.LJJIJIIJI() == 0) {
            this.LJLILLLLZI.LJJIIZI();
        }
    }

    @Override // X.IPR
    public final void onPlayCompleted(String str) {
        View findViewById;
        View view = this.LJLIL;
        if (view != null && (findViewById = view.findViewById(R.id.n79)) != null) {
            findViewById.setVisibility(0);
        }
        if (this.LJLILLLLZI.LJJIJIIJI() == 0) {
            this.LJLILLLLZI.LJJIIZI();
        }
    }

    @Override // X.IPR
    public final void onResumePlay(String str) {
        View findViewById;
        View view = this.LJLIL;
        if (view == null || (findViewById = view.findViewById(R.id.n79)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public C70739RpX(View view, C70756Rpo c70756Rpo) {
        this.LJLIL = view;
        this.LJLILLLLZI = c70756Rpo;
    }
}
