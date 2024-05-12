package X;

import android.graphics.Bitmap;
import android.view.View;

/* renamed from: X.Zj7, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90725Zj7 implements InterfaceC90422ZeE {
    public final /* synthetic */ C90730ZjC LIZ;

    public C90725Zj7(C90730ZjC c90730ZjC) {
        this.LIZ = c90730ZjC;
    }

    @Override // X.InterfaceC90422ZeE
    public final void LIZ(Bitmap bitmap) {
        if (bitmap != null) {
            View view = this.LIZ.LJ;
            if (view != null) {
                view.setVisibility(4);
            }
            this.LIZ.LIZIZ.setVisibility(0);
            this.LIZ.LIZIZ.setImageBitmap(bitmap);
        }
    }
}
