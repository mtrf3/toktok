package X;

import android.view.View;
import com.google.android.gms.cast.MediaStatus;

/* renamed from: X.Zjr, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90771Zjr extends AbstractC90446Zec {
    public final View LIZIZ;
    public final int LIZJ = 0;

    @Override // X.AbstractC90446Zec
    public final void LIZJ() {
        this.LIZIZ.setEnabled(false);
    }

    @Override // X.AbstractC90446Zec
    public final void LJ() {
        this.LIZIZ.setEnabled(false);
        this.LIZ = null;
    }

    public final void LJFF() {
        Integer LJJJJL;
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj != null && c90639Zhj.LJIIIZ()) {
            MediaStatus LJI = c90639Zhj.LJI();
            QH7.LJIIIIZZ(LJI);
            if ((LJI.LJJJJZI(64L) || LJI.zzp != 0 || ((LJJJJL = LJI.LJJJJL(LJI.zzc)) != null && LJJJJL.intValue() < LJI.zzq.size() - 1)) && !c90639Zhj.LJIILL()) {
                this.LIZIZ.setVisibility(0);
                this.LIZIZ.setEnabled(true);
                return;
            }
        }
        this.LIZIZ.setVisibility(this.LIZJ);
        this.LIZIZ.setEnabled(false);
    }

    @Override // X.AbstractC90446Zec
    public final void LIZIZ() {
        LJFF();
    }

    public C90771Zjr(View view) {
        this.LIZIZ = view;
        view.setEnabled(false);
    }

    @Override // X.AbstractC90446Zec
    public final void LIZLLL(C90613ZhJ c90613ZhJ) {
        super.LIZLLL(c90613ZhJ);
        LJFF();
    }
}
