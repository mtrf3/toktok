package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.5fU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140605fU extends AbstractC65781Prl implements InterfaceC88475Ynv<Bitmap, Integer, Integer, Integer, Integer, Bitmap> {
    public static final C140605fU LJLIL = new C140605fU();

    public C140605fU() {
        super(5);
    }

    @Override // X.InterfaceC88475Ynv
    public final Bitmap invoke(Bitmap bitmap, Integer num, Integer num2, Integer num3, Integer num4) {
        Bitmap bitmap2 = bitmap;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        int intValue3 = num3.intValue();
        int intValue4 = num4.intValue();
        o.LJIIIZ(bitmap2, "bitmap");
        Bitmap LIZ = C140585fS.LIZ(bitmap2, intValue, intValue2, intValue3, intValue4);
        o.LJIIIIZZ(LIZ, "resizeBitmap(\n          …ht,\n                    )");
        return LIZ;
    }
}
