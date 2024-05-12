package X;

import Y.ARunnableS6S0400000_2;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* renamed from: X.6ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163276ax implements InterfaceC15040iS<Bitmap> {
    public final /* synthetic */ InterfaceC163256av LIZ;

    public C163276ax(FT5 ft5) {
        this.LIZ = ft5;
    }

    @Override // X.InterfaceC15040iS
    public final void accept(Bitmap bitmap) {
        final Bitmap bitmap2 = bitmap;
        InterfaceC15040iS<Bitmap> interfaceC15040iS = new InterfaceC15040iS<Bitmap>() { // from class: X.6aw
            @Override // X.InterfaceC15040iS
            public final void accept(Bitmap bitmap3) {
                Bitmap bitmap4 = bitmap3;
                Bitmap bitmap5 = bitmap2;
                InterfaceC163256av interfaceC163256av = C163276ax.this.LIZ;
                if (bitmap5 == null || bitmap4 == null) {
                    return;
                }
                int width = bitmap4.getWidth();
                int height = bitmap4.getHeight();
                int width2 = bitmap5.getWidth();
                int height2 = bitmap5.getHeight();
                if (width <= 0 || height <= 0 || width2 <= 0 || height2 <= 0) {
                    String LLLZI = C16880lQ.LLLZI(Locale.US, "ResizeBitmapSizeError width:%d height:%d photoWidth:%d photoHeight:%d", new Object[]{Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(width2), Integer.valueOf(height2)});
                    C78983UzD.LJIILL(LLLZI);
                    H78.LJI(LLLZI);
                    if (width <= 0 || height <= 0) {
                        return;
                    }
                }
                HRJ.LIZ.execute(new ARunnableS6S0400000_2(bitmap5, bitmap4, new RuntimeException("ResizeBitmapException"), interfaceC163256av, 5));
            }
        };
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("res://");
        LIZ.append(C44172HVg.LIZ.getPackageName());
        LIZ.append("/");
        LIZ.append(R.drawable.bv3);
        C78764Uvg.LJIILIIL(C163246au.LIZ(UriProtector.parse(X1D.LIZIZ(LIZ))), 0, 0, interfaceC15040iS);
    }
}
