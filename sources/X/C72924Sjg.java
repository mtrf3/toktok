package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AqS178S0100000_12;

/* renamed from: X.Sjg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72924Sjg extends AbstractC32209CkX {
    public final /* synthetic */ android.net.Uri LIZ;
    public final /* synthetic */ InterfaceC88472Yns<Bitmap, C76800UCe> LIZIZ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WaterMarkController_onFailureImpl uri = ");
        LIZ.append(this.LIZ);
        C0NB.LIZIZ("def_mask", X1D.LIZIZ(LIZ));
        this.LIZIZ.invoke(null);
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WaterMarkController_onNewResultImpl uri = ");
        LIZ.append(this.LIZ);
        C0NB.LIZIZ("def_mask", X1D.LIZIZ(LIZ));
        this.LIZIZ.invoke(bitmap);
    }

    public C72924Sjg(android.net.Uri uri, AqS178S0100000_12 aqS178S0100000_12) {
        this.LIZ = uri;
        this.LIZIZ = aqS178S0100000_12;
    }
}
