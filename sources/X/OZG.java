package X;

import android.graphics.Bitmap;

/* loaded from: classes11.dex */
public final class OZG implements InterfaceC78660Uu0 {
    public final /* synthetic */ OZD LJLIL;

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
        OZH ozh = this.LJLIL.LJLJJL;
        if (ozh != null) {
            ozh.LIZ();
        }
    }

    public OZG(OZD ozd) {
        this.LJLIL = ozd;
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        int i;
        OZH ozh;
        OZD ozd = this.LJLIL;
        if (bitmap != null) {
            ozd.LJLILLLLZI.setImageBitmap(bitmap);
            OZD ozd2 = this.LJLIL;
            if (ozd2.LJLJI != 1 && (ozh = ozd2.LJLJJL) != null) {
                ozh.LIZIZ();
            }
            i = 2;
        } else {
            OZH ozh2 = ozd.LJLJJL;
            if (ozh2 != null) {
                ozh2.LIZ();
            }
            i = 3;
        }
        ozd.LJLJJI = i;
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        OZH ozh = this.LJLIL.LJLJJL;
        if (ozh != null) {
            ozh.LIZ();
        }
    }
}
