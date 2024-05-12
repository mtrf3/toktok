package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.Gmd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42531Gmd implements InterfaceC42534Gmg {
    public final /* synthetic */ C42532Gme LIZ;
    public final /* synthetic */ int LIZIZ;

    @Override // X.InterfaceC42534Gmg
    public final void LIZ(C81392Vwy<W5A> c81392Vwy) {
        ImageView imageView;
        Bitmap underlyingBitmap = ((W5B) c81392Vwy.LJI()).getUnderlyingBitmap();
        if (underlyingBitmap != null && !underlyingBitmap.isRecycled() && (imageView = this.LIZ.LJLIL) != null) {
            Object tag = imageView.getTag();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZIZ);
            LIZ.append("");
            if (tag.equals(X1D.LIZIZ(LIZ))) {
                C42532Gme c42532Gme = this.LIZ;
                c42532Gme.LJLILLLLZI = c81392Vwy;
                c42532Gme.LJLIL.setImageBitmap(underlyingBitmap);
            }
        }
    }

    public C42531Gmd(C42532Gme c42532Gme, int i) {
        this.LIZ = c42532Gme;
        this.LIZIZ = i;
    }
}
