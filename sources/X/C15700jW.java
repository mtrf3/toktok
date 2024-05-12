package X;

import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;

/* renamed from: X.0jW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15700jW {
    public static void LIZ(int i, int i2, int i3, ImageView imageView, ImageModel imageModel, InterfaceC75158Tec interfaceC75158Tec, boolean z) {
        if (!C15650jR.LIZIZ(imageModel) || imageView == null || !C15640jQ.LIZIZ(imageView.getContext())) {
            return;
        }
        C17190lv LJII = C17190lv.LJII(imageView.getContext());
        LJII.LJFF = imageModel;
        LJII.LJFF();
        LJII.LIZ(ImageView.ScaleType.CENTER_CROP);
        LJII.LJIIL = z;
        if (i > 0 && i2 > 0) {
            LJII.LJI = new C79238V7y(i, i2);
        }
        XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C2F4(i3, LJII, interfaceC75158Tec, imageModel, imageView, null), 2);
    }
}
