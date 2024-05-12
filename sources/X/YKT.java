package X;

import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewModel;

/* loaded from: classes16.dex */
public final class YKT {
    public InterfaceC87207YKl LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public long LJFF;
    public float LJI;
    public float LJII;
    public boolean LJIIIIZZ;
    public int LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public SafeHandler LJIILIIL;
    public YKR LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public final UHV LJIJ;
    public EditTextStickerViewModel LJIJJ;
    public int LJIIIZ = 2;
    public RunnableC87209YKn LJIILJJIL = new RunnableC87209YKn(this);
    public InterfaceC87213YKr LJIJI = C87212YKq.LIZ;

    public final boolean LIZ() {
        UHV uhv = this.LJIJ;
        if (uhv != null) {
            return uhv.LIZ();
        }
        if (this.LJIJJ == null) {
            this.LJIJJ = (EditTextStickerViewModel) C165616ej.LIZ(C45804HyK.LJJIFFI(this.LJIILL.getContext())).LIZ(EditTextStickerViewModel.class);
        }
        return this.LJIJJ.LJIIIIZZ();
    }

    public YKT(UHV uhv) {
        this.LJIJ = uhv;
    }

    public final void LIZJ(boolean z) {
        this.LJIIIIZZ = z;
        RunnableC87209YKn runnableC87209YKn = this.LJIILJJIL;
        if (runnableC87209YKn != null) {
            this.LJIILL.removeCallbacks(runnableC87209YKn);
            this.LJIILJJIL = null;
        }
        if (z) {
            if (this.LJIILIIL != null && this.LJIILJJIL == null) {
                RunnableC87209YKn runnableC87209YKn2 = new RunnableC87209YKn(this);
                this.LJIILJJIL = runnableC87209YKn2;
                this.LJIILL.postDelayed(runnableC87209YKn2, 3000);
            }
            this.LIZ.LIZJ(this.LJIILL);
        }
        this.LJIILL.invalidate();
    }

    public final boolean LIZIZ(float f, float f2) {
        this.LJFF = System.currentTimeMillis();
        float f3 = f - this.LJIIJ;
        float f4 = f2 - this.LJIIJJI;
        this.LIZLLL = f3;
        this.LJ = f4;
        boolean z = false;
        if (this.LJIIZILJ) {
            this.LJIIIZ = 2;
            this.LJIIZILJ = false;
        }
        if (this.LJIIIZ == 2 || LIZ()) {
            YKR ykr = this.LJIILL;
            boolean LJIILL = C77119UOl.LJIILL(f3, f4, ykr.getHelpRect(), ykr.LJLJJI.LIZIZ);
            this.LJIIL = LJIILL;
            if (LJIILL) {
                this.LJIIIZ = 3;
                this.LJI = f3;
                this.LJII = f4;
                z = true;
                InterfaceC87207YKl interfaceC87207YKl = this.LIZ;
                if (interfaceC87207YKl != null) {
                    interfaceC87207YKl.LJII(this.LJIILL);
                }
            }
        }
        return z;
    }
}
