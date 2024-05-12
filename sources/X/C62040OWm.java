package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.OWm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62040OWm implements InterfaceC82810Wek<Bitmap> {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LIZ;
    public final /* synthetic */ ImageView LIZIZ;

    @Override // X.InterfaceC82810Wek
    public final void LIZ(Bitmap bitmap) {
        boolean z;
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            this.LIZIZ.setImageBitmap(bitmap2);
        }
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LIZ;
        if (interfaceC88472Yns != null) {
            if (bitmap2 != null) {
                z = true;
            } else {
                z = false;
            }
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C62040OWm(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, ImageView imageView) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = imageView;
    }
}
