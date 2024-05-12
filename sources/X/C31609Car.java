package X;

import android.graphics.Bitmap;

/* renamed from: X.Car, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31609Car implements UCZ {
    public final /* synthetic */ float LIZ;
    public final /* synthetic */ float LIZIZ;
    public final /* synthetic */ InterfaceC88472Yns<Bitmap, C76800UCe> LIZJ;

    @Override // X.UCZ
    public final void LIZ(Bitmap bitmap) {
        Bitmap LIZ;
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return;
        }
        try {
            float f = this.LIZ;
            if (f > 0.0f) {
                float f2 = this.LIZIZ;
                if (f2 > 0.0f) {
                    LIZ = C31573CaH.LIZ(bitmap, f / f2);
                    if (LIZ == null && !LIZ.isRecycled()) {
                        this.LIZJ.invoke(LIZ);
                    }
                    return;
                }
            }
            LIZ = C31573CaH.LIZ(bitmap, 0.74698794f);
            if (LIZ == null) {
                return;
            }
            this.LIZJ.invoke(LIZ);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C31609Car(float f, float f2, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = interfaceC88472Yns;
    }
}
