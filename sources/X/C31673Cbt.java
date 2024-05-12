package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.Cbt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31673Cbt extends AbstractC32664Crs<C81392Vwy<W5A>> {
    public final /* synthetic */ InterfaceC67352kd<Bitmap> LIZ;

    public C31673Cbt(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> dataSource) {
        o.LJIIIZ(dataSource, "dataSource");
        InterfaceC67352kd<Bitmap> interfaceC67352kd = this.LIZ;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }

    @Override // X.AbstractC32664Crs
    public final void LJFF(W4W<C81392Vwy<W5A>> dataSource) {
        W5A w5a;
        W5B w5b;
        o.LJIIIZ(dataSource, "dataSource");
        C81392Vwy<W5A> result = dataSource.getResult();
        Bitmap bitmap = null;
        if (result != null) {
            w5a = result.LJI();
        } else {
            w5a = null;
        }
        if ((w5a instanceof W5B) && (w5b = (W5B) w5a) != null) {
            bitmap = w5b.getUnderlyingBitmap();
        }
        InterfaceC67352kd<Bitmap> interfaceC67352kd = this.LIZ;
        C3C5.m7constructorimpl(bitmap);
        interfaceC67352kd.resumeWith(bitmap);
    }
}
