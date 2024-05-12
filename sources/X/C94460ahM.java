package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.ahM, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94460ahM extends C94238adm {
    public final /* synthetic */ C93735aVf LIZ;
    public final /* synthetic */ View LIZIZ;
    public final /* synthetic */ View LIZJ;

    @Override // X.InterfaceC93737aVh
    public final void LIZ(int i) {
        C93735aVf c93735aVf = this.LIZ;
        View view = this.LIZIZ;
        View view2 = this.LIZJ;
        c93735aVf.getClass();
        C94034aaU.LIZ("KeyBoardUtils", String.valueOf(i));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int height = iArr[1] + view.getHeight();
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int i2 = rect.bottom - height;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("distance bottom: ");
        LIZ.append(i2);
        C94034aaU.LIZ("KeyBoardUtils", X1D.LIZIZ(LIZ));
        if (c93735aVf.LIZJ != null) {
            float f = r0.LIZIZ - i2;
            float f2 = c93735aVf.LIZLLL;
            if (f2 + f < 0.0f) {
                f = 0.0f - f2;
            }
            c93735aVf.LIZLLL = f2 + f;
            view2.setTranslationY(view2.getTranslationY() - f);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("translate: ");
            LIZ2.append(view2.getTranslationY());
            C94034aaU.LIZ("KeyBoardUtils", X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("offset: ");
            LIZ3.append(c93735aVf.LIZLLL);
            C94034aaU.LIZ("KeyBoardUtils", X1D.LIZIZ(LIZ3));
            if (Math.abs(c93735aVf.LIZLLL) < 0.01f && c93735aVf.LIZIZ) {
                c93735aVf.LIZ();
                return;
            }
            return;
        }
        o.LJIJI("keyboardUtils");
        throw null;
    }

    public C94460ahM(C93735aVf c93735aVf, View view, View view2) {
        this.LIZ = c93735aVf;
        this.LIZIZ = view;
        this.LIZJ = view2;
    }
}
