package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;

/* renamed from: X.ClO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32262ClO extends AbstractC32209CkX {
    public final /* synthetic */ InterfaceC73573Su9 LIZ;
    public final /* synthetic */ ImageModel LIZIZ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        if (this.LIZ.isDisposed()) {
            C0NB.LJ("LiveImageUtils", "subscriber is disposed");
        } else {
            this.LIZ.onError(w4w.LJFF());
        }
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        if (bitmap == null || bitmap.getConfig() == null) {
            InterfaceC73573Su9 interfaceC73573Su9 = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("No bitmap loaded for imageModel: ");
            LIZ.append(this.LIZIZ.toString());
            interfaceC73573Su9.onError(new IllegalStateException(X1D.LIZIZ(LIZ)));
            return;
        }
        this.LIZ.onNext(bitmap.copy(bitmap.getConfig(), false));
        this.LIZ.onComplete();
    }

    public C32262ClO(C73433Srt c73433Srt, ImageModel imageModel) {
        this.LIZ = c73433Srt;
        this.LIZIZ = imageModel;
    }
}
