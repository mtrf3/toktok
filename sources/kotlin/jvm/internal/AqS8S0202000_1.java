package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C42307Gj1;
import X.C4N7;
import X.C4N8;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.W5G;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes2.dex */
public class AqS8S0202000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS8S0202000_1 aqS8S0202000_1) {
        BitmapDrawable bitmapDrawable;
        Drawable drawable = ((W5G) aqS8S0202000_1.l0).getDrawable();
        Bitmap bitmap = null;
        if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
            bitmap = bitmapDrawable.getBitmap();
        }
        ((W5G) aqS8S0202000_1.l0).setImageBitmap(C42307Gj1.LJI((Bitmap) aqS8S0202000_1.l1, aqS8S0202000_1.i2, aqS8S0202000_1.i3, 0, 1));
        if (bitmap != null) {
            bitmap.recycle();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS8S0202000_1 aqS8S0202000_1) {
        IDqS426S0100000_1 iDqS426S0100000_1 = ((C4N7) ((C4N8) aqS8S0202000_1.l0)).LJLLLLLL;
        if (iDqS426S0100000_1 != null) {
            iDqS426S0100000_1.invoke(Integer.valueOf(aqS8S0202000_1.i2), Integer.valueOf(aqS8S0202000_1.i3), (View) aqS8S0202000_1.l1);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS8S0202000_1(C4N8 c4n8, C4N8<Object> c4n82, int i, int i2, View view) {
        super(0);
        this.$t = view;
        this.l0 = c4n8;
        this.i2 = c4n82;
        this.i3 = i;
        this.l1 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S0202000_1(W5G w5g, Bitmap bitmap, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = w5g;
        this.l1 = bitmap;
        this.i2 = i;
        this.i3 = i2;
    }
}
