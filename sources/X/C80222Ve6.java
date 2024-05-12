package X;

import android.view.View;
import java.util.Objects;

/* renamed from: X.Ve6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80222Ve6 implements InterfaceC16710l9 {
    public final /* synthetic */ C80221Ve5 LIZ;

    public C80222Ve6(C80221Ve5 c80221Ve5) {
        this.LIZ = c80221Ve5;
    }

    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View view, C16800lI c16800lI) {
        C16800lI c16800lI2;
        C80221Ve5 c80221Ve5 = this.LIZ;
        c80221Ve5.getClass();
        if (C16300kU.LIZIZ(c80221Ve5)) {
            c16800lI2 = c16800lI;
        } else {
            c16800lI2 = null;
        }
        if (!Objects.equals(c80221Ve5.LLF, c16800lI2)) {
            c80221Ve5.LLF = c16800lI2;
            c80221Ve5.requestLayout();
        }
        return c16800lI.LIZ.LIZJ();
    }
}
