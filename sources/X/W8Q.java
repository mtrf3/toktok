package X;

import android.graphics.Bitmap;

/* loaded from: classes15.dex */
public final class W8Q implements WB5 {
    public final W8R LJLIL = new W8R();
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC81823W9j LJLJJI;
    public int LJLJJL;

    @Override // X.W81, X.VWQ
    public final void LIZ(Object obj) {
        synchronized (this) {
            int LIZJ = this.LJLIL.LIZJ(obj);
            if (LIZJ <= this.LJLJI) {
                this.LJLJJI.LJ();
                this.LJLIL.LJFF(obj);
                this.LJLJJL += LIZJ;
            }
        }
    }

    public final synchronized void LIZIZ(int i) {
        Bitmap bitmap;
        while (this.LJLJJL > i && (bitmap = (Bitmap) this.LJLIL.LJ()) != null) {
            this.LJLJJL -= this.LJLIL.LIZJ(bitmap);
            this.LJLJJI.LJI();
        }
    }

    @Override // X.PML
    public final void LIZLLL(EnumC81745W6j enumC81745W6j) {
        LIZIZ((int) ((1.0d - enumC81745W6j.getSuggestedTrimRatio()) * this.LJLILLLLZI));
    }

    @Override // X.W81
    public final Bitmap get(int i) {
        Bitmap bitmap;
        synchronized (this) {
            int i2 = this.LJLJJL;
            int i3 = this.LJLILLLLZI;
            if (i2 > i3) {
                LIZIZ(i3);
            }
            bitmap = (Bitmap) this.LJLIL.LIZ(i);
            if (bitmap != null) {
                this.LJLJJL -= this.LJLIL.LIZJ(bitmap);
                this.LJLJJI.LIZJ();
            } else {
                this.LJLJJI.LIZIZ();
                bitmap = Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
            }
        }
        return bitmap;
    }

    public W8Q(int i, int i2, C78937UyT c78937UyT) {
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = c78937UyT;
    }
}
