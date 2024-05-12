package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.Window;
import kotlin.jvm.internal.o;

/* renamed from: X.NvL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60907NvL extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C60907NvL LJLIL = new C60907NvL();

    public C60907NvL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        FCH.LIZIZ.getClass();
        Activity LIZIZ = FCG.LIZIZ();
        if (LIZIZ == null) {
            i = C60936Nvo.LIZLLL(null);
        } else {
            Rect rect = new Rect();
            Window window = LIZIZ.getWindow();
            o.LJFF(window, "activity.window");
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.right - rect.left;
        }
        return Integer.valueOf(i);
    }
}
