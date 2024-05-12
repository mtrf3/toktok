package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.CrL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32631CrL implements UCZ {
    public final /* synthetic */ C32609Cqz LIZ;

    public C32631CrL(C32609Cqz c32609Cqz) {
        this.LIZ = c32609Cqz;
    }

    @Override // X.UCZ
    public final void LIZ(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            this.LIZ.LJIIIZ();
            return;
        }
        ImageView imageView = this.LIZ.LJLJI;
        if (imageView == null) {
            return;
        }
        imageView.setImageBitmap(bitmap.copy(bitmap.getConfig(), true));
    }
}
