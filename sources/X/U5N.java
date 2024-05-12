package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AqS1S0303000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U5N implements UCZ {
    public final /* synthetic */ InterfaceC88472Yns<Bitmap, C76800UCe> LIZ;

    public U5N(AqS1S0303000_13 aqS1S0303000_13) {
        this.LIZ = aqS1S0303000_13;
    }

    @Override // X.UCZ
    public final void LIZ(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            InterfaceC88472Yns<Bitmap, C76800UCe> interfaceC88472Yns = this.LIZ;
            Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
            o.LJIIIIZZ(copy, "bitmap.copy(\n           …                        )");
            interfaceC88472Yns.invoke(copy);
        }
    }
}
