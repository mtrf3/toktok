package X;

import android.view.View;
import java.util.Objects;

/* renamed from: X.Ve3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80219Ve3 implements InterfaceC16710l9 {
    public final /* synthetic */ C80217Ve1 LIZ;

    public C80219Ve3(C80217Ve1 c80217Ve1) {
        this.LIZ = c80217Ve1;
    }

    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View view, C16800lI c16800lI) {
        C16800lI c16800lI2;
        boolean z;
        C80217Ve1 c80217Ve1 = this.LIZ;
        c80217Ve1.getClass();
        if (C16300kU.LIZIZ(c80217Ve1)) {
            c16800lI2 = c16800lI;
        } else {
            c16800lI2 = null;
        }
        if (!Objects.equals(c80217Ve1.LJLJL, c16800lI2)) {
            c80217Ve1.LJLJL = c16800lI2;
            if (c80217Ve1.LJLLLLLL != null && c80217Ve1.getTopInset() > 0) {
                z = true;
            } else {
                z = false;
            }
            c80217Ve1.setWillNotDraw(!z);
            c80217Ve1.requestLayout();
        }
        return c16800lI;
    }
}
