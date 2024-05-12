package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.lighten.loader.SmartImageView;

/* renamed from: X.SAc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71650SAc extends AbstractC32209CkX {
    public final /* synthetic */ SmartImageView LIZ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
    }

    public C71650SAc(SmartImageView smartImageView) {
        this.LIZ = smartImageView;
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        if (bitmap != null && bitmap.isRecycled()) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        SmartImageView smartImageView = this.LIZ;
        if (smartImageView.getWindowVisibility() != 0) {
            return;
        }
        smartImageView.getHierarchy().LJIILLIIL(0);
        smartImageView.getHierarchy().LJIJJ(bitmapDrawable, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
    }
}
