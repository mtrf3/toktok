package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;

/* renamed from: X.NvN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60909NvN extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C60909NvN LJLIL = new C60909NvN();

    public C60909NvN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        View decorView;
        FCH.LIZIZ.getClass();
        Activity LIZIZ = FCG.LIZIZ();
        if (LIZIZ == null) {
            i = C60936Nvo.LIZJ(null);
        } else {
            Window window = LIZIZ.getWindow();
            Rect rect = new Rect();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            i = rect.bottom - rect.top;
        }
        return Integer.valueOf(i);
    }
}
