package X;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;

/* renamed from: X.3qU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96463qU extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C96463qU LJLIL = new C96463qU();

    public C96463qU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        Window window;
        View decorView;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && (window = LJIIIIZZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            Rect LIZJ = C73098SmU.LIZJ(decorView);
            int i2 = LIZJ.bottom;
            View findViewById = decorView.findViewById(R.id.content);
            if (findViewById != null) {
                findViewById.getGlobalVisibleRect(LIZJ);
            }
            i = i2 - LIZJ.bottom;
        } else {
            i = 0;
        }
        return Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)) + Math.max(i, 0) + C7MY.LIZIZ(C61447O9r.LJIIJJI));
    }
}
