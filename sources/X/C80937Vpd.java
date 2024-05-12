package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: X.Vpd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80937Vpd implements InterfaceC80940Vpg {
    @Override // X.InterfaceC80940Vpg
    public final String getKey() {
        return "tik_bot_rtl_transform";
    }

    @Override // X.InterfaceC80940Vpg
    public final C80935Vpb LIZ(Bitmap bitmap, InterfaceC80941Vph interfaceC80941Vph) {
        return LIZIZ(bitmap, interfaceC80941Vph);
    }

    public final C80935Vpb LIZIZ(Bitmap bitmap, InterfaceC80941Vph interfaceC80941Vph) {
        Bitmap createBitmap;
        if (bitmap != null) {
            try {
                Matrix matrix = new Matrix();
                matrix.preScale(-1.0f, 1.0f);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            } catch (Exception unused) {
                return null;
            }
        } else {
            createBitmap = null;
        }
        if (interfaceC80941Vph == null) {
            return null;
        }
        return new C80935Vpb(((C80939Vpf) interfaceC80941Vph).LIZ.LIZJ(createBitmap));
    }
}
