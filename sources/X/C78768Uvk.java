package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Uvk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78768Uvk<T> implements InterfaceC41846Gba {
    public final /* synthetic */ C78767Uvj LJLIL;

    public C78768Uvk(C78767Uvj c78767Uvj) {
        this.LJLIL = c78767Uvj;
    }

    @Override // X.InterfaceC41846Gba
    public final void accept(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.LJLIL.LJLJJLL = new BitmapDrawable(bitmap);
            C78767Uvj c78767Uvj = this.LJLIL;
            Drawable drawable = c78767Uvj.LJLJJLL;
            if (drawable != null) {
                int i = c78767Uvj.LJLJJI;
                drawable.setBounds(0, 0, i, i);
            }
            this.LJLIL.LJLJJL.postInvalidate();
        }
    }
}
