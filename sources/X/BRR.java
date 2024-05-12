package X;

import android.content.Context;
import com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class BRR extends C47061t0 {
    public final /* synthetic */ GoodyBagWidget LLIIJI;

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BRR(GoodyBagWidget goodyBagWidget, Context context) {
        super(context);
        this.LLIIJI = goodyBagWidget;
        new LinkedHashMap();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        BRR brr = this.LLIIJI.LJLIL;
        if (brr != null) {
            float f = 2;
            brr.setPivotX(brr.getWidth() / f);
            brr.setPivotY(brr.getHeight() / f);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("width: ");
            LIZ.append(brr.getWidth());
            LIZ.append(", height: ");
            LIZ.append(brr.getHeight());
            C0NB.LIZIZ("GoodyBagWidget", X1D.LIZIZ(LIZ));
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
