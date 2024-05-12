package X;

import android.graphics.Bitmap;

/* loaded from: classes15.dex */
public final class W9S implements VWQ<Bitmap> {
    public final /* synthetic */ C81803W8p LJLIL;

    public W9S(C81803W8p c81803W8p) {
        this.LJLIL = c81803W8p;
    }

    @Override // X.VWQ
    public final void LIZ(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        try {
            this.LJLIL.LIZ(bitmap2);
        } finally {
            bitmap2.recycle();
        }
    }
}
